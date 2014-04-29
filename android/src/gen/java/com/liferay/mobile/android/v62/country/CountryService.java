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

package com.liferay.mobile.android.v62.country;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CountryService extends BaseService {

	public CountryService(Session session) {
		super(session);
	}

	public JSONObject addCountry(String name, String a2, String a3, String number, String idd, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("name", name);
			_params.put("a2", a2);
			_params.put("a3", a3);
			_params.put("number", number);
			_params.put("idd", idd);
			_params.put("active", active);

			_command.put("/country/add-country", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject fetchCountry(long countryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("countryId", countryId);

			_command.put("/country/fetch-country", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject fetchCountryByA2(String a2) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("a2", a2);

			_command.put("/country/fetch-country-by-a2", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject fetchCountryByA3(String a3) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("a3", a3);

			_command.put("/country/fetch-country-by-a3", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getCountries() throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/country/get-countries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getCountries(boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);

			_command.put("/country/get-countries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject getCountry(long countryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("countryId", countryId);

			_command.put("/country/get-country", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getCountryByA2(String a2) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("a2", a2);

			_command.put("/country/get-country-by-a2", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getCountryByA3(String a3) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("a3", a3);

			_command.put("/country/get-country-by-a3", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getCountryByName(String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("name", name);

			_command.put("/country/get-country-by-name", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

}