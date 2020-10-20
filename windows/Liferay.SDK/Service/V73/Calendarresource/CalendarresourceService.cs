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

namespace Liferay.SDK.Service.V73.Calendarresource
{
	public class CalendarresourceService : ServiceBase
	{
		public CalendarresourceService(ISession session)
			: base(session)
		{
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, string code, string name, string description, bool active, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("code", code);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarresource/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, string keywords, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarresource/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetCalendarResourceAsync(long calendarResourceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarResourceId", calendarResourceId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarresource/get-calendar-resource", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCalendarResourceAsync(long groupId, long classNameId, long classPK, string classUuid, string code, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("classUuid", classUuid);
			_parameters.Add("code", code);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarresource/add-calendar-resource", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCalendarResourceAsync(long calendarResourceId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarResourceId", calendarResourceId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarresource/update-calendar-resource", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCalendarResourceAsync(long classNameId, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarresource/fetch-calendar-resource", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteCalendarResourceAsync(long calendarResourceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarResourceId", calendarResourceId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarresource/delete-calendar-resource", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, string code, string name, string description, bool active, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("code", code);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarresource/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, string keywords, bool active, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("active", active);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarresource/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}