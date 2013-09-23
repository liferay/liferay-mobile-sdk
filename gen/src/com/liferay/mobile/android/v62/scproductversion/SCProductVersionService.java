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

package com.liferay.mobile.android.v62.scproductversion;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.ServiceContext;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SCProductVersionService extends BaseService {
	public SCProductVersionService(ServiceContext context) {
		super(context);
	}

	public SCProductVersionService(ServiceContext context,
		AsyncTaskCallback callback) {
		super(context, callback);
	}

	public SCProductVersionService(ServiceContext context, boolean batch) {
		super(context, batch);
	}

	public JSONObject addProductVersion(long productEntryId, String version,
		String changeLog, String downloadPageURL, String directDownloadURL,
		boolean testDirectDownloadURL, boolean repoStoreArtifact,
		JSONArray frameworkVersionIds, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productEntryId", productEntryId);
			_params.put("version", version);
			_params.put("changeLog", changeLog);
			_params.put("downloadPageURL", downloadPageURL);
			_params.put("directDownloadURL", directDownloadURL);
			_params.put("testDirectDownloadURL", testDirectDownloadURL);
			_params.put("repoStoreArtifact", repoStoreArtifact);
			_params.put("frameworkVersionIds", frameworkVersionIds);
			_params.put("serviceContext", serviceContext);

			_command.put("/scproductversion/add-product-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public void deleteProductVersion(long productVersionId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productVersionId", productVersionId);

			_command.put("/scproductversion/delete-product-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public JSONObject getProductVersion(long productVersionId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productVersionId", productVersionId);

			_command.put("/scproductversion/get-product-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray getProductVersions(long productEntryId, int start, int end)
		throws Exception {
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

		return (JSONArray)post(_command);
	}

	public Integer getProductVersionsCount(long productEntryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productEntryId", productEntryId);

			_command.put("/scproductversion/get-product-versions-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)post(_command);
	}

	public JSONObject updateProductVersion(long productVersionId,
		String version, String changeLog, String downloadPageURL,
		String directDownloadURL, boolean testDirectDownloadURL,
		boolean repoStoreArtifact, JSONArray frameworkVersionIds)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productVersionId", productVersionId);
			_params.put("version", version);
			_params.put("changeLog", changeLog);
			_params.put("downloadPageURL", downloadPageURL);
			_params.put("directDownloadURL", directDownloadURL);
			_params.put("testDirectDownloadURL", testDirectDownloadURL);
			_params.put("repoStoreArtifact", repoStoreArtifact);
			_params.put("frameworkVersionIds", frameworkVersionIds);

			_command.put("/scproductversion/update-product-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}
}