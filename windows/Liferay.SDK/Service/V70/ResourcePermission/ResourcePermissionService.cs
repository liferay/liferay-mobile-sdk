//------------------------------------------------------------------------------
// <copyright file="ResourcePermissionService.cs">
//    Copyright (c) 2014-present Andrea Di Giorgi
//
//    Permission is hereby granted, free of charge, to any person obtaining a
//    copy of this software and associated documentation files (the "Software"),
//    to deal in the Software without restriction, including without limitation
//    the rights to use, copy, modify, merge, publish, distribute, sublicense,
//    and/or sell copies of the Software, and to permit persons to whom the
//    Software is furnished to do so, subject to the following conditions:
//
//    The above copyright notice and this permission notice shall be included in
//    all copies or substantial portions of the Software.
//
//    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
//    THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
//    FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
//    DEALINGS IN THE SOFTWARE.
// </copyright>
// <author>Andrea Di Giorgi</author>
// <website>https://github.com/Ithildir/liferay-sdk-builder-windows</website>
//------------------------------------------------------------------------------

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Liferay.SDK.Service.V70.ResourcePermission
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
	}
}