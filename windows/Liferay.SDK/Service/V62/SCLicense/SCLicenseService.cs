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

namespace Liferay.SDK.Service.V62.SCLicense
{
	public class SCLicenseService : ServiceBase
	{
		public SCLicenseService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddLicenseAsync(string name, string url, bool openSource, bool active, bool recommended)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("url", url);
			_parameters.Add("openSource", openSource);
			_parameters.Add("active", active);
			_parameters.Add("recommended", recommended);

			var _command = new JsonObject()
			{
				{ "/sclicense/add-license", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteLicenseAsync(long licenseId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("licenseId", licenseId);

			var _command = new JsonObject()
			{
				{ "/sclicense/delete-license", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetLicenseAsync(long licenseId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("licenseId", licenseId);

			var _command = new JsonObject()
			{
				{ "/sclicense/get-license", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLicenseAsync(long licenseId, string name, string url, bool openSource, bool active, bool recommended)
		{
			var _parameters = new JsonObject();

			_parameters.Add("licenseId", licenseId);
			_parameters.Add("name", name);
			_parameters.Add("url", url);
			_parameters.Add("openSource", openSource);
			_parameters.Add("active", active);
			_parameters.Add("recommended", recommended);

			var _command = new JsonObject()
			{
				{ "/sclicense/update-license", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}