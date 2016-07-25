package com.liferay.mobile.sdk.v7.journalfolder;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/journal.journalfolder")
public interface JournalFolderService {
  @Path("/add-folder")
  Call<JSONObject> addFolder(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param(name = "folderId") long folderId);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param(name = "folderId") long folderId, @Param(name = "includeTrashedEntries") boolean includeTrashedEntries);

  @Path("/fetch-folder")
  Call<JSONObject> fetchFolder(@Param(name = "folderId") long folderId);

  @Path("/get-ddm-structures")
  Call<JSONArray> getDDMStructures(@Param(name = "groupIds") JSONArray groupIds, @Param(name = "folderId") long folderId, @Param(name = "restrictionType") int restrictionType);

  @Path("/get-folder")
  Call<JSONObject> getFolder(@Param(name = "folderId") long folderId);

  @Path("/get-folder-ids")
  Call<JSONArray> getFolderIds(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "groupId") long groupId);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "status") int status);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-folders-and-articles")
  Call<JSONArray> getFoldersAndArticles(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-folders-and-articles")
  Call<JSONArray> getFoldersAndArticles(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-folders-and-articles")
  Call<JSONArray> getFoldersAndArticles(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-folders-and-articles-count")
  Call<Integer> getFoldersAndArticlesCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId);

  @Path("/get-folders-and-articles-count")
  Call<Integer> getFoldersAndArticlesCount(@Param(name = "groupId") long groupId, @Param(name = "folderIds") JSONArray folderIds, @Param(name = "status") int status);

  @Path("/get-folders-and-articles-count")
  Call<Integer> getFoldersAndArticlesCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "status") int status);

  @Path("/get-folders-and-articles-count")
  Call<Integer> getFoldersAndArticlesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "folderId") long folderId, @Param(name = "status") int status);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "status") int status);

  @Path("/get-subfolder-ids")
  Call<Response> getSubfolderIds(@Param(name = "folderIds") JSONArray folderIds, @Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId);

  @Path("/get-subfolder-ids")
  Call<JSONArray> getSubfolderIds(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "recurse") boolean recurse);

  @Path("/get-subfolder-ids")
  Call<Response> getSubfolderIds(@Param(name = "folderIds") JSONArray folderIds, @Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "recurse") boolean recurse);

  @Path("/move-folder")
  Call<JSONObject> moveFolder(@Param(name = "folderId") long folderId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/move-folder-from-trash")
  Call<JSONObject> moveFolderFromTrash(@Param(name = "folderId") long folderId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/move-folder-to-trash")
  Call<JSONObject> moveFolderToTrash(@Param(name = "folderId") long folderId);

  @Path("/restore-folder-from-trash")
  Call<Response> restoreFolderFromTrash(@Param(name = "folderId") long folderId);

  @Path("/subscribe")
  Call<Response> subscribe(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId);

  @Path("/unsubscribe")
  Call<Response> unsubscribe(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId);

  @Path("/update-folder")
  Call<JSONObject> updateFolder(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "mergeWithParentFolder") boolean mergeWithParentFolder, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-folder")
  Call<JSONObject> updateFolder(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "ddmStructureIds") JSONArray ddmStructureIds, @Param(name = "restrictionType") int restrictionType, @Param(name = "mergeWithParentFolder") boolean mergeWithParentFolder, @Param(name = "serviceContext", className = "") JSONObject serviceContext);
}
