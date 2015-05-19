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

package com.liferay.mobile.android.http.file;

import android.net.Uri;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.auth.basic.DigestAuthentication;
import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.util.PortalVersion;
import com.liferay.mobile.android.util.Validator;

import java.io.InputStream;
import java.io.OutputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGetHC4;
import org.apache.http.impl.client.HttpClientBuilder;

import static com.liferay.mobile.android.http.file.FileTransferUtil.*;

/**
 * @author Bruno Farache
 */
public class DownloadUtil {

	public static void download(
			HttpClient httpClient, HttpGetHC4 request, OutputStream os,
			FileProgressCallback callback)
		throws Exception {

		HttpResponse response = httpClient.execute(request);
		HttpUtil.checkStatusCode(request, response);
		InputStream is = response.getEntity().getContent();

		try {
			transfer(request, is, os, callback);
		}
		finally {
			close(is);
		}
	}

	public static void downloadFile(
			Session session, OutputStream os, String URL,
			FileProgressCallback callback)
		throws Exception {

		HttpClientBuilder clientBuilder = HttpUtil.getClientBuilder(session);
		HttpGetHC4 request = HttpUtil.getHttpGet(session, URL);

		download(clientBuilder.build(), request, os, callback);
	}

	public static void downloadWebDAVFile(
			Session session, int portalVersion, String groupFriendlyURL,
			String folderPath, String fileTitle, OutputStream os,
			FileProgressCallback callback)
		throws Exception {

		Authentication auth = session.getAuthentication();

		if ((auth != null) && !(auth instanceof DigestAuthentication)) {
			throw new Exception(
				"Can't download file if authentication implementation is not " +
					"DigestAuthentication");
		}

		String URL = getWebDAVFileURL(
			session, portalVersion, groupFriendlyURL, folderPath, fileTitle);

		HttpClientBuilder clientBuilder = HttpUtil.getClientBuilder(session);
		HttpGetHC4 request = new HttpGetHC4(URL);

		download(clientBuilder.build(), request, os, callback);
	}

	public static String getWebDAVFileURL(
			Session session, int portalVersion, String groupFriendlyURL,
			String folderPath, String fileTitle)
		throws Exception {

		StringBuilder sb = new StringBuilder();
		sb.append(session.getServer());

		if (portalVersion < PortalVersion.V_6_2) {
			sb.append("/api/secure");
		}

		sb.append("/webdav");
		sb.append(prependSlash(groupFriendlyURL));
		sb.append("/document_library");

		StringBuilder webdavPath = new StringBuilder();

		webdavPath.append(prependSlash(folderPath));
		webdavPath.append(prependSlash(fileTitle));

		sb.append(encoder.encode(webdavPath.toString()));

		return sb.toString();
	}

	protected static String prependSlash(String string) {
		if (Validator.isNotNull(string) && !string.startsWith("/")) {
			return "/" + string;
		}

		return string;
	}

	protected static URLEncoder encoder = new URLEncoder();

	protected static class URLEncoder {

		public String encode(String path) throws Exception {
			return Uri.encode(path, ALLOWED_URI_CHARS);
		}

		private final String ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%";

	}

}