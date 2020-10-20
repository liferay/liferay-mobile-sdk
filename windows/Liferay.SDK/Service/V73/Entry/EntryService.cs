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

namespace Liferay.SDK.Service.V73.Entry
{
	public class EntryService : ServiceBase
	{
		public EntryService(ISession session)
			: base(session)
		{
		}

		public async Task<long> GetEntriesCountAsync(long groupId, string definitionName, string userName, long createDateGT, long createDateLT, bool andSearch)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("definitionName", definitionName);
			_parameters.Add("userName", userName);
			_parameters.Add("createDateGT", createDateGT);
			_parameters.Add("createDateLT", createDateLT);
			_parameters.Add("andSearch", andSearch);

			var _command = new JsonObject()
			{
				{ "/reports.entry/get-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteAttachmentAsync(long companyId, long entryId, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("entryId", entryId);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/reports.entry/delete-attachment", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SendEmailsAsync(long entryId, string fileName, IEnumerable<string> emailAddresses, bool notification)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("fileName", fileName);
			_parameters.Add("emailAddresses", emailAddresses);
			_parameters.Add("notification", notification);

			var _command = new JsonObject()
			{
				{ "/reports.entry/send-emails", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnscheduleEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/reports.entry/unschedule-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddEntryAsync(long groupId, long definitionId, string format, bool schedulerRequest, long startDate, long endDate, bool repeating, string recurrence, string emailNotifications, string emailDelivery, string portletId, string pageURL, string reportName, string reportParameters, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("definitionId", definitionId);
			_parameters.Add("format", format);
			_parameters.Add("schedulerRequest", schedulerRequest);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("repeating", repeating);
			_parameters.Add("recurrence", recurrence);
			_parameters.Add("emailNotifications", emailNotifications);
			_parameters.Add("emailDelivery", emailDelivery);
			_parameters.Add("portletId", portletId);
			_parameters.Add("pageURL", pageURL);
			_parameters.Add("reportName", reportName);
			_parameters.Add("reportParameters", reportParameters);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/reports.entry/add-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetEntriesAsync(long groupId, string definitionName, string userName, long createDateGT, long createDateLT, bool andSearch, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("definitionName", definitionName);
			_parameters.Add("userName", userName);
			_parameters.Add("createDateGT", createDateGT);
			_parameters.Add("createDateLT", createDateLT);
			_parameters.Add("andSearch", andSearch);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/reports.entry/get-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> DeleteEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/reports.entry/delete-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}