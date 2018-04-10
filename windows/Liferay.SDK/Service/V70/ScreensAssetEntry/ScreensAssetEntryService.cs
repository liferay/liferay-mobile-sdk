//------------------------------------------------------------------------------
// <copyright file="ScreensAssetEntryService.cs">
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

namespace Liferay.SDK.Service.V70.ScreensAssetEntry
{
	public class ScreensAssetEntryService : ServiceBase
	{
		public ScreensAssetEntryService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetAssetEntriesAsync(long companyId, long groupId, string portletItemName, string locale, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletItemName", portletItemName);
			_parameters.Add("locale", locale);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/screens.screensassetentry/get-asset-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAssetEntriesAsync(JsonObjectWrapper assetEntryQuery, string locale)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "assetEntryQuery", "$languageUtil.getJSONWrapperClassName($parameter.type)", assetEntryQuery);
			_parameters.Add("locale", locale);

			var _command = new JsonObject()
			{
				{ "/screens.screensassetentry/get-asset-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetAssetEntryAsync(long entryId, string locale)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("locale", locale);

			var _command = new JsonObject()
			{
				{ "/screens.screensassetentry/get-asset-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetAssetEntryAsync(string className, long classPK, string locale)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("locale", locale);

			var _command = new JsonObject()
			{
				{ "/screens.screensassetentry/get-asset-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}