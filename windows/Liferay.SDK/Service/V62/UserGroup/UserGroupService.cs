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

namespace Liferay.SDK.Service.V62.UserGroup
{
	public class UserGroupService : ServiceBase
	{
		public UserGroupService(ISession session)
			: base(session)
		{
		}

		public async Task AddGroupUserGroupsAsync(long groupId, IEnumerable<long> userGroupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userGroupIds", userGroupIds);

			var _command = new JsonObject()
			{
				{ "/usergroup/add-group-user-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddTeamUserGroupsAsync(long teamId, IEnumerable<long> userGroupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("teamId", teamId);
			_parameters.Add("userGroupIds", userGroupIds);

			var _command = new JsonObject()
			{
				{ "/usergroup/add-team-user-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> AddUserGroupAsync(string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/usergroup/add-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> AddUserGroupAsync(string name, string description, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/usergroup/add-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task DeleteUserGroupAsync(long userGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);

			var _command = new JsonObject()
			{
				{ "/usergroup/delete-user-group", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> GetUserGroupAsync(string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserGroupAsync(long userGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserUserGroupsAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-user-user-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task UnsetGroupUserGroupsAsync(long groupId, IEnumerable<long> userGroupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userGroupIds", userGroupIds);

			var _command = new JsonObject()
			{
				{ "/usergroup/unset-group-user-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsetTeamUserGroupsAsync(long teamId, IEnumerable<long> userGroupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("teamId", teamId);
			_parameters.Add("userGroupIds", userGroupIds);

			var _command = new JsonObject()
			{
				{ "/usergroup/unset-team-user-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> UpdateUserGroupAsync(long userGroupId, string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/usergroup/update-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateUserGroupAsync(long userGroupId, string name, string description, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/usergroup/update-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}