package com.liferay.mobile.android.v62.dlapp;

import com.liferay.mobile.android.http.Headers;
import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.http.file.UploadData;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/dlapp")
public interface DLAppService {
  @Path("/add-file-entry")
  Call<JSONObject> addFileEntry(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("sourceFileName") String sourceFileName, @Param("mimeType") String mimeType, @Param("title") String title, @Param("description") String description, @Param("changeLog") String changeLog, @Param("bytes") byte[] bytes, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/add-file-entry",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<JSONObject> addFileEntry(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("sourceFileName") String sourceFileName, @Param("mimeType") String mimeType, @Param("title") String title, @Param("description") String description, @Param("changeLog") String changeLog, @Param("file") UploadData file, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-file-shortcut")
  Call<JSONObject> addFileShortcut(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("toFileEntryId") long toFileEntryId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-folder")
  Call<JSONObject> addFolder(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("name") String name, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/add-temp-file-entry",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<JSONObject> addTempFileEntry(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("fileName") String fileName, @Param("tempFolderName") String tempFolderName, @Param("file") UploadData file, @Param("mimeType") String mimeType);

  @Path("/cancel-check-out")
  Call<Response> cancelCheckOut(@Param("fileEntryId") long fileEntryId);

  @Path("/check-in-file-entry")
  Call<Response> checkInFileEntry(@Param("fileEntryId") long fileEntryId, @Param("lockUuid") String lockUuid);

  @Path("/check-in-file-entry")
  Call<Response> checkInFileEntry(@Param("fileEntryId") long fileEntryId, @Param("lockUuid") String lockUuid, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-in-file-entry")
  Call<Response> checkInFileEntry(@Param("fileEntryId") long fileEntryId, @Param("majorVersion") boolean majorVersion, @Param("changeLog") String changeLog, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-out-file-entry")
  Call<Response> checkOutFileEntry(@Param("fileEntryId") long fileEntryId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-out-file-entry")
  Call<JSONObject> checkOutFileEntry(@Param("fileEntryId") long fileEntryId, @Param("owner") String owner, @Param("expirationTime") long expirationTime, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-folder")
  Call<JSONObject> copyFolder(@Param("repositoryId") long repositoryId, @Param("sourceFolderId") long sourceFolderId, @Param("parentFolderId") long parentFolderId, @Param("name") String name, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-file-entry")
  Call<Response> deleteFileEntry(@Param("fileEntryId") long fileEntryId);

  @Path("/delete-file-entry-by-title")
  Call<Response> deleteFileEntryByTitle(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("title") String title);

  @Path("/delete-file-shortcut")
  Call<Response> deleteFileShortcut(@Param("fileShortcutId") long fileShortcutId);

  @Path("/delete-file-version")
  Call<Response> deleteFileVersion(@Param("fileEntryId") long fileEntryId, @Param("version") String version);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param("folderId") long folderId);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("name") String name);

  @Path("/delete-temp-file-entry")
  Call<Response> deleteTempFileEntry(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("fileName") String fileName, @Param("tempFolderName") String tempFolderName);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("fileEntryTypeId") long fileEntryTypeId);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("mimeTypes") JSONArray mimeTypes);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("start") int start, @Param("end") int end);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("fileEntryTypeId") long fileEntryTypeId, @Param("start") int start, @Param("end") int end);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("fileEntryTypeId") long fileEntryTypeId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-file-entries-and-file-shortcuts")
  Call<JSONArray> getFileEntriesAndFileShortcuts(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-file-entries-and-file-shortcuts-count")
  Call<Integer> getFileEntriesAndFileShortcutsCount(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("status") int status);

  @Path("/get-file-entries-and-file-shortcuts-count")
  Call<Integer> getFileEntriesAndFileShortcutsCount(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("status") int status, @Param("mimeTypes") JSONArray mimeTypes);

  @Path("/get-file-entries-count")
  Call<Integer> getFileEntriesCount(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId);

  @Path("/get-file-entries-count")
  Call<Integer> getFileEntriesCount(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("fileEntryTypeId") long fileEntryTypeId);

  @Path("/get-file-entry")
  Call<JSONObject> getFileEntry(@Param("fileEntryId") long fileEntryId);

  @Path("/get-file-entry")
  Call<JSONObject> getFileEntry(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("title") String title);

  @Path("/get-file-entry-by-uuid-and-group-id")
  Call<JSONObject> getFileEntryByUuidAndGroupId(@Param("uuid") String uuid, @Param("groupId") long groupId);

  @Path("/get-file-shortcut")
  Call<JSONObject> getFileShortcut(@Param("fileShortcutId") long fileShortcutId);

  @Path("/get-folder")
  Call<JSONObject> getFolder(@Param("folderId") long folderId);

  @Path("/get-folder")
  Call<JSONObject> getFolder(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("name") String name);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("start") int start, @Param("end") int end);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("includeMountFolders") boolean includeMountFolders, @Param("start") int start, @Param("end") int end);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("includeMountFolders") boolean includeMountFolders, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("status") int status, @Param("includeMountFolders") boolean includeMountFolders, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-file-entries-and-file-shortcuts")
  Call<JSONArray> getFoldersAndFileEntriesAndFileShortcuts(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("status") int status, @Param("includeMountFolders") boolean includeMountFolders, @Param("start") int start, @Param("end") int end);

  @Path("/get-folders-and-file-entries-and-file-shortcuts")
  Call<JSONArray> getFoldersAndFileEntriesAndFileShortcuts(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("status") int status, @Param("includeMountFolders") boolean includeMountFolders, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-file-entries-and-file-shortcuts")
  Call<JSONArray> getFoldersAndFileEntriesAndFileShortcuts(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("status") int status, @Param("mimeTypes") JSONArray mimeTypes, @Param("includeMountFolders") boolean includeMountFolders, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-file-entries-and-file-shortcuts-count")
  Call<Integer> getFoldersAndFileEntriesAndFileShortcutsCount(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("status") int status, @Param("includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders-and-file-entries-and-file-shortcuts-count")
  Call<Integer> getFoldersAndFileEntriesAndFileShortcutsCount(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("status") int status, @Param("mimeTypes") JSONArray mimeTypes, @Param("includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("status") int status, @Param("includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders-file-entries-count")
  Call<Integer> getFoldersFileEntriesCount(@Param("repositoryId") long repositoryId, @Param("folderIds") JSONArray folderIds, @Param("status") int status);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param("groupId") long groupId, @Param("userId") long userId, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param("groupId") long groupId, @Param("userId") long userId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId, @Param("mimeTypes") JSONArray mimeTypes, @Param("status") int status, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-file-entries-count")
  Call<Integer> getGroupFileEntriesCount(@Param("groupId") long groupId, @Param("userId") long userId);

  @Path("/get-group-file-entries-count")
  Call<Integer> getGroupFileEntriesCount(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId);

  @Path("/get-group-file-entries-count")
  Call<Integer> getGroupFileEntriesCount(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId, @Param("mimeTypes") JSONArray mimeTypes, @Param("status") int status);

  @Path("/get-mount-folders")
  Call<JSONArray> getMountFolders(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId);

  @Path("/get-mount-folders")
  Call<JSONArray> getMountFolders(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("start") int start, @Param("end") int end);

  @Path("/get-mount-folders")
  Call<JSONArray> getMountFolders(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-mount-folders-count")
  Call<Integer> getMountFoldersCount(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId);

  @Path("/get-subfolder-ids")
  Call<JSONArray> getSubfolderIds(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId);

  @Path("/get-subfolder-ids")
  Call<JSONArray> getSubfolderIds(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("recurse") boolean recurse);

  @Path("/get-subfolder-ids")
  Call<Response> getSubfolderIds(@Param("repositoryId") long repositoryId, @Param("folderIds") JSONArray folderIds, @Param("folderId") long folderId);

  @Path("/get-temp-file-entry-names")
  Call<JSONArray> getTempFileEntryNames(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("tempFolderName") String tempFolderName);

  @Path("/lock-file-entry")
  Call<JSONObject> lockFileEntry(@Param("fileEntryId") long fileEntryId);

  @Path("/lock-file-entry")
  Call<JSONObject> lockFileEntry(@Param("fileEntryId") long fileEntryId, @Param("owner") String owner, @Param("expirationTime") long expirationTime);

  @Path("/lock-folder")
  Call<JSONObject> lockFolder(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId);

  @Path("/lock-folder")
  Call<JSONObject> lockFolder(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("owner") String owner, @Param("inheritable") boolean inheritable, @Param("expirationTime") long expirationTime);

  @Path("/move-file-entry")
  Call<JSONObject> moveFileEntry(@Param("fileEntryId") long fileEntryId, @Param("newFolderId") long newFolderId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-file-entry-from-trash")
  Call<JSONObject> moveFileEntryFromTrash(@Param("fileEntryId") long fileEntryId, @Param("newFolderId") long newFolderId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-file-entry-to-trash")
  Call<JSONObject> moveFileEntryToTrash(@Param("fileEntryId") long fileEntryId);

  @Path("/move-file-shortcut-from-trash")
  Call<JSONObject> moveFileShortcutFromTrash(@Param("fileShortcutId") long fileShortcutId, @Param("newFolderId") long newFolderId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-file-shortcut-to-trash")
  Call<JSONObject> moveFileShortcutToTrash(@Param("fileShortcutId") long fileShortcutId);

  @Path("/move-folder")
  Call<JSONObject> moveFolder(@Param("folderId") long folderId, @Param("parentFolderId") long parentFolderId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-folder-from-trash")
  Call<JSONObject> moveFolderFromTrash(@Param("folderId") long folderId, @Param("parentFolderId") long parentFolderId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-folder-to-trash")
  Call<JSONObject> moveFolderToTrash(@Param("folderId") long folderId);

  @Path("/refresh-file-entry-lock")
  Call<JSONObject> refreshFileEntryLock(@Param("lockUuid") String lockUuid, @Param("companyId") long companyId, @Param("expirationTime") long expirationTime);

  @Path("/refresh-folder-lock")
  Call<JSONObject> refreshFolderLock(@Param("lockUuid") String lockUuid, @Param("companyId") long companyId, @Param("expirationTime") long expirationTime);

  @Path("/restore-file-entry-from-trash")
  Call<Response> restoreFileEntryFromTrash(@Param("fileEntryId") long fileEntryId);

  @Path("/restore-file-shortcut-from-trash")
  Call<Response> restoreFileShortcutFromTrash(@Param("fileShortcutId") long fileShortcutId);

  @Path("/restore-folder-from-trash")
  Call<Response> restoreFolderFromTrash(@Param("folderId") long folderId);

  @Path("/revert-file-entry")
  Call<Response> revertFileEntry(@Param("fileEntryId") long fileEntryId, @Param("version") String version, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/search")
  Call<JSONObject> search(@Param("repositoryId") long repositoryId, @JsonObject(name = "searchContext", className = "com.liferay.portal.kernel.search.SearchContext") JSONObject searchContext);

  @Path("/search")
  Call<JSONObject> search(@Param("repositoryId") long repositoryId, @JsonObject(name = "searchContext", className = "com.liferay.portal.kernel.search.SearchContext") JSONObject searchContext, @JsonObject(name = "query", className = "com.liferay.portal.kernel.search.Query") JSONObject query);

  @Path("/search")
  Call<JSONObject> search(@Param("repositoryId") long repositoryId, @Param("creatorUserId") long creatorUserId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/search")
  Call<JSONObject> search(@Param("repositoryId") long repositoryId, @Param("creatorUserId") long creatorUserId, @Param("folderId") long folderId, @Param("mimeTypes") JSONArray mimeTypes, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/subscribe-file-entry-type")
  Call<Response> subscribeFileEntryType(@Param("groupId") long groupId, @Param("fileEntryTypeId") long fileEntryTypeId);

  @Path("/subscribe-folder")
  Call<Response> subscribeFolder(@Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/unlock-file-entry")
  Call<Response> unlockFileEntry(@Param("fileEntryId") long fileEntryId);

  @Path("/unlock-file-entry")
  Call<Response> unlockFileEntry(@Param("fileEntryId") long fileEntryId, @Param("lockUuid") String lockUuid);

  @Path("/unlock-folder")
  Call<Response> unlockFolder(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("lockUuid") String lockUuid);

  @Path("/unlock-folder")
  Call<Response> unlockFolder(@Param("repositoryId") long repositoryId, @Param("parentFolderId") long parentFolderId, @Param("name") String name, @Param("lockUuid") String lockUuid);

  @Path("/unsubscribe-file-entry-type")
  Call<Response> unsubscribeFileEntryType(@Param("groupId") long groupId, @Param("fileEntryTypeId") long fileEntryTypeId);

  @Path("/unsubscribe-folder")
  Call<Response> unsubscribeFolder(@Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/update-file-entry")
  Call<JSONObject> updateFileEntry(@Param("fileEntryId") long fileEntryId, @Param("sourceFileName") String sourceFileName, @Param("mimeType") String mimeType, @Param("title") String title, @Param("description") String description, @Param("changeLog") String changeLog, @Param("majorVersion") boolean majorVersion, @Param("bytes") byte[] bytes, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/update-file-entry",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<JSONObject> updateFileEntry(@Param("fileEntryId") long fileEntryId, @Param("sourceFileName") String sourceFileName, @Param("mimeType") String mimeType, @Param("title") String title, @Param("description") String description, @Param("changeLog") String changeLog, @Param("majorVersion") boolean majorVersion, @Param("file") UploadData file, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/update-file-entry-and-check-in",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<JSONObject> updateFileEntryAndCheckIn(@Param("fileEntryId") long fileEntryId, @Param("sourceFileName") String sourceFileName, @Param("mimeType") String mimeType, @Param("title") String title, @Param("description") String description, @Param("changeLog") String changeLog, @Param("majorVersion") boolean majorVersion, @Param("file") UploadData file, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-file-shortcut")
  Call<JSONObject> updateFileShortcut(@Param("fileShortcutId") long fileShortcutId, @Param("folderId") long folderId, @Param("toFileEntryId") long toFileEntryId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-folder")
  Call<JSONObject> updateFolder(@Param("folderId") long folderId, @Param("name") String name, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/verify-file-entry-check-out")
  Call<Boolean> verifyFileEntryCheckOut(@Param("repositoryId") long repositoryId, @Param("fileEntryId") long fileEntryId, @Param("lockUuid") String lockUuid);

  @Path("/verify-file-entry-lock")
  Call<Boolean> verifyFileEntryLock(@Param("repositoryId") long repositoryId, @Param("fileEntryId") long fileEntryId, @Param("lockUuid") String lockUuid);

  @Path("/verify-inheritable-lock")
  Call<Boolean> verifyInheritableLock(@Param("repositoryId") long repositoryId, @Param("folderId") long folderId, @Param("lockUuid") String lockUuid);
}
