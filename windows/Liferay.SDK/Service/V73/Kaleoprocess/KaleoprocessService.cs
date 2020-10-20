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

namespace Liferay.SDK.Service.V73.Kaleoprocess
{
	public class KaleoprocessService : ServiceBase
	{
		public KaleoprocessService(ISession session)
			: base(session)
		{
		}

		public async Task<long> SearchCountAsync(long groupId, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/kaleoforms.kaleoprocess/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetKaleoProcessAsync(long kaleoProcessId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("kaleoProcessId", kaleoProcessId);

			var _command = new JsonObject()
			{
				{ "/kaleoforms.kaleoprocess/get-kaleo-process", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddKaleoProcessAsync(long groupId, long ddmStructureId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, long ddmTemplateId, string workflowDefinitionName, int workflowDefinitionVersion, JsonObjectWrapper kaleoTaskFormPairs, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("ddmStructureId", ddmStructureId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("ddmTemplateId", ddmTemplateId);
			_parameters.Add("workflowDefinitionName", workflowDefinitionName);
			_parameters.Add("workflowDefinitionVersion", workflowDefinitionVersion);
			this.MangleWrapper(_parameters, "kaleoTaskFormPairs", "$languageUtil.getJSONWrapperClassName($parameter.type)", kaleoTaskFormPairs);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/kaleoforms.kaleoprocess/add-kaleo-process", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateKaleoProcessAsync(long kaleoProcessId, long ddmStructureId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, long ddmTemplateId, string workflowDefinitionName, int workflowDefinitionVersion, JsonObjectWrapper kaleoTaskFormPairs, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("kaleoProcessId", kaleoProcessId);
			_parameters.Add("ddmStructureId", ddmStructureId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("ddmTemplateId", ddmTemplateId);
			_parameters.Add("workflowDefinitionName", workflowDefinitionName);
			_parameters.Add("workflowDefinitionVersion", workflowDefinitionVersion);
			this.MangleWrapper(_parameters, "kaleoTaskFormPairs", "$languageUtil.getJSONWrapperClassName($parameter.type)", kaleoTaskFormPairs);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/kaleoforms.kaleoprocess/update-kaleo-process", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteKaleoProcessAsync(long kaleoProcessId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("kaleoProcessId", kaleoProcessId);

			var _command = new JsonObject()
			{
				{ "/kaleoforms.kaleoprocess/delete-kaleo-process", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long groupId, string keywords, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/kaleoforms.kaleoprocess/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}