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

namespace Liferay.SDK.Service.V73.DDMStructure
{
	public class DDMStructureService : ServiceBase
	{
		public DDMStructureService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> FetchStructureAsync(long groupId, long classNameId, string structureKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/fetch-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchStructureAsync(long groupId, long classNameId, string structureKey, bool includeAncestorStructures)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);
			_parameters.Add("includeAncestorStructures", includeAncestorStructures);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/fetch-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteStructureAsync(long structureId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/delete-structure", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddStructureAsync(long groupId, long classNameId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper ddmForm, JsonObjectWrapper ddmFormLayout, string storageType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "ddmForm", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmForm);
			this.MangleWrapper(_parameters, "ddmFormLayout", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormLayout);
			_parameters.Add("storageType", storageType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/add-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddStructureAsync(long groupId, long parentStructureId, long classNameId, string structureKey, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper ddmForm, JsonObjectWrapper ddmFormLayout, string storageType, int type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentStructureId", parentStructureId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "ddmForm", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmForm);
			this.MangleWrapper(_parameters, "ddmFormLayout", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormLayout);
			_parameters.Add("storageType", storageType);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/add-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddStructureAsync(long groupId, string parentStructureKey, long classNameId, string structureKey, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper ddmForm, JsonObjectWrapper ddmFormLayout, string storageType, int type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentStructureKey", parentStructureKey);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "ddmForm", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmForm);
			this.MangleWrapper(_parameters, "ddmFormLayout", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormLayout);
			_parameters.Add("storageType", storageType);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/add-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateStructureAsync(long structureId, long parentStructureId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper ddmForm, JsonObjectWrapper ddmFormLayout, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);
			_parameters.Add("parentStructureId", parentStructureId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "ddmForm", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmForm);
			this.MangleWrapper(_parameters, "ddmFormLayout", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormLayout);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/update-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateStructureAsync(long groupId, long parentStructureId, long classNameId, string structureKey, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper ddmForm, JsonObjectWrapper ddmFormLayout, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentStructureId", parentStructureId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "ddmForm", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmForm);
			this.MangleWrapper(_parameters, "ddmFormLayout", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormLayout);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/update-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, long classNameId, string keywords, int type, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("type", type);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, long classNameId, string name, string description, string storageType, int type, int status, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("storageType", storageType);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, long classNameId, string keywords, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetStructureAsync(long groupId, long classNameId, string structureKey, bool includeAncestorStructures)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);
			_parameters.Add("includeAncestorStructures", includeAncestorStructures);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/get-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetStructureAsync(long groupId, long classNameId, string structureKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/get-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetStructureAsync(long structureId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/get-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetStructuresAsync(long companyId, IEnumerable<long> groupIds, long classNameId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/get-structures", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetStructuresAsync(long companyId, IEnumerable<long> groupIds, long classNameId, string keywords, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/get-structures", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetStructuresAsync(long companyId, IEnumerable<long> groupIds, long classNameId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/get-structures", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetStructuresAsync(long companyId, IEnumerable<long> groupIds, long classNameId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/get-structures", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetStructuresCountAsync(long companyId, IEnumerable<long> groupIds, long classNameId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/get-structures-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetStructuresCountAsync(long companyId, IEnumerable<long> groupIds, long classNameId, string keywords, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/get-structures-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task RevertStructureAsync(long structureId, string version, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);
			_parameters.Add("version", version);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/revert-structure", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, long classNameId, string name, string description, string storageType, int type, int status, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("storageType", storageType);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, long classNameId, string keywords, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, long classNameId, string keywords, int type, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> CopyStructureAsync(long structureId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/copy-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> CopyStructureAsync(long structureId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructure/copy-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}