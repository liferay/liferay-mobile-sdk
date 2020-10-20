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

namespace Liferay.SDK.Service.V73.Cpdisplaylayout
{
	public class CpdisplaylayoutService : ServiceBase
	{
		public CpdisplaylayoutService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCpDisplayLayoutAsync(long userId, long groupId, string clazz, long classPK, string layoutUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("clazz", clazz);
			_parameters.Add("classPK", classPK);
			_parameters.Add("layoutUuid", layoutUuid);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdisplaylayout/add-cp-display-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpDisplayLayoutAsync(string clazz, long classPK, string layoutUuid, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("clazz", clazz);
			_parameters.Add("classPK", classPK);
			_parameters.Add("layoutUuid", layoutUuid);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdisplaylayout/add-cp-display-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCpDisplayLayoutAsync(string clazz, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("clazz", clazz);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdisplaylayout/delete-cp-display-layout", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCpDisplayLayoutAsync(long cpDisplayLayoutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDisplayLayoutId", cpDisplayLayoutId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdisplaylayout/delete-cp-display-layout", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCpDisplayLayoutAsync(long cpDisplayLayoutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDisplayLayoutId", cpDisplayLayoutId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdisplaylayout/fetch-cp-display-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDisplayLayoutAsync(long cpDisplayLayoutId, string layoutUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDisplayLayoutId", cpDisplayLayoutId);
			_parameters.Add("layoutUuid", layoutUuid);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdisplaylayout/update-cp-display-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCpDisplayLayoutAsync(long companyId, long groupId, string className, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdisplaylayout/search-cp-display-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}