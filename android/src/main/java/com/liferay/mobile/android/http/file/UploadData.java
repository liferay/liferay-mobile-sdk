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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.content.InputStreamBody;

import static com.liferay.mobile.android.http.file.FileTransferUtil.*;

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
		InputStream is = getInputStream();

		try {
			transfer(request, is, os, callback);
		}
		finally {
			close(is);
		}
	}

	protected FileProgressCallback callback;
	protected HttpPost request;

}