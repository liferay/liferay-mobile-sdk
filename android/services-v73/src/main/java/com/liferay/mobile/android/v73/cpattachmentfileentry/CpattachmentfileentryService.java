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

package com.liferay.mobile.android.v73.cpattachmentfileentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CpattachmentfileentryService extends BaseService {

	public CpattachmentfileentryService(Session session) {
		super(session);
	}

	public JSONObject addCpAttachmentFileEntry(long userId, long groupId, long classNameId, long classPK, long fileEntryId, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObject titleMap, String json, double priority, int type, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("fileEntryId", fileEntryId);
			_params.put("groupId", groupId);
			_params.put("json", checkNull(json));
			_params.put("neverExpire", neverExpire);
			_params.put("priority", priority);
			_params.put("titleMap", checkNull(titleMap));
			_params.put("type", type);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpattachmentfileentry/add-cp-attachment-file-entry", _params);
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

	public void deleteCpAttachmentFileEntry(long cpAttachmentFileEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpAttachmentFileEntryId", cpAttachmentFileEntryId);

			_command.put("/commerce.cpattachmentfileentry/delete-cp-attachment-file-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchByExternalReferenceCode(long companyId, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.cpattachmentfileentry/fetch-by-external-reference-code", _params);
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

	public JSONObject fetchCpAttachmentFileEntry(long cpAttachmentFileEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpAttachmentFileEntryId", cpAttachmentFileEntryId);

			_command.put("/commerce.cpattachmentfileentry/fetch-cp-attachment-file-entry", _params);
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

	public JSONArray getCpAttachmentFileEntries(long classNameId, long classPK, int type, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("end", end);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("type", type);

			_command.put("/commerce.cpattachmentfileentry/get-cp-attachment-file-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getCpAttachmentFileEntries(long classNameId, long classPK, int type, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("end", end);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("type", type);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPAttachmentFileEntry>", orderByComparator);

			_command.put("/commerce.cpattachmentfileentry/get-cp-attachment-file-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Integer getCpAttachmentFileEntriesCount(long classNameId, long classPK, int type, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("status", status);
			_params.put("type", type);

			_command.put("/commerce.cpattachmentfileentry/get-cp-attachment-file-entries-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public JSONObject getCpAttachmentFileEntry(long cpAttachmentFileEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpAttachmentFileEntryId", cpAttachmentFileEntryId);

			_command.put("/commerce.cpattachmentfileentry/get-cp-attachment-file-entry", _params);
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

	public JSONObject updateCpAttachmentFileEntry(long cpAttachmentFileEntryId, long fileEntryId, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObject titleMap, String json, double priority, int type, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpAttachmentFileEntryId", cpAttachmentFileEntryId);
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("fileEntryId", fileEntryId);
			_params.put("json", checkNull(json));
			_params.put("neverExpire", neverExpire);
			_params.put("priority", priority);
			_params.put("titleMap", checkNull(titleMap));
			_params.put("type", type);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpattachmentfileentry/update-cp-attachment-file-entry", _params);
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

	public JSONObject upsertCpAttachmentFileEntry(long groupId, long classNameId, long classPK, long fileEntryId, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObject titleMap, String json, double priority, int type, String externalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("fileEntryId", fileEntryId);
			_params.put("groupId", groupId);
			_params.put("json", checkNull(json));
			_params.put("neverExpire", neverExpire);
			_params.put("priority", priority);
			_params.put("titleMap", checkNull(titleMap));
			_params.put("type", type);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpattachmentfileentry/upsert-cp-attachment-file-entry", _params);
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

	public JSONObject upsertCpAttachmentFileEntry(long groupId, long classNameId, long classPK, long cpAttachmentFileEntryId, long fileEntryId, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObject titleMap, String json, double priority, int type, String externalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("cpAttachmentFileEntryId", cpAttachmentFileEntryId);
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("fileEntryId", fileEntryId);
			_params.put("groupId", groupId);
			_params.put("json", checkNull(json));
			_params.put("neverExpire", neverExpire);
			_params.put("priority", priority);
			_params.put("titleMap", checkNull(titleMap));
			_params.put("type", type);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpattachmentfileentry/upsert-cp-attachment-file-entry", _params);
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