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

namespace Liferay.SDK.Service.V73.MBCategory
{
	public class MBCategoryService : ServiceBase
	{
		public MBCategoryService(ISession session)
			: base(session)
		{
		}

		public async Task<long> GetCategoriesCountAsync(long groupId, long parentCategoryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mb.mbcategory/get-categories-count", _parameters }
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
				{ "/mb.mbcategory/get-categories-count", _parameters }
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
				{ "/mb.mbcategory/get-categories-count", _parameters }
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
				{ "/mb.mbcategory/get-categories-count", _parameters }
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
				{ "/mb.mbcategory/get-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCategoriesCountAsync(long groupId, long parentCategoryId, JsonObjectWrapper queryDefinition)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			this.MangleWrapper(_parameters, "queryDefinition", "$languageUtil.getJSONWrapperClassName($parameter.type)", queryDefinition);

			var _command = new JsonObject()
			{
				{ "/mb.mbcategory/get-categories-count", _parameters }
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
				{ "/mb.mbcategory/get-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAsync(long groupId, long parentCategoryId, JsonObjectWrapper queryDefinition)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			this.MangleWrapper(_parameters, "queryDefinition", "$languageUtil.getJSONWrapperClassName($parameter.type)", queryDefinition);

			var _command = new JsonObject()
			{
				{ "/mb.mbcategory/get-categories", _parameters }
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
				{ "/mb.mbcategory/get-categories", _parameters }
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
				{ "/mb.mbcategory/get-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
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
				{ "/mb.mbcategory/get-categories", _parameters }
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
				{ "/mb.mbcategory/get-categories", _parameters }
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
				{ "/mb.mbcategory/get-categories", _parameters }
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
				{ "/mb.mbcategory/get-categories", _parameters }
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
				{ "/mb.mbcategory/get-categories", _parameters }
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
				{ "/mb.mbcategory/get-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<long>> GetCategoryIdsAsync(long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mb.mbcategory/get-category-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task DeleteCategoryAsync(long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mb.mbcategory/delete-category", _parameters }
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
				{ "/mb.mbcategory/delete-category", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<long>> GetSubcategoryIdsAsync(IEnumerable<long> categoryIds, long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryIds", categoryIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mb.mbcategory/get-subcategory-ids", _parameters }
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
				{ "/mb.mbcategory/move-category", _parameters }
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
				{ "/mb.mbcategory/update-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAndThreadsAsync(long groupId, long categoryId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/mb.mbcategory/get-categories-and-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesAndThreadsAsync(long groupId, long categoryId, JsonObjectWrapper queryDefinition)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			this.MangleWrapper(_parameters, "queryDefinition", "$languageUtil.getJSONWrapperClassName($parameter.type)", queryDefinition);

			var _command = new JsonObject()
			{
				{ "/mb.mbcategory/get-categories-and-threads", _parameters }
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
				{ "/mb.mbcategory/get-categories-and-threads", _parameters }
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
				{ "/mb.mbcategory/get-categories-and-threads", _parameters }
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
				{ "/mb.mbcategory/get-categories-and-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCategoriesAndThreadsCountAsync(long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mb.mbcategory/get-categories-and-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCategoriesAndThreadsCountAsync(long groupId, long categoryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mb.mbcategory/get-categories-and-threads-count", _parameters }
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
				{ "/mb.mbcategory/get-categories-and-threads-count", _parameters }
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
				{ "/mb.mbcategory/get-subscribed-categories", _parameters }
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
				{ "/mb.mbcategory/get-subscribed-categories-count", _parameters }
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
				{ "/mb.mbcategory/move-category-from-trash", _parameters }
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
				{ "/mb.mbcategory/move-category-to-trash", _parameters }
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
				{ "/mb.mbcategory/restore-category-from-trash", _parameters }
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
				{ "/mb.mbcategory/subscribe-category", _parameters }
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
				{ "/mb.mbcategory/unsubscribe-category", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetCategoryAsync(long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/mb.mbcategory/get-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
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
				{ "/mb.mbcategory/add-category", _parameters }
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
				{ "/mb.mbcategory/add-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}