package com.liferay.mobile.android.v62.journalfolder;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/journalfolder")
public interface JournalFolderService {
  @Path("/add-folder")
  Call<JSONObject> addFolder(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("name") String name, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

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
  Call<JSONArray> getFolders(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("status") int status);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("start") int start, @Param("end") int end);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-folders-and-articles")
  Call<JSONArray> getFoldersAndArticles(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-articles")
  Call<JSONArray> getFoldersAndArticles(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-articles-count")
  Call<Integer> getFoldersAndArticlesCount(@Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/get-folders-and-articles-count")
  Call<Integer> getFoldersAndArticlesCount(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status);

  @Path("/get-folders-and-articles-count")
  Call<Integer> getFoldersAndArticlesCount(@Param("groupId") long groupId, @Param("folderIds") JSONArray folderIds, @Param("status") int status);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("status") int status);

  @Path("/get-subfolder-ids")
  Call<Response> getSubfolderIds(@Param("folderIds") JSONArray folderIds, @Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/get-subfolder-ids")
  Call<JSONArray> getSubfolderIds(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("recurse") boolean recurse);

  @Path("/move-folder")
  Call<JSONObject> moveFolder(@Param("folderId") long folderId, @Param("parentFolderId") long parentFolderId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-folder-from-trash")
  Call<JSONObject> moveFolderFromTrash(@Param("folderId") long folderId, @Param("parentFolderId") long parentFolderId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-folder-to-trash")
  Call<JSONObject> moveFolderToTrash(@Param("folderId") long folderId);

  @Path("/restore-folder-from-trash")
  Call<Response> restoreFolderFromTrash(@Param("folderId") long folderId);

  @Path("/update-folder")
  Call<JSONObject> updateFolder(@Param("folderId") long folderId, @Param("parentFolderId") long parentFolderId, @Param("name") String name, @Param("description") String description, @Param("mergeWithParentFolder") boolean mergeWithParentFolder, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
