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

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.content.InputStreamBody;

/**
 * @author Igor Oliveira
 */
public class UploadData extends InputStreamBody {

	public UploadData(
		InputStream is, ContentType mimeType, String fileName,
		FileProgressCallback callback) {

		super(is, mimeType, fileName);
		this.callback = callback;
	}

	public UploadData(
		InputStream is, String fileName, FileProgressCallback callback) {

		this(is, ContentType.DEFAULT_BINARY, fileName, callback);
	}

	public void setRequest(HttpPost request) {
		this.request = request;
	}

	@Override
	public void writeTo(OutputStream os) throws IOException {
		if (os == null) {
			throw new IllegalArgumentException("Output stream may not be null");
		}

		InputStream is = getInputStream();

		try {
			int count;
			byte[] data = new byte[4096];

			while (((count = is.read(data)) != -1) && !isCancelled()) {
				writeToCopyStream(data, count);

				os.write(data, 0, count);

				if (callback != null) {
					callback.increment(count);
				}
			}

			os.flush();

			if (isCancelled()) {
				request.abort();
				throw new IOException("Request cancelled.");
			}
		}
		finally {
			close(is);
		}
	}

	protected void close(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			}
			catch (IOException ioe) {
			}
		}
	}

	protected boolean isCancelled() {
		return (callback != null) && (callback.isCancelled());
	}

	protected void writeToCopyStream(byte[] data, int count) {
	}

	protected FileProgressCallback callback;
	protected HttpPost request;

}