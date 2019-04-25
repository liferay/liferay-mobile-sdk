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

namespace Liferay.SDK.Service.V72.Calendar
{
	public class CalendarService : ServiceBase
	{
		public CalendarService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> calendarResourceIds, string keywords, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("calendarResourceIds", calendarResourceIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> calendarResourceIds, string keywords, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("calendarResourceIds", calendarResourceIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> calendarResourceIds, string name, string description, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("calendarResourceIds", calendarResourceIds);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> calendarResourceIds, string name, string description, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("calendarResourceIds", calendarResourceIds);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> DeleteCalendarAsync(long calendarId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/delete-calendar", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCalendarAsync(long calendarId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/fetch-calendar", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateColorAsync(long calendarId, int color, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("color", color);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/update-color", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<bool> IsManageableFromGroupAsync(long calendarId, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/is-manageable-from-group", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<dynamic> GetCalendarAsync(long calendarId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/get-calendar", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> calendarResourceIds, string keywords, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("calendarResourceIds", calendarResourceIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> calendarResourceIds, string keywords, bool andOperator, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("calendarResourceIds", calendarResourceIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> calendarResourceIds, string name, string description, bool andOperator, string actionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("calendarResourceIds", calendarResourceIds);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("actionId", actionId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> calendarResourceIds, string name, string description, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("calendarResourceIds", calendarResourceIds);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<string> ExportCalendarAsync(long calendarId, string type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/export-calendar", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task ImportCalendarAsync(long calendarId, string data, string type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("data", data);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/import-calendar", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCalendarResourceCalendarsAsync(long groupId, long calendarResourceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("calendarResourceId", calendarResourceId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/get-calendar-resource-calendars", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCalendarResourceCalendarsAsync(long groupId, long calendarResourceId, bool defaultCalendar)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("calendarResourceId", calendarResourceId);
			_parameters.Add("defaultCalendar", defaultCalendar);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/get-calendar-resource-calendars", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddCalendarAsync(long groupId, long calendarResourceId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string timeZoneId, int color, bool defaultCalendar, bool enableComments, bool enableRatings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("calendarResourceId", calendarResourceId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("timeZoneId", timeZoneId);
			_parameters.Add("color", color);
			_parameters.Add("defaultCalendar", defaultCalendar);
			_parameters.Add("enableComments", enableComments);
			_parameters.Add("enableRatings", enableRatings);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/add-calendar", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCalendarAsync(long calendarId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, int color, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("color", color);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/update-calendar", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCalendarAsync(long calendarId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string timeZoneId, int color, bool defaultCalendar, bool enableComments, bool enableRatings, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("timeZoneId", timeZoneId);
			_parameters.Add("color", color);
			_parameters.Add("defaultCalendar", defaultCalendar);
			_parameters.Add("enableComments", enableComments);
			_parameters.Add("enableRatings", enableRatings);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendar/update-calendar", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}