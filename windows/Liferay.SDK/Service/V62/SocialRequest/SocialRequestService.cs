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

namespace Liferay.SDK.Service.V62.SocialRequest
{
	public class SocialRequestService : ServiceBase
	{
		public SocialRequestService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> UpdateRequestAsync(long requestId, int status, IDictionary<string, object> themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("requestId", requestId);
			_parameters.Add("status", status);
			_parameters.Add("themeDisplay", themeDisplay);

			var _command = new JsonObject()
			{
				{ "/socialrequest/update-request", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}