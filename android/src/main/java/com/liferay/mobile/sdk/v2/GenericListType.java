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

package com.liferay.mobile.sdk.v2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import java.util.List;

/**
 * @author Bruno Farache
 */
public class GenericListType<T> implements ParameterizedType {

	public GenericListType(Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public Type[] getActualTypeArguments() {
		return new Type[]{ clazz };
	}

	@Override
	public Type getOwnerType() {
		return null;
	}

	@Override
	public Type getRawType() {
		return List.class;
	}

	protected final Class<T> clazz;

}