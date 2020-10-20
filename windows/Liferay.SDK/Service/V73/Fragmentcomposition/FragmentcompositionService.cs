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

namespace Liferay.SDK.Service.V73.Fragmentcomposition
{
	public class FragmentcompositionService : ServiceBase
	{
		public FragmentcompositionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddFragmentCompositionAsync(long groupId, long fragmentCollectionId, string fragmentCompositionKey, string name, string description, string data, long previewFileEntryId, int status, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("fragmentCompositionKey", fragmentCompositionKey);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("data", data);
			_parameters.Add("previewFileEntryId", previewFileEntryId);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/add-fragment-composition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentCompositionAsync(long fragmentCompositionId, long previewFileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentCompositionId", fragmentCompositionId);
			_parameters.Add("previewFileEntryId", previewFileEntryId);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/update-fragment-composition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentCompositionAsync(long fragmentCompositionId, long fragmentCollectionId, string name, string description, string data, long previewFileEntryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentCompositionId", fragmentCompositionId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("data", data);
			_parameters.Add("previewFileEntryId", previewFileEntryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/update-fragment-composition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentCompositionAsync(long fragmentCompositionId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentCompositionId", fragmentCompositionId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/update-fragment-composition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentCompositionAsync(long fragmentCompositionId, string name, string description, string data, long previewFileEntryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentCompositionId", fragmentCompositionId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("data", data);
			_parameters.Add("previewFileEntryId", previewFileEntryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/update-fragment-composition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentCompositionsAsync(long groupId, long fragmentCollectionId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/get-fragment-compositions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentCompositionsAsync(long groupId, long fragmentCollectionId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/get-fragment-compositions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentCompositionsAsync(long groupId, long fragmentCollectionId, string name, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/get-fragment-compositions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentCompositionsAsync(long fragmentCollectionId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentCollectionId", fragmentCollectionId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/get-fragment-compositions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFragmentCompositionsAsync(long fragmentCollectionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentCollectionId", fragmentCollectionId);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/get-fragment-compositions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFragmentCompositionsCountAsync(long fragmentCollectionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentCollectionId", fragmentCollectionId);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/get-fragment-compositions-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> MoveFragmentCompositionAsync(long fragmentCompositionId, long fragmentCollectionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentCompositionId", fragmentCompositionId);
			_parameters.Add("fragmentCollectionId", fragmentCollectionId);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/move-fragment-composition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteFragmentCompositionAsync(long fragmentCompositionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentCompositionId", fragmentCompositionId);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/delete-fragment-composition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchFragmentCompositionAsync(long fragmentCompositionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentCompositionId", fragmentCompositionId);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/fetch-fragment-composition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchFragmentCompositionAsync(long groupId, string fragmentCompositionKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fragmentCompositionKey", fragmentCompositionKey);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmentcomposition/fetch-fragment-composition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}