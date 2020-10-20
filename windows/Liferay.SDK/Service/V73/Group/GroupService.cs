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

namespace Liferay.SDK.Service.V73.Group
{
	public class GroupService : ServiceBase
	{
		public GroupService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetUserGroupAsync(long companyId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/group/get-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateGroupAsync(long groupId, string typeSettings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("typeSettings", typeSettings);

			var _command = new JsonObject()
			{
				{ "/group/update-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateGroupAsync(long groupId, long parentGroupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, int type, bool manualMembership, int membershipRestriction, string friendlyURL, bool inheritContent, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("manualMembership", manualMembership);
			_parameters.Add("membershipRestriction", membershipRestriction);
			_parameters.Add("friendlyURL", friendlyURL);
			_parameters.Add("inheritContent", inheritContent);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/group/update-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserSitesGroupsAsync(long userId, IEnumerable<string> classNames, int max)
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

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserSitesGroupsAsync(IEnumerable<string> classNames, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNames", classNames);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/group/get-user-sites-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserSitesGroupsAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/group/get-user-sites-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserSitesGroupsAsync(long userId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/group/get-user-sites-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetCompanyGroupAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/group/get-company-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
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

		public async Task<IEnumerable<dynamic>> GetOrganizationsGroupsAsync(IEnumerable<object> organizations)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizations", organizations);

			var _command = new JsonObject()
			{
				{ "/group/get-organizations-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserGroupsGroupsAsync(IEnumerable<object> userGroups)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroups", userGroups);

			var _command = new JsonObject()
			{
				{ "/group/get-user-groups-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserOrganizationsGroupsAsync(long userId, int start, int end)
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

			return (IEnumerable<dynamic>)_obj;
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

		public async Task<dynamic> UpdateFriendlyUrlAsync(long groupId, string friendlyURL)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("friendlyURL", friendlyURL);

			var _command = new JsonObject()
			{
				{ "/group/update-friendly-url", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
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

		public async Task<string> GetGroupDisplayUrlAsync(long groupId, bool privateLayout, bool secureConnection)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("secureConnection", secureConnection);

			var _command = new JsonObject()
			{
				{ "/group/get-group-display-url", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
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

		public async Task<IEnumerable<dynamic>> GetGtGroupsAsync(long gtGroupId, long companyId, long parentGroupId, bool site, int size)
		{
			var _parameters = new JsonObject();

			_parameters.Add("gtGroupId", gtGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("site", site);
			_parameters.Add("size", size);

			var _command = new JsonObject()
			{
				{ "/group/get-gt-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetManageableSiteGroupsAsync(IEnumerable<object> portlets, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("portlets", portlets);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/group/get-manageable-site-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
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

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> classNameIds, string keywords, IDictionary<string, object> _params)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("params", _params);

			var _command = new JsonObject()
			{
				{ "/group/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupsCountAsync(long companyId, long parentGroupId, string name, bool site)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("name", name);
			_parameters.Add("site", site);

			var _command = new JsonObject()
			{
				{ "/group/get-groups-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupsCountAsync(long companyId, long parentGroupId, bool site)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("site", site);

			var _command = new JsonObject()
			{
				{ "/group/get-groups-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupsCountAsync(long companyId, string className, long parentGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("parentGroupId", parentGroupId);

			var _command = new JsonObject()
			{
				{ "/group/get-groups-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, string name, string description, IEnumerable<string> _params, int start, int end)
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

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> classNameIds, string keywords, IDictionary<string, object> _params, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("params", _params);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/group/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> classNameIds, string name, string description, IDictionary<string, object> _params, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator)
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
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/group/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupsAsync(long companyId, long parentGroupId, bool site)
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

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupsAsync(long companyId, long parentGroupId, bool site, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("site", site);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/group/get-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupsAsync(long companyId, long parentGroupId, string name, bool site, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("name", name);
			_parameters.Add("site", site);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/group/get-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetGroupAsync(long companyId, string groupKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupKey", groupKey);

			var _command = new JsonObject()
			{
				{ "/group/get-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetGroupAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/group/get-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddGroupAsync(long parentGroupId, long liveGroupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, int type, bool manualMembership, int membershipRestriction, string friendlyURL, bool site, bool inheritContent, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("liveGroupId", liveGroupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("manualMembership", manualMembership);
			_parameters.Add("membershipRestriction", membershipRestriction);
			_parameters.Add("friendlyURL", friendlyURL);
			_parameters.Add("site", site);
			_parameters.Add("inheritContent", inheritContent);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/group/add-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddGroupAsync(long parentGroupId, long liveGroupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, int type, bool manualMembership, int membershipRestriction, string friendlyURL, bool site, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("liveGroupId", liveGroupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("manualMembership", manualMembership);
			_parameters.Add("membershipRestriction", membershipRestriction);
			_parameters.Add("friendlyURL", friendlyURL);
			_parameters.Add("site", site);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/group/add-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}