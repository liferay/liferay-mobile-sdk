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

package com.liferay.mobile.sdk.service;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.json.GenericListType;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import rx.Observable;

import rx.Observable.OnSubscribe;

import rx.Subscriber;

/**
 * @author Bruno Farache
 */
public class ObservableGroupService {

	public Observable<List<Site>> getUserSites() {
		return Observable.create(new OnSubscribe<List<Site>>() {

			@Override
			public void call(Subscriber<? super List<Site>> subscriber) {
				JSONObject _command = new JSONObject();

				try {
					JSONObject _params = new JSONObject();

					_command.put("/group/get-user-sites", _params);
				}
				catch (JSONException _je) {
				}

				GenericListType<Site> type = new GenericListType<>(Site.class);

				Call<List<Site>> call = new Call<>(_command, type);

				try {
					List<Site> sites = call.execute();

					if (!subscriber.isUnsubscribed()) {
						subscriber.onNext(sites);
						subscriber.onCompleted();
					}
				}
				catch (Exception e) {
					if (!subscriber.isUnsubscribed()) {
						subscriber.onError(e);
					}
				}
			}

		});
	}

}