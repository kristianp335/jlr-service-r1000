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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the R1000 service. Represents a row in the &quot;JLR_R1000&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see R1000Model
 * @see com.liferay.kris.jlr.r1000.model.impl.R1000Impl
 * @see com.liferay.kris.jlr.r1000.model.impl.R1000ModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.kris.jlr.r1000.model.impl.R1000Impl")
@ProviderType
public interface R1000 extends R1000Model, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.kris.jlr.r1000.model.impl.R1000Impl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<R1000, Long> R1000_ID_ACCESSOR = new Accessor<R1000, Long>() {
			@Override
			public Long get(R1000 r1000) {
				return r1000.getR1000Id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<R1000> getTypeClass() {
				return R1000.class;
			}
		};
}