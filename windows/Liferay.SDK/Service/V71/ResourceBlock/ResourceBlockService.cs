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

namespace Liferay.SDK.Service.V71.ResourceBlock
{
	public class ResourceBlockService : ServiceBase
	{
		public ResourceBlockService(ISession session)
			: base(session)
		{
		}

		public async Task AddCompanyScopePermissionAsync(long scopeGroupId, long companyId, string name, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/add-company-scope-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddGroupScopePermissionAsync(long scopeGroupId, long companyId, long groupId, string name, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/add-group-scope-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddIndividualScopePermissionAsync(long companyId, long groupId, string name, long primKey, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/add-individual-scope-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RemoveAllGroupScopePermissionsAsync(long scopeGroupId, long companyId, string name, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/remove-all-group-scope-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RemoveCompanyScopePermissionAsync(long scopeGroupId, long companyId, string name, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/remove-company-scope-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RemoveGroupScopePermissionAsync(long scopeGroupId, long companyId, long groupId, string name, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/remove-group-scope-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RemoveIndividualScopePermissionAsync(long companyId, long groupId, string name, long primKey, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/remove-individual-scope-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetCompanyScopePermissionsAsync(long scopeGroupId, long companyId, string name, long roleId, IEnumerable<string> actionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionIds", actionIds);

			var _command = new JsonObject()
			{
				{ "/resourceblock/set-company-scope-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetGroupScopePermissionsAsync(long scopeGroupId, long companyId, long groupId, string name, long roleId, IEnumerable<string> actionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionIds", actionIds);

			var _command = new JsonObject()
			{
				{ "/resourceblock/set-group-scope-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetIndividualScopePermissionsAsync(long companyId, long groupId, string name, long primKey, long roleId, IEnumerable<string> actionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionIds", actionIds);

			var _command = new JsonObject()
			{
				{ "/resourceblock/set-individual-scope-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetIndividualScopePermissionsAsync(long companyId, long groupId, string name, long primKey, IDictionary<string, object> roleIdsToActionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleIdsToActionIds", roleIdsToActionIds);

			var _command = new JsonObject()
			{
				{ "/resourceblock/set-individual-scope-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}