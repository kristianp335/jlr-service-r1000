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

package com.liferay.kris.jlr.r1000.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.kris.jlr.r1000.service.R1000ServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link R1000ServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.kris.jlr.r1000.model.R1000Soap}.
 * If the method in the service utility returns a
 * {@link com.liferay.kris.jlr.r1000.model.R1000}, that is translated to a
 * {@link com.liferay.kris.jlr.r1000.model.R1000Soap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see R1000ServiceHttp
 * @see com.liferay.kris.jlr.r1000.model.R1000Soap
 * @see R1000ServiceUtil
 * @generated
 */
@ProviderType
public class R1000ServiceSoap {
	public static com.liferay.kris.jlr.r1000.model.R1000Soap[] getR1000(
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			java.util.List<com.liferay.kris.jlr.r1000.model.R1000> returnValue = R1000ServiceUtil.getR1000(serviceContext);

			return com.liferay.kris.jlr.r1000.model.R1000Soap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String deleteR1000(long r1000Id)
		throws RemoteException {
		try {
			java.lang.String returnValue = R1000ServiceUtil.deleteR1000(r1000Id);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String addR1000(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.lang.String period, java.lang.String dealer,
		java.lang.String partCategory, int repairCount, int visitCount,
		java.lang.String conCode, int percentage, int percentage1,
		int percentage2) throws RemoteException {
		try {
			java.lang.String returnValue = R1000ServiceUtil.addR1000(serviceContext,
					period, dealer, partCategory, repairCount, visitCount,
					conCode, percentage, percentage1, percentage2);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(R1000ServiceSoap.class);
}