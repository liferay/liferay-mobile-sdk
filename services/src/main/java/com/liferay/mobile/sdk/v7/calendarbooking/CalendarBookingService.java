package com.liferay.mobile.sdk.v7.calendarbooking;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/calendar.calendarbooking")
public interface CalendarBookingService {
  @Path("/add-calendar-booking")
  Call<JSONObject> addCalendarBooking(@Param(name = "calendarId") long calendarId, @Param(name = "childCalendarIds") JSONArray childCalendarIds, @Param(name = "parentCalendarBookingId") long parentCalendarBookingId, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "location") String location, @Param(name = "startTime") long startTime, @Param(name = "endTime") long endTime, @Param(name = "allDay") boolean allDay, @Param(name = "recurrence") String recurrence, @Param(name = "firstReminder") long firstReminder, @Param(name = "firstReminderType") String firstReminderType, @Param(name = "secondReminder") long secondReminder, @Param(name = "secondReminderType") String secondReminderType, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/add-calendar-booking")
  Call<JSONObject> addCalendarBooking(@Param(name = "calendarId") long calendarId, @Param(name = "childCalendarIds") JSONArray childCalendarIds, @Param(name = "parentCalendarBookingId") long parentCalendarBookingId, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "location") String location, @Param(name = "startTimeYear") int startTimeYear, @Param(name = "startTimeMonth") int startTimeMonth, @Param(name = "startTimeDay") int startTimeDay, @Param(name = "startTimeHour") int startTimeHour, @Param(name = "startTimeMinute") int startTimeMinute, @Param(name = "endTimeYear") int endTimeYear, @Param(name = "endTimeMonth") int endTimeMonth, @Param(name = "endTimeDay") int endTimeDay, @Param(name = "endTimeHour") int endTimeHour, @Param(name = "endTimeMinute") int endTimeMinute, @Param(name = "timeZoneId") String timeZoneId, @Param(name = "allDay") boolean allDay, @Param(name = "recurrence") String recurrence, @Param(name = "firstReminder") long firstReminder, @Param(name = "firstReminderType") String firstReminderType, @Param(name = "secondReminder") long secondReminder, @Param(name = "secondReminderType") String secondReminderType, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-calendar-booking")
  Call<JSONObject> deleteCalendarBooking(@Param(name = "calendarBookingId") long calendarBookingId);

  @Path("/delete-calendar-booking-instance")
  Call<Response> deleteCalendarBookingInstance(@Param(name = "calendarBookingId") long calendarBookingId, @Param(name = "instanceIndex") int instanceIndex, @Param(name = "allFollowing") boolean allFollowing);

  @Path("/delete-calendar-booking-instance")
  Call<Response> deleteCalendarBookingInstance(@Param(name = "calendarBookingId") long calendarBookingId, @Param(name = "startTime") long startTime, @Param(name = "allFollowing") boolean allFollowing);

  @Path("/export-calendar-booking")
  Call<String> exportCalendarBooking(@Param(name = "calendarBookingId") long calendarBookingId, @Param(name = "type") String type);

  @Path("/fetch-calendar-booking")
  Call<JSONObject> fetchCalendarBooking(@Param(name = "calendarBookingId") long calendarBookingId);

  @Path("/get-calendar-booking")
  Call<JSONObject> getCalendarBooking(@Param(name = "calendarBookingId") long calendarBookingId);

  @Path("/get-calendar-booking")
  Call<JSONObject> getCalendarBooking(@Param(name = "calendarId") long calendarId, @Param(name = "parentCalendarBookingId") long parentCalendarBookingId);

  @Path("/get-calendar-booking-instance")
  Call<JSONObject> getCalendarBookingInstance(@Param(name = "calendarBookingId") long calendarBookingId, @Param(name = "instanceIndex") int instanceIndex);

  @Path("/get-calendar-bookings")
  Call<JSONArray> getCalendarBookings(@Param(name = "calendarId") long calendarId, @Param(name = "statuses") JSONArray statuses);

  @Path("/get-calendar-bookings")
  Call<JSONArray> getCalendarBookings(@Param(name = "calendarId") long calendarId, @Param(name = "startTime") long startTime, @Param(name = "endTime") long endTime);

  @Path("/get-calendar-bookings")
  Call<JSONArray> getCalendarBookings(@Param(name = "calendarId") long calendarId, @Param(name = "startTime") long startTime, @Param(name = "endTime") long endTime, @Param(name = "max") int max);

  @Path("/get-calendar-bookings-rss")
  Call<String> getCalendarBookingsRSS(@Param(name = "calendarId") long calendarId, @Param(name = "startTime") long startTime, @Param(name = "endTime") long endTime, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "themeDisplay", className = "") JSONObject themeDisplay);

  @Path("/get-child-calendar-bookings")
  Call<JSONArray> getChildCalendarBookings(@Param(name = "parentCalendarBookingId") long parentCalendarBookingId);

  @Path("/get-child-calendar-bookings")
  Call<JSONArray> getChildCalendarBookings(@Param(name = "parentCalendarBookingId") long parentCalendarBookingId, @Param(name = "status") int status);

  @Path("/get-new-start-time-and-duration-calendar-booking")
  Call<JSONObject> getNewStartTimeAndDurationCalendarBooking(@Param(name = "calendarBookingId") long calendarBookingId, @Param(name = "offset") long offset, @Param(name = "duration") long duration);

  @Path("/has-child-calendar-bookings")
  Call<Boolean> hasChildCalendarBookings(@Param(name = "parentCalendarBookingId") long parentCalendarBookingId);

  @Path("/invoke-transition")
  Call<Response> invokeTransition(@Param(name = "calendarBookingId") long calendarBookingId, @Param(name = "status") int status, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/move-calendar-booking-to-trash")
  Call<JSONObject> moveCalendarBookingToTrash(@Param(name = "calendarBookingId") long calendarBookingId);

  @Path("/restore-calendar-booking-from-trash")
  Call<JSONObject> restoreCalendarBookingFromTrash(@Param(name = "calendarBookingId") long calendarBookingId);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "calendarIds") JSONArray calendarIds, @Param(name = "calendarResourceIds") JSONArray calendarResourceIds, @Param(name = "parentCalendarBookingId") long parentCalendarBookingId, @Param(name = "keywords") String keywords, @Param(name = "startTime") long startTime, @Param(name = "endTime") long endTime, @Param(name = "recurring") boolean recurring, @Param(name = "statuses") JSONArray statuses, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "calendarIds") JSONArray calendarIds, @Param(name = "calendarResourceIds") JSONArray calendarResourceIds, @Param(name = "parentCalendarBookingId") long parentCalendarBookingId, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "location") String location, @Param(name = "startTime") long startTime, @Param(name = "endTime") long endTime, @Param(name = "recurring") boolean recurring, @Param(name = "statuses") JSONArray statuses, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "") JSONObject orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "calendarIds") JSONArray calendarIds, @Param(name = "calendarResourceIds") JSONArray calendarResourceIds, @Param(name = "parentCalendarBookingId") long parentCalendarBookingId, @Param(name = "keywords") String keywords, @Param(name = "startTime") long startTime, @Param(name = "endTime") long endTime, @Param(name = "recurring") boolean recurring, @Param(name = "statuses") JSONArray statuses);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "calendarIds") JSONArray calendarIds, @Param(name = "calendarResourceIds") JSONArray calendarResourceIds, @Param(name = "parentCalendarBookingId") long parentCalendarBookingId, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "location") String location, @Param(name = "startTime") long startTime, @Param(name = "endTime") long endTime, @Param(name = "recurring") boolean recurring, @Param(name = "statuses") JSONArray statuses, @Param(name = "andOperator") boolean andOperator);

  @Path("/update-calendar-booking")
  Call<JSONObject> updateCalendarBooking(@Param(name = "calendarBookingId") long calendarBookingId, @Param(name = "calendarId") long calendarId, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "location") String location, @Param(name = "startTime") long startTime, @Param(name = "endTime") long endTime, @Param(name = "allDay") boolean allDay, @Param(name = "recurrence") String recurrence, @Param(name = "firstReminder") long firstReminder, @Param(name = "firstReminderType") String firstReminderType, @Param(name = "secondReminder") long secondReminder, @Param(name = "secondReminderType") String secondReminderType, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-calendar-booking")
  Call<JSONObject> updateCalendarBooking(@Param(name = "calendarBookingId") long calendarBookingId, @Param(name = "calendarId") long calendarId, @Param(name = "childCalendarIds") JSONArray childCalendarIds, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "location") String location, @Param(name = "startTime") long startTime, @Param(name = "endTime") long endTime, @Param(name = "allDay") boolean allDay, @Param(name = "recurrence") String recurrence, @Param(name = "firstReminder") long firstReminder, @Param(name = "firstReminderType") String firstReminderType, @Param(name = "secondReminder") long secondReminder, @Param(name = "secondReminderType") String secondReminderType, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-calendar-booking-instance")
  Call<JSONObject> updateCalendarBookingInstance(@Param(name = "calendarBookingId") long calendarBookingId, @Param(name = "instanceIndex") int instanceIndex, @Param(name = "calendarId") long calendarId, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "location") String location, @Param(name = "startTime") long startTime, @Param(name = "endTime") long endTime, @Param(name = "allDay") boolean allDay, @Param(name = "recurrence") String recurrence, @Param(name = "allFollowing") boolean allFollowing, @Param(name = "firstReminder") long firstReminder, @Param(name = "firstReminderType") String firstReminderType, @Param(name = "secondReminder") long secondReminder, @Param(name = "secondReminderType") String secondReminderType, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-calendar-booking-instance")
  Call<JSONObject> updateCalendarBookingInstance(@Param(name = "calendarBookingId") long calendarBookingId, @Param(name = "instanceIndex") int instanceIndex, @Param(name = "calendarId") long calendarId, @Param(name = "childCalendarIds") JSONArray childCalendarIds, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "location") String location, @Param(name = "startTime") long startTime, @Param(name = "endTime") long endTime, @Param(name = "allDay") boolean allDay, @Param(name = "recurrence") String recurrence, @Param(name = "allFollowing") boolean allFollowing, @Param(name = "firstReminder") long firstReminder, @Param(name = "firstReminderType") String firstReminderType, @Param(name = "secondReminder") long secondReminder, @Param(name = "secondReminderType") String secondReminderType, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-calendar-booking-instance")
  Call<JSONObject> updateCalendarBookingInstance(@Param(name = "calendarBookingId") long calendarBookingId, @Param(name = "instanceIndex") int instanceIndex, @Param(name = "calendarId") long calendarId, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "location") String location, @Param(name = "startTimeYear") int startTimeYear, @Param(name = "startTimeMonth") int startTimeMonth, @Param(name = "startTimeDay") int startTimeDay, @Param(name = "startTimeHour") int startTimeHour, @Param(name = "startTimeMinute") int startTimeMinute, @Param(name = "endTimeYear") int endTimeYear, @Param(name = "endTimeMonth") int endTimeMonth, @Param(name = "endTimeDay") int endTimeDay, @Param(name = "endTimeHour") int endTimeHour, @Param(name = "endTimeMinute") int endTimeMinute, @Param(name = "timeZoneId") String timeZoneId, @Param(name = "allDay") boolean allDay, @Param(name = "recurrence") String recurrence, @Param(name = "allFollowing") boolean allFollowing, @Param(name = "firstReminder") long firstReminder, @Param(name = "firstReminderType") String firstReminderType, @Param(name = "secondReminder") long secondReminder, @Param(name = "secondReminderType") String secondReminderType, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-offset-and-duration")
  Call<JSONObject> updateOffsetAndDuration(@Param(name = "calendarBookingId") long calendarBookingId, @Param(name = "calendarId") long calendarId, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "location") String location, @Param(name = "offset") long offset, @Param(name = "duration") long duration, @Param(name = "allDay") boolean allDay, @Param(name = "recurrence") String recurrence, @Param(name = "firstReminder") long firstReminder, @Param(name = "firstReminderType") String firstReminderType, @Param(name = "secondReminder") long secondReminder, @Param(name = "secondReminderType") String secondReminderType, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-offset-and-duration")
  Call<JSONObject> updateOffsetAndDuration(@Param(name = "calendarBookingId") long calendarBookingId, @Param(name = "calendarId") long calendarId, @Param(name = "childCalendarIds") JSONArray childCalendarIds, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "location") String location, @Param(name = "offset") long offset, @Param(name = "duration") long duration, @Param(name = "allDay") boolean allDay, @Param(name = "recurrence") String recurrence, @Param(name = "firstReminder") long firstReminder, @Param(name = "firstReminderType") String firstReminderType, @Param(name = "secondReminder") long secondReminder, @Param(name = "secondReminderType") String secondReminderType, @Param(name = "serviceContext", className = "") JSONObject serviceContext);
}
