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

namespace Liferay.SDK.Service.V62.DDMStructure
{
	public class DDMStructureService : ServiceBase
	{
		public DDMStructureService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddStructureAsync(long groupId, long parentStructureId, long classNameId, string structureKey, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string xsd, string storageType, int type, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentStructureId", parentStructureId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("xsd", xsd);
			_parameters.Add("storageType", storageType);
			_parameters.Add("type", type);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/add-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> AddStructureAsync(long userId, long groupId, string parentStructureKey, long classNameId, string structureKey, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string xsd, string storageType, int type, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("parentStructureKey", parentStructureKey);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("xsd", xsd);
			_parameters.Add("storageType", storageType);
			_parameters.Add("type", type);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/add-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> AddStructureAsync(long userId, long groupId, long classNameId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string xsd, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("xsd", xsd);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/add-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> CopyStructureAsync(long structureId, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/copy-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> CopyStructureAsync(long structureId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/copy-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task DeleteStructureAsync(long structureId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/delete-structure", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> FetchStructureAsync(long groupId, long classNameId, string structureKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/fetch-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> FetchStructureAsync(long groupId, long classNameId, string structureKey, bool includeAncestorStructures)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);
			_parameters.Add("includeAncestorStructures", includeAncestorStructures);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/fetch-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetStructureAsync(long structureId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/get-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetStructureAsync(long groupId, long classNameId, string structureKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/get-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetStructureAsync(long groupId, long classNameId, string structureKey, bool includeGlobalStructures)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);
			_parameters.Add("includeGlobalStructures", includeGlobalStructures);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/get-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetStructuresAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/get-structures", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetStructuresAsync(IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/get-structures", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetStructuresAsync(IEnumerable<long> groupIds, long classNameId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/get-structures", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetStructuresAsync(IEnumerable<long> groupIds, long classNameId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/get-structures", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, string name, string description, string storageType, int type, bool andOperator, int start, int end, IDictionary<string, object> orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("storageType", storageType);
			_parameters.Add("type", type);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("orderByComparator", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, string keywords, int start, int end, IDictionary<string, object> orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("orderByComparator", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, string name, string description, string storageType, int type, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("storageType", storageType);
			_parameters.Add("type", type);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateStructureAsync(long structureId, long parentStructureId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string xsd, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);
			_parameters.Add("parentStructureId", parentStructureId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("xsd", xsd);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/update-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateStructureAsync(long groupId, long parentStructureId, long classNameId, string structureKey, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string xsd, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentStructureId", parentStructureId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("structureKey", structureKey);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("xsd", xsd);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddmstructure/update-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}