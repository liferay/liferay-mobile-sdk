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

namespace Liferay.SDK.Service.V73.JournalFeed
{
	public class JournalFeedService : ServiceBase
	{
		public JournalFeedService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetFeedAsync(long groupId, string feedId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("feedId", feedId);

			var _command = new JsonObject()
			{
				{ "/journal.journalfeed/get-feed", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFeedAsync(long feedId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("feedId", feedId);

			var _command = new JsonObject()
			{
				{ "/journal.journalfeed/get-feed", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFeedAsync(long groupId, string feedId, bool autoFeedId, string name, string description, string ddmStructureKey, string ddmTemplateKey, string ddmRendererTemplateKey, int delta, string orderByCol, string orderByType, string targetLayoutFriendlyUrl, string targetPortletId, string contentField, string feedType, double feedVersion, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("feedId", feedId);
			_parameters.Add("autoFeedId", autoFeedId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
			_parameters.Add("ddmTemplateKey", ddmTemplateKey);
			_parameters.Add("ddmRendererTemplateKey", ddmRendererTemplateKey);
			_parameters.Add("delta", delta);
			_parameters.Add("orderByCol", orderByCol);
			_parameters.Add("orderByType", orderByType);
			_parameters.Add("targetLayoutFriendlyUrl", targetLayoutFriendlyUrl);
			_parameters.Add("targetPortletId", targetPortletId);
			_parameters.Add("contentField", contentField);
			_parameters.Add("feedType", feedType);
			_parameters.Add("feedVersion", feedVersion);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journal.journalfeed/add-feed", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFeedAsync(long groupId, string feedId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("feedId", feedId);

			var _command = new JsonObject()
			{
				{ "/journal.journalfeed/delete-feed", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFeedAsync(long feedId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("feedId", feedId);

			var _command = new JsonObject()
			{
				{ "/journal.journalfeed/delete-feed", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateFeedAsync(long groupId, string feedId, string name, string description, string ddmStructureKey, string ddmTemplateKey, string ddmRendererTemplateKey, int delta, string orderByCol, string orderByType, string targetLayoutFriendlyUrl, string targetPortletId, string contentField, string feedType, double feedVersion, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("feedId", feedId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
			_parameters.Add("ddmTemplateKey", ddmTemplateKey);
			_parameters.Add("ddmRendererTemplateKey", ddmRendererTemplateKey);
			_parameters.Add("delta", delta);
			_parameters.Add("orderByCol", orderByCol);
			_parameters.Add("orderByType", orderByType);
			_parameters.Add("targetLayoutFriendlyUrl", targetLayoutFriendlyUrl);
			_parameters.Add("targetPortletId", targetPortletId);
			_parameters.Add("contentField", contentField);
			_parameters.Add("feedType", feedType);
			_parameters.Add("feedVersion", feedVersion);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journal.journalfeed/update-feed", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}