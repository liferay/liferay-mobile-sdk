package com.liferay.mobile.sdk.v7.calendarresource;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/calendar.calendarresource")
public interface CalendarResourceService {
  @Path("/add-calendar-resource")
  Call<JSONObject> addCalendarResource(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "classUuid") String classUuid, @Param(name = "code") String code, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "active") boolean active, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-calendar-resource")
  Call<JSONObject> deleteCalendarResource(@Param(name = "calendarResourceId") long calendarResourceId);

  @Path("/fetch-calendar-resource")
  Call<JSONObject> fetchCalendarResource(@Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK);

  @Path("/get-calendar-resource")
  Call<JSONObject> getCalendarResource(@Param(name = "calendarResourceId") long calendarResourceId);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "keywords") String keywords, @Param(name = "active") boolean active, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.calendar.model.CalendarResource>") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "code") String code, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "active") boolean active, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.calendar.model.CalendarResource>") JSONObject orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "keywords") String keywords, @Param(name = "active") boolean active);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "code") String code, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "active") boolean active, @Param(name = "andOperator") boolean andOperator);

  @Path("/update-calendar-resource")
  Call<JSONObject> updateCalendarResource(@Param(name = "calendarResourceId") long calendarResourceId, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "active") boolean active, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
