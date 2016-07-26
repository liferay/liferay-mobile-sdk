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
package com.liferay.mobile.sdk;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.fail;

/**
 * @author Bruno Farache
 */
public class TestCallback<T> extends Callback<T> {

	public TestCallback(CountDownLatch lock) {
		this.lock = lock;
	}

	@Override
	public void onFailure(Exception exception) {
		fail(exception.getMessage());
		lock.countDown();
	}

	@Override
	public void onSuccess(T result) {
		this.result = result;
		lock.countDown();
	}

	public T result() {
		return result;
	}

	protected CountDownLatch lock;
	protected T result;

}