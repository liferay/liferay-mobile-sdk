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

namespace Liferay.SDK.Service.V71.Role
{
	public class RoleService : ServiceBase
	{
		public RoleService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, string keywords, IEnumerable<int> types, IDictionary<string, object> _params, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("types", types);
			_parameters.Add("params", _params);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/role/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddRoleAsync(string className, long classPK, string name, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, int type, string subtype, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("name", name);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("subtype", subtype);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/role/add-role", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRolesAsync(int type, string subtype)
		{
			var _parameters = new JsonObject();

			_parameters.Add("type", type);
			_parameters.Add("subtype", subtype);

			var _command = new JsonObject()
			{
				{ "/role/get-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRolesAsync(long companyId, IEnumerable<int> types)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("types", types);

			var _command = new JsonObject()
			{
				{ "/role/get-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetRoleAsync(long roleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);

			var _command = new JsonObject()
			{
				{ "/role/get-role", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetRoleAsync(long companyId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/role/get-role", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, string keywords, IEnumerable<int> types, IDictionary<string, object> _params)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("types", types);
			_parameters.Add("params", _params);

			var _command = new JsonObject()
			{
				{ "/role/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<bool> HasUserRolesAsync(long userId, long companyId, IEnumerable<string> names, bool inherited)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("names", names);
			_parameters.Add("inherited", inherited);

			var _command = new JsonObject()
			{
				{ "/role/has-user-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> HasUserRoleAsync(long userId, long companyId, string name, bool inherited)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("inherited", inherited);

			var _command = new JsonObject()
			{
				{ "/role/has-user-role", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<dynamic> UpdateRoleAsync(long roleId, string name, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string subtype, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);
			_parameters.Add("name", name);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("subtype", subtype);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/role/update-role", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserRolesAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/role/get-user-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> FetchRoleAsync(long roleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);

			var _command = new JsonObject()
			{
				{ "/role/fetch-role", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserGroupRolesAsync(long userId, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/role/get-user-group-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserRelatedRolesAsync(long userId, IEnumerable<object> groups)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groups", groups);

			var _command = new JsonObject()
			{
				{ "/role/get-user-related-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task DeleteRoleAsync(long roleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);

			var _command = new JsonObject()
			{
				{ "/role/delete-role", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddUserRolesAsync(long userId, IEnumerable<long> roleIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("roleIds", roleIds);

			var _command = new JsonObject()
			{
				{ "/role/add-user-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetGroupRolesAndTeamRolesAsync(long companyId, string keywords, IEnumerable<string> excludedNames, IEnumerable<int> types, long excludedTeamRoleId, long teamGroupId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("excludedNames", excludedNames);
			_parameters.Add("types", types);
			_parameters.Add("excludedTeamRoleId", excludedTeamRoleId);
			_parameters.Add("teamGroupId", teamGroupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/role/get-group-roles-and-team-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupRolesAndTeamRolesCountAsync(long companyId, string keywords, IEnumerable<string> excludedNames, IEnumerable<int> types, long excludedTeamRoleId, long teamGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("excludedNames", excludedNames);
			_parameters.Add("types", types);
			_parameters.Add("excludedTeamRoleId", excludedTeamRoleId);
			_parameters.Add("teamGroupId", teamGroupId);

			var _command = new JsonObject()
			{
				{ "/role/get-group-roles-and-team-roles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserGroupGroupRolesAsync(long userId, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/role/get-user-group-group-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task UnsetUserRolesAsync(long userId, IEnumerable<long> roleIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("roleIds", roleIds);

			var _command = new JsonObject()
			{
				{ "/role/unset-user-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetGroupRolesAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/role/get-group-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}