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

namespace Liferay.SDK.Service.V73.Dispatchtrigger
{
	public class DispatchtriggerService : ServiceBase
	{
		public DispatchtriggerService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddDispatchTriggerAsync(long userId, string name, IDictionary<string, object> taskSettingsUnicodeProperties, string taskType)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("name", name);
			_parameters.Add("taskSettingsUnicodeProperties", taskSettingsUnicodeProperties);
			_parameters.Add("taskType", taskType);

			var _command = new JsonObject()
			{
				{ "/dispatch.dispatchtrigger/add-dispatch-trigger", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateDispatchTriggerAsync(long dispatchTriggerId, string name, IDictionary<string, object> taskSettingsUnicodeProperties)
		{
			var _parameters = new JsonObject();

			_parameters.Add("dispatchTriggerId", dispatchTriggerId);
			_parameters.Add("name", name);
			_parameters.Add("taskSettingsUnicodeProperties", taskSettingsUnicodeProperties);

			var _command = new JsonObject()
			{
				{ "/dispatch.dispatchtrigger/update-dispatch-trigger", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateDispatchTriggerAsync(long dispatchTriggerId, bool active, string cronExpression, int endDateMonth, int endDateDay, int endDateYear, int endDateHour, int endDateMinute, bool neverEnd, bool overlapAllowed, int startDateMonth, int startDateDay, int startDateYear, int startDateHour, int startDateMinute)
		{
			var _parameters = new JsonObject();

			_parameters.Add("dispatchTriggerId", dispatchTriggerId);
			_parameters.Add("active", active);
			_parameters.Add("cronExpression", cronExpression);
			_parameters.Add("endDateMonth", endDateMonth);
			_parameters.Add("endDateDay", endDateDay);
			_parameters.Add("endDateYear", endDateYear);
			_parameters.Add("endDateHour", endDateHour);
			_parameters.Add("endDateMinute", endDateMinute);
			_parameters.Add("neverEnd", neverEnd);
			_parameters.Add("overlapAllowed", overlapAllowed);
			_parameters.Add("startDateMonth", startDateMonth);
			_parameters.Add("startDateDay", startDateDay);
			_parameters.Add("startDateYear", startDateYear);
			_parameters.Add("startDateHour", startDateHour);
			_parameters.Add("startDateMinute", startDateMinute);

			var _command = new JsonObject()
			{
				{ "/dispatch.dispatchtrigger/update-dispatch-trigger", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetDispatchTriggersAsync(int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dispatch.dispatchtrigger/get-dispatch-triggers", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetDispatchTriggersCountAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/dispatch.dispatchtrigger/get-dispatch-triggers-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteDispatchTriggerAsync(long dispatchTriggerId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("dispatchTriggerId", dispatchTriggerId);

			var _command = new JsonObject()
			{
				{ "/dispatch.dispatchtrigger/delete-dispatch-trigger", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}