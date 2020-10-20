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

namespace Liferay.SDK.Service.V73.MDRRuleGroupInstance
{
	public class MDRRuleGroupInstanceService : ServiceBase
	{
		public MDRRuleGroupInstanceService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddRuleGroupInstanceAsync(long groupId, string className, long classPK, long ruleGroupId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("ruleGroupId", ruleGroupId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroupinstance/add-rule-group-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddRuleGroupInstanceAsync(long groupId, string className, long classPK, long ruleGroupId, int priority, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("ruleGroupId", ruleGroupId);
			_parameters.Add("priority", priority);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroupinstance/add-rule-group-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteRuleGroupInstanceAsync(long ruleGroupInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupInstanceId", ruleGroupInstanceId);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroupinstance/delete-rule-group-instance", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetRuleGroupInstancesAsync(string className, long classPK, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroupinstance/get-rule-group-instances", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetRuleGroupInstancesCountAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroupinstance/get-rule-group-instances-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateRuleGroupInstanceAsync(long ruleGroupInstanceId, int priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ruleGroupInstanceId", ruleGroupInstanceId);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/mdr.mdrrulegroupinstance/update-rule-group-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}