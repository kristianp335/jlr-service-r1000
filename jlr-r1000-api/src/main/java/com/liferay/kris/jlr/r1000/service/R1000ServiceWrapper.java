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

package com.liferay.kris.jlr.r1000.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link R1000Service}.
 *
 * @author Brian Wing Shun Chan
 * @see R1000Service
 * @generated
 */
@ProviderType
public class R1000ServiceWrapper implements R1000Service,
	ServiceWrapper<R1000Service> {
	public R1000ServiceWrapper(R1000Service r1000Service) {
		_r1000Service = r1000Service;
	}

	@Override
	public java.lang.String addR1000(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.lang.String period, java.lang.String dealer,
		java.lang.String partCategory, int repairCount, int visitCount,
		java.lang.String conCode, int percentage, int percentage1,
		int percentage2) {
		return _r1000Service.addR1000(serviceContext, period, dealer,
			partCategory, repairCount, visitCount, conCode, percentage,
			percentage1, percentage2);
	}

	@Override
	public java.lang.String deleteR1000(long r1000Id) {
		return _r1000Service.deleteR1000(r1000Id);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _r1000Service.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.liferay.kris.jlr.r1000.model.R1000> getR1000(
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _r1000Service.getR1000(serviceContext);
	}

	@Override
	public R1000Service getWrappedService() {
		return _r1000Service;
	}

	@Override
	public void setWrappedService(R1000Service r1000Service) {
		_r1000Service = r1000Service;
	}

	private R1000Service _r1000Service;
}