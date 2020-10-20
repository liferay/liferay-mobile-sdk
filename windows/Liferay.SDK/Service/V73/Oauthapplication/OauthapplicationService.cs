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

namespace Liferay.SDK.Service.V73.Oauthapplication
{
	public class OauthapplicationService : ServiceBase
	{
		public OauthapplicationService(ISession session)
			: base(session)
		{
		}

		public async Task DeleteLogoAsync(long oAuthApplicationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("oAuthApplicationId", oAuthApplicationId);

			var _command = new JsonObject()
			{
				{ "/oauth.oauthapplication/delete-logo", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddOAuthApplicationAsync(string name, string description, int accessLevel, bool shareableAccessToken, string callbackURI, string websiteURL, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("accessLevel", accessLevel);
			_parameters.Add("shareableAccessToken", shareableAccessToken);
			_parameters.Add("callbackURI", callbackURI);
			_parameters.Add("websiteURL", websiteURL);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/oauth.oauthapplication/add-o-auth-application", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateOAuthApplicationAsync(long oAuthApplicationId, string name, string description, bool shareableAccessToken, string callbackURI, string websiteURL, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("oAuthApplicationId", oAuthApplicationId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("shareableAccessToken", shareableAccessToken);
			_parameters.Add("callbackURI", callbackURI);
			_parameters.Add("websiteURL", websiteURL);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/oauth.oauthapplication/update-o-auth-application", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteOAuthApplicationAsync(long oAuthApplicationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("oAuthApplicationId", oAuthApplicationId);

			var _command = new JsonObject()
			{
				{ "/oauth.oauthapplication/delete-o-auth-application", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}