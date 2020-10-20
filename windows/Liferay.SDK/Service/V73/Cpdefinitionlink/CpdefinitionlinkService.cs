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

namespace Liferay.SDK.Service.V73.Cpdefinitionlink
{
	public class CpdefinitionlinkService : ServiceBase
	{
		public CpdefinitionlinkService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCpDefinitionLinkAsync(long cpDefinitionId, long cProductId, double priority, string type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("cProductId", cProductId);
			_parameters.Add("priority", priority);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionlink/add-cp-definition-link", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCpDefinitionLinkAsync(long cpDefinitionLinkId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionLinkId", cpDefinitionLinkId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionlink/delete-cp-definition-link", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionLinksAsync(long cpDefinitionId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionlink/get-cp-definition-links", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionLinksAsync(long cpDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionlink/get-cp-definition-links", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionLinksAsync(long cpDefinitionId, string type, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("type", type);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionlink/get-cp-definition-links", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionLinksAsync(long cpDefinitionId, string type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionlink/get-cp-definition-links", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCpDefinitionLinksCountAsync(long cpDefinitionId, string type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionlink/get-cp-definition-links-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCpDefinitionLinksCountAsync(long cpDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionlink/get-cp-definition-links-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionLinkAsync(long cpDefinitionLinkId, double priority, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionLinkId", cpDefinitionLinkId);
			_parameters.Add("priority", priority);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionlink/update-cp-definition-link", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateCpDefinitionLinksAsync(long cpDefinitionId, IEnumerable<long> cpDefinitionIds2, string type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("cpDefinitionIds2", cpDefinitionIds2);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionlink/update-cp-definition-links", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCpDefinitionLinkAsync(long cpDefinitionLinkId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionLinkId", cpDefinitionLinkId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionlink/fetch-cp-definition-link", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCpDefinitionLinkAsync(long cpDefinitionLinkId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionLinkId", cpDefinitionLinkId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionlink/get-cp-definition-link", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}