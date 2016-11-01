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

package com.liferay.mobile.sdk.adapter;

import rx.Observable;
import rx.Subscriber;

/**
 * @author Bruno Farache
 */
public class CallOnSubscribe<T> implements Observable.OnSubscribe<T> {

	@Override
	public void call(Subscriber<? super T> subscriber) {
		try {
			if (!subscriber.isUnsubscribed()) {
				subscriber.onNext(observable.call.execute(observable.config));
				subscriber.onCompleted();
			}
		} catch (Exception e) {
			if (!subscriber.isUnsubscribed()) {
				subscriber.onError(e);
			}
		}
	}

	public void observable(CallObservable<T> observable) {
		this.observable = observable;
	}

	protected CallObservable<T> observable;

}