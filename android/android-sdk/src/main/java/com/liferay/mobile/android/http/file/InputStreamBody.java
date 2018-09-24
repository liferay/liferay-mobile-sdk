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

import java.io.IOException;

import okio.BufferedSink;

import static com.liferay.mobile.android.http.file.FileProgressUtil.transfer;

/**
 * @author Bruno Farache
 */
public class InputStreamBody extends RequestBody {

	public InputStreamBody(UploadData data, Object tag) {
		this.data = data;
		this.tag = tag;
	}

	@Override
	public MediaType contentType() {
		return MediaType.parse(data.getMimeType());
	}

	@Override
	public void writeTo(BufferedSink sink) throws IOException {
		transfer(data.getInputStream(), data.getCallback(), tag, sink);
	}

	protected UploadData data;
	protected Object tag;

}