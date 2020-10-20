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

namespace Liferay.SDK.Service.V73.Fragmententry
{
	public class FragmententryService : ServiceBase
	{
		public FragmententryService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<string>> GetTempFileNamesAsync(long groupId, string folderName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderName", folderName);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-temp-file-names", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<string>();
		}

		public async Task<dynamic> FetchDraftAsync(long primaryKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("primaryKey", primaryKey);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/fetch-draft", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFragmentEntryAsync(long groupId, long fragmentCollectionId, string fragmentEntryKey, string name, string css, string html, string js, string configuration, long previewFileEntryId, int type, int status, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("fragmentEntryKey", fragmentEntryKey);
			_parameters.Add("name", name);
			_parameters.Add("css", css);
			_parameters.Add("html", html);
			_parameters.Add("js", js);
			_parameters.Add("configuration", configuration);
			_parameters.Add("previewFileEntryId", previewFileEntryId);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/add-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFragmentEntryAsync(long groupId, long fragmentCollectionId, string fragmentEntryKey, string name, long previewFileEntryId, int type, int status, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("fragmentEntryKey", fragmentEntryKey);
			_parameters.Add("name", name);
			_parameters.Add("previewFileEntryId", previewFileEntryId);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/add-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFragmentEntryAsync(long groupId, long fragmentCollectionId, string fragmentEntryKey, string name, string css, string html, string js, bool cacheable, string configuration, long previewFileEntryId, int type, int status, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("fragmentEntryKey", fragmentEntryKey);
			_parameters.Add("name", name);
			_parameters.Add("css", css);
			_parameters.Add("html", html);
			_parameters.Add("js", js);
			_parameters.Add("cacheable", cacheable);
			_parameters.Add("configuration", configuration);
			_parameters.Add("previewFileEntryId", previewFileEntryId);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/add-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentEntryAsync(long fragmentEntryId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryId", fragmentEntryId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/update-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentEntryAsync(long fragmentEntryId, string name, string css, string html, string js, bool cacheable, string configuration, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryId", fragmentEntryId);
			_parameters.Add("name", name);
			_parameters.Add("css", css);
			_parameters.Add("html", html);
			_parameters.Add("js", js);
			_parameters.Add("cacheable", cacheable);
			_parameters.Add("configuration", configuration);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/update-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentEntryAsync(long fragmentEntryId, string name, string css, string html, string js, bool cacheable, string configuration, long previewFileEntryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryId", fragmentEntryId);
			_parameters.Add("name", name);
			_parameters.Add("css", css);
			_parameters.Add("html", html);
			_parameters.Add("js", js);
			_parameters.Add("cacheable", cacheable);
			_parameters.Add("configuration", configuration);
			_parameters.Add("previewFileEntryId", previewFileEntryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/update-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentEntryAsync(long fragmentEntryId, string name, string css, string html, string js, string configuration, long previewFileEntryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryId", fragmentEntryId);
			_parameters.Add("name", name);
			_parameters.Add("css", css);
			_parameters.Add("html", html);
			_parameters.Add("js", js);
			_parameters.Add("configuration", configuration);
			_parameters.Add("previewFileEntryId", previewFileEntryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/update-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentEntryAsync(long fragmentEntryId, long fragmentCollectionId, string name, string css, string html, string js, bool cacheable, string configuration, long previewFileEntryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryId", fragmentEntryId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("css", css);
			_parameters.Add("html", html);
			_parameters.Add("js", js);
			_parameters.Add("cacheable", cacheable);
			_parameters.Add("configuration", configuration);
			_parameters.Add("previewFileEntryId", previewFileEntryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/update-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentEntryAsync(long fragmentEntryId, long previewFileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryId", fragmentEntryId);
			_parameters.Add("previewFileEntryId", previewFileEntryId);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/update-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentEntryAsync(JsonObjectWrapper fragmentEntry)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "fragmentEntry", "$languageUtil.getJSONWrapperClassName($parameter.type)", fragmentEntry);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/update-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentEntryAsync(long fragmentEntryId, string name, string css, string html, string js, string configuration, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryId", fragmentEntryId);
			_parameters.Add("name", name);
			_parameters.Add("css", css);
			_parameters.Add("html", html);
			_parameters.Add("js", js);
			_parameters.Add("configuration", configuration);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/update-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentEntriesAsync(long groupId, long fragmentCollectionId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentEntriesAsync(long groupId, long fragmentCollectionId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentEntriesAsync(long fragmentCollectionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentCollectionId", fragmentCollectionId);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> FetchFragmentEntryAsync(long fragmentEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryId", fragmentEntryId);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/fetch-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> CopyFragmentEntryAsync(long groupId, long fragmentEntryId, long fragmentCollectionId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentEntryId", fragmentEntryId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/copy-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteFragmentEntryAsync(long fragmentEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryId", fragmentEntryId);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/delete-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetFragmentEntriesCountAsync(long groupId, long fragmentCollectionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> MoveFragmentEntryAsync(long fragmentEntryId, long fragmentCollectionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryId", fragmentEntryId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/move-fragment-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFragmentEntriesAsync(IEnumerable<long> fragmentEntriesIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntriesIds", fragmentEntriesIds);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/delete-fragment-entries", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetFragmentCompositionsAndFragmentEntriesAsync(long groupId, long fragmentCollectionId, string name, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-compositions-and-fragment-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentCompositionsAndFragmentEntriesAsync(long groupId, long fragmentCollectionId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-compositions-and-fragment-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFragmentCompositionsAndFragmentEntriesCountAsync(long groupId, long fragmentCollectionId, string name, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-compositions-and-fragment-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFragmentCompositionsAndFragmentEntriesCountAsync(long groupId, long fragmentCollectionId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-compositions-and-fragment-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentEntriesByNameAsync(long groupId, long fragmentCollectionId, string name, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries-by-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentEntriesByNameAndStatusAsync(long groupId, long fragmentCollectionId, string name, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries-by-name-and-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentEntriesByStatusAsync(long groupId, long fragmentCollectionId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries-by-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentEntriesByStatusAsync(long groupId, long fragmentCollectionId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries-by-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentEntriesByTypeAsync(long groupId, long fragmentCollectionId, int type, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("type", type);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries-by-type", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentEntriesByTypeAndStatusAsync(long groupId, long fragmentCollectionId, int type, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries-by-type-and-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentEntriesByTypeAndStatusAsync(long groupId, long fragmentCollectionId, int type, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("type", type);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries-by-type-and-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFragmentEntriesCountByNameAsync(long groupId, long fragmentCollectionId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries-count-by-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFragmentEntriesCountByNameAndStatusAsync(long groupId, long fragmentCollectionId, string name, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries-count-by-name-and-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFragmentEntriesCountByStatusAsync(long groupId, long fragmentCollectionId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries-count-by-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFragmentEntriesCountByTypeAsync(long groupId, long fragmentCollectionId, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries-count-by-type", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFragmentEntriesCountByTypeAndStatusAsync(long groupId, long fragmentCollectionId, int type, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("type", type);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-fragment-entries-count-by-type-and-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetDraftAsync(long primaryKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("primaryKey", primaryKey);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/get-draft", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> PublishDraftAsync(JsonObjectWrapper draftFragmentEntry)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "draftFragmentEntry", "$languageUtil.getJSONWrapperClassName($parameter.type)", draftFragmentEntry);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/publish-draft", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateDraftAsync(JsonObjectWrapper draftFragmentEntry)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "draftFragmentEntry", "$languageUtil.getJSONWrapperClassName($parameter.type)", draftFragmentEntry);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententry/update-draft", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}