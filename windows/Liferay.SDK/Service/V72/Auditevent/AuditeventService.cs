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

namespace Liferay.SDK.Service.V72.Auditevent
{
	public class AuditeventService : ServiceBase
	{
		public AuditeventService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetAuditEventsAsync(long companyId, long userId, string userName, long createDateGT, long createDateLT, string eventType, string className, string classPK, string clientHost, string clientIP, string serverName, int serverPort, string sessionID, bool andSearch, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);
			_parameters.Add("userName", userName);
			_parameters.Add("createDateGT", createDateGT);
			_parameters.Add("createDateLT", createDateLT);
			_parameters.Add("eventType", eventType);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("clientHost", clientHost);
			_parameters.Add("clientIP", clientIP);
			_parameters.Add("serverName", serverName);
			_parameters.Add("serverPort", serverPort);
			_parameters.Add("sessionID", sessionID);
			_parameters.Add("andSearch", andSearch);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/audit.auditevent/get-audit-events", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAuditEventsAsync(long companyId, long userId, string userName, long createDateGT, long createDateLT, string eventType, string className, string classPK, string clientHost, string clientIP, string serverName, int serverPort, string sessionID, bool andSearch, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);
			_parameters.Add("userName", userName);
			_parameters.Add("createDateGT", createDateGT);
			_parameters.Add("createDateLT", createDateLT);
			_parameters.Add("eventType", eventType);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("clientHost", clientHost);
			_parameters.Add("clientIP", clientIP);
			_parameters.Add("serverName", serverName);
			_parameters.Add("serverPort", serverPort);
			_parameters.Add("sessionID", sessionID);
			_parameters.Add("andSearch", andSearch);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/audit.auditevent/get-audit-events", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAuditEventsAsync(long companyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/audit.auditevent/get-audit-events", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAuditEventsAsync(long companyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/audit.auditevent/get-audit-events", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetAuditEventsCountAsync(long companyId, long userId, string userName, long createDateGT, long createDateLT, string eventType, string className, string classPK, string clientHost, string clientIP, string serverName, int serverPort, string sessionID, bool andSearch)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);
			_parameters.Add("userName", userName);
			_parameters.Add("createDateGT", createDateGT);
			_parameters.Add("createDateLT", createDateLT);
			_parameters.Add("eventType", eventType);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("clientHost", clientHost);
			_parameters.Add("clientIP", clientIP);
			_parameters.Add("serverName", serverName);
			_parameters.Add("serverPort", serverPort);
			_parameters.Add("sessionID", sessionID);
			_parameters.Add("andSearch", andSearch);

			var _command = new JsonObject()
			{
				{ "/audit.auditevent/get-audit-events-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetAuditEventsCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/audit.auditevent/get-audit-events-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}