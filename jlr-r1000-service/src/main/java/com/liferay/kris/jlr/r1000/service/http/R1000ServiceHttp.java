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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * {@link R1000ServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see R1000ServiceSoap
 * @see HttpPrincipal
 * @see R1000ServiceUtil
 * @generated
 */
@ProviderType
public class R1000ServiceHttp {
	public static java.util.List<com.liferay.kris.jlr.r1000.model.R1000> getR1000(
		HttpPrincipal httpPrincipal,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		try {
			MethodKey methodKey = new MethodKey(R1000ServiceUtil.class,
					"getR1000", _getR1000ParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.kris.jlr.r1000.model.R1000>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.lang.String deleteR1000(HttpPrincipal httpPrincipal,
		long r1000Id) {
		try {
			MethodKey methodKey = new MethodKey(R1000ServiceUtil.class,
					"deleteR1000", _deleteR1000ParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, r1000Id);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.lang.String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.lang.String addR1000(HttpPrincipal httpPrincipal,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.lang.String period, java.lang.String dealer,
		java.lang.String partCategory, int repairCount, int visitCount,
		java.lang.String conCode, int percentage, int percentage1,
		int percentage2) {
		try {
			MethodKey methodKey = new MethodKey(R1000ServiceUtil.class,
					"addR1000", _addR1000ParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					serviceContext, period, dealer, partCategory, repairCount,
					visitCount, conCode, percentage, percentage1, percentage2);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.lang.String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(R1000ServiceHttp.class);
	private static final Class<?>[] _getR1000ParameterTypes0 = new Class[] {
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteR1000ParameterTypes1 = new Class[] {
			long.class
		};
	private static final Class<?>[] _addR1000ParameterTypes2 = new Class[] {
			com.liferay.portal.kernel.service.ServiceContext.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, int.class, java.lang.String.class,
			int.class, int.class, int.class
		};
}