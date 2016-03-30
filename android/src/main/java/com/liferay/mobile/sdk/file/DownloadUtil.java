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

package com.liferay.mobile.sdk.file;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.Callback;
import com.liferay.mobile.sdk.Config;
import com.liferay.mobile.sdk.auth.Authentication;
import com.liferay.mobile.sdk.auth.DigestAuthentication;
import com.liferay.mobile.sdk.http.Method;
import com.liferay.mobile.sdk.http.Request;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.util.PortalVersion;
import com.liferay.mobile.sdk.util.Validator;
import com.liferay.mobile.sdk.v2.HttpClient;

import com.squareup.okhttp.HttpUrl;

/**
 * @author Bruno Farache
 */
public class DownloadUtil {

	public static Response download(
			Config config, String url, Callback callback,
			FileProgressCallback progressCallback)
		throws Exception {

		Request request = Request.url(url)
			.method(Method.GET)
			.config(config);

		Object tag = request.tag();

		if (callback != null) {
			callback = new DownloadCallback(callback, progressCallback, tag);
		}

		HttpClient client = Call.client();

		if (callback != null) {
			client.async(request, callback);
			return null;
		}
		else {
			Response response = client.sync(request);
			FileTransfer.transfer(
				response.getBodyAsStream(), progressCallback, tag, null);

			return response;
		}
	}

	public static void downloadWebDAVFile(
			Config config, int portalVersion, String groupFriendlyURL,
			String folderPath, String fileTitle, Callback callback,
			FileProgressCallback progressCallback)
		throws Exception {

		Authentication auth = config.auth();

		if ((auth != null) && !(auth instanceof DigestAuthentication)) {
			throw new Exception(
				"Can't download file if authentication implementation is not " +
					"DigestAuthentication");
		}

		String url = getWebDAVFileURL(
			config, portalVersion, groupFriendlyURL, folderPath, fileTitle);

		download(config, url, callback, progressCallback);
	}

	protected static String getWebDAVFileURL(
			Config config, int portalVersion, String groupFriendlyURL,
			String folderPath, String fileTitle)
		throws Exception {

		StringBuilder sb = new StringBuilder();
		sb.append(config.server());

		if (portalVersion < PortalVersion.V_6_2) {
			sb.append("/api/secure");
		}

		sb.append("/webdav");
		sb.append(prependSlash(groupFriendlyURL));
		sb.append("/document_library");

		sb.append(prependSlash(folderPath));
		sb.append(prependSlash(fileTitle));

		return HttpUrl.parse(sb.toString()).toString();
	}

	protected static String prependSlash(String string) {
		if (Validator.isNotNull(string) && !string.startsWith("/")) {
			return "/" + string;
		}

		return string;
	}

}