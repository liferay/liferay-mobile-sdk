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

namespace Liferay.SDK.Service.V73.UserGroup
{
	public class UserGroupService : ServiceBase
	{
		public UserGroupService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddUserGroupAsync(string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/usergroup/add-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateUserGroupAsync(long userGroupId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/usergroup/update-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetUserGroupAsync(long userGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetUserGroupAsync(string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserGroupsAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-user-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserGroupsAsync(long companyId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-user-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> FetchUserGroupAsync(long userGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);

			var _command = new JsonObject()
			{
				{ "/usergroup/fetch-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserUserGroupsAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-user-user-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
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

		public async Task<long> GetUserGroupsCountAsync(long companyId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-user-groups-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, string name, string description, IDictionary<string, object> _params, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("params", _params);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/usergroup/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, string keywords, IDictionary<string, object> _params)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("params", _params);

			var _command = new JsonObject()
			{
				{ "/usergroup/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
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

		public async Task<IEnumerable<dynamic>> GetGtUserGroupsAsync(long gtUserGroupId, long companyId, long parentUserGroupId, int size)
		{
			var _parameters = new JsonObject();

			_parameters.Add("gtUserGroupId", gtUserGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("parentUserGroupId", parentUserGroupId);
			_parameters.Add("size", size);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-gt-user-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, string name, string description, IDictionary<string, object> _params, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("params", _params);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/usergroup/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, string keywords, IDictionary<string, object> _params, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("params", _params);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/usergroup/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}