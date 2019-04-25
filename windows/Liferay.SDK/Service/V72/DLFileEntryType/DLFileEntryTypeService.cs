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

namespace Liferay.SDK.Service.V72.DLFileEntryType
{
	public class DLFileEntryTypeService : ServiceBase
	{
		public DLFileEntryTypeService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, long folderId, IEnumerable<long> groupIds, string keywords, bool includeBasicFileEntryType, bool inherited, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("includeBasicFileEntryType", includeBasicFileEntryType);
			_parameters.Add("inherited", inherited);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, string keywords, bool includeBasicFileEntryType, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("includeBasicFileEntryType", includeBasicFileEntryType);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetFileEntryTypeAsync(long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/get-file-entry-type", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFileEntryTypeAsync(long groupId, string name, string description, IEnumerable<long> ddmStructureIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("ddmStructureIds", ddmStructureIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/add-file-entry-type", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFileEntryTypeAsync(long groupId, string fileEntryTypeKey, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, IEnumerable<long> ddmStructureIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fileEntryTypeKey", fileEntryTypeKey);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("ddmStructureIds", ddmStructureIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/add-file-entry-type", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFileEntryTypeAsync(long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/delete-file-entry-type", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetFileEntryTypesAsync(IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/get-file-entry-types", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntryTypesAsync(IEnumerable<long> groupIds, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/get-file-entry-types", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFileEntryTypesCountAsync(IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/get-file-entry-types-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFolderFileEntryTypesAsync(IEnumerable<long> groupIds, long folderId, bool inherited)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("folderId", folderId);
			_parameters.Add("inherited", inherited);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/get-folder-file-entry-types", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, string keywords, bool includeBasicFileEntryType)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("includeBasicFileEntryType", includeBasicFileEntryType);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, long folderId, IEnumerable<long> groupIds, string keywords, bool includeBasicFileEntryType, bool inherited)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("includeBasicFileEntryType", includeBasicFileEntryType);
			_parameters.Add("inherited", inherited);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task UpdateFileEntryTypeAsync(long fileEntryTypeId, string name, string description, IEnumerable<long> ddmStructureIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryTypeId", fileEntryTypeId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("ddmStructureIds", ddmStructureIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/update-file-entry-type", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateFileEntryTypeAsync(long fileEntryTypeId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, IEnumerable<long> ddmStructureIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryTypeId", fileEntryTypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("ddmStructureIds", ddmStructureIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/update-file-entry-type", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}