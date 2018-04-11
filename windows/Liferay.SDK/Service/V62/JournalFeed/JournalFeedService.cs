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

namespace Liferay.SDK.Service.V62.JournalFeed
{
	public class JournalFeedService : ServiceBase
	{
		public JournalFeedService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddFeedAsync(long groupId, string feedId, bool autoFeedId, string name, string description, string type, string structureId, string templateId, string rendererTemplateId, int delta, string orderByCol, string orderByType, string targetLayoutFriendlyUrl, string targetPortletId, string contentField, string feedType, double feedVersion, IDictionary<string, object> serviceContext)
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
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalfeed/add-feed", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
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

		public async Task<IDictionary<string, object>> GetFeedAsync(long feedId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("feedId", feedId);

			var _command = new JsonObject()
			{
				{ "/journalfeed/get-feed", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetFeedAsync(long groupId, string feedId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("feedId", feedId);

			var _command = new JsonObject()
			{
				{ "/journalfeed/get-feed", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateFeedAsync(long groupId, string feedId, string name, string description, string type, string structureId, string templateId, string rendererTemplateId, int delta, string orderByCol, string orderByType, string targetLayoutFriendlyUrl, string targetPortletId, string contentField, string feedType, double feedVersion, IDictionary<string, object> serviceContext)
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
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalfeed/update-feed", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}