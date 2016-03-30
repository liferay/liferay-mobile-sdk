package com.liferay.mobile.sdk.v62.bookmarksentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.annotation.JsonObject;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/bookmarksentry")
public interface BookmarksEntryService {
  @Path("/add-entry")
  Call<JSONObject> addEntry(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("name") String name, @Param("url") String url, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-entry")
  Call<Response> deleteEntry(@Param("entryId") long entryId);

  @Path("/get-entries")
  Call<JSONArray> getEntries(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("start") int start, @Param("end") int end);

  @Path("/get-entries")
  Call<JSONArray> getEntries(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/get-entries-count")
  Call<Integer> getEntriesCount(@Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/get-entries-count")
  Call<Integer> getEntriesCount(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status);

  @Path("/get-entry")
  Call<JSONObject> getEntry(@Param("entryId") long entryId);

  @Path("/get-folders-entries-count")
  Call<Integer> getFoldersEntriesCount(@Param("groupId") long groupId, @Param("folderIds") JSONArray folderIds);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param("groupId") long groupId, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param("groupId") long groupId, @Param("userId") long userId, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-entries")
  Call<JSONArray> getGroupEntries(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-entries-count")
  Call<Integer> getGroupEntriesCount(@Param("groupId") long groupId);

  @Path("/get-group-entries-count")
  Call<Integer> getGroupEntriesCount(@Param("groupId") long groupId, @Param("userId") long userId);

  @Path("/get-group-entries-count")
  Call<Integer> getGroupEntriesCount(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId);

  @Path("/move-entry")
  Call<JSONObject> moveEntry(@Param("entryId") long entryId, @Param("parentFolderId") long parentFolderId);

  @Path("/move-entry-from-trash")
  Call<JSONObject> moveEntryFromTrash(@Param("entryId") long entryId, @Param("parentFolderId") long parentFolderId);

  @Path("/move-entry-to-trash")
  Call<JSONObject> moveEntryToTrash(@Param("entryId") long entryId);

  @Path("/open-entry")
  Call<JSONObject> openEntry(@JsonObject(name = "entry", className = "com.liferay.portlet.bookmarks.model.BookmarksEntry") JSONObject entry);

  @Path("/open-entry")
  Call<JSONObject> openEntry(@Param("entryId") long entryId);

  @Path("/restore-entry-from-trash")
  Call<Response> restoreEntryFromTrash(@Param("entryId") long entryId);

  @Path("/search")
  Call<JSONObject> search(@Param("groupId") long groupId, @Param("creatorUserId") long creatorUserId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/subscribe-entry")
  Call<Response> subscribeEntry(@Param("entryId") long entryId);

  @Path("/unsubscribe-entry")
  Call<Response> unsubscribeEntry(@Param("entryId") long entryId);

  @Path("/update-entry")
  Call<JSONObject> updateEntry(@Param("entryId") long entryId, @Param("groupId") long groupId, @Param("folderId") long folderId, @Param("name") String name, @Param("url") String url, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
