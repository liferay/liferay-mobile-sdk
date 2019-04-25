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

namespace Liferay.SDK.Service.V72.Wedeployauthapp
{
	public class WedeployauthappService : ServiceBase
	{
		public WedeployauthappService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddWeDeployAuthAppAsync(string name, string redirectURI, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("redirectURI", redirectURI);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/wedeployauth.wedeployauthapp/add-we-deploy-auth-app", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteWeDeployAuthAppAsync(long weDeployAuthAppId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("weDeployAuthAppId", weDeployAuthAppId);

			var _command = new JsonObject()
			{
				{ "/wedeployauth.wedeployauthapp/delete-we-deploy-auth-app", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}