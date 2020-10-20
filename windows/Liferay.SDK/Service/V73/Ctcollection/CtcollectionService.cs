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

namespace Liferay.SDK.Service.V73.Ctcollection
{
	public class CtcollectionService : ServiceBase
	{
		public CtcollectionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCtCollectionAsync(long companyId, long userId, string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/ct.ctcollection/add-ct-collection", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCtCollectionAsync(long userId, long ctCollectionId, string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("ctCollectionId", ctCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/ct.ctcollection/update-ct-collection", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCtAutoResolutionInfoAsync(long ctAutoResolutionInfoId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ctAutoResolutionInfoId", ctAutoResolutionInfoId);

			var _command = new JsonObject()
			{
				{ "/ct.ctcollection/delete-ct-auto-resolution-info", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> DeleteCtCollectionAsync(JsonObjectWrapper ctCollection)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "ctCollection", "$languageUtil.getJSONWrapperClassName($parameter.type)", ctCollection);

			var _command = new JsonObject()
			{
				{ "/ct.ctcollection/delete-ct-collection", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCtCollectionsAsync(long companyId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ct.ctcollection/get-ct-collections", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCtCollectionsAsync(long companyId, int status, string keywords, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("status", status);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ct.ctcollection/get-ct-collections", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UndoCtCollectionAsync(long ctCollectionId, long userId, string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ctCollectionId", ctCollectionId);
			_parameters.Add("userId", userId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/ct.ctcollection/undo-ct-collection", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetCtCollectionsCountAsync(long companyId, int status, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("status", status);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/ct.ctcollection/get-ct-collections-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DiscardCtEntryAsync(long ctCollectionId, long modelClassNameId, long modelClassPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ctCollectionId", ctCollectionId);
			_parameters.Add("modelClassNameId", modelClassNameId);
			_parameters.Add("modelClassPK", modelClassPK);

			var _command = new JsonObject()
			{
				{ "/ct.ctcollection/discard-ct-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task PublishCtCollectionAsync(long userId, long ctCollectionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("ctCollectionId", ctCollectionId);

			var _command = new JsonObject()
			{
				{ "/ct.ctcollection/publish-ct-collection", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DiscardCtEntriesAsync(long ctCollectionId, long modelClassNameId, long modelClassPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ctCollectionId", ctCollectionId);
			_parameters.Add("modelClassNameId", modelClassNameId);
			_parameters.Add("modelClassPK", modelClassPK);

			var _command = new JsonObject()
			{
				{ "/ct.ctcollection/discard-ct-entries", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}