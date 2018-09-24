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

package com.liferay.mobile.android.callback.file;

import com.liferay.mobile.android.callback.Callback;
import com.liferay.mobile.android.http.Response;

import static com.liferay.mobile.android.http.file.FileProgressUtil.transfer;

/**
 * @author Bruno Farache
 */
public class DownloadCallback implements Callback {

	public DownloadCallback(
		Callback callback, FileProgressCallback fileProgressCallback) {

		this.callback = callback;
		this.fileProgressCallback = fileProgressCallback;
	}

	@Override
	public void doFailure(Exception exception) {
		callback.doFailure(exception);
	}

	@Override
	public void inBackground(Response response) {
		try {
			transfer(
				response.getBodyAsStream(), fileProgressCallback, tag, null);

			callback.inBackground(response);
		}
		catch (Exception e) {
			doFailure(e);
		}
	}

	public void setTag(Object tag) {
		this.tag = tag;
	}

	protected Callback callback;
	protected FileProgressCallback fileProgressCallback;
	protected Object tag;

}