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

package com.liferay.client.builder.http;

import java.util.ArrayList;
import java.util.Iterator;

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
		_discover = jsonObj.getString("discover");

		JSONObject actions = jsonObj.getJSONObject("actions");

		Iterator<String> it = actions.keys();

		while (it.hasNext()) {
			String key = it.next();

			Action action = new Action(actions.getJSONObject(key));

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

	public String getDiscover() {
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

	public void setDiscover(String discover) {
		_discover = discover;
	}

	private ArrayList<Action> _actions = new ArrayList<Action>();
	private String _basePath;
	private String _context;
	private String _discover;

}