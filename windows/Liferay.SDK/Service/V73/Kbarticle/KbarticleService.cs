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

namespace Liferay.SDK.Service.V73.Kbarticle
{
	public class KbarticleService : ServiceBase
	{
		public KbarticleService(ISession session)
			: base(session)
		{
		}

		public async Task<long> GetKbArticlesCountAsync(long groupId, IEnumerable<long> resourcePrimKeys, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("resourcePrimKeys", resourcePrimKeys);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-kb-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetKbArticlesCountAsync(long groupId, long parentResourcePrimKey, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentResourcePrimKey", parentResourcePrimKey);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-kb-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetLatestKbArticleAsync(long resourcePrimKey, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("resourcePrimKey", resourcePrimKey);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-latest-kb-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddKbArticleAsync(string portletId, long parentResourceClassNameId, long parentResourcePrimKey, string title, string urlTitle, string content, string description, string sourceURL, IEnumerable<string> sections, IEnumerable<string> selectedFileNames, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("portletId", portletId);
			_parameters.Add("parentResourceClassNameId", parentResourceClassNameId);
			_parameters.Add("parentResourcePrimKey", parentResourcePrimKey);
			_parameters.Add("title", title);
			_parameters.Add("urlTitle", urlTitle);
			_parameters.Add("content", content);
			_parameters.Add("description", description);
			_parameters.Add("sourceURL", sourceURL);
			_parameters.Add("sections", sections);
			_parameters.Add("selectedFileNames", selectedFileNames);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/add-kb-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateKbArticleAsync(long resourcePrimKey, string title, string content, string description, string sourceURL, IEnumerable<string> sections, IEnumerable<string> selectedFileNames, IEnumerable<long> removeFileEntryIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("resourcePrimKey", resourcePrimKey);
			_parameters.Add("title", title);
			_parameters.Add("content", content);
			_parameters.Add("description", description);
			_parameters.Add("sourceURL", sourceURL);
			_parameters.Add("sections", sections);
			_parameters.Add("selectedFileNames", selectedFileNames);
			_parameters.Add("removeFileEntryIds", removeFileEntryIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/update-kb-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetKbArticleAsync(long resourcePrimKey, int version)
		{
			var _parameters = new JsonObject();

			_parameters.Add("resourcePrimKey", resourcePrimKey);
			_parameters.Add("version", version);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-kb-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UnsubscribeGroupKbArticlesAsync(long groupId, string portletId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/unsubscribe-group-kb-articles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SubscribeGroupKbArticlesAsync(long groupId, string portletId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/subscribe-group-kb-articles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<string> GetGroupKbArticlesRssAsync(int status, int rssDelta, string rssDisplayStyle, string rssFormat, JsonObjectWrapper themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("status", status);
			_parameters.Add("rssDelta", rssDelta);
			_parameters.Add("rssDisplayStyle", rssDisplayStyle);
			_parameters.Add("rssFormat", rssFormat);
			this.MangleWrapper(_parameters, "themeDisplay", "$languageUtil.getJSONWrapperClassName($parameter.type)", themeDisplay);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-group-kb-articles-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<string> GetKbArticleRssAsync(long resourcePrimKey, int status, int rssDelta, string rssDisplayStyle, string rssFormat, JsonObjectWrapper themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("resourcePrimKey", resourcePrimKey);
			_parameters.Add("status", status);
			_parameters.Add("rssDelta", rssDelta);
			_parameters.Add("rssDisplayStyle", rssDisplayStyle);
			_parameters.Add("rssFormat", rssFormat);
			this.MangleWrapper(_parameters, "themeDisplay", "$languageUtil.getJSONWrapperClassName($parameter.type)", themeDisplay);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-kb-article-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<dynamic> GetKbArticleSearchDisplayAsync(long groupId, string title, string content, int status, long startDate, long endDate, bool andOperator, IEnumerable<int> curStartValues, int cur, int delta, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("content", content);
			_parameters.Add("status", status);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("curStartValues", curStartValues);
			_parameters.Add("cur", cur);
			_parameters.Add("delta", delta);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-kb-article-search-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteKbArticleAsync(long resourcePrimKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("resourcePrimKey", resourcePrimKey);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/delete-kb-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteKbArticlesAsync(long groupId, IEnumerable<long> resourcePrimKeys)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("resourcePrimKeys", resourcePrimKeys);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/delete-kb-articles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteTempAttachmentAsync(long groupId, long resourcePrimKey, string fileName, string tempFolderName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("resourcePrimKey", resourcePrimKey);
			_parameters.Add("fileName", fileName);
			_parameters.Add("tempFolderName", tempFolderName);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/delete-temp-attachment", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchFirstChildKbArticleAsync(long groupId, long parentResourcePrimKey, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentResourcePrimKey", parentResourcePrimKey);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/fetch-first-child-kb-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchFirstChildKbArticleAsync(long groupId, long parentResourcePrimKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentResourcePrimKey", parentResourcePrimKey);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/fetch-first-child-kb-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchKbArticleByUrlTitleAsync(long groupId, long kbFolderId, string urlTitle)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("kbFolderId", kbFolderId);
			_parameters.Add("urlTitle", urlTitle);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/fetch-kb-article-by-url-title", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchLatestKbArticleAsync(long resourcePrimKey, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("resourcePrimKey", resourcePrimKey);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/fetch-latest-kb-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchLatestKbArticleByUrlTitleAsync(long groupId, long kbFolderId, string urlTitle, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("kbFolderId", kbFolderId);
			_parameters.Add("urlTitle", urlTitle);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/fetch-latest-kb-article-by-url-title", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAllDescendantKbArticlesAsync(long groupId, long resourcePrimKey, int status, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("resourcePrimKey", resourcePrimKey);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-all-descendant-kb-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupKbArticlesAsync(long groupId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-group-kb-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupKbArticlesCountAsync(long groupId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-group-kb-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetKbArticleAndAllDescendantKbArticlesAsync(long resourcePrimKey, int status, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("resourcePrimKey", resourcePrimKey);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-kb-article-and-all-descendant-kb-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetKbArticlesAsync(long groupId, IEnumerable<long> resourcePrimKeys, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("resourcePrimKeys", resourcePrimKeys);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-kb-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetKbArticlesAsync(long groupId, long parentResourcePrimKey, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentResourcePrimKey", parentResourcePrimKey);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-kb-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetKbArticlesAsync(long groupId, IEnumerable<long> resourcePrimKeys, int status, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("resourcePrimKeys", resourcePrimKeys);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-kb-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetKbArticleVersionsAsync(long groupId, long resourcePrimKey, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("resourcePrimKey", resourcePrimKey);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-kb-article-versions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetKbArticleVersionsCountAsync(long groupId, long resourcePrimKey, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("resourcePrimKey", resourcePrimKey);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-kb-article-versions-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetPreviousAndNextKbArticlesAsync(long kbArticleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("kbArticleId", kbArticleId);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-previous-and-next-kb-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetSectionsKbArticlesAsync(long groupId, IEnumerable<string> sections, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("sections", sections);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-sections-kb-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetSectionsKbArticlesCountAsync(long groupId, IEnumerable<string> sections, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("sections", sections);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-sections-kb-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<string>> GetTempAttachmentNamesAsync(long groupId, string tempFolderName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("tempFolderName", tempFolderName);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/get-temp-attachment-names", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<string>();
		}

		public async Task MoveKbArticleAsync(long resourcePrimKey, long parentResourceClassNameId, long parentResourcePrimKey, double priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("resourcePrimKey", resourcePrimKey);
			_parameters.Add("parentResourceClassNameId", parentResourceClassNameId);
			_parameters.Add("parentResourcePrimKey", parentResourcePrimKey);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/move-kb-article", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> RevertKbArticleAsync(long resourcePrimKey, int version, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("resourcePrimKey", resourcePrimKey);
			_parameters.Add("version", version);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/revert-kb-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task SubscribeKbArticleAsync(long groupId, long resourcePrimKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("resourcePrimKey", resourcePrimKey);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/subscribe-kb-article", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsubscribeKbArticleAsync(long resourcePrimKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("resourcePrimKey", resourcePrimKey);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/unsubscribe-kb-article", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateKbArticlesPrioritiesAsync(long groupId, IDictionary<string, object> resourcePrimKeyToPriorityMap)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("resourcePrimKeyToPriorityMap", resourcePrimKeyToPriorityMap);

			var _command = new JsonObject()
			{
				{ "/kb.kbarticle/update-kb-articles-priorities", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}