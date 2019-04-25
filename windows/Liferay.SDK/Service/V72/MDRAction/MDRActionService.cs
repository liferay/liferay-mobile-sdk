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

namespace Liferay.SDK.Service.V72.MDRAction
{
	public class MDRActionService : ServiceBase
	{
		public MDRActionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateActionAsync(long actionId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, string typeSettings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("actionId", actionId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("typeSettings", typeSettings);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdr.mdraction/update-action", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateActionAsync(long actionId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, IDictionary<string, object> typeSettingsProperties, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("actionId", actionId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("typeSettingsProperties", typeSettingsProperties);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdr.mdraction/update-action", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteActionAsync(long actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/mdr.mdraction/delete-action", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchActionAsync(long actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/mdr.mdraction/fetch-action", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetActionAsync(long actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/mdr.mdraction/get-action", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddActionAsync(long ruleGroupInstanceId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, string typeSettings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupInstanceId", ruleGroupInstanceId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("typeSettings", typeSettings);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdr.mdraction/add-action", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddActionAsync(long ruleGroupInstanceId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, IDictionary<string, object> typeSettingsProperties, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupInstanceId", ruleGroupInstanceId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("typeSettingsProperties", typeSettingsProperties);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdr.mdraction/add-action", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}