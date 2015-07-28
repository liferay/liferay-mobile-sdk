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

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.http.client.methods.AbortableHttpRequest;

/**
 * @author Bruno Farache
 */
public class FileTransferUtil {

	public static void close(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			}
			catch (IOException ioe) {
			}
		}
	}

	public static void transfer(
			AbortableHttpRequest request, InputStream is, OutputStream os,
			FileProgressCallback callback)
		throws IOException {

		int count;
		byte data[] = new byte[4096];

		while (((count = is.read(data)) != -1) && !isCancelled(callback)) {
			os.write(data, 0, count);

			if (callback != null) {
				callback.increment(count);
			}
		}

		os.flush();

		if (isCancelled(callback)) {
			request.abort();
		}
	}

	protected static boolean isCancelled(FileProgressCallback callback) {
		return (callback != null) && callback.isCancelled();
	}

}