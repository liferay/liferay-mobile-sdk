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

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Liferay.SDK.Service.V73.Commercediscount
{
	public class CommercediscountService : ServiceBase
	{
		public CommercediscountService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommerceDiscountAsync(long userId, string title, string target, bool useCouponCode, string couponCode, bool usePercentage, IDictionary<string, object> maximumDiscountAmount, string level, IDictionary<string, object> level1, IDictionary<string, object> level2, IDictionary<string, object> level3, IDictionary<string, object> level4, string limitationType, int limitationTimes, bool rulesConjunction, bool active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("title", title);
			_parameters.Add("target", target);
			_parameters.Add("useCouponCode", useCouponCode);
			_parameters.Add("couponCode", couponCode);
			_parameters.Add("usePercentage", usePercentage);
			_parameters.Add("maximumDiscountAmount", maximumDiscountAmount);
			_parameters.Add("level", level);
			_parameters.Add("level1", level1);
			_parameters.Add("level2", level2);
			_parameters.Add("level3", level3);
			_parameters.Add("level4", level4);
			_parameters.Add("limitationType", limitationType);
			_parameters.Add("limitationTimes", limitationTimes);
			_parameters.Add("rulesConjunction", rulesConjunction);
			_parameters.Add("active", active);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/add-commerce-discount", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceDiscountAsync(long userId, string title, string target, bool useCouponCode, string couponCode, bool usePercentage, IDictionary<string, object> maximumDiscountAmount, IDictionary<string, object> level1, IDictionary<string, object> level2, IDictionary<string, object> level3, IDictionary<string, object> level4, string limitationType, int limitationTimes, bool active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("title", title);
			_parameters.Add("target", target);
			_parameters.Add("useCouponCode", useCouponCode);
			_parameters.Add("couponCode", couponCode);
			_parameters.Add("usePercentage", usePercentage);
			_parameters.Add("maximumDiscountAmount", maximumDiscountAmount);
			_parameters.Add("level1", level1);
			_parameters.Add("level2", level2);
			_parameters.Add("level3", level3);
			_parameters.Add("level4", level4);
			_parameters.Add("limitationType", limitationType);
			_parameters.Add("limitationTimes", limitationTimes);
			_parameters.Add("active", active);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/add-commerce-discount", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceDiscountAsync(long userId, string title, string target, bool useCouponCode, string couponCode, bool usePercentage, IDictionary<string, object> maximumDiscountAmount, string level, IDictionary<string, object> level1, IDictionary<string, object> level2, IDictionary<string, object> level3, IDictionary<string, object> level4, string limitationType, int limitationTimes, int limitationTimesPerAccount, bool rulesConjunction, bool active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, string externalReferenceCode, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("title", title);
			_parameters.Add("target", target);
			_parameters.Add("useCouponCode", useCouponCode);
			_parameters.Add("couponCode", couponCode);
			_parameters.Add("usePercentage", usePercentage);
			_parameters.Add("maximumDiscountAmount", maximumDiscountAmount);
			_parameters.Add("level", level);
			_parameters.Add("level1", level1);
			_parameters.Add("level2", level2);
			_parameters.Add("level3", level3);
			_parameters.Add("level4", level4);
			_parameters.Add("limitationType", limitationType);
			_parameters.Add("limitationTimes", limitationTimes);
			_parameters.Add("limitationTimesPerAccount", limitationTimesPerAccount);
			_parameters.Add("rulesConjunction", rulesConjunction);
			_parameters.Add("active", active);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("neverExpire", neverExpire);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/add-commerce-discount", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchByExternalReferenceCodeAsync(long companyId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceDiscountAsync(long commerceDiscountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/delete-commerce-discount", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommerceDiscountAsync(long commerceDiscountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/fetch-commerce-discount", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceDiscountAsync(long commerceDiscountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/get-commerce-discount", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceDiscountsAsync(long companyId, string couponCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("couponCode", couponCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/get-commerce-discounts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceDiscountsCountAsync(long companyId, string couponCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("couponCode", couponCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/get-commerce-discounts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceDiscountsCountByPricingClassIdAsync(long commercePricingClassId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/get-commerce-discounts-count-by-pricing-class-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchByCommercePricingClassIdAsync(long commercePricingClassId, string title, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);
			_parameters.Add("title", title);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/search-by-commerce-pricing-class-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> SearchCommerceDiscountsAsync(long companyId, string keywords, int status, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/search-commerce-discounts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceDiscountAsync(long commerceDiscountId, string title, string target, bool useCouponCode, string couponCode, bool usePercentage, IDictionary<string, object> maximumDiscountAmount, IDictionary<string, object> level1, IDictionary<string, object> level2, IDictionary<string, object> level3, IDictionary<string, object> level4, string limitationType, int limitationTimes, bool active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("title", title);
			_parameters.Add("target", target);
			_parameters.Add("useCouponCode", useCouponCode);
			_parameters.Add("couponCode", couponCode);
			_parameters.Add("usePercentage", usePercentage);
			_parameters.Add("maximumDiscountAmount", maximumDiscountAmount);
			_parameters.Add("level1", level1);
			_parameters.Add("level2", level2);
			_parameters.Add("level3", level3);
			_parameters.Add("level4", level4);
			_parameters.Add("limitationType", limitationType);
			_parameters.Add("limitationTimes", limitationTimes);
			_parameters.Add("active", active);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/update-commerce-discount", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceDiscountAsync(long commerceDiscountId, string title, string target, bool useCouponCode, string couponCode, bool usePercentage, IDictionary<string, object> maximumDiscountAmount, string level, IDictionary<string, object> level1, IDictionary<string, object> level2, IDictionary<string, object> level3, IDictionary<string, object> level4, string limitationType, int limitationTimes, int limitationTimesPerAccount, bool rulesConjunction, bool active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("title", title);
			_parameters.Add("target", target);
			_parameters.Add("useCouponCode", useCouponCode);
			_parameters.Add("couponCode", couponCode);
			_parameters.Add("usePercentage", usePercentage);
			_parameters.Add("maximumDiscountAmount", maximumDiscountAmount);
			_parameters.Add("level", level);
			_parameters.Add("level1", level1);
			_parameters.Add("level2", level2);
			_parameters.Add("level3", level3);
			_parameters.Add("level4", level4);
			_parameters.Add("limitationType", limitationType);
			_parameters.Add("limitationTimes", limitationTimes);
			_parameters.Add("limitationTimesPerAccount", limitationTimesPerAccount);
			_parameters.Add("rulesConjunction", rulesConjunction);
			_parameters.Add("active", active);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/update-commerce-discount", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceDiscountAsync(long commerceDiscountId, string title, string target, bool useCouponCode, string couponCode, bool usePercentage, IDictionary<string, object> maximumDiscountAmount, string level, IDictionary<string, object> level1, IDictionary<string, object> level2, IDictionary<string, object> level3, IDictionary<string, object> level4, string limitationType, int limitationTimes, bool rulesConjunction, bool active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("title", title);
			_parameters.Add("target", target);
			_parameters.Add("useCouponCode", useCouponCode);
			_parameters.Add("couponCode", couponCode);
			_parameters.Add("usePercentage", usePercentage);
			_parameters.Add("maximumDiscountAmount", maximumDiscountAmount);
			_parameters.Add("level", level);
			_parameters.Add("level1", level1);
			_parameters.Add("level2", level2);
			_parameters.Add("level3", level3);
			_parameters.Add("level4", level4);
			_parameters.Add("limitationType", limitationType);
			_parameters.Add("limitationTimes", limitationTimes);
			_parameters.Add("rulesConjunction", rulesConjunction);
			_parameters.Add("active", active);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/update-commerce-discount", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceDiscountExternalReferenceCodeAsync(long commerceDiscountId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/update-commerce-discount-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommerceDiscountAsync(long userId, long commerceDiscountId, string title, string target, bool useCouponCode, string couponCode, bool usePercentage, IDictionary<string, object> maximumDiscountAmount, IDictionary<string, object> level1, IDictionary<string, object> level2, IDictionary<string, object> level3, IDictionary<string, object> level4, string limitationType, int limitationTimes, bool active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, string externalReferenceCode, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("title", title);
			_parameters.Add("target", target);
			_parameters.Add("useCouponCode", useCouponCode);
			_parameters.Add("couponCode", couponCode);
			_parameters.Add("usePercentage", usePercentage);
			_parameters.Add("maximumDiscountAmount", maximumDiscountAmount);
			_parameters.Add("level1", level1);
			_parameters.Add("level2", level2);
			_parameters.Add("level3", level3);
			_parameters.Add("level4", level4);
			_parameters.Add("limitationType", limitationType);
			_parameters.Add("limitationTimes", limitationTimes);
			_parameters.Add("active", active);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("neverExpire", neverExpire);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/upsert-commerce-discount", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommerceDiscountAsync(long userId, long commerceDiscountId, string title, string target, bool useCouponCode, string couponCode, bool usePercentage, IDictionary<string, object> maximumDiscountAmount, string level, IDictionary<string, object> level1, IDictionary<string, object> level2, IDictionary<string, object> level3, IDictionary<string, object> level4, string limitationType, int limitationTimes, bool rulesConjunction, bool active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, string externalReferenceCode, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("title", title);
			_parameters.Add("target", target);
			_parameters.Add("useCouponCode", useCouponCode);
			_parameters.Add("couponCode", couponCode);
			_parameters.Add("usePercentage", usePercentage);
			_parameters.Add("maximumDiscountAmount", maximumDiscountAmount);
			_parameters.Add("level", level);
			_parameters.Add("level1", level1);
			_parameters.Add("level2", level2);
			_parameters.Add("level3", level3);
			_parameters.Add("level4", level4);
			_parameters.Add("limitationType", limitationType);
			_parameters.Add("limitationTimes", limitationTimes);
			_parameters.Add("rulesConjunction", rulesConjunction);
			_parameters.Add("active", active);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("neverExpire", neverExpire);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/upsert-commerce-discount", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommerceDiscountAsync(long userId, long commerceDiscountId, string title, string target, bool useCouponCode, string couponCode, bool usePercentage, IDictionary<string, object> maximumDiscountAmount, string level, IDictionary<string, object> level1, IDictionary<string, object> level2, IDictionary<string, object> level3, IDictionary<string, object> level4, string limitationType, int limitationTimes, int limitationTimesPerAccount, bool rulesConjunction, bool active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, string externalReferenceCode, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("title", title);
			_parameters.Add("target", target);
			_parameters.Add("useCouponCode", useCouponCode);
			_parameters.Add("couponCode", couponCode);
			_parameters.Add("usePercentage", usePercentage);
			_parameters.Add("maximumDiscountAmount", maximumDiscountAmount);
			_parameters.Add("level", level);
			_parameters.Add("level1", level1);
			_parameters.Add("level2", level2);
			_parameters.Add("level3", level3);
			_parameters.Add("level4", level4);
			_parameters.Add("limitationType", limitationType);
			_parameters.Add("limitationTimes", limitationTimes);
			_parameters.Add("limitationTimesPerAccount", limitationTimesPerAccount);
			_parameters.Add("rulesConjunction", rulesConjunction);
			_parameters.Add("active", active);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("neverExpire", neverExpire);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscount/upsert-commerce-discount", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}