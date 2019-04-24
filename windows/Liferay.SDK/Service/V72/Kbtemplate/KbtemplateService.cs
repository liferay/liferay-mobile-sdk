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

namespace Liferay.SDK.Service.V72.Kbtemplate
{
	public class KbtemplateService : ServiceBase
	{
		public KbtemplateService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetKbTemplateSearchDisplayAsync(long groupId, string title, string content, long startDate, long endDate, bool andOperator, IEnumerable<int> curStartValues, int cur, int delta, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("content", content);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("curStartValues", curStartValues);
			_parameters.Add("cur", cur);
			_parameters.Add("delta", delta);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/kb.kbtemplate/get-kb-template-search-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetKbTemplateAsync(long kbTemplateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("kbTemplateId", kbTemplateId);

			var _command = new JsonObject()
			{
				{ "/kb.kbtemplate/get-kb-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteKbTemplateAsync(long kbTemplateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("kbTemplateId", kbTemplateId);

			var _command = new JsonObject()
			{
				{ "/kb.kbtemplate/delete-kb-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteKbTemplatesAsync(long groupId, IEnumerable<long> kbTemplateIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("kbTemplateIds", kbTemplateIds);

			var _command = new JsonObject()
			{
				{ "/kb.kbtemplate/delete-kb-templates", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetGroupKbTemplatesAsync(long groupId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/kb.kbtemplate/get-group-kb-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupKbTemplatesCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/kb.kbtemplate/get-group-kb-templates-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> AddKbTemplateAsync(string portletId, string title, string content, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("portletId", portletId);
			_parameters.Add("title", title);
			_parameters.Add("content", content);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/kb.kbtemplate/add-kb-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateKbTemplateAsync(long kbTemplateId, string title, string content, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("kbTemplateId", kbTemplateId);
			_parameters.Add("title", title);
			_parameters.Add("content", content);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/kb.kbtemplate/update-kb-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}