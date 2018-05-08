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

namespace Liferay.SDK.Service.V62.MDRRuleGroup
{
	public class MDRRuleGroupService : ServiceBase
	{
		public MDRRuleGroupService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddRuleGroupAsync(long groupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdrrulegroup/add-rule-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> CopyRuleGroupAsync(long ruleGroupId, long groupId, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupId", ruleGroupId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdrrulegroup/copy-rule-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task DeleteRuleGroupAsync(long ruleGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupId", ruleGroupId);

			var _command = new JsonObject()
			{
				{ "/mdrrulegroup/delete-rule-group", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> FetchRuleGroupAsync(long ruleGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupId", ruleGroupId);

			var _command = new JsonObject()
			{
				{ "/mdrrulegroup/fetch-rule-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetRuleGroupAsync(long ruleGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupId", ruleGroupId);

			var _command = new JsonObject()
			{
				{ "/mdrrulegroup/get-rule-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateRuleGroupAsync(long ruleGroupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupId", ruleGroupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdrrulegroup/update-rule-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}