//------------------------------------------------------------------------------
// <copyright file="StagingService.cs">
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

namespace Liferay.SDK.Service.V62.Staging
{
	public class StagingService : ServiceBase
	{
		public StagingService(ISession session)
			: base(session)
		{
		}

		public async Task CleanUpStagingRequestAsync(long stagingRequestId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("stagingRequestId", stagingRequestId);

			var _command = new JsonObject()
			{
				{ "/staging/clean-up-staging-request", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> CreateStagingRequestAsync(long groupId, string checksum)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("checksum", checksum);

			var _command = new JsonObject()
			{
				{ "/staging/create-staging-request", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task PublishStagingRequestAsync(long stagingRequestId, bool privateLayout, IDictionary<string, object> parameterMap)
		{
			var _parameters = new JsonObject();

			_parameters.Add("stagingRequestId", stagingRequestId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);

			var _command = new JsonObject()
			{
				{ "/staging/publish-staging-request", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateStagingRequestAsync(long stagingRequestId, string fileName, byte[] bytes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("stagingRequestId", stagingRequestId);
			_parameters.Add("fileName", fileName);
			_parameters.Add("bytes", bytes);

			var _command = new JsonObject()
			{
				{ "/staging/update-staging-request", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> ValidateStagingRequestAsync(long stagingRequestId, bool privateLayout, IDictionary<string, object> parameterMap)
		{
			var _parameters = new JsonObject();

			_parameters.Add("stagingRequestId", stagingRequestId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);

			var _command = new JsonObject()
			{
				{ "/staging/validate-staging-request", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}