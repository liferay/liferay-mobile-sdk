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

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.security.MessageDigest;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

/**
 * @author Bruno Farache
 * @author Silvio Santos
 */
public class PortraitUtil {

	public static String downloadPortrait(
			Session session, String portraitURL, String filePath)
		throws Exception {

		return downloadPortrait(session, portraitURL, filePath, null);
	}

	public static String downloadPortrait(
			Session session, String portraitURL, String filePath,
			String modifiedDate)
		throws Exception {

		String lastModified = null;
		InputStream is = null;
		OutputStream os = null;

		try {
			HttpGet get = new HttpGet(portraitURL);

			if (Validator.isNotNull(modifiedDate)) {
				get.addHeader(HttpUtil.IF_MODIFIED_SINCE, modifiedDate);
			}

			HttpClient client = HttpUtil.getClient(session);
			HttpResponse response = client.execute(get);

			int status = response.getStatusLine().getStatusCode();

			if (status == HttpStatus.SC_OK) {
				is = response.getEntity().getContent();
				os = new FileOutputStream(filePath);

				int count;
				byte data[] = new byte[8192];

				while ((count = is.read(data)) != -1) {
					os.write(data, 0, count);
				}

				Header header = response.getLastHeader(HttpUtil.LAST_MODIFIED);
				lastModified = header.getValue();
			}
		}
		catch (Exception e) {
			Log.e(_CLASS_NAME, "Couldn't download portrait", e);

			throw e;
		}
		finally {
			close(is);
			close(os);
		}

		return lastModified;
	}

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

	protected static void close(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			}
			catch (IOException ioe) {
			}
		}
	}

	private static final String _CLASS_NAME =
		PortraitUtil.class.getSimpleName();

}