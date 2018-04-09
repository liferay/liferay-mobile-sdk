//------------------------------------------------------------------------------
// <copyright file="SCProductVersionService.cs">
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