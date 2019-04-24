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

namespace Liferay.SDK.Service.V72.MDRRuleGroup
{
	public class MDRRuleGroupService : ServiceBase
	{
		public MDRRuleGroupService(ISession session)
			: base(session)
		{
		}

		public async Task DeleteRuleGroupAsync(long ruleGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupId", ruleGroupId);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroup/delete-rule-group", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> CopyRuleGroupAsync(long ruleGroupId, long groupId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupId", ruleGroupId);
			_parameters.Add("groupId", groupId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroup/copy-rule-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddRuleGroupAsync(long groupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroup/add-rule-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchRuleGroupAsync(long ruleGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupId", ruleGroupId);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroup/fetch-rule-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRuleGroupsAsync(IEnumerable<long> groupIds, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroup/get-rule-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetRuleGroupsCountAsync(IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroup/get-rule-groups-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateRuleGroupAsync(long ruleGroupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupId", ruleGroupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroup/update-rule-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetRuleGroupAsync(long ruleGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupId", ruleGroupId);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroup/get-rule-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}