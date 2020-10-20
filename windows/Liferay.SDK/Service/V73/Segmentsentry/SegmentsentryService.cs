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

namespace Liferay.SDK.Service.V73.Segmentsentry
{
	public class SegmentsentryService : ServiceBase
	{
		public SegmentsentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetSegmentsEntryAsync(long segmentsEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryId", segmentsEntryId);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentry/get-segments-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddSegmentsEntryAsync(string segmentsEntryKey, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, string criteria, string type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryKey", segmentsEntryKey);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			_parameters.Add("criteria", criteria);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentry/add-segments-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddSegmentsEntryAsync(string segmentsEntryKey, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, string criteria, string source, string type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryKey", segmentsEntryKey);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			_parameters.Add("criteria", criteria);
			_parameters.Add("source", source);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentry/add-segments-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSegmentsEntryAsync(long segmentsEntryId, string segmentsEntryKey, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, string criteria, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryId", segmentsEntryId);
			_parameters.Add("segmentsEntryKey", segmentsEntryKey);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			_parameters.Add("criteria", criteria);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentry/update-segments-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteSegmentsEntryAsync(long segmentsEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryId", segmentsEntryId);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentry/delete-segments-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task AddSegmentsEntryClassPKsAsync(long segmentsEntryId, IEnumerable<long> classPKs, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryId", segmentsEntryId);
			_parameters.Add("classPKs", classPKs);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentry/add-segments-entry-class-p-ks", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteSegmentsEntryClassPKsAsync(long segmentsEntryId, IEnumerable<long> classPKs)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryId", segmentsEntryId);
			_parameters.Add("classPKs", classPKs);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentry/delete-segments-entry-class-p-ks", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetSegmentsEntriesAsync(long groupId, bool includeAncestorSegmentsEntries, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("includeAncestorSegmentsEntries", includeAncestorSegmentsEntries);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentry/get-segments-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetSegmentsEntriesAsync(long groupId, bool includeAncestorSegmentsEntries)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("includeAncestorSegmentsEntries", includeAncestorSegmentsEntries);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentry/get-segments-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetSegmentsEntriesCountAsync(long groupId, bool includeAncestorSegmentsEntries)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("includeAncestorSegmentsEntries", includeAncestorSegmentsEntries);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentry/get-segments-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> SearchSegmentsEntriesAsync(long companyId, long groupId, string keywords, bool includeAncestorSegmentsEntries, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("includeAncestorSegmentsEntries", includeAncestorSegmentsEntries);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentry/search-segments-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}