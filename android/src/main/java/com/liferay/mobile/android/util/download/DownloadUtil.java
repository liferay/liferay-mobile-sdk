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

package com.liferay.mobile.android.util.download;

import android.net.Uri;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.auth.basic.BasicAuthentication;
import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.service.Session;

import java.io.InputStream;
import java.io.OutputStream;

import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * @author Bruno Farache
 */
public class DownloadUtil {

	public static void download(
			Session session, String URL, OutputStream os,
			DownloadProgressCallback callback)
		throws Exception {

		HttpClientBuilder clientBuilder = HttpUtil.getClientBuilder(session);

		CredentialsProvider provider = new BasicCredentialsProvider();

		provider.setCredentials(
			new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT),
			getCredentials(session));

		clientBuilder.setDefaultCredentialsProvider(provider);

		HttpGet request = new HttpGet(URL);
		HttpResponse response = clientBuilder.build().execute(request);

		HttpUtil.checkStatusCode(request, response);

		InputStream is = response.getEntity().getContent();

		int count;
		int totalBytes = 0;
		byte data[] = new byte[8192];

		while ((count = is.read(data)) != -1) {
			os.write(data, 0, count);

			if (callback != null) {
				totalBytes = totalBytes + count;
				callback.onProgress(totalBytes);
			}
		}
	}

	public static void downloadFile(
			Session session, String groupFriendlyURL, String folderPath,
			String fileTitle, OutputStream os,
			DownloadProgressCallback callback)
		throws Exception {

		String URL = getDownloadURL(
			session, groupFriendlyURL, folderPath, fileTitle);

		download(session, URL, os, callback);
	}

	public static String getDownloadURL(
			Session session, String groupFriendlyURL, String folderPath,
			String fileTitle)
		throws Exception {

		StringBuilder sb = new StringBuilder();
		sb.append(session.getServer());

		sb.append("/webdav");
		sb.append(groupFriendlyURL);
		sb.append("/document_library");

		StringBuilder webdavPath = new StringBuilder();

		webdavPath.append(folderPath);
		webdavPath.append("/");
		webdavPath.append(fileTitle);

		sb.append(Uri.encode(webdavPath.toString(), ALLOWED_URI_CHARS));

		return sb.toString();
	}

	protected static UsernamePasswordCredentials getCredentials(Session session)
		throws Exception {

		Authentication auth = session.getAuthentication();

		if (auth == null) {
			throw new Exception("Session's authentication can't be null");
		}

		if (!(auth instanceof BasicAuthentication)) {
			throw new Exception(
				"Can't sign in if authentication implementation is not" +
					"BasicAuthentication");
		}

		String username = ((BasicAuthentication)auth).getUsername();
		String password = ((BasicAuthentication)auth).getPassword();

		return new UsernamePasswordCredentials(username, password);
	}

	private static final String ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%";

}