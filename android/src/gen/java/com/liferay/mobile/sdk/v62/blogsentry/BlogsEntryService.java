package com.liferay.mobile.sdk.v62.blogsentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/blogsentry")
public interface BlogsEntryService {
  @Path("/delete-entry")
  Call<Response> deleteEntry(@Param(name = "entryId") long entryId);

  @Path("/get-company-entries")
  Call<JSONArray> getCompanyEntries(@Param(name = "companyId") long companyId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "max") int max);

  @Path("/get-company-entries-rss")
  Call<String> getCompanyEntriesRss(@Param(name = "companyId") long companyId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @ParamObject(name = "themeDisplay", className = "com.liferay.portal.theme.ThemeDisplay") JSONObject themeDisplay);

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

  @Path("/get-group-entries-count")
  Call<Integer> getGroupEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "status") int status);

  @Path("/get-group-entries-count")
  Call<Integer> getGroupEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status);

  @Path("/get-group-entries-rss")
  Call<String> getGroupEntriesRss(@Param(name = "groupId") long groupId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @ParamObject(name = "themeDisplay", className = "com.liferay.portal.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/get-groups-entries")
  Call<JSONArray> getGroupsEntries(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "max") int max);

  @Path("/get-organization-entries")
  Call<JSONArray> getOrganizationEntries(@Param(name = "organizationId") long organizationId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "max") int max);

  @Path("/get-organization-entries-rss")
  Call<String> getOrganizationEntriesRss(@Param(name = "organizationId") long organizationId, @Param(name = "displayDate") long displayDate, @Param(name = "status") int status, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @ParamObject(name = "themeDisplay", className = "com.liferay.portal.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/move-entry-to-trash")
  Call<JSONObject> moveEntryToTrash(@Param(name = "entryId") long entryId);

  @Path("/restore-entry-from-trash")
  Call<Response> restoreEntryFromTrash(@Param(name = "entryId") long entryId);

  @Path("/subscribe")
  Call<Response> subscribe(@Param(name = "groupId") long groupId);

  @Path("/unsubscribe")
  Call<Response> unsubscribe(@Param(name = "groupId") long groupId);
}
