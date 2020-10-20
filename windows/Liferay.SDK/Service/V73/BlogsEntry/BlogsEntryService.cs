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

namespace Liferay.SDK.Service.V73.BlogsEntry
{
	public class BlogsEntryService : ServiceBase
	{
		public BlogsEntryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateEntryAsync(long entryId, string title, string subtitle, string description, string content, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, bool allowPingbacks, bool allowTrackbacks, IEnumerable<string> trackbacks, string coverImageCaption, JsonObjectWrapper coverImageImageSelector, JsonObjectWrapper smallImageImageSelector, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("title", title);
			_parameters.Add("subtitle", subtitle);
			_parameters.Add("description", description);
			_parameters.Add("content", content);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("allowPingbacks", allowPingbacks);
			_parameters.Add("allowTrackbacks", allowTrackbacks);
			_parameters.Add("trackbacks", trackbacks);
			_parameters.Add("coverImageCaption", coverImageCaption);
			this.MangleWrapper(_parameters, "coverImageImageSelector", "$languageUtil.getJSONWrapperClassName($parameter.type)", coverImageImageSelector);
			this.MangleWrapper(_parameters, "smallImageImageSelector", "$languageUtil.getJSONWrapperClassName($parameter.type)", smallImageImageSelector);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/update-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateEntryAsync(long entryId, string title, string subtitle, string urlTitle, string description, string content, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, bool allowPingbacks, bool allowTrackbacks, IEnumerable<string> trackbacks, string coverImageCaption, JsonObjectWrapper coverImageImageSelector, JsonObjectWrapper smallImageImageSelector, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("title", title);
			_parameters.Add("subtitle", subtitle);
			_parameters.Add("urlTitle", urlTitle);
			_parameters.Add("description", description);
			_parameters.Add("content", content);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("allowPingbacks", allowPingbacks);
			_parameters.Add("allowTrackbacks", allowTrackbacks);
			_parameters.Add("trackbacks", trackbacks);
			_parameters.Add("coverImageCaption", coverImageCaption);
			this.MangleWrapper(_parameters, "coverImageImageSelector", "$languageUtil.getJSONWrapperClassName($parameter.type)", coverImageImageSelector);
			this.MangleWrapper(_parameters, "smallImageImageSelector", "$languageUtil.getJSONWrapperClassName($parameter.type)", smallImageImageSelector);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/update-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCompanyEntriesAsync(long companyId, long displayDate, int status, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("displayDate", displayDate);
			_parameters.Add("status", status);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-company-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupEntriesAsync(long groupId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-group-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupEntriesAsync(long groupId, int status, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-group-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupEntriesAsync(long groupId, long displayDate, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("displayDate", displayDate);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-group-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupEntriesAsync(long groupId, long displayDate, int status, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("displayDate", displayDate);
			_parameters.Add("status", status);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-group-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupEntriesAsync(long groupId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-group-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddAttachmentsFolderAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/add-attachments-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UnsubscribeAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/unsubscribe", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SubscribeAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/subscribe", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetEntriesPrevAndNextAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-entries-prev-and-next", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupEntriesCountAsync(long groupId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-group-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupEntriesCountAsync(long groupId, long displayDate, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("displayDate", displayDate);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-group-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupsEntriesAsync(long companyId, long groupId, long displayDate, int status, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("displayDate", displayDate);
			_parameters.Add("status", status);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-groups-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupUserEntriesAsync(long groupId, long userId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-group-user-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupUserEntriesAsync(long groupId, long userId, IEnumerable<int> statuses, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("statuses", statuses);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-group-user-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupUserEntriesCountAsync(long groupId, long userId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-group-user-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupUserEntriesCountAsync(long groupId, long userId, IEnumerable<int> statuses)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("statuses", statuses);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-group-user-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetOrganizationEntriesAsync(long organizationId, long displayDate, int status, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("displayDate", displayDate);
			_parameters.Add("status", status);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-organization-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> MoveEntryToTrashAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/move-entry-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task RestoreEntryFromTrashAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/restore-entry-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<string> GetCompanyEntriesRssAsync(long companyId, long displayDate, int status, int max, string type, double version, string displayStyle, string feedURL, string entryURL, JsonObjectWrapper themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("displayDate", displayDate);
			_parameters.Add("status", status);
			_parameters.Add("max", max);
			_parameters.Add("type", type);
			_parameters.Add("version", version);
			_parameters.Add("displayStyle", displayStyle);
			_parameters.Add("feedURL", feedURL);
			_parameters.Add("entryURL", entryURL);
			this.MangleWrapper(_parameters, "themeDisplay", "$languageUtil.getJSONWrapperClassName($parameter.type)", themeDisplay);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-company-entries-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<string> GetGroupEntriesRssAsync(long groupId, long displayDate, int status, int max, string type, double version, string displayStyle, string feedURL, string entryURL, JsonObjectWrapper themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("displayDate", displayDate);
			_parameters.Add("status", status);
			_parameters.Add("max", max);
			_parameters.Add("type", type);
			_parameters.Add("version", version);
			_parameters.Add("displayStyle", displayStyle);
			_parameters.Add("feedURL", feedURL);
			_parameters.Add("entryURL", entryURL);
			this.MangleWrapper(_parameters, "themeDisplay", "$languageUtil.getJSONWrapperClassName($parameter.type)", themeDisplay);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-group-entries-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<string> GetOrganizationEntriesRssAsync(long organizationId, long displayDate, int status, int max, string type, double version, string displayStyle, string feedURL, string entryURL, JsonObjectWrapper themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("displayDate", displayDate);
			_parameters.Add("status", status);
			_parameters.Add("max", max);
			_parameters.Add("type", type);
			_parameters.Add("version", version);
			_parameters.Add("displayStyle", displayStyle);
			_parameters.Add("feedURL", feedURL);
			_parameters.Add("entryURL", entryURL);
			this.MangleWrapper(_parameters, "themeDisplay", "$languageUtil.getJSONWrapperClassName($parameter.type)", themeDisplay);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-organization-entries-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<dynamic> AddEntryAsync(string title, string subtitle, string description, string content, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, bool allowPingbacks, bool allowTrackbacks, IEnumerable<string> trackbacks, string coverImageCaption, JsonObjectWrapper coverImageImageSelector, JsonObjectWrapper smallImageImageSelector, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("title", title);
			_parameters.Add("subtitle", subtitle);
			_parameters.Add("description", description);
			_parameters.Add("content", content);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("allowPingbacks", allowPingbacks);
			_parameters.Add("allowTrackbacks", allowTrackbacks);
			_parameters.Add("trackbacks", trackbacks);
			_parameters.Add("coverImageCaption", coverImageCaption);
			this.MangleWrapper(_parameters, "coverImageImageSelector", "$languageUtil.getJSONWrapperClassName($parameter.type)", coverImageImageSelector);
			this.MangleWrapper(_parameters, "smallImageImageSelector", "$languageUtil.getJSONWrapperClassName($parameter.type)", smallImageImageSelector);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/add-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddEntryAsync(string title, string subtitle, string urlTitle, string description, string content, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, bool allowPingbacks, bool allowTrackbacks, IEnumerable<string> trackbacks, string coverImageCaption, JsonObjectWrapper coverImageImageSelector, JsonObjectWrapper smallImageImageSelector, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("title", title);
			_parameters.Add("subtitle", subtitle);
			_parameters.Add("urlTitle", urlTitle);
			_parameters.Add("description", description);
			_parameters.Add("content", content);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("allowPingbacks", allowPingbacks);
			_parameters.Add("allowTrackbacks", allowTrackbacks);
			_parameters.Add("trackbacks", trackbacks);
			_parameters.Add("coverImageCaption", coverImageCaption);
			this.MangleWrapper(_parameters, "coverImageImageSelector", "$languageUtil.getJSONWrapperClassName($parameter.type)", coverImageImageSelector);
			this.MangleWrapper(_parameters, "smallImageImageSelector", "$languageUtil.getJSONWrapperClassName($parameter.type)", smallImageImageSelector);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/add-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetEntryAsync(long groupId, string urlTitle)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("urlTitle", urlTitle);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/get-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/blogs.blogsentry/delete-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}