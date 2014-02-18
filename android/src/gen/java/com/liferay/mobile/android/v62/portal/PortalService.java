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

package com.liferay.mobile.android.v62.portal;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class PortalService extends BaseService {
	public PortalService(Session session) {
		super(session);
	}

	public String getAutoDeployDirectory() throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/portal/get-auto-deploy-directory", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)session.invoke(_command);
	}

	public Integer getBuildNumber() throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/portal/get-build-number", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public void testAddClassNameAndTestTransactionPortletBar_PortalRollback(String transactionPortletBarText) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("transactionPortletBarText", transactionPortletBarText);

			_command.put("/portal/test-add-class-name-and-test-transaction-portlet-bar_-portal-rollback", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void testAddClassNameAndTestTransactionPortletBar_PortletRollback(String transactionPortletBarText) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("transactionPortletBarText", transactionPortletBarText);

			_command.put("/portal/test-add-class-name-and-test-transaction-portlet-bar_-portlet-rollback", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void testAddClassNameAndTestTransactionPortletBar_Success(String transactionPortletBarText) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("transactionPortletBarText", transactionPortletBarText);

			_command.put("/portal/test-add-class-name-and-test-transaction-portlet-bar_-success", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void testAddClassName_Rollback(String classNameValue) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameValue", classNameValue);

			_command.put("/portal/test-add-class-name_-rollback", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void testAddClassName_Success(String classNameValue) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameValue", classNameValue);

			_command.put("/portal/test-add-class-name_-success", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void testAutoSyncHibernateSessionStateOnTxCreation() throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/portal/test-auto-sync-hibernate-session-state-on-tx-creation", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void testDeleteClassName() throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/portal/test-delete-class-name", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public Integer testGetBuildNumber() throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/portal/test-get-build-number", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public void testGetUserId() throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/portal/test-get-user-id", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public Boolean testHasClassName() throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/portal/test-has-class-name", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Boolean)session.invoke(_command);
	}

}