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

namespace Liferay.SDK.Service.V73.Ddmforminstance
{
	public class DdmforminstanceService : ServiceBase
	{
		public DdmforminstanceService(ISession session)
			: base(session)
		{
		}

		public async Task SendEmailAsync(long formInstanceId, string message, string subject, IEnumerable<string> toEmailAddresses)
		{
			var _parameters = new JsonObject();

			_parameters.Add("formInstanceId", formInstanceId);
			_parameters.Add("message", message);
			_parameters.Add("subject", subject);
			_parameters.Add("toEmailAddresses", toEmailAddresses);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/send-email", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> SearchCountAsync(long companyId, long groupId, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, long groupId, string keywords, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, long groupId, IEnumerable<string> names, IEnumerable<string> descriptions, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("names", names);
			_parameters.Add("descriptions", descriptions);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetFormInstanceAsync(long ddmFormInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceId", ddmFormInstanceId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/get-form-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFormInstanceAsync(long groupId, long ddmStructureId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper settingsDDMFormValues, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("ddmStructureId", ddmStructureId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "settingsDDMFormValues", "$languageUtil.getJSONWrapperClassName($parameter.type)", settingsDDMFormValues);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/add-form-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFormInstanceAsync(long groupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper ddmForm, JsonObjectWrapper ddmFormLayout, JsonObjectWrapper settingsDDMFormValues, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "ddmForm", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmForm);
			this.MangleWrapper(_parameters, "ddmFormLayout", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormLayout);
			this.MangleWrapper(_parameters, "settingsDDMFormValues", "$languageUtil.getJSONWrapperClassName($parameter.type)", settingsDDMFormValues);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/add-form-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> CopyFormInstanceAsync(long groupId, IDictionary<string, string> nameMap, JsonObjectWrapper ddmFormInstance, JsonObjectWrapper settingsDDMFormValues, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nameMap", nameMap);
			this.MangleWrapper(_parameters, "ddmFormInstance", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormInstance);
			this.MangleWrapper(_parameters, "settingsDDMFormValues", "$languageUtil.getJSONWrapperClassName($parameter.type)", settingsDDMFormValues);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/copy-form-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFormInstanceAsync(long ddmFormInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceId", ddmFormInstanceId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/delete-form-instance", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchFormInstanceAsync(long ddmFormInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceId", ddmFormInstanceId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/fetch-form-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFormInstancesAsync(long companyId, long groupId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/get-form-instances", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFormInstancesCountAsync(string uuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("uuid", uuid);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/get-form-instances-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFormInstancesCountAsync(long companyId, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/get-form-instances-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateFormInstanceAsync(long formInstanceId, JsonObjectWrapper settingsDDMFormValues)
		{
			var _parameters = new JsonObject();

			_parameters.Add("formInstanceId", formInstanceId);
			this.MangleWrapper(_parameters, "settingsDDMFormValues", "$languageUtil.getJSONWrapperClassName($parameter.type)", settingsDDMFormValues);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/update-form-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFormInstanceAsync(long ddmFormInstanceId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper ddmForm, JsonObjectWrapper ddmFormLayout, JsonObjectWrapper settingsDDMFormValues, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceId", ddmFormInstanceId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "ddmForm", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmForm);
			this.MangleWrapper(_parameters, "ddmFormLayout", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormLayout);
			this.MangleWrapper(_parameters, "settingsDDMFormValues", "$languageUtil.getJSONWrapperClassName($parameter.type)", settingsDDMFormValues);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/update-form-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, long groupId, IEnumerable<string> names, IEnumerable<string> descriptions, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("names", names);
			_parameters.Add("descriptions", descriptions);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, long groupId, string keywords, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, long groupId, string keywords, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstance/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}