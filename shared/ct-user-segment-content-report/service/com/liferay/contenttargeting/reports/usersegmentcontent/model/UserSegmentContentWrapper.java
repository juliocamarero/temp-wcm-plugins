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

package com.liferay.contenttargeting.reports.usersegmentcontent.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserSegmentContent}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserSegmentContent
 * @generated
 */
public class UserSegmentContentWrapper implements UserSegmentContent,
	ModelWrapper<UserSegmentContent> {
	public UserSegmentContentWrapper(UserSegmentContent userSegmentContent) {
		_userSegmentContent = userSegmentContent;
	}

	@Override
	public Class<?> getModelClass() {
		return UserSegmentContent.class;
	}

	@Override
	public String getModelClassName() {
		return UserSegmentContent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userSegmentId", getUserSegmentId());
		attributes.put("className", getClassName());
		attributes.put("classPK", getClassPK());
		attributes.put("eventType", getEventType());
		attributes.put("count", getCount());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userSegmentId = (Long)attributes.get("userSegmentId");

		if (userSegmentId != null) {
			setUserSegmentId(userSegmentId);
		}

		String className = (String)attributes.get("className");

		if (className != null) {
			setClassName(className);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		String eventType = (String)attributes.get("eventType");

		if (eventType != null) {
			setEventType(eventType);
		}

		Integer count = (Integer)attributes.get("count");

		if (count != null) {
			setCount(count);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	/**
	* Returns the primary key of this user segment content.
	*
	* @return the primary key of this user segment content
	*/
	@Override
	public long getPrimaryKey() {
		return _userSegmentContent.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user segment content.
	*
	* @param primaryKey the primary key of this user segment content
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userSegmentContent.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this user segment content.
	*
	* @return the ID of this user segment content
	*/
	@Override
	public long getId() {
		return _userSegmentContent.getId();
	}

	/**
	* Sets the ID of this user segment content.
	*
	* @param id the ID of this user segment content
	*/
	@Override
	public void setId(long id) {
		_userSegmentContent.setId(id);
	}

	/**
	* Returns the user segment ID of this user segment content.
	*
	* @return the user segment ID of this user segment content
	*/
	@Override
	public long getUserSegmentId() {
		return _userSegmentContent.getUserSegmentId();
	}

	/**
	* Sets the user segment ID of this user segment content.
	*
	* @param userSegmentId the user segment ID of this user segment content
	*/
	@Override
	public void setUserSegmentId(long userSegmentId) {
		_userSegmentContent.setUserSegmentId(userSegmentId);
	}

	/**
	* Returns the class name of this user segment content.
	*
	* @return the class name of this user segment content
	*/
	@Override
	public java.lang.String getClassName() {
		return _userSegmentContent.getClassName();
	}

	/**
	* Sets the class name of this user segment content.
	*
	* @param className the class name of this user segment content
	*/
	@Override
	public void setClassName(java.lang.String className) {
		_userSegmentContent.setClassName(className);
	}

	/**
	* Returns the class p k of this user segment content.
	*
	* @return the class p k of this user segment content
	*/
	@Override
	public long getClassPK() {
		return _userSegmentContent.getClassPK();
	}

	/**
	* Sets the class p k of this user segment content.
	*
	* @param classPK the class p k of this user segment content
	*/
	@Override
	public void setClassPK(long classPK) {
		_userSegmentContent.setClassPK(classPK);
	}

	/**
	* Returns the event type of this user segment content.
	*
	* @return the event type of this user segment content
	*/
	@Override
	public java.lang.String getEventType() {
		return _userSegmentContent.getEventType();
	}

	/**
	* Sets the event type of this user segment content.
	*
	* @param eventType the event type of this user segment content
	*/
	@Override
	public void setEventType(java.lang.String eventType) {
		_userSegmentContent.setEventType(eventType);
	}

	/**
	* Returns the count of this user segment content.
	*
	* @return the count of this user segment content
	*/
	@Override
	public int getCount() {
		return _userSegmentContent.getCount();
	}

	/**
	* Sets the count of this user segment content.
	*
	* @param count the count of this user segment content
	*/
	@Override
	public void setCount(int count) {
		_userSegmentContent.setCount(count);
	}

	/**
	* Returns the create date of this user segment content.
	*
	* @return the create date of this user segment content
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _userSegmentContent.getCreateDate();
	}

	/**
	* Sets the create date of this user segment content.
	*
	* @param createDate the create date of this user segment content
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_userSegmentContent.setCreateDate(createDate);
	}

	@Override
	public boolean isNew() {
		return _userSegmentContent.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userSegmentContent.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userSegmentContent.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userSegmentContent.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userSegmentContent.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userSegmentContent.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userSegmentContent.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userSegmentContent.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userSegmentContent.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userSegmentContent.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userSegmentContent.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserSegmentContentWrapper((UserSegmentContent)_userSegmentContent.clone());
	}

	@Override
	public int compareTo(
		com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContent userSegmentContent) {
		return _userSegmentContent.compareTo(userSegmentContent);
	}

	@Override
	public int hashCode() {
		return _userSegmentContent.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContent> toCacheModel() {
		return _userSegmentContent.toCacheModel();
	}

	@Override
	public com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContent toEscapedModel() {
		return new UserSegmentContentWrapper(_userSegmentContent.toEscapedModel());
	}

	@Override
	public com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContent toUnescapedModel() {
		return new UserSegmentContentWrapper(_userSegmentContent.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userSegmentContent.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userSegmentContent.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userSegmentContent.persist();
	}

	@Override
	public java.lang.String getTitle(java.util.Locale locale) {
		return _userSegmentContent.getTitle(locale);
	}

	@Override
	public java.lang.String getType(java.util.Locale locale) {
		return _userSegmentContent.getType(locale);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserSegmentContentWrapper)) {
			return false;
		}

		UserSegmentContentWrapper userSegmentContentWrapper = (UserSegmentContentWrapper)obj;

		if (Validator.equals(_userSegmentContent,
					userSegmentContentWrapper._userSegmentContent)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserSegmentContent getWrappedUserSegmentContent() {
		return _userSegmentContent;
	}

	@Override
	public UserSegmentContent getWrappedModel() {
		return _userSegmentContent;
	}

	@Override
	public void resetOriginalValues() {
		_userSegmentContent.resetOriginalValues();
	}

	private UserSegmentContent _userSegmentContent;
}