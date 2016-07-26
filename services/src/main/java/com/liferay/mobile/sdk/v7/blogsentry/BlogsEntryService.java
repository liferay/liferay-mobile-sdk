package com.liferay.mobile.sdk.v7.blogsentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/blogsentry")
public interface BlogsEntryService {
  @Path("/add-entry")
  Call<JSONObject> addEntry(@Param(name = "title") String title, @Param(name = "subtitle") String subtitle, @Param(name = "description") String description, @Param(name = "content") String content, @Param(name = "displayDateMonth") int displayDateMonth, @Param(name = "displayDateDay") int displayDateDay, @Param(name = "displayDateYear") int displayDateYear, @Param(name = "displayDateHour") int displayDateHour, @Param(name = "displayDateMinute") int displayDateMinute, @Param(name = "allowPingbacks") boolean allowPingbacks, @Param(name = "allowTrackbacks") boolean allowTrackbacks, @Param(name = "trackbacks") JSONArray trackbacks, @Param(name = "coverImageCaption") String coverImageCaption, @Param(name = "coverImageImageSelector", className = "com.liferay.portal.kernel.servlet.taglib.ui.ImageSelector") JSONObject coverImageImageSelector, @Param(name = "smallImageImageSelector", className = "com.liferay.portal.kernel.servlet.taglib.ui.ImageSelector") JSONObject smallImageImageSelector, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-entry")
  Call<Response> deleteEntry(@Param(name = "entryId") long entryId);

  @Path("/get-company-entries")
  Call<JSONArray> getCompanyEntries(@Param(name = "companyId") long companyId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "max") int max);

  @Path("/get-company-entries-rss")
  Call<String> getCompanyEntriesRSS(@Param(name = "companyId") long companyId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @Param(name = "themeDisplay", className = "com.liferay.portal.kernel.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/get-entry")
  Call<JSONObject> getEntry(@Param(name = "entryId") long entryId);

  @Path("/get-entry")
  Call<JSONObject> getEntry(@Param(name = "groupId") long groupId, @Param(name = "urlTitle") String urlTitle);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param(name = "groupId") long groupId, @Param(name = "status") int status, @Param(name = "max") int max);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param(name = "groupId") long groupId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "max") int max);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param(name = "groupId") long groupId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param(name = "groupId") long groupId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param(name = "groupId") long groupId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-entries-count")
  Call<Integer> getGroupEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "status") int status);

  @Path("/get-group-entries-count")
  Call<Integer> getGroupEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status);

  @Path("/get-group-entries-rss")
  Call<String> getGroupEntriesRSS(@Param(name = "groupId") long groupId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @Param(name = "themeDisplay", className = "com.liferay.portal.kernel.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/get-group-user-entries")
  Call<JSONArray> getGroupUserEntries(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-user-entries")
  Call<JSONArray> getGroupUserEntries(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "statuses") JSONArray statuses, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-user-entries-count")
  Call<Integer> getGroupUserEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "status") int status);

  @Path("/get-group-user-entries-count")
  Call<Integer> getGroupUserEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "statuses") JSONArray statuses);

  @Path("/get-groups-entries")
  Call<JSONArray> getGroupsEntries(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "max") int max);

  @Path("/get-organization-entries")
  Call<JSONArray> getOrganizationEntries(@Param(name = "organizationId") long organizationId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "max") int max);

  @Path("/get-organization-entries-rss")
  Call<String> getOrganizationEntriesRSS(@Param(name = "organizationId") long organizationId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @Param(name = "themeDisplay", className = "com.liferay.portal.kernel.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/move-entry-to-trash")
  Call<JSONObject> moveEntryToTrash(@Param(name = "entryId") long entryId);

  @Path("/restore-entry-from-trash")
  Call<Response> restoreEntryFromTrash(@Param(name = "entryId") long entryId);

  @Path("/subscribe")
  Call<Response> subscribe(@Param(name = "groupId") long groupId);

  @Path("/unsubscribe")
  Call<Response> unsubscribe(@Param(name = "groupId") long groupId);

  @Path("/update-entry")
  Call<JSONObject> updateEntry(@Param(name = "entryId") long entryId, @Param(name = "title") String title, @Param(name = "subtitle") String subtitle, @Param(name = "description") String description, @Param(name = "content") String content, @Param(name = "displayDateMonth") int displayDateMonth, @Param(name = "displayDateDay") int displayDateDay, @Param(name = "displayDateYear") int displayDateYear, @Param(name = "displayDateHour") int displayDateHour, @Param(name = "displayDateMinute") int displayDateMinute, @Param(name = "allowPingbacks") boolean allowPingbacks, @Param(name = "allowTrackbacks") boolean allowTrackbacks, @Param(name = "trackbacks") JSONArray trackbacks, @Param(name = "coverImageCaption") String coverImageCaption, @Param(name = "coverImageImageSelector", className = "com.liferay.portal.kernel.servlet.taglib.ui.ImageSelector") JSONObject coverImageImageSelector, @Param(name = "smallImageImageSelector", className = "com.liferay.portal.kernel.servlet.taglib.ui.ImageSelector") JSONObject smallImageImageSelector, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
