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

namespace Liferay.SDK.Service.V62.SocialActivitySetting
{
	public class SocialActivitySettingService : ServiceBase
	{
		public SocialActivitySettingService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> GetActivityDefinitionAsync(long groupId, string className, int activityType)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("activityType", activityType);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/get-activity-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetActivityDefinitionsAsync(long groupId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/get-activity-definitions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetActivitySettingsAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/get-activity-settings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetJsonActivityDefinitionsAsync(long groupId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/get-json-activity-definitions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task UpdateActivitySettingAsync(long groupId, string className, bool enabled)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("enabled", enabled);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/update-activity-setting", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateActivitySettingAsync(long groupId, string className, int activityType, IDictionary<string, object> activityCounterDefinition)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("activityType", activityType);
			_parameters.Add("activityCounterDefinition", activityCounterDefinition);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/update-activity-setting", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateActivitySettingsAsync(long groupId, string className, int activityType, IEnumerable<object> activityCounterDefinitions)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("activityType", activityType);
			_parameters.Add("activityCounterDefinitions", activityCounterDefinitions);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/update-activity-settings", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}