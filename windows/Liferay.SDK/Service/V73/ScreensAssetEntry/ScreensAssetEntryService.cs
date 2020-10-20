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

namespace Liferay.SDK.Service.V73.ScreensAssetEntry
{
	public class ScreensAssetEntryService : ServiceBase
	{
		public ScreensAssetEntryService(ISession session)
			: base(session)
		{
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
	}
}