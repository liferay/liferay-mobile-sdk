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

namespace Liferay.SDK.Service.V73.Layoutseoentry
{
	public class LayoutseoentryService : ServiceBase
	{
		public LayoutseoentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateLayoutSeoEntryAsync(long groupId, bool privateLayout, long layoutId, bool canonicalURLEnabled, IDictionary<string, string> canonicalURLMap, bool openGraphDescriptionEnabled, IDictionary<string, string> openGraphDescriptionMap, IDictionary<string, string> openGraphImageAltMap, long openGraphImageFileEntryId, bool openGraphTitleEnabled, IDictionary<string, string> openGraphTitleMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("canonicalURLEnabled", canonicalURLEnabled);
			_parameters.Add("canonicalURLMap", canonicalURLMap);
			_parameters.Add("openGraphDescriptionEnabled", openGraphDescriptionEnabled);
			_parameters.Add("openGraphDescriptionMap", openGraphDescriptionMap);
			_parameters.Add("openGraphImageAltMap", openGraphImageAltMap);
			_parameters.Add("openGraphImageFileEntryId", openGraphImageFileEntryId);
			_parameters.Add("openGraphTitleEnabled", openGraphTitleEnabled);
			_parameters.Add("openGraphTitleMap", openGraphTitleMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout.layoutseoentry/update-layout-seo-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutSeoEntryAsync(long groupId, bool privateLayout, long layoutId, bool enabledCanonicalURLMap, IDictionary<string, string> canonicalURLMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("enabledCanonicalURLMap", enabledCanonicalURLMap);
			_parameters.Add("canonicalURLMap", canonicalURLMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout.layoutseoentry/update-layout-seo-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}