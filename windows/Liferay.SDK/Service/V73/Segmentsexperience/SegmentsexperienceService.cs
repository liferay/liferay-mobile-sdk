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

namespace Liferay.SDK.Service.V73.Segmentsexperience
{
	public class SegmentsexperienceService : ServiceBase
	{
		public SegmentsexperienceService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddSegmentsExperienceAsync(long segmentsEntryId, long classNameId, long classPK, IDictionary<string, string> nameMap, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsEntryId", segmentsEntryId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperience/add-segments-experience", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSegmentsExperienceAsync(long segmentsExperienceId, long segmentsEntryId, IDictionary<string, string> nameMap, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperienceId", segmentsExperienceId);
			_parameters.Add("segmentsEntryId", segmentsEntryId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperience/update-segments-experience", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetSegmentsExperienceAsync(long segmentsExperienceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperienceId", segmentsExperienceId);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperience/get-segments-experience", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchSegmentsExperienceAsync(long groupId, string segmentsExperienceKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("segmentsExperienceKey", segmentsExperienceKey);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperience/fetch-segments-experience", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetSegmentsExperiencesAsync(long groupId, long classNameId, long classPK, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperience/get-segments-experiences", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetSegmentsExperiencesAsync(long groupId, long classNameId, long classPK, bool active, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("active", active);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperience/get-segments-experiences", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> DeleteSegmentsExperienceAsync(long segmentsExperienceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperienceId", segmentsExperienceId);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperience/delete-segments-experience", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetSegmentsExperiencesCountAsync(long groupId, long classNameId, long classPK, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperience/get-segments-experiences-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task UpdateSegmentsExperiencePriorityAsync(long segmentsExperienceId, int newPriority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperienceId", segmentsExperienceId);
			_parameters.Add("newPriority", newPriority);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperience/update-segments-experience-priority", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}