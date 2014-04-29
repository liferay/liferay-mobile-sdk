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

package com.liferay.mobile.android.v62.socialactivity;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SocialActivityService extends BaseService {

	public SocialActivityService(Session session) {
		super(session);
	}

	public JSONArray getActivities(String className, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getActivities(long classNameId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getActivities(long mirrorActivityId, String className, long classPK, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("mirrorActivityId", mirrorActivityId);
			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getActivities(long mirrorActivityId, long classNameId, long classPK, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("mirrorActivityId", mirrorActivityId);
			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getActivitiesCount(String className) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);

			_command.put("/socialactivity/get-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public Integer getActivitiesCount(long classNameId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);

			_command.put("/socialactivity/get-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public Integer getActivitiesCount(long mirrorActivityId, String className, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("mirrorActivityId", mirrorActivityId);
			_params.put("className", className);
			_params.put("classPK", classPK);

			_command.put("/socialactivity/get-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public Integer getActivitiesCount(long mirrorActivityId, long classNameId, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("mirrorActivityId", mirrorActivityId);
			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);

			_command.put("/socialactivity/get-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONObject getActivity(long activityId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("activityId", activityId);

			_command.put("/socialactivity/get-activity", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getActivitySetActivities(long activitySetId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("activitySetId", activitySetId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-activity-set-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getGroupActivities(long groupId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-group-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getGroupActivitiesCount(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/socialactivity/get-group-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getGroupUsersActivities(long groupId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-group-users-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getGroupUsersActivitiesCount(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/socialactivity/get-group-users-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONObject getMirrorActivity(long mirrorActivityId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("mirrorActivityId", mirrorActivityId);

			_command.put("/socialactivity/get-mirror-activity", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getOrganizationActivities(long organizationId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-organization-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getOrganizationActivitiesCount(long organizationId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);

			_command.put("/socialactivity/get-organization-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getOrganizationUsersActivities(long organizationId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-organization-users-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getOrganizationUsersActivitiesCount(long organizationId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);

			_command.put("/socialactivity/get-organization-users-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getRelationActivities(long userId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-relation-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getRelationActivities(long userId, int type, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("type", type);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-relation-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getRelationActivitiesCount(long userId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);

			_command.put("/socialactivity/get-relation-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public Integer getRelationActivitiesCount(long userId, int type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("type", type);

			_command.put("/socialactivity/get-relation-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getUserActivities(long userId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-user-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getUserActivitiesCount(long userId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);

			_command.put("/socialactivity/get-user-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getUserGroupsActivities(long userId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-user-groups-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getUserGroupsActivitiesCount(long userId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);

			_command.put("/socialactivity/get-user-groups-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getUserGroupsAndOrganizationsActivities(long userId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-user-groups-and-organizations-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getUserGroupsAndOrganizationsActivitiesCount(long userId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);

			_command.put("/socialactivity/get-user-groups-and-organizations-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getUserOrganizationsActivities(long userId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/socialactivity/get-user-organizations-activities", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getUserOrganizationsActivitiesCount(long userId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);

			_command.put("/socialactivity/get-user-organizations-activities-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

}