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

namespace Liferay.SDK.Service.V73.Commercenotificationtemplatecommerceaccountgrouprel
{
	public class CommercenotificationtemplatecommerceaccountgrouprelService : ServiceBase
	{
		public CommercenotificationtemplatecommerceaccountgrouprelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommerceNotificationTemplateCommerceAccountGroupRelAsync(long commerceNotificationTemplateId, long commerceAccountGroupId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceNotificationTemplateId", commerceNotificationTemplateId);
			_parameters.Add("commerceAccountGroupId", commerceAccountGroupId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationtemplatecommerceaccountgrouprel/add-commerce-notification-template-commerce-account-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceNotificationTemplateCommerceAccountGroupRelAsync(long commerceNotificationTemplateId, long commerceAccountGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceNotificationTemplateId", commerceNotificationTemplateId);
			_parameters.Add("commerceAccountGroupId", commerceAccountGroupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationtemplatecommerceaccountgrouprel/fetch-commerce-notification-template-commerce-account-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceNotificationTemplateCommerceAccountGroupRelsAsync(long commerceNotificationTemplateId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceNotificationTemplateId", commerceNotificationTemplateId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationtemplatecommerceaccountgrouprel/get-commerce-notification-template-commerce-account-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task DeleteCommerceNotificationTemplateCommerceAccountGroupRelAsync(long commerceNotificationTemplateCommerceAccountGroupRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceNotificationTemplateCommerceAccountGroupRelId", commerceNotificationTemplateCommerceAccountGroupRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationtemplatecommerceaccountgrouprel/delete-commerce-notification-template-commerce-account-group-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}