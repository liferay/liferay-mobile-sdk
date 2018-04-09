//------------------------------------------------------------------------------
// <copyright file="SCProductEntryService.cs">
//    Copyright (c) 2014-present Andrea Di Giorgi
//
//    Permission is hereby granted, free of charge, to any person obtaining a
//    copy of this software and associated documentation files (the "Software"),
//    to deal in the Software without restriction, including without limitation
//    the rights to use, copy, modify, merge, publish, distribute, sublicense,
//    and/or sell copies of the Software, and to permit persons to whom the
//    Software is furnished to do so, subject to the following conditions:
//
//    The above copyright notice and this permission notice shall be included in
//    all copies or substantial portions of the Software.
//
//    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
//    THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
//    FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
//    DEALINGS IN THE SOFTWARE.
// </copyright>
// <author>Andrea Di Giorgi</author>
// <website>https://github.com/Ithildir/liferay-sdk-builder-windows</website>
//------------------------------------------------------------------------------

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