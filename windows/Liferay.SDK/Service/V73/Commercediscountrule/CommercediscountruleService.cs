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

namespace Liferay.SDK.Service.V73.Commercediscountrule
{
	public class CommercediscountruleService : ServiceBase
	{
		public CommercediscountruleService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommerceDiscountRuleAsync(long commerceDiscountId, string name, string type, string typeSettings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("typeSettings", typeSettings);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrule/add-commerce-discount-rule", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceDiscountRuleAsync(long commerceDiscountId, string type, string typeSettings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("type", type);
			_parameters.Add("typeSettings", typeSettings);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrule/add-commerce-discount-rule", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceDiscountRuleAsync(long commerceDiscountRuleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountRuleId", commerceDiscountRuleId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrule/delete-commerce-discount-rule", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCommerceDiscountRulesAsync(long commerceDiscountId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrule/get-commerce-discount-rules", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceDiscountRulesAsync(long commerceDiscountId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrule/get-commerce-discount-rules", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceDiscountRulesCountAsync(long commerceDiscountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrule/get-commerce-discount-rules-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceDiscountRulesCountAsync(long commerceDiscountId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrule/get-commerce-discount-rules-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceDiscountRuleAsync(long commerceDiscountRuleId, string name, string type, string typeSettings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountRuleId", commerceDiscountRuleId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("typeSettings", typeSettings);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrule/update-commerce-discount-rule", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceDiscountRuleAsync(long commerceDiscountRuleId, string type, string typeSettings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountRuleId", commerceDiscountRuleId);
			_parameters.Add("type", type);
			_parameters.Add("typeSettings", typeSettings);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrule/update-commerce-discount-rule", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceDiscountRuleAsync(long commerceDiscountRuleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountRuleId", commerceDiscountRuleId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrule/fetch-commerce-discount-rule", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceDiscountRuleAsync(long commerceDiscountRuleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountRuleId", commerceDiscountRuleId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrule/get-commerce-discount-rule", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}