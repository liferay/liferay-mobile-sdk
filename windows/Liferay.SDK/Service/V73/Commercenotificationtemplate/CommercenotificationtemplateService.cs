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

namespace Liferay.SDK.Service.V73.Commercenotificationtemplate
{
	public class CommercenotificationtemplateService : ServiceBase
	{
		public CommercenotificationtemplateService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetCommerceNotificationTemplateAsync(long commerceNotificationTemplateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceNotificationTemplateId", commerceNotificationTemplateId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationtemplate/get-commerce-notification-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceNotificationTemplateAsync(string name, string description, string from, IDictionary<string, string> fromNameMap, string to, string cc, string bcc, string type, bool enabled, IDictionary<string, string> subjectMap, IDictionary<string, string> bodyMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("from", from);
			_parameters.Add("fromNameMap", fromNameMap);
			_parameters.Add("to", to);
			_parameters.Add("cc", cc);
			_parameters.Add("bcc", bcc);
			_parameters.Add("type", type);
			_parameters.Add("enabled", enabled);
			_parameters.Add("subjectMap", subjectMap);
			_parameters.Add("bodyMap", bodyMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationtemplate/add-commerce-notification-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceNotificationTemplateAsync(long userId, long groupId, string name, string description, string from, IDictionary<string, string> fromNameMap, string to, string cc, string bcc, string type, bool enabled, IDictionary<string, string> subjectMap, IDictionary<string, string> bodyMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("from", from);
			_parameters.Add("fromNameMap", fromNameMap);
			_parameters.Add("to", to);
			_parameters.Add("cc", cc);
			_parameters.Add("bcc", bcc);
			_parameters.Add("type", type);
			_parameters.Add("enabled", enabled);
			_parameters.Add("subjectMap", subjectMap);
			_parameters.Add("bodyMap", bodyMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationtemplate/add-commerce-notification-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceNotificationTemplateAsync(long commerceNotificationTemplateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceNotificationTemplateId", commerceNotificationTemplateId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationtemplate/delete-commerce-notification-template", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCommerceNotificationTemplatesAsync(long groupId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationtemplate/get-commerce-notification-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceNotificationTemplatesAsync(long groupId, bool enabled, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("enabled", enabled);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationtemplate/get-commerce-notification-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceNotificationTemplatesCountAsync(long groupId, bool enabled)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("enabled", enabled);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationtemplate/get-commerce-notification-templates-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceNotificationTemplatesCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationtemplate/get-commerce-notification-templates-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceNotificationTemplateAsync(long commerceNotificationTemplateId, string name, string description, string from, IDictionary<string, string> fromNameMap, string to, string cc, string bcc, string type, bool enabled, IDictionary<string, string> subjectMap, IDictionary<string, string> bodyMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceNotificationTemplateId", commerceNotificationTemplateId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("from", from);
			_parameters.Add("fromNameMap", fromNameMap);
			_parameters.Add("to", to);
			_parameters.Add("cc", cc);
			_parameters.Add("bcc", bcc);
			_parameters.Add("type", type);
			_parameters.Add("enabled", enabled);
			_parameters.Add("subjectMap", subjectMap);
			_parameters.Add("bodyMap", bodyMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationtemplate/update-commerce-notification-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}