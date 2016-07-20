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

import com.liferay.mobile.sdk.adapter.ObservableAdapter;
import com.liferay.mobile.sdk.exception.ServerException;
import com.liferay.mobile.sdk.service.Site;
import com.liferay.mobile.sdk.service.rx.GroupService;

import java.io.IOException;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import rx.Observable;

import rx.observers.TestSubscriber;

/**
 * @author Bruno Farache
 */
public class ObservableGroupServiceTest extends BaseTest {

	public ObservableGroupServiceTest() throws IOException {
		super();
		ServiceBuilder.registerReturnTypeAdapter(new ObservableAdapter());
	}

	@Test
	public void getUserSites() throws Exception {
		GroupService service = ServiceBuilder.build(GroupService.class);
		Observable<List<Site>> observable = service.getUserSites();
		TestSubscriber<List<Site>> subscriber = new TestSubscriber<>();
		observable.subscribe(subscriber);

		subscriber.assertNoErrors();
		subscriber.assertCompleted();
		subscriber.assertValues(
			Arrays.asList(new Site("/test"), new Site("/guest")));
	}

	@Test
	public void nonexistent() throws Exception {
		GroupService service = ServiceBuilder.build(GroupService.class);
		Observable<List<Site>> observable = service.nonexistent();
		TestSubscriber<List<Site>> subscriber = new TestSubscriber<>();
		observable.subscribe(subscriber);

		subscriber.assertError(ServerException.class);
		subscriber.assertNotCompleted();
		subscriber.assertNoValues();
	}

}