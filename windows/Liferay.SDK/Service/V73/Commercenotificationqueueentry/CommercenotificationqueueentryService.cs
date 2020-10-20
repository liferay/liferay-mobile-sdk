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

namespace Liferay.SDK.Service.V73.Commercenotificationqueueentry
{
	public class CommercenotificationqueueentryService : ServiceBase
	{
		public CommercenotificationqueueentryService(ISession session)
			: base(session)
		{
		}

		public async Task DeleteCommerceNotificationQueueEntryAsync(long commerceNotificationQueueEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceNotificationQueueEntryId", commerceNotificationQueueEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationqueueentry/delete-commerce-notification-queue-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCommerceNotificationQueueEntriesAsync(long groupId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationqueueentry/get-commerce-notification-queue-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceNotificationQueueEntriesCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationqueueentry/get-commerce-notification-queue-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> ResendCommerceNotificationQueueEntryAsync(long commerceNotificationQueueEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceNotificationQueueEntryId", commerceNotificationQueueEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercenotificationqueueentry/resend-commerce-notification-queue-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}