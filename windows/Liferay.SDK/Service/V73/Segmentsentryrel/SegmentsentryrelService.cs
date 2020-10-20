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

namespace Liferay.SDK.Service.V73.Segmentsentryrel
{
	public class SegmentsentryrelService : ServiceBase
	{
		public SegmentsentryrelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddSegmentsEntryRelAsync(long segmentsEntryId, long classNameId, long classPK, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryId", segmentsEntryId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentryrel/add-segments-entry-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteSegmentsEntryRelAsync(long segmentsEntryId, long classNameId, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryId", segmentsEntryId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentryrel/delete-segments-entry-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteSegmentsEntryRelAsync(long segmentsEntryRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryRelId", segmentsEntryRelId);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentryrel/delete-segments-entry-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetSegmentsEntryRelsAsync(long segmentsEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryId", segmentsEntryId);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentryrel/get-segments-entry-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetSegmentsEntryRelsAsync(long groupId, long classNameId, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentryrel/get-segments-entry-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetSegmentsEntryRelsAsync(long segmentsEntryId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryId", segmentsEntryId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentryrel/get-segments-entry-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetSegmentsEntryRelsCountAsync(long groupId, long classNameId, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentryrel/get-segments-entry-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetSegmentsEntryRelsCountAsync(long segmentsEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryId", segmentsEntryId);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentryrel/get-segments-entry-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<bool> HasSegmentsEntryRelAsync(long segmentsEntryId, long classNameId, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryId", segmentsEntryId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsentryrel/has-segments-entry-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}
	}
}