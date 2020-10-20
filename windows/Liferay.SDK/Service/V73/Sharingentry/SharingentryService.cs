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

namespace Liferay.SDK.Service.V73.Sharingentry
{
	public class SharingentryService : ServiceBase
	{
		public SharingentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddOrUpdateSharingEntryAsync(long toUserId, long classNameId, long classPK, long groupId, bool shareable, IEnumerable<object> sharingEntryActions, long expirationDate, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("toUserId", toUserId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("groupId", groupId);
			_parameters.Add("shareable", shareable);
			_parameters.Add("sharingEntryActions", sharingEntryActions);
			_parameters.Add("expirationDate", expirationDate);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/sharing.sharingentry/add-or-update-sharing-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteSharingEntryAsync(long sharingEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sharingEntryId", sharingEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/sharing.sharingentry/delete-sharing-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSharingEntryAsync(long sharingEntryId, IEnumerable<object> sharingEntryActions, bool shareable, long expirationDate, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sharingEntryId", sharingEntryId);
			_parameters.Add("sharingEntryActions", sharingEntryActions);
			_parameters.Add("shareable", shareable);
			_parameters.Add("expirationDate", expirationDate);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/sharing.sharingentry/update-sharing-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddSharingEntryAsync(long toUserId, long classNameId, long classPK, long groupId, bool shareable, IEnumerable<object> sharingEntryActions, long expirationDate, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("toUserId", toUserId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("groupId", groupId);
			_parameters.Add("shareable", shareable);
			_parameters.Add("sharingEntryActions", sharingEntryActions);
			_parameters.Add("expirationDate", expirationDate);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/sharing.sharingentry/add-sharing-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}