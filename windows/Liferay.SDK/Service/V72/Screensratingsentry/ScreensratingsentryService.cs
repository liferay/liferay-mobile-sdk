//------------------------------------------------------------------------------
// <copyright file="ScreensratingsentryService.cs">
//    Copyright (c) 2014 Andrea Di Giorgi. All rights reserved.
//
//    This library is free software; you can redistribute it and/or modify it
//    under the terms of the GNU Lesser General Public License as published by
//    the Free Software Foundation; either version 2.1 of the License, or (at
//    your option) any later version.
//
//    This library is distributed in the hope that it will be useful, but
//    WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
//    or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
//    License for more details.
// </copyright>
// <author>Andrea Di Giorgi</author>
// <website>https://github.com/Ithildir/liferay-sdk-builder-windows</website>
//------------------------------------------------------------------------------

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Liferay.SDK.Service.V72.Screensratingsentry
{
	public class ScreensratingsentryService : ServiceBase
	{
		public ScreensratingsentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateRatingsEntryAsync(long classPK, string className, double score, int ratingsLength)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classPK", classPK);
			_parameters.Add("className", className);
			_parameters.Add("score", score);
			_parameters.Add("ratingsLength", ratingsLength);

			var _command = new JsonObject()
			{
				{ "$context/screens.screensratingsentry/update-ratings-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteRatingsEntryAsync(long classPK, string className, int ratingsLength)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classPK", classPK);
			_parameters.Add("className", className);
			_parameters.Add("ratingsLength", ratingsLength);

			var _command = new JsonObject()
			{
				{ "$context/screens.screensratingsentry/delete-ratings-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetRatingsEntriesAsync(long classPK, string className, int ratingsLength)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classPK", classPK);
			_parameters.Add("className", className);
			_parameters.Add("ratingsLength", ratingsLength);

			var _command = new JsonObject()
			{
				{ "$context/screens.screensratingsentry/get-ratings-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetRatingsEntriesAsync(long assetEntryId, int ratingsLength)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetEntryId", assetEntryId);
			_parameters.Add("ratingsLength", ratingsLength);

			var _command = new JsonObject()
			{
				{ "$context/screens.screensratingsentry/get-ratings-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}