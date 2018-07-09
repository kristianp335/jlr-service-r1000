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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for R1000. This utility wraps
 * {@link com.liferay.kris.jlr.r1000.service.impl.R1000ServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see R1000Service
 * @see com.liferay.kris.jlr.r1000.service.base.R1000ServiceBaseImpl
 * @see com.liferay.kris.jlr.r1000.service.impl.R1000ServiceImpl
 * @generated
 */
@ProviderType
public class R1000ServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.kris.jlr.r1000.service.impl.R1000ServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static java.lang.String addR1000(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.lang.String period, java.lang.String dealer,
		java.lang.String partCategory, int repairCount, int visitCount,
		java.lang.String conCode, int percentage, int percentage1,
		int percentage2) {
		return getService()
				   .addR1000(serviceContext, period, dealer, partCategory,
			repairCount, visitCount, conCode, percentage, percentage1,
			percentage2);
	}

	public static java.lang.String deleteR1000(long r1000Id) {
		return getService().deleteR1000(r1000Id);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.kris.jlr.r1000.model.R1000> getR1000(
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService().getR1000(serviceContext);
	}

	public static R1000Service getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<R1000Service, R1000Service> _serviceTracker = ServiceTrackerFactory.open(R1000Service.class);
}