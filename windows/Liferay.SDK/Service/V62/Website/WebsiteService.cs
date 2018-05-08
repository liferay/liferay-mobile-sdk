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

namespace Liferay.SDK.Service.V62.Website
{
	public class WebsiteService : ServiceBase
	{
		public WebsiteService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddWebsiteAsync(string className, long classPK, string url, int typeId, bool primary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("url", url);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);

			var _command = new JsonObject()
			{
				{ "/website/add-website", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> AddWebsiteAsync(string className, long classPK, string url, int typeId, bool primary, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("url", url);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/website/add-website", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task DeleteWebsiteAsync(long websiteId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("websiteId", websiteId);

			var _command = new JsonObject()
			{
				{ "/website/delete-website", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> GetWebsiteAsync(long websiteId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("websiteId", websiteId);

			var _command = new JsonObject()
			{
				{ "/website/get-website", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetWebsitesAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/website/get-websites", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateWebsiteAsync(long websiteId, string url, int typeId, bool primary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("websiteId", websiteId);
			_parameters.Add("url", url);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);

			var _command = new JsonObject()
			{
				{ "/website/update-website", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}