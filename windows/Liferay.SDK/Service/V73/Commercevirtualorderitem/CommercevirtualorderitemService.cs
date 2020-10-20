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

namespace Liferay.SDK.Service.V73.Commercevirtualorderitem
{
	public class CommercevirtualorderitemService : ServiceBase
	{
		public CommercevirtualorderitemService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateCommerceVirtualOrderItemAsync(long commerceVirtualOrderItemId, long fileEntryId, string url, int activationStatus, long duration, int usages, int maxUsages, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceVirtualOrderItemId", commerceVirtualOrderItemId);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("url", url);
			_parameters.Add("activationStatus", activationStatus);
			_parameters.Add("duration", duration);
			_parameters.Add("usages", usages);
			_parameters.Add("maxUsages", maxUsages);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercevirtualorderitem/update-commerce-virtual-order-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileAsync(long commerceVirtualOrderItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceVirtualOrderItemId", commerceVirtualOrderItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercevirtualorderitem/get-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}