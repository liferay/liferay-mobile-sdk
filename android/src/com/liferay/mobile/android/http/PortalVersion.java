/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.http;

/**
 * @author Bruno Farache
 */
public enum PortalVersion {

	UNKNOWN(-1), V_6_2(62);

	public static PortalVersion getValue(int version) {
		for (PortalVersion value : PortalVersion.values()) {
			if (value.getValue() == version) {
				return value;
			}
		}

		return UNKNOWN;
	}

	public int getValue() {
		return _version;
	}

	private PortalVersion(int version) {
		_version = version;
	}

	private int _version;

}