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

namespace Liferay.SDK.Service.V72.Layoutpagetemplateentry
{
	public class LayoutpagetemplateentryService : ServiceBase
	{
		public LayoutpagetemplateentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> FetchDefaultLayoutPageTemplateEntryAsync(long groupId, long classNameId, long classTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classTypeId", classTypeId);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/fetch-default-layout-page-template-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchLayoutPageTemplateEntryAsync(long groupId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/fetch-layout-page-template-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchLayoutPageTemplateEntryAsync(long layoutPageTemplateEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/fetch-layout-page-template-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchLayoutPageTemplateEntryByUuidAndGroupIdAsync(string uuid, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("uuid", uuid);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/fetch-layout-page-template-entry-by-uuid-and-group-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetLayoutPageTemplateEntriesCountAsync(long groupId, long classNameId, long classTypeId, int type, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("type", type);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateEntriesCountAsync(long groupId, long classNameId, long classTypeId, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateEntriesCountAsync(long groupId, int type, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("type", type);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateEntriesCountAsync(long groupId, long layoutPageTemplateFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateFolderId", layoutPageTemplateFolderId);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateEntriesCountAsync(long groupId, long layoutPageTemplateFolderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateFolderId", layoutPageTemplateFolderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateEntriesCountAsync(long groupId, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateEntriesCountAsync(long groupId, string name, int type, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateEntriesCountAsync(long groupId, string name, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateEntriesCountAsync(long groupId, long layoutPageTemplateFolderId, string name, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateFolderId", layoutPageTemplateFolderId);
			_parameters.Add("name", name);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateEntriesCountAsync(long groupId, long classNameId, long classTypeId, string name, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateEntriesCountAsync(long groupId, long classNameId, long classTypeId, string name, int type, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateEntriesCountAsync(long groupId, long layoutPageTemplateFolderId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateFolderId", layoutPageTemplateFolderId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesByTypeAsync(long groupId, long layoutPageTemplateCollectionId, int type, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("type", type);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-by-type", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, long classNameId, long classTypeId, int type, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("type", type);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, long classNameId, long classTypeId, string name, int type, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, long classNameId, long classTypeId, string name, int type, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, long layoutPageTemplateCollectionId, string name, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, string name, int type, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, string name, int type, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, long layoutPageTemplateCollectionId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, long layoutPageTemplateCollectionId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, long layoutPageTemplateCollectionId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, long classNameId, int type, bool defaultTemplate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("type", type);
			_parameters.Add("defaultTemplate", defaultTemplate);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, int type, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("type", type);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, int type, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, long classNameId, long classTypeId, int type, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, long layoutPageTemplateCollectionId, string name, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, long classNameId, long classTypeId, int type, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("type", type);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, long classNameId, long classTypeId, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateEntriesAsync(long groupId, long layoutPageTemplateCollectionId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> DeleteLayoutPageTemplateEntryAsync(long layoutPageTemplateEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/delete-layout-page-template-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetLayoutPageTemplateCollectionsCountAsync(long groupId, long layoutPageTemplateCollectionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-collections-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateCollectionsCountAsync(long groupId, long layoutPageTemplateCollectionId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-collections-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateCollectionsCountAsync(long groupId, long layoutPageTemplateCollectionId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-collections-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateCollectionsCountAsync(long groupId, long layoutPageTemplateCollectionId, string name, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-collections-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteLayoutPageTemplateEntriesAsync(IEnumerable<long> layoutPageTemplateEntryIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateEntryIds", layoutPageTemplateEntryIds);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/delete-layout-page-template-entries", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> GetLayoutPageTemplateEntriesCountByTypeAsync(long groupId, long layoutPageTemplateCollectionId, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/get-layout-page-template-entries-count-by-type", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateStatusAsync(long layoutPageTemplateEntryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/update-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddLayoutPageTemplateEntryAsync(long groupId, long layoutPageTemplateCollectionId, string name, int type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/add-layout-page-template-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddLayoutPageTemplateEntryAsync(long groupId, long layoutPageTemplateCollectionId, string name, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("name", name);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/add-layout-page-template-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddLayoutPageTemplateEntryAsync(long groupId, long layoutPageTemplateCollectionId, string name, int type, int status, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/add-layout-page-template-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutPageTemplateEntryAsync(long layoutPageTemplateEntryId, string name, IEnumerable<long> fragmentEntryIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_parameters.Add("name", name);
			_parameters.Add("fragmentEntryIds", fragmentEntryIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/update-layout-page-template-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutPageTemplateEntryAsync(long layoutPageTemplateEntryId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/update-layout-page-template-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutPageTemplateEntryAsync(long layoutPageTemplateEntryId, long previewFileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_parameters.Add("previewFileEntryId", previewFileEntryId);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/update-layout-page-template-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutPageTemplateEntryAsync(long layoutPageTemplateEntryId, IEnumerable<long> fragmentEntryIds, string editableValues, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_parameters.Add("fragmentEntryIds", fragmentEntryIds);
			_parameters.Add("editableValues", editableValues);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/update-layout-page-template-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutPageTemplateEntryAsync(long layoutPageTemplateEntryId, long classNameId, long classTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classTypeId", classTypeId);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/update-layout-page-template-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutPageTemplateEntryAsync(long layoutPageTemplateEntryId, bool defaultTemplate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_parameters.Add("defaultTemplate", defaultTemplate);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplateentry/update-layout-page-template-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}