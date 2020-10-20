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

namespace Liferay.SDK.Service.V73.Cpdefinitionspecificationoptionvalue
{
	public class CpdefinitionspecificationoptionvalueService : ServiceBase
	{
		public CpdefinitionspecificationoptionvalueService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCpDefinitionSpecificationOptionValueAsync(long cpDefinitionId, long cpSpecificationOptionId, long cpOptionCategoryId, IDictionary<string, string> valueMap, double priority, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("cpSpecificationOptionId", cpSpecificationOptionId);
			_parameters.Add("cpOptionCategoryId", cpOptionCategoryId);
			_parameters.Add("valueMap", valueMap);
			_parameters.Add("priority", priority);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionspecificationoptionvalue/add-cp-definition-specification-option-value", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCpDefinitionSpecificationOptionValueAsync(long cpDefinitionSpecificationOptionValueId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionSpecificationOptionValueId", cpDefinitionSpecificationOptionValueId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionspecificationoptionvalue/delete-cp-definition-specification-option-value", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCpDefinitionSpecificationOptionValueAsync(long cpDefinitionSpecificationOptionValueId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionSpecificationOptionValueId", cpDefinitionSpecificationOptionValueId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionspecificationoptionvalue/fetch-cp-definition-specification-option-value", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionSpecificationOptionValuesAsync(long cpDefinitionId, long cpOptionCategoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("cpOptionCategoryId", cpOptionCategoryId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionspecificationoptionvalue/get-cp-definition-specification-option-values", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionSpecificationOptionValuesAsync(long cpDefinitionId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionspecificationoptionvalue/get-cp-definition-specification-option-values", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCpDefinitionSpecificationOptionValuesCountAsync(long cpDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionspecificationoptionvalue/get-cp-definition-specification-option-values-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionSpecificationOptionValueAsync(long cpDefinitionSpecificationOptionValueId, long cpOptionCategoryId, IDictionary<string, string> valueMap, double priority, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionSpecificationOptionValueId", cpDefinitionSpecificationOptionValueId);
			_parameters.Add("cpOptionCategoryId", cpOptionCategoryId);
			_parameters.Add("valueMap", valueMap);
			_parameters.Add("priority", priority);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionspecificationoptionvalue/update-cp-definition-specification-option-value", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCpDefinitionSpecificationOptionValueAsync(long cpDefinitionSpecificationOptionValueId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionSpecificationOptionValueId", cpDefinitionSpecificationOptionValueId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionspecificationoptionvalue/get-cp-definition-specification-option-value", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}