package com.liferay.mobile.sdk.v62.dlfolder;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
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
  Call<JSONObject> addFolder(@Param("groupId") long groupId, @Param("repositoryId") long repositoryId, @Param("mountPoint") boolean mountPoint, @Param("parentFolderId") long parentFolderId, @Param("name") String name, @Param("description") String description, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param("folderId") long folderId);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param("folderId") long folderId, @Param("includeTrashedEntries") boolean includeTrashedEntries);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("name") String name);

  @Path("/get-file-entries-and-file-shortcuts")
  Call<JSONArray> getFileEntriesAndFileShortcuts(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-file-entries-and-file-shortcuts-count")
  Call<Integer> getFileEntriesAndFileShortcutsCount(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status);

  @Path("/get-file-entries-and-file-shortcuts-count")
  Call<Integer> getFileEntriesAndFileShortcutsCount(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status, @Param("mimeTypes") JSONArray mimeTypes);

  @Path("/get-folder")
  Call<JSONObject> getFolder(@Param("folderId") long folderId);

  @Path("/get-folder")
  Call<JSONObject> getFolder(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("name") String name);

  @Path("/get-folder-ids")
  Call<JSONArray> getFolderIds(@Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("status") int status, @Param("includeMountfolders") boolean includeMountfolders, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-file-entries-and-file-shortcuts")
  Call<JSONArray> getFoldersAndFileEntriesAndFileShortcuts(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status, @Param("includeMountFolders") boolean includeMountFolders, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-file-entries-and-file-shortcuts")
  Call<JSONArray> getFoldersAndFileEntriesAndFileShortcuts(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status, @Param("mimeTypes") JSONArray mimeTypes, @Param("includeMountFolders") boolean includeMountFolders, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-file-entries-and-file-shortcuts-count")
  Call<Integer> getFoldersAndFileEntriesAndFileShortcutsCount(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status, @Param("includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders-and-file-entries-and-file-shortcuts-count")
  Call<Integer> getFoldersAndFileEntriesAndFileShortcutsCount(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status, @Param("mimeTypes") JSONArray mimeTypes, @Param("includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("status") int status, @Param("includeMountfolders") boolean includeMountfolders);

  @Path("/get-mount-folders")
  Call<JSONArray> getMountFolders(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-mount-folders-count")
  Call<Integer> getMountFoldersCount(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId);

  @Path("/get-subfolder-ids")
  Call<Response> getSubfolderIds(@Param("folderIds") JSONArray folderIds, @Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/get-subfolder-ids")
  Call<JSONArray> getSubfolderIds(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("recurse") boolean recurse);

  @Path("/has-folder-lock")
  Call<Boolean> hasFolderLock(@Param("folderId") long folderId);

  @Path("/has-inheritable-lock")
  Call<Boolean> hasInheritableLock(@Param("folderId") long folderId);

  @Path("/is-folder-locked")
  Call<Boolean> isFolderLocked(@Param("folderId") long folderId);

  @Path("/lock-folder")
  Call<JSONObject> lockFolder(@Param("folderId") long folderId);

  @Path("/lock-folder")
  Call<JSONObject> lockFolder(@Param("folderId") long folderId, @Param("owner") String owner, @Param("inheritable") boolean inheritable, @Param("expirationTime") long expirationTime);

  @Path("/move-folder")
  Call<JSONObject> moveFolder(@Param("folderId") long folderId, @Param("parentFolderId") long parentFolderId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/refresh-folder-lock")
  Call<JSONObject> refreshFolderLock(@Param("lockUuid") String lockUuid, @Param("companyId") long companyId, @Param("expirationTime") long expirationTime);

  @Path("/unlock-folder")
  Call<Response> unlockFolder(@Param("folderId") long folderId, @Param("lockUuid") String lockUuid);

  @Path("/unlock-folder")
  Call<Response> unlockFolder(@Param("groupId") long groupId, @Param("parentFolderId") long parentFolderId, @Param("name") String name, @Param("lockUuid") String lockUuid);

  @Path("/update-folder")
  Call<JSONObject> updateFolder(@Param("folderId") long folderId, @Param("name") String name, @Param("description") String description, @Param("defaultFileEntryTypeId") long defaultFileEntryTypeId, @Param("fileEntryTypeIds") JSONArray fileEntryTypeIds, @Param("overrideFileEntryTypes") boolean overrideFileEntryTypes, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/verify-inheritable-lock")
  Call<Boolean> verifyInheritableLock(@Param("folderId") long folderId, @Param("lockUuid") String lockUuid);
}
