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

namespace Liferay.SDK.Service.V73.DLFileVersion
{
	public class DLFileVersionService : ServiceBase
	{
		public DLFileVersionService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetFileVersionsAsync(long fileEntryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfileversion/get-file-versions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFileVersionsCountAsync(long fileEntryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfileversion/get-file-versions-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetLatestFileVersionAsync(long fileEntryId, bool excludeWorkingCopy)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("excludeWorkingCopy", excludeWorkingCopy);

			var _command = new JsonObject()
			{
				{ "/dlfileversion/get-latest-file-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetLatestFileVersionAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileversion/get-latest-file-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileVersionAsync(long fileVersionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileVersionId", fileVersionId);

			var _command = new JsonObject()
			{
				{ "/dlfileversion/get-file-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}