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