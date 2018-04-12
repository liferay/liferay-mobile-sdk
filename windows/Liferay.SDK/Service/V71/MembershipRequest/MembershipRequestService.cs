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

namespace Liferay.SDK.Service.V71.MembershipRequest
{
	public class MembershipRequestService : ServiceBase
	{
		public MembershipRequestService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddMembershipRequestAsync(long groupId, string comments, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("comments", comments);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/membershiprequest/add-membership-request", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateStatusAsync(long membershipRequestId, string reviewComments, long statusId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("membershipRequestId", membershipRequestId);
			_parameters.Add("reviewComments", reviewComments);
			_parameters.Add("statusId", statusId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/membershiprequest/update-status", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteMembershipRequestsAsync(long groupId, long statusId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("statusId", statusId);

			var _command = new JsonObject()
			{
				{ "/membershiprequest/delete-membership-requests", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetMembershipRequestAsync(long membershipRequestId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("membershipRequestId", membershipRequestId);

			var _command = new JsonObject()
			{
				{ "/membershiprequest/get-membership-request", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}