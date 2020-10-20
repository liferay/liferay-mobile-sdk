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

namespace Liferay.SDK.Service.V73.Commercepricingclasscpdefinitionrel
{
	public class CommercepricingclasscpdefinitionrelService : ServiceBase
	{
		public CommercepricingclasscpdefinitionrelService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> SearchByCommercePricingClassIdAsync(long commercePricingClassId, string name, string languageId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);
			_parameters.Add("name", name);
			_parameters.Add("languageId", languageId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclasscpdefinitionrel/search-by-commerce-pricing-class-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddCommercePricingClassCpDefinitionRelAsync(long commercePricingClassId, long cpDefinitionId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);
			_parameters.Add("cpDefinitionId", cpDefinitionId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclasscpdefinitionrel/add-commerce-pricing-class-cp-definition-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommercePricingClassCpDefinitionRelAsync(long commercePricingClassId, long cpDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);
			_parameters.Add("cpDefinitionId", cpDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclasscpdefinitionrel/fetch-commerce-pricing-class-cp-definition-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteCommercePricingClassCpDefinitionRelAsync(long commercePricingClassCPDefinitionRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassCPDefinitionRelId", commercePricingClassCPDefinitionRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclasscpdefinitionrel/delete-commerce-pricing-class-cp-definition-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteCommercePricingClassCpDefinitionRelAsync(JsonObjectWrapper commercePricingClassCPDefinitionRel)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "commercePricingClassCPDefinitionRel", "$languageUtil.getJSONWrapperClassName($parameter.type)", commercePricingClassCPDefinitionRel);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclasscpdefinitionrel/delete-commerce-pricing-class-cp-definition-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<long>> GetCpDefinitionIdsAsync(long commercePricingClassId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclasscpdefinitionrel/get-cp-definition-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<IEnumerable<dynamic>> GetCommercePricingClassCpDefinitionRelsAsync(long commercePricingClassId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommercePricingClassCpDefinitionRelsCountAsync(long commercePricingClassId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommercePricingClassCpDefinitionRelsCountAsync(long commercePricingClassId, string name, string languageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);
			_parameters.Add("name", name);
			_parameters.Add("languageId", languageId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePricingClassCpDefinitionRelByClassIdAsync(long commercePricingClassId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rel-by-class-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetCommercePricingClassCpDefinitionRelAsync(long commercePricingClassCPDefinitionRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassCPDefinitionRelId", commercePricingClassCPDefinitionRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}