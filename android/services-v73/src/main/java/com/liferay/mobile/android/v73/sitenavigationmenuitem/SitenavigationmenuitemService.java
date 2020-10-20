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

package com.liferay.mobile.android.v73.sitenavigationmenuitem;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SitenavigationmenuitemService extends BaseService {

	public SitenavigationmenuitemService(Session session) {
		super(session);
	}

	public JSONObject addSiteNavigationMenuItem(long groupId, long siteNavigationMenuId, long parentSiteNavigationMenuItemId, String type, String typeSettings, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentSiteNavigationMenuItemId", parentSiteNavigationMenuItemId);
			_params.put("siteNavigationMenuId", siteNavigationMenuId);
			_params.put("type", checkNull(type));
			_params.put("typeSettings", checkNull(typeSettings));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/sitenavigation.sitenavigationmenuitem/add-site-navigation-menu-item", _params);
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

	public JSONObject deleteSiteNavigationMenuItem(long siteNavigationMenuItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("siteNavigationMenuItemId", siteNavigationMenuItemId);

			_command.put("/sitenavigation.sitenavigationmenuitem/delete-site-navigation-menu-item", _params);
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

	public void deleteSiteNavigationMenuItems(long siteNavigationMenuId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("siteNavigationMenuId", siteNavigationMenuId);

			_command.put("/sitenavigation.sitenavigationmenuitem/delete-site-navigation-menu-items", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONArray getSiteNavigationMenuItems(long siteNavigationMenuId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("siteNavigationMenuId", siteNavigationMenuId);

			_command.put("/sitenavigation.sitenavigationmenuitem/get-site-navigation-menu-items", _params);
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

	public JSONArray getSiteNavigationMenuItems(long siteNavigationMenuId, long parentSiteNavigationMenuItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentSiteNavigationMenuItemId", parentSiteNavigationMenuItemId);
			_params.put("siteNavigationMenuId", siteNavigationMenuId);

			_command.put("/sitenavigation.sitenavigationmenuitem/get-site-navigation-menu-items", _params);
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

	public JSONObject updateSiteNavigationMenuItem(long siteNavigationMenuId, long parentSiteNavigationMenuItemId, int order) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("order", order);
			_params.put("parentSiteNavigationMenuItemId", parentSiteNavigationMenuItemId);
			_params.put("siteNavigationMenuId", siteNavigationMenuId);

			_command.put("/sitenavigation.sitenavigationmenuitem/update-site-navigation-menu-item", _params);
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

	public JSONObject updateSiteNavigationMenuItem(long siteNavigationMenuId, String typeSettings, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("siteNavigationMenuId", siteNavigationMenuId);
			_params.put("typeSettings", checkNull(typeSettings));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/sitenavigation.sitenavigationmenuitem/update-site-navigation-menu-item", _params);
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