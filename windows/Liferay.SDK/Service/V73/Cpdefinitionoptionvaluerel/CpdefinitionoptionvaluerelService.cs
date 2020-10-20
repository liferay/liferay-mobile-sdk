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

namespace Liferay.SDK.Service.V73.Cpdefinitionoptionvaluerel
{
	public class CpdefinitionoptionvaluerelService : ServiceBase
	{
		public CpdefinitionoptionvaluerelService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionOptionValueRelsAsync(long cpDefinitionOptionRelId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionOptionValueRelsAsync(long cpDefinitionOptionRelId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionOptionValueRelsAsync(long groupId, string key, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("key", key);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> FetchCpDefinitionOptionValueRelAsync(long cpDefinitionOptionValueRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/fetch-cp-definition-option-value-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCpDefinitionOptionValueRelAsync(long cpDefinitionOptionRelId, string key)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_parameters.Add("key", key);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/fetch-cp-definition-option-value-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionOptionValueRelAsync(long cpDefinitionOptionValueRelId, IDictionary<string, string> nameMap, double priority, string key, long cpInstanceId, int quantity, IDictionary<string, object> price, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("priority", priority);
			_parameters.Add("key", key);
			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("quantity", quantity);
			_parameters.Add("price", price);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/update-cp-definition-option-value-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionOptionValueRelAsync(long cpDefinitionOptionValueRelId, IDictionary<string, string> nameMap, double priority, string key, long cpInstanceId, int quantity, bool preselected, IDictionary<string, object> price, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("priority", priority);
			_parameters.Add("key", key);
			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("quantity", quantity);
			_parameters.Add("preselected", preselected);
			_parameters.Add("price", price);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/update-cp-definition-option-value-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionOptionValueRelAsync(long cpDefinitionOptionValueRelId, IDictionary<string, string> nameMap, double priority, string key, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("priority", priority);
			_parameters.Add("key", key);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/update-cp-definition-option-value-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpDefinitionOptionValueRelAsync(long cpDefinitionOptionRelId, IDictionary<string, string> nameMap, double priority, string key, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("priority", priority);
			_parameters.Add("key", key);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/add-cp-definition-option-value-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteCpDefinitionOptionValueRelAsync(long cpDefinitionOptionValueRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/delete-cp-definition-option-value-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetCpDefinitionOptionValueRelsCountAsync(long cpDefinitionOptionRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionRelId", cpDefinitionOptionRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> ResetCpInstanceCpDefinitionOptionValueRelAsync(long cpDefinitionOptionValueRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/reset-cp-instance-cp-definition-option-value-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCpDefinitionOptionValueRelsAsync(long companyId, long groupId, long cpDefinitionOptionRelId, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/search-cp-definition-option-value-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionOptionValueRelPreselectedAsync(long cpDefinitionOptionValueRelId, bool preselected)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);
			_parameters.Add("preselected", preselected);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/update-cp-definition-option-value-rel-preselected", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCpDefinitionOptionValueRelAsync(long cpDefinitionOptionValueRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}