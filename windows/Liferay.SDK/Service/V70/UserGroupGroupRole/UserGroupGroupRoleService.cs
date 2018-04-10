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

namespace Liferay.SDK.Service.V70.UserGroupGroupRole
{
	public class UserGroupGroupRoleService : ServiceBase
	{
		public UserGroupGroupRoleService(ISession session)
			: base(session)
		{
		}

		public async Task AddUserGroupGroupRolesAsync(IEnumerable<long> userGroupIds, long groupId, long roleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupIds", userGroupIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("roleId", roleId);

			var _command = new JsonObject()
			{
				{ "/usergroupgrouprole/add-user-group-group-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddUserGroupGroupRolesAsync(long userGroupId, long groupId, IEnumerable<long> roleIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("roleIds", roleIds);

			var _command = new JsonObject()
			{
				{ "/usergroupgrouprole/add-user-group-group-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteUserGroupGroupRolesAsync(IEnumerable<long> userGroupIds, long groupId, long roleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupIds", userGroupIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("roleId", roleId);

			var _command = new JsonObject()
			{
				{ "/usergroupgrouprole/delete-user-group-group-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteUserGroupGroupRolesAsync(long userGroupId, long groupId, IEnumerable<long> roleIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("roleIds", roleIds);

			var _command = new JsonObject()
			{
				{ "/usergroupgrouprole/delete-user-group-group-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}