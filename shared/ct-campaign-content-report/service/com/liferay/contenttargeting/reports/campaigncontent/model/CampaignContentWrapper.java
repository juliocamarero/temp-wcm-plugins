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

package com.liferay.contenttargeting.reports.campaigncontent.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CampaignContent}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CampaignContent
 * @generated
 */
public class CampaignContentWrapper implements CampaignContent,
	ModelWrapper<CampaignContent> {
	public CampaignContentWrapper(CampaignContent campaignContent) {
		_campaignContent = campaignContent;
	}

	@Override
	public Class<?> getModelClass() {
		return CampaignContent.class;
	}

	@Override
	public String getModelClassName() {
		return CampaignContent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("campaignId", getCampaignId());
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

		Long campaignId = (Long)attributes.get("campaignId");

		if (campaignId != null) {
			setCampaignId(campaignId);
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
	* Returns the primary key of this campaign content.
	*
	* @return the primary key of this campaign content
	*/
	@Override
	public long getPrimaryKey() {
		return _campaignContent.getPrimaryKey();
	}

	/**
	* Sets the primary key of this campaign content.
	*
	* @param primaryKey the primary key of this campaign content
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_campaignContent.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this campaign content.
	*
	* @return the ID of this campaign content
	*/
	@Override
	public long getId() {
		return _campaignContent.getId();
	}

	/**
	* Sets the ID of this campaign content.
	*
	* @param id the ID of this campaign content
	*/
	@Override
	public void setId(long id) {
		_campaignContent.setId(id);
	}

	/**
	* Returns the campaign ID of this campaign content.
	*
	* @return the campaign ID of this campaign content
	*/
	@Override
	public long getCampaignId() {
		return _campaignContent.getCampaignId();
	}

	/**
	* Sets the campaign ID of this campaign content.
	*
	* @param campaignId the campaign ID of this campaign content
	*/
	@Override
	public void setCampaignId(long campaignId) {
		_campaignContent.setCampaignId(campaignId);
	}

	/**
	* Returns the class name of this campaign content.
	*
	* @return the class name of this campaign content
	*/
	@Override
	public java.lang.String getClassName() {
		return _campaignContent.getClassName();
	}

	/**
	* Sets the class name of this campaign content.
	*
	* @param className the class name of this campaign content
	*/
	@Override
	public void setClassName(java.lang.String className) {
		_campaignContent.setClassName(className);
	}

	/**
	* Returns the class p k of this campaign content.
	*
	* @return the class p k of this campaign content
	*/
	@Override
	public long getClassPK() {
		return _campaignContent.getClassPK();
	}

	/**
	* Sets the class p k of this campaign content.
	*
	* @param classPK the class p k of this campaign content
	*/
	@Override
	public void setClassPK(long classPK) {
		_campaignContent.setClassPK(classPK);
	}

	/**
	* Returns the event type of this campaign content.
	*
	* @return the event type of this campaign content
	*/
	@Override
	public java.lang.String getEventType() {
		return _campaignContent.getEventType();
	}

	/**
	* Sets the event type of this campaign content.
	*
	* @param eventType the event type of this campaign content
	*/
	@Override
	public void setEventType(java.lang.String eventType) {
		_campaignContent.setEventType(eventType);
	}

	/**
	* Returns the count of this campaign content.
	*
	* @return the count of this campaign content
	*/
	@Override
	public int getCount() {
		return _campaignContent.getCount();
	}

	/**
	* Sets the count of this campaign content.
	*
	* @param count the count of this campaign content
	*/
	@Override
	public void setCount(int count) {
		_campaignContent.setCount(count);
	}

	/**
	* Returns the create date of this campaign content.
	*
	* @return the create date of this campaign content
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _campaignContent.getCreateDate();
	}

	/**
	* Sets the create date of this campaign content.
	*
	* @param createDate the create date of this campaign content
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_campaignContent.setCreateDate(createDate);
	}

	@Override
	public boolean isNew() {
		return _campaignContent.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_campaignContent.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _campaignContent.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_campaignContent.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _campaignContent.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _campaignContent.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_campaignContent.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _campaignContent.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_campaignContent.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_campaignContent.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_campaignContent.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CampaignContentWrapper((CampaignContent)_campaignContent.clone());
	}

	@Override
	public int compareTo(
		com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent campaignContent) {
		return _campaignContent.compareTo(campaignContent);
	}

	@Override
	public int hashCode() {
		return _campaignContent.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent> toCacheModel() {
		return _campaignContent.toCacheModel();
	}

	@Override
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent toEscapedModel() {
		return new CampaignContentWrapper(_campaignContent.toEscapedModel());
	}

	@Override
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent toUnescapedModel() {
		return new CampaignContentWrapper(_campaignContent.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _campaignContent.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _campaignContent.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_campaignContent.persist();
	}

	@Override
	public java.lang.String getTitle(java.util.Locale locale) {
		return _campaignContent.getTitle(locale);
	}

	@Override
	public java.lang.String getType(java.util.Locale locale) {
		return _campaignContent.getType(locale);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CampaignContentWrapper)) {
			return false;
		}

		CampaignContentWrapper campaignContentWrapper = (CampaignContentWrapper)obj;

		if (Validator.equals(_campaignContent,
					campaignContentWrapper._campaignContent)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CampaignContent getWrappedCampaignContent() {
		return _campaignContent;
	}

	@Override
	public CampaignContent getWrappedModel() {
		return _campaignContent;
	}

	@Override
	public void resetOriginalValues() {
		_campaignContent.resetOriginalValues();
	}

	private CampaignContent _campaignContent;
}