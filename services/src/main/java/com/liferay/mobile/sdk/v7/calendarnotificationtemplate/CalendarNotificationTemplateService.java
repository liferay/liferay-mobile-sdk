package com.liferay.mobile.sdk.v7.calendarnotificationtemplate;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/calendar.calendarnotificationtemplate")
public interface CalendarNotificationTemplateService {
  @Path("/add-calendar-notification-template")
  Call<JSONObject> addCalendarNotificationTemplate(@Param(name = "calendarId") long calendarId, @Param(name = "notificationType", className = "") JSONObject notificationType, @Param(name = "notificationTypeSettings") String notificationTypeSettings, @Param(name = "notificationTemplateType", className = "") JSONObject notificationTemplateType, @Param(name = "subject") String subject, @Param(name = "body") String body, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-calendar-notification-template")
  Call<JSONObject> updateCalendarNotificationTemplate(@Param(name = "calendarNotificationTemplateId") long calendarNotificationTemplateId, @Param(name = "notificationTypeSettings") String notificationTypeSettings, @Param(name = "subject") String subject, @Param(name = "body") String body, @Param(name = "serviceContext", className = "") JSONObject serviceContext);
}
