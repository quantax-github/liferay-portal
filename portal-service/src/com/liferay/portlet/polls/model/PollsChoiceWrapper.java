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

package com.liferay.portlet.polls.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PollsChoice}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PollsChoice
 * @generated
 */
@ProviderType
public class PollsChoiceWrapper implements PollsChoice,
	ModelWrapper<PollsChoice> {
	public PollsChoiceWrapper(PollsChoice pollsChoice) {
		_pollsChoice = pollsChoice;
	}

	@Override
	public Class<?> getModelClass() {
		return PollsChoice.class;
	}

	@Override
	public String getModelClassName() {
		return PollsChoice.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("choiceId", getChoiceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("questionId", getQuestionId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long choiceId = (Long)attributes.get("choiceId");

		if (choiceId != null) {
			setChoiceId(choiceId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long questionId = (Long)attributes.get("questionId");

		if (questionId != null) {
			setQuestionId(questionId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this polls choice.
	*
	* @return the primary key of this polls choice
	*/
	@Override
	public long getPrimaryKey() {
		return _pollsChoice.getPrimaryKey();
	}

	/**
	* Sets the primary key of this polls choice.
	*
	* @param primaryKey the primary key of this polls choice
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_pollsChoice.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this polls choice.
	*
	* @return the uuid of this polls choice
	*/
	@Override
	public java.lang.String getUuid() {
		return _pollsChoice.getUuid();
	}

	/**
	* Sets the uuid of this polls choice.
	*
	* @param uuid the uuid of this polls choice
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_pollsChoice.setUuid(uuid);
	}

	/**
	* Returns the choice ID of this polls choice.
	*
	* @return the choice ID of this polls choice
	*/
	@Override
	public long getChoiceId() {
		return _pollsChoice.getChoiceId();
	}

	/**
	* Sets the choice ID of this polls choice.
	*
	* @param choiceId the choice ID of this polls choice
	*/
	@Override
	public void setChoiceId(long choiceId) {
		_pollsChoice.setChoiceId(choiceId);
	}

	/**
	* Returns the group ID of this polls choice.
	*
	* @return the group ID of this polls choice
	*/
	@Override
	public long getGroupId() {
		return _pollsChoice.getGroupId();
	}

	/**
	* Sets the group ID of this polls choice.
	*
	* @param groupId the group ID of this polls choice
	*/
	@Override
	public void setGroupId(long groupId) {
		_pollsChoice.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this polls choice.
	*
	* @return the company ID of this polls choice
	*/
	@Override
	public long getCompanyId() {
		return _pollsChoice.getCompanyId();
	}

	/**
	* Sets the company ID of this polls choice.
	*
	* @param companyId the company ID of this polls choice
	*/
	@Override
	public void setCompanyId(long companyId) {
		_pollsChoice.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this polls choice.
	*
	* @return the user ID of this polls choice
	*/
	@Override
	public long getUserId() {
		return _pollsChoice.getUserId();
	}

	/**
	* Sets the user ID of this polls choice.
	*
	* @param userId the user ID of this polls choice
	*/
	@Override
	public void setUserId(long userId) {
		_pollsChoice.setUserId(userId);
	}

	/**
	* Returns the user uuid of this polls choice.
	*
	* @return the user uuid of this polls choice
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pollsChoice.getUserUuid();
	}

	/**
	* Sets the user uuid of this polls choice.
	*
	* @param userUuid the user uuid of this polls choice
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_pollsChoice.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this polls choice.
	*
	* @return the user name of this polls choice
	*/
	@Override
	public java.lang.String getUserName() {
		return _pollsChoice.getUserName();
	}

	/**
	* Sets the user name of this polls choice.
	*
	* @param userName the user name of this polls choice
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_pollsChoice.setUserName(userName);
	}

	/**
	* Returns the create date of this polls choice.
	*
	* @return the create date of this polls choice
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _pollsChoice.getCreateDate();
	}

	/**
	* Sets the create date of this polls choice.
	*
	* @param createDate the create date of this polls choice
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_pollsChoice.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this polls choice.
	*
	* @return the modified date of this polls choice
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _pollsChoice.getModifiedDate();
	}

	/**
	* Sets the modified date of this polls choice.
	*
	* @param modifiedDate the modified date of this polls choice
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_pollsChoice.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the question ID of this polls choice.
	*
	* @return the question ID of this polls choice
	*/
	@Override
	public long getQuestionId() {
		return _pollsChoice.getQuestionId();
	}

	/**
	* Sets the question ID of this polls choice.
	*
	* @param questionId the question ID of this polls choice
	*/
	@Override
	public void setQuestionId(long questionId) {
		_pollsChoice.setQuestionId(questionId);
	}

	/**
	* Returns the name of this polls choice.
	*
	* @return the name of this polls choice
	*/
	@Override
	public java.lang.String getName() {
		return _pollsChoice.getName();
	}

	/**
	* Sets the name of this polls choice.
	*
	* @param name the name of this polls choice
	*/
	@Override
	public void setName(java.lang.String name) {
		_pollsChoice.setName(name);
	}

	/**
	* Returns the description of this polls choice.
	*
	* @return the description of this polls choice
	*/
	@Override
	public java.lang.String getDescription() {
		return _pollsChoice.getDescription();
	}

	/**
	* Returns the localized description of this polls choice in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized description of this polls choice
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale) {
		return _pollsChoice.getDescription(locale);
	}

	/**
	* Returns the localized description of this polls choice in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this polls choice. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale,
		boolean useDefault) {
		return _pollsChoice.getDescription(locale, useDefault);
	}

	/**
	* Returns the localized description of this polls choice in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized description of this polls choice
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId) {
		return _pollsChoice.getDescription(languageId);
	}

	/**
	* Returns the localized description of this polls choice in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this polls choice
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId,
		boolean useDefault) {
		return _pollsChoice.getDescription(languageId, useDefault);
	}

	@Override
	public java.lang.String getDescriptionCurrentLanguageId() {
		return _pollsChoice.getDescriptionCurrentLanguageId();
	}

	@Override
	public java.lang.String getDescriptionCurrentValue() {
		return _pollsChoice.getDescriptionCurrentValue();
	}

	/**
	* Returns a map of the locales and localized descriptions of this polls choice.
	*
	* @return the locales and localized descriptions of this polls choice
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getDescriptionMap() {
		return _pollsChoice.getDescriptionMap();
	}

	/**
	* Sets the description of this polls choice.
	*
	* @param description the description of this polls choice
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_pollsChoice.setDescription(description);
	}

	/**
	* Sets the localized description of this polls choice in the language.
	*
	* @param description the localized description of this polls choice
	* @param locale the locale of the language
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale) {
		_pollsChoice.setDescription(description, locale);
	}

	/**
	* Sets the localized description of this polls choice in the language, and sets the default locale.
	*
	* @param description the localized description of this polls choice
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_pollsChoice.setDescription(description, locale, defaultLocale);
	}

	@Override
	public void setDescriptionCurrentLanguageId(java.lang.String languageId) {
		_pollsChoice.setDescriptionCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized descriptions of this polls choice from the map of locales and localized descriptions.
	*
	* @param descriptionMap the locales and localized descriptions of this polls choice
	*/
	@Override
	public void setDescriptionMap(
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap) {
		_pollsChoice.setDescriptionMap(descriptionMap);
	}

	/**
	* Sets the localized descriptions of this polls choice from the map of locales and localized descriptions, and sets the default locale.
	*
	* @param descriptionMap the locales and localized descriptions of this polls choice
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescriptionMap(
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Locale defaultLocale) {
		_pollsChoice.setDescriptionMap(descriptionMap, defaultLocale);
	}

	@Override
	public boolean isNew() {
		return _pollsChoice.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_pollsChoice.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _pollsChoice.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_pollsChoice.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _pollsChoice.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _pollsChoice.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_pollsChoice.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _pollsChoice.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_pollsChoice.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_pollsChoice.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_pollsChoice.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _pollsChoice.getAvailableLanguageIds();
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _pollsChoice.getDefaultLanguageId();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.LocaleException {
		_pollsChoice.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.LocaleException {
		_pollsChoice.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public java.lang.Object clone() {
		return new PollsChoiceWrapper((PollsChoice)_pollsChoice.clone());
	}

	@Override
	public int compareTo(
		com.liferay.portlet.polls.model.PollsChoice pollsChoice) {
		return _pollsChoice.compareTo(pollsChoice);
	}

	@Override
	public int hashCode() {
		return _pollsChoice.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.portlet.polls.model.PollsChoice> toCacheModel() {
		return _pollsChoice.toCacheModel();
	}

	@Override
	public com.liferay.portlet.polls.model.PollsChoice toEscapedModel() {
		return new PollsChoiceWrapper(_pollsChoice.toEscapedModel());
	}

	@Override
	public com.liferay.portlet.polls.model.PollsChoice toUnescapedModel() {
		return new PollsChoiceWrapper(_pollsChoice.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _pollsChoice.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _pollsChoice.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_pollsChoice.persist();
	}

	@Override
	public int getVotesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pollsChoice.getVotesCount();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PollsChoiceWrapper)) {
			return false;
		}

		PollsChoiceWrapper pollsChoiceWrapper = (PollsChoiceWrapper)obj;

		if (Validator.equals(_pollsChoice, pollsChoiceWrapper._pollsChoice)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _pollsChoice.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PollsChoice getWrappedPollsChoice() {
		return _pollsChoice;
	}

	@Override
	public PollsChoice getWrappedModel() {
		return _pollsChoice;
	}

	@Override
	public void resetOriginalValues() {
		_pollsChoice.resetOriginalValues();
	}

	private PollsChoice _pollsChoice;
}