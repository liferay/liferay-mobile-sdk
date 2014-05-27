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

import java.io.IOException;
import java.io.OutputStream;

import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

/**
 * @author Bruno Farache
 */
public class CountingHttpEntity extends HttpEntityWrapper {

	public CountingHttpEntity(HttpEntity entity, UploadAsyncTask task) {
		super(entity);

		_task = task;
	}

	public void writeTo(OutputStream os) throws IOException {
		if (_cos == null) {
			_cos = new CountingOutputStream(os, _task);
		}

		this.wrappedEntity.writeTo(_cos);
	}

	private CountingOutputStream _cos;
	private UploadAsyncTask _task;

}