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

namespace Liferay.SDK.Service.V72.Tasksentry
{
	public class TasksentryService : ServiceBase
	{
		public TasksentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetTasksEntryAsync(long tasksEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tasksEntryId", tasksEntryId);

			var _command = new JsonObject()
			{
				{ "/tasks-portlet.tasksentry/get-tasks-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteTasksEntryAsync(long tasksEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tasksEntryId", tasksEntryId);

			var _command = new JsonObject()
			{
				{ "/tasks-portlet.tasksentry/delete-tasks-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateTasksEntryStatusAsync(long tasksEntryId, long resolverUserId, int status, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tasksEntryId", tasksEntryId);
			_parameters.Add("resolverUserId", resolverUserId);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/tasks-portlet.tasksentry/update-tasks-entry-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddTasksEntryAsync(string title, int priority, long assigneeUserId, int dueDateMonth, int dueDateDay, int dueDateYear, int dueDateHour, int dueDateMinute, bool neverDue, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("title", title);
			_parameters.Add("priority", priority);
			_parameters.Add("assigneeUserId", assigneeUserId);
			_parameters.Add("dueDateMonth", dueDateMonth);
			_parameters.Add("dueDateDay", dueDateDay);
			_parameters.Add("dueDateYear", dueDateYear);
			_parameters.Add("dueDateHour", dueDateHour);
			_parameters.Add("dueDateMinute", dueDateMinute);
			_parameters.Add("neverDue", neverDue);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/tasks-portlet.tasksentry/add-tasks-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateTasksEntryAsync(long tasksEntryId, string title, int priority, long assigneeUserId, long resolverUserId, int dueDateMonth, int dueDateDay, int dueDateYear, int dueDateHour, int dueDateMinute, bool neverDue, int status, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tasksEntryId", tasksEntryId);
			_parameters.Add("title", title);
			_parameters.Add("priority", priority);
			_parameters.Add("assigneeUserId", assigneeUserId);
			_parameters.Add("resolverUserId", resolverUserId);
			_parameters.Add("dueDateMonth", dueDateMonth);
			_parameters.Add("dueDateDay", dueDateDay);
			_parameters.Add("dueDateYear", dueDateYear);
			_parameters.Add("dueDateHour", dueDateHour);
			_parameters.Add("dueDateMinute", dueDateMinute);
			_parameters.Add("neverDue", neverDue);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/tasks-portlet.tasksentry/update-tasks-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}