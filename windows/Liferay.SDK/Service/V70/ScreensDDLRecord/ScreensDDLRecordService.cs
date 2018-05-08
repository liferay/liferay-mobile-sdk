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

namespace Liferay.SDK.Service.V70.ScreensDDLRecord
{
	public class ScreensDDLRecordService : ServiceBase
	{
		public ScreensDDLRecordService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetDdlRecordAsync(long ddlRecordId, string locale)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddlRecordId", ddlRecordId);
			_parameters.Add("locale", locale);

			var _command = new JsonObject()
			{
				{ "/screens.screensddlrecord/get-ddl-record", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetDdlRecordsAsync(long ddlRecordSetId, string locale, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddlRecordSetId", ddlRecordSetId);
			_parameters.Add("locale", locale);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/screens.screensddlrecord/get-ddl-records", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetDdlRecordsAsync(long ddlRecordSetId, long userId, string locale, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddlRecordSetId", ddlRecordSetId);
			_parameters.Add("userId", userId);
			_parameters.Add("locale", locale);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/screens.screensddlrecord/get-ddl-records", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetDdlRecordsCountAsync(long ddlRecordSetId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddlRecordSetId", ddlRecordSetId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/screens.screensddlrecord/get-ddl-records-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetDdlRecordsCountAsync(long ddlRecordSetId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddlRecordSetId", ddlRecordSetId);

			var _command = new JsonObject()
			{
				{ "/screens.screensddlrecord/get-ddl-records-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}