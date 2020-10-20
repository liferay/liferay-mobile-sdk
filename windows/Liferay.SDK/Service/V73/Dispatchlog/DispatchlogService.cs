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

namespace Liferay.SDK.Service.V73.Dispatchlog
{
	public class DispatchlogService : ServiceBase
	{
		public DispatchlogService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetDispatchLogsAsync(long dispatchTriggerId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("dispatchTriggerId", dispatchTriggerId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dispatch.dispatchlog/get-dispatch-logs", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetDispatchLogsCountAsync(long dispatchTriggerId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("dispatchTriggerId", dispatchTriggerId);

			var _command = new JsonObject()
			{
				{ "/dispatch.dispatchlog/get-dispatch-logs-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteDispatchLogAsync(long dispatchLogId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("dispatchLogId", dispatchLogId);

			var _command = new JsonObject()
			{
				{ "/dispatch.dispatchlog/delete-dispatch-log", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetDispatchLogAsync(long dispatchLogId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("dispatchLogId", dispatchLogId);

			var _command = new JsonObject()
			{
				{ "/dispatch.dispatchlog/get-dispatch-log", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}