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

namespace Liferay.SDK.Service.V72.FlagsEntry
{
	public class FlagsEntryService : ServiceBase
	{
		public FlagsEntryService(ISession session)
			: base(session)
		{
		}

		public async Task AddEntryAsync(string className, long classPK, string reporterEmailAddress, long reportedUserId, string contentTitle, string contentURL, string reason, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("reporterEmailAddress", reporterEmailAddress);
			_parameters.Add("reportedUserId", reportedUserId);
			_parameters.Add("contentTitle", contentTitle);
			_parameters.Add("contentURL", contentURL);
			_parameters.Add("reason", reason);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/flags.flagsentry/add-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}