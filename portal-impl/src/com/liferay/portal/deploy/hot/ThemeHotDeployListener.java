/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.deploy.hot;

import com.liferay.portal.kernel.deploy.hot.BaseHotDeployListener;
import com.liferay.portal.kernel.deploy.hot.HotDeployEvent;
import com.liferay.portal.kernel.deploy.hot.HotDeployException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.template.TemplateConstants;
import com.liferay.portal.kernel.template.TemplateResourceLoaderUtil;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.model.Theme;
import com.liferay.portal.service.ThemeLocalServiceUtil;
import com.liferay.portal.util.ClassLoaderUtil;
import com.liferay.portal.util.WebKeys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

/**
 * @author Brian Wing Shun Chan
 * @author Brian Myunghun Kim
 * @author Ivica Cardic
 */
public class ThemeHotDeployListener extends BaseHotDeployListener {

	@Override
	public void invokeDeploy(HotDeployEvent hotDeployEvent)
		throws HotDeployException {

		try {
			doInvokeDeploy(hotDeployEvent);
		}
		catch (Throwable t) {
			throwHotDeployException(
				hotDeployEvent,
				"Error registering themes for " +
					hotDeployEvent.getServletContextName(),
				t);
		}
	}

	@Override
	public void invokeUndeploy(HotDeployEvent hotDeployEvent)
		throws HotDeployException {

		try {
			doInvokeUndeploy(hotDeployEvent);
		}
		catch (Throwable t) {
			throwHotDeployException(
				hotDeployEvent,
				"Error unregistering themes for " +
					hotDeployEvent.getServletContextName(),
				t);
		}
	}

	protected void doInvokeDeploy(HotDeployEvent hotDeployEvent)
		throws Exception {

		ServletContext servletContext = hotDeployEvent.getServletContext();

		String servletContextName = servletContext.getServletContextName();

		if (_log.isDebugEnabled()) {
			_log.debug("Invoking deploy for " + servletContextName);
		}

		String[] xmls = new String[] {
			HttpUtil.URLtoString(
				servletContext.getResource(
					"/WEB-INF/liferay-look-and-feel.xml"))
		};

		if (xmls[0] == null) {
			return;
		}

		if (_log.isInfoEnabled()) {
			_log.info("Registering themes for " + servletContextName);
		}

		List<Theme> themes = ThemeLocalServiceUtil.init(
			servletContextName, servletContext, null, true, xmls,
			hotDeployEvent.getPluginPackage());

		_themes.put(servletContextName, themes);

		servletContext.setAttribute(WebKeys.PLUGIN_THEMES, themes);

		if (_log.isInfoEnabled()) {
			if (themes.size() == 1) {
				_log.info(
					"1 theme for " + servletContextName +
						" is available for use");
			}
			else {
				_log.info(
					themes.size() + " themes for " + servletContextName +
						" are available for use");
			}
		}
	}

	protected void doInvokeUndeploy(HotDeployEvent hotDeployEvent)
		throws Exception {

		ServletContext servletContext = hotDeployEvent.getServletContext();

		String servletContextName = servletContext.getServletContextName();

		if (_log.isDebugEnabled()) {
			_log.debug("Invoking undeploy for " + servletContextName);
		}

		List<Theme> themes = _themes.remove(servletContextName);

		if (themes != null) {
			if (_log.isInfoEnabled()) {
				_log.info("Unregistering themes for " + servletContextName);
			}

			try {
				ThemeLocalServiceUtil.uninstallThemes(themes);
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		else {
			return;
		}

		// LEP-2057

		ClassLoader contextClassLoader =
			ClassLoaderUtil.getContextClassLoader();

		try {
			ClassLoaderUtil.setContextClassLoader(
				ClassLoaderUtil.getPortalClassLoader());

			TemplateResourceLoaderUtil.clearCache(
				TemplateConstants.LANG_TYPE_VM);
		}
		finally {
			ClassLoaderUtil.setContextClassLoader(contextClassLoader);
		}

		if (_log.isInfoEnabled()) {
			if (themes.size() == 1) {
				_log.info(
					"1 theme for " + servletContextName + " was unregistered");
			}
			else {
				_log.info(
					themes.size() + " themes for " + servletContextName +
						" were unregistered");
			}
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		ThemeHotDeployListener.class);

	private static Map<String, List<Theme>> _themes =
		new HashMap<String, List<Theme>>();

}