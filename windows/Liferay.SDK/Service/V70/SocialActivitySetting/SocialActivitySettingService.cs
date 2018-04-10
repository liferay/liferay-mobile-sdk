//------------------------------------------------------------------------------
// <copyright file="SocialActivitySettingService.cs">
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
// <website>https://github.com/liferay/liferay-mobile-sdk</website>
//------------------------------------------------------------------------------

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Liferay.SDK.Service.V70.SocialActivitySetting
{
	public class SocialActivitySettingService : ServiceBase
	{
		public SocialActivitySettingService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateDeliveryAsync(long userId, string type, bool email, bool sms, bool website)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("type", type);
			_parameters.Add("email", email);
			_parameters.Add("sms", sms);
			_parameters.Add("website", website);

			var _command = new JsonObject()
			{
				{ "/announcementsdelivery/update-delivery", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateEntryAsync(long entryId, string title, string content, string url, string type, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, bool displayImmediately, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, int priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("title", title);
			_parameters.Add("content", content);
			_parameters.Add("url", url);
			_parameters.Add("type", type);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("displayImmediately", displayImmediately);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/announcementsentry/update-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateEntryAsync(long entryId, string title, string content, string url, string type, long displayDate, long expirationDate, int priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("title", title);
			_parameters.Add("content", content);
			_parameters.Add("url", url);
			_parameters.Add("type", type);
			_parameters.Add("displayDate", displayDate);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/announcementsentry/update-entry", _parameters }
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
				{ "/announcementsentry/delete-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddEntryAsync(long classNameId, long classPK, string title, string content, string url, string type, long displayDate, long expirationDate, int priority, bool alert)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("title", title);
			_parameters.Add("content", content);
			_parameters.Add("url", url);
			_parameters.Add("type", type);
			_parameters.Add("displayDate", displayDate);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("priority", priority);
			_parameters.Add("alert", alert);

			var _command = new JsonObject()
			{
				{ "/announcementsentry/add-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddEntryAsync(long plid, long classNameId, long classPK, string title, string content, string url, string type, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, bool displayImmediately, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, int priority, bool alert)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("title", title);
			_parameters.Add("content", content);
			_parameters.Add("url", url);
			_parameters.Add("type", type);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("displayImmediately", displayImmediately);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("priority", priority);
			_parameters.Add("alert", alert);

			var _command = new JsonObject()
			{
				{ "/announcementsentry/add-entry", _parameters }
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
				{ "/announcementsentry/get-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFlagAsync(long flagId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("flagId", flagId);

			var _command = new JsonObject()
			{
				{ "/announcementsflag/delete-flag", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetFlagAsync(long entryId, int value)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("value", value);

			var _command = new JsonObject()
			{
				{ "/announcementsflag/get-flag", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task AddFlagAsync(long entryId, int value)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("value", value);

			var _command = new JsonObject()
			{
				{ "/announcementsflag/add-flag", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCategoryAsync(long groupId, string title, long vocabularyId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("vocabularyId", vocabularyId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetcategory/add-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCategoryAsync(long groupId, long parentCategoryId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, long vocabularyId, IEnumerable<string> categoryProperties, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("categoryProperties", categoryProperties);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetcategory/add-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCategoryAsync(long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/assetcategory/fetch-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCategoryAsync(long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetChildCategoriesAsync(long parentCategoryId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-child-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetChildCategoriesAsync(long parentCategoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentCategoryId", parentCategoryId);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-child-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetVocabularyRootCategoriesAsync(long groupId, long vocabularyId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-root-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetVocabularyRootCategoriesCountAsync(long groupId, long vocabularyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("vocabularyId", vocabularyId);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-root-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> MoveCategoryAsync(long categoryId, long parentCategoryId, long vocabularyId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("vocabularyId", vocabularyId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetcategory/move-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCategoryAsync(long categoryId, long parentCategoryId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, long vocabularyId, IEnumerable<string> categoryProperties, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("categoryProperties", categoryProperties);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetcategory/update-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<string> GetCategoryPathAsync(long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-category-path", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<dynamic> GetVocabularyCategoriesDisplayAsync(long vocabularyId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetVocabularyCategoriesDisplayAsync(long groupId, string name, long vocabularyId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCategoriesDisplayAsync(IEnumerable<long> groupIds, string title, IEnumerable<long> parentCategoryIds, IEnumerable<long> vocabularyIds, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("title", title);
			_parameters.Add("parentCategoryIds", parentCategoryIds);
			_parameters.Add("vocabularyIds", vocabularyIds);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assetcategory/search-categories-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCategoriesDisplayAsync(long groupId, string title, long vocabularyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assetcategory/search-categories-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCategoriesDisplayAsync(IEnumerable<long> groupIds, string title, IEnumerable<long> vocabularyIds, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("title", title);
			_parameters.Add("vocabularyIds", vocabularyIds);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assetcategory/search-categories-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCategoriesDisplayAsync(long groupId, string title, long vocabularyId, long parentCategoryId, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/assetcategory/search-categories-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCategoriesDisplayAsync(long groupId, string title, long parentCategoryId, long vocabularyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assetcategory/search-categories-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCategoriesDisplayAsync(IEnumerable<long> groupIds, string title, IEnumerable<long> vocabularyIds, IEnumerable<long> parentCategoryIds, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("title", title);
			_parameters.Add("vocabularyIds", vocabularyIds);
			_parameters.Add("parentCategoryIds", parentCategoryIds);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/assetcategory/search-categories-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCategoryAsync(long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/assetcategory/delete-category", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> DeleteCategoriesAsync(IEnumerable<long> categoryIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryIds", categoryIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetcategory/delete-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task DeleteCategoriesAsync(IEnumerable<long> categoryIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryIds", categoryIds);

			var _command = new JsonObject()
			{
				{ "/assetcategory/delete-categories", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetVocabularyCategoriesAsync(long groupId, long parentCategoryId, long vocabularyId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetVocabularyCategoriesAsync(long groupId, string name, long vocabularyId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetVocabularyCategoriesAsync(long parentCategoryId, long vocabularyId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetVocabularyCategoriesAsync(long vocabularyId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetVocabularyCategoriesCountAsync(long groupId, long parentCategory, long vocabularyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategory", parentCategory);
			_parameters.Add("vocabularyId", vocabularyId);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetVocabularyCategoriesCountAsync(long groupId, long vocabularyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("vocabularyId", vocabularyId);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetVocabularyCategoriesCountAsync(long groupId, string name, long vocabularyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("vocabularyId", vocabularyId);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long groupId, string keywords, long vocabularyId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetcategory/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long groupId, string name, IEnumerable<string> categoryProperties, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("categoryProperties", categoryProperties);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assetcategory/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(IEnumerable<long> groupIds, string name, IEnumerable<long> vocabularyIds, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("name", name);
			_parameters.Add("vocabularyIds", vocabularyIds);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assetcategory/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoryPropertiesAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/get-category-properties", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoryPropertyValuesAsync(long companyId, string key)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("key", key);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/get-category-property-values", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task DeleteCategoryPropertyAsync(long categoryPropertyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryPropertyId", categoryPropertyId);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/delete-category-property", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCategoryPropertyAsync(long entryId, string key, string value)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("key", key);
			_parameters.Add("value", value);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/add-category-property", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCategoryPropertyAsync(long userId, long categoryPropertyId, string key, string value)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("categoryPropertyId", categoryPropertyId);
			_parameters.Add("key", key);
			_parameters.Add("value", value);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/update-category-property", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCategoryPropertyAsync(long categoryPropertyId, string key, string value)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryPropertyId", categoryPropertyId);
			_parameters.Add("key", key);
			_parameters.Add("value", value);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/update-category-property", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCompanyEntriesAsync(long companyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assetentry/get-company-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCompanyEntriesCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/assetentry/get-company-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> IncrementViewCounterAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/assetentry/increment-view-counter", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetEntriesCountAsync(JsonObjectWrapper entryQuery)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "entryQuery", "$languageUtil.getJSONWrapperClassName($parameter.type)", entryQuery);

			var _command = new JsonObject()
			{
				{ "/assetentry/get-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateEntryAsync(long groupId, long createDate, long modifiedDate, string className, long classPK, string classUuid, long classTypeId, IEnumerable<long> categoryIds, IEnumerable<string> tagNames, bool listable, bool visible, long startDate, long endDate, long expirationDate, string mimeType, string title, string description, string summary, string url, string layoutUuid, int height, int width, double priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("createDate", createDate);
			_parameters.Add("modifiedDate", modifiedDate);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("classUuid", classUuid);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("categoryIds", categoryIds);
			_parameters.Add("tagNames", tagNames);
			_parameters.Add("listable", listable);
			_parameters.Add("visible", visible);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("summary", summary);
			_parameters.Add("url", url);
			_parameters.Add("layoutUuid", layoutUuid);
			_parameters.Add("height", height);
			_parameters.Add("width", width);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/assetentry/update-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateEntryAsync(long groupId, long createDate, long modifiedDate, string className, long classPK, string classUuid, long classTypeId, IEnumerable<long> categoryIds, IEnumerable<string> tagNames, bool visible, long startDate, long endDate, long expirationDate, string mimeType, string title, string description, string summary, string url, string layoutUuid, int height, int width, int priority, bool sync)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("createDate", createDate);
			_parameters.Add("modifiedDate", modifiedDate);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("classUuid", classUuid);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("categoryIds", categoryIds);
			_parameters.Add("tagNames", tagNames);
			_parameters.Add("visible", visible);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("summary", summary);
			_parameters.Add("url", url);
			_parameters.Add("layoutUuid", layoutUuid);
			_parameters.Add("height", height);
			_parameters.Add("width", width);
			_parameters.Add("priority", priority);
			_parameters.Add("sync", sync);

			var _command = new JsonObject()
			{
				{ "/assetentry/update-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateEntryAsync(long groupId, long createDate, long modifiedDate, string className, long classPK, string classUuid, long classTypeId, IEnumerable<long> categoryIds, IEnumerable<string> tagNames, bool listable, bool visible, long startDate, long endDate, long publishDate, long expirationDate, string mimeType, string title, string description, string summary, string url, string layoutUuid, int height, int width, double priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("createDate", createDate);
			_parameters.Add("modifiedDate", modifiedDate);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("classUuid", classUuid);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("categoryIds", categoryIds);
			_parameters.Add("tagNames", tagNames);
			_parameters.Add("listable", listable);
			_parameters.Add("visible", visible);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("publishDate", publishDate);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("summary", summary);
			_parameters.Add("url", url);
			_parameters.Add("layoutUuid", layoutUuid);
			_parameters.Add("height", height);
			_parameters.Add("width", width);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/assetentry/update-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/assetentry/fetch-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetEntriesAsync(JsonObjectWrapper entryQuery)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "entryQuery", "$languageUtil.getJSONWrapperClassName($parameter.type)", entryQuery);

			var _command = new JsonObject()
			{
				{ "/assetentry/get-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/assetentry/get-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTagsAsync(long groupId, long classNameId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTagsAsync(long groupId, long classNameId, string name, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTagsAsync(long groupId, string name, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTagsAsync(IEnumerable<long> groupIds, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTagsAsync(IEnumerable<long> groupIds, string name, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTagsAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTagsAsync(long groupId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddTagAsync(long groupId, string name, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assettag/add-tag", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteTagAsync(long tagId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tagId", tagId);

			var _command = new JsonObject()
			{
				{ "/assettag/delete-tag", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> GetTagsCountAsync(long groupId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteTagsAsync(IEnumerable<long> tagIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tagIds", tagIds);

			var _command = new JsonObject()
			{
				{ "/assettag/delete-tags", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetGroupTagsDisplayAsync(long groupId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assettag/get-group-tags-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetVisibleAssetsTagsCountAsync(long groupId, long classNameId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/assettag/get-visible-assets-tags-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetVisibleAssetsTagsCountAsync(long groupId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/assettag/get-visible-assets-tags-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupsTagsAsync(IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/assettag/get-groups-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupTagsAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/assettag/get-group-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupTagsAsync(long groupId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assettag/get-group-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupTagsCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/assettag/get-group-tags-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task MergeTagsAsync(long fromTagId, long toTagId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fromTagId", fromTagId);
			_parameters.Add("toTagId", toTagId);

			var _command = new JsonObject()
			{
				{ "/assettag/merge-tags", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task MergeTagsAsync(IEnumerable<long> fromTagIds, long toTagId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fromTagIds", fromTagIds);
			_parameters.Add("toTagId", toTagId);

			var _command = new JsonObject()
			{
				{ "/assettag/merge-tags", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateTagAsync(long tagId, string name, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tagId", tagId);
			_parameters.Add("name", name);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assettag/update-tag", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetTagAsync(long tagId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tagId", tagId);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tag", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(IEnumerable<long> groupIds, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assettag/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long groupId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assettag/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetVocabularyAsync(long vocabularyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("vocabularyId", vocabularyId);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-vocabulary", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddVocabularyAsync(long groupId, string title, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/add-vocabulary", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddVocabularyAsync(long groupId, string title, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string settings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("settings", settings);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/add-vocabulary", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> DeleteVocabulariesAsync(IEnumerable<long> vocabularyIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("vocabularyIds", vocabularyIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/delete-vocabularies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task DeleteVocabularyAsync(long vocabularyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("vocabularyId", vocabularyId);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/delete-vocabulary", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCompanyVocabulariesAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-company-vocabularies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupsVocabulariesAsync(IEnumerable<long> groupIds, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-groups-vocabularies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupsVocabulariesAsync(IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-groups-vocabularies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupsVocabulariesAsync(IEnumerable<long> groupIds, string className, long classTypePK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("className", className);
			_parameters.Add("classTypePK", classTypePK);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-groups-vocabularies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupVocabulariesAsync(long groupId, bool createDefaultVocabulary, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("createDefaultVocabulary", createDefaultVocabulary);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-group-vocabularies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupVocabulariesAsync(IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-group-vocabularies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupVocabulariesAsync(long groupId, string name, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-group-vocabularies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupVocabulariesAsync(long groupId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-group-vocabularies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupVocabulariesAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-group-vocabularies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupVocabulariesAsync(long groupId, bool createDefaultVocabulary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("createDefaultVocabulary", createDefaultVocabulary);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-group-vocabularies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupVocabulariesCountAsync(long groupId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-group-vocabularies-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupVocabulariesCountAsync(IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-group-vocabularies-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupVocabulariesCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-group-vocabularies-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetVocabulariesAsync(IEnumerable<long> vocabularyIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("vocabularyIds", vocabularyIds);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-vocabularies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateVocabularyAsync(long vocabularyId, string title, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string settings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("title", title);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("settings", settings);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/update-vocabulary", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchVocabularyAsync(long vocabularyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("vocabularyId", vocabularyId);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/fetch-vocabulary", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetGroupVocabulariesDisplayAsync(long groupId, string name, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-group-vocabularies-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetGroupVocabulariesDisplayAsync(long groupId, string name, int start, int end, bool addDefaultVocabulary, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("addDefaultVocabulary", addDefaultVocabulary);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/get-group-vocabularies-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchVocabulariesDisplayAsync(long groupId, string title, bool addDefaultVocabulary, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("addDefaultVocabulary", addDefaultVocabulary);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/search-vocabularies-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchVocabulariesDisplayAsync(long groupId, string title, bool addDefaultVocabulary, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("addDefaultVocabulary", addDefaultVocabulary);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assetvocabulary/search-vocabularies-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task SubscribeAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/blogsentry/subscribe", _parameters }
			};

			await this.Session.InvokeAsync(_command);
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
				{ "/blogsentry/get-group-entries-rss", _parameters }
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
				{ "/blogsentry/get-organization-entries-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<long> GetGroupEntriesCountAsync(long groupId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/blogsentry/get-group-entries-count", _parameters }
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
				{ "/blogsentry/get-group-entries-count", _parameters }
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
				{ "/blogsentry/get-groups-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupUserEntriesAsync(long groupId, long userId, int status, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/blogsentry/get-group-user-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupUserEntriesAsync(long groupId, long userId, IEnumerable<int> statuses, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("statuses", statuses);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/blogsentry/get-group-user-entries", _parameters }
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
				{ "/blogsentry/get-group-user-entries-count", _parameters }
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
				{ "/blogsentry/get-group-user-entries-count", _parameters }
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
				{ "/blogsentry/get-organization-entries", _parameters }
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
				{ "/blogsentry/move-entry-to-trash", _parameters }
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
				{ "/blogsentry/restore-entry-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsubscribeAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/blogsentry/unsubscribe", _parameters }
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
				{ "/blogsentry/get-company-entries-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
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
				{ "/blogsentry/get-company-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupEntriesAsync(long groupId, int status, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/blogsentry/get-group-entries", _parameters }
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
				{ "/blogsentry/get-group-entries", _parameters }
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
				{ "/blogsentry/get-group-entries", _parameters }
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
				{ "/blogsentry/get-group-entries", _parameters }
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
				{ "/blogsentry/get-group-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
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
				{ "/blogsentry/update-entry", _parameters }
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
				{ "/blogsentry/delete-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
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
				{ "/blogsentry/add-entry", _parameters }
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
				{ "/blogsentry/get-entry", _parameters }
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
				{ "/blogsentry/get-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddTempFileEntryAsync(long groupId, long folderId, string folderName, string fileName, Stream file, string mimeType)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("folderName", folderName);
			_parameters.Add("fileName", fileName);
			_parameters.Add("file", file);
			_parameters.Add("mimeType", mimeType);

			var _command = new JsonObject()
			{
				{ "/dlapp/add-temp-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFileEntryAsync(long repositoryId, long folderId, string sourceFileName, string mimeType, string title, string description, string changeLog, byte[] bytes, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("sourceFileName", sourceFileName);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("changeLog", changeLog);
			_parameters.Add("bytes", bytes);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/add-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFileEntryAsync(long repositoryId, long folderId, string sourceFileName, string mimeType, string title, string description, string changeLog, Stream file, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("sourceFileName", sourceFileName);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("changeLog", changeLog);
			_parameters.Add("file", file);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/add-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long repositoryId, long folderId, long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long repositoryId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long repositoryId, long folderId, IEnumerable<string> mimeTypes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task CheckInFileEntryAsync(long fileEntryId, string lockUuid, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("lockUuid", lockUuid);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/check-in-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task CheckInFileEntryAsync(long fileEntryId, bool majorVersion, string changeLog, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("majorVersion", majorVersion);
			_parameters.Add("changeLog", changeLog);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/check-in-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task CancelCheckOutAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlapp/cancel-check-out", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetFileEntryAsync(long groupId, long folderId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileEntryAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFolderAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFolderAsync(long repositoryId, long parentFolderId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileVersionAsync(long fileVersionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileVersionId", fileVersionId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileShortcutAsync(long fileShortcutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-shortcut", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileEntryByUuidAndGroupIdAsync(string uuid, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("uuid", uuid);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entry-by-uuid-and-group-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId, int status, bool includeMountFolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId, bool includeMountFolders, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId, bool includeMountFolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, IEnumerable<string> mimeTypes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, IEnumerable<string> mimeTypes, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, long fileEntryTypeId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, long fileEntryTypeId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddFolderAsync(long repositoryId, long parentFolderId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/add-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFileEntryAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> MoveFolderAsync(long folderId, long parentFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/move-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFolderAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFolderAsync(long repositoryId, long parentFolderId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddFileShortcutAsync(long repositoryId, long folderId, long toFileEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("toFileEntryId", toFileEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/add-file-shortcut", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFileShortcutAsync(long fileShortcutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-file-shortcut", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> MoveFileEntryAsync(long fileEntryId, long newFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("newFolderId", newFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/move-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task SubscribeFileEntryTypeAsync(long groupId, long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlapp/subscribe-file-entry-type", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SubscribeFolderAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/subscribe-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsubscribeFileEntryTypeAsync(long groupId, long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlapp/unsubscribe-file-entry-type", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsubscribeFolderAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/unsubscribe-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateFileEntryAsync(long fileEntryId, string sourceFileName, string mimeType, string title, string description, string changeLog, bool majorVersion, Stream file, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("sourceFileName", sourceFileName);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("changeLog", changeLog);
			_parameters.Add("majorVersion", majorVersion);
			_parameters.Add("file", file);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/update-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFileEntryAsync(long fileEntryId, string sourceFileName, string mimeType, string title, string description, string changeLog, bool majorVersion, byte[] bytes, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("sourceFileName", sourceFileName);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("changeLog", changeLog);
			_parameters.Add("majorVersion", majorVersion);
			_parameters.Add("bytes", bytes);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/update-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFileShortcutAsync(long fileShortcutId, long folderId, long toFileEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("toFileEntryId", toFileEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/update-file-shortcut", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFolderAsync(long folderId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/update-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> CopyFolderAsync(long repositoryId, long sourceFolderId, long parentFolderId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("sourceFolderId", sourceFolderId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/copy-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndFileEntriesAndFileShortcutsAsync(long repositoryId, long folderId, int status, bool includeMountFolders, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-and-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndFileEntriesAndFileShortcutsAsync(long repositoryId, long folderId, int status, bool includeMountFolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-and-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndFileEntriesAndFileShortcutsAsync(long repositoryId, long folderId, int status, IEnumerable<string> mimeTypes, bool includeMountFolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-and-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> CheckOutFileEntryAsync(long fileEntryId, string owner, long expirationTime, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("owner", owner);
			_parameters.Add("expirationTime", expirationTime);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/check-out-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task CheckOutFileEntryAsync(long fileEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/check-out-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFileEntryByTitleAsync(long repositoryId, long folderId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-file-entry-by-title", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFileVersionAsync(long fileEntryId, string version)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("version", version);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-file-version", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteTempFileEntryAsync(long groupId, long folderId, string folderName, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("folderName", folderName);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-temp-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAndFileShortcutsAsync(long repositoryId, long folderId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFileEntriesAndFileShortcutsCountAsync(long repositoryId, long folderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesAndFileShortcutsCountAsync(long repositoryId, long folderId, int status, IEnumerable<string> mimeTypes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndFileEntriesAndFileShortcutsCountAsync(long repositoryId, long folderId, int status, IEnumerable<string> mimeTypes, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-and-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndFileEntriesAndFileShortcutsCountAsync(long repositoryId, long folderId, int status, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-and-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersCountAsync(long repositoryId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersCountAsync(long repositoryId, long parentFolderId, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersCountAsync(long repositoryId, long parentFolderId, int status, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersFileEntriesCountAsync(long repositoryId, IEnumerable<long> folderIds, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderIds", folderIds);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupFileEntriesAsync(long groupId, long userId, long rootFolderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupFileEntriesAsync(long groupId, long userId, long rootFolderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupFileEntriesAsync(long groupId, long userId, long rootFolderId, IEnumerable<string> mimeTypes, int status, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupFileEntriesAsync(long groupId, long userId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupFileEntriesAsync(long groupId, long userId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupFileEntriesCountAsync(long groupId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupFileEntriesCountAsync(long groupId, long userId, long rootFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupFileEntriesCountAsync(long groupId, long userId, long rootFolderId, IEnumerable<string> mimeTypes, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetMountFoldersAsync(long repositoryId, long parentFolderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-mount-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetMountFoldersAsync(long repositoryId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-mount-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetMountFoldersAsync(long repositoryId, long parentFolderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-mount-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetMountFoldersCountAsync(long repositoryId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-mount-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<long>> GetSubfolderIdsAsync(long repositoryId, long folderId, bool recurse)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("recurse", recurse);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-subfolder-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task GetSubfolderIdsAsync(long repositoryId, IEnumerable<long> folderIds, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderIds", folderIds);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-subfolder-ids", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<long>> GetSubfolderIdsAsync(long repositoryId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-subfolder-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<IEnumerable<string>> GetTempFileNamesAsync(long groupId, long folderId, string folderName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("folderName", folderName);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-temp-file-names", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<string>();
		}

		public async Task<dynamic> LockFolderAsync(long repositoryId, long folderId, string owner, bool inheritable, long expirationTime)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("owner", owner);
			_parameters.Add("inheritable", inheritable);
			_parameters.Add("expirationTime", expirationTime);

			var _command = new JsonObject()
			{
				{ "/dlapp/lock-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> LockFolderAsync(long repositoryId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/lock-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RefreshFileEntryLockAsync(string lockUuid, long companyId, long expirationTime)
		{
			var _parameters = new JsonObject();

			_parameters.Add("lockUuid", lockUuid);
			_parameters.Add("companyId", companyId);
			_parameters.Add("expirationTime", expirationTime);

			var _command = new JsonObject()
			{
				{ "/dlapp/refresh-file-entry-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RefreshFolderLockAsync(string lockUuid, long companyId, long expirationTime)
		{
			var _parameters = new JsonObject();

			_parameters.Add("lockUuid", lockUuid);
			_parameters.Add("companyId", companyId);
			_parameters.Add("expirationTime", expirationTime);

			var _command = new JsonObject()
			{
				{ "/dlapp/refresh-folder-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task RevertFileEntryAsync(long fileEntryId, string version, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("version", version);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/revert-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnlockFolderAsync(long repositoryId, long parentFolderId, string name, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlapp/unlock-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnlockFolderAsync(long repositoryId, long folderId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlapp/unlock-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateFileEntryAndCheckInAsync(long fileEntryId, string sourceFileName, string mimeType, string title, string description, string changeLog, bool majorVersion, Stream file, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("sourceFileName", sourceFileName);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("changeLog", changeLog);
			_parameters.Add("majorVersion", majorVersion);
			_parameters.Add("file", file);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/update-file-entry-and-check-in", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<bool> VerifyFileEntryCheckOutAsync(long repositoryId, long fileEntryId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlapp/verify-file-entry-check-out", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> VerifyFileEntryLockAsync(long repositoryId, long fileEntryId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlapp/verify-file-entry-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> VerifyInheritableLockAsync(long repositoryId, long folderId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlapp/verify-inheritable-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<dynamic> SearchAsync(long repositoryId, JsonObjectWrapper searchContext, JsonObjectWrapper query)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			this.MangleWrapper(_parameters, "searchContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", searchContext);
			this.MangleWrapper(_parameters, "query", "$languageUtil.getJSONWrapperClassName($parameter.type)", query);

			var _command = new JsonObject()
			{
				{ "/dlapp/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchAsync(long repositoryId, long creatorUserId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("creatorUserId", creatorUserId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchAsync(long repositoryId, long creatorUserId, long folderId, IEnumerable<string> mimeTypes, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("creatorUserId", creatorUserId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchAsync(long repositoryId, JsonObjectWrapper searchContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			this.MangleWrapper(_parameters, "searchContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", searchContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateStatusAsync(long userId, long fileVersionId, int status, JsonObjectWrapper serviceContext, IDictionary<string, object> workflowContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("fileVersionId", fileVersionId);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);
			_parameters.Add("workflowContext", workflowContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/update-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileEntryLockAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entry-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long groupId, long folderId, IEnumerable<string> mimeTypes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long groupId, long folderId, long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long groupId, long folderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task CheckInFileEntryAsync(long fileEntryId, bool major, string changeLog, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("major", major);
			_parameters.Add("changeLog", changeLog);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/check-in-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task CheckInFileEntryAsync(long fileEntryId, string lockUuid, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("lockUuid", lockUuid);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/check-in-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> CancelCheckOutAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/cancel-check-out", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<bool> IsKeepFileVersionLabelAsync(long fileEntryId, bool majorVersion, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("majorVersion", majorVersion);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/is-keep-file-version-label", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> IsKeepFileVersionLabelAsync(long fileEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/is-keep-file-version-label", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<dynamic> GetFileEntryAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileEntryAsync(long groupId, long folderId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileEntryByUuidAndGroupIdAsync(string uuid, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("uuid", uuid);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entry-by-uuid-and-group-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long groupId, long folderId, int status, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long groupId, long folderId, IEnumerable<string> mimeTypes, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long groupId, long folderId, long fileEntryTypeId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long groupId, long folderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task DeleteFileEntryAsync(long groupId, long folderId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/delete-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFileEntryAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/delete-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> MoveFileEntryAsync(long fileEntryId, long newFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("newFolderId", newFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/move-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<bool> IsFileEntryCheckedOutAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/is-file-entry-checked-out", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<dynamic> FetchFileEntryByImageIdAsync(long imageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("imageId", imageId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/fetch-file-entry-by-image-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> CopyFileEntryAsync(long groupId, long repositoryId, long fileEntryId, long destFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("destFolderId", destFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/copy-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<bool> HasFileEntryLockAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/has-file-entry-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<dynamic> CheckOutFileEntryAsync(long fileEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/check-out-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> CheckOutFileEntryAsync(long fileEntryId, string owner, long expirationTime, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("owner", owner);
			_parameters.Add("expirationTime", expirationTime);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/check-out-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFileVersionAsync(long fileEntryId, string version)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("version", version);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/delete-file-version", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> GetFoldersFileEntriesCountAsync(long groupId, IEnumerable<long> folderIds, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderIds", folderIds);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-folders-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupFileEntriesAsync(long groupId, long userId, long repositoryId, long rootFolderId, IEnumerable<string> mimeTypes, int status, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupFileEntriesAsync(long groupId, long userId, long rootFolderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupFileEntriesAsync(long groupId, long userId, long rootFolderId, IEnumerable<string> mimeTypes, int status, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupFileEntriesCountAsync(long groupId, long userId, long repositoryId, long rootFolderId, IEnumerable<string> mimeTypes, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-group-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupFileEntriesCountAsync(long groupId, long userId, long rootFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-group-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupFileEntriesCountAsync(long groupId, long userId, long rootFolderId, IEnumerable<string> mimeTypes, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-group-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> RefreshFileEntryLockAsync(string lockUuid, long companyId, long expirationTime)
		{
			var _parameters = new JsonObject();

			_parameters.Add("lockUuid", lockUuid);
			_parameters.Add("companyId", companyId);
			_parameters.Add("expirationTime", expirationTime);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/refresh-file-entry-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task RevertFileEntryAsync(long fileEntryId, string version, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("version", version);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/revert-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<bool> VerifyFileEntryCheckOutAsync(long fileEntryId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/verify-file-entry-check-out", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> VerifyFileEntryLockAsync(long fileEntryId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/verify-file-entry-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<dynamic> SearchAsync(long groupId, long creatorUserId, long folderId, IEnumerable<string> mimeTypes, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("creatorUserId", creatorUserId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchAsync(long groupId, long creatorUserId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("creatorUserId", creatorUserId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, string keywords, bool includeBasicFileEntryType)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("includeBasicFileEntryType", includeBasicFileEntryType);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task UpdateFileEntryTypeAsync(long fileEntryTypeId, string name, string description, IEnumerable<long> ddmStructureIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryTypeId", fileEntryTypeId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("ddmStructureIds", ddmStructureIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/update-file-entry-type", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateFileEntryTypeAsync(long fileEntryTypeId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, IEnumerable<long> ddmStructureIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryTypeId", fileEntryTypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("ddmStructureIds", ddmStructureIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/update-file-entry-type", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetFolderFileEntryTypesAsync(IEnumerable<long> groupIds, long folderId, bool inherited)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("folderId", folderId);
			_parameters.Add("inherited", inherited);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/get-folder-file-entry-types", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task DeleteFileEntryTypeAsync(long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/delete-file-entry-type", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddFileEntryTypeAsync(long groupId, string fileEntryTypeKey, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, IEnumerable<long> ddmStructureIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fileEntryTypeKey", fileEntryTypeKey);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("ddmStructureIds", ddmStructureIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/add-file-entry-type", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFileEntryTypeAsync(long groupId, string name, string description, IEnumerable<long> ddmStructureIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("ddmStructureIds", ddmStructureIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/add-file-entry-type", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntryTypesAsync(IEnumerable<long> groupIds, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/get-file-entry-types", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntryTypesAsync(IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/get-file-entry-types", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFileEntryTypesCountAsync(IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/get-file-entry-types-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetFileEntryTypeAsync(long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/get-file-entry-type", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, string keywords, bool includeBasicFileEntryType, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("includeBasicFileEntryType", includeBasicFileEntryType);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/dlfileentrytype/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetFileShortcutAsync(long fileShortcutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);

			var _command = new JsonObject()
			{
				{ "/dlfileshortcut/get-file-shortcut", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFileShortcutAsync(long groupId, long repositoryId, long folderId, long toFileEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("toFileEntryId", toFileEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileshortcut/add-file-shortcut", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFileShortcutAsync(long fileShortcutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);

			var _command = new JsonObject()
			{
				{ "/dlfileshortcut/delete-file-shortcut", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateFileShortcutAsync(long fileShortcutId, long repositoryId, long folderId, long toFileEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);
			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("toFileEntryId", toFileEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileshortcut/update-file-shortcut", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateFileShortcutsAsync(long oldToFileEntryId, long newToFileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("oldToFileEntryId", oldToFileEntryId);
			_parameters.Add("newToFileEntryId", newToFileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileshortcut/update-file-shortcuts", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetFileVersionsAsync(long fileEntryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfileversion/get-file-versions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFileVersionsCountAsync(long fileEntryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfileversion/get-file-versions-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetLatestFileVersionAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileversion/get-latest-file-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetLatestFileVersionAsync(long fileEntryId, bool excludeWorkingCopy)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("excludeWorkingCopy", excludeWorkingCopy);

			var _command = new JsonObject()
			{
				{ "/dlfileversion/get-latest-file-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileVersionAsync(long fileVersionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileVersionId", fileVersionId);

			var _command = new JsonObject()
			{
				{ "/dlfileversion/get-file-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<long>> GetFolderIdsAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folder-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<bool> HasFolderLockAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/has-folder-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> IsFolderLockedAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/is-folder-locked", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<dynamic> GetFolderAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFolderAsync(long groupId, long parentFolderId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long groupId, long parentFolderId, int status, bool includeMountfolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountfolders", includeMountfolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long groupId, long parentFolderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddFolderAsync(long groupId, long repositoryId, bool mountPoint, long parentFolderId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("mountPoint", mountPoint);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfolder/add-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveFolderAsync(long folderId, long parentFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfolder/move-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFolderAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/delete-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFolderAsync(long folderId, bool includeTrashedEntries)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("includeTrashedEntries", includeTrashedEntries);

			var _command = new JsonObject()
			{
				{ "/dlfolder/delete-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFolderAsync(long groupId, long parentFolderId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/dlfolder/delete-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateFolderAsync(long folderId, long parentFolderId, string name, string description, long defaultFileEntryTypeId, IEnumerable<long> fileEntryTypeIds, int restrictionType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("defaultFileEntryTypeId", defaultFileEntryTypeId);
			_parameters.Add("fileEntryTypeIds", fileEntryTypeIds);
			_parameters.Add("restrictionType", restrictionType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfolder/update-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFolderAsync(long folderId, string name, string description, long defaultFileEntryTypeId, IEnumerable<long> fileEntryTypeIds, bool overrideFileEntryTypes, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("defaultFileEntryTypeId", defaultFileEntryTypeId);
			_parameters.Add("fileEntryTypeIds", fileEntryTypeIds);
			_parameters.Add("overrideFileEntryTypes", overrideFileEntryTypes);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfolder/update-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFolderAsync(long folderId, string name, string description, long defaultFileEntryTypeId, IEnumerable<long> fileEntryTypeIds, int restrictionType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("defaultFileEntryTypeId", defaultFileEntryTypeId);
			_parameters.Add("fileEntryTypeIds", fileEntryTypeIds);
			_parameters.Add("restrictionType", restrictionType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfolder/update-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndFileEntriesAndFileShortcutsAsync(long groupId, long folderId, IEnumerable<string> mimeTypes, bool includeMountFolders, JsonObjectWrapper queryDefinition)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);
			this.MangleWrapper(_parameters, "queryDefinition", "$languageUtil.getJSONWrapperClassName($parameter.type)", queryDefinition);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-and-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndFileEntriesAndFileShortcutsAsync(long groupId, long folderId, int status, IEnumerable<string> mimeTypes, bool includeMountFolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-and-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndFileEntriesAndFileShortcutsAsync(long groupId, long folderId, int status, bool includeMountFolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-and-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAndFileShortcutsAsync(long groupId, long folderId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFileEntriesAndFileShortcutsCountAsync(long groupId, long folderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesAndFileShortcutsCountAsync(long groupId, long folderId, int status, IEnumerable<string> mimeTypes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndFileEntriesAndFileShortcutsCountAsync(long groupId, long folderId, IEnumerable<string> mimeTypes, bool includeMountFolders, JsonObjectWrapper queryDefinition)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);
			this.MangleWrapper(_parameters, "queryDefinition", "$languageUtil.getJSONWrapperClassName($parameter.type)", queryDefinition);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-and-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndFileEntriesAndFileShortcutsCountAsync(long groupId, long folderId, int status, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-and-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndFileEntriesAndFileShortcutsCountAsync(long groupId, long folderId, int status, IEnumerable<string> mimeTypes, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-and-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersCountAsync(long groupId, long parentFolderId, int status, bool includeMountfolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountfolders", includeMountfolders);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersCountAsync(long groupId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetMountFoldersAsync(long groupId, long parentFolderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-mount-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetMountFoldersCountAsync(long groupId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-mount-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<long>> GetSubfolderIdsAsync(long groupId, long folderId, bool recurse)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("recurse", recurse);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-subfolder-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task GetSubfolderIdsAsync(IEnumerable<long> folderIds, long groupId, long folderId, bool recurse)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderIds", folderIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("recurse", recurse);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-subfolder-ids", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task GetSubfolderIdsAsync(IEnumerable<long> folderIds, long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderIds", folderIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-subfolder-ids", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> LockFolderAsync(long folderId, string owner, bool inheritable, long expirationTime)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("owner", owner);
			_parameters.Add("inheritable", inheritable);
			_parameters.Add("expirationTime", expirationTime);

			var _command = new JsonObject()
			{
				{ "/dlfolder/lock-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> LockFolderAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/lock-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RefreshFolderLockAsync(string lockUuid, long companyId, long expirationTime)
		{
			var _parameters = new JsonObject();

			_parameters.Add("lockUuid", lockUuid);
			_parameters.Add("companyId", companyId);
			_parameters.Add("expirationTime", expirationTime);

			var _command = new JsonObject()
			{
				{ "/dlfolder/refresh-folder-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UnlockFolderAsync(long folderId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlfolder/unlock-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnlockFolderAsync(long groupId, long parentFolderId, string name, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlfolder/unlock-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<bool> VerifyInheritableLockAsync(long folderId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlfolder/verify-inheritable-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> HasInheritableLockAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/has-inheritable-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<dynamic> MoveFileEntryToTrashAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dltrash/move-file-entry-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task RestoreFileEntryFromTrashAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dltrash/restore-file-entry-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> MoveFolderToTrashAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dltrash/move-folder-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task RestoreFileShortcutFromTrashAsync(long fileShortcutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);

			var _command = new JsonObject()
			{
				{ "/dltrash/restore-file-shortcut-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RestoreFolderFromTrashAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dltrash/restore-folder-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> MoveFileEntryFromTrashAsync(long fileEntryId, long newFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("newFolderId", newFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dltrash/move-file-entry-from-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveFileShortcutFromTrashAsync(long fileShortcutId, long newFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);
			_parameters.Add("newFolderId", newFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dltrash/move-file-shortcut-from-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveFileShortcutToTrashAsync(long fileShortcutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);

			var _command = new JsonObject()
			{
				{ "/dltrash/move-file-shortcut-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveFolderFromTrashAsync(long folderId, long parentFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dltrash/move-folder-from-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateColumnAsync(long columnId, string name, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("columnId", columnId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/update-column", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateColumnAsync(long columnId, string name, int type, IDictionary<string, object> defaultData)
		{
			var _parameters = new JsonObject();

			_parameters.Add("columnId", columnId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("defaultData", defaultData);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/update-column", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateTypeSettingsAsync(long columnId, string typeSettings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("columnId", columnId);
			_parameters.Add("typeSettings", typeSettings);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/update-type-settings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteColumnAsync(long columnId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("columnId", columnId);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/delete-column", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchExpandoColumnAsync(long columnId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("columnId", columnId);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/fetch-expando-column", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddColumnAsync(long tableId, string name, int type, IDictionary<string, object> defaultData)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tableId", tableId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("defaultData", defaultData);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/add-column", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddColumnAsync(long tableId, string name, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tableId", tableId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/add-column", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetJsonDataAsync(long companyId, string className, string tableName, string columnName, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("tableName", tableName);
			_parameters.Add("columnName", columnName);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/expandovalue/get-json-data", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task AddValuesAsync(long companyId, string className, string tableName, long classPK, IDictionary<string, object> attributeValues)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("tableName", tableName);
			_parameters.Add("classPK", classPK);
			_parameters.Add("attributeValues", attributeValues);

			var _command = new JsonObject()
			{
				{ "/expandovalue/add-values", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> GetDataAsync(long companyId, string className, string tableName, IEnumerable<string> columnNames, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("tableName", tableName);
			_parameters.Add("columnNames", columnNames);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/expandovalue/get-data", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetDataAsync(long companyId, string className, string tableName, string columnName, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("tableName", tableName);
			_parameters.Add("columnName", columnName);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/expandovalue/get-data", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<dynamic> AddValueAsync(long companyId, string className, string tableName, string columnName, long classPK, string data)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("tableName", tableName);
			_parameters.Add("columnName", columnName);
			_parameters.Add("classPK", classPK);
			_parameters.Add("data", data);

			var _command = new JsonObject()
			{
				{ "/expandovalue/add-value", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ExportPortletInfoAsFileAsync(JsonObjectWrapper exportImportConfiguration)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);

			var _command = new JsonObject()
			{
				{ "/exportimport/export-portlet-info-as-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ExportLayoutsAsFileAsync(JsonObjectWrapper exportImportConfiguration)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);

			var _command = new JsonObject()
			{
				{ "/exportimport/export-layouts-as-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> ExportPortletInfoAsFileInBackgroundAsync(JsonObjectWrapper exportImportConfiguration)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);

			var _command = new JsonObject()
			{
				{ "/exportimport/export-portlet-info-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> ExportLayoutsAsFileInBackgroundAsync(long exportImportConfigurationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("exportImportConfigurationId", exportImportConfigurationId);

			var _command = new JsonObject()
			{
				{ "/exportimport/export-layouts-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> ExportLayoutsAsFileInBackgroundAsync(JsonObjectWrapper exportImportConfiguration)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);

			var _command = new JsonObject()
			{
				{ "/exportimport/export-layouts-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> ImportLayoutsInBackgroundAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/exportimport/import-layouts-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task ImportLayoutsAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/exportimport/import-layouts", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task ImportPortletInfoAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/exportimport/import-portlet-info", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> ImportPortletInfoInBackgroundAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/exportimport/import-portlet-info-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> ValidateImportLayoutsFileAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/exportimport/validate-import-layouts-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ValidateImportPortletInfoAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/exportimport/validate-import-portlet-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveExportImportConfigurationToTrashAsync(long exportImportConfigurationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("exportImportConfigurationId", exportImportConfigurationId);

			var _command = new JsonObject()
			{
				{ "/exportimportconfiguration/move-export-import-configuration-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RestoreExportImportConfigurationFromTrashAsync(long exportImportConfigurationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("exportImportConfigurationId", exportImportConfigurationId);

			var _command = new JsonObject()
			{
				{ "/exportimportconfiguration/restore-export-import-configuration-from-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteExportImportConfigurationAsync(long exportImportConfigurationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("exportImportConfigurationId", exportImportConfigurationId);

			var _command = new JsonObject()
			{
				{ "/exportimportconfiguration/delete-export-import-configuration", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateStagingRequestAsync(long stagingRequestId, string fileName, byte[] bytes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("stagingRequestId", stagingRequestId);
			_parameters.Add("fileName", fileName);
			_parameters.Add("bytes", bytes);

			var _command = new JsonObject()
			{
				{ "/staging/update-staging-request", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> CreateStagingRequestAsync(long groupId, string checksum)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("checksum", checksum);

			var _command = new JsonObject()
			{
				{ "/staging/create-staging-request", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> PublishStagingRequestAsync(long stagingRequestId, JsonObjectWrapper exportImportConfiguration)
		{
			var _parameters = new JsonObject();

			_parameters.Add("stagingRequestId", stagingRequestId);
			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);

			var _command = new JsonObject()
			{
				{ "/staging/publish-staging-request", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> PublishStagingRequestAsync(long stagingRequestId, bool privateLayout, IDictionary<string, object> parameterMap)
		{
			var _parameters = new JsonObject();

			_parameters.Add("stagingRequestId", stagingRequestId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);

			var _command = new JsonObject()
			{
				{ "/staging/publish-staging-request", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task CleanUpStagingRequestAsync(long stagingRequestId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("stagingRequestId", stagingRequestId);

			var _command = new JsonObject()
			{
				{ "/staging/clean-up-staging-request", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> ValidateStagingRequestAsync(long stagingRequestId, bool privateLayout, IDictionary<string, object> parameterMap)
		{
			var _parameters = new JsonObject();

			_parameters.Add("stagingRequestId", stagingRequestId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);

			var _command = new JsonObject()
			{
				{ "/staging/validate-staging-request", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddBanAsync(long banUserId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("banUserId", banUserId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbban/add-ban", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteBanAsync(long banUserId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("banUserId", banUserId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbban/delete-ban", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCategoryAsync(long parentCategoryId, string name, string description, string displayStyle, string emailAddress, string inProtocol, string inServerName, int inServerPort, bool inUseSSL, string inUserName, string inPassword, int inReadInterval, string outEmailAddress, bool outCustom, string outServerName, int outServerPort, bool outUseSSL, string outUserName, string outPassword, bool mailingListActive, bool allowAnonymousEmail, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("displayStyle", displayStyle);
			_parameters.Add("emailAddress", emailAddress);
			_parameters.Add("inProtocol", inProtocol);
			_parameters.Add("inServerName", inServerName);
			_parameters.Add("inServerPort", inServerPort);
			_parameters.Add("inUseSSL", inUseSSL);
			_parameters.Add("inUserName", inUserName);
			_parameters.Add("inPassword", inPassword);
			_parameters.Add("inReadInterval", inReadInterval);
			_parameters.Add("outEmailAddress", outEmailAddress);
			_parameters.Add("outCustom", outCustom);
			_parameters.Add("outServerName", outServerName);
			_parameters.Add("outServerPort", outServerPort);
			_parameters.Add("outUseSSL", outUseSSL);
			_parameters.Add("outUserName", outUserName);
			_parameters.Add("outPassword", outPassword);
			_parameters.Add("mailingListActive", mailingListActive);
			_parameters.Add("allowAnonymousEmail", allowAnonymousEmail);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbcategory/add-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCategoryAsync(long userId, long parentCategoryId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbcategory/add-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCategoryAsync(long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<long>> GetSubcategoryIdsAsync(IEnumerable<long> categoryIds, long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryIds", categoryIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-subcategory-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<dynamic> MoveCategoryAsync(long categoryId, long parentCategoryId, bool mergeWithParentCategory)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("mergeWithParentCategory", mergeWithParentCategory);

			var _command = new JsonObject()
			{
				{ "/mbcategory/move-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCategoryAsync(long categoryId, long parentCategoryId, string name, string description, string displayStyle, string emailAddress, string inProtocol, string inServerName, int inServerPort, bool inUseSSL, string inUserName, string inPassword, int inReadInterval, string outEmailAddress, bool outCustom, string outServerName, int outServerPort, bool outUseSSL, string outUserName, string outPassword, bool mailingListActive, bool allowAnonymousEmail, bool mergeWithParentCategory, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("displayStyle", displayStyle);
			_parameters.Add("emailAddress", emailAddress);
			_parameters.Add("inProtocol", inProtocol);
			_parameters.Add("inServerName", inServerName);
			_parameters.Add("inServerPort", inServerPort);
			_parameters.Add("inUseSSL", inUseSSL);
			_parameters.Add("inUserName", inUserName);
			_parameters.Add("inPassword", inPassword);
			_parameters.Add("inReadInterval", inReadInterval);
			_parameters.Add("outEmailAddress", outEmailAddress);
			_parameters.Add("outCustom", outCustom);
			_parameters.Add("outServerName", outServerName);
			_parameters.Add("outServerPort", outServerPort);
			_parameters.Add("outUseSSL", outUseSSL);
			_parameters.Add("outUserName", outUserName);
			_parameters.Add("outPassword", outPassword);
			_parameters.Add("mailingListActive", mailingListActive);
			_parameters.Add("allowAnonymousEmail", allowAnonymousEmail);
			_parameters.Add("mergeWithParentCategory", mergeWithParentCategory);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbcategory/update-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAndThreadsAsync(long groupId, long categoryId, JsonObjectWrapper queryDefinition)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			this.MangleWrapper(_parameters, "queryDefinition", "$languageUtil.getJSONWrapperClassName($parameter.type)", queryDefinition);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-and-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAndThreadsAsync(long groupId, long categoryId, int status, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-and-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAndThreadsAsync(long groupId, long categoryId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-and-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAndThreadsAsync(long groupId, long categoryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-and-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAndThreadsAsync(long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-and-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCategoriesAndThreadsCountAsync(long groupId, long categoryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-and-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCategoriesAndThreadsCountAsync(long groupId, long categoryId, JsonObjectWrapper queryDefinition)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			this.MangleWrapper(_parameters, "queryDefinition", "$languageUtil.getJSONWrapperClassName($parameter.type)", queryDefinition);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-and-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCategoriesAndThreadsCountAsync(long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-and-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetSubscribedCategoriesAsync(long groupId, long userId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-subscribed-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetSubscribedCategoriesCountAsync(long groupId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-subscribed-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> MoveCategoryFromTrashAsync(long categoryId, long newCategoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);
			_parameters.Add("newCategoryId", newCategoryId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/move-category-from-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveCategoryToTrashAsync(long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/move-category-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task RestoreCategoryFromTrashAsync(long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/restore-category-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SubscribeCategoryAsync(long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/subscribe-category", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsubscribeCategoryAsync(long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/unsubscribe-category", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCategoryAsync(long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/delete-category", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCategoryAsync(long categoryId, bool includeTrashedEntries)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);
			_parameters.Add("includeTrashedEntries", includeTrashedEntries);

			var _command = new JsonObject()
			{
				{ "/mbcategory/delete-category", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAsync(long groupId, IEnumerable<long> excludedCategoryIds, IEnumerable<long> parentCategoryIds, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("excludedCategoryIds", excludedCategoryIds);
			_parameters.Add("parentCategoryIds", parentCategoryIds);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAsync(long groupId, IEnumerable<long> parentCategoryIds, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryIds", parentCategoryIds);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAsync(long groupId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAsync(long groupId, long parentCategoryId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAsync(long groupId, long parentCategoryId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAsync(long groupId, long excludedCategoryId, long parentCategoryId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("excludedCategoryId", excludedCategoryId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAsync(long groupId, IEnumerable<long> parentCategoryIds, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryIds", parentCategoryIds);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCategoriesCountAsync(long groupId, long parentCategoryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCategoriesCountAsync(long groupId, long parentCategoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryId", parentCategoryId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCategoriesCountAsync(long groupId, IEnumerable<long> parentCategoryIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryIds", parentCategoryIds);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCategoriesCountAsync(long groupId, IEnumerable<long> parentCategoryIds, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryIds", parentCategoryIds);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCategoriesCountAsync(long groupId, IEnumerable<long> excludedCategoryIds, IEnumerable<long> parentCategoryIds, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("excludedCategoryIds", excludedCategoryIds);
			_parameters.Add("parentCategoryIds", parentCategoryIds);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCategoriesCountAsync(long groupId, long excludedCategoryId, long parentCategoryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("excludedCategoryId", excludedCategoryId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<long>> GetCategoryIdsAsync(long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mbcategory/get-category-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<dynamic> AddMessageAsync(long groupId, long categoryId, string subject, string body, string format, string fileName, Stream file, bool anonymous, double priority, bool allowPingbacks, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("subject", subject);
			_parameters.Add("body", body);
			_parameters.Add("format", format);
			_parameters.Add("fileName", fileName);
			_parameters.Add("file", file);
			_parameters.Add("anonymous", anonymous);
			_parameters.Add("priority", priority);
			_parameters.Add("allowPingbacks", allowPingbacks);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbmessage/add-message", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddMessageAsync(long groupId, long categoryId, string subject, string body, string format, IEnumerable<object> inputStreamOVPs, bool anonymous, double priority, bool allowPingbacks, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("subject", subject);
			_parameters.Add("body", body);
			_parameters.Add("format", format);
			_parameters.Add("inputStreamOVPs", inputStreamOVPs);
			_parameters.Add("anonymous", anonymous);
			_parameters.Add("priority", priority);
			_parameters.Add("allowPingbacks", allowPingbacks);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbmessage/add-message", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddMessageAsync(long parentMessageId, string subject, string body, string format, IEnumerable<object> inputStreamOVPs, bool anonymous, double priority, bool allowPingbacks, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentMessageId", parentMessageId);
			_parameters.Add("subject", subject);
			_parameters.Add("body", body);
			_parameters.Add("format", format);
			_parameters.Add("inputStreamOVPs", inputStreamOVPs);
			_parameters.Add("anonymous", anonymous);
			_parameters.Add("priority", priority);
			_parameters.Add("allowPingbacks", allowPingbacks);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbmessage/add-message", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddMessageAsync(long categoryId, string subject, string body, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);
			_parameters.Add("subject", subject);
			_parameters.Add("body", body);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbmessage/add-message", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetCategoryMessagesCountAsync(long groupId, long categoryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbmessage/get-category-messages-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<string> GetCategoryMessagesRssAsync(long groupId, long categoryId, int status, int max, string type, double version, string displayStyle, string feedURL, string entryURL, JsonObjectWrapper themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
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
				{ "/mbmessage/get-category-messages-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<string> GetCompanyMessagesRssAsync(long companyId, int status, int max, string type, double version, string displayStyle, string feedURL, string entryURL, JsonObjectWrapper themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
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
				{ "/mbmessage/get-company-messages-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<string> GetGroupMessagesRssAsync(long groupId, long userId, int status, int max, string type, double version, string displayStyle, string feedURL, string entryURL, JsonObjectWrapper themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
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
				{ "/mbmessage/get-group-messages-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<string> GetGroupMessagesRssAsync(long groupId, int status, int max, string type, double version, string displayStyle, string feedURL, string entryURL, JsonObjectWrapper themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
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
				{ "/mbmessage/get-group-messages-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<long> GetThreadAnswersCountAsync(long groupId, long categoryId, long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbmessage/get-thread-answers-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<string> GetThreadMessagesRssAsync(long threadId, int status, int max, string type, double version, string displayStyle, string feedURL, string entryURL, JsonObjectWrapper themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("threadId", threadId);
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
				{ "/mbmessage/get-thread-messages-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task AddMessageAttachmentAsync(long messageId, string fileName, Stream file, string mimeType)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);
			_parameters.Add("fileName", fileName);
			_parameters.Add("file", file);
			_parameters.Add("mimeType", mimeType);

			var _command = new JsonObject()
			{
				{ "/mbmessage/add-message-attachment", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteDiscussionMessageAsync(long groupId, string className, long classPK, string permissionClassName, long permissionClassPK, long permissionOwnerId, long messageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("permissionClassName", permissionClassName);
			_parameters.Add("permissionClassPK", permissionClassPK);
			_parameters.Add("permissionOwnerId", permissionOwnerId);
			_parameters.Add("messageId", messageId);

			var _command = new JsonObject()
			{
				{ "/mbmessage/delete-discussion-message", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteDiscussionMessageAsync(long messageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);

			var _command = new JsonObject()
			{
				{ "/mbmessage/delete-discussion-message", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteMessageAsync(long messageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);

			var _command = new JsonObject()
			{
				{ "/mbmessage/delete-message", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteMessageAttachmentAsync(long messageId, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/mbmessage/delete-message-attachment", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteMessageAttachmentsAsync(long messageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);

			var _command = new JsonObject()
			{
				{ "/mbmessage/delete-message-attachments", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task EmptyMessageAttachmentsAsync(long messageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);

			var _command = new JsonObject()
			{
				{ "/mbmessage/empty-message-attachments", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCategoryMessagesAsync(long groupId, long categoryId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbmessage/get-category-messages", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupMessagesCountAsync(long groupId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbmessage/get-group-messages-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetMessageDisplayAsync(long messageId, int status, string threadView, bool includePrevAndNext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);
			_parameters.Add("status", status);
			_parameters.Add("threadView", threadView);
			_parameters.Add("includePrevAndNext", includePrevAndNext);

			var _command = new JsonObject()
			{
				{ "/mbmessage/get-message-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetMessageDisplayAsync(long messageId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbmessage/get-message-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetThreadMessagesCountAsync(long groupId, long categoryId, long threadId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("threadId", threadId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbmessage/get-thread-messages-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task RestoreMessageAttachmentFromTrashAsync(long messageId, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/mbmessage/restore-message-attachment-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SubscribeMessageAsync(long messageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);

			var _command = new JsonObject()
			{
				{ "/mbmessage/subscribe-message", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsubscribeMessageAsync(long messageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);

			var _command = new JsonObject()
			{
				{ "/mbmessage/unsubscribe-message", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateAnswerAsync(long messageId, bool answer, bool cascade)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);
			_parameters.Add("answer", answer);
			_parameters.Add("cascade", cascade);

			var _command = new JsonObject()
			{
				{ "/mbmessage/update-answer", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateDiscussionMessageAsync(string className, long classPK, long messageId, string subject, string body, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("messageId", messageId);
			_parameters.Add("subject", subject);
			_parameters.Add("body", body);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbmessage/update-discussion-message", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddDiscussionMessageAsync(long groupId, string className, long classPK, long threadId, long parentMessageId, string subject, string body, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("threadId", threadId);
			_parameters.Add("parentMessageId", parentMessageId);
			_parameters.Add("subject", subject);
			_parameters.Add("body", body);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbmessage/add-discussion-message", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateMessageAsync(long messageId, string subject, string body, IEnumerable<object> inputStreamOVPs, IEnumerable<string> existingFiles, double priority, bool allowPingbacks, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);
			_parameters.Add("subject", subject);
			_parameters.Add("body", body);
			_parameters.Add("inputStreamOVPs", inputStreamOVPs);
			_parameters.Add("existingFiles", existingFiles);
			_parameters.Add("priority", priority);
			_parameters.Add("allowPingbacks", allowPingbacks);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbmessage/update-message", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetThreadMessagesAsync(long groupId, long categoryId, long threadId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("threadId", threadId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbmessage/get-thread-messages", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetMessageAsync(long messageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);

			var _command = new JsonObject()
			{
				{ "/mbmessage/get-message", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupThreadsAsync(long groupId, long userId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupThreadsAsync(long groupId, long userId, int status, bool subscribed, bool includeAnonymous, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("subscribed", subscribed);
			_parameters.Add("includeAnonymous", includeAnonymous);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupThreadsAsync(long groupId, long userId, long modifiedDate, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("modifiedDate", modifiedDate);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupThreadsAsync(long groupId, long userId, int status, bool subscribed, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("subscribed", subscribed);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupThreadsCountAsync(long groupId, long userId, long modifiedDate, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("modifiedDate", modifiedDate);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupThreadsCountAsync(long groupId, long userId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupThreadsCountAsync(long groupId, long userId, int status, bool subscribed)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("subscribed", subscribed);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupThreadsCountAsync(long groupId, long userId, int status, bool subscribed, bool includeAnonymous)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("subscribed", subscribed);
			_parameters.Add("includeAnonymous", includeAnonymous);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetThreadsCountAsync(long groupId, long categoryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> MoveThreadAsync(long categoryId, long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);
			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/move-thread", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveThreadFromTrashAsync(long categoryId, long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);
			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/move-thread-from-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveThreadToTrashAsync(long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/move-thread-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task RestoreThreadFromTrashAsync(long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/restore-thread-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> SplitThreadAsync(long messageId, string subject, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);
			_parameters.Add("subject", subject);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbthread/split-thread", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> LockThreadAsync(long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/lock-thread", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UnlockThreadAsync(long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/unlock-thread", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteThreadAsync(long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/delete-thread", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetThreadsAsync(long groupId, long categoryId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> SearchAsync(long groupId, long creatorUserId, long startDate, long endDate, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("creatorUserId", creatorUserId);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchAsync(long groupId, long creatorUserId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("creatorUserId", creatorUserId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteAddressAsync(long addressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("addressId", addressId);

			var _command = new JsonObject()
			{
				{ "/address/delete-address", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetAddressesAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/address/get-addresses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddAddressAsync(string className, long classPK, string street1, string street2, string street3, string city, string zip, long regionId, long countryId, long typeId, bool mailing, bool primary, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("typeId", typeId);
			_parameters.Add("mailing", mailing);
			_parameters.Add("primary", primary);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/address/add-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateAddressAsync(long addressId, string street1, string street2, string street3, string city, string zip, long regionId, long countryId, long typeId, bool mailing, bool primary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("addressId", addressId);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("typeId", typeId);
			_parameters.Add("mailing", mailing);
			_parameters.Add("primary", primary);

			var _command = new JsonObject()
			{
				{ "/address/update-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetAddressAsync(long addressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("addressId", addressId);

			var _command = new JsonObject()
			{
				{ "/address/get-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchClassNameAsync(string value)
		{
			var _parameters = new JsonObject();

			_parameters.Add("value", value);

			var _command = new JsonObject()
			{
				{ "/classname/fetch-class-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchByClassNameIdAsync(long classNameId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);

			var _command = new JsonObject()
			{
				{ "/classname/fetch-by-class-name-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCompanyByIdAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/company/get-company-by-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateDisplayAsync(long companyId, string languageId, string timeZoneId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("languageId", languageId);
			_parameters.Add("timeZoneId", timeZoneId);

			var _command = new JsonObject()
			{
				{ "/company/update-display", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateLogoAsync(long companyId, byte[] bytes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("bytes", bytes);

			var _command = new JsonObject()
			{
				{ "/company/update-logo", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCompanyAsync(long companyId, string virtualHost, string mx, string homeURL, bool logo, byte[] logoBytes, string name, string legalName, string legalId, string legalType, string sicCode, string tickerSymbol, string industry, string type, string size)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("virtualHost", virtualHost);
			_parameters.Add("mx", mx);
			_parameters.Add("homeURL", homeURL);
			_parameters.Add("logo", logo);
			_parameters.Add("logoBytes", logoBytes);
			_parameters.Add("name", name);
			_parameters.Add("legalName", legalName);
			_parameters.Add("legalId", legalId);
			_parameters.Add("legalType", legalType);
			_parameters.Add("sicCode", sicCode);
			_parameters.Add("tickerSymbol", tickerSymbol);
			_parameters.Add("industry", industry);
			_parameters.Add("type", type);
			_parameters.Add("size", size);

			var _command = new JsonObject()
			{
				{ "/company/update-company", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCompanyAsync(long companyId, string virtualHost, string mx, string homeURL, string name, string legalName, string legalId, string legalType, string sicCode, string tickerSymbol, string industry, string type, string size)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("virtualHost", virtualHost);
			_parameters.Add("mx", mx);
			_parameters.Add("homeURL", homeURL);
			_parameters.Add("name", name);
			_parameters.Add("legalName", legalName);
			_parameters.Add("legalId", legalId);
			_parameters.Add("legalType", legalType);
			_parameters.Add("sicCode", sicCode);
			_parameters.Add("tickerSymbol", tickerSymbol);
			_parameters.Add("industry", industry);
			_parameters.Add("type", type);
			_parameters.Add("size", size);

			var _command = new JsonObject()
			{
				{ "/company/update-company", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCompanyAsync(long companyId, string virtualHost, string mx, int maxUsers, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("virtualHost", virtualHost);
			_parameters.Add("mx", mx);
			_parameters.Add("maxUsers", maxUsers);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/company/update-company", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteLogoAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/company/delete-logo", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetCompanyByLogoIdAsync(long logoId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("logoId", logoId);

			var _command = new JsonObject()
			{
				{ "/company/get-company-by-logo-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCompanyByMxAsync(string mx)
		{
			var _parameters = new JsonObject();

			_parameters.Add("mx", mx);

			var _command = new JsonObject()
			{
				{ "/company/get-company-by-mx", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCompanyByVirtualHostAsync(string virtualHost)
		{
			var _parameters = new JsonObject();

			_parameters.Add("virtualHost", virtualHost);

			var _command = new JsonObject()
			{
				{ "/company/get-company-by-virtual-host", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCompanyByWebIdAsync(string webId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("webId", webId);

			var _command = new JsonObject()
			{
				{ "/company/get-company-by-web-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetContactAsync(long contactId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("contactId", contactId);

			var _command = new JsonObject()
			{
				{ "/contact/get-contact", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetContactsAsync(long classNameId, long classPK, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/contact/get-contacts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetContactsCountAsync(long classNameId, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/contact/get-contacts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> FetchCountryByA2Async(string a2)
		{
			var _parameters = new JsonObject();

			_parameters.Add("a2", a2);

			var _command = new JsonObject()
			{
				{ "/country/fetch-country-by-a2", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCountryByA3Async(string a3)
		{
			var _parameters = new JsonObject();

			_parameters.Add("a3", a3);

			var _command = new JsonObject()
			{
				{ "/country/fetch-country-by-a3", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCountriesAsync(bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/country/get-countries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCountriesAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/country/get-countries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetCountryByA2Async(string a2)
		{
			var _parameters = new JsonObject();

			_parameters.Add("a2", a2);

			var _command = new JsonObject()
			{
				{ "/country/get-country-by-a2", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCountryByA3Async(string a3)
		{
			var _parameters = new JsonObject();

			_parameters.Add("a3", a3);

			var _command = new JsonObject()
			{
				{ "/country/get-country-by-a3", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCountryByNameAsync(string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/country/get-country-by-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCountryAsync(long countryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);

			var _command = new JsonObject()
			{
				{ "/country/fetch-country", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCountryAsync(string name, string a2, string a3, string number, string idd, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("a2", a2);
			_parameters.Add("a3", a3);
			_parameters.Add("number", number);
			_parameters.Add("idd", idd);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/country/add-country", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCountryAsync(long countryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);

			var _command = new JsonObject()
			{
				{ "/country/get-country", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetEmailAddressAsync(long emailAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("emailAddressId", emailAddressId);

			var _command = new JsonObject()
			{
				{ "/emailaddress/get-email-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetEmailAddressesAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/emailaddress/get-email-addresses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateEmailAddressAsync(long emailAddressId, string address, long typeId, bool primary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("emailAddressId", emailAddressId);
			_parameters.Add("address", address);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);

			var _command = new JsonObject()
			{
				{ "/emailaddress/update-email-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteEmailAddressAsync(long emailAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("emailAddressId", emailAddressId);

			var _command = new JsonObject()
			{
				{ "/emailaddress/delete-email-address", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchEmailAddressAsync(long emailAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("emailAddressId", emailAddressId);

			var _command = new JsonObject()
			{
				{ "/emailaddress/fetch-email-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddEmailAddressAsync(string className, long classPK, string address, long typeId, bool primary, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("address", address);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/emailaddress/add-email-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DisableStagingAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/group/disable-staging", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> SearchCountAsync(long companyId, string name, string description, IEnumerable<string> _params)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("params", _params);

			var _command = new JsonObject()
			{
				{ "/group/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateGroupAsync(long groupId, long parentGroupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, int type, bool manualMembership, int membershipRestriction, string friendlyURL, bool inheritContent, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("manualMembership", manualMembership);
			_parameters.Add("membershipRestriction", membershipRestriction);
			_parameters.Add("friendlyURL", friendlyURL);
			_parameters.Add("inheritContent", inheritContent);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/group/update-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateGroupAsync(long groupId, string typeSettings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("typeSettings", typeSettings);

			var _command = new JsonObject()
			{
				{ "/group/update-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateGroupAsync(long groupId, long parentGroupId, string name, string description, int type, bool manualMembership, int membershipRestriction, string friendlyURL, bool inheritContent, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("manualMembership", manualMembership);
			_parameters.Add("membershipRestriction", membershipRestriction);
			_parameters.Add("friendlyURL", friendlyURL);
			_parameters.Add("inheritContent", inheritContent);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/group/update-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<bool> HasUserGroupAsync(long userId, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/group/has-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserSitesGroupsAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/group/get-user-sites-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserSitesGroupsAsync(IEnumerable<string> classNames, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNames", classNames);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/group/get-user-sites-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserSitesGroupsAsync(long userId, IEnumerable<string> classNames, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("classNames", classNames);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/group/get-user-sites-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetOrganizationsGroupsAsync(IEnumerable<object> organizations)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizations", organizations);

			var _command = new JsonObject()
			{
				{ "/group/get-organizations-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserGroupsGroupsAsync(IEnumerable<object> userGroups)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroups", userGroups);

			var _command = new JsonObject()
			{
				{ "/group/get-user-groups-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserOrganizationsGroupsAsync(long userId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/group/get-user-organizations-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetCompanyGroupAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/group/get-company-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task AddRoleGroupsAsync(long roleId, IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);
			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/group/add-role-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetRoleGroupsAsync(long roleId, IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);
			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/group/set-role-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task CheckRemoteStagingGroupAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/group/check-remote-staging-group", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<string> GetGroupDisplayUrlAsync(long groupId, bool privateLayout, bool secureConnection)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("secureConnection", secureConnection);

			var _command = new JsonObject()
			{
				{ "/group/get-group-display-url", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetManageableSiteGroupsAsync(IEnumerable<object> portlets, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("portlets", portlets);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/group/get-manageable-site-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetUserSitesGroupsCountAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/group/get-user-sites-groups-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task UpdateStagedPortletsAsync(long groupId, IDictionary<string, string> stagedPortletIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("stagedPortletIds", stagedPortletIds);

			var _command = new JsonObject()
			{
				{ "/group/update-staged-portlets", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsetRoleGroupsAsync(long roleId, IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);
			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/group/unset-role-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateFriendlyUrlAsync(long groupId, string friendlyURL)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("friendlyURL", friendlyURL);

			var _command = new JsonObject()
			{
				{ "/group/update-friendly-url", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetUserGroupAsync(long companyId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/group/get-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteGroupAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/group/delete-group", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task EnableStagingAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/group/enable-staging", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetGroupsAsync(long companyId, long parentGroupId, bool site)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("site", site);

			var _command = new JsonObject()
			{
				{ "/group/get-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetGroupAsync(long companyId, string groupKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupKey", groupKey);

			var _command = new JsonObject()
			{
				{ "/group/get-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetGroupAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/group/get-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddGroupAsync(long parentGroupId, long liveGroupId, string name, string description, int type, bool manualMembership, int membershipRestriction, string friendlyURL, bool site, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("liveGroupId", liveGroupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("manualMembership", manualMembership);
			_parameters.Add("membershipRestriction", membershipRestriction);
			_parameters.Add("friendlyURL", friendlyURL);
			_parameters.Add("site", site);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/group/add-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddGroupAsync(long parentGroupId, long liveGroupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, int type, bool manualMembership, int membershipRestriction, string friendlyURL, bool site, bool inheritContent, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("liveGroupId", liveGroupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("manualMembership", manualMembership);
			_parameters.Add("membershipRestriction", membershipRestriction);
			_parameters.Add("friendlyURL", friendlyURL);
			_parameters.Add("site", site);
			_parameters.Add("inheritContent", inheritContent);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/group/add-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddGroupAsync(long parentGroupId, long liveGroupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, int type, bool manualMembership, int membershipRestriction, string friendlyURL, bool site, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentGroupId", parentGroupId);
			_parameters.Add("liveGroupId", liveGroupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("manualMembership", manualMembership);
			_parameters.Add("membershipRestriction", membershipRestriction);
			_parameters.Add("friendlyURL", friendlyURL);
			_parameters.Add("site", site);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/group/add-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, string name, string description, IEnumerable<string> _params, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("params", _params);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/group/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> classNameIds, string keywords, IDictionary<string, object> _params, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("params", _params);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/group/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> classNameIds, string name, string description, IDictionary<string, object> _params, bool andOperator, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("params", _params);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/group/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetImageAsync(long imageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("imageId", imageId);

			var _command = new JsonObject()
			{
				{ "/image/get-image", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ExportPortletInfoAsFileAsync(string portletId, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-portlet-info-as-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ExportPortletInfoAsFileAsync(long plid, long groupId, string portletId, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-portlet-info-as-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ExportPortletInfoAsFileAsync(JsonObjectWrapper exportImportConfiguration)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);

			var _command = new JsonObject()
			{
				{ "/layout/export-portlet-info-as-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetLayoutByUuidAndGroupIdAsync(string uuid, long groupId, bool privateLayout)
		{
			var _parameters = new JsonObject();

			_parameters.Add("uuid", uuid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);

			var _command = new JsonObject()
			{
				{ "/layout/get-layout-by-uuid-and-group-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ExportLayoutsAsFileAsync(long groupId, bool privateLayout, IEnumerable<long> layoutIds, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutIds", layoutIds);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-layouts-as-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ExportLayoutsAsFileAsync(JsonObjectWrapper exportImportConfiguration)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);

			var _command = new JsonObject()
			{
				{ "/layout/export-layouts-as-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetLayoutsCountAsync(long groupId, bool privateLayout, long parentLayoutId, int priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/layout/get-layouts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutsCountAsync(long groupId, bool privateLayout, long parentLayoutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);

			var _command = new JsonObject()
			{
				{ "/layout/get-layouts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task SetLayoutsAsync(long groupId, bool privateLayout, long parentLayoutId, IEnumerable<long> layoutIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);
			_parameters.Add("layoutIds", layoutIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/set-layouts", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> ExportPortletInfoAsFileInBackgroundAsync(string taskName, long plid, long groupId, string portletId, IDictionary<string, object> parameterMap, long startDate, long endDate, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("taskName", taskName);
			_parameters.Add("plid", plid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/layout/export-portlet-info-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> ExportPortletInfoAsFileInBackgroundAsync(string taskName, string portletId, IDictionary<string, object> parameterMap, long startDate, long endDate, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("taskName", taskName);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/layout/export-portlet-info-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> ExportLayoutsAsFileInBackgroundAsync(JsonObjectWrapper exportImportConfiguration)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);

			var _command = new JsonObject()
			{
				{ "/layout/export-layouts-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> ExportLayoutsAsFileInBackgroundAsync(string taskName, long groupId, bool privateLayout, IEnumerable<long> layoutIds, IDictionary<string, object> parameterMap, long startDate, long endDate, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("taskName", taskName);
			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutIds", layoutIds);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/layout/export-layouts-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> ExportLayoutsAsFileInBackgroundAsync(long exportImportConfigurationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("exportImportConfigurationId", exportImportConfigurationId);

			var _command = new JsonObject()
			{
				{ "/layout/export-layouts-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> ExportLayoutsAsFileInBackgroundAsync(string taskName, long groupId, bool privateLayout, IEnumerable<long> layoutIds, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("taskName", taskName);
			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutIds", layoutIds);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-layouts-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> ImportLayoutsInBackgroundAsync(string taskName, long groupId, bool privateLayout, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("taskName", taskName);
			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-layouts-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutsAsync(long groupId, bool privateLayout)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);

			var _command = new JsonObject()
			{
				{ "/layout/get-layouts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutsAsync(long groupId, bool privateLayout, long parentLayoutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);

			var _command = new JsonObject()
			{
				{ "/layout/get-layouts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutsAsync(long groupId, bool privateLayout, long parentLayoutId, bool incomplete, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);
			_parameters.Add("incomplete", incomplete);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/layout/get-layouts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task ImportLayoutsAsync(long groupId, bool privateLayout, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-layouts", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task ImportLayoutsAsync(long groupId, bool privateLayout, IDictionary<string, object> parameterMap, byte[] bytes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("bytes", bytes);

			var _command = new JsonObject()
			{
				{ "/layout/import-layouts", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task ImportLayoutsAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-layouts", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateLookAndFeelAsync(long groupId, bool privateLayout, long layoutId, string themeId, string colorSchemeId, string css)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("themeId", themeId);
			_parameters.Add("colorSchemeId", colorSchemeId);
			_parameters.Add("css", css);

			var _command = new JsonObject()
			{
				{ "/layout/update-look-and-feel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddLayoutAsync(long groupId, bool privateLayout, long parentLayoutId, IDictionary<string, string> localeNamesMap, IDictionary<string, string> localeTitlesMap, IDictionary<string, string> descriptionMap, IDictionary<string, string> keywordsMap, IDictionary<string, string> robotsMap, string type, string typeSettings, bool hidden, IDictionary<string, string> friendlyURLMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);
			_parameters.Add("localeNamesMap", localeNamesMap);
			_parameters.Add("localeTitlesMap", localeTitlesMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("keywordsMap", keywordsMap);
			_parameters.Add("robotsMap", robotsMap);
			_parameters.Add("type", type);
			_parameters.Add("typeSettings", typeSettings);
			_parameters.Add("hidden", hidden);
			_parameters.Add("friendlyURLMap", friendlyURLMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/add-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddLayoutAsync(long groupId, bool privateLayout, long parentLayoutId, string name, string title, string description, string type, bool hidden, string friendlyURL, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);
			_parameters.Add("name", name);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("hidden", hidden);
			_parameters.Add("friendlyURL", friendlyURL);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/add-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutAsync(long groupId, bool privateLayout, long layoutId, string typeSettings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("typeSettings", typeSettings);

			var _command = new JsonObject()
			{
				{ "/layout/update-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutAsync(long groupId, bool privateLayout, long layoutId, long parentLayoutId, IDictionary<string, string> localeNamesMap, IDictionary<string, string> localeTitlesMap, IDictionary<string, string> descriptionMap, IDictionary<string, string> keywordsMap, IDictionary<string, string> robotsMap, string type, bool hidden, IDictionary<string, string> friendlyURLMap, bool iconImage, byte[] iconBytes, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("parentLayoutId", parentLayoutId);
			_parameters.Add("localeNamesMap", localeNamesMap);
			_parameters.Add("localeTitlesMap", localeTitlesMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("keywordsMap", keywordsMap);
			_parameters.Add("robotsMap", robotsMap);
			_parameters.Add("type", type);
			_parameters.Add("hidden", hidden);
			_parameters.Add("friendlyURLMap", friendlyURLMap);
			_parameters.Add("iconImage", iconImage);
			_parameters.Add("iconBytes", iconBytes);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/update-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteLayoutAsync(long groupId, bool privateLayout, long layoutId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/delete-layout", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteLayoutAsync(long plid, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/delete-layout", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<string> GetLayoutNameAsync(long groupId, bool privateLayout, long layoutId, string languageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("languageId", languageId);

			var _command = new JsonObject()
			{
				{ "/layout/get-layout-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<byte[]> ExportPortletInfoAsync(long companyId, string portletId, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-portlet-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (byte[])_obj;
		}

		public async Task<byte[]> ExportPortletInfoAsync(long plid, long groupId, string portletId, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-portlet-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (byte[])_obj;
		}

		public async Task<byte[]> ExportLayoutsAsync(long groupId, bool privateLayout, IEnumerable<long> layoutIds, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutIds", layoutIds);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-layouts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (byte[])_obj;
		}

		public async Task<byte[]> ExportLayoutsAsync(long groupId, bool privateLayout, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-layouts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (byte[])_obj;
		}

		public async Task<dynamic> UpdateParentLayoutIdAsync(long groupId, bool privateLayout, long layoutId, long parentLayoutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("parentLayoutId", parentLayoutId);

			var _command = new JsonObject()
			{
				{ "/layout/update-parent-layout-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateParentLayoutIdAsync(long plid, long parentPlid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("parentPlid", parentPlid);

			var _command = new JsonObject()
			{
				{ "/layout/update-parent-layout-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAncestorLayoutsAsync(long plid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);

			var _command = new JsonObject()
			{
				{ "/layout/get-ancestor-layouts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutReferencesAsync(long companyId, string portletId, string preferencesKey, string preferencesValue)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("preferencesKey", preferencesKey);
			_parameters.Add("preferencesValue", preferencesValue);

			var _command = new JsonObject()
			{
				{ "/layout/get-layout-references", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task SchedulePublishToLiveAsync(long sourceGroupId, long targetGroupId, bool privateLayout, IDictionary<string, object> layoutIdMap, IDictionary<string, object> parameterMap, string scope, long startDate, long endDate, string groupName, string cronText, long schedulerStartDate, long schedulerEndDate, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sourceGroupId", sourceGroupId);
			_parameters.Add("targetGroupId", targetGroupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutIdMap", layoutIdMap);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("scope", scope);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("groupName", groupName);
			_parameters.Add("cronText", cronText);
			_parameters.Add("schedulerStartDate", schedulerStartDate);
			_parameters.Add("schedulerEndDate", schedulerEndDate);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/layout/schedule-publish-to-live", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SchedulePublishToLiveAsync(long sourceGroupId, long targetGroupId, bool privateLayout, IEnumerable<long> layoutIds, IDictionary<string, object> parameterMap, string groupName, string cronText, long schedulerStartDate, long schedulerEndDate, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sourceGroupId", sourceGroupId);
			_parameters.Add("targetGroupId", targetGroupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutIds", layoutIds);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("groupName", groupName);
			_parameters.Add("cronText", cronText);
			_parameters.Add("schedulerStartDate", schedulerStartDate);
			_parameters.Add("schedulerEndDate", schedulerEndDate);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/layout/schedule-publish-to-live", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SchedulePublishToLiveAsync(long sourceGroupId, long targetGroupId, bool privateLayout, IEnumerable<long> layoutIds, IDictionary<string, object> parameterMap, string scope, long startDate, long endDate, string groupName, string cronText, long schedulerStartDate, long schedulerEndDate, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sourceGroupId", sourceGroupId);
			_parameters.Add("targetGroupId", targetGroupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutIds", layoutIds);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("scope", scope);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("groupName", groupName);
			_parameters.Add("cronText", cronText);
			_parameters.Add("schedulerStartDate", schedulerStartDate);
			_parameters.Add("schedulerEndDate", schedulerEndDate);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/layout/schedule-publish-to-live", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SchedulePublishToRemoteAsync(long sourceGroupId, bool privateLayout, IDictionary<string, object> layoutIdMap, IDictionary<string, object> parameterMap, string remoteAddress, int remotePort, string remotePathContext, bool secureConnection, long remoteGroupId, bool remotePrivateLayout, long startDate, long endDate, string groupName, string cronText, long schedulerStartDate, long schedulerEndDate, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sourceGroupId", sourceGroupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutIdMap", layoutIdMap);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("remoteAddress", remoteAddress);
			_parameters.Add("remotePort", remotePort);
			_parameters.Add("remotePathContext", remotePathContext);
			_parameters.Add("secureConnection", secureConnection);
			_parameters.Add("remoteGroupId", remoteGroupId);
			_parameters.Add("remotePrivateLayout", remotePrivateLayout);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("groupName", groupName);
			_parameters.Add("cronText", cronText);
			_parameters.Add("schedulerStartDate", schedulerStartDate);
			_parameters.Add("schedulerEndDate", schedulerEndDate);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/layout/schedule-publish-to-remote", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnschedulePublishToLiveAsync(long groupId, string jobName, string groupName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("jobName", jobName);
			_parameters.Add("groupName", groupName);

			var _command = new JsonObject()
			{
				{ "/layout/unschedule-publish-to-live", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnschedulePublishToRemoteAsync(long groupId, string jobName, string groupName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("jobName", jobName);
			_parameters.Add("groupName", groupName);

			var _command = new JsonObject()
			{
				{ "/layout/unschedule-publish-to-remote", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateIconImageAsync(long plid, byte[] bytes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("bytes", bytes);

			var _command = new JsonObject()
			{
				{ "/layout/update-icon-image", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateNameAsync(long groupId, bool privateLayout, long layoutId, string name, string languageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("name", name);
			_parameters.Add("languageId", languageId);

			var _command = new JsonObject()
			{
				{ "/layout/update-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateNameAsync(long plid, string name, string languageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("name", name);
			_parameters.Add("languageId", languageId);

			var _command = new JsonObject()
			{
				{ "/layout/update-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateParentLayoutIdAndPriorityAsync(long plid, long parentPlid, int priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("parentPlid", parentPlid);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/layout/update-parent-layout-id-and-priority", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePriorityAsync(long groupId, bool privateLayout, long layoutId, int priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/layout/update-priority", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePriorityAsync(long plid, int priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/layout/update-priority", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePriorityAsync(long groupId, bool privateLayout, long layoutId, long nextLayoutId, long previousLayoutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("nextLayoutId", nextLayoutId);
			_parameters.Add("previousLayoutId", previousLayoutId);

			var _command = new JsonObject()
			{
				{ "/layout/update-priority", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteTempFileEntryAsync(long groupId, string folderName, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderName", folderName);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/layout/delete-temp-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<string>> GetTempFileNamesAsync(long groupId, string folderName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderName", folderName);

			var _command = new JsonObject()
			{
				{ "/layout/get-temp-file-names", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<string>();
		}

		public async Task ImportPortletInfoAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-portlet-info", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task ImportPortletInfoAsync(long plid, long groupId, string portletId, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-portlet-info", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task ImportPortletInfoAsync(string portletId, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-portlet-info", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> ImportPortletInfoInBackgroundAsync(string taskName, long plid, long groupId, string portletId, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("taskName", taskName);
			_parameters.Add("plid", plid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-portlet-info-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task ImportPortletInfoInBackgroundAsync(string taskName, string portletId, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("taskName", taskName);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-portlet-info-in-background", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> ValidateImportLayoutsFileAsync(long groupId, bool privateLayout, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/validate-import-layouts-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ValidateImportLayoutsFileAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/validate-import-layouts-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ValidateImportPortletInfoAsync(long plid, long groupId, string portletId, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/validate-import-portlet-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ValidateImportPortletInfoAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/validate-import-portlet-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetDefaultPlidAsync(long groupId, long scopeGroupId, bool privateLayout, string portletId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("portletId", portletId);

			var _command = new JsonObject()
			{
				{ "/layout/get-default-plid", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetDefaultPlidAsync(long groupId, long scopeGroupId, string portletId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("portletId", portletId);

			var _command = new JsonObject()
			{
				{ "/layout/get-default-plid", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteLayoutBranchAsync(long layoutBranchId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutBranchId", layoutBranchId);

			var _command = new JsonObject()
			{
				{ "/layoutbranch/delete-layout-branch", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddLayoutBranchAsync(long layoutRevisionId, string name, string description, bool master, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutRevisionId", layoutRevisionId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("master", master);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutbranch/add-layout-branch", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutBranchAsync(long layoutBranchId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutBranchId", layoutBranchId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutbranch/update-layout-branch", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetLayoutPrototypeAsync(long layoutPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/get-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutPrototypeAsync(long layoutPrototypeId, IDictionary<string, string> nameMap, string description, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/update-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutPrototypeAsync(long layoutPrototypeId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/update-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchLayoutPrototypeAsync(long layoutPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/fetch-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteLayoutPrototypeAsync(long layoutPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/delete-layout-prototype", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddLayoutPrototypeAsync(IDictionary<string, string> nameMap, string description, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/add-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddLayoutPrototypeAsync(IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/add-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, bool active, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddLayoutRevisionAsync(long userId, long layoutSetBranchId, long layoutBranchId, long parentLayoutRevisionId, bool head, long plid, long portletPreferencesPlid, bool privateLayout, string name, string title, string description, string keywords, string robots, string typeSettings, bool iconImage, long iconImageId, string themeId, string colorSchemeId, string css, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("layoutSetBranchId", layoutSetBranchId);
			_parameters.Add("layoutBranchId", layoutBranchId);
			_parameters.Add("parentLayoutRevisionId", parentLayoutRevisionId);
			_parameters.Add("head", head);
			_parameters.Add("plid", plid);
			_parameters.Add("portletPreferencesPlid", portletPreferencesPlid);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("name", name);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("keywords", keywords);
			_parameters.Add("robots", robots);
			_parameters.Add("typeSettings", typeSettings);
			_parameters.Add("iconImage", iconImage);
			_parameters.Add("iconImageId", iconImageId);
			_parameters.Add("themeId", themeId);
			_parameters.Add("colorSchemeId", colorSchemeId);
			_parameters.Add("css", css);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutrevision/add-layout-revision", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSettingsAsync(long groupId, bool privateLayout, string settings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("settings", settings);

			var _command = new JsonObject()
			{
				{ "/layoutset/update-settings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLookAndFeelAsync(long groupId, bool privateLayout, string themeId, string colorSchemeId, string css)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("themeId", themeId);
			_parameters.Add("colorSchemeId", colorSchemeId);
			_parameters.Add("css", css);

			var _command = new JsonObject()
			{
				{ "/layoutset/update-look-and-feel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateLayoutSetPrototypeLinkEnabledAsync(long groupId, bool privateLayout, bool layoutSetPrototypeLinkEnabled, string layoutSetPrototypeUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutSetPrototypeLinkEnabled", layoutSetPrototypeLinkEnabled);
			_parameters.Add("layoutSetPrototypeUuid", layoutSetPrototypeUuid);

			var _command = new JsonObject()
			{
				{ "/layoutset/update-layout-set-prototype-link-enabled", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateVirtualHostAsync(long groupId, bool privateLayout, string virtualHost)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("virtualHost", virtualHost);

			var _command = new JsonObject()
			{
				{ "/layoutset/update-virtual-host", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateLogoAsync(long groupId, bool privateLayout, bool logo, byte[] bytes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("logo", logo);
			_parameters.Add("bytes", bytes);

			var _command = new JsonObject()
			{
				{ "/layoutset/update-logo", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateLogoAsync(long groupId, bool privateLayout, bool logo, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("logo", logo);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layoutset/update-logo", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddLayoutSetBranchAsync(long groupId, bool privateLayout, string name, string description, bool master, long copyLayoutSetBranchId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("master", master);
			_parameters.Add("copyLayoutSetBranchId", copyLayoutSetBranchId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetbranch/add-layout-set-branch", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutSetBranchAsync(long groupId, long layoutSetBranchId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutSetBranchId", layoutSetBranchId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetbranch/update-layout-set-branch", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteLayoutSetBranchAsync(long layoutSetBranchId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetBranchId", layoutSetBranchId);

			var _command = new JsonObject()
			{
				{ "/layoutsetbranch/delete-layout-set-branch", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> MergeLayoutSetBranchAsync(long layoutSetBranchId, long mergeLayoutSetBranchId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetBranchId", layoutSetBranchId);
			_parameters.Add("mergeLayoutSetBranchId", mergeLayoutSetBranchId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetbranch/merge-layout-set-branch", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutSetBranchesAsync(long groupId, bool privateLayout)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);

			var _command = new JsonObject()
			{
				{ "/layoutsetbranch/get-layout-set-branches", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetLayoutSetPrototypeAsync(long layoutSetPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/get-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchLayoutSetPrototypeAsync(long layoutSetPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/fetch-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteLayoutSetPrototypeAsync(long layoutSetPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/delete-layout-set-prototype", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddLayoutSetPrototypeAsync(IDictionary<string, string> nameMap, string description, bool active, bool layoutsUpdateable, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			_parameters.Add("layoutsUpdateable", layoutsUpdateable);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/add-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddLayoutSetPrototypeAsync(IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, bool layoutsUpdateable, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			_parameters.Add("layoutsUpdateable", layoutsUpdateable);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/add-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutSetPrototypeAsync(long layoutSetPrototypeId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, bool layoutsUpdateable, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			_parameters.Add("layoutsUpdateable", layoutsUpdateable);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/update-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutSetPrototypeAsync(long layoutSetPrototypeId, IDictionary<string, string> nameMap, string description, bool active, bool layoutsUpdateable, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			_parameters.Add("layoutsUpdateable", layoutsUpdateable);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/update-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutSetPrototypeAsync(long layoutSetPrototypeId, string settings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);
			_parameters.Add("settings", settings);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/update-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, bool active, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetListTypesAsync(string type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/listtype/get-list-types", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetListTypeAsync(long listTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("listTypeId", listTypeId);

			var _command = new JsonObject()
			{
				{ "/listtype/get-list-type", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task ValidateAsync(long listTypeId, long classNameId, string type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("listTypeId", listTypeId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/listtype/validate", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task ValidateAsync(long listTypeId, string type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("listTypeId", listTypeId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/listtype/validate", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateStatusAsync(long membershipRequestId, string reviewComments, long statusId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("membershipRequestId", membershipRequestId);
			_parameters.Add("reviewComments", reviewComments);
			_parameters.Add("statusId", statusId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/membershiprequest/update-status", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddMembershipRequestAsync(long groupId, string comments, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("comments", comments);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/membershiprequest/add-membership-request", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetMembershipRequestAsync(long membershipRequestId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("membershipRequestId", membershipRequestId);

			var _command = new JsonObject()
			{
				{ "/membershiprequest/get-membership-request", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteMembershipRequestsAsync(long groupId, long statusId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("statusId", statusId);

			var _command = new JsonObject()
			{
				{ "/membershiprequest/delete-membership-requests", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> GetOrganizationIdAsync(long companyId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/organization/get-organization-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserOrganizationsAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/organization/get-user-organizations", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetOrganizationsAsync(long companyId, long parentOrganizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);

			var _command = new JsonObject()
			{
				{ "/organization/get-organizations", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetOrganizationsAsync(long companyId, long parentOrganizationId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/organization/get-organizations", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> FetchOrganizationAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/organization/fetch-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddOrganizationAsync(long parentOrganizationId, string name, string type, long regionId, long countryId, long statusId, string comments, bool site, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> orgLabors, IEnumerable<object> phones, IEnumerable<object> websites, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("statusId", statusId);
			_parameters.Add("comments", comments);
			_parameters.Add("site", site);
			_parameters.Add("addresses", addresses);
			_parameters.Add("emailAddresses", emailAddresses);
			_parameters.Add("orgLabors", orgLabors);
			_parameters.Add("phones", phones);
			_parameters.Add("websites", websites);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/add-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddOrganizationAsync(long parentOrganizationId, string name, string type, long regionId, long countryId, long statusId, string comments, bool site, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("statusId", statusId);
			_parameters.Add("comments", comments);
			_parameters.Add("site", site);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/add-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateOrganizationAsync(long organizationId, long parentOrganizationId, string name, string type, long regionId, long countryId, long statusId, string comments, bool site, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> orgLabors, IEnumerable<object> phones, IEnumerable<object> websites, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("statusId", statusId);
			_parameters.Add("comments", comments);
			_parameters.Add("site", site);
			_parameters.Add("addresses", addresses);
			_parameters.Add("emailAddresses", emailAddresses);
			_parameters.Add("orgLabors", orgLabors);
			_parameters.Add("phones", phones);
			_parameters.Add("websites", websites);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/update-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateOrganizationAsync(long organizationId, long parentOrganizationId, string name, string type, long regionId, long countryId, long statusId, string comments, bool site, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("statusId", statusId);
			_parameters.Add("comments", comments);
			_parameters.Add("site", site);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/update-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateOrganizationAsync(long organizationId, long parentOrganizationId, string name, string type, long regionId, long countryId, long statusId, string comments, bool logo, byte[] logoBytes, bool site, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> orgLabors, IEnumerable<object> phones, IEnumerable<object> websites, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("statusId", statusId);
			_parameters.Add("comments", comments);
			_parameters.Add("logo", logo);
			_parameters.Add("logoBytes", logoBytes);
			_parameters.Add("site", site);
			_parameters.Add("addresses", addresses);
			_parameters.Add("emailAddresses", emailAddresses);
			_parameters.Add("orgLabors", orgLabors);
			_parameters.Add("phones", phones);
			_parameters.Add("websites", websites);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/organization/update-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UnsetGroupOrganizationsAsync(long groupId, IEnumerable<long> organizationIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("organizationIds", organizationIds);

			var _command = new JsonObject()
			{
				{ "/organization/unset-group-organizations", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsetPasswordPolicyOrganizationsAsync(long passwordPolicyId, IEnumerable<long> organizationIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("passwordPolicyId", passwordPolicyId);
			_parameters.Add("organizationIds", organizationIds);

			var _command = new JsonObject()
			{
				{ "/organization/unset-password-policy-organizations", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddGroupOrganizationsAsync(long groupId, IEnumerable<long> organizationIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("organizationIds", organizationIds);

			var _command = new JsonObject()
			{
				{ "/organization/add-group-organizations", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetGroupOrganizationsAsync(long groupId, IEnumerable<long> organizationIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("organizationIds", organizationIds);

			var _command = new JsonObject()
			{
				{ "/organization/set-group-organizations", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddPasswordPolicyOrganizationsAsync(long passwordPolicyId, IEnumerable<long> organizationIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("passwordPolicyId", passwordPolicyId);
			_parameters.Add("organizationIds", organizationIds);

			var _command = new JsonObject()
			{
				{ "/organization/add-password-policy-organizations", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteOrganizationAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/organization/delete-organization", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> GetOrganizationsCountAsync(long companyId, long parentOrganizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentOrganizationId", parentOrganizationId);

			var _command = new JsonObject()
			{
				{ "/organization/get-organizations-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteLogoAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/organization/delete-logo", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetOrganizationAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/organization/get-organization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetOrgLaborAsync(long orgLaborId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("orgLaborId", orgLaborId);

			var _command = new JsonObject()
			{
				{ "/orglabor/get-org-labor", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteOrgLaborAsync(long orgLaborId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("orgLaborId", orgLaborId);

			var _command = new JsonObject()
			{
				{ "/orglabor/delete-org-labor", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetOrgLaborsAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/orglabor/get-org-labors", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddOrgLaborAsync(long organizationId, long typeId, int sunOpen, int sunClose, int monOpen, int monClose, int tueOpen, int tueClose, int wedOpen, int wedClose, int thuOpen, int thuClose, int friOpen, int friClose, int satOpen, int satClose)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("typeId", typeId);
			_parameters.Add("sunOpen", sunOpen);
			_parameters.Add("sunClose", sunClose);
			_parameters.Add("monOpen", monOpen);
			_parameters.Add("monClose", monClose);
			_parameters.Add("tueOpen", tueOpen);
			_parameters.Add("tueClose", tueClose);
			_parameters.Add("wedOpen", wedOpen);
			_parameters.Add("wedClose", wedClose);
			_parameters.Add("thuOpen", thuOpen);
			_parameters.Add("thuClose", thuClose);
			_parameters.Add("friOpen", friOpen);
			_parameters.Add("friClose", friClose);
			_parameters.Add("satOpen", satOpen);
			_parameters.Add("satClose", satClose);

			var _command = new JsonObject()
			{
				{ "/orglabor/add-org-labor", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateOrgLaborAsync(long orgLaborId, long typeId, int sunOpen, int sunClose, int monOpen, int monClose, int tueOpen, int tueClose, int wedOpen, int wedClose, int thuOpen, int thuClose, int friOpen, int friClose, int satOpen, int satClose)
		{
			var _parameters = new JsonObject();

			_parameters.Add("orgLaborId", orgLaborId);
			_parameters.Add("typeId", typeId);
			_parameters.Add("sunOpen", sunOpen);
			_parameters.Add("sunClose", sunClose);
			_parameters.Add("monOpen", monOpen);
			_parameters.Add("monClose", monClose);
			_parameters.Add("tueOpen", tueOpen);
			_parameters.Add("tueClose", tueClose);
			_parameters.Add("wedOpen", wedOpen);
			_parameters.Add("wedClose", wedClose);
			_parameters.Add("thuOpen", thuOpen);
			_parameters.Add("thuClose", thuClose);
			_parameters.Add("friOpen", friOpen);
			_parameters.Add("friClose", friClose);
			_parameters.Add("satOpen", satOpen);
			_parameters.Add("satClose", satClose);

			var _command = new JsonObject()
			{
				{ "/orglabor/update-org-labor", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> AddPasswordPolicyAsync(string name, string description, bool changeable, bool changeRequired, long minAge, bool checkSyntax, bool allowDictionaryWords, int minAlphanumeric, int minLength, int minLowerCase, int minNumbers, int minSymbols, int minUpperCase, string regex, bool history, int historyCount, bool expireable, long maxAge, long warningTime, int graceLimit, bool lockout, int maxFailure, long lockoutDuration, long resetFailureCount, long resetTicketMaxAge, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("changeable", changeable);
			_parameters.Add("changeRequired", changeRequired);
			_parameters.Add("minAge", minAge);
			_parameters.Add("checkSyntax", checkSyntax);
			_parameters.Add("allowDictionaryWords", allowDictionaryWords);
			_parameters.Add("minAlphanumeric", minAlphanumeric);
			_parameters.Add("minLength", minLength);
			_parameters.Add("minLowerCase", minLowerCase);
			_parameters.Add("minNumbers", minNumbers);
			_parameters.Add("minSymbols", minSymbols);
			_parameters.Add("minUpperCase", minUpperCase);
			_parameters.Add("regex", regex);
			_parameters.Add("history", history);
			_parameters.Add("historyCount", historyCount);
			_parameters.Add("expireable", expireable);
			_parameters.Add("maxAge", maxAge);
			_parameters.Add("warningTime", warningTime);
			_parameters.Add("graceLimit", graceLimit);
			_parameters.Add("lockout", lockout);
			_parameters.Add("maxFailure", maxFailure);
			_parameters.Add("lockoutDuration", lockoutDuration);
			_parameters.Add("resetFailureCount", resetFailureCount);
			_parameters.Add("resetTicketMaxAge", resetTicketMaxAge);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/add-password-policy", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePasswordPolicyAsync(long passwordPolicyId, string name, string description, bool changeable, bool changeRequired, long minAge, bool checkSyntax, bool allowDictionaryWords, int minAlphanumeric, int minLength, int minLowerCase, int minNumbers, int minSymbols, int minUpperCase, string regex, bool history, int historyCount, bool expireable, long maxAge, long warningTime, int graceLimit, bool lockout, int maxFailure, long lockoutDuration, long resetFailureCount, long resetTicketMaxAge, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("passwordPolicyId", passwordPolicyId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("changeable", changeable);
			_parameters.Add("changeRequired", changeRequired);
			_parameters.Add("minAge", minAge);
			_parameters.Add("checkSyntax", checkSyntax);
			_parameters.Add("allowDictionaryWords", allowDictionaryWords);
			_parameters.Add("minAlphanumeric", minAlphanumeric);
			_parameters.Add("minLength", minLength);
			_parameters.Add("minLowerCase", minLowerCase);
			_parameters.Add("minNumbers", minNumbers);
			_parameters.Add("minSymbols", minSymbols);
			_parameters.Add("minUpperCase", minUpperCase);
			_parameters.Add("regex", regex);
			_parameters.Add("history", history);
			_parameters.Add("historyCount", historyCount);
			_parameters.Add("expireable", expireable);
			_parameters.Add("maxAge", maxAge);
			_parameters.Add("warningTime", warningTime);
			_parameters.Add("graceLimit", graceLimit);
			_parameters.Add("lockout", lockout);
			_parameters.Add("maxFailure", maxFailure);
			_parameters.Add("lockoutDuration", lockoutDuration);
			_parameters.Add("resetFailureCount", resetFailureCount);
			_parameters.Add("resetTicketMaxAge", resetTicketMaxAge);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/update-password-policy", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeletePasswordPolicyAsync(long passwordPolicyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("passwordPolicyId", passwordPolicyId);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/delete-password-policy", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchPasswordPolicyAsync(long passwordPolicyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("passwordPolicyId", passwordPolicyId);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/fetch-password-policy", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, string name, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task CheckPermissionAsync(long groupId, string name, string primKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("primKey", primKey);

			var _command = new JsonObject()
			{
				{ "/permission/check-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeletePhoneAsync(long phoneId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("phoneId", phoneId);

			var _command = new JsonObject()
			{
				{ "/phone/delete-phone", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetPhoneAsync(long phoneId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("phoneId", phoneId);

			var _command = new JsonObject()
			{
				{ "/phone/get-phone", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetPhonesAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/phone/get-phones", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdatePhoneAsync(long phoneId, string number, string extension, long typeId, bool primary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("phoneId", phoneId);
			_parameters.Add("number", number);
			_parameters.Add("extension", extension);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);

			var _command = new JsonObject()
			{
				{ "/phone/update-phone", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddPhoneAsync(string className, long classPK, string number, string extension, long typeId, bool primary, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("number", number);
			_parameters.Add("extension", extension);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/phone/add-phone", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePluginSettingAsync(long companyId, string pluginId, string pluginType, string roles, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("pluginId", pluginId);
			_parameters.Add("pluginType", pluginType);
			_parameters.Add("roles", roles);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/pluginsetting/update-plugin-setting", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetBuildNumberAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/portal/get-build-number", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<string> GetVersionAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/portal/get-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task DeleteArchivedPreferencesAsync(long portletItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("portletItemId", portletItemId);

			var _command = new JsonObject()
			{
				{ "/portletpreferences/delete-archived-preferences", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddRegionAsync(long countryId, string regionCode, string name, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);
			_parameters.Add("regionCode", regionCode);
			_parameters.Add("name", name);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/region/add-region", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRegionsAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/region/get-regions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRegionsAsync(long countryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);

			var _command = new JsonObject()
			{
				{ "/region/get-regions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRegionsAsync(bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/region/get-regions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRegionsAsync(long countryId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/region/get-regions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> FetchRegionAsync(long regionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("regionId", regionId);

			var _command = new JsonObject()
			{
				{ "/region/fetch-region", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchRegionAsync(long countryId, string regionCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);
			_parameters.Add("regionCode", regionCode);

			var _command = new JsonObject()
			{
				{ "/region/fetch-region", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetRegionAsync(long regionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("regionId", regionId);

			var _command = new JsonObject()
			{
				{ "/region/get-region", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetRegionAsync(long countryId, string regionCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);
			_parameters.Add("regionCode", regionCode);

			var _command = new JsonObject()
			{
				{ "/region/get-region", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteRepositoryAsync(long repositoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);

			var _command = new JsonObject()
			{
				{ "/repository/delete-repository", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> GetTypeSettingsPropertiesAsync(long repositoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);

			var _command = new JsonObject()
			{
				{ "/repository/get-type-settings-properties", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task UpdateRepositoryAsync(long repositoryId, string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/repository/update-repository", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task CheckRepositoryAsync(long repositoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);

			var _command = new JsonObject()
			{
				{ "/repository/check-repository", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetRepositoryAsync(long repositoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);

			var _command = new JsonObject()
			{
				{ "/repository/get-repository", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddRepositoryAsync(long groupId, long classNameId, long parentFolderId, string name, string description, string portletId, IDictionary<string, object> typeSettingsProperties, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("portletId", portletId);
			_parameters.Add("typeSettingsProperties", typeSettingsProperties);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/repository/add-repository", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<string>> GetSupportedConfigurationsAsync(long classNameId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);

			var _command = new JsonObject()
			{
				{ "/repository/get-supported-configurations", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<string>();
		}

		public async Task<IEnumerable<string>> GetSupportedParametersAsync(string className, string configuration)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("configuration", configuration);

			var _command = new JsonObject()
			{
				{ "/repository/get-supported-parameters", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<string>();
		}

		public async Task<IEnumerable<string>> GetSupportedParametersAsync(long classNameId, string configuration)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("configuration", configuration);

			var _command = new JsonObject()
			{
				{ "/repository/get-supported-parameters", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<string>();
		}

		public async Task AddGroupScopePermissionAsync(long scopeGroupId, long companyId, long groupId, string name, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/add-group-scope-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddIndividualScopePermissionAsync(long companyId, long groupId, string name, long primKey, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/add-individual-scope-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RemoveAllGroupScopePermissionsAsync(long scopeGroupId, long companyId, string name, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/remove-all-group-scope-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RemoveCompanyScopePermissionAsync(long scopeGroupId, long companyId, string name, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/remove-company-scope-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RemoveGroupScopePermissionAsync(long scopeGroupId, long companyId, long groupId, string name, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/remove-group-scope-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RemoveIndividualScopePermissionAsync(long companyId, long groupId, string name, long primKey, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/remove-individual-scope-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetCompanyScopePermissionsAsync(long scopeGroupId, long companyId, string name, long roleId, IEnumerable<string> actionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionIds", actionIds);

			var _command = new JsonObject()
			{
				{ "/resourceblock/set-company-scope-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetGroupScopePermissionsAsync(long scopeGroupId, long companyId, long groupId, string name, long roleId, IEnumerable<string> actionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionIds", actionIds);

			var _command = new JsonObject()
			{
				{ "/resourceblock/set-group-scope-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddCompanyScopePermissionAsync(long scopeGroupId, long companyId, string name, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourceblock/add-company-scope-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetIndividualScopePermissionsAsync(long companyId, long groupId, string name, long primKey, long roleId, IEnumerable<string> actionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionIds", actionIds);

			var _command = new JsonObject()
			{
				{ "/resourceblock/set-individual-scope-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetIndividualScopePermissionsAsync(long companyId, long groupId, string name, long primKey, IDictionary<string, object> roleIdsToActionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleIdsToActionIds", roleIdsToActionIds);

			var _command = new JsonObject()
			{
				{ "/resourceblock/set-individual-scope-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddResourcePermissionAsync(long groupId, long companyId, string name, int scope, string primKey, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("scope", scope);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourcepermission/add-resource-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RemoveResourcePermissionAsync(long groupId, long companyId, string name, int scope, string primKey, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("scope", scope);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourcepermission/remove-resource-permission", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RemoveResourcePermissionsAsync(long groupId, long companyId, string name, int scope, long roleId, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("scope", scope);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/resourcepermission/remove-resource-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetIndividualResourcePermissionsAsync(long groupId, long companyId, string name, string primKey, long roleId, IEnumerable<string> actionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleId", roleId);
			_parameters.Add("actionIds", actionIds);

			var _command = new JsonObject()
			{
				{ "/resourcepermission/set-individual-resource-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetIndividualResourcePermissionsAsync(long groupId, long companyId, string name, string primKey, IDictionary<string, object> roleIdsToActionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("primKey", primKey);
			_parameters.Add("roleIdsToActionIds", roleIdsToActionIds);

			var _command = new JsonObject()
			{
				{ "/resourcepermission/set-individual-resource-permissions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> SearchCountAsync(long companyId, string keywords, IEnumerable<int> types, IDictionary<string, object> _params)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("types", types);
			_parameters.Add("params", _params);

			var _command = new JsonObject()
			{
				{ "/role/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<bool> HasUserRoleAsync(long userId, long companyId, string name, bool inherited)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("inherited", inherited);

			var _command = new JsonObject()
			{
				{ "/role/has-user-role", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task AddUserRolesAsync(long userId, IEnumerable<long> roleIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("roleIds", roleIds);

			var _command = new JsonObject()
			{
				{ "/role/add-user-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetGroupRolesAndTeamRolesAsync(long companyId, string keywords, IEnumerable<string> excludedNames, IEnumerable<int> types, long excludedTeamRoleId, long teamGroupId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("excludedNames", excludedNames);
			_parameters.Add("types", types);
			_parameters.Add("excludedTeamRoleId", excludedTeamRoleId);
			_parameters.Add("teamGroupId", teamGroupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/role/get-group-roles-and-team-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupRolesAndTeamRolesCountAsync(long companyId, string keywords, IEnumerable<string> excludedNames, IEnumerable<int> types, long excludedTeamRoleId, long teamGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("excludedNames", excludedNames);
			_parameters.Add("types", types);
			_parameters.Add("excludedTeamRoleId", excludedTeamRoleId);
			_parameters.Add("teamGroupId", teamGroupId);

			var _command = new JsonObject()
			{
				{ "/role/get-group-roles-and-team-roles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserGroupGroupRolesAsync(long userId, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/role/get-user-group-group-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserRolesAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/role/get-user-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserGroupRolesAsync(long userId, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/role/get-user-group-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserRelatedRolesAsync(long userId, IEnumerable<object> groups)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groups", groups);

			var _command = new JsonObject()
			{
				{ "/role/get-user-related-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> FetchRoleAsync(long roleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);

			var _command = new JsonObject()
			{
				{ "/role/fetch-role", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UnsetUserRolesAsync(long userId, IEnumerable<long> roleIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("roleIds", roleIds);

			var _command = new JsonObject()
			{
				{ "/role/unset-user-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetGroupRolesAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/role/get-group-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<bool> HasUserRolesAsync(long userId, long companyId, IEnumerable<string> names, bool inherited)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("companyId", companyId);
			_parameters.Add("names", names);
			_parameters.Add("inherited", inherited);

			var _command = new JsonObject()
			{
				{ "/role/has-user-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<dynamic> UpdateRoleAsync(long roleId, string name, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string subtype, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);
			_parameters.Add("name", name);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("subtype", subtype);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/role/update-role", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteRoleAsync(long roleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);

			var _command = new JsonObject()
			{
				{ "/role/delete-role", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetRolesAsync(long companyId, IEnumerable<int> types)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("types", types);

			var _command = new JsonObject()
			{
				{ "/role/get-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRolesAsync(int type, string subtype)
		{
			var _parameters = new JsonObject();

			_parameters.Add("type", type);
			_parameters.Add("subtype", subtype);

			var _command = new JsonObject()
			{
				{ "/role/get-roles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetRoleAsync(long companyId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/role/get-role", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetRoleAsync(long roleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);

			var _command = new JsonObject()
			{
				{ "/role/get-role", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddRoleAsync(string className, long classPK, string name, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, int type, string subtype, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("name", name);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("subtype", subtype);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/role/add-role", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, string keywords, IEnumerable<int> types, IDictionary<string, object> _params, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("types", types);
			_parameters.Add("params", _params);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/role/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> SearchCountAsync(long groupId, string name, string description, IDictionary<string, object> _params)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("params", _params);

			var _command = new JsonObject()
			{
				{ "/team/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> AddTeamAsync(long groupId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/team/add-team", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddTeamAsync(long groupId, string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/team/add-team", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateTeamAsync(long teamId, string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("teamId", teamId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/team/update-team", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteTeamAsync(long teamId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("teamId", teamId);

			var _command = new JsonObject()
			{
				{ "/team/delete-team", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetGroupTeamsAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/team/get-group-teams", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<bool> HasUserTeamAsync(long userId, long teamId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("teamId", teamId);

			var _command = new JsonObject()
			{
				{ "/team/has-user-team", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserTeamsAsync(long userId, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/team/get-user-teams", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserTeamsAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/team/get-user-teams", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetTeamAsync(long teamId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("teamId", teamId);

			var _command = new JsonObject()
			{
				{ "/team/get-team", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetTeamAsync(long groupId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/team/get-team", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long groupId, string name, string description, IDictionary<string, object> _params, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("params", _params);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/team/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetWarThemesAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/theme/get-war-themes", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetThemesAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/theme/get-themes", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateStatusAsync(long userId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/user/update-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateStatusAsync(long userId, int status, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/user/update-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeletePortraitAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/user/delete-portrait", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteRoleUserAsync(long roleId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/user/delete-role-user", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCompanyUsersAsync(long companyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/user/get-company-users", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCompanyUsersCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/user/get-company-users-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<long>> GetGroupUserIdsAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/user/get-group-user-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<IEnumerable<long>> GetOrganizationUserIdsAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/user/get-organization-user-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<dynamic> GetUserByEmailAddressAsync(long companyId, string emailAddress)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("emailAddress", emailAddress);

			var _command = new JsonObject()
			{
				{ "/user/get-user-by-email-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetUserIdByEmailAddressAsync(long companyId, string emailAddress)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("emailAddress", emailAddress);

			var _command = new JsonObject()
			{
				{ "/user/get-user-id-by-email-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetUserIdByScreenNameAsync(long companyId, string screenName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("screenName", screenName);

			var _command = new JsonObject()
			{
				{ "/user/get-user-id-by-screen-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<bool> HasRoleUserAsync(long roleId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/user/has-role-user", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> HasRoleUserAsync(long companyId, string name, long userId, bool inherited)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("userId", userId);
			_parameters.Add("inherited", inherited);

			var _command = new JsonObject()
			{
				{ "/user/has-role-user", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task AddOrganizationUsersAsync(long organizationId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/user/add-organization-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddPasswordPolicyUsersAsync(long passwordPolicyId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("passwordPolicyId", passwordPolicyId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/user/add-password-policy-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddRoleUsersAsync(long roleId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/user/add-role-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddTeamUsersAsync(long teamId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("teamId", teamId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/user/add-team-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddUserGroupUsersAsync(long userGroupId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/user/add-user-group-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddUserWithWorkflowAsync(long companyId, bool autoPassword, string password1, string password2, bool autoScreenName, string screenName, string emailAddress, long facebookId, string openId, string locale, string firstName, string middleName, string lastName, long prefixId, long suffixId, bool male, int birthdayMonth, int birthdayDay, int birthdayYear, string jobTitle, IEnumerable<long> groupIds, IEnumerable<long> organizationIds, IEnumerable<long> roleIds, IEnumerable<long> userGroupIds, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> phones, IEnumerable<object> websites, IEnumerable<object> announcementsDelivers, bool sendEmail, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("autoPassword", autoPassword);
			_parameters.Add("password1", password1);
			_parameters.Add("password2", password2);
			_parameters.Add("autoScreenName", autoScreenName);
			_parameters.Add("screenName", screenName);
			_parameters.Add("emailAddress", emailAddress);
			_parameters.Add("facebookId", facebookId);
			_parameters.Add("openId", openId);
			_parameters.Add("locale", locale);
			_parameters.Add("firstName", firstName);
			_parameters.Add("middleName", middleName);
			_parameters.Add("lastName", lastName);
			_parameters.Add("prefixId", prefixId);
			_parameters.Add("suffixId", suffixId);
			_parameters.Add("male", male);
			_parameters.Add("birthdayMonth", birthdayMonth);
			_parameters.Add("birthdayDay", birthdayDay);
			_parameters.Add("birthdayYear", birthdayYear);
			_parameters.Add("jobTitle", jobTitle);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("organizationIds", organizationIds);
			_parameters.Add("roleIds", roleIds);
			_parameters.Add("userGroupIds", userGroupIds);
			_parameters.Add("addresses", addresses);
			_parameters.Add("emailAddresses", emailAddresses);
			_parameters.Add("phones", phones);
			_parameters.Add("websites", websites);
			_parameters.Add("announcementsDelivers", announcementsDelivers);
			_parameters.Add("sendEmail", sendEmail);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/user/add-user-with-workflow", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddUserWithWorkflowAsync(long companyId, bool autoPassword, string password1, string password2, bool autoScreenName, string screenName, string emailAddress, long facebookId, string openId, string locale, string firstName, string middleName, string lastName, long prefixId, long suffixId, bool male, int birthdayMonth, int birthdayDay, int birthdayYear, string jobTitle, IEnumerable<long> groupIds, IEnumerable<long> organizationIds, IEnumerable<long> roleIds, IEnumerable<long> userGroupIds, bool sendEmail, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("autoPassword", autoPassword);
			_parameters.Add("password1", password1);
			_parameters.Add("password2", password2);
			_parameters.Add("autoScreenName", autoScreenName);
			_parameters.Add("screenName", screenName);
			_parameters.Add("emailAddress", emailAddress);
			_parameters.Add("facebookId", facebookId);
			_parameters.Add("openId", openId);
			_parameters.Add("locale", locale);
			_parameters.Add("firstName", firstName);
			_parameters.Add("middleName", middleName);
			_parameters.Add("lastName", lastName);
			_parameters.Add("prefixId", prefixId);
			_parameters.Add("suffixId", suffixId);
			_parameters.Add("male", male);
			_parameters.Add("birthdayMonth", birthdayMonth);
			_parameters.Add("birthdayDay", birthdayDay);
			_parameters.Add("birthdayYear", birthdayYear);
			_parameters.Add("jobTitle", jobTitle);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("organizationIds", organizationIds);
			_parameters.Add("roleIds", roleIds);
			_parameters.Add("userGroupIds", userGroupIds);
			_parameters.Add("sendEmail", sendEmail);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/user/add-user-with-workflow", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetUserByScreenNameAsync(long companyId, string screenName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("screenName", screenName);

			var _command = new JsonObject()
			{
				{ "/user/get-user-by-screen-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UnsetGroupUsersAsync(long groupId, IEnumerable<long> userIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userIds", userIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/user/unset-group-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetUserByIdAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/user/get-user-by-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<long>> GetRoleUserIdsAsync(long roleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);

			var _command = new JsonObject()
			{
				{ "/user/get-role-user-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<dynamic> UpdatePortraitAsync(long userId, byte[] bytes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("bytes", bytes);

			var _command = new JsonObject()
			{
				{ "/user/update-portrait", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupUsersAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/user/get-group-users", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateEmailAddressAsync(long userId, string password, string emailAddress1, string emailAddress2, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("password", password);
			_parameters.Add("emailAddress1", emailAddress1);
			_parameters.Add("emailAddress2", emailAddress2);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/user/update-email-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddUserAsync(long companyId, bool autoPassword, string password1, string password2, bool autoScreenName, string screenName, string emailAddress, long facebookId, string openId, string locale, string firstName, string middleName, string lastName, long prefixId, long suffixId, bool male, int birthdayMonth, int birthdayDay, int birthdayYear, string jobTitle, IEnumerable<long> groupIds, IEnumerable<long> organizationIds, IEnumerable<long> roleIds, IEnumerable<long> userGroupIds, bool sendEmail, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("autoPassword", autoPassword);
			_parameters.Add("password1", password1);
			_parameters.Add("password2", password2);
			_parameters.Add("autoScreenName", autoScreenName);
			_parameters.Add("screenName", screenName);
			_parameters.Add("emailAddress", emailAddress);
			_parameters.Add("facebookId", facebookId);
			_parameters.Add("openId", openId);
			_parameters.Add("locale", locale);
			_parameters.Add("firstName", firstName);
			_parameters.Add("middleName", middleName);
			_parameters.Add("lastName", lastName);
			_parameters.Add("prefixId", prefixId);
			_parameters.Add("suffixId", suffixId);
			_parameters.Add("male", male);
			_parameters.Add("birthdayMonth", birthdayMonth);
			_parameters.Add("birthdayDay", birthdayDay);
			_parameters.Add("birthdayYear", birthdayYear);
			_parameters.Add("jobTitle", jobTitle);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("organizationIds", organizationIds);
			_parameters.Add("roleIds", roleIds);
			_parameters.Add("userGroupIds", userGroupIds);
			_parameters.Add("sendEmail", sendEmail);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/user/add-user", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddUserAsync(long companyId, bool autoPassword, string password1, string password2, bool autoScreenName, string screenName, string emailAddress, long facebookId, string openId, string locale, string firstName, string middleName, string lastName, long prefixId, long suffixId, bool male, int birthdayMonth, int birthdayDay, int birthdayYear, string jobTitle, IEnumerable<long> groupIds, IEnumerable<long> organizationIds, IEnumerable<long> roleIds, IEnumerable<long> userGroupIds, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> phones, IEnumerable<object> websites, IEnumerable<object> announcementsDelivers, bool sendEmail, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("autoPassword", autoPassword);
			_parameters.Add("password1", password1);
			_parameters.Add("password2", password2);
			_parameters.Add("autoScreenName", autoScreenName);
			_parameters.Add("screenName", screenName);
			_parameters.Add("emailAddress", emailAddress);
			_parameters.Add("facebookId", facebookId);
			_parameters.Add("openId", openId);
			_parameters.Add("locale", locale);
			_parameters.Add("firstName", firstName);
			_parameters.Add("middleName", middleName);
			_parameters.Add("lastName", lastName);
			_parameters.Add("prefixId", prefixId);
			_parameters.Add("suffixId", suffixId);
			_parameters.Add("male", male);
			_parameters.Add("birthdayMonth", birthdayMonth);
			_parameters.Add("birthdayDay", birthdayDay);
			_parameters.Add("birthdayYear", birthdayYear);
			_parameters.Add("jobTitle", jobTitle);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("organizationIds", organizationIds);
			_parameters.Add("roleIds", roleIds);
			_parameters.Add("userGroupIds", userGroupIds);
			_parameters.Add("addresses", addresses);
			_parameters.Add("emailAddresses", emailAddresses);
			_parameters.Add("phones", phones);
			_parameters.Add("websites", websites);
			_parameters.Add("announcementsDelivers", announcementsDelivers);
			_parameters.Add("sendEmail", sendEmail);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/user/add-user", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateUserAsync(long userId, string oldPassword, string newPassword1, string newPassword2, bool passwordReset, string reminderQueryQuestion, string reminderQueryAnswer, string screenName, string emailAddress, long facebookId, string openId, string languageId, string timeZoneId, string greeting, string comments, string firstName, string middleName, string lastName, long prefixId, long suffixId, bool male, int birthdayMonth, int birthdayDay, int birthdayYear, string smsSn, string facebookSn, string jabberSn, string skypeSn, string twitterSn, string jobTitle, IEnumerable<long> groupIds, IEnumerable<long> organizationIds, IEnumerable<long> roleIds, IEnumerable<object> userGroupRoles, IEnumerable<long> userGroupIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("oldPassword", oldPassword);
			_parameters.Add("newPassword1", newPassword1);
			_parameters.Add("newPassword2", newPassword2);
			_parameters.Add("passwordReset", passwordReset);
			_parameters.Add("reminderQueryQuestion", reminderQueryQuestion);
			_parameters.Add("reminderQueryAnswer", reminderQueryAnswer);
			_parameters.Add("screenName", screenName);
			_parameters.Add("emailAddress", emailAddress);
			_parameters.Add("facebookId", facebookId);
			_parameters.Add("openId", openId);
			_parameters.Add("languageId", languageId);
			_parameters.Add("timeZoneId", timeZoneId);
			_parameters.Add("greeting", greeting);
			_parameters.Add("comments", comments);
			_parameters.Add("firstName", firstName);
			_parameters.Add("middleName", middleName);
			_parameters.Add("lastName", lastName);
			_parameters.Add("prefixId", prefixId);
			_parameters.Add("suffixId", suffixId);
			_parameters.Add("male", male);
			_parameters.Add("birthdayMonth", birthdayMonth);
			_parameters.Add("birthdayDay", birthdayDay);
			_parameters.Add("birthdayYear", birthdayYear);
			_parameters.Add("smsSn", smsSn);
			_parameters.Add("facebookSn", facebookSn);
			_parameters.Add("jabberSn", jabberSn);
			_parameters.Add("skypeSn", skypeSn);
			_parameters.Add("twitterSn", twitterSn);
			_parameters.Add("jobTitle", jobTitle);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("organizationIds", organizationIds);
			_parameters.Add("roleIds", roleIds);
			_parameters.Add("userGroupRoles", userGroupRoles);
			_parameters.Add("userGroupIds", userGroupIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/user/update-user", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateUserAsync(long userId, string oldPassword, string newPassword1, string newPassword2, bool passwordReset, string reminderQueryQuestion, string reminderQueryAnswer, string screenName, string emailAddress, long facebookId, string openId, bool portrait, byte[] portraitBytes, string languageId, string timeZoneId, string greeting, string comments, string firstName, string middleName, string lastName, long prefixId, long suffixId, bool male, int birthdayMonth, int birthdayDay, int birthdayYear, string smsSn, string facebookSn, string jabberSn, string skypeSn, string twitterSn, string jobTitle, IEnumerable<long> groupIds, IEnumerable<long> organizationIds, IEnumerable<long> roleIds, IEnumerable<object> userGroupRoles, IEnumerable<long> userGroupIds, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> phones, IEnumerable<object> websites, IEnumerable<object> announcementsDelivers, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("oldPassword", oldPassword);
			_parameters.Add("newPassword1", newPassword1);
			_parameters.Add("newPassword2", newPassword2);
			_parameters.Add("passwordReset", passwordReset);
			_parameters.Add("reminderQueryQuestion", reminderQueryQuestion);
			_parameters.Add("reminderQueryAnswer", reminderQueryAnswer);
			_parameters.Add("screenName", screenName);
			_parameters.Add("emailAddress", emailAddress);
			_parameters.Add("facebookId", facebookId);
			_parameters.Add("openId", openId);
			_parameters.Add("portrait", portrait);
			_parameters.Add("portraitBytes", portraitBytes);
			_parameters.Add("languageId", languageId);
			_parameters.Add("timeZoneId", timeZoneId);
			_parameters.Add("greeting", greeting);
			_parameters.Add("comments", comments);
			_parameters.Add("firstName", firstName);
			_parameters.Add("middleName", middleName);
			_parameters.Add("lastName", lastName);
			_parameters.Add("prefixId", prefixId);
			_parameters.Add("suffixId", suffixId);
			_parameters.Add("male", male);
			_parameters.Add("birthdayMonth", birthdayMonth);
			_parameters.Add("birthdayDay", birthdayDay);
			_parameters.Add("birthdayYear", birthdayYear);
			_parameters.Add("smsSn", smsSn);
			_parameters.Add("facebookSn", facebookSn);
			_parameters.Add("jabberSn", jabberSn);
			_parameters.Add("skypeSn", skypeSn);
			_parameters.Add("twitterSn", twitterSn);
			_parameters.Add("jobTitle", jobTitle);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("organizationIds", organizationIds);
			_parameters.Add("roleIds", roleIds);
			_parameters.Add("userGroupRoles", userGroupRoles);
			_parameters.Add("userGroupIds", userGroupIds);
			_parameters.Add("addresses", addresses);
			_parameters.Add("emailAddresses", emailAddresses);
			_parameters.Add("phones", phones);
			_parameters.Add("websites", websites);
			_parameters.Add("announcementsDelivers", announcementsDelivers);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/user/update-user", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateUserAsync(long userId, string oldPassword, string newPassword1, string newPassword2, bool passwordReset, string reminderQueryQuestion, string reminderQueryAnswer, string screenName, string emailAddress, long facebookId, string openId, string languageId, string timeZoneId, string greeting, string comments, string firstName, string middleName, string lastName, long prefixId, long suffixId, bool male, int birthdayMonth, int birthdayDay, int birthdayYear, string smsSn, string facebookSn, string jabberSn, string skypeSn, string twitterSn, string jobTitle, IEnumerable<long> groupIds, IEnumerable<long> organizationIds, IEnumerable<long> roleIds, IEnumerable<object> userGroupRoles, IEnumerable<long> userGroupIds, IEnumerable<object> addresses, IEnumerable<object> emailAddresses, IEnumerable<object> phones, IEnumerable<object> websites, IEnumerable<object> announcementsDelivers, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("oldPassword", oldPassword);
			_parameters.Add("newPassword1", newPassword1);
			_parameters.Add("newPassword2", newPassword2);
			_parameters.Add("passwordReset", passwordReset);
			_parameters.Add("reminderQueryQuestion", reminderQueryQuestion);
			_parameters.Add("reminderQueryAnswer", reminderQueryAnswer);
			_parameters.Add("screenName", screenName);
			_parameters.Add("emailAddress", emailAddress);
			_parameters.Add("facebookId", facebookId);
			_parameters.Add("openId", openId);
			_parameters.Add("languageId", languageId);
			_parameters.Add("timeZoneId", timeZoneId);
			_parameters.Add("greeting", greeting);
			_parameters.Add("comments", comments);
			_parameters.Add("firstName", firstName);
			_parameters.Add("middleName", middleName);
			_parameters.Add("lastName", lastName);
			_parameters.Add("prefixId", prefixId);
			_parameters.Add("suffixId", suffixId);
			_parameters.Add("male", male);
			_parameters.Add("birthdayMonth", birthdayMonth);
			_parameters.Add("birthdayDay", birthdayDay);
			_parameters.Add("birthdayYear", birthdayYear);
			_parameters.Add("smsSn", smsSn);
			_parameters.Add("facebookSn", facebookSn);
			_parameters.Add("jabberSn", jabberSn);
			_parameters.Add("skypeSn", skypeSn);
			_parameters.Add("twitterSn", twitterSn);
			_parameters.Add("jobTitle", jobTitle);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("organizationIds", organizationIds);
			_parameters.Add("roleIds", roleIds);
			_parameters.Add("userGroupRoles", userGroupRoles);
			_parameters.Add("userGroupIds", userGroupIds);
			_parameters.Add("addresses", addresses);
			_parameters.Add("emailAddresses", emailAddresses);
			_parameters.Add("phones", phones);
			_parameters.Add("websites", websites);
			_parameters.Add("announcementsDelivers", announcementsDelivers);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/user/update-user", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<bool> HasGroupUserAsync(long groupId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/user/has-group-user", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetOrganizationUsersAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/user/get-organization-users", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserGroupUsersAsync(long userGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);

			var _command = new JsonObject()
			{
				{ "/user/get-user-group-users", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetCurrentUserAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/user/get-current-user", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteUserAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/user/delete-user", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdatePasswordAsync(long userId, string password1, string password2, bool passwordReset)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("password1", password1);
			_parameters.Add("password2", password2);
			_parameters.Add("passwordReset", passwordReset);

			var _command = new JsonObject()
			{
				{ "/user/update-password", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLockoutByIdAsync(long userId, bool lockout)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("lockout", lockout);

			var _command = new JsonObject()
			{
				{ "/user/update-lockout-by-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task AddGroupUsersAsync(long groupId, IEnumerable<long> userIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userIds", userIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/user/add-group-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<bool> SendPasswordByEmailAddressAsync(long companyId, string emailAddress)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("emailAddress", emailAddress);

			var _command = new JsonObject()
			{
				{ "/user/send-password-by-email-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> SendPasswordByScreenNameAsync(long companyId, string screenName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("screenName", screenName);

			var _command = new JsonObject()
			{
				{ "/user/send-password-by-screen-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> SendPasswordByUserIdAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/user/send-password-by-user-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task SetRoleUsersAsync(long roleId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/user/set-role-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetUserGroupUsersAsync(long userGroupId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/user/set-user-group-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsetGroupTeamsUsersAsync(long groupId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/user/unset-group-teams-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsetOrganizationUsersAsync(long organizationId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/user/unset-organization-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsetPasswordPolicyUsersAsync(long passwordPolicyId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("passwordPolicyId", passwordPolicyId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/user/unset-password-policy-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsetRoleUsersAsync(long roleId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("roleId", roleId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/user/unset-role-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsetTeamUsersAsync(long teamId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("teamId", teamId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/user/unset-team-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsetUserGroupUsersAsync(long userGroupId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/user/unset-user-group-users", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateAgreedToTermsOfUseAsync(long userId, bool agreedToTermsOfUse)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("agreedToTermsOfUse", agreedToTermsOfUse);

			var _command = new JsonObject()
			{
				{ "/user/update-agreed-to-terms-of-use", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateIncompleteUserAsync(long companyId, bool autoPassword, string password1, string password2, bool autoScreenName, string screenName, string emailAddress, long facebookId, string openId, string locale, string firstName, string middleName, string lastName, long prefixId, long suffixId, bool male, int birthdayMonth, int birthdayDay, int birthdayYear, string jobTitle, bool updateUserInformation, bool sendEmail, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("autoPassword", autoPassword);
			_parameters.Add("password1", password1);
			_parameters.Add("password2", password2);
			_parameters.Add("autoScreenName", autoScreenName);
			_parameters.Add("screenName", screenName);
			_parameters.Add("emailAddress", emailAddress);
			_parameters.Add("facebookId", facebookId);
			_parameters.Add("openId", openId);
			_parameters.Add("locale", locale);
			_parameters.Add("firstName", firstName);
			_parameters.Add("middleName", middleName);
			_parameters.Add("lastName", lastName);
			_parameters.Add("prefixId", prefixId);
			_parameters.Add("suffixId", suffixId);
			_parameters.Add("male", male);
			_parameters.Add("birthdayMonth", birthdayMonth);
			_parameters.Add("birthdayDay", birthdayDay);
			_parameters.Add("birthdayYear", birthdayYear);
			_parameters.Add("jobTitle", jobTitle);
			_parameters.Add("updateUserInformation", updateUserInformation);
			_parameters.Add("sendEmail", sendEmail);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/user/update-incomplete-user", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateOpenIdAsync(long userId, string openId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("openId", openId);

			var _command = new JsonObject()
			{
				{ "/user/update-open-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateOrganizationsAsync(long userId, IEnumerable<long> organizationIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("organizationIds", organizationIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/user/update-organizations", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateReminderQueryAsync(long userId, string question, string answer)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("question", question);
			_parameters.Add("answer", answer);

			var _command = new JsonObject()
			{
				{ "/user/update-reminder-query", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateScreenNameAsync(long userId, string screenName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("screenName", screenName);

			var _command = new JsonObject()
			{
				{ "/user/update-screen-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateUserGroupAsync(long userGroupId, string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/usergroup/update-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateUserGroupAsync(long userGroupId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/usergroup/update-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchUserGroupAsync(long userGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);

			var _command = new JsonObject()
			{
				{ "/usergroup/fetch-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserUserGroupsAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-user-user-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserGroupsAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-user-groups", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task UnsetGroupUserGroupsAsync(long groupId, IEnumerable<long> userGroupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userGroupIds", userGroupIds);

			var _command = new JsonObject()
			{
				{ "/usergroup/unset-group-user-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsetTeamUserGroupsAsync(long teamId, IEnumerable<long> userGroupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("teamId", teamId);
			_parameters.Add("userGroupIds", userGroupIds);

			var _command = new JsonObject()
			{
				{ "/usergroup/unset-team-user-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddGroupUserGroupsAsync(long groupId, IEnumerable<long> userGroupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userGroupIds", userGroupIds);

			var _command = new JsonObject()
			{
				{ "/usergroup/add-group-user-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddTeamUserGroupsAsync(long teamId, IEnumerable<long> userGroupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("teamId", teamId);
			_parameters.Add("userGroupIds", userGroupIds);

			var _command = new JsonObject()
			{
				{ "/usergroup/add-team-user-groups", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddUserGroupAsync(string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/usergroup/add-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddUserGroupAsync(string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/usergroup/add-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteUserGroupAsync(long userGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);

			var _command = new JsonObject()
			{
				{ "/usergroup/delete-user-group", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetUserGroupAsync(string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetUserGroupAsync(long userGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);

			var _command = new JsonObject()
			{
				{ "/usergroup/get-user-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task AddUserGroupGroupRolesAsync(IEnumerable<long> userGroupIds, long groupId, long roleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupIds", userGroupIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("roleId", roleId);

			var _command = new JsonObject()
			{
				{ "/usergroupgrouprole/add-user-group-group-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddUserGroupGroupRolesAsync(long userGroupId, long groupId, IEnumerable<long> roleIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("roleIds", roleIds);

			var _command = new JsonObject()
			{
				{ "/usergroupgrouprole/add-user-group-group-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteUserGroupGroupRolesAsync(IEnumerable<long> userGroupIds, long groupId, long roleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupIds", userGroupIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("roleId", roleId);

			var _command = new JsonObject()
			{
				{ "/usergroupgrouprole/delete-user-group-group-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteUserGroupGroupRolesAsync(long userGroupId, long groupId, IEnumerable<long> roleIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userGroupId", userGroupId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("roleIds", roleIds);

			var _command = new JsonObject()
			{
				{ "/usergroupgrouprole/delete-user-group-group-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddUserGroupRolesAsync(IEnumerable<long> userIds, long groupId, long roleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userIds", userIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("roleId", roleId);

			var _command = new JsonObject()
			{
				{ "/usergrouprole/add-user-group-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task AddUserGroupRolesAsync(long userId, long groupId, IEnumerable<long> roleIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("roleIds", roleIds);

			var _command = new JsonObject()
			{
				{ "/usergrouprole/add-user-group-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteUserGroupRolesAsync(IEnumerable<long> userIds, long groupId, long roleId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userIds", userIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("roleId", roleId);

			var _command = new JsonObject()
			{
				{ "/usergrouprole/delete-user-group-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteUserGroupRolesAsync(long userId, long groupId, IEnumerable<long> roleIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("roleIds", roleIds);

			var _command = new JsonObject()
			{
				{ "/usergrouprole/delete-user-group-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateUserGroupRolesAsync(long userId, long groupId, IEnumerable<long> addedRoleIds, IEnumerable<long> deletedRoleIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("addedRoleIds", addedRoleIds);
			_parameters.Add("deletedRoleIds", deletedRoleIds);

			var _command = new JsonObject()
			{
				{ "/usergrouprole/update-user-group-roles", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetWebsiteAsync(long websiteId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("websiteId", websiteId);

			var _command = new JsonObject()
			{
				{ "/website/get-website", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteWebsiteAsync(long websiteId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("websiteId", websiteId);

			var _command = new JsonObject()
			{
				{ "/website/delete-website", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetWebsitesAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/website/get-websites", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateWebsiteAsync(long websiteId, string url, long typeId, bool primary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("websiteId", websiteId);
			_parameters.Add("url", url);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);

			var _command = new JsonObject()
			{
				{ "/website/update-website", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddWebsiteAsync(string className, long classPK, string url, long typeId, bool primary, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("url", url);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/website/add-website", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateEntryAsync(string className, long classPK, double score)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("score", score);

			var _command = new JsonObject()
			{
				{ "/ratingsentry/update-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteEntryAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/ratingsentry/delete-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> GetRelationActivitiesCountAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-relation-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetRelationActivitiesCountAsync(long userId, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-relation-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserActivitiesAsync(long userId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-user-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetUserActivitiesCountAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-user-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserGroupsActivitiesAsync(long userId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-user-groups-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetUserGroupsActivitiesCountAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-user-groups-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserGroupsAndOrganizationsActivitiesAsync(long userId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-user-groups-and-organizations-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetUserGroupsAndOrganizationsActivitiesCountAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-user-groups-and-organizations-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserOrganizationsActivitiesAsync(long userId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-user-organizations-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetUserOrganizationsActivitiesCountAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-user-organizations-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetActivitiesAsync(long mirrorActivityId, string className, long classPK, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("mirrorActivityId", mirrorActivityId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetActivitiesAsync(long mirrorActivityId, long classNameId, long classPK, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("mirrorActivityId", mirrorActivityId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetActivitiesAsync(string className, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetActivitiesAsync(long classNameId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetActivitiesCountAsync(long mirrorActivityId, long classNameId, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("mirrorActivityId", mirrorActivityId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetActivitiesCountAsync(string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetActivitiesCountAsync(long mirrorActivityId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("mirrorActivityId", mirrorActivityId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetActivitiesCountAsync(long classNameId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetActivityAsync(long activityId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("activityId", activityId);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-activity", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetActivitySetActivitiesAsync(long activitySetId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("activitySetId", activitySetId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-activity-set-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupActivitiesAsync(long groupId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-group-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupActivitiesCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-group-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupUsersActivitiesAsync(long groupId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-group-users-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupUsersActivitiesCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-group-users-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetMirrorActivityAsync(long mirrorActivityId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("mirrorActivityId", mirrorActivityId);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-mirror-activity", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetOrganizationActivitiesAsync(long organizationId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-organization-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetOrganizationActivitiesCountAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-organization-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetOrganizationUsersActivitiesAsync(long organizationId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-organization-users-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetOrganizationUsersActivitiesCountAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-organization-users-activities-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRelationActivitiesAsync(long userId, int type, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("type", type);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-relation-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRelationActivitiesAsync(long userId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/socialactivity/get-relation-activities", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetActivityDefinitionAsync(long groupId, string className, int activityType)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("activityType", activityType);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/get-activity-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetActivityDefinitionsAsync(long groupId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/get-activity-definitions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetActivitySettingsAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/get-activity-settings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task UpdateActivitySettingAsync(long groupId, string className, int activityType, JsonObjectWrapper activityCounterDefinition)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("activityType", activityType);
			this.MangleWrapper(_parameters, "activityCounterDefinition", "$languageUtil.getJSONWrapperClassName($parameter.type)", activityCounterDefinition);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/update-activity-setting", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateActivitySettingAsync(long groupId, string className, bool enabled)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("enabled", enabled);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/update-activity-setting", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateActivitySettingsAsync(long groupId, string className, int activityType, IEnumerable<object> activityCounterDefinitions)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("activityType", activityType);
			_parameters.Add("activityCounterDefinitions", activityCounterDefinitions);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/update-activity-settings", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetJsonActivityDefinitionsAsync(long groupId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/get-json-activity-definitions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateRequestAsync(long requestId, int status, JsonObjectWrapper themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("requestId", requestId);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "themeDisplay", "$languageUtil.getJSONWrapperClassName($parameter.type)", themeDisplay);

			var _command = new JsonObject()
			{
				{ "/socialrequest/update-request", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RestoreEntryAsync(long entryId, long overrideClassPK, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("overrideClassPK", overrideClassPK);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/trashentry/restore-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RestoreEntryAsync(string className, long classPK, long overrideClassPK, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("overrideClassPK", overrideClassPK);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/trashentry/restore-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RestoreEntryAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/trashentry/restore-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RestoreEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/trashentry/restore-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteEntriesAsync(IEnumerable<long> entryIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryIds", entryIds);

			var _command = new JsonObject()
			{
				{ "/trashentry/delete-entries", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteEntriesAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/trashentry/delete-entries", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task MoveEntryAsync(string className, long classPK, long destinationContainerModelId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("destinationContainerModelId", destinationContainerModelId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/trashentry/move-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/trashentry/delete-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteEntryAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/trashentry/delete-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetEntriesAsync(long groupId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/trashentry/get-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetEntriesAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/trashentry/get-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetEntriesAsync(long groupId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/trashentry/get-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}