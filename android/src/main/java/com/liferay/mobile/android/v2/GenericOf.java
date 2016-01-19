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

package com.liferay.mobile.android.v2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Bruno Farache
 */
public class GenericOf<X, Y> implements ParameterizedType {

	public GenericOf(Class<X> container, Class<Y> wrapped) {
		this.container = container;
		this.wrapped = wrapped;
	}

	public Type[] getActualTypeArguments() {
		return new Type[]{wrapped};
	}

	public Type getOwnerType() {
		return null;
	}

	public Type getRawType() {
		return container;
	}

	private final Class<X> container;
	private final Class<Y> wrapped;

}