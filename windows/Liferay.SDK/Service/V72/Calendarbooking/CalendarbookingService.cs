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

namespace Liferay.SDK.Service.V72.Calendarbooking
{
	public class CalendarbookingService : ServiceBase
	{
		public CalendarbookingService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> calendarIds, IEnumerable<long> calendarResourceIds, long parentCalendarBookingId, string keywords, long startTime, long endTime, bool recurring, IEnumerable<int> statuses, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("calendarIds", calendarIds);
			_parameters.Add("calendarResourceIds", calendarResourceIds);
			_parameters.Add("parentCalendarBookingId", parentCalendarBookingId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("recurring", recurring);
			_parameters.Add("statuses", statuses);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> calendarIds, IEnumerable<long> calendarResourceIds, long parentCalendarBookingId, string title, string description, string location, long startTime, long endTime, bool recurring, IEnumerable<int> statuses, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("calendarIds", calendarIds);
			_parameters.Add("calendarResourceIds", calendarResourceIds);
			_parameters.Add("parentCalendarBookingId", parentCalendarBookingId);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("location", location);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("recurring", recurring);
			_parameters.Add("statuses", statuses);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> DeleteCalendarBookingAsync(long calendarBookingId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/delete-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<bool> HasChildCalendarBookingsAsync(long parentCalendarBookingId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentCalendarBookingId", parentCalendarBookingId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/has-child-calendar-bookings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<string> GetCalendarBookingsRssAsync(long calendarId, long startTime, long endTime, int max, string type, double version, string displayStyle, JsonObjectWrapper themeDisplay)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("max", max);
			_parameters.Add("type", type);
			_parameters.Add("version", version);
			_parameters.Add("displayStyle", displayStyle);
			this.MangleWrapper(_parameters, "themeDisplay", "$languageUtil.getJSONWrapperClassName($parameter.type)", themeDisplay);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/get-calendar-bookings-rss", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task DeleteCalendarBookingInstanceAsync(long calendarBookingId, long startTime, bool allFollowing)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("startTime", startTime);
			_parameters.Add("allFollowing", allFollowing);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/delete-calendar-booking-instance", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCalendarBookingInstanceAsync(long calendarBookingId, int instanceIndex, bool allFollowing, bool deleteRecurringCalendarBookings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("instanceIndex", instanceIndex);
			_parameters.Add("allFollowing", allFollowing);
			_parameters.Add("deleteRecurringCalendarBookings", deleteRecurringCalendarBookings);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/delete-calendar-booking-instance", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCalendarBookingInstanceAsync(long calendarBookingId, int instanceIndex, bool allFollowing)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("instanceIndex", instanceIndex);
			_parameters.Add("allFollowing", allFollowing);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/delete-calendar-booking-instance", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetCalendarBookingInstanceAsync(long calendarBookingId, int instanceIndex)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("instanceIndex", instanceIndex);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/get-calendar-booking-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetLastInstanceCalendarBookingAsync(long calendarBookingId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/get-last-instance-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetNewStartTimeAndDurationCalendarBookingAsync(long calendarBookingId, long offset, long duration)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("offset", offset);
			_parameters.Add("duration", duration);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/get-new-start-time-and-duration-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task InvokeTransitionAsync(long calendarBookingId, int status, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/invoke-transition", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> InvokeTransitionAsync(long calendarBookingId, int instanceIndex, int status, bool updateInstance, bool allFollowing, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("instanceIndex", instanceIndex);
			_parameters.Add("status", status);
			_parameters.Add("updateInstance", updateInstance);
			_parameters.Add("allFollowing", allFollowing);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/invoke-transition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> InvokeTransitionAsync(long calendarBookingId, long startTime, int status, bool updateInstance, bool allFollowing, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("startTime", startTime);
			_parameters.Add("status", status);
			_parameters.Add("updateInstance", updateInstance);
			_parameters.Add("allFollowing", allFollowing);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/invoke-transition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveCalendarBookingToTrashAsync(long calendarBookingId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/move-calendar-booking-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RestoreCalendarBookingFromTrashAsync(long calendarBookingId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/restore-calendar-booking-from-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCalendarBookingInstanceAsync(long calendarBookingId, int instanceIndex, long calendarId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, long startTime, long endTime, bool allDay, string recurrence, bool allFollowing, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("instanceIndex", instanceIndex);
			_parameters.Add("calendarId", calendarId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("allDay", allDay);
			_parameters.Add("recurrence", recurrence);
			_parameters.Add("allFollowing", allFollowing);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/update-calendar-booking-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCalendarBookingInstanceAsync(long calendarBookingId, int instanceIndex, long calendarId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, int startTimeYear, int startTimeMonth, int startTimeDay, int startTimeHour, int startTimeMinute, int endTimeYear, int endTimeMonth, int endTimeDay, int endTimeHour, int endTimeMinute, string timeZoneId, bool allDay, string recurrence, bool allFollowing, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("instanceIndex", instanceIndex);
			_parameters.Add("calendarId", calendarId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("startTimeYear", startTimeYear);
			_parameters.Add("startTimeMonth", startTimeMonth);
			_parameters.Add("startTimeDay", startTimeDay);
			_parameters.Add("startTimeHour", startTimeHour);
			_parameters.Add("startTimeMinute", startTimeMinute);
			_parameters.Add("endTimeYear", endTimeYear);
			_parameters.Add("endTimeMonth", endTimeMonth);
			_parameters.Add("endTimeDay", endTimeDay);
			_parameters.Add("endTimeHour", endTimeHour);
			_parameters.Add("endTimeMinute", endTimeMinute);
			_parameters.Add("timeZoneId", timeZoneId);
			_parameters.Add("allDay", allDay);
			_parameters.Add("recurrence", recurrence);
			_parameters.Add("allFollowing", allFollowing);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/update-calendar-booking-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCalendarBookingInstanceAsync(long calendarBookingId, int instanceIndex, long calendarId, IEnumerable<long> childCalendarIds, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, long startTime, long endTime, bool allDay, string recurrence, bool allFollowing, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("instanceIndex", instanceIndex);
			_parameters.Add("calendarId", calendarId);
			_parameters.Add("childCalendarIds", childCalendarIds);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("allDay", allDay);
			_parameters.Add("recurrence", recurrence);
			_parameters.Add("allFollowing", allFollowing);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/update-calendar-booking-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCalendarBookingInstanceAsync(long calendarBookingId, int instanceIndex, long calendarId, IEnumerable<long> childCalendarIds, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, long startTime, long endTime, bool allDay, bool allFollowing, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("instanceIndex", instanceIndex);
			_parameters.Add("calendarId", calendarId);
			_parameters.Add("childCalendarIds", childCalendarIds);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("allDay", allDay);
			_parameters.Add("allFollowing", allFollowing);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/update-calendar-booking-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateLastInstanceCalendarBookingRecurrenceAsync(long calendarBookingId, string recurrence)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("recurrence", recurrence);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/update-last-instance-calendar-booking-recurrence", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateOffsetAndDurationAsync(long calendarBookingId, long calendarId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, long offset, long duration, bool allDay, string recurrence, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("calendarId", calendarId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("offset", offset);
			_parameters.Add("duration", duration);
			_parameters.Add("allDay", allDay);
			_parameters.Add("recurrence", recurrence);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/update-offset-and-duration", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateOffsetAndDurationAsync(long calendarBookingId, long calendarId, IEnumerable<long> childCalendarIds, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, long offset, long duration, bool allDay, string recurrence, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("calendarId", calendarId);
			_parameters.Add("childCalendarIds", childCalendarIds);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("offset", offset);
			_parameters.Add("duration", duration);
			_parameters.Add("allDay", allDay);
			_parameters.Add("recurrence", recurrence);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/update-offset-and-duration", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateRecurringCalendarBookingAsync(long calendarBookingId, long calendarId, IEnumerable<long> childCalendarIds, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, long startTime, long endTime, bool allDay, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("calendarId", calendarId);
			_parameters.Add("childCalendarIds", childCalendarIds);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("allDay", allDay);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/update-recurring-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateRecurringCalendarBookingAsync(long calendarBookingId, long calendarId, IEnumerable<long> childCalendarIds, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, long startTime, long endTime, bool allDay, string recurrence, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("calendarId", calendarId);
			_parameters.Add("childCalendarIds", childCalendarIds);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("allDay", allDay);
			_parameters.Add("recurrence", recurrence);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/update-recurring-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> calendarIds, IEnumerable<long> calendarResourceIds, long parentCalendarBookingId, string keywords, long startTime, long endTime, bool recurring, IEnumerable<int> statuses)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("calendarIds", calendarIds);
			_parameters.Add("calendarResourceIds", calendarResourceIds);
			_parameters.Add("parentCalendarBookingId", parentCalendarBookingId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("recurring", recurring);
			_parameters.Add("statuses", statuses);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> calendarIds, IEnumerable<long> calendarResourceIds, long parentCalendarBookingId, string title, string description, string location, long startTime, long endTime, bool recurring, IEnumerable<int> statuses, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("calendarIds", calendarIds);
			_parameters.Add("calendarResourceIds", calendarResourceIds);
			_parameters.Add("parentCalendarBookingId", parentCalendarBookingId);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("location", location);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("recurring", recurring);
			_parameters.Add("statuses", statuses);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<string> ExportCalendarBookingAsync(long calendarBookingId, string type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/export-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCalendarBookingsAsync(long calendarId, long startTime, long endTime, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/get-calendar-bookings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCalendarBookingsAsync(long calendarId, IEnumerable<int> statuses)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("statuses", statuses);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/get-calendar-bookings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCalendarBookingsAsync(long calendarId, long startTime, long endTime)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/get-calendar-bookings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetCalendarBookingAsync(long calendarId, long parentCalendarBookingId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("parentCalendarBookingId", parentCalendarBookingId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/get-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCalendarBookingAsync(long calendarBookingId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/get-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCalendarBookingAsync(long calendarBookingId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/fetch-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCalendarBookingAsync(long calendarId, IEnumerable<long> childCalendarIds, long parentCalendarBookingId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, int startTimeYear, int startTimeMonth, int startTimeDay, int startTimeHour, int startTimeMinute, int endTimeYear, int endTimeMonth, int endTimeDay, int endTimeHour, int endTimeMinute, string timeZoneId, bool allDay, string recurrence, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("childCalendarIds", childCalendarIds);
			_parameters.Add("parentCalendarBookingId", parentCalendarBookingId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("startTimeYear", startTimeYear);
			_parameters.Add("startTimeMonth", startTimeMonth);
			_parameters.Add("startTimeDay", startTimeDay);
			_parameters.Add("startTimeHour", startTimeHour);
			_parameters.Add("startTimeMinute", startTimeMinute);
			_parameters.Add("endTimeYear", endTimeYear);
			_parameters.Add("endTimeMonth", endTimeMonth);
			_parameters.Add("endTimeDay", endTimeDay);
			_parameters.Add("endTimeHour", endTimeHour);
			_parameters.Add("endTimeMinute", endTimeMinute);
			_parameters.Add("timeZoneId", timeZoneId);
			_parameters.Add("allDay", allDay);
			_parameters.Add("recurrence", recurrence);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/add-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCalendarBookingAsync(long calendarId, IEnumerable<long> childCalendarIds, long parentCalendarBookingId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, long startTime, long endTime, bool allDay, string recurrence, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("childCalendarIds", childCalendarIds);
			_parameters.Add("parentCalendarBookingId", parentCalendarBookingId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("allDay", allDay);
			_parameters.Add("recurrence", recurrence);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/add-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCalendarBookingAsync(long calendarId, IEnumerable<long> childCalendarIds, long parentCalendarBookingId, long recurringCalendarBookingId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, int startTimeYear, int startTimeMonth, int startTimeDay, int startTimeHour, int startTimeMinute, int endTimeYear, int endTimeMonth, int endTimeDay, int endTimeHour, int endTimeMinute, string timeZoneId, bool allDay, string recurrence, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("childCalendarIds", childCalendarIds);
			_parameters.Add("parentCalendarBookingId", parentCalendarBookingId);
			_parameters.Add("recurringCalendarBookingId", recurringCalendarBookingId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("startTimeYear", startTimeYear);
			_parameters.Add("startTimeMonth", startTimeMonth);
			_parameters.Add("startTimeDay", startTimeDay);
			_parameters.Add("startTimeHour", startTimeHour);
			_parameters.Add("startTimeMinute", startTimeMinute);
			_parameters.Add("endTimeYear", endTimeYear);
			_parameters.Add("endTimeMonth", endTimeMonth);
			_parameters.Add("endTimeDay", endTimeDay);
			_parameters.Add("endTimeHour", endTimeHour);
			_parameters.Add("endTimeMinute", endTimeMinute);
			_parameters.Add("timeZoneId", timeZoneId);
			_parameters.Add("allDay", allDay);
			_parameters.Add("recurrence", recurrence);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/add-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCalendarBookingAsync(long calendarId, IEnumerable<long> childCalendarIds, long parentCalendarBookingId, long recurringCalendarBookingId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, long startTime, long endTime, bool allDay, string recurrence, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			_parameters.Add("childCalendarIds", childCalendarIds);
			_parameters.Add("parentCalendarBookingId", parentCalendarBookingId);
			_parameters.Add("recurringCalendarBookingId", recurringCalendarBookingId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("allDay", allDay);
			_parameters.Add("recurrence", recurrence);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/add-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCalendarBookingAsync(long calendarBookingId, long calendarId, IEnumerable<long> childCalendarIds, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, long startTime, long endTime, bool allDay, string recurrence, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("calendarId", calendarId);
			_parameters.Add("childCalendarIds", childCalendarIds);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("allDay", allDay);
			_parameters.Add("recurrence", recurrence);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/update-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCalendarBookingAsync(long calendarBookingId, long calendarId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string location, long startTime, long endTime, bool allDay, string recurrence, long firstReminder, string firstReminderType, long secondReminder, string secondReminderType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarBookingId", calendarBookingId);
			_parameters.Add("calendarId", calendarId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("location", location);
			_parameters.Add("startTime", startTime);
			_parameters.Add("endTime", endTime);
			_parameters.Add("allDay", allDay);
			_parameters.Add("recurrence", recurrence);
			_parameters.Add("firstReminder", firstReminder);
			_parameters.Add("firstReminderType", firstReminderType);
			_parameters.Add("secondReminder", secondReminder);
			_parameters.Add("secondReminderType", secondReminderType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/update-calendar-booking", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetChildCalendarBookingsAsync(long parentCalendarBookingId, bool includeStagingCalendarBookings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentCalendarBookingId", parentCalendarBookingId);
			_parameters.Add("includeStagingCalendarBookings", includeStagingCalendarBookings);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/get-child-calendar-bookings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetChildCalendarBookingsAsync(long parentCalendarBookingId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentCalendarBookingId", parentCalendarBookingId);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/get-child-calendar-bookings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetChildCalendarBookingsAsync(long parentCalendarBookingId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentCalendarBookingId", parentCalendarBookingId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarbooking/get-child-calendar-bookings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}