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

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.internal.Util;

import java.io.IOException;
import java.io.OutputStream;

import okio.Buffer;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

/**
 * @author Bruno Farache
 */
public class InputStreamBody extends RequestBody {

	public InputStreamBody(UploadData data) {
		this.data = data;
	}

	@Override
	public MediaType contentType() {
		return MediaType.parse(data.getMimeType());
	}

	@Override
	public void writeTo(BufferedSink sink) throws IOException {
		Source source = null;

		try {
			source = Okio.source(data.getInputStream());
			FileProgressCallback callback = data.getCallback();
			OutputStream os = data.getOutputStream();
			Buffer buffer = new Buffer();
			int count;

			while ((count = (int)source.read(buffer, 2048)) != -1) {
				byte[] bytes = buffer.readByteArray();

				if (os != null) {
					os.write(bytes);
				}

				sink.write(bytes);

				if (callback != null) {
					callback.increment(count);
				}
			}

			os.flush();
		}
		finally {
			Util.closeQuietly(source);
		}
	}

	protected UploadData data;

}