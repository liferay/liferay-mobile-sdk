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

package com.liferay.client.service;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class JSONWrapper {

	public JSONWrapper(Exception exception) {
		_exception = exception;
	}

	public JSONWrapper(JSONArray jsonArray) {
		_jsonArray = jsonArray;
	}

	public JSONWrapper(JSONObject jsonObject) {
		_jsonObject = jsonObject;
	}

	public JSONWrapper(String json) {
		_json = json;
	}

	public Exception getException() {
		return _exception;
	}

	public String getJSON() {
		return _json;
	}

	public JSONArray getJSONArray() {
		return _jsonArray;
	}

	public JSONObject getJSONObject() {
		return _jsonObject;
	}

	public void setJSON(String json) {
		_json = json;
	}

	public void setJSONArray(JSONArray jsonArray) {
		_jsonArray = jsonArray;
	}

	public void setJSONObject(JSONObject jsonObject) {
		_jsonObject = jsonObject;
	}

	private Exception _exception;
	private String _json;
	private JSONArray _jsonArray;
	private JSONObject _jsonObject;

}