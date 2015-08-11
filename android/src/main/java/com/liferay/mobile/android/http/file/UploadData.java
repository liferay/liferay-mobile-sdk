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

import java.io.InputStream;

/**
 * @author Igor Oliveira
 * @author Bruno Farache
 */
public class UploadData {

	public UploadData(
		InputStream is, String fileName, FileProgressCallback callback) {

		this(is, null, fileName, callback);
	}

	public UploadData(
		InputStream is, String mimeType, String fileName,
		FileProgressCallback callback) {

		this.is = is;

		if (mimeType == null) {
			mimeType = "application/octet-stream";
		}

		this.mimeType = mimeType;
		this.fileName = fileName;
		this.callback = callback;
	}

	public FileProgressCallback getCallback() {
		return callback;
	}

	public String getFileName() {
		return fileName;
	}

	public InputStream getInputStream() {
		return is;
	}

	public String getMimeType() {
		return mimeType;
	}

	protected FileProgressCallback callback;
	protected String fileName;
	protected InputStream is;
	protected String mimeType;

}