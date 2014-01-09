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

package com.liferay.contenttargeting.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.contenttargeting.service.http.CTUserServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.contenttargeting.service.http.CTUserServiceSoap
 * @generated
 */
public class CTUserSoap implements Serializable {
	public static CTUserSoap toSoapModel(CTUser model) {
		CTUserSoap soapModel = new CTUserSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCTUserId(model.getCTUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setLastIp(model.getLastIp());
		soapModel.setTypeSettings(model.getTypeSettings());

		return soapModel;
	}

	public static CTUserSoap[] toSoapModels(CTUser[] models) {
		CTUserSoap[] soapModels = new CTUserSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CTUserSoap[][] toSoapModels(CTUser[][] models) {
		CTUserSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CTUserSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CTUserSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CTUserSoap[] toSoapModels(List<CTUser> models) {
		List<CTUserSoap> soapModels = new ArrayList<CTUserSoap>(models.size());

		for (CTUser model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CTUserSoap[soapModels.size()]);
	}

	public CTUserSoap() {
	}

	public long getPrimaryKey() {
		return _CTUserId;
	}

	public void setPrimaryKey(long pk) {
		setCTUserId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCTUserId() {
		return _CTUserId;
	}

	public void setCTUserId(long CTUserId) {
		_CTUserId = CTUserId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getLastIp() {
		return _lastIp;
	}

	public void setLastIp(String lastIp) {
		_lastIp = lastIp;
	}

	public String getTypeSettings() {
		return _typeSettings;
	}

	public void setTypeSettings(String typeSettings) {
		_typeSettings = typeSettings;
	}

	private String _uuid;
	private long _CTUserId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _lastIp;
	private String _typeSettings;
}