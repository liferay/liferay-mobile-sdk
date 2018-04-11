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

namespace Liferay.SDK.Service.V62.SCProductEntry
{
	public class SCProductEntryService : ServiceBase
	{
		public SCProductEntryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddProductEntryAsync(string name, string type, string tags, string shortDescription, string longDescription, string pageURL, string author, string repoGroupId, string repoArtifactId, IEnumerable<long> licenseIds, IEnumerable<object> thumbnails, IEnumerable<object> fullImages, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("tags", tags);
			_parameters.Add("shortDescription", shortDescription);
			_parameters.Add("longDescription", longDescription);
			_parameters.Add("pageURL", pageURL);
			_parameters.Add("author", author);
			_parameters.Add("repoGroupId", repoGroupId);
			_parameters.Add("repoArtifactId", repoArtifactId);
			_parameters.Add("licenseIds", licenseIds);
			_parameters.Add("thumbnails", thumbnails);
			_parameters.Add("fullImages", fullImages);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/scproductentry/add-product-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteProductEntryAsync(long productEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("productEntryId", productEntryId);

			var _command = new JsonObject()
			{
				{ "/scproductentry/delete-product-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetProductEntryAsync(long productEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("productEntryId", productEntryId);

			var _command = new JsonObject()
			{
				{ "/scproductentry/get-product-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateProductEntryAsync(long productEntryId, string name, string type, string tags, string shortDescription, string longDescription, string pageURL, string author, string repoGroupId, string repoArtifactId, IEnumerable<long> licenseIds, IEnumerable<object> thumbnails, IEnumerable<object> fullImages)
		{
			var _parameters = new JsonObject();

			_parameters.Add("productEntryId", productEntryId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("tags", tags);
			_parameters.Add("shortDescription", shortDescription);
			_parameters.Add("longDescription", longDescription);
			_parameters.Add("pageURL", pageURL);
			_parameters.Add("author", author);
			_parameters.Add("repoGroupId", repoGroupId);
			_parameters.Add("repoArtifactId", repoArtifactId);
			_parameters.Add("licenseIds", licenseIds);
			_parameters.Add("thumbnails", thumbnails);
			_parameters.Add("fullImages", fullImages);

			var _command = new JsonObject()
			{
				{ "/scproductentry/update-product-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}