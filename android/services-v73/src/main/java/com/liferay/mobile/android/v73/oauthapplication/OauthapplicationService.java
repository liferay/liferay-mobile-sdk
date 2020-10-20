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

package com.liferay.mobile.android.v73.oauthapplication;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class OauthapplicationService extends BaseService {

	public OauthapplicationService(Session session) {
		super(session);
	}

	public JSONObject addOAuthApplication(String name, String description, int accessLevel, boolean shareableAccessToken, String callbackURI, String websiteURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("accessLevel", accessLevel);
			_params.put("callbackURI", checkNull(callbackURI));
			_params.put("description", checkNull(description));
			_params.put("name", checkNull(name));
			_params.put("shareableAccessToken", shareableAccessToken);
			_params.put("websiteURL", checkNull(websiteURL));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/oauth.oauthapplication/add-o-auth-application", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public void deleteLogo(long oAuthApplicationId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("oAuthApplicationId", oAuthApplicationId);

			_command.put("/oauth.oauthapplication/delete-logo", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject deleteOAuthApplication(long oAuthApplicationId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("oAuthApplicationId", oAuthApplicationId);

			_command.put("/oauth.oauthapplication/delete-o-auth-application", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject updateOAuthApplication(long oAuthApplicationId, String name, String description, boolean shareableAccessToken, String callbackURI, String websiteURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("callbackURI", checkNull(callbackURI));
			_params.put("description", checkNull(description));
			_params.put("name", checkNull(name));
			_params.put("oAuthApplicationId", oAuthApplicationId);
			_params.put("shareableAccessToken", shareableAccessToken);
			_params.put("websiteURL", checkNull(websiteURL));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/oauth.oauthapplication/update-o-auth-application", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

}