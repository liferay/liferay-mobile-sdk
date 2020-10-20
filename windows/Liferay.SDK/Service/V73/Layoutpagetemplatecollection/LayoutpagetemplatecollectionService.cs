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

namespace Liferay.SDK.Service.V73.Layoutpagetemplatecollection
{
	public class LayoutpagetemplatecollectionService : ServiceBase
	{
		public LayoutpagetemplatecollectionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddLayoutPageTemplateCollectionAsync(long groupId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplatecollection/add-layout-page-template-collection", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutPageTemplateCollectionAsync(long layoutPageTemplateCollectionId, string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplatecollection/update-layout-page-template-collection", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteLayoutPageTemplateCollectionsAsync(IEnumerable<long> layoutPageTemplateCollectionIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateCollectionIds", layoutPageTemplateCollectionIds);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplatecollection/delete-layout-page-template-collections", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> DeleteLayoutPageTemplateCollectionAsync(long layoutPageTemplateCollectionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplatecollection/delete-layout-page-template-collection", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchLayoutPageTemplateCollectionAsync(long layoutPageTemplateCollectionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplatecollection/fetch-layout-page-template-collection", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateCollectionsAsync(long groupId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplatecollection/get-layout-page-template-collections", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateCollectionsAsync(long groupId, string name, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplatecollection/get-layout-page-template-collections", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateCollectionsAsync(long groupId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplatecollection/get-layout-page-template-collections", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutPageTemplateCollectionsAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplatecollection/get-layout-page-template-collections", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetLayoutPageTemplateCollectionsCountAsync(long groupId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplatecollection/get-layout-page-template-collections-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetLayoutPageTemplateCollectionsCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplatecollection/get-layout-page-template-collections-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}