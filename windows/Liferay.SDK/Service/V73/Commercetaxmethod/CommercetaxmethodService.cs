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

namespace Liferay.SDK.Service.V73.Commercetaxmethod
{
	public class CommercetaxmethodService : ServiceBase
	{
		public CommercetaxmethodService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> SetActiveAsync(long commerceTaxMethodId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxmethod/set-active", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceTaxMethodAsync(IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string engineKey, bool percentage, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("engineKey", engineKey);
			_parameters.Add("percentage", percentage);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxmethod/add-commerce-tax-method", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceTaxMethodAsync(long userId, long groupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string engineKey, bool percentage, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("engineKey", engineKey);
			_parameters.Add("percentage", percentage);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxmethod/add-commerce-tax-method", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> CreateCommerceTaxMethodAsync(long groupId, long commerceTaxMethodId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxmethod/create-commerce-tax-method", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceTaxMethodAsync(long commerceTaxMethodId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxmethod/get-commerce-tax-method", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceTaxMethodAsync(long groupId, string engineKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("engineKey", engineKey);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxmethod/fetch-commerce-tax-method", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceTaxMethodsAsync(long groupId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxmethod/get-commerce-tax-methods", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceTaxMethodsAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxmethod/get-commerce-tax-methods", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateCommerceTaxMethodAsync(long commerceTaxMethodId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool percentage, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("percentage", percentage);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxmethod/update-commerce-tax-method", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceTaxMethodAsync(long commerceTaxMethodId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxmethod/delete-commerce-tax-method", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}