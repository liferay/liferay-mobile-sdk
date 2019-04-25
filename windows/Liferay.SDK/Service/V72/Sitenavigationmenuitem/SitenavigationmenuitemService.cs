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

namespace Liferay.SDK.Service.V72.Sitenavigationmenuitem
{
	public class SitenavigationmenuitemService : ServiceBase
	{
		public SitenavigationmenuitemService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetSiteNavigationMenuItemsAsync(long siteNavigationMenuId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("siteNavigationMenuId", siteNavigationMenuId);

			var _command = new JsonObject()
			{
				{ "/sitenavigation.sitenavigationmenuitem/get-site-navigation-menu-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> DeleteSiteNavigationMenuItemAsync(long siteNavigationMenuItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("siteNavigationMenuItemId", siteNavigationMenuItemId);

			var _command = new JsonObject()
			{
				{ "/sitenavigation.sitenavigationmenuitem/delete-site-navigation-menu-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteSiteNavigationMenuItemsAsync(long siteNavigationMenuId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("siteNavigationMenuId", siteNavigationMenuId);

			var _command = new JsonObject()
			{
				{ "/sitenavigation.sitenavigationmenuitem/delete-site-navigation-menu-items", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddSiteNavigationMenuItemAsync(long groupId, long siteNavigationMenuId, long parentSiteNavigationMenuItemId, string type, string typeSettings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("siteNavigationMenuId", siteNavigationMenuId);
			_parameters.Add("parentSiteNavigationMenuItemId", parentSiteNavigationMenuItemId);
			_parameters.Add("type", type);
			_parameters.Add("typeSettings", typeSettings);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/sitenavigation.sitenavigationmenuitem/add-site-navigation-menu-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSiteNavigationMenuItemAsync(long siteNavigationMenuId, long parentSiteNavigationMenuItemId, int order)
		{
			var _parameters = new JsonObject();

			_parameters.Add("siteNavigationMenuId", siteNavigationMenuId);
			_parameters.Add("parentSiteNavigationMenuItemId", parentSiteNavigationMenuItemId);
			_parameters.Add("order", order);

			var _command = new JsonObject()
			{
				{ "/sitenavigation.sitenavigationmenuitem/update-site-navigation-menu-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSiteNavigationMenuItemAsync(long siteNavigationMenuId, string typeSettings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("siteNavigationMenuId", siteNavigationMenuId);
			_parameters.Add("typeSettings", typeSettings);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/sitenavigation.sitenavigationmenuitem/update-site-navigation-menu-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}