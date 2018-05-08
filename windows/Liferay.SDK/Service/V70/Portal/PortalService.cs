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

namespace Liferay.SDK.Service.V70.Portal
{
	public class PortalService : ServiceBase
	{
		public PortalService(ISession session)
			: base(session)
		{
		}

		public async Task<long> GetBuildNumberAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/portal/get-build-number", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<string> GetVersionAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/portal/get-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}
	}
}