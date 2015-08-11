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

import static com.liferay.mobile.android.callback.MainThreadRunner.run;

/**
 * @author Igor Oliveira
 */
public abstract class FileProgressCallback {

	public int getTotal() {
		return total;
	}

	public void increment(int bytesLength) {
		total = total + bytesLength;

		run(new Runnable() {

			@Override
			public void run() {
				onProgress(total);
			}

		});
	}

	public boolean isCancelled() {
		return this.cancelled;
	}

	public void onBytes(byte[] bytes) {
	}

	public abstract void onProgress(int totalBytes);

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	protected boolean cancelled;
	protected int total;

}