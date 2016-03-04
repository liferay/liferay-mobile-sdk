package com.liferay.mobile.android.v62.announcementsentry;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/announcementsentry")
public interface AnnouncementsEntryService {
  @Path("/add-entry")
  Call<JSONObject> addEntry(@Param("plid") long plid, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("title") String title, @Param("content") String content, @Param("url") String url, @Param("type") String type, @Param("displayDateMonth") int displayDateMonth, @Param("displayDateDay") int displayDateDay, @Param("displayDateYear") int displayDateYear, @Param("displayDateHour") int displayDateHour, @Param("displayDateMinute") int displayDateMinute, @Param("expirationDateMonth") int expirationDateMonth, @Param("expirationDateDay") int expirationDateDay, @Param("expirationDateYear") int expirationDateYear, @Param("expirationDateHour") int expirationDateHour, @Param("expirationDateMinute") int expirationDateMinute, @Param("priority") int priority, @Param("alert") boolean alert);

  @Path("/add-entry")
  Call<JSONObject> addEntry(@Param("plid") long plid, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("title") String title, @Param("content") String content, @Param("url") String url, @Param("type") String type, @Param("displayDateMonth") int displayDateMonth, @Param("displayDateDay") int displayDateDay, @Param("displayDateYear") int displayDateYear, @Param("displayDateHour") int displayDateHour, @Param("displayDateMinute") int displayDateMinute, @Param("displayImmediately") boolean displayImmediately, @Param("expirationDateMonth") int expirationDateMonth, @Param("expirationDateDay") int expirationDateDay, @Param("expirationDateYear") int expirationDateYear, @Param("expirationDateHour") int expirationDateHour, @Param("expirationDateMinute") int expirationDateMinute, @Param("priority") int priority, @Param("alert") boolean alert);

  @Path("/delete-entry")
  Call<Response> deleteEntry(@Param("entryId") long entryId);

  @Path("/get-entry")
  Call<JSONObject> getEntry(@Param("entryId") long entryId);

  @Path("/update-entry")
  Call<JSONObject> updateEntry(@Param("entryId") long entryId, @Param("title") String title, @Param("content") String content, @Param("url") String url, @Param("type") String type, @Param("displayDateMonth") int displayDateMonth, @Param("displayDateDay") int displayDateDay, @Param("displayDateYear") int displayDateYear, @Param("displayDateHour") int displayDateHour, @Param("displayDateMinute") int displayDateMinute, @Param("displayImmediately") boolean displayImmediately, @Param("expirationDateMonth") int expirationDateMonth, @Param("expirationDateDay") int expirationDateDay, @Param("expirationDateYear") int expirationDateYear, @Param("expirationDateHour") int expirationDateHour, @Param("expirationDateMinute") int expirationDateMinute, @Param("priority") int priority);
}
