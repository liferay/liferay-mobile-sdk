/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.util;

import android.util.Base64;
import android.util.Log;

import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.http.PortalVersion;
import com.liferay.mobile.android.service.Session;

import java.security.MessageDigest;

/**
 * @author Bruno Farache
 */
public class PortraitUtil {

	public static String getPortraitURL(
		Session session, boolean male, long portraitId) {

		return getPortraitURL(session, male, portraitId, null);
	}

	public static String getPortraitURL(
		Session session, boolean male, long portraitId, String uuid) {

		StringBuilder sb = new StringBuilder();

		sb.append(session.getServer());
		sb.append("/image/user_");

		if (male) {
			sb.append("male");
		}
		else {
			sb.append("female");
		}

		sb.append("_portrait?img_id=");
		sb.append(portraitId);

		int version = HttpUtil.getPortalVersion(session);

		if (version > PortalVersion.V_6_2) {
			appendToken(sb, uuid);
		}

		return sb.toString();
	}

	protected static void appendToken(StringBuilder sb, String uuid) {
		if (Validator.isNull(uuid)) {
			return;
		}

		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
			digest.update(uuid.getBytes());

			byte[] bytes = digest.digest();
			String token = Base64.encodeToString(bytes, Base64.NO_WRAP);

			sb.append("&img_id_token=");
			sb.append(token);
		}
		catch (Exception e) {
			Log.e(_CLASS_NAME, "Couldn't generate portrait image token", e);
		}
	}

	private static final String _CLASS_NAME =
		PortraitUtil.class.getSimpleName();

}