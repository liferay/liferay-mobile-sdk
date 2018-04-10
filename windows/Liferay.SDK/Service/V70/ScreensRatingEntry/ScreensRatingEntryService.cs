//------------------------------------------------------------------------------
// <copyright file="ScreensRatingEntryService.cs">
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

namespace Liferay.SDK.Service.V70.ScreensRatingEntry
{
	public class ScreensRatingEntryService : ServiceBase
	{
		public ScreensRatingEntryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetRatingsEntriesAsync(long assetEntryId, int ratingsLength)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetEntryId", assetEntryId);
			_parameters.Add("ratingsLength", ratingsLength);

			var _command = new JsonObject()
			{
				{ "/screens.screensratingsentry/get-ratings-entries", _parameters }
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
				{ "/screens.screensratingsentry/get-ratings-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
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
				{ "/screens.screensratingsentry/update-ratings-entry", _parameters }
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
				{ "/screens.screensratingsentry/delete-ratings-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}