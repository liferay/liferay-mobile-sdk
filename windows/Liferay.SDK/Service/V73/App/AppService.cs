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

namespace Liferay.SDK.Service.V73.App
{
	public class AppService : ServiceBase
	{
		public AppService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> DeleteAppAsync(long appId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("appId", appId);

			var _command = new JsonObject()
			{
				{ "/marketplace.app/delete-app", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateAppAsync(Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/marketplace.app/update-app", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task InstallAppAsync(long remoteAppId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("remoteAppId", remoteAppId);

			var _command = new JsonObject()
			{
				{ "/marketplace.app/install-app", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UninstallAppAsync(long remoteAppId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("remoteAppId", remoteAppId);

			var _command = new JsonObject()
			{
				{ "/marketplace.app/uninstall-app", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}