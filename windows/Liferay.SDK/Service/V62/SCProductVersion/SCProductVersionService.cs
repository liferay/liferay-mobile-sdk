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

namespace Liferay.SDK.Service.V62.SCProductVersion
{
	public class SCProductVersionService : ServiceBase
	{
		public SCProductVersionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddProductVersionAsync(long productEntryId, string version, string changeLog, string downloadPageURL, string directDownloadURL, bool testDirectDownloadURL, bool repoStoreArtifact, IEnumerable<long> frameworkVersionIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("productEntryId", productEntryId);
			_parameters.Add("version", version);
			_parameters.Add("changeLog", changeLog);
			_parameters.Add("downloadPageURL", downloadPageURL);
			_parameters.Add("directDownloadURL", directDownloadURL);
			_parameters.Add("testDirectDownloadURL", testDirectDownloadURL);
			_parameters.Add("repoStoreArtifact", repoStoreArtifact);
			_parameters.Add("frameworkVersionIds", frameworkVersionIds);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/scproductversion/add-product-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteProductVersionAsync(long productVersionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("productVersionId", productVersionId);

			var _command = new JsonObject()
			{
				{ "/scproductversion/delete-product-version", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetProductVersionAsync(long productVersionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("productVersionId", productVersionId);

			var _command = new JsonObject()
			{
				{ "/scproductversion/get-product-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetProductVersionsAsync(long productEntryId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("productEntryId", productEntryId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/scproductversion/get-product-versions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetProductVersionsCountAsync(long productEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("productEntryId", productEntryId);

			var _command = new JsonObject()
			{
				{ "/scproductversion/get-product-versions-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateProductVersionAsync(long productVersionId, string version, string changeLog, string downloadPageURL, string directDownloadURL, bool testDirectDownloadURL, bool repoStoreArtifact, IEnumerable<long> frameworkVersionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("productVersionId", productVersionId);
			_parameters.Add("version", version);
			_parameters.Add("changeLog", changeLog);
			_parameters.Add("downloadPageURL", downloadPageURL);
			_parameters.Add("directDownloadURL", directDownloadURL);
			_parameters.Add("testDirectDownloadURL", testDirectDownloadURL);
			_parameters.Add("repoStoreArtifact", repoStoreArtifact);
			_parameters.Add("frameworkVersionIds", frameworkVersionIds);

			var _command = new JsonObject()
			{
				{ "/scproductversion/update-product-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}