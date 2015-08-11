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

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.auth.basic.DigestAuthentication;
import com.liferay.mobile.android.callback.file.FileProgressCallback;
import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.util.PortalVersion;
import com.liferay.mobile.android.util.Validator;

/**
 * @author Bruno Farache
 */
public class DownloadUtil {

	public static void downloadWebDAVFile(
			Session session, int portalVersion, String groupFriendlyURL,
			String folderPath, String fileTitle, FileProgressCallback callback)
		throws Exception {

		Authentication auth = session.getAuthentication();

		if ((auth != null) && !(auth instanceof DigestAuthentication)) {
			throw new Exception(
				"Can't download file if authentication implementation is not " +
					"DigestAuthentication");
		}

		String url = getWebDAVFileURL(
			session, portalVersion, groupFriendlyURL, folderPath, fileTitle);

		HttpUtil.download(session, url, callback);
	}

	protected static String getWebDAVFileURL(
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

		sb.append(prependSlash(folderPath));
		sb.append(prependSlash(fileTitle));

		return HttpUtil.encodeURLPath(sb.toString());
	}

	protected static String prependSlash(String string) {
		if (Validator.isNotNull(string) && !string.startsWith("/")) {
			return "/" + string;
		}

		return string;
	}

}