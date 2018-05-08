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

namespace Liferay.SDK.Service.V62.ResourcePermission
{
	public class ResourcePermissionService : ServiceBase
	{
		public ResourcePermissionService(ISession session)
			: base(session)
		{
		}

		public async Task AddResourcePermissionAsync(long groupId, long companyId, string name, int scope, string primKey, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("scope", scope);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourcepermission/add-resource-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RemoveResourcePermissionAsync(long groupId, long companyId, string name, int scope, string primKey, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("scope", scope);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourcepermission/remove-resource-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RemoveResourcePermissionsAsync(long groupId, long companyId, string name, int scope, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("scope", scope);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourcepermission/remove-resource-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetIndividualResourcePermissionsAsync(long groupId, long companyId, string name, string primKey, IDictionary<string, object> roleIdsToActionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleIdsToActionIds", roleIdsToActionIds);

			var _command = new JsonObject()
			{
				{ "/resourcepermission/set-individual-resource-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetIndividualResourcePermissionsAsync(long groupId, long companyId, string name, string primKey, long roleId, IEnumerable<string> actionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionIds", actionIds);

			var _command = new JsonObject()
			{
				{ "/resourcepermission/set-individual-resource-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}