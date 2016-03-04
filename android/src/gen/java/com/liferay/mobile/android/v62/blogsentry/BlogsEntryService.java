package com.liferay.mobile.android.v62.blogsentry;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/blogsentry")
public interface BlogsEntryService {
  @Path("/delete-entry")
  Call<Response> deleteEntry(@Param("entryId") long entryId);

  @Path("/get-company-entries")
  Call<JSONArray> getCompanyEntries(@Param("companyId") long companyId, @Param("displayDate") long displayDate, @Param("status") int status, @Param("max") int max);

  @Path("/get-company-entries-rss")
  Call<String> getCompanyEntriesRss(@Param("companyId") long companyId, @Param("displayDate") long displayDate, @Param("status") int status, @Param("max") int max, @Param("type") String type, @Param("version") double version, @Param("displayStyle") String displayStyle, @Param("feedURL") String feedURL, @Param("entryURL") String entryURL, @Param("themeDisplay") JSONObjectWrapper themeDisplay);

  @Path("/get-entry")
  Call<JSONObject> getEntry(@Param("entryId") long entryId);

  @Path("/get-entry")
  Call<JSONObject> getEntry(@Param("groupId") long groupId, @Param("urlTitle") String urlTitle);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param("groupId") long groupId, @Param("status") int status, @Param("max") int max);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param("groupId") long groupId, @Param("displayDate") long displayDate, @Param("status") int status, @Param("max") int max);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param("groupId") long groupId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param("groupId") long groupId, @Param("displayDate") long displayDate, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-entries-count")
  Call<Integer> getGroupEntriesCount(@Param("groupId") long groupId, @Param("status") int status);

  @Path("/get-group-entries-count")
  Call<Integer> getGroupEntriesCount(@Param("groupId") long groupId, @Param("displayDate") long displayDate, @Param("status") int status);

  @Path("/get-group-entries-rss")
  Call<String> getGroupEntriesRss(@Param("groupId") long groupId, @Param("displayDate") long displayDate, @Param("status") int status, @Param("max") int max, @Param("type") String type, @Param("version") double version, @Param("displayStyle") String displayStyle, @Param("feedURL") String feedURL, @Param("entryURL") String entryURL, @Param("themeDisplay") JSONObjectWrapper themeDisplay);

  @Path("/get-groups-entries")
  Call<JSONArray> getGroupsEntries(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("displayDate") long displayDate, @Param("status") int status, @Param("max") int max);

  @Path("/get-organization-entries")
  Call<JSONArray> getOrganizationEntries(@Param("organizationId") long organizationId, @Param("displayDate") long displayDate, @Param("status") int status, @Param("max") int max);

  @Path("/get-organization-entries-rss")
  Call<String> getOrganizationEntriesRss(@Param("organizationId") long organizationId, @Param("displayDate") long displayDate, @Param("status") int status, @Param("max") int max, @Param("type") String type, @Param("version") double version, @Param("displayStyle") String displayStyle, @Param("feedURL") String feedURL, @Param("entryURL") String entryURL, @Param("themeDisplay") JSONObjectWrapper themeDisplay);

  @Path("/move-entry-to-trash")
  Call<JSONObject> moveEntryToTrash(@Param("entryId") long entryId);

  @Path("/restore-entry-from-trash")
  Call<Response> restoreEntryFromTrash(@Param("entryId") long entryId);

  @Path("/subscribe")
  Call<Response> subscribe(@Param("groupId") long groupId);

  @Path("/unsubscribe")
  Call<Response> unsubscribe(@Param("groupId") long groupId);
}
