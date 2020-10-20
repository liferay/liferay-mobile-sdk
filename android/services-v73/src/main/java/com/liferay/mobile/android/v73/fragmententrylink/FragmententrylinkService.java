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

package com.liferay.mobile.android.v73.fragmententrylink;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class FragmententrylinkService extends BaseService {

	public FragmententrylinkService(Session session) {
		super(session);
	}

	public JSONObject addFragmentEntryLink(long groupId, long originalFragmentEntryLinkId, long fragmentEntryId, long segmentsExperienceId, long classNameId, long classPK, String css, String html, String js, String configuration, String editableValues, String namespace, int position, String rendererKey, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("configuration", checkNull(configuration));
			_params.put("css", checkNull(css));
			_params.put("editableValues", checkNull(editableValues));
			_params.put("fragmentEntryId", fragmentEntryId);
			_params.put("groupId", groupId);
			_params.put("html", checkNull(html));
			_params.put("js", checkNull(js));
			_params.put("namespace", checkNull(namespace));
			_params.put("originalFragmentEntryLinkId", originalFragmentEntryLinkId);
			_params.put("position", position);
			_params.put("rendererKey", checkNull(rendererKey));
			_params.put("segmentsExperienceId", segmentsExperienceId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmententrylink/add-fragment-entry-link", _params);
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

	public JSONObject addFragmentEntryLink(long groupId, long originalFragmentEntryLinkId, long fragmentEntryId, long segmentsExperienceId, long plid, String css, String html, String js, String configuration, String editableValues, String namespace, int position, String rendererKey, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("configuration", checkNull(configuration));
			_params.put("css", checkNull(css));
			_params.put("editableValues", checkNull(editableValues));
			_params.put("fragmentEntryId", fragmentEntryId);
			_params.put("groupId", groupId);
			_params.put("html", checkNull(html));
			_params.put("js", checkNull(js));
			_params.put("namespace", checkNull(namespace));
			_params.put("originalFragmentEntryLinkId", originalFragmentEntryLinkId);
			_params.put("plid", plid);
			_params.put("position", position);
			_params.put("rendererKey", checkNull(rendererKey));
			_params.put("segmentsExperienceId", segmentsExperienceId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmententrylink/add-fragment-entry-link", _params);
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

	public JSONObject deleteFragmentEntryLink(long fragmentEntryLinkId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentEntryLinkId", fragmentEntryLinkId);

			_command.put("/fragment.fragmententrylink/delete-fragment-entry-link", _params);
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

	public JSONObject updateFragmentEntryLink(long fragmentEntryLinkId, String editableValues) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("editableValues", checkNull(editableValues));
			_params.put("fragmentEntryLinkId", fragmentEntryLinkId);

			_command.put("/fragment.fragmententrylink/update-fragment-entry-link", _params);
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

	public JSONObject updateFragmentEntryLink(long fragmentEntryLinkId, String editableValues, boolean updateClassedModel) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("editableValues", checkNull(editableValues));
			_params.put("fragmentEntryLinkId", fragmentEntryLinkId);
			_params.put("updateClassedModel", updateClassedModel);

			_command.put("/fragment.fragmententrylink/update-fragment-entry-link", _params);
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

	public void updateFragmentEntryLinks(JSONObject fragmentEntryLinksEditableValuesMap) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentEntryLinksEditableValuesMap", checkNull(fragmentEntryLinksEditableValuesMap));

			_command.put("/fragment.fragmententrylink/update-fragment-entry-links", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void updateFragmentEntryLinks(long groupId, long plid, JSONArray fragmentEntryIds, String editableValues, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("editableValues", checkNull(editableValues));
			_params.put("fragmentEntryIds", checkNull(fragmentEntryIds));
			_params.put("groupId", groupId);
			_params.put("plid", plid);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmententrylink/update-fragment-entry-links", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void updateFragmentEntryLinks(long groupId, long classNameId, long classPK, JSONArray fragmentEntryIds, String editableValues, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("editableValues", checkNull(editableValues));
			_params.put("fragmentEntryIds", checkNull(fragmentEntryIds));
			_params.put("groupId", groupId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmententrylink/update-fragment-entry-links", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

}