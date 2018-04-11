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

namespace Liferay.SDK.Service.V62.Group
{
	public class GroupService : ServiceBase
	{
		public GroupService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddGroupAsync(long parentGroupId, long liveGroupId, string name, string description, int type, bool manualMembership, int membershipRestriction, string friendlyURL, bool site, bool active, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("liveGroupId", liveGroupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("manualMembership", manualMembership);
			_parameters.Add("membershipRestriction", membershipRestriction);
			_parameters.Add("friendlyURL", friendlyURL);
			_parameters.Add("site", site);
			_parameters.Add("active", active);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/group/add-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> AddGroupAsync(string name, string description, int type, string friendlyURL, bool site, bool active, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("friendlyURL", friendlyURL);
			_parameters.Add("site", site);
			_parameters.Add("active", active);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/group/add-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> AddGroupAsync(long parentGroupId, string name, string description, int type, string friendlyURL, bool site, bool active, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("friendlyURL", friendlyURL);
			_parameters.Add("site", site);
			_parameters.Add("active", active);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/group/add-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task AddRoleGroupsAsync(long roleId, IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);
			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/group/add-role-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task CheckRemoteStagingGroupAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/group/check-remote-staging-group", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteGroupAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/group/delete-group", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DisableStagingAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/group/disable-staging", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task EnableStagingAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/group/enable-staging", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> GetCompanyGroupAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/group/get-company-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetGroupAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/group/get-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetGroupAsync(long companyId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/group/get-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetGroupsAsync(long companyId, long parentGroupId, bool site)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("site", site);

			var _command = new JsonObject()
			{
				{ "/group/get-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetManageableSiteGroupsAsync(IDictionary<string, object> portlets, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("portlets", portlets);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/group/get-manageable-site-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetManageableSitesAsync(IDictionary<string, object> portlets, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("portlets", portlets);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/group/get-manageable-sites", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetOrganizationsGroupsAsync(IEnumerable<object> organizations)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizations", organizations);

			var _command = new JsonObject()
			{
				{ "/group/get-organizations-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserGroupAsync(long companyId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/group/get-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserGroupsGroupsAsync(IEnumerable<object> userGroups)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroups", userGroups);

			var _command = new JsonObject()
			{
				{ "/group/get-user-groups-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserOrganizationsGroupsAsync(long userId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/group/get-user-organizations-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserPlacesAsync(IEnumerable<string> classNames, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNames", classNames);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/group/get-user-places", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserPlacesAsync(long userId, IEnumerable<string> classNames, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("classNames", classNames);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/group/get-user-places", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserPlacesAsync(long userId, IEnumerable<string> classNames, bool includeControlPanel, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("classNames", classNames);
			_parameters.Add("includeControlPanel", includeControlPanel);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/group/get-user-places", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> GetUserPlacesCountAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/group/get-user-places-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserSitesAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/group/get-user-sites", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserSitesGroupsAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/group/get-user-sites-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserSitesGroupsAsync(IEnumerable<string> classNames, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNames", classNames);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/group/get-user-sites-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserSitesGroupsAsync(long userId, IEnumerable<string> classNames, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("classNames", classNames);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/group/get-user-sites-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserSitesGroupsAsync(long userId, IEnumerable<string> classNames, bool includeControlPanel, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("classNames", classNames);
			_parameters.Add("includeControlPanel", includeControlPanel);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/group/get-user-sites-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> GetUserSitesGroupsCountAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/group/get-user-sites-groups-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<bool> HasUserGroupAsync(long userId, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/group/has-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long companyId, string name, string description, IEnumerable<string> _params, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("params", _params);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/group/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long companyId, IEnumerable<long> classNameIds, string keywords, IDictionary<string, object> _params, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("params", _params);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/group/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long companyId, IEnumerable<long> classNameIds, string name, string description, IDictionary<string, object> _params, bool andOperator, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("params", _params);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/group/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, string name, string description, IEnumerable<string> _params)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("params", _params);

			var _command = new JsonObject()
			{
				{ "/group/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task SetRoleGroupsAsync(long roleId, IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);
			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/group/set-role-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsetRoleGroupsAsync(long roleId, IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);
			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/group/unset-role-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> UpdateFriendlyUrlAsync(long groupId, string friendlyURL)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("friendlyURL", friendlyURL);

			var _command = new JsonObject()
			{
				{ "/group/update-friendly-url", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateGroupAsync(long groupId, long parentGroupId, string name, string description, int type, bool manualMembership, int membershipRestriction, string friendlyURL, bool active, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("manualMembership", manualMembership);
			_parameters.Add("membershipRestriction", membershipRestriction);
			_parameters.Add("friendlyURL", friendlyURL);
			_parameters.Add("active", active);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/group/update-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateGroupAsync(long groupId, string typeSettings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("typeSettings", typeSettings);

			var _command = new JsonObject()
			{
				{ "/group/update-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task UpdateStagedPortletsAsync(long groupId, IDictionary<string, string> stagedPortletIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("stagedPortletIds", stagedPortletIds);

			var _command = new JsonObject()
			{
				{ "/group/update-staged-portlets", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}