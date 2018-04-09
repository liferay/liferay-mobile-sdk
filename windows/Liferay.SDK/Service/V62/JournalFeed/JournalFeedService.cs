//------------------------------------------------------------------------------
// <copyright file="JournalFeedService.cs">
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

namespace Liferay.SDK.Service.V62.JournalFeed
{
	public class JournalFeedService : ServiceBase
	{
		public JournalFeedService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddFeedAsync(long groupId, string feedId, bool autoFeedId, string name, string description, string type, string structureId, string templateId, string rendererTemplateId, int delta, string orderByCol, string orderByType, string targetLayoutFriendlyUrl, string targetPortletId, string contentField, string feedType, double feedVersion, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("feedId", feedId);
			_parameters.Add("autoFeedId", autoFeedId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("structureId", structureId);
			_parameters.Add("templateId", templateId);
			_parameters.Add("rendererTemplateId", rendererTemplateId);
			_parameters.Add("delta", delta);
			_parameters.Add("orderByCol", orderByCol);
			_parameters.Add("orderByType", orderByType);
			_parameters.Add("targetLayoutFriendlyUrl", targetLayoutFriendlyUrl);
			_parameters.Add("targetPortletId", targetPortletId);
			_parameters.Add("contentField", contentField);
			_parameters.Add("feedType", feedType);
			_parameters.Add("feedVersion", feedVersion);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalfeed/add-feed", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFeedAsync(long feedId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("feedId", feedId);

			var _command = new JsonObject()
			{
				{ "/journalfeed/delete-feed", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFeedAsync(long groupId, string feedId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("feedId", feedId);

			var _command = new JsonObject()
			{
				{ "/journalfeed/delete-feed", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetFeedAsync(long feedId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("feedId", feedId);

			var _command = new JsonObject()
			{
				{ "/journalfeed/get-feed", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFeedAsync(long groupId, string feedId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("feedId", feedId);

			var _command = new JsonObject()
			{
				{ "/journalfeed/get-feed", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFeedAsync(long groupId, string feedId, string name, string description, string type, string structureId, string templateId, string rendererTemplateId, int delta, string orderByCol, string orderByType, string targetLayoutFriendlyUrl, string targetPortletId, string contentField, string feedType, double feedVersion, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("feedId", feedId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("structureId", structureId);
			_parameters.Add("templateId", templateId);
			_parameters.Add("rendererTemplateId", rendererTemplateId);
			_parameters.Add("delta", delta);
			_parameters.Add("orderByCol", orderByCol);
			_parameters.Add("orderByType", orderByType);
			_parameters.Add("targetLayoutFriendlyUrl", targetLayoutFriendlyUrl);
			_parameters.Add("targetPortletId", targetPortletId);
			_parameters.Add("contentField", contentField);
			_parameters.Add("feedType", feedType);
			_parameters.Add("feedVersion", feedVersion);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalfeed/update-feed", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}