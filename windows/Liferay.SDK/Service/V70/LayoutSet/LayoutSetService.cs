//------------------------------------------------------------------------------
// <copyright file="LayoutSetService.cs">
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

namespace Liferay.SDK.Service.V70.LayoutSet
{
	public class LayoutSetService : ServiceBase
	{
		public LayoutSetService(ISession session)
			: base(session)
		{
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
	}
}