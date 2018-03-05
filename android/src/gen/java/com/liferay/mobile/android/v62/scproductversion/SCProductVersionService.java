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

package com.liferay.mobile.android.v62.scproductversion;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SCProductVersionService extends BaseService {

	public SCProductVersionService(Session session) {
		super(session);
	}

	public JSONObject addProductVersion(long productEntryId, String version, String changeLog, String downloadPageURL, String directDownloadURL, boolean testDirectDownloadURL, boolean repoStoreArtifact, JSONArray frameworkVersionIds, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productEntryId", productEntryId);
			_params.put("version", checkNull(version));
			_params.put("changeLog", checkNull(changeLog));
			_params.put("downloadPageURL", checkNull(downloadPageURL));
			_params.put("directDownloadURL", checkNull(directDownloadURL));
			_params.put("testDirectDownloadURL", testDirectDownloadURL);
			_params.put("repoStoreArtifact", repoStoreArtifact);
			_params.put("frameworkVersionIds", checkNull(frameworkVersionIds));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/scproductversion/add-product-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public void deleteProductVersion(long productVersionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productVersionId", productVersionId);

			_command.put("/scproductversion/delete-product-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getProductVersion(long productVersionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productVersionId", productVersionId);

			_command.put("/scproductversion/get-product-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONArray getProductVersions(long productEntryId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productEntryId", productEntryId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/scproductversion/get-product-versions", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Integer getProductVersionsCount(long productEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productEntryId", productEntryId);

			_command.put("/scproductversion/get-product-versions-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public JSONObject updateProductVersion(long productVersionId, String version, String changeLog, String downloadPageURL, String directDownloadURL, boolean testDirectDownloadURL, boolean repoStoreArtifact, JSONArray frameworkVersionIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productVersionId", productVersionId);
			_params.put("version", checkNull(version));
			_params.put("changeLog", checkNull(changeLog));
			_params.put("downloadPageURL", checkNull(downloadPageURL));
			_params.put("directDownloadURL", checkNull(directDownloadURL));
			_params.put("testDirectDownloadURL", testDirectDownloadURL);
			_params.put("repoStoreArtifact", repoStoreArtifact);
			_params.put("frameworkVersionIds", checkNull(frameworkVersionIds));

			_command.put("/scproductversion/update-product-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

}