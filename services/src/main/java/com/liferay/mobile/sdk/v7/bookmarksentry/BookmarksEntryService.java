package com.liferay.mobile.sdk.v7.bookmarksentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/bookmarks.bookmarksentry")
public interface BookmarksEntryService {
  @Path("/add-entry")
  Call<JSONObject> addEntry(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "name") String name, @Param(name = "url") String url, @Param(name = "description") String description, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-entry")
  Call<Response> deleteEntry(@Param(name = "entryId") long entryId);

  @Path("/get-entries")
  Call<JSONArray> getEntries(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-entries")
  Call<JSONArray> getEntries(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "") JSONObject orderByComparator);

  @Path("/get-entries-count")
  Call<Integer> getEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId);

  @Path("/get-entries-count")
  Call<Integer> getEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "status") int status);

  @Path("/get-entry")
  Call<JSONObject> getEntry(@Param(name = "entryId") long entryId);

  @Path("/get-folders-entries-count")
  Call<Integer> getFoldersEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "folderIds") JSONArray folderIds);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param(name = "groupId") long groupId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-entries-count")
  Call<Integer> getGroupEntriesCount(@Param(name = "groupId") long groupId);

  @Path("/get-group-entries-count")
  Call<Integer> getGroupEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId);

  @Path("/get-group-entries-count")
  Call<Integer> getGroupEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId);

  @Path("/move-entry")
  Call<JSONObject> moveEntry(@Param(name = "entryId") long entryId, @Param(name = "parentFolderId") long parentFolderId);

  @Path("/move-entry-from-trash")
  Call<JSONObject> moveEntryFromTrash(@Param(name = "entryId") long entryId, @Param(name = "parentFolderId") long parentFolderId);

  @Path("/move-entry-to-trash")
  Call<JSONObject> moveEntryToTrash(@Param(name = "entryId") long entryId);

  @Path("/open-entry")
  Call<JSONObject> openEntry(@Param(name = "entry", className = "") JSONObject entry);

  @Path("/open-entry")
  Call<JSONObject> openEntry(@Param(name = "entryId") long entryId);

  @Path("/restore-entry-from-trash")
  Call<Response> restoreEntryFromTrash(@Param(name = "entryId") long entryId);

  @Path("/search")
  Call<JSONObject> search(@Param(name = "groupId") long groupId, @Param(name = "creatorUserId") long creatorUserId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/subscribe-entry")
  Call<Response> subscribeEntry(@Param(name = "entryId") long entryId);

  @Path("/unsubscribe-entry")
  Call<Response> unsubscribeEntry(@Param(name = "entryId") long entryId);

  @Path("/update-entry")
  Call<JSONObject> updateEntry(@Param(name = "entryId") long entryId, @Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "name") String name, @Param(name = "url") String url, @Param(name = "description") String description, @Param(name = "serviceContext", className = "") JSONObject serviceContext);
}
