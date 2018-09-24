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

package com.liferay.mobile.android.service;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.callback.BatchCallback;
import com.liferay.mobile.android.http.HttpUtil;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class BatchSessionImpl extends SessionImpl {

	public BatchSessionImpl(Session session) {
		super(session);
	}

	public BatchSessionImpl(String server) {
		super(server);
	}

	public BatchSessionImpl(String server, Authentication authentication) {
		super(server, authentication);
	}

	public BatchSessionImpl(
		String server, Authentication authentication, BatchCallback callback) {

		super(server, authentication, callback);
	}

	public BatchSessionImpl(
		String server, Authentication authentication, int connectionTimeout,
		BatchCallback callback) {

		super(server, authentication, connectionTimeout, callback);
	}

	public BatchSessionImpl(String server, BatchCallback callback) {
		super(server, callback);
	}

	public JSONArray invoke() throws Exception {
		if (_commands.size() == 0) {
			return null;
		}

		try {
			return HttpUtil.post(this, new JSONArray(_commands));
		}
		finally {
			_commands = new ArrayList<JSONObject>();
		}
	}

	@Override
	public JSONArray invoke(JSONObject command) throws Exception {
		_commands.add(command);

		return null;
	}

	public void setCallback(BatchCallback callback) {
		this.callback = callback;
	}

	@Override
	public JSONArray upload(JSONObject command) throws Exception {
		throw new IllegalStateException("Can't batch upload requests");
	}

	private ArrayList<JSONObject> _commands = new ArrayList<JSONObject>();

}