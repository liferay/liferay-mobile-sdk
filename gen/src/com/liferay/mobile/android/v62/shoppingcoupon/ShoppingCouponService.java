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

package com.liferay.mobile.android.v62.shoppingcoupon;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class ShoppingCouponService extends BaseService {
	public ShoppingCouponService(Session session) {
		super(session);
	}

	public JSONObject addCoupon(String code, boolean autoCode, String name,
		String description, int startDateMonth, int startDateDay,
		int startDateYear, int startDateHour, int startDateMinute,
		int endDateMonth, int endDateDay, int endDateYear, int endDateHour,
		int endDateMinute, boolean neverExpire, boolean active,
		String limitCategories, String limitSkus, double minOrder,
		double discount, String discountType, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("code", code);
			_params.put("autoCode", autoCode);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("startDateMonth", startDateMonth);
			_params.put("startDateDay", startDateDay);
			_params.put("startDateYear", startDateYear);
			_params.put("startDateHour", startDateHour);
			_params.put("startDateMinute", startDateMinute);
			_params.put("endDateMonth", endDateMonth);
			_params.put("endDateDay", endDateDay);
			_params.put("endDateYear", endDateYear);
			_params.put("endDateHour", endDateHour);
			_params.put("endDateMinute", endDateMinute);
			_params.put("neverExpire", neverExpire);
			_params.put("active", active);
			_params.put("limitCategories", limitCategories);
			_params.put("limitSkus", limitSkus);
			_params.put("minOrder", minOrder);
			_params.put("discount", discount);
			_params.put("discountType", discountType);
			_params.put("serviceContext", serviceContext);

			_command.put("/shoppingcoupon/add-coupon", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteCoupon(long groupId, long couponId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("couponId", couponId);

			_command.put("/shoppingcoupon/delete-coupon", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getCoupon(long groupId, long couponId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("couponId", couponId);

			_command.put("/shoppingcoupon/get-coupon", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray search(long groupId, long companyId, String code,
		boolean active, String discountType, boolean andOperator, int start,
		int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("companyId", companyId);
			_params.put("code", code);
			_params.put("active", active);
			_params.put("discountType", discountType);
			_params.put("andOperator", andOperator);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/shoppingcoupon/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject updateCoupon(long couponId, String name,
		String description, int startDateMonth, int startDateDay,
		int startDateYear, int startDateHour, int startDateMinute,
		int endDateMonth, int endDateDay, int endDateYear, int endDateHour,
		int endDateMinute, boolean neverExpire, boolean active,
		String limitCategories, String limitSkus, double minOrder,
		double discount, String discountType, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("couponId", couponId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("startDateMonth", startDateMonth);
			_params.put("startDateDay", startDateDay);
			_params.put("startDateYear", startDateYear);
			_params.put("startDateHour", startDateHour);
			_params.put("startDateMinute", startDateMinute);
			_params.put("endDateMonth", endDateMonth);
			_params.put("endDateDay", endDateDay);
			_params.put("endDateYear", endDateYear);
			_params.put("endDateHour", endDateHour);
			_params.put("endDateMinute", endDateMinute);
			_params.put("neverExpire", neverExpire);
			_params.put("active", active);
			_params.put("limitCategories", limitCategories);
			_params.put("limitSkus", limitSkus);
			_params.put("minOrder", minOrder);
			_params.put("discount", discount);
			_params.put("discountType", discountType);
			_params.put("serviceContext", serviceContext);

			_command.put("/shoppingcoupon/update-coupon", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}