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

package com.liferay.mobile.android.util;

import android.util.Base64;

import com.liferay.mobile.android.callback.file.FileProgressCallback;
import com.liferay.mobile.android.http.Headers;
import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.Session;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.net.URLEncoder;

import java.security.MessageDigest;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

/**
 * @author Bruno Farache
 * @author Silvio Santos
 */
public class PortraitUtil {

	public static String downloadPortrait(
			Session session, String portraitURL, final OutputStream os,
			String modifiedDate)
		throws Exception {

		String lastModified = null;

		try {
			Map<String, String> headers = new HashMap<String, String>();

			if (Validator.isNotNull(modifiedDate)) {
				headers.put(Headers.IF_MODIFIED_SINCE, modifiedDate);
			}

			session.setHeaders(headers);

			Response response = HttpUtil.download(
				session, portraitURL, new FileProgressCallback() {

				@Override
				public void onBytes(byte[] bytes) {
					try {
						os.write(bytes);
					}
					catch (IOException ioe) {
						setCancelled(true);
					}
				}

				@Override
				public void onProgress(int totalBytes) {
				}

			});

			lastModified = response.getHeaders().get(Headers.LAST_MODIFIED);
		}
		finally {
			close(os);
		}

		return lastModified;
	}

	public static String downloadPortrait(
			Session session, String portraitURL, OutputStream os)
		throws Exception {

		return downloadPortrait(session, portraitURL, os, null);
	}

	public static String downloadPortrait(
			Session session, String portraitURL, String filePath)
		throws Exception {

		return downloadPortrait(session, portraitURL, filePath, null);
	}

	public static String downloadPortrait(
			Session session, String portraitURL, String filePath,
			String modifiedDate)
		throws Exception {

		return downloadPortrait(
			session, portraitURL, new FileOutputStream(filePath), modifiedDate);
	}

	public static String getPortraitURL(
			Session session, boolean male, long portraitId, String uuid)
		throws Exception {

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
		appendToken(sb, uuid);

		return sb.toString();
	}

	protected static void appendToken(StringBuilder sb, String uuid)
		throws Exception {

		if (Validator.isNull(uuid)) {
			return;
		}

		MessageDigest digest = MessageDigest.getInstance("SHA-1");
		digest.update(uuid.getBytes());

		byte[] bytes = digest.digest();

		String token = null;

		try {
			token = Base64.encodeToString(bytes, Base64.NO_WRAP);
		}
		catch (RuntimeException re) {
			if ("Stub!".equals(re.getMessage())) {
				token = DatatypeConverter.printBase64Binary(bytes);
			}
		}

		if (token != null) {
			sb.append("&img_id_token=");
			sb.append(URLEncoder.encode(token, "UTF8"));
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

}