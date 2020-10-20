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

namespace Liferay.SDK.Service.V73.Cpmeasurementunit
{
	public class CpmeasurementunitService : ServiceBase
	{
		public CpmeasurementunitService(ISession session)
			: base(session)
		{
		}

		public async Task DeleteCpMeasurementUnitAsync(long cpMeasurementUnitId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpMeasurementUnitId", cpMeasurementUnitId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpmeasurementunit/delete-cp-measurement-unit", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCpMeasurementUnitAsync(IDictionary<string, string> nameMap, string key, double rate, bool primary, double priority, int type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("key", key);
			_parameters.Add("rate", rate);
			_parameters.Add("primary", primary);
			_parameters.Add("priority", priority);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpmeasurementunit/add-cp-measurement-unit", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpMeasurementUnitsAsync(long companyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.cpmeasurementunit/get-cp-measurement-units", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpMeasurementUnitsAsync(long companyId, int type, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("type", type);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.cpmeasurementunit/get-cp-measurement-units", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> FetchPrimaryCpMeasurementUnitAsync(long companyId, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/commerce.cpmeasurementunit/fetch-primary-cp-measurement-unit", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetCpMeasurementUnitsCountAsync(long companyId, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/commerce.cpmeasurementunit/get-cp-measurement-units-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCpMeasurementUnitsCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpmeasurementunit/get-cp-measurement-units-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCpMeasurementUnitAsync(long cpMeasurementUnitId, IDictionary<string, string> nameMap, string key, double rate, bool primary, double priority, int type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpMeasurementUnitId", cpMeasurementUnitId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("key", key);
			_parameters.Add("rate", rate);
			_parameters.Add("primary", primary);
			_parameters.Add("priority", priority);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpmeasurementunit/update-cp-measurement-unit", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCpMeasurementUnitAsync(long cpMeasurementUnitId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpMeasurementUnitId", cpMeasurementUnitId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpmeasurementunit/get-cp-measurement-unit", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SetPrimaryAsync(long cpMeasurementUnitId, bool primary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpMeasurementUnitId", cpMeasurementUnitId);
			_parameters.Add("primary", primary);

			var _command = new JsonObject()
			{
				{ "/commerce.cpmeasurementunit/set-primary", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}