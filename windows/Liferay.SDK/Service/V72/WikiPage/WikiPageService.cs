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

namespace Liferay.SDK.Service.V72.WikiPage
{
	public class WikiPageService : ServiceBase
	{
		public WikiPageService(ISession session)
			: base(session)
		{
		}

		public async Task RestorePageFromTrashAsync(long resourcePrimKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("resourcePrimKey", resourcePrimKey);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/restore-page-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddPageAttachmentAsync(long nodeId, string title, string fileName, Stream file, string mimeType)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("fileName", fileName);
			_parameters.Add("file", file);
			_parameters.Add("mimeType", mimeType);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/add-page-attachment", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> AddPageAttachmentsAsync(long nodeId, string title, IEnumerable<object> inputStreamOVPs)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("inputStreamOVPs", inputStreamOVPs);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/add-page-attachments", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task ChangeParentAsync(long nodeId, string title, string newParentTitle, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("newParentTitle", newParentTitle);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/change-parent", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task CopyPageAttachmentsAsync(long templateNodeId, string templateTitle, long nodeId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateNodeId", templateNodeId);
			_parameters.Add("templateTitle", templateTitle);
			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/copy-page-attachments", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeletePageAsync(long nodeId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/delete-page", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeletePageAttachmentAsync(long nodeId, string title, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/delete-page-attachment", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeletePageAttachmentsAsync(long nodeId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/delete-page-attachments", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteTrashPageAttachmentsAsync(long nodeId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/delete-trash-page-attachments", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DiscardDraftAsync(long nodeId, string title, double version)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("version", version);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/discard-draft", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetDraftPageAsync(long nodeId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-draft-page", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetPagesCountAsync(long groupId, long nodeId, bool head)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nodeId", nodeId);
			_parameters.Add("head", head);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-pages-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetPagesCountAsync(long groupId, long nodeId, bool head, long userId, bool includeOwner, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nodeId", nodeId);
			_parameters.Add("head", head);
			_parameters.Add("userId", userId);
			_parameters.Add("includeOwner", includeOwner);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-pages-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetPagesCountAsync(long groupId, long userId, long nodeId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("nodeId", nodeId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-pages-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRecentChangesAsync(long groupId, long nodeId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nodeId", nodeId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-recent-changes", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetRecentChangesCountAsync(long groupId, long nodeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nodeId", nodeId);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-recent-changes-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> MovePageAttachmentToTrashAsync(long nodeId, string title, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/move-page-attachment-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MovePageToTrashAsync(long nodeId, string title, double version)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("version", version);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/move-page-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MovePageToTrashAsync(long nodeId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/move-page-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task RenamePageAsync(long nodeId, string title, string newTitle, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("newTitle", newTitle);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/rename-page", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RestorePageAttachmentFromTrashAsync(long nodeId, string title, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/restore-page-attachment-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> RevertPageAsync(long nodeId, string title, double version, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("version", version);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/revert-page", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task SubscribePageAsync(long nodeId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/subscribe-page", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsubscribePageAsync(long nodeId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/unsubscribe-page", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdatePageAsync(long nodeId, string title, double version, string content, string summary, bool minorEdit, string format, string parentTitle, string redirectTitle, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("version", version);
			_parameters.Add("content", content);
			_parameters.Add("summary", summary);
			_parameters.Add("minorEdit", minorEdit);
			_parameters.Add("format", format);
			_parameters.Add("parentTitle", parentTitle);
			_parameters.Add("redirectTitle", redirectTitle);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/update-page", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetNodePagesAsync(long nodeId, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-node-pages", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<string> GetNodePagesRssAsync(long nodeId, int max, string type, double version, string displayStyle, string feedURL, string entryURL, string attachmentURLPrefix)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("max", max);
			_parameters.Add("type", type);
			_parameters.Add("version", version);
			_parameters.Add("displayStyle", displayStyle);
			_parameters.Add("feedURL", feedURL);
			_parameters.Add("entryURL", entryURL);
			_parameters.Add("attachmentURLPrefix", attachmentURLPrefix);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-node-pages-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<string> GetPagesRssAsync(long nodeId, string title, int max, string type, double version, string displayStyle, string feedURL, string entryURL, string attachmentURLPrefix, string locale)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("max", max);
			_parameters.Add("type", type);
			_parameters.Add("version", version);
			_parameters.Add("displayStyle", displayStyle);
			_parameters.Add("feedURL", feedURL);
			_parameters.Add("entryURL", entryURL);
			_parameters.Add("attachmentURLPrefix", attachmentURLPrefix);
			_parameters.Add("locale", locale);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-pages-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task DeleteTempFileEntryAsync(long nodeId, string folderName, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("folderName", folderName);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/delete-temp-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<string>> GetTempFileNamesAsync(long nodeId, string folderName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("folderName", folderName);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-temp-file-names", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<string>();
		}

		public async Task<dynamic> AddPageAsync(long nodeId, string title, string content, string summary, bool minorEdit, string format, string parentTitle, string redirectTitle, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("content", content);
			_parameters.Add("summary", summary);
			_parameters.Add("minorEdit", minorEdit);
			_parameters.Add("format", format);
			_parameters.Add("parentTitle", parentTitle);
			_parameters.Add("redirectTitle", redirectTitle);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/add-page", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddPageAsync(long nodeId, string title, string content, string summary, bool minorEdit, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("content", content);
			_parameters.Add("summary", summary);
			_parameters.Add("minorEdit", minorEdit);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/add-page", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetChildrenAsync(long groupId, long nodeId, bool head, string parentTitle)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nodeId", nodeId);
			_parameters.Add("head", head);
			_parameters.Add("parentTitle", parentTitle);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-children", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetPageAsync(long nodeId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-page", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetPageAsync(long nodeId, string title, double version)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("version", version);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-page", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetPageAsync(long nodeId, string title, bool head)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("head", head);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-page", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetPageAsync(long pageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("pageId", pageId);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-page", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetPageAsync(long groupId, long nodeId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-page", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetPagesAsync(long groupId, long userId, long nodeId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("nodeId", nodeId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-pages", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetPagesAsync(long groupId, long nodeId, bool head, int status, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nodeId", nodeId);
			_parameters.Add("head", head);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-pages", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetPagesAsync(long groupId, long nodeId, bool head, long userId, bool includeOwner, int status, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nodeId", nodeId);
			_parameters.Add("head", head);
			_parameters.Add("userId", userId);
			_parameters.Add("includeOwner", includeOwner);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-pages", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> FetchPageAsync(long nodeId, string title, double version)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nodeId", nodeId);
			_parameters.Add("title", title);
			_parameters.Add("version", version);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/fetch-page", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetOrphansAsync(JsonObjectWrapper node)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "node", "$languageUtil.getJSONWrapperClassName($parameter.type)", node);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-orphans", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetOrphansAsync(long groupId, long nodeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nodeId", nodeId);

			var _command = new JsonObject()
			{
				{ "/wiki.wikipage/get-orphans", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}