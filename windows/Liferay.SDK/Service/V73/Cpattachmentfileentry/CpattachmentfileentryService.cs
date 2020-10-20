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

namespace Liferay.SDK.Service.V73.Cpattachmentfileentry
{
	public class CpattachmentfileentryService : ServiceBase
	{
		public CpattachmentfileentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> FetchCpAttachmentFileEntryAsync(long cpAttachmentFileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpAttachmentFileEntryId", cpAttachmentFileEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpattachmentfileentry/fetch-cp-attachment-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchByExternalReferenceCodeAsync(long companyId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.cpattachmentfileentry/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpAttachmentFileEntryAsync(long userId, long groupId, long classNameId, long classPK, long fileEntryId, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, IDictionary<string, string> titleMap, string json, double priority, int type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("json", json);
			_parameters.Add("priority", priority);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpattachmentfileentry/add-cp-attachment-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCpAttachmentFileEntryAsync(long cpAttachmentFileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpAttachmentFileEntryId", cpAttachmentFileEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpattachmentfileentry/delete-cp-attachment-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCpAttachmentFileEntriesAsync(long classNameId, long classPK, int type, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.cpattachmentfileentry/get-cp-attachment-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpAttachmentFileEntriesAsync(long classNameId, long classPK, int type, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.cpattachmentfileentry/get-cp-attachment-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCpAttachmentFileEntriesCountAsync(long classNameId, long classPK, int type, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("type", type);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/commerce.cpattachmentfileentry/get-cp-attachment-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCpAttachmentFileEntryAsync(long cpAttachmentFileEntryId, long fileEntryId, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, IDictionary<string, string> titleMap, string json, double priority, int type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpAttachmentFileEntryId", cpAttachmentFileEntryId);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("json", json);
			_parameters.Add("priority", priority);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpattachmentfileentry/update-cp-attachment-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCpAttachmentFileEntryAsync(long groupId, long classNameId, long classPK, long cpAttachmentFileEntryId, long fileEntryId, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, IDictionary<string, string> titleMap, string json, double priority, int type, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("cpAttachmentFileEntryId", cpAttachmentFileEntryId);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("json", json);
			_parameters.Add("priority", priority);
			_parameters.Add("type", type);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpattachmentfileentry/upsert-cp-attachment-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCpAttachmentFileEntryAsync(long groupId, long classNameId, long classPK, long fileEntryId, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, IDictionary<string, string> titleMap, string json, double priority, int type, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("json", json);
			_parameters.Add("priority", priority);
			_parameters.Add("type", type);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpattachmentfileentry/upsert-cp-attachment-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCpAttachmentFileEntryAsync(long cpAttachmentFileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpAttachmentFileEntryId", cpAttachmentFileEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpattachmentfileentry/get-cp-attachment-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}