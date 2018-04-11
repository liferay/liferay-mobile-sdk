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

namespace Liferay.SDK.Service.V62.Organization
{
	public class OrganizationService : ServiceBase
	{
		public OrganizationService(ISession session)
			: base(session)
		{
		}

		public async Task AddGroupOrganizationsAsync(long groupId, IEnumerable<long> organizationIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("organizationIds", organizationIds);

			var _command = new JsonObject()
			{
				{ "/organization/add-group-organizations", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> AddOrganizationAsync(long parentOrganizationId, string name, string type, bool recursable, long regionId, long countryId, int statusId, string comments, bool site, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("recursable", recursable);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("statusId", statusId);
			_parameters.Add("comments", comments);
			_parameters.Add("site", site);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/add-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> AddOrganizationAsync(long parentOrganizationId, string name, string type, long regionId, long countryId, int statusId, string comments, bool site, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> orgLabors, IEnumerable<object> phones, IEnumerable<object> websites, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("statusId", statusId);
			_parameters.Add("comments", comments);
			_parameters.Add("site", site);
			_parameters.Add("addresses", addresses);
			_parameters.Add("emailAddresses", emailAddresses);
			_parameters.Add("orgLabors", orgLabors);
			_parameters.Add("phones", phones);
			_parameters.Add("websites", websites);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/add-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> AddOrganizationAsync(long parentOrganizationId, string name, string type, bool recursable, long regionId, long countryId, int statusId, string comments, bool site, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> orgLabors, IEnumerable<object> phones, IEnumerable<object> websites, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("recursable", recursable);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("statusId", statusId);
			_parameters.Add("comments", comments);
			_parameters.Add("site", site);
			_parameters.Add("addresses", addresses);
			_parameters.Add("emailAddresses", emailAddresses);
			_parameters.Add("orgLabors", orgLabors);
			_parameters.Add("phones", phones);
			_parameters.Add("websites", websites);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/add-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> AddOrganizationAsync(long parentOrganizationId, string name, string type, long regionId, long countryId, int statusId, string comments, bool site, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("statusId", statusId);
			_parameters.Add("comments", comments);
			_parameters.Add("site", site);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/add-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task AddPasswordPolicyOrganizationsAsync(long passwordPolicyId, IEnumerable<long> organizationIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("passwordPolicyId", passwordPolicyId);
			_parameters.Add("organizationIds", organizationIds);

			var _command = new JsonObject()
			{
				{ "/organization/add-password-policy-organizations", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteLogoAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/organization/delete-logo", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteOrganizationAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/organization/delete-organization", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> GetManageableOrganizationsAsync(string actionId, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("actionId", actionId);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/organization/get-manageable-organizations", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetOrganizationAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/organization/get-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> GetOrganizationIdAsync(long companyId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/organization/get-organization-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IDictionary<string, object>> GetOrganizationsAsync(long companyId, long parentOrganizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);

			var _command = new JsonObject()
			{
				{ "/organization/get-organizations", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetOrganizationsAsync(long companyId, long parentOrganizationId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/organization/get-organizations", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> GetOrganizationsCountAsync(long companyId, long parentOrganizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);

			var _command = new JsonObject()
			{
				{ "/organization/get-organizations-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IDictionary<string, object>> GetUserOrganizationsAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/organization/get-user-organizations", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task SetGroupOrganizationsAsync(long groupId, IEnumerable<long> organizationIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("organizationIds", organizationIds);

			var _command = new JsonObject()
			{
				{ "/organization/set-group-organizations", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsetGroupOrganizationsAsync(long groupId, IEnumerable<long> organizationIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("organizationIds", organizationIds);

			var _command = new JsonObject()
			{
				{ "/organization/unset-group-organizations", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsetPasswordPolicyOrganizationsAsync(long passwordPolicyId, IEnumerable<long> organizationIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("passwordPolicyId", passwordPolicyId);
			_parameters.Add("organizationIds", organizationIds);

			var _command = new JsonObject()
			{
				{ "/organization/unset-password-policy-organizations", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> UpdateOrganizationAsync(long organizationId, long parentOrganizationId, string name, string type, long regionId, long countryId, int statusId, string comments, bool site, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("statusId", statusId);
			_parameters.Add("comments", comments);
			_parameters.Add("site", site);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/update-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateOrganizationAsync(long organizationId, long parentOrganizationId, string name, string type, bool recursable, long regionId, long countryId, int statusId, string comments, bool site, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("recursable", recursable);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("statusId", statusId);
			_parameters.Add("comments", comments);
			_parameters.Add("site", site);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/update-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateOrganizationAsync(long organizationId, long parentOrganizationId, string name, string type, long regionId, long countryId, int statusId, string comments, bool site, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> orgLabors, IEnumerable<object> phones, IEnumerable<object> websites, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("statusId", statusId);
			_parameters.Add("comments", comments);
			_parameters.Add("site", site);
			_parameters.Add("addresses", addresses);
			_parameters.Add("emailAddresses", emailAddresses);
			_parameters.Add("orgLabors", orgLabors);
			_parameters.Add("phones", phones);
			_parameters.Add("websites", websites);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/update-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateOrganizationAsync(long organizationId, long parentOrganizationId, string name, string type, bool recursable, long regionId, long countryId, int statusId, string comments, bool site, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> orgLabors, IEnumerable<object> phones, IEnumerable<object> websites, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("recursable", recursable);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("statusId", statusId);
			_parameters.Add("comments", comments);
			_parameters.Add("site", site);
			_parameters.Add("addresses", addresses);
			_parameters.Add("emailAddresses", emailAddresses);
			_parameters.Add("orgLabors", orgLabors);
			_parameters.Add("phones", phones);
			_parameters.Add("websites", websites);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/update-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}