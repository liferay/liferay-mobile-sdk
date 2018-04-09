//------------------------------------------------------------------------------
// <copyright file="OrganizationService.cs">
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

		public async Task<dynamic> AddOrganizationAsync(long parentOrganizationId, string name, string type, bool recursable, long regionId, long countryId, int statusId, string comments, bool site, JsonObjectWrapper serviceContext)
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
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/add-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddOrganizationAsync(long parentOrganizationId, string name, string type, long regionId, long countryId, int statusId, string comments, bool site, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> orgLabors, IEnumerable<object> phones, IEnumerable<object> websites, JsonObjectWrapper serviceContext)
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
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/add-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddOrganizationAsync(long parentOrganizationId, string name, string type, bool recursable, long regionId, long countryId, int statusId, string comments, bool site, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> orgLabors, IEnumerable<object> phones, IEnumerable<object> websites, JsonObjectWrapper serviceContext)
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
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/add-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddOrganizationAsync(long parentOrganizationId, string name, string type, long regionId, long countryId, int statusId, string comments, bool site, JsonObjectWrapper serviceContext)
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
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/add-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
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

		public async Task<IEnumerable<dynamic>> GetManageableOrganizationsAsync(string actionId, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("actionId", actionId);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/organization/get-manageable-organizations", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetOrganizationAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/organization/get-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
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

		public async Task<IEnumerable<dynamic>> GetOrganizationsAsync(long companyId, long parentOrganizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);

			var _command = new JsonObject()
			{
				{ "/organization/get-organizations", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetOrganizationsAsync(long companyId, long parentOrganizationId, int start, int end)
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

			return (IEnumerable<dynamic>)_obj;
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

		public async Task<IEnumerable<dynamic>> GetUserOrganizationsAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/organization/get-user-organizations", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
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

		public async Task<dynamic> UpdateOrganizationAsync(long organizationId, long parentOrganizationId, string name, string type, long regionId, long countryId, int statusId, string comments, bool site, JsonObjectWrapper serviceContext)
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
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/update-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateOrganizationAsync(long organizationId, long parentOrganizationId, string name, string type, bool recursable, long regionId, long countryId, int statusId, string comments, bool site, JsonObjectWrapper serviceContext)
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
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/update-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateOrganizationAsync(long organizationId, long parentOrganizationId, string name, string type, long regionId, long countryId, int statusId, string comments, bool site, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> orgLabors, IEnumerable<object> phones, IEnumerable<object> websites, JsonObjectWrapper serviceContext)
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
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/update-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateOrganizationAsync(long organizationId, long parentOrganizationId, string name, string type, bool recursable, long regionId, long countryId, int statusId, string comments, bool site, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> orgLabors, IEnumerable<object> phones, IEnumerable<object> websites, JsonObjectWrapper serviceContext)
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
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/update-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}