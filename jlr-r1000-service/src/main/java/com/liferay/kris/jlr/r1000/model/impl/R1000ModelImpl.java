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

package com.liferay.kris.jlr.r1000.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.kris.jlr.r1000.model.R1000;
import com.liferay.kris.jlr.r1000.model.R1000Model;
import com.liferay.kris.jlr.r1000.model.R1000Soap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the R1000 service. Represents a row in the &quot;JLR_R1000&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link R1000Model} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link R1000Impl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see R1000Impl
 * @see R1000
 * @see R1000Model
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class R1000ModelImpl extends BaseModelImpl<R1000> implements R1000Model {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a r1000 model instance should use the {@link R1000} interface instead.
	 */
	public static final String TABLE_NAME = "JLR_R1000";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "r1000Id", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "period", Types.VARCHAR },
			{ "dealer", Types.VARCHAR },
			{ "partCategory", Types.VARCHAR },
			{ "repairCount", Types.INTEGER },
			{ "visitCount", Types.INTEGER },
			{ "conCode", Types.VARCHAR },
			{ "percentage", Types.INTEGER },
			{ "percentage1", Types.INTEGER },
			{ "percentage2", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("r1000Id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("period", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dealer", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("partCategory", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("repairCount", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("visitCount", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("conCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("percentage", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("percentage1", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("percentage2", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table JLR_R1000 (uuid_ VARCHAR(75) null,r1000Id LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,period VARCHAR(75) null,dealer VARCHAR(75) null,partCategory VARCHAR(75) null,repairCount INTEGER,visitCount INTEGER,conCode VARCHAR(75) null,percentage INTEGER,percentage1 INTEGER,percentage2 INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table JLR_R1000";
	public static final String ORDER_BY_JPQL = " ORDER BY r1000.r1000Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY JLR_R1000.r1000Id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.kris.jlr.r1000.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.kris.jlr.r1000.model.R1000"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.kris.jlr.r1000.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.kris.jlr.r1000.model.R1000"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.kris.jlr.r1000.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.kris.jlr.r1000.model.R1000"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long CREATEDATE_COLUMN_BITMASK = 2L;
	public static final long GROUPID_COLUMN_BITMASK = 4L;
	public static final long USERID_COLUMN_BITMASK = 8L;
	public static final long UUID_COLUMN_BITMASK = 16L;
	public static final long R1000ID_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static R1000 toModel(R1000Soap soapModel) {
		if (soapModel == null) {
			return null;
		}

		R1000 model = new R1000Impl();

		model.setUuid(soapModel.getUuid());
		model.setR1000Id(soapModel.getR1000Id());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setPeriod(soapModel.getPeriod());
		model.setDealer(soapModel.getDealer());
		model.setPartCategory(soapModel.getPartCategory());
		model.setRepairCount(soapModel.getRepairCount());
		model.setVisitCount(soapModel.getVisitCount());
		model.setConCode(soapModel.getConCode());
		model.setPercentage(soapModel.getPercentage());
		model.setPercentage1(soapModel.getPercentage1());
		model.setPercentage2(soapModel.getPercentage2());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<R1000> toModels(R1000Soap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<R1000> models = new ArrayList<R1000>(soapModels.length);

		for (R1000Soap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.kris.jlr.r1000.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.kris.jlr.r1000.model.R1000"));

	public R1000ModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _r1000Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setR1000Id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _r1000Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return R1000.class;
	}

	@Override
	public String getModelClassName() {
		return R1000.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("r1000Id", getR1000Id());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("period", getPeriod());
		attributes.put("dealer", getDealer());
		attributes.put("partCategory", getPartCategory());
		attributes.put("repairCount", getRepairCount());
		attributes.put("visitCount", getVisitCount());
		attributes.put("conCode", getConCode());
		attributes.put("percentage", getPercentage());
		attributes.put("percentage1", getPercentage1());
		attributes.put("percentage2", getPercentage2());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long r1000Id = (Long)attributes.get("r1000Id");

		if (r1000Id != null) {
			setR1000Id(r1000Id);
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

		String period = (String)attributes.get("period");

		if (period != null) {
			setPeriod(period);
		}

		String dealer = (String)attributes.get("dealer");

		if (dealer != null) {
			setDealer(dealer);
		}

		String partCategory = (String)attributes.get("partCategory");

		if (partCategory != null) {
			setPartCategory(partCategory);
		}

		Integer repairCount = (Integer)attributes.get("repairCount");

		if (repairCount != null) {
			setRepairCount(repairCount);
		}

		Integer visitCount = (Integer)attributes.get("visitCount");

		if (visitCount != null) {
			setVisitCount(visitCount);
		}

		String conCode = (String)attributes.get("conCode");

		if (conCode != null) {
			setConCode(conCode);
		}

		Integer percentage = (Integer)attributes.get("percentage");

		if (percentage != null) {
			setPercentage(percentage);
		}

		Integer percentage1 = (Integer)attributes.get("percentage1");

		if (percentage1 != null) {
			setPercentage1(percentage1);
		}

		Integer percentage2 = (Integer)attributes.get("percentage2");

		if (percentage2 != null) {
			setPercentage2(percentage2);
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
	public long getR1000Id() {
		return _r1000Id;
	}

	@Override
	public void setR1000Id(long r1000Id) {
		_columnBitmask = -1L;

		_r1000Id = r1000Id;
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
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
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
		_columnBitmask |= CREATEDATE_COLUMN_BITMASK;

		if (_originalCreateDate == null) {
			_originalCreateDate = _createDate;
		}

		_createDate = createDate;
	}

	public Date getOriginalCreateDate() {
		return _originalCreateDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getPeriod() {
		if (_period == null) {
			return StringPool.BLANK;
		}
		else {
			return _period;
		}
	}

	@Override
	public void setPeriod(String period) {
		_period = period;
	}

	@JSON
	@Override
	public String getDealer() {
		if (_dealer == null) {
			return StringPool.BLANK;
		}
		else {
			return _dealer;
		}
	}

	@Override
	public void setDealer(String dealer) {
		_dealer = dealer;
	}

	@JSON
	@Override
	public String getPartCategory() {
		if (_partCategory == null) {
			return StringPool.BLANK;
		}
		else {
			return _partCategory;
		}
	}

	@Override
	public void setPartCategory(String partCategory) {
		_partCategory = partCategory;
	}

	@JSON
	@Override
	public int getRepairCount() {
		return _repairCount;
	}

	@Override
	public void setRepairCount(int repairCount) {
		_repairCount = repairCount;
	}

	@JSON
	@Override
	public int getVisitCount() {
		return _visitCount;
	}

	@Override
	public void setVisitCount(int visitCount) {
		_visitCount = visitCount;
	}

	@JSON
	@Override
	public String getConCode() {
		if (_conCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _conCode;
		}
	}

	@Override
	public void setConCode(String conCode) {
		_conCode = conCode;
	}

	@JSON
	@Override
	public int getPercentage() {
		return _percentage;
	}

	@Override
	public void setPercentage(int percentage) {
		_percentage = percentage;
	}

	@JSON
	@Override
	public int getPercentage1() {
		return _percentage1;
	}

	@Override
	public void setPercentage1(int percentage1) {
		_percentage1 = percentage1;
	}

	@JSON
	@Override
	public int getPercentage2() {
		return _percentage2;
	}

	@Override
	public void setPercentage2(int percentage2) {
		_percentage2 = percentage2;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				R1000.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			R1000.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public R1000 toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (R1000)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		R1000Impl r1000Impl = new R1000Impl();

		r1000Impl.setUuid(getUuid());
		r1000Impl.setR1000Id(getR1000Id());
		r1000Impl.setGroupId(getGroupId());
		r1000Impl.setCompanyId(getCompanyId());
		r1000Impl.setUserId(getUserId());
		r1000Impl.setUserName(getUserName());
		r1000Impl.setCreateDate(getCreateDate());
		r1000Impl.setModifiedDate(getModifiedDate());
		r1000Impl.setPeriod(getPeriod());
		r1000Impl.setDealer(getDealer());
		r1000Impl.setPartCategory(getPartCategory());
		r1000Impl.setRepairCount(getRepairCount());
		r1000Impl.setVisitCount(getVisitCount());
		r1000Impl.setConCode(getConCode());
		r1000Impl.setPercentage(getPercentage());
		r1000Impl.setPercentage1(getPercentage1());
		r1000Impl.setPercentage2(getPercentage2());

		r1000Impl.resetOriginalValues();

		return r1000Impl;
	}

	@Override
	public int compareTo(R1000 r1000) {
		int value = 0;

		if (getR1000Id() < r1000.getR1000Id()) {
			value = -1;
		}
		else if (getR1000Id() > r1000.getR1000Id()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof R1000)) {
			return false;
		}

		R1000 r1000 = (R1000)obj;

		long primaryKey = r1000.getPrimaryKey();

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
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		R1000ModelImpl r1000ModelImpl = this;

		r1000ModelImpl._originalUuid = r1000ModelImpl._uuid;

		r1000ModelImpl._originalGroupId = r1000ModelImpl._groupId;

		r1000ModelImpl._setOriginalGroupId = false;

		r1000ModelImpl._originalCompanyId = r1000ModelImpl._companyId;

		r1000ModelImpl._setOriginalCompanyId = false;

		r1000ModelImpl._originalUserId = r1000ModelImpl._userId;

		r1000ModelImpl._setOriginalUserId = false;

		r1000ModelImpl._originalCreateDate = r1000ModelImpl._createDate;

		r1000ModelImpl._setModifiedDate = false;

		r1000ModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<R1000> toCacheModel() {
		R1000CacheModel r1000CacheModel = new R1000CacheModel();

		r1000CacheModel.uuid = getUuid();

		String uuid = r1000CacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			r1000CacheModel.uuid = null;
		}

		r1000CacheModel.r1000Id = getR1000Id();

		r1000CacheModel.groupId = getGroupId();

		r1000CacheModel.companyId = getCompanyId();

		r1000CacheModel.userId = getUserId();

		r1000CacheModel.userName = getUserName();

		String userName = r1000CacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			r1000CacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			r1000CacheModel.createDate = createDate.getTime();
		}
		else {
			r1000CacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			r1000CacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			r1000CacheModel.modifiedDate = Long.MIN_VALUE;
		}

		r1000CacheModel.period = getPeriod();

		String period = r1000CacheModel.period;

		if ((period != null) && (period.length() == 0)) {
			r1000CacheModel.period = null;
		}

		r1000CacheModel.dealer = getDealer();

		String dealer = r1000CacheModel.dealer;

		if ((dealer != null) && (dealer.length() == 0)) {
			r1000CacheModel.dealer = null;
		}

		r1000CacheModel.partCategory = getPartCategory();

		String partCategory = r1000CacheModel.partCategory;

		if ((partCategory != null) && (partCategory.length() == 0)) {
			r1000CacheModel.partCategory = null;
		}

		r1000CacheModel.repairCount = getRepairCount();

		r1000CacheModel.visitCount = getVisitCount();

		r1000CacheModel.conCode = getConCode();

		String conCode = r1000CacheModel.conCode;

		if ((conCode != null) && (conCode.length() == 0)) {
			r1000CacheModel.conCode = null;
		}

		r1000CacheModel.percentage = getPercentage();

		r1000CacheModel.percentage1 = getPercentage1();

		r1000CacheModel.percentage2 = getPercentage2();

		return r1000CacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", r1000Id=");
		sb.append(getR1000Id());
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
		sb.append(", period=");
		sb.append(getPeriod());
		sb.append(", dealer=");
		sb.append(getDealer());
		sb.append(", partCategory=");
		sb.append(getPartCategory());
		sb.append(", repairCount=");
		sb.append(getRepairCount());
		sb.append(", visitCount=");
		sb.append(getVisitCount());
		sb.append(", conCode=");
		sb.append(getConCode());
		sb.append(", percentage=");
		sb.append(getPercentage());
		sb.append(", percentage1=");
		sb.append(getPercentage1());
		sb.append(", percentage2=");
		sb.append(getPercentage2());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.liferay.kris.jlr.r1000.model.R1000");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>r1000Id</column-name><column-value><![CDATA[");
		sb.append(getR1000Id());
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
			"<column><column-name>period</column-name><column-value><![CDATA[");
		sb.append(getPeriod());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dealer</column-name><column-value><![CDATA[");
		sb.append(getDealer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>partCategory</column-name><column-value><![CDATA[");
		sb.append(getPartCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repairCount</column-name><column-value><![CDATA[");
		sb.append(getRepairCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitCount</column-name><column-value><![CDATA[");
		sb.append(getVisitCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>conCode</column-name><column-value><![CDATA[");
		sb.append(getConCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>percentage</column-name><column-value><![CDATA[");
		sb.append(getPercentage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>percentage1</column-name><column-value><![CDATA[");
		sb.append(getPercentage1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>percentage2</column-name><column-value><![CDATA[");
		sb.append(getPercentage2());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = R1000.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			R1000.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _r1000Id;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _originalCreateDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _period;
	private String _dealer;
	private String _partCategory;
	private int _repairCount;
	private int _visitCount;
	private String _conCode;
	private int _percentage;
	private int _percentage1;
	private int _percentage2;
	private long _columnBitmask;
	private R1000 _escapedModel;
}