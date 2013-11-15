/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.sdk.http;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class Discovery {

	public Discovery(String json) throws JSONException {
		JSONObject jsonObj = new JSONObject(json);

		_context = jsonObj.getString("context");
		_basePath = jsonObj.getString("basePath");

		if (jsonObj.has("discover")) {
			JSONArray jsonArray = jsonObj.getJSONArray("discover");

			for (int i = 0; i < jsonArray.length(); i++) {
				_discover.add(jsonArray.getString(i));
			}
		}

		JSONArray actions = jsonObj.getJSONArray("actions");

		for (int i = 0; i < actions.length(); i++) {
			Action action = new Action(actions.getJSONObject(i));

			_actions.add(action);
		}
	}

	public ArrayList<Action> getActions() {
		return _actions;
	}

	public String getBasePath() {
		return _basePath;
	}

	public String getContext() {
		return _context;
	}

	public ArrayList<String> getDiscover() {
		return _discover;
	}

	public void setActions(ArrayList<Action> actions) {
		_actions = actions;
	}

	public void setBasePath(String basePath) {
		_basePath = basePath;
	}

	public void setContext(String context) {
		_context = context;
	}

	public void setDiscover(ArrayList<String> discover) {
		_discover = discover;
	}

	private ArrayList<Action> _actions = new ArrayList<Action>();
	private String _basePath;
	private String _context;
	private ArrayList<String> _discover = new ArrayList<String>();

}