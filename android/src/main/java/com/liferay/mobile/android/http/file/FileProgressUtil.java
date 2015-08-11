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

import com.liferay.mobile.android.callback.file.FileProgressCallback;
import com.liferay.mobile.android.http.HttpUtil;

import com.squareup.okhttp.internal.Util;

import java.io.IOException;
import java.io.InputStream;

import okio.Buffer;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

/**
 * @author Bruno Farache
 */
public class FileProgressUtil {

	public static boolean isCancelled(FileProgressCallback callback) {
		return (callback != null) && callback.isCancelled();
	}

	public static void transfer(
			InputStream is, FileProgressCallback callback, Object tag,
			BufferedSink sink)
		throws IOException {

		Source source = null;

		try {
			source = Okio.source(is);
			Buffer os = new Buffer();

			while ((source.read(os, 2048) != -1) && !isCancelled(callback)) {
				byte[] bytes = os.readByteArray();

				if (sink != null) {
					sink.write(bytes);
				}

				if (callback != null) {
					callback.onBytes(bytes);
					callback.increment(bytes.length);
				}
			}

			if (isCancelled(callback)) {
				HttpUtil.cancel(tag);
			}
		}
		finally {
			Util.closeQuietly(source);
		}
	}

}