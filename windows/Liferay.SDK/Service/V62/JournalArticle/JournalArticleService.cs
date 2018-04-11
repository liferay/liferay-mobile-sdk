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

namespace Liferay.SDK.Service.V62.JournalArticle
{
	public class JournalArticleService : ServiceBase
	{
		public JournalArticleService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddArticleAsync(long groupId, long folderId, long classNameId, long classPK, string articleId, bool autoArticleId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string content, string type, string ddmStructureKey, string ddmTemplateKey, string layoutUuid, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, int reviewDateMonth, int reviewDateDay, int reviewDateYear, int reviewDateHour, int reviewDateMinute, bool neverReview, bool indexable, string articleURL, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("articleId", articleId);
			_parameters.Add("autoArticleId", autoArticleId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("content", content);
			_parameters.Add("type", type);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
			_parameters.Add("ddmTemplateKey", ddmTemplateKey);
			_parameters.Add("layoutUuid", layoutUuid);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			_parameters.Add("reviewDateMonth", reviewDateMonth);
			_parameters.Add("reviewDateDay", reviewDateDay);
			_parameters.Add("reviewDateYear", reviewDateYear);
			_parameters.Add("reviewDateHour", reviewDateHour);
			_parameters.Add("reviewDateMinute", reviewDateMinute);
			_parameters.Add("neverReview", neverReview);
			_parameters.Add("indexable", indexable);
			_parameters.Add("articleURL", articleURL);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalarticle/add-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> AddArticleAsync(long groupId, long folderId, long classNameId, long classPK, string articleId, bool autoArticleId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string content, string type, string ddmStructureKey, string ddmTemplateKey, string layoutUuid, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, int reviewDateMonth, int reviewDateDay, int reviewDateYear, int reviewDateHour, int reviewDateMinute, bool neverReview, bool indexable, bool smallImage, string smallImageURL, IDictionary<string, object> smallFile, IDictionary<string, object> images, string articleURL, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("articleId", articleId);
			_parameters.Add("autoArticleId", autoArticleId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("content", content);
			_parameters.Add("type", type);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
			_parameters.Add("ddmTemplateKey", ddmTemplateKey);
			_parameters.Add("layoutUuid", layoutUuid);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			_parameters.Add("reviewDateMonth", reviewDateMonth);
			_parameters.Add("reviewDateDay", reviewDateDay);
			_parameters.Add("reviewDateYear", reviewDateYear);
			_parameters.Add("reviewDateHour", reviewDateHour);
			_parameters.Add("reviewDateMinute", reviewDateMinute);
			_parameters.Add("neverReview", neverReview);
			_parameters.Add("indexable", indexable);
			_parameters.Add("smallImage", smallImage);
			_parameters.Add("smallImageURL", smallImageURL);
			_parameters.Add("smallFile", smallFile);
			_parameters.Add("images", images);
			_parameters.Add("articleURL", articleURL);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalarticle/add-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> CopyArticleAsync(long groupId, string oldArticleId, string newArticleId, bool autoArticleId, double version)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("oldArticleId", oldArticleId);
			_parameters.Add("newArticleId", newArticleId);
			_parameters.Add("autoArticleId", autoArticleId);
			_parameters.Add("version", version);

			var _command = new JsonObject()
			{
				{ "/journalarticle/copy-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task DeleteArticleAsync(long groupId, string articleId, string articleURL, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("articleURL", articleURL);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalarticle/delete-article", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteArticleAsync(long groupId, string articleId, double version, string articleURL, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("articleURL", articleURL);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalarticle/delete-article", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task ExpireArticleAsync(long groupId, string articleId, string articleURL, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("articleURL", articleURL);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalarticle/expire-article", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> ExpireArticleAsync(long groupId, string articleId, double version, string articleURL, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("articleURL", articleURL);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalarticle/expire-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> FetchArticleAsync(long groupId, string articleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);

			var _command = new JsonObject()
			{
				{ "/journalarticle/fetch-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetArticleAsync(long id)
		{
			var _parameters = new JsonObject();

			_parameters.Add("id", id);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetArticleAsync(long groupId, string articleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetArticleAsync(long groupId, string articleId, double version)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetArticleAsync(long groupId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetArticleByUrlTitleAsync(long groupId, string urlTitle)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("urlTitle", urlTitle);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-article-by-url-title", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<string> GetArticleContentAsync(long groupId, string articleId, string languageId, IDictionary<string, object> themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("languageId", languageId);
			_parameters.Add("themeDisplay", themeDisplay);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-article-content", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<string> GetArticleContentAsync(long groupId, string articleId, double version, string languageId, IDictionary<string, object> themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("languageId", languageId);
			_parameters.Add("themeDisplay", themeDisplay);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-article-content", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<IDictionary<string, object>> GetArticlesAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetArticlesAsync(long groupId, long folderId, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetArticlesByArticleIdAsync(long groupId, string articleId, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-articles-by-article-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetArticlesByLayoutUuidAsync(long groupId, string layoutUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutUuid", layoutUuid);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-articles-by-layout-uuid", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetArticlesByStructureIdAsync(long groupId, string ddmStructureKey, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-articles-by-structure-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetArticlesByStructureIdAsync(long groupId, long classNameId, string ddmStructureKey, int status, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-articles-by-structure-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> GetArticlesCountAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetArticlesCountAsync(long groupId, long folderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetArticlesCountByArticleIdAsync(long groupId, string articleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-articles-count-by-article-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetArticlesCountByStructureIdAsync(long groupId, string ddmStructureKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("ddmStructureKey", ddmStructureKey);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-articles-count-by-structure-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetArticlesCountByStructureIdAsync(long groupId, long classNameId, string ddmStructureKey, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-articles-count-by-structure-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IDictionary<string, object>> GetDisplayArticleByUrlTitleAsync(long groupId, string urlTitle)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("urlTitle", urlTitle);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-display-article-by-url-title", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> GetFoldersAndArticlesCountAsync(long groupId, IEnumerable<object> folderIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderIds", folderIds);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-folders-and-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IDictionary<string, object>> GetGroupArticlesAsync(long groupId, long userId, long rootFolderId, int start, int end, IDictionary<string, object> orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("orderByComparator", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-group-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetGroupArticlesAsync(long groupId, long userId, long rootFolderId, int status, int start, int end, IDictionary<string, object> orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("orderByComparator", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-group-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetGroupArticlesAsync(long groupId, long userId, long rootFolderId, int status, bool includeOwner, int start, int end, IDictionary<string, object> orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("status", status);
			_parameters.Add("includeOwner", includeOwner);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("orderByComparator", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-group-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> GetGroupArticlesCountAsync(long groupId, long userId, long rootFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-group-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupArticlesCountAsync(long groupId, long userId, long rootFolderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-group-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupArticlesCountAsync(long groupId, long userId, long rootFolderId, int status, bool includeOwner)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("status", status);
			_parameters.Add("includeOwner", includeOwner);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-group-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IDictionary<string, object>> GetLatestArticleAsync(long resourcePrimKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("resourcePrimKey", resourcePrimKey);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-latest-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetLatestArticleAsync(long groupId, string articleId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-latest-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetLatestArticleAsync(long groupId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/journalarticle/get-latest-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task MoveArticleAsync(long groupId, string articleId, long newFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("newFolderId", newFolderId);

			var _command = new JsonObject()
			{
				{ "/journalarticle/move-article", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> MoveArticleFromTrashAsync(long groupId, string articleId, long newFolderId, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("newFolderId", newFolderId);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalarticle/move-article-from-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> MoveArticleFromTrashAsync(long groupId, long resourcePrimKey, long newFolderId, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("resourcePrimKey", resourcePrimKey);
			_parameters.Add("newFolderId", newFolderId);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalarticle/move-article-from-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> MoveArticleToTrashAsync(long groupId, string articleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);

			var _command = new JsonObject()
			{
				{ "/journalarticle/move-article-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task RemoveArticleLocaleAsync(long companyId, string languageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("languageId", languageId);

			var _command = new JsonObject()
			{
				{ "/journalarticle/remove-article-locale", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> RemoveArticleLocaleAsync(long groupId, string articleId, double version, string languageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("languageId", languageId);

			var _command = new JsonObject()
			{
				{ "/journalarticle/remove-article-locale", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task RestoreArticleFromTrashAsync(long resourcePrimKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("resourcePrimKey", resourcePrimKey);

			var _command = new JsonObject()
			{
				{ "/journalarticle/restore-article-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RestoreArticleFromTrashAsync(long groupId, string articleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);

			var _command = new JsonObject()
			{
				{ "/journalarticle/restore-article-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> SearchAsync(long companyId, long groupId, IEnumerable<object> folderIds, long classNameId, string keywords, IDictionary<string, object> version, string type, string ddmStructureKey, string ddmTemplateKey, long displayDateGT, long displayDateLT, int status, long reviewDate, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("folderIds", folderIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("version", version);
			_parameters.Add("type", type);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
			_parameters.Add("ddmTemplateKey", ddmTemplateKey);
			_parameters.Add("displayDateGT", displayDateGT);
			_parameters.Add("displayDateLT", displayDateLT);
			_parameters.Add("status", status);
			_parameters.Add("reviewDate", reviewDate);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/journalarticle/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long companyId, long groupId, IEnumerable<object> folderIds, long classNameId, string articleId, IDictionary<string, object> version, string title, string description, string content, string type, string ddmStructureKey, string ddmTemplateKey, long displayDateGT, long displayDateLT, int status, long reviewDate, bool andOperator, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("folderIds", folderIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("content", content);
			_parameters.Add("type", type);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
			_parameters.Add("ddmTemplateKey", ddmTemplateKey);
			_parameters.Add("displayDateGT", displayDateGT);
			_parameters.Add("displayDateLT", displayDateLT);
			_parameters.Add("status", status);
			_parameters.Add("reviewDate", reviewDate);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/journalarticle/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long companyId, long groupId, IEnumerable<object> folderIds, long classNameId, string articleId, IDictionary<string, object> version, string title, string description, string content, string type, IEnumerable<string> ddmStructureKeys, IEnumerable<string> ddmTemplateKeys, long displayDateGT, long displayDateLT, int status, long reviewDate, bool andOperator, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("folderIds", folderIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("content", content);
			_parameters.Add("type", type);
			_parameters.Add("ddmStructureKeys", ddmStructureKeys);
			_parameters.Add("ddmTemplateKeys", ddmTemplateKeys);
			_parameters.Add("displayDateGT", displayDateGT);
			_parameters.Add("displayDateLT", displayDateLT);
			_parameters.Add("status", status);
			_parameters.Add("reviewDate", reviewDate);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/journalarticle/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long groupId, long creatorUserId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("creatorUserId", creatorUserId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/journalarticle/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, long groupId, IEnumerable<object> folderIds, long classNameId, string keywords, IDictionary<string, object> version, string type, string ddmStructureKey, string ddmTemplateKey, long displayDateGT, long displayDateLT, int status, long reviewDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("folderIds", folderIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("version", version);
			_parameters.Add("type", type);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
			_parameters.Add("ddmTemplateKey", ddmTemplateKey);
			_parameters.Add("displayDateGT", displayDateGT);
			_parameters.Add("displayDateLT", displayDateLT);
			_parameters.Add("status", status);
			_parameters.Add("reviewDate", reviewDate);

			var _command = new JsonObject()
			{
				{ "/journalarticle/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, long groupId, IEnumerable<object> folderIds, long classNameId, string articleId, IDictionary<string, object> version, string title, string description, string content, string type, string ddmStructureKey, string ddmTemplateKey, long displayDateGT, long displayDateLT, int status, long reviewDate, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("folderIds", folderIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("content", content);
			_parameters.Add("type", type);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
			_parameters.Add("ddmTemplateKey", ddmTemplateKey);
			_parameters.Add("displayDateGT", displayDateGT);
			_parameters.Add("displayDateLT", displayDateLT);
			_parameters.Add("status", status);
			_parameters.Add("reviewDate", reviewDate);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/journalarticle/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, long groupId, IEnumerable<object> folderIds, long classNameId, string articleId, IDictionary<string, object> version, string title, string description, string content, string type, IEnumerable<string> ddmStructureKeys, IEnumerable<string> ddmTemplateKeys, long displayDateGT, long displayDateLT, int status, long reviewDate, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("folderIds", folderIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("content", content);
			_parameters.Add("type", type);
			_parameters.Add("ddmStructureKeys", ddmStructureKeys);
			_parameters.Add("ddmTemplateKeys", ddmTemplateKeys);
			_parameters.Add("displayDateGT", displayDateGT);
			_parameters.Add("displayDateLT", displayDateLT);
			_parameters.Add("status", status);
			_parameters.Add("reviewDate", reviewDate);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/journalarticle/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task SubscribeAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/journalarticle/subscribe", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsubscribeAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/journalarticle/unsubscribe", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> UpdateArticleAsync(long userId, long groupId, long folderId, string articleId, double version, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string content, string layoutUuid, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("content", content);
			_parameters.Add("layoutUuid", layoutUuid);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalarticle/update-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateArticleAsync(long groupId, long folderId, string articleId, double version, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string content, string type, string ddmStructureKey, string ddmTemplateKey, string layoutUuid, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, int reviewDateMonth, int reviewDateDay, int reviewDateYear, int reviewDateHour, int reviewDateMinute, bool neverReview, bool indexable, bool smallImage, string smallImageURL, IDictionary<string, object> smallFile, IDictionary<string, object> images, string articleURL, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("content", content);
			_parameters.Add("type", type);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
			_parameters.Add("ddmTemplateKey", ddmTemplateKey);
			_parameters.Add("layoutUuid", layoutUuid);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			_parameters.Add("reviewDateMonth", reviewDateMonth);
			_parameters.Add("reviewDateDay", reviewDateDay);
			_parameters.Add("reviewDateYear", reviewDateYear);
			_parameters.Add("reviewDateHour", reviewDateHour);
			_parameters.Add("reviewDateMinute", reviewDateMinute);
			_parameters.Add("neverReview", neverReview);
			_parameters.Add("indexable", indexable);
			_parameters.Add("smallImage", smallImage);
			_parameters.Add("smallImageURL", smallImageURL);
			_parameters.Add("smallFile", smallFile);
			_parameters.Add("images", images);
			_parameters.Add("articleURL", articleURL);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalarticle/update-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateArticleAsync(long groupId, long folderId, string articleId, double version, string content, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("content", content);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalarticle/update-article", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateArticleTranslationAsync(long groupId, string articleId, double version, string locale, string title, string description, string content, IDictionary<string, object> images)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("locale", locale);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("content", content);
			_parameters.Add("images", images);

			var _command = new JsonObject()
			{
				{ "/journalarticle/update-article-translation", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateArticleTranslationAsync(long groupId, string articleId, double version, string locale, string title, string description, string content, IDictionary<string, object> images, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("locale", locale);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("content", content);
			_parameters.Add("images", images);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalarticle/update-article-translation", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateContentAsync(long groupId, string articleId, double version, string content)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("content", content);

			var _command = new JsonObject()
			{
				{ "/journalarticle/update-content", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateStatusAsync(long groupId, string articleId, double version, int status, string articleURL, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("version", version);
			_parameters.Add("status", status);
			_parameters.Add("articleURL", articleURL);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journalarticle/update-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}