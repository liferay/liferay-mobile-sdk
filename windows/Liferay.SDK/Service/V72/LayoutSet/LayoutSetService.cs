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

namespace Liferay.SDK.Service.V72.LayoutSet
{
	public class LayoutSetService : ServiceBase
	{
		public LayoutSetService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateLookAndFeelAsync(long groupId, bool privateLayout, string themeId, string colorSchemeId, string css)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("themeId", themeId);
			_parameters.Add("colorSchemeId", colorSchemeId);
			_parameters.Add("css", css);

			var _command = new JsonObject()
			{
				{ "/layoutset/update-look-and-feel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSettingsAsync(long groupId, bool privateLayout, string settings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("settings", settings);

			var _command = new JsonObject()
			{
				{ "/layoutset/update-settings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateLayoutSetPrototypeLinkEnabledAsync(long groupId, bool privateLayout, bool layoutSetPrototypeLinkEnabled, string layoutSetPrototypeUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutSetPrototypeLinkEnabled", layoutSetPrototypeLinkEnabled);
			_parameters.Add("layoutSetPrototypeUuid", layoutSetPrototypeUuid);

			var _command = new JsonObject()
			{
				{ "/layoutset/update-layout-set-prototype-link-enabled", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateLogoAsync(long groupId, bool privateLayout, bool logo, byte[] bytes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("logo", logo);
			_parameters.Add("bytes", bytes);

			var _command = new JsonObject()
			{
				{ "/layoutset/update-logo", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateLogoAsync(long groupId, bool privateLayout, bool logo, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("logo", logo);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layoutset/update-logo", _parameters }
			};

			await this.Session.UploadAsync(_command);
		}

		public async Task<dynamic> UpdateVirtualHostAsync(long groupId, bool privateLayout, string virtualHost)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("virtualHost", virtualHost);

			var _command = new JsonObject()
			{
				{ "/layoutset/update-virtual-host", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}