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

namespace Liferay.SDK.Service.V73.Cpdefinitionoptionrel
{
	public class CpdefinitionoptionrelService : ServiceBase
	{
		public CpdefinitionoptionrelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCpDefinitionOptionRelAsync(long cpDefinitionId, long cpOptionId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string ddmFormFieldTypeName, double priority, bool facetable, bool required, bool skuContributor, bool importOptionValue, string priceType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("cpOptionId", cpOptionId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("ddmFormFieldTypeName", ddmFormFieldTypeName);
			_parameters.Add("priority", priority);
			_parameters.Add("facetable", facetable);
			_parameters.Add("required", required);
			_parameters.Add("skuContributor", skuContributor);
			_parameters.Add("importOptionValue", importOptionValue);
			_parameters.Add("priceType", priceType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/add-cp-definition-option-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpDefinitionOptionRelAsync(long cpDefinitionId, long cpOptionId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string ddmFormFieldTypeName, double priority, bool facetable, bool required, bool skuContributor, bool importOptionValue, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("cpOptionId", cpOptionId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("ddmFormFieldTypeName", ddmFormFieldTypeName);
			_parameters.Add("priority", priority);
			_parameters.Add("facetable", facetable);
			_parameters.Add("required", required);
			_parameters.Add("skuContributor", skuContributor);
			_parameters.Add("importOptionValue", importOptionValue);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/add-cp-definition-option-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpDefinitionOptionRelAsync(long cpDefinitionId, long cpOptionId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("cpOptionId", cpOptionId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/add-cp-definition-option-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCpDefinitionOptionRelAsync(long cpDefinitionOptionRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionRelId", cpDefinitionOptionRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/delete-cp-definition-option-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCpDefinitionOptionRelAsync(long cpDefinitionId, long cpOptionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("cpOptionId", cpOptionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/fetch-cp-definition-option-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCpDefinitionOptionRelAsync(long cpDefinitionOptionRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionRelId", cpDefinitionOptionRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/fetch-cp-definition-option-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCpDefinitionOptionRelAsync(long cpDefinitionOptionRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionRelId", cpDefinitionOptionRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/get-cp-definition-option-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IDictionary<string, object>> GetCpDefinitionOptionRelCpDefinitionOptionValueRelIdsAsync(long cpDefinitionId, string json)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("json", json);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/get-cp-definition-option-rel-cp-definition-option-value-rel-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetCpDefinitionOptionRelKeysCpDefinitionOptionValueRelKeysAsync(long cpInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/get-cp-definition-option-rel-keys-cp-definition-option-value-rel-keys", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionOptionRelsAsync(long cpDefinitionId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionOptionRelsAsync(long cpDefinitionId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionOptionRelsAsync(long cpDefinitionId, bool skuContributor)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("skuContributor", skuContributor);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCpDefinitionOptionRelsCountAsync(long cpDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCpDefinitionOptionRelsCountAsync(long cpDefinitionId, bool skuContributor)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("skuContributor", skuContributor);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> SearchCpDefinitionOptionRelsAsync(long companyId, long groupId, long cpDefinitionId, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/search-cp-definition-option-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionOptionRelAsync(long cpDefinitionOptionRelId, long cpOptionId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string ddmFormFieldTypeName, double priority, bool facetable, bool required, bool skuContributor, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_parameters.Add("cpOptionId", cpOptionId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("ddmFormFieldTypeName", ddmFormFieldTypeName);
			_parameters.Add("priority", priority);
			_parameters.Add("facetable", facetable);
			_parameters.Add("required", required);
			_parameters.Add("skuContributor", skuContributor);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/update-cp-definition-option-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionOptionRelAsync(long cpDefinitionOptionRelId, long cpOptionId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string ddmFormFieldTypeName, double priority, bool facetable, bool required, bool skuContributor, string priceType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_parameters.Add("cpOptionId", cpOptionId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("ddmFormFieldTypeName", ddmFormFieldTypeName);
			_parameters.Add("priority", priority);
			_parameters.Add("facetable", facetable);
			_parameters.Add("required", required);
			_parameters.Add("skuContributor", skuContributor);
			_parameters.Add("priceType", priceType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionrel/update-cp-definition-option-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}