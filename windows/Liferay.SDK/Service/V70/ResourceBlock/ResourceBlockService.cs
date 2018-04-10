//------------------------------------------------------------------------------
// <copyright file="ResourceBlockService.cs">
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

namespace Liferay.SDK.Service.V70.ResourceBlock
{
	public class ResourceBlockService : ServiceBase
	{
		public ResourceBlockService(ISession session)
			: base(session)
		{
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