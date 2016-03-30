package com.liferay.mobile.sdk.v62.bookmarksfolder;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/bookmarksfolder")
public interface BookmarksFolderService {
  @Path("/add-folder")
  Call<JSONObject> addFolder(@Param("parentFolderId") long parentFolderId, @Param("name") String name, @Param("description") String description, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param("folderId") long folderId);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param("folderId") long folderId, @Param("includeTrashedEntries") boolean includeTrashedEntries);

  @Path("/get-folder")
  Call<JSONObject> getFolder(@Param("folderId") long folderId);

  @Path("/get-folder-ids")
  Call<JSONArray> getFolderIds(@Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("groupId") long groupId);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("start") int start, @Param("end") int end);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-folders-and-entries")
  Call<JSONArray> getFoldersAndEntries(@Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/get-folders-and-entries")
  Call<JSONArray> getFoldersAndEntries(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status);

  @Path("/get-folders-and-entries")
  Call<JSONArray> getFoldersAndEntries(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-folders-and-entries-count")
  Call<Integer> getFoldersAndEntriesCount(@Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/get-folders-and-entries-count")
  Call<Integer> getFoldersAndEntriesCount(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("status") int status);

  @Path("/get-subfolder-ids")
  Call<Response> getSubfolderIds(@Param("folderIds") JSONArray folderIds, @Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/get-subfolder-ids")
  Call<JSONArray> getSubfolderIds(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("recurse") boolean recurse);

  @Path("/move-folder")
  Call<JSONObject> moveFolder(@Param("folderId") long folderId, @Param("parentFolderId") long parentFolderId);

  @Path("/move-folder-from-trash")
  Call<JSONObject> moveFolderFromTrash(@Param("folderId") long folderId, @Param("parentFolderId") long parentFolderId);

  @Path("/move-folder-to-trash")
  Call<JSONObject> moveFolderToTrash(@Param("folderId") long folderId);

  @Path("/restore-folder-from-trash")
  Call<Response> restoreFolderFromTrash(@Param("folderId") long folderId);

  @Path("/subscribe-folder")
  Call<Response> subscribeFolder(@Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/unsubscribe-folder")
  Call<Response> unsubscribeFolder(@Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/update-folder")
  Call<JSONObject> updateFolder(@Param("folderId") long folderId, @Param("parentFolderId") long parentFolderId, @Param("name") String name, @Param("description") String description, @Param("mergeWithParentFolder") boolean mergeWithParentFolder, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
