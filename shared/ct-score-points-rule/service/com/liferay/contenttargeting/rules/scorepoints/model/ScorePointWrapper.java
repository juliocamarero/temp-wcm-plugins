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

package com.liferay.contenttargeting.rules.scorepoints.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ScorePoint}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ScorePoint
 * @generated
 */
public class ScorePointWrapper implements ScorePoint, ModelWrapper<ScorePoint> {
	public ScorePointWrapper(ScorePoint scorePoint) {
		_scorePoint = scorePoint;
	}

	@Override
	public Class<?> getModelClass() {
		return ScorePoint.class;
	}

	@Override
	public String getModelClassName() {
		return ScorePoint.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Id", getId());
		attributes.put("CTUserId", getCTUserId());
		attributes.put("assetCategoryId", getAssetCategoryId());
		attributes.put("points", getPoints());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Long CTUserId = (Long)attributes.get("CTUserId");

		if (CTUserId != null) {
			setCTUserId(CTUserId);
		}

		Long assetCategoryId = (Long)attributes.get("assetCategoryId");

		if (assetCategoryId != null) {
			setAssetCategoryId(assetCategoryId);
		}

		Long points = (Long)attributes.get("points");

		if (points != null) {
			setPoints(points);
		}
	}

	/**
	* Returns the primary key of this score point.
	*
	* @return the primary key of this score point
	*/
	@Override
	public long getPrimaryKey() {
		return _scorePoint.getPrimaryKey();
	}

	/**
	* Sets the primary key of this score point.
	*
	* @param primaryKey the primary key of this score point
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_scorePoint.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this score point.
	*
	* @return the uuid of this score point
	*/
	@Override
	public java.lang.String getUuid() {
		return _scorePoint.getUuid();
	}

	/**
	* Sets the uuid of this score point.
	*
	* @param uuid the uuid of this score point
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_scorePoint.setUuid(uuid);
	}

	/**
	* Returns the ID of this score point.
	*
	* @return the ID of this score point
	*/
	@Override
	public long getId() {
		return _scorePoint.getId();
	}

	/**
	* Sets the ID of this score point.
	*
	* @param Id the ID of this score point
	*/
	@Override
	public void setId(long Id) {
		_scorePoint.setId(Id);
	}

	/**
	* Returns the c t user ID of this score point.
	*
	* @return the c t user ID of this score point
	*/
	@Override
	public long getCTUserId() {
		return _scorePoint.getCTUserId();
	}

	/**
	* Sets the c t user ID of this score point.
	*
	* @param CTUserId the c t user ID of this score point
	*/
	@Override
	public void setCTUserId(long CTUserId) {
		_scorePoint.setCTUserId(CTUserId);
	}

	/**
	* Returns the c t user uuid of this score point.
	*
	* @return the c t user uuid of this score point
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getCTUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _scorePoint.getCTUserUuid();
	}

	/**
	* Sets the c t user uuid of this score point.
	*
	* @param CTUserUuid the c t user uuid of this score point
	*/
	@Override
	public void setCTUserUuid(java.lang.String CTUserUuid) {
		_scorePoint.setCTUserUuid(CTUserUuid);
	}

	/**
	* Returns the asset category ID of this score point.
	*
	* @return the asset category ID of this score point
	*/
	@Override
	public long getAssetCategoryId() {
		return _scorePoint.getAssetCategoryId();
	}

	/**
	* Sets the asset category ID of this score point.
	*
	* @param assetCategoryId the asset category ID of this score point
	*/
	@Override
	public void setAssetCategoryId(long assetCategoryId) {
		_scorePoint.setAssetCategoryId(assetCategoryId);
	}

	/**
	* Returns the points of this score point.
	*
	* @return the points of this score point
	*/
	@Override
	public long getPoints() {
		return _scorePoint.getPoints();
	}

	/**
	* Sets the points of this score point.
	*
	* @param points the points of this score point
	*/
	@Override
	public void setPoints(long points) {
		_scorePoint.setPoints(points);
	}

	@Override
	public boolean isNew() {
		return _scorePoint.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_scorePoint.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _scorePoint.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_scorePoint.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _scorePoint.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _scorePoint.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_scorePoint.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _scorePoint.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_scorePoint.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_scorePoint.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_scorePoint.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ScorePointWrapper((ScorePoint)_scorePoint.clone());
	}

	@Override
	public int compareTo(
		com.liferay.contenttargeting.rules.scorepoints.model.ScorePoint scorePoint) {
		return _scorePoint.compareTo(scorePoint);
	}

	@Override
	public int hashCode() {
		return _scorePoint.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.contenttargeting.rules.scorepoints.model.ScorePoint> toCacheModel() {
		return _scorePoint.toCacheModel();
	}

	@Override
	public com.liferay.contenttargeting.rules.scorepoints.model.ScorePoint toEscapedModel() {
		return new ScorePointWrapper(_scorePoint.toEscapedModel());
	}

	@Override
	public com.liferay.contenttargeting.rules.scorepoints.model.ScorePoint toUnescapedModel() {
		return new ScorePointWrapper(_scorePoint.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _scorePoint.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _scorePoint.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_scorePoint.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ScorePointWrapper)) {
			return false;
		}

		ScorePointWrapper scorePointWrapper = (ScorePointWrapper)obj;

		if (Validator.equals(_scorePoint, scorePointWrapper._scorePoint)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ScorePoint getWrappedScorePoint() {
		return _scorePoint;
	}

	@Override
	public ScorePoint getWrappedModel() {
		return _scorePoint;
	}

	@Override
	public void resetOriginalValues() {
		_scorePoint.resetOriginalValues();
	}

	private ScorePoint _scorePoint;
}