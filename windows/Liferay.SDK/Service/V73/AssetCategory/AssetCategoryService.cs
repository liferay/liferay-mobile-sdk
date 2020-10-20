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

namespace Liferay.SDK.Service.V73.AssetCategory
{
	public class AssetCategoryService : ServiceBase
	{
		public AssetCategoryService(ISession session)
			: base(session)
		{
		}

		public async Task<long> GetCategoriesCountAsync(long classNameId, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
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

		public async Task<IEnumerable<dynamic>> GetCategoriesAsync(long classNameId, long classPK, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
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

		public async Task<IEnumerable<dynamic>> GetVocabularyCategoriesAsync(long groupId, long parentCategoryId, long vocabularyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetVocabularyCategoriesAsync(long parentCategoryId, long vocabularyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetVocabularyCategoriesAsync(long vocabularyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetVocabularyCategoriesAsync(long groupId, string name, long vocabularyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
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

		public async Task<dynamic> GetVocabularyCategoriesDisplayAsync(long groupId, string name, long vocabularyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetVocabularyCategoriesDisplayAsync(long vocabularyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-vocabulary-categories-display", _parameters }
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

		public async Task<IEnumerable<dynamic>> GetChildCategoriesAsync(long parentCategoryId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentCategoryId", parentCategoryId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-child-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetChildCategoriesCountAsync(long parentCategoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentCategoryId", parentCategoryId);

			var _command = new JsonObject()
			{
				{ "/assetcategory/get-child-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetVocabularyRootCategoriesAsync(long groupId, long vocabularyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

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

		public async Task<IEnumerable<dynamic>> SearchAsync(long groupId, string keywords, long vocabularyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("vocabularyId", vocabularyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/assetcategory/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
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
	}
}