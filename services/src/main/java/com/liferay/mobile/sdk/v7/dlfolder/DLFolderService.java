package com.liferay.mobile.sdk.v7.dlfolder;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/dlfolder")
public interface DLFolderService {
  @Path("/add-folder")
  Call<JSONObject> addFolder(@Param(name = "groupId") long groupId, @Param(name = "repositoryId") long repositoryId, @Param(name = "mountPoint") boolean mountPoint, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param(name = "folderId") long folderId);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param(name = "folderId") long folderId, @Param(name = "includeTrashedEntries") boolean includeTrashedEntries);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name);

  @Path("/get-file-entries-and-file-shortcuts")
  Call<JSONArray> getFileEntriesAndFileShortcuts(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-file-entries-and-file-shortcuts-count")
  Call<Integer> getFileEntriesAndFileShortcutsCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "status") int status);

  @Path("/get-file-entries-and-file-shortcuts-count")
  Call<Integer> getFileEntriesAndFileShortcutsCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "mimeTypes") JSONArray mimeTypes);

  @Path("/get-folder")
  Call<JSONObject> getFolder(@Param(name = "folderId") long folderId);

  @Path("/get-folder")
  Call<JSONObject> getFolder(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name);

  @Path("/get-folder-ids")
  Call<JSONArray> getFolderIds(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "status") int status, @Param(name = "includeMountfolders") boolean includeMountfolders, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-file-entries-and-file-shortcuts")
  Call<JSONArray> getFoldersAndFileEntriesAndFileShortcuts(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "includeMountFolders") boolean includeMountFolders, @Param(name = "queryDefinition", className = "com.liferay.portal.kernel.dao.orm.QueryDefinition") JSONObject queryDefinition);

  @Path("/get-folders-and-file-entries-and-file-shortcuts")
  Call<JSONArray> getFoldersAndFileEntriesAndFileShortcuts(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "includeMountFolders") boolean includeMountFolders, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-file-entries-and-file-shortcuts")
  Call<JSONArray> getFoldersAndFileEntriesAndFileShortcuts(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "includeMountFolders") boolean includeMountFolders, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-file-entries-and-file-shortcuts-count")
  Call<Integer> getFoldersAndFileEntriesAndFileShortcutsCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders-and-file-entries-and-file-shortcuts-count")
  Call<Integer> getFoldersAndFileEntriesAndFileShortcutsCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders-and-file-entries-and-file-shortcuts-count")
  Call<Integer> getFoldersAndFileEntriesAndFileShortcutsCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "includeMountFolders") boolean includeMountFolders, @Param(name = "queryDefinition", className = "com.liferay.portal.kernel.dao.orm.QueryDefinition") JSONObject queryDefinition);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "status") int status, @Param(name = "includeMountfolders") boolean includeMountfolders);

  @Path("/get-mount-folders")
  Call<JSONArray> getMountFolders(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-mount-folders-count")
  Call<Integer> getMountFoldersCount(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId);

  @Path("/get-subfolder-ids")
  Call<JSONArray> getSubfolderIds(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "recurse") boolean recurse);

  @Path("/get-subfolder-ids")
  Call<Response> getSubfolderIds(@Param(name = "folderIds") JSONArray folderIds, @Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId);

  @Path("/get-subfolder-ids")
  Call<Response> getSubfolderIds(@Param(name = "folderIds") JSONArray folderIds, @Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "recurse") boolean recurse);

  @Path("/has-folder-lock")
  Call<Boolean> hasFolderLock(@Param(name = "folderId") long folderId);

  @Path("/has-inheritable-lock")
  Call<Boolean> hasInheritableLock(@Param(name = "folderId") long folderId);

  @Path("/is-folder-locked")
  Call<Boolean> isFolderLocked(@Param(name = "folderId") long folderId);

  @Path("/lock-folder")
  Call<JSONObject> lockFolder(@Param(name = "folderId") long folderId);

  @Path("/lock-folder")
  Call<JSONObject> lockFolder(@Param(name = "folderId") long folderId, @Param(name = "owner") String owner, @Param(name = "inheritable") boolean inheritable, @Param(name = "expirationTime") long expirationTime);

  @Path("/move-folder")
  Call<JSONObject> moveFolder(@Param(name = "folderId") long folderId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/refresh-folder-lock")
  Call<JSONObject> refreshFolderLock(@Param(name = "lockUuid") String lockUuid, @Param(name = "companyId") long companyId, @Param(name = "expirationTime") long expirationTime);

  @Path("/unlock-folder")
  Call<Response> unlockFolder(@Param(name = "folderId") long folderId, @Param(name = "lockUuid") String lockUuid);

  @Path("/unlock-folder")
  Call<Response> unlockFolder(@Param(name = "groupId") long groupId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name, @Param(name = "lockUuid") String lockUuid);

  @Path("/update-folder")
  Call<JSONObject> updateFolder(@Param(name = "folderId") long folderId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "defaultFileEntryTypeId") long defaultFileEntryTypeId, @Param(name = "fileEntryTypeIds") JSONArray fileEntryTypeIds, @Param(name = "overrideFileEntryTypes") boolean overrideFileEntryTypes, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-folder")
  Call<JSONObject> updateFolder(@Param(name = "folderId") long folderId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "defaultFileEntryTypeId") long defaultFileEntryTypeId, @Param(name = "fileEntryTypeIds") JSONArray fileEntryTypeIds, @Param(name = "restrictionType") int restrictionType, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-folder")
  Call<JSONObject> updateFolder(@Param(name = "folderId") long folderId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "defaultFileEntryTypeId") long defaultFileEntryTypeId, @Param(name = "fileEntryTypeIds") JSONArray fileEntryTypeIds, @Param(name = "restrictionType") int restrictionType, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/verify-inheritable-lock")
  Call<Boolean> verifyInheritableLock(@Param(name = "folderId") long folderId, @Param(name = "lockUuid") String lockUuid);
}
