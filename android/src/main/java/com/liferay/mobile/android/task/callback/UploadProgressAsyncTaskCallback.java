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

package com.liferay.mobile.android.task.callback;

import com.liferay.mobile.android.task.callback.typed.GenericAsyncTaskCallback;

/**
 * @author Bruno Farache
 */
public abstract class UploadProgressAsyncTaskCallback<T>
		extends GenericAsyncTaskCallback<T> {

	public abstract void updateProgress(int progress);

}