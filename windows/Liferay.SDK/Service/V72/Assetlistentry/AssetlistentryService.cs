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

namespace Liferay.SDK.Service.V72.Assetlistentry
{
	public class AssetlistentryService : ServiceBase
	{
		public AssetlistentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetAssetListEntryAsync(long groupId, string assetListEntryKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("assetListEntryKey", assetListEntryKey);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/get-asset-list-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetAssetListEntryAsync(long assetListEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetListEntryId", assetListEntryId);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/get-asset-list-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetAssetListEntryByUuidAndGroupIdAsync(string uuid, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("uuid", uuid);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/get-asset-list-entry-by-uuid-and-group-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task AddAssetEntrySelectionsAsync(long assetListEntryId, IEnumerable<long> assetEntryIds, long segmentsEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetListEntryId", assetListEntryId);
			_parameters.Add("assetEntryIds", assetEntryIds);
			_parameters.Add("segmentsEntryId", segmentsEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/add-asset-entry-selections", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddAssetEntrySelectionAsync(long assetListEntryId, long assetEntryId, long segmentsEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetListEntryId", assetListEntryId);
			_parameters.Add("assetEntryId", assetEntryId);
			_parameters.Add("segmentsEntryId", segmentsEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/add-asset-entry-selection", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchAssetListEntryAsync(long assetListEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetListEntryId", assetListEntryId);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/fetch-asset-list-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddDynamicAssetListEntryAsync(long userId, long groupId, string title, string typeSettings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("typeSettings", typeSettings);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/add-dynamic-asset-list-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddManualAssetListEntryAsync(long userId, long groupId, string title, IEnumerable<long> assetEntryIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("assetEntryIds", assetEntryIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/add-manual-asset-list-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteAssetEntrySelectionAsync(long assetListEntryId, long segmentsEntryId, int position)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetListEntryId", assetListEntryId);
			_parameters.Add("segmentsEntryId", segmentsEntryId);
			_parameters.Add("position", position);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/delete-asset-entry-selection", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteAssetListEntryAsync(long assetListEntryId, long segmentsEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetListEntryId", assetListEntryId);
			_parameters.Add("segmentsEntryId", segmentsEntryId);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/delete-asset-list-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> DeleteAssetListEntryAsync(long assetListEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetListEntryId", assetListEntryId);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/delete-asset-list-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAssetListEntriesAsync(long groupId, string title, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/get-asset-list-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAssetListEntriesAsync(long groupId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/get-asset-list-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task MoveAssetEntrySelectionAsync(long assetListEntryId, long segmentsEntryId, int position, int newPosition)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetListEntryId", assetListEntryId);
			_parameters.Add("segmentsEntryId", segmentsEntryId);
			_parameters.Add("position", position);
			_parameters.Add("newPosition", newPosition);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/move-asset-entry-selection", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateAssetListEntryTypeSettingsAsync(long assetListEntryId, long segmentsEntryId, string typeSettings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetListEntryId", assetListEntryId);
			_parameters.Add("segmentsEntryId", segmentsEntryId);
			_parameters.Add("typeSettings", typeSettings);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/update-asset-list-entry-type-settings", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> GetAssetListEntriesCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/get-asset-list-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetAssetListEntriesCountAsync(long groupId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/get-asset-list-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteAssetListEntriesAsync(IEnumerable<long> assetListEntriesIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetListEntriesIds", assetListEntriesIds);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/delete-asset-list-entries", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddAssetListEntryAsync(long groupId, string title, int type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/add-asset-list-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateAssetListEntryAsync(long assetListEntryId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetListEntryId", assetListEntryId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/update-asset-list-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateAssetListEntryAsync(long assetListEntryId, long segmentsEntryId, string typeSettings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetListEntryId", assetListEntryId);
			_parameters.Add("segmentsEntryId", segmentsEntryId);
			_parameters.Add("typeSettings", typeSettings);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetlist.assetlistentry/update-asset-list-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}