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

namespace Liferay.SDK.Service.V62.MDRRule
{
	public class MDRRuleService : ServiceBase
	{
		public MDRRuleService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddRuleAsync(long ruleGroupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, string typeSettings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupId", ruleGroupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("typeSettings", typeSettings);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdrrule/add-rule", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteRuleAsync(long ruleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleId", ruleId);

			var _command = new JsonObject()
			{
				{ "/mdrrule/delete-rule", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchRuleAsync(long ruleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleId", ruleId);

			var _command = new JsonObject()
			{
				{ "/mdrrule/fetch-rule", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetRuleAsync(long ruleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleId", ruleId);

			var _command = new JsonObject()
			{
				{ "/mdrrule/get-rule", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateRuleAsync(long ruleId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, string typeSettings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleId", ruleId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("typeSettings", typeSettings);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdrrule/update-rule", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateRuleAsync(long ruleId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, JsonObjectWrapper typeSettingsProperties, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleId", ruleId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "typeSettingsProperties", "com.liferay.portal.kernel.util.UnicodeProperties", typeSettingsProperties);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdrrule/update-rule", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}