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

namespace Liferay.SDK.Service.V72.LayoutRevision
{
	public class LayoutRevisionService : ServiceBase
	{
		public LayoutRevisionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddLayoutRevisionAsync(long userId, long layoutSetBranchId, long layoutBranchId, long parentLayoutRevisionId, bool head, long plid, long portletPreferencesPlid, bool privateLayout, string name, string title, string description, string keywords, string robots, string typeSettings, bool iconImage, long iconImageId, string themeId, string colorSchemeId, string css, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("layoutSetBranchId", layoutSetBranchId);
			_parameters.Add("layoutBranchId", layoutBranchId);
			_parameters.Add("parentLayoutRevisionId", parentLayoutRevisionId);
			_parameters.Add("head", head);
			_parameters.Add("plid", plid);
			_parameters.Add("portletPreferencesPlid", portletPreferencesPlid);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("name", name);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("keywords", keywords);
			_parameters.Add("robots", robots);
			_parameters.Add("typeSettings", typeSettings);
			_parameters.Add("iconImage", iconImage);
			_parameters.Add("iconImageId", iconImageId);
			_parameters.Add("themeId", themeId);
			_parameters.Add("colorSchemeId", colorSchemeId);
			_parameters.Add("css", css);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutrevision/add-layout-revision", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}