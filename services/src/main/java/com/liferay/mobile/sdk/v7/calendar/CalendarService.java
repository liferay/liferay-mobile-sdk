package com.liferay.mobile.sdk.v7.calendar;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/calendar.calendar")
public interface CalendarService {
  @Path("/add-calendar")
  Call<JSONObject> addCalendar(@Param(name = "groupId") long groupId, @Param(name = "calendarResourceId") long calendarResourceId, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "timeZoneId") String timeZoneId, @Param(name = "color") int color, @Param(name = "defaultCalendar") boolean defaultCalendar, @Param(name = "enableComments") boolean enableComments, @Param(name = "enableRatings") boolean enableRatings, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-calendar")
  Call<JSONObject> deleteCalendar(@Param(name = "calendarId") long calendarId);

  @Path("/export-calendar")
  Call<String> exportCalendar(@Param(name = "calendarId") long calendarId, @Param(name = "type") String type);

  @Path("/fetch-calendar")
  Call<JSONObject> fetchCalendar(@Param(name = "calendarId") long calendarId);

  @Path("/get-calendar")
  Call<JSONObject> getCalendar(@Param(name = "calendarId") long calendarId);

  @Path("/get-calendar-resource-calendars")
  Call<JSONArray> getCalendarResourceCalendars(@Param(name = "groupId") long groupId, @Param(name = "calendarResourceId") long calendarResourceId);

  @Path("/get-calendar-resource-calendars")
  Call<JSONArray> getCalendarResourceCalendars(@Param(name = "groupId") long groupId, @Param(name = "calendarResourceId") long calendarResourceId, @Param(name = "defaultCalendar") boolean defaultCalendar);

  @Path("/import-calendar")
  Call<Response> importCalendar(@Param(name = "calendarId") long calendarId, @Param(name = "data") String data, @Param(name = "type") String type);

  @Path("/is-manageable-from-group")
  Call<Boolean> isManageableFromGroup(@Param(name = "calendarId") long calendarId, @Param(name = "groupId") long groupId);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "calendarResourceIds") JSONArray calendarResourceIds, @Param(name = "keywords") String keywords, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.calendar.model.Calendar>") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "calendarResourceIds") JSONArray calendarResourceIds, @Param(name = "keywords") String keywords, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.calendar.model.Calendar>") JSONObject orderByComparator, @Param(name = "actionId") String actionId);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "calendarResourceIds") JSONArray calendarResourceIds, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.calendar.model.Calendar>") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "calendarResourceIds") JSONArray calendarResourceIds, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.calendar.model.Calendar>") JSONObject orderByComparator, @Param(name = "actionId") String actionId);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "calendarResourceIds") JSONArray calendarResourceIds, @Param(name = "keywords") String keywords, @Param(name = "andOperator") boolean andOperator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "calendarResourceIds") JSONArray calendarResourceIds, @Param(name = "keywords") String keywords, @Param(name = "andOperator") boolean andOperator, @Param(name = "actionId") String actionId);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "calendarResourceIds") JSONArray calendarResourceIds, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "andOperator") boolean andOperator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "calendarResourceIds") JSONArray calendarResourceIds, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "andOperator") boolean andOperator, @Param(name = "actionId") String actionId);

  @Path("/update-calendar")
  Call<JSONObject> updateCalendar(@Param(name = "calendarId") long calendarId, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "color") int color, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-calendar")
  Call<JSONObject> updateCalendar(@Param(name = "calendarId") long calendarId, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "timeZoneId") String timeZoneId, @Param(name = "color") int color, @Param(name = "defaultCalendar") boolean defaultCalendar, @Param(name = "enableComments") boolean enableComments, @Param(name = "enableRatings") boolean enableRatings, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-color")
  Call<JSONObject> updateColor(@Param(name = "calendarId") long calendarId, @Param(name = "color") int color, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
