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

namespace Liferay.SDK.Service.V73.Depotentrygrouprel
{
	public class DepotentrygrouprelService : ServiceBase
	{
		public DepotentrygrouprelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddDepotEntryGroupRelAsync(long depotEntryId, long toGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("depotEntryId", depotEntryId);
			_parameters.Add("toGroupId", toGroupId);

			var _command = new JsonObject()
			{
				{ "/depot.depotentrygrouprel/add-depot-entry-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteDepotEntryGroupRelAsync(long depotEntryGroupRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("depotEntryGroupRelId", depotEntryGroupRelId);

			var _command = new JsonObject()
			{
				{ "/depot.depotentrygrouprel/delete-depot-entry-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetDepotEntryGroupRelsCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/depot.depotentrygrouprel/get-depot-entry-group-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetDepotEntryGroupRelsCountAsync(JsonObjectWrapper depotEntry)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "depotEntry", "$languageUtil.getJSONWrapperClassName($parameter.type)", depotEntry);

			var _command = new JsonObject()
			{
				{ "/depot.depotentrygrouprel/get-depot-entry-group-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateDdmStructuresAvailableAsync(long depotEntryGroupRelId, bool ddmStructuresAvailable)
		{
			var _parameters = new JsonObject();

			_parameters.Add("depotEntryGroupRelId", depotEntryGroupRelId);
			_parameters.Add("ddmStructuresAvailable", ddmStructuresAvailable);

			var _command = new JsonObject()
			{
				{ "/depot.depotentrygrouprel/update-ddm-structures-available", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetDepotEntryGroupRelsAsync(long groupId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/depot.depotentrygrouprel/get-depot-entry-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateSearchableAsync(long depotEntryGroupRelId, bool searchable)
		{
			var _parameters = new JsonObject();

			_parameters.Add("depotEntryGroupRelId", depotEntryGroupRelId);
			_parameters.Add("searchable", searchable);

			var _command = new JsonObject()
			{
				{ "/depot.depotentrygrouprel/update-searchable", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}