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

namespace Liferay.SDK.Service.V72.Powwowparticipant
{
	public class PowwowparticipantService : ServiceBase
	{
		public PowwowparticipantService(ISession session)
			: base(session)
		{
		}

		public async Task<long> GetPowwowParticipantsCountAsync(long powwowMeetingId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("powwowMeetingId", powwowMeetingId);

			var _command = new JsonObject()
			{
				{ "/powwow-portlet.powwowparticipant/get-powwow-participants-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> DeletePowwowParticipantAsync(JsonObjectWrapper powwowParticipant)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "powwowParticipant", "$languageUtil.getJSONWrapperClassName($parameter.type)", powwowParticipant);

			var _command = new JsonObject()
			{
				{ "/powwow-portlet.powwowparticipant/delete-powwow-participant", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePowwowParticipantAsync(long powwowParticipantId, long powwowMeetingId, string name, long participantUserId, string emailAddress, int type, int status, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("powwowParticipantId", powwowParticipantId);
			_parameters.Add("powwowMeetingId", powwowMeetingId);
			_parameters.Add("name", name);
			_parameters.Add("participantUserId", participantUserId);
			_parameters.Add("emailAddress", emailAddress);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/powwow-portlet.powwowparticipant/update-powwow-participant", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetPowwowParticipantsAsync(long powwowMeetingId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("powwowMeetingId", powwowMeetingId);

			var _command = new JsonObject()
			{
				{ "/powwow-portlet.powwowparticipant/get-powwow-participants", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}