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

namespace Liferay.SDK.Service.V73.BackgroundTask
{
	public class BackgroundTaskService : ServiceBase
	{
		public BackgroundTaskService(ISession session)
			: base(session)
		{
		}

		public async Task<long> GetBackgroundTasksCountAsync(long groupId, string name, string taskExecutorClassName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("taskExecutorClassName", taskExecutorClassName);

			var _command = new JsonObject()
			{
				{ "/backgroundtask.backgroundtask/get-background-tasks-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetBackgroundTasksCountAsync(long groupId, string taskExecutorClassName, bool completed)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("taskExecutorClassName", taskExecutorClassName);
			_parameters.Add("completed", completed);

			var _command = new JsonObject()
			{
				{ "/backgroundtask.backgroundtask/get-background-tasks-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<string> GetBackgroundTaskStatusJsonAsync(long backgroundTaskId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("backgroundTaskId", backgroundTaskId);

			var _command = new JsonObject()
			{
				{ "/backgroundtask.backgroundtask/get-background-task-status-json", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}
	}
}