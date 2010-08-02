/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.model;

import com.liferay.portal.ModelListenerException;
import com.liferay.portal.security.ldap.LDAPUserTransactionThreadLocal;
import com.liferay.portal.security.ldap.PortalLDAPExporterUtil;

/**
 * @author Marcellus Tavares
 */
public class UserGroupListener extends BaseModelListener<UserGroup> {

	public void onAfterAddAssociation(
			Object userGroupId, String associationClassName, Object userId)
		throws ModelListenerException {

		try {
			exportToLDAP((Long)userId, (Long)userGroupId);
		}
		catch (Exception e) {
			throw new ModelListenerException(e);
		}
	}

	protected void exportToLDAP(long userId, long userGroupId)
		throws Exception {

		if (LDAPUserTransactionThreadLocal.isOriginatesFromLDAP()) {
			return;
		}

		PortalLDAPExporterUtil.exportToLDAP(userId, userGroupId);
	}

}