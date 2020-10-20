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

namespace Liferay.SDK.Service.V73.Cpdefinitiongroupedentry
{
	public class CpdefinitiongroupedentryService : ServiceBase
	{
		public CpdefinitiongroupedentryService(ISession session)
			: base(session)
		{
		}

		public async Task AddCpDefinitionGroupedEntriesAsync(long cpDefinitionId, IEnumerable<long> entryCPDefinitionIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("entryCPDefinitionIds", entryCPDefinitionIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitiongroupedentry/add-cp-definition-grouped-entries", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionGroupedEntriesAsync(long cpDefinitionId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitiongroupedentry/get-cp-definition-grouped-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCpDefinitionGroupedEntriesCountAsync(long cpDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitiongroupedentry/get-cp-definition-grouped-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionGroupedEntryAsync(long cpDefinitionGroupedEntryId, double priority, int quantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionGroupedEntryId", cpDefinitionGroupedEntryId);
			_parameters.Add("priority", priority);
			_parameters.Add("quantity", quantity);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitiongroupedentry/update-cp-definition-grouped-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteCpDefinitionGroupedEntryAsync(long cpDefinitionGroupedEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionGroupedEntryId", cpDefinitionGroupedEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitiongroupedentry/delete-cp-definition-grouped-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCpDefinitionGroupedEntryAsync(long cpDefinitionGroupedEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionGroupedEntryId", cpDefinitionGroupedEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitiongroupedentry/get-cp-definition-grouped-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}