/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.contenttargeting.model.impl;

import com.liferay.contenttargeting.model.RuleInstance;
import com.liferay.contenttargeting.model.RuleInstanceModel;
import com.liferay.contenttargeting.model.RuleInstanceSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the RuleInstance service. Represents a row in the &quot;CT_RuleInstance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.contenttargeting.model.RuleInstanceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RuleInstanceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RuleInstanceImpl
 * @see com.liferay.contenttargeting.model.RuleInstance
 * @see com.liferay.contenttargeting.model.RuleInstanceModel
 * @generated
 */
@JSON(strict = true)
public class RuleInstanceModelImpl extends BaseModelImpl<RuleInstance>
	implements RuleInstanceModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a rule instance model instance should use the {@link com.liferay.contenttargeting.model.RuleInstance} interface instead.
	 */
	public static final String TABLE_NAME = "CT_RuleInstance";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "ruleInstanceId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "ruleKey", Types.VARCHAR },
			{ "userSegmentId", Types.BIGINT },
			{ "typeSettings", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CT_RuleInstance (uuid_ VARCHAR(75) null,ruleInstanceId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,ruleKey VARCHAR(75) null,userSegmentId LONG,typeSettings VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CT_RuleInstance";
	public static final String ORDER_BY_JPQL = " ORDER BY ruleInstance.ruleKey DESC";
	public static final String ORDER_BY_SQL = " ORDER BY CT_RuleInstance.ruleKey DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.contenttargeting.model.RuleInstance"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.contenttargeting.model.RuleInstance"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.contenttargeting.model.RuleInstance"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long RULEKEY_COLUMN_BITMASK = 4L;
	public static long USERSEGMENTID_COLUMN_BITMASK = 8L;
	public static long UUID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static RuleInstance toModel(RuleInstanceSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		RuleInstance model = new RuleInstanceImpl();

		model.setUuid(soapModel.getUuid());
		model.setRuleInstanceId(soapModel.getRuleInstanceId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setRuleKey(soapModel.getRuleKey());
		model.setUserSegmentId(soapModel.getUserSegmentId());
		model.setTypeSettings(soapModel.getTypeSettings());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<RuleInstance> toModels(RuleInstanceSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<RuleInstance> models = new ArrayList<RuleInstance>(soapModels.length);

		for (RuleInstanceSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.contenttargeting.model.RuleInstance"));

	public RuleInstanceModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _ruleInstanceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRuleInstanceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ruleInstanceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return RuleInstance.class;
	}

	@Override
	public String getModelClassName() {
		return RuleInstance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("ruleInstanceId", getRuleInstanceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ruleKey", getRuleKey());
		attributes.put("userSegmentId", getUserSegmentId());
		attributes.put("typeSettings", getTypeSettings());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long ruleInstanceId = (Long)attributes.get("ruleInstanceId");

		if (ruleInstanceId != null) {
			setRuleInstanceId(ruleInstanceId);
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

		String ruleKey = (String)attributes.get("ruleKey");

		if (ruleKey != null) {
			setRuleKey(ruleKey);
		}

		Long userSegmentId = (Long)attributes.get("userSegmentId");

		if (userSegmentId != null) {
			setUserSegmentId(userSegmentId);
		}

		String typeSettings = (String)attributes.get("typeSettings");

		if (typeSettings != null) {
			setTypeSettings(typeSettings);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getRuleInstanceId() {
		return _ruleInstanceId;
	}

	@Override
	public void setRuleInstanceId(long ruleInstanceId) {
		_ruleInstanceId = ruleInstanceId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getRuleKey() {
		if (_ruleKey == null) {
			return StringPool.BLANK;
		}
		else {
			return _ruleKey;
		}
	}

	@Override
	public void setRuleKey(String ruleKey) {
		_columnBitmask = -1L;

		if (_originalRuleKey == null) {
			_originalRuleKey = _ruleKey;
		}

		_ruleKey = ruleKey;
	}

	public String getOriginalRuleKey() {
		return GetterUtil.getString(_originalRuleKey);
	}

	@JSON
	@Override
	public long getUserSegmentId() {
		return _userSegmentId;
	}

	@Override
	public void setUserSegmentId(long userSegmentId) {
		_columnBitmask |= USERSEGMENTID_COLUMN_BITMASK;

		if (!_setOriginalUserSegmentId) {
			_setOriginalUserSegmentId = true;

			_originalUserSegmentId = _userSegmentId;
		}

		_userSegmentId = userSegmentId;
	}

	public long getOriginalUserSegmentId() {
		return _originalUserSegmentId;
	}

	@JSON
	@Override
	public String getTypeSettings() {
		if (_typeSettings == null) {
			return StringPool.BLANK;
		}
		else {
			return _typeSettings;
		}
	}

	@Override
	public void setTypeSettings(String typeSettings) {
		_typeSettings = typeSettings;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				RuleInstance.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			RuleInstance.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public RuleInstance toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (RuleInstance)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RuleInstanceImpl ruleInstanceImpl = new RuleInstanceImpl();

		ruleInstanceImpl.setUuid(getUuid());
		ruleInstanceImpl.setRuleInstanceId(getRuleInstanceId());
		ruleInstanceImpl.setGroupId(getGroupId());
		ruleInstanceImpl.setCompanyId(getCompanyId());
		ruleInstanceImpl.setUserId(getUserId());
		ruleInstanceImpl.setUserName(getUserName());
		ruleInstanceImpl.setCreateDate(getCreateDate());
		ruleInstanceImpl.setModifiedDate(getModifiedDate());
		ruleInstanceImpl.setRuleKey(getRuleKey());
		ruleInstanceImpl.setUserSegmentId(getUserSegmentId());
		ruleInstanceImpl.setTypeSettings(getTypeSettings());

		ruleInstanceImpl.resetOriginalValues();

		return ruleInstanceImpl;
	}

	@Override
	public int compareTo(RuleInstance ruleInstance) {
		int value = 0;

		value = getRuleKey().compareTo(ruleInstance.getRuleKey());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RuleInstance)) {
			return false;
		}

		RuleInstance ruleInstance = (RuleInstance)obj;

		long primaryKey = ruleInstance.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		RuleInstanceModelImpl ruleInstanceModelImpl = this;

		ruleInstanceModelImpl._originalUuid = ruleInstanceModelImpl._uuid;

		ruleInstanceModelImpl._originalGroupId = ruleInstanceModelImpl._groupId;

		ruleInstanceModelImpl._setOriginalGroupId = false;

		ruleInstanceModelImpl._originalCompanyId = ruleInstanceModelImpl._companyId;

		ruleInstanceModelImpl._setOriginalCompanyId = false;

		ruleInstanceModelImpl._originalRuleKey = ruleInstanceModelImpl._ruleKey;

		ruleInstanceModelImpl._originalUserSegmentId = ruleInstanceModelImpl._userSegmentId;

		ruleInstanceModelImpl._setOriginalUserSegmentId = false;

		ruleInstanceModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<RuleInstance> toCacheModel() {
		RuleInstanceCacheModel ruleInstanceCacheModel = new RuleInstanceCacheModel();

		ruleInstanceCacheModel.uuid = getUuid();

		String uuid = ruleInstanceCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			ruleInstanceCacheModel.uuid = null;
		}

		ruleInstanceCacheModel.ruleInstanceId = getRuleInstanceId();

		ruleInstanceCacheModel.groupId = getGroupId();

		ruleInstanceCacheModel.companyId = getCompanyId();

		ruleInstanceCacheModel.userId = getUserId();

		ruleInstanceCacheModel.userName = getUserName();

		String userName = ruleInstanceCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			ruleInstanceCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			ruleInstanceCacheModel.createDate = createDate.getTime();
		}
		else {
			ruleInstanceCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			ruleInstanceCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			ruleInstanceCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		ruleInstanceCacheModel.ruleKey = getRuleKey();

		String ruleKey = ruleInstanceCacheModel.ruleKey;

		if ((ruleKey != null) && (ruleKey.length() == 0)) {
			ruleInstanceCacheModel.ruleKey = null;
		}

		ruleInstanceCacheModel.userSegmentId = getUserSegmentId();

		ruleInstanceCacheModel.typeSettings = getTypeSettings();

		String typeSettings = ruleInstanceCacheModel.typeSettings;

		if ((typeSettings != null) && (typeSettings.length() == 0)) {
			ruleInstanceCacheModel.typeSettings = null;
		}

		return ruleInstanceCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", ruleInstanceId=");
		sb.append(getRuleInstanceId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", ruleKey=");
		sb.append(getRuleKey());
		sb.append(", userSegmentId=");
		sb.append(getUserSegmentId());
		sb.append(", typeSettings=");
		sb.append(getTypeSettings());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.liferay.contenttargeting.model.RuleInstance");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ruleInstanceId</column-name><column-value><![CDATA[");
		sb.append(getRuleInstanceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ruleKey</column-name><column-value><![CDATA[");
		sb.append(getRuleKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userSegmentId</column-name><column-value><![CDATA[");
		sb.append(getUserSegmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeSettings</column-name><column-value><![CDATA[");
		sb.append(getTypeSettings());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = RuleInstance.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			RuleInstance.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _ruleInstanceId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ruleKey;
	private String _originalRuleKey;
	private long _userSegmentId;
	private long _originalUserSegmentId;
	private boolean _setOriginalUserSegmentId;
	private String _typeSettings;
	private long _columnBitmask;
	private RuleInstance _escapedModel;
}