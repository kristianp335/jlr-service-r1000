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

package com.liferay.kris.jlr.r1000.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.kris.jlr.r1000.service.http.R1000ServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.kris.jlr.r1000.service.http.R1000ServiceSoap
 * @generated
 */
@ProviderType
public class R1000Soap implements Serializable {
	public static R1000Soap toSoapModel(R1000 model) {
		R1000Soap soapModel = new R1000Soap();

		soapModel.setUuid(model.getUuid());
		soapModel.setR1000Id(model.getR1000Id());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPeriod(model.getPeriod());
		soapModel.setDealer(model.getDealer());
		soapModel.setPartCategory(model.getPartCategory());
		soapModel.setRepairCount(model.getRepairCount());
		soapModel.setVisitCount(model.getVisitCount());
		soapModel.setConCode(model.getConCode());
		soapModel.setPercentage(model.getPercentage());
		soapModel.setPercentage1(model.getPercentage1());
		soapModel.setPercentage2(model.getPercentage2());

		return soapModel;
	}

	public static R1000Soap[] toSoapModels(R1000[] models) {
		R1000Soap[] soapModels = new R1000Soap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static R1000Soap[][] toSoapModels(R1000[][] models) {
		R1000Soap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new R1000Soap[models.length][models[0].length];
		}
		else {
			soapModels = new R1000Soap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static R1000Soap[] toSoapModels(List<R1000> models) {
		List<R1000Soap> soapModels = new ArrayList<R1000Soap>(models.size());

		for (R1000 model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new R1000Soap[soapModels.size()]);
	}

	public R1000Soap() {
	}

	public long getPrimaryKey() {
		return _r1000Id;
	}

	public void setPrimaryKey(long pk) {
		setR1000Id(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getR1000Id() {
		return _r1000Id;
	}

	public void setR1000Id(long r1000Id) {
		_r1000Id = r1000Id;
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

	public String getPeriod() {
		return _period;
	}

	public void setPeriod(String period) {
		_period = period;
	}

	public String getDealer() {
		return _dealer;
	}

	public void setDealer(String dealer) {
		_dealer = dealer;
	}

	public String getPartCategory() {
		return _partCategory;
	}

	public void setPartCategory(String partCategory) {
		_partCategory = partCategory;
	}

	public int getRepairCount() {
		return _repairCount;
	}

	public void setRepairCount(int repairCount) {
		_repairCount = repairCount;
	}

	public int getVisitCount() {
		return _visitCount;
	}

	public void setVisitCount(int visitCount) {
		_visitCount = visitCount;
	}

	public String getConCode() {
		return _conCode;
	}

	public void setConCode(String conCode) {
		_conCode = conCode;
	}

	public int getPercentage() {
		return _percentage;
	}

	public void setPercentage(int percentage) {
		_percentage = percentage;
	}

	public int getPercentage1() {
		return _percentage1;
	}

	public void setPercentage1(int percentage1) {
		_percentage1 = percentage1;
	}

	public int getPercentage2() {
		return _percentage2;
	}

	public void setPercentage2(int percentage2) {
		_percentage2 = percentage2;
	}

	private String _uuid;
	private long _r1000Id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _period;
	private String _dealer;
	private String _partCategory;
	private int _repairCount;
	private int _visitCount;
	private String _conCode;
	private int _percentage;
	private int _percentage1;
	private int _percentage2;
}