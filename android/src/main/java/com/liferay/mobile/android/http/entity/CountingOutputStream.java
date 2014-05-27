/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.http.entity;

import com.liferay.mobile.android.task.UploadAsyncTask;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Bruno Farache
 */
public class CountingOutputStream extends FilterOutputStream {

	public CountingOutputStream(OutputStream os, UploadAsyncTask task) {
		super(os);

		_task = task;
	}

	public void write(byte[] buffer, int offset, int count) throws IOException {
		out.write(buffer, offset, count);

		_task.setProgress(count);
	}

	private UploadAsyncTask _task;

}