package com.liferay.mobile.sdk.v7.announcementsentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/announcementsentry")
public interface AnnouncementsEntryService {
  @Path("/add-entry")
  Call<JSONObject> addEntry(@Param(name = "plid") long plid, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "title") String title, @Param(name = "content") String content, @Param(name = "url") String url, @Param(name = "type") String type, @Param(name = "displayDateMonth") int displayDateMonth, @Param(name = "displayDateDay") int displayDateDay, @Param(name = "displayDateYear") int displayDateYear, @Param(name = "displayDateHour") int displayDateHour, @Param(name = "displayDateMinute") int displayDateMinute, @Param(name = "displayImmediately") boolean displayImmediately, @Param(name = "expirationDateMonth") int expirationDateMonth, @Param(name = "expirationDateDay") int expirationDateDay, @Param(name = "expirationDateYear") int expirationDateYear, @Param(name = "expirationDateHour") int expirationDateHour, @Param(name = "expirationDateMinute") int expirationDateMinute, @Param(name = "priority") int priority, @Param(name = "alert") boolean alert);

  @Path("/delete-entry")
  Call<Response> deleteEntry(@Param(name = "entryId") long entryId);

  @Path("/get-entry")
  Call<JSONObject> getEntry(@Param(name = "entryId") long entryId);

  @Path("/update-entry")
  Call<JSONObject> updateEntry(@Param(name = "entryId") long entryId, @Param(name = "title") String title, @Param(name = "content") String content, @Param(name = "url") String url, @Param(name = "type") String type, @Param(name = "displayDateMonth") int displayDateMonth, @Param(name = "displayDateDay") int displayDateDay, @Param(name = "displayDateYear") int displayDateYear, @Param(name = "displayDateHour") int displayDateHour, @Param(name = "displayDateMinute") int displayDateMinute, @Param(name = "displayImmediately") boolean displayImmediately, @Param(name = "expirationDateMonth") int expirationDateMonth, @Param(name = "expirationDateDay") int expirationDateDay, @Param(name = "expirationDateYear") int expirationDateYear, @Param(name = "expirationDateHour") int expirationDateHour, @Param(name = "expirationDateMinute") int expirationDateMinute, @Param(name = "priority") int priority);
}
