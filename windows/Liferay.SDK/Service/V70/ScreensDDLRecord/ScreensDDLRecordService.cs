//------------------------------------------------------------------------------
// <copyright file="ScreensDDLRecordService.cs">
//    Copyright (c) 2014-present Andrea Di Giorgi
//
//    Permission is hereby granted, free of charge, to any person obtaining a
//    copy of this software and associated documentation files (the "Software"),
//    to deal in the Software without restriction, including without limitation
//    the rights to use, copy, modify, merge, publish, distribute, sublicense,
//    and/or sell copies of the Software, and to permit persons to whom the
//    Software is furnished to do so, subject to the following conditions:
//
//    The above copyright notice and this permission notice shall be included in
//    all copies or substantial portions of the Software.
//
//    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
//    THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
//    FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
//    DEALINGS IN THE SOFTWARE.
// </copyright>
// <author>Andrea Di Giorgi</author>
// <website>https://github.com/Ithildir/liferay-sdk-builder-windows</website>
//------------------------------------------------------------------------------

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