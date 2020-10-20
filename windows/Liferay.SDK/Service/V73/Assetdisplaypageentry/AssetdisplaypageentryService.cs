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

namespace Liferay.SDK.Service.V73.Assetdisplaypageentry
{
	public class AssetdisplaypageentryService : ServiceBase
	{
		public AssetdisplaypageentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddAssetDisplayPageEntryAsync(long userId, long groupId, long classNameId, long classPK, long layoutPageTemplateEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/asset.assetdisplaypageentry/add-asset-display-page-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddAssetDisplayPageEntryAsync(long userId, long groupId, long classNameId, long classPK, long layoutPageTemplateEntryId, int type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/asset.assetdisplaypageentry/add-asset-display-page-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateAssetDisplayPageEntryAsync(long assetDisplayPageEntryId, long layoutPageTemplateEntryId, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetDisplayPageEntryId", assetDisplayPageEntryId);
			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/asset.assetdisplaypageentry/update-asset-display-page-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetAssetDisplayPageEntriesCountByLayoutPageTemplateEntryIdAsync(long layoutPageTemplateEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);

			var _command = new JsonObject()
			{
				{ "/asset.assetdisplaypageentry/get-asset-display-page-entries-count-by-layout-page-template-entry-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteAssetDisplayPageEntryAsync(long groupId, long classNameId, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/asset.assetdisplaypageentry/delete-asset-display-page-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchAssetDisplayPageEntryAsync(long groupId, long classNameId, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/asset.assetdisplaypageentry/fetch-asset-display-page-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAssetDisplayPageEntriesByLayoutPageTemplateEntryIdAsync(long layoutPageTemplateEntryId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/asset.assetdisplaypageentry/get-asset-display-page-entries-by-layout-page-template-entry-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAssetDisplayPageEntriesByLayoutPageTemplateEntryIdAsync(long layoutPageTemplateEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);

			var _command = new JsonObject()
			{
				{ "/asset.assetdisplaypageentry/get-asset-display-page-entries-by-layout-page-template-entry-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}