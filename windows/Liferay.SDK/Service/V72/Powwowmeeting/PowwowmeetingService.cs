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

namespace Liferay.SDK.Service.V72.Powwowmeeting
{
	public class PowwowmeetingService : ServiceBase
	{
		public PowwowmeetingService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> DeletePowwowMeetingAsync(long powwowMeetingId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("powwowMeetingId", powwowMeetingId);

			var _command = new JsonObject()
			{
				{ "/powwow-portlet.powwowmeeting/delete-powwow-meeting", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePowwowMeetingAsync(long powwowMeetingId, long powwowServerId, string name, string description, string providerType, IDictionary<string, object> providerTypeMetadataMap, string languageId, long calendarBookingId, int status, IEnumerable<object> powwowParticipants, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("powwowMeetingId", powwowMeetingId);
			_parameters.Add("powwowServerId", powwowServerId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("providerType", providerType);
			_parameters.Add("providerTypeMetadataMap", providerTypeMetadataMap);
			_parameters.Add("languageId", languageId);
			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("status", status);
			_parameters.Add("powwowParticipants", powwowParticipants);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/powwow-portlet.powwowmeeting/update-powwow-meeting", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetPowwowMeetingAsync(long powwowMeetingId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("powwowMeetingId", powwowMeetingId);

			var _command = new JsonObject()
			{
				{ "/powwow-portlet.powwowmeeting/get-powwow-meeting", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddPowwowMeetingAsync(long groupId, string portletId, long powwowServerId, string name, string description, string providerType, IDictionary<string, object> providerTypeMetadataMap, string languageId, long calendarBookingId, int status, IEnumerable<object> powwowParticipants, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("powwowServerId", powwowServerId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("providerType", providerType);
			_parameters.Add("providerTypeMetadataMap", providerTypeMetadataMap);
			_parameters.Add("languageId", languageId);
			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("status", status);
			_parameters.Add("powwowParticipants", powwowParticipants);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/powwow-portlet.powwowmeeting/add-powwow-meeting", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetPowwowMeetingsCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/powwow-portlet.powwowmeeting/get-powwow-meetings-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetPowwowMeetingsAsync(long groupId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/powwow-portlet.powwowmeeting/get-powwow-meetings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}