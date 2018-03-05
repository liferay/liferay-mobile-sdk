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

package com.liferay.mobile.android.v62.scproductentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SCProductEntryService extends BaseService {

	public SCProductEntryService(Session session) {
		super(session);
	}

	public JSONObject addProductEntry(String name, String type, String tags, String shortDescription, String longDescription, String pageURL, String author, String repoGroupId, String repoArtifactId, JSONArray licenseIds, JSONArray thumbnails, JSONArray fullImages, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("name", checkNull(name));
			_params.put("type", checkNull(type));
			_params.put("tags", checkNull(tags));
			_params.put("shortDescription", checkNull(shortDescription));
			_params.put("longDescription", checkNull(longDescription));
			_params.put("pageURL", checkNull(pageURL));
			_params.put("author", checkNull(author));
			_params.put("repoGroupId", checkNull(repoGroupId));
			_params.put("repoArtifactId", checkNull(repoArtifactId));
			_params.put("licenseIds", checkNull(licenseIds));
			_params.put("thumbnails", checkNull(thumbnails));
			_params.put("fullImages", checkNull(fullImages));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/scproductentry/add-product-entry", _params);
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

	public void deleteProductEntry(long productEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productEntryId", productEntryId);

			_command.put("/scproductentry/delete-product-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getProductEntry(long productEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productEntryId", productEntryId);

			_command.put("/scproductentry/get-product-entry", _params);
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

	public JSONObject updateProductEntry(long productEntryId, String name, String type, String tags, String shortDescription, String longDescription, String pageURL, String author, String repoGroupId, String repoArtifactId, JSONArray licenseIds, JSONArray thumbnails, JSONArray fullImages) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("productEntryId", productEntryId);
			_params.put("name", checkNull(name));
			_params.put("type", checkNull(type));
			_params.put("tags", checkNull(tags));
			_params.put("shortDescription", checkNull(shortDescription));
			_params.put("longDescription", checkNull(longDescription));
			_params.put("pageURL", checkNull(pageURL));
			_params.put("author", checkNull(author));
			_params.put("repoGroupId", checkNull(repoGroupId));
			_params.put("repoArtifactId", checkNull(repoArtifactId));
			_params.put("licenseIds", checkNull(licenseIds));
			_params.put("thumbnails", checkNull(thumbnails));
			_params.put("fullImages", checkNull(fullImages));

			_command.put("/scproductentry/update-product-entry", _params);
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