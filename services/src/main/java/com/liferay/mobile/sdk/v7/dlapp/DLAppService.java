package com.liferay.mobile.sdk.v7.dlapp;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.file.UploadData;
import com.liferay.mobile.sdk.http.ContentType;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/dlapp")
public interface DLAppService {
  @Path("/add-file-entry")
  Call<JSONObject> addFileEntry(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "sourceFileName") String sourceFileName, @Param(name = "mimeType") String mimeType, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "changeLog") String changeLog, @Param(name = "bytes") byte[] bytes, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/add-file-entry",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> addFileEntry(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "sourceFileName") String sourceFileName, @Param(name = "mimeType") String mimeType, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "changeLog") String changeLog, @Param(name = "file") UploadData file, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-file-shortcut")
  Call<JSONObject> addFileShortcut(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "toFileEntryId") long toFileEntryId, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-folder")
  Call<JSONObject> addFolder(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/add-temp-file-entry",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> addTempFileEntry(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "folderName") String folderName, @Param(name = "fileName") String fileName, @Param(name = "file") UploadData file, @Param(name = "mimeType") String mimeType);

  @Path("/cancel-check-out")
  Call<Response> cancelCheckOut(@Param(name = "fileEntryId") long fileEntryId);

  @Path("/check-in-file-entry")
  Call<Response> checkInFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "lockUuid") String lockUuid, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-in-file-entry")
  Call<Response> checkInFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "majorVersion") boolean majorVersion, @Param(name = "changeLog") String changeLog, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-out-file-entry")
  Call<Response> checkOutFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-out-file-entry")
  Call<JSONObject> checkOutFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "owner") String owner, @Param(name = "expirationTime") long expirationTime, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-folder")
  Call<JSONObject> copyFolder(@Param(name = "repositoryId") long repositoryId, @Param(name = "sourceFolderId") long sourceFolderId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-file-entry")
  Call<Response> deleteFileEntry(@Param(name = "fileEntryId") long fileEntryId);

  @Path("/delete-file-entry-by-title")
  Call<Response> deleteFileEntryByTitle(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "title") String title);

  @Path("/delete-file-shortcut")
  Call<Response> deleteFileShortcut(@Param(name = "fileShortcutId") long fileShortcutId);

  @Path("/delete-file-version")
  Call<Response> deleteFileVersion(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "version") String version);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param(name = "folderId") long folderId);

  @Path("/delete-folder")
  Call<Response> deleteFolder(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name);

  @Path("/delete-temp-file-entry")
  Call<Response> deleteTempFileEntry(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "folderName") String folderName, @Param(name = "fileName") String fileName);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "fileEntryTypeId") long fileEntryTypeId);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "mimeTypes") JSONArray mimeTypes);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "fileEntryTypeId") long fileEntryTypeId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "fileEntryTypeId") long fileEntryTypeId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-file-entries-and-file-shortcuts")
  Call<JSONArray> getFileEntriesAndFileShortcuts(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-file-entries-and-file-shortcuts-count")
  Call<Integer> getFileEntriesAndFileShortcutsCount(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "status") int status);

  @Path("/get-file-entries-and-file-shortcuts-count")
  Call<Integer> getFileEntriesAndFileShortcutsCount(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "mimeTypes") JSONArray mimeTypes);

  @Path("/get-file-entries-count")
  Call<Integer> getFileEntriesCount(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId);

  @Path("/get-file-entries-count")
  Call<Integer> getFileEntriesCount(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "fileEntryTypeId") long fileEntryTypeId);

  @Path("/get-file-entries-count")
  Call<Integer> getFileEntriesCount(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "mimeTypes") JSONArray mimeTypes);

  @Path("/get-file-entry")
  Call<JSONObject> getFileEntry(@Param(name = "fileEntryId") long fileEntryId);

  @Path("/get-file-entry")
  Call<JSONObject> getFileEntry(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "title") String title);

  @Path("/get-file-entry-by-uuid-and-group-id")
  Call<JSONObject> getFileEntryByUuidAndGroupId(@Param(name = "uuid") String uuid, @Param(name = "groupId") long groupId);

  @Path("/get-file-shortcut")
  Call<JSONObject> getFileShortcut(@Param(name = "fileShortcutId") long fileShortcutId);

  @Path("/get-file-version")
  Call<JSONObject> getFileVersion(@Param(name = "fileVersionId") long fileVersionId);

  @Path("/get-folder")
  Call<JSONObject> getFolder(@Param(name = "folderId") long folderId);

  @Path("/get-folder")
  Call<JSONObject> getFolder(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "includeMountFolders") boolean includeMountFolders, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "includeMountFolders") boolean includeMountFolders, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders")
  Call<JSONArray> getFolders(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "status") int status, @Param(name = "includeMountFolders") boolean includeMountFolders, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-file-entries-and-file-shortcuts")
  Call<JSONArray> getFoldersAndFileEntriesAndFileShortcuts(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "includeMountFolders") boolean includeMountFolders, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-folders-and-file-entries-and-file-shortcuts")
  Call<JSONArray> getFoldersAndFileEntriesAndFileShortcuts(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "includeMountFolders") boolean includeMountFolders, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-file-entries-and-file-shortcuts")
  Call<JSONArray> getFoldersAndFileEntriesAndFileShortcuts(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "includeMountFolders") boolean includeMountFolders, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-folders-and-file-entries-and-file-shortcuts-count")
  Call<Integer> getFoldersAndFileEntriesAndFileShortcutsCount(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders-and-file-entries-and-file-shortcuts-count")
  Call<Integer> getFoldersAndFileEntriesAndFileShortcutsCount(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders-count")
  Call<Integer> getFoldersCount(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "status") int status, @Param(name = "includeMountFolders") boolean includeMountFolders);

  @Path("/get-folders-file-entries-count")
  Call<Integer> getFoldersFileEntriesCount(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderIds") JSONArray folderIds, @Param(name = "status") int status);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-file-entries-count")
  Call<Integer> getGroupFileEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId);

  @Path("/get-group-file-entries-count")
  Call<Integer> getGroupFileEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId);

  @Path("/get-group-file-entries-count")
  Call<Integer> getGroupFileEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "status") int status);

  @Path("/get-mount-folders")
  Call<JSONArray> getMountFolders(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId);

  @Path("/get-mount-folders")
  Call<JSONArray> getMountFolders(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-mount-folders")
  Call<JSONArray> getMountFolders(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-mount-folders-count")
  Call<Integer> getMountFoldersCount(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId);

  @Path("/get-subfolder-ids")
  Call<JSONArray> getSubfolderIds(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId);

  @Path("/get-subfolder-ids")
  Call<JSONArray> getSubfolderIds(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "recurse") boolean recurse);

  @Path("/get-subfolder-ids")
  Call<Response> getSubfolderIds(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderIds") JSONArray folderIds, @Param(name = "folderId") long folderId);

  @Path("/get-temp-file-names")
  Call<JSONArray> getTempFileNames(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "folderName") String folderName);

  @Path("/lock-folder")
  Call<JSONObject> lockFolder(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId);

  @Path("/lock-folder")
  Call<JSONObject> lockFolder(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "owner") String owner, @Param(name = "inheritable") boolean inheritable, @Param(name = "expirationTime") long expirationTime);

  @Path("/move-file-entry")
  Call<JSONObject> moveFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "newFolderId") long newFolderId, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-folder")
  Call<JSONObject> moveFolder(@Param(name = "folderId") long folderId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/refresh-file-entry-lock")
  Call<JSONObject> refreshFileEntryLock(@Param(name = "lockUuid") String lockUuid, @Param(name = "companyId") long companyId, @Param(name = "expirationTime") long expirationTime);

  @Path("/refresh-folder-lock")
  Call<JSONObject> refreshFolderLock(@Param(name = "lockUuid") String lockUuid, @Param(name = "companyId") long companyId, @Param(name = "expirationTime") long expirationTime);

  @Path("/revert-file-entry")
  Call<Response> revertFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "version") String version, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/search")
  Call<JSONObject> search(@Param(name = "repositoryId") long repositoryId, @Param(name = "searchContext", className = "com.liferay.portal.kernel.search.SearchContext") JSONObject searchContext);

  @Path("/search")
  Call<JSONObject> search(@Param(name = "repositoryId") long repositoryId, @Param(name = "searchContext", className = "com.liferay.portal.kernel.search.SearchContext") JSONObject searchContext, @Param(name = "query", className = "com.liferay.portal.kernel.search.Query") JSONObject query);

  @Path("/search")
  Call<JSONObject> search(@Param(name = "repositoryId") long repositoryId, @Param(name = "creatorUserId") long creatorUserId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/search")
  Call<JSONObject> search(@Param(name = "repositoryId") long repositoryId, @Param(name = "creatorUserId") long creatorUserId, @Param(name = "folderId") long folderId, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/subscribe-file-entry-type")
  Call<Response> subscribeFileEntryType(@Param(name = "groupId") long groupId, @Param(name = "fileEntryTypeId") long fileEntryTypeId);

  @Path("/subscribe-folder")
  Call<Response> subscribeFolder(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId);

  @Path("/unlock-folder")
  Call<Response> unlockFolder(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "lockUuid") String lockUuid);

  @Path("/unlock-folder")
  Call<Response> unlockFolder(@Param(name = "repositoryId") long repositoryId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name, @Param(name = "lockUuid") String lockUuid);

  @Path("/unsubscribe-file-entry-type")
  Call<Response> unsubscribeFileEntryType(@Param(name = "groupId") long groupId, @Param(name = "fileEntryTypeId") long fileEntryTypeId);

  @Path("/unsubscribe-folder")
  Call<Response> unsubscribeFolder(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId);

  @Path("/update-file-entry")
  Call<JSONObject> updateFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "sourceFileName") String sourceFileName, @Param(name = "mimeType") String mimeType, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "changeLog") String changeLog, @Param(name = "majorVersion") boolean majorVersion, @Param(name = "bytes") byte[] bytes, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/update-file-entry",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> updateFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "sourceFileName") String sourceFileName, @Param(name = "mimeType") String mimeType, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "changeLog") String changeLog, @Param(name = "majorVersion") boolean majorVersion, @Param(name = "file") UploadData file, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/update-file-entry-and-check-in",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> updateFileEntryAndCheckIn(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "sourceFileName") String sourceFileName, @Param(name = "mimeType") String mimeType, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "changeLog") String changeLog, @Param(name = "majorVersion") boolean majorVersion, @Param(name = "file") UploadData file, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-file-shortcut")
  Call<JSONObject> updateFileShortcut(@Param(name = "fileShortcutId") long fileShortcutId, @Param(name = "folderId") long folderId, @Param(name = "toFileEntryId") long toFileEntryId, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-folder")
  Call<JSONObject> updateFolder(@Param(name = "folderId") long folderId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/verify-file-entry-check-out")
  Call<Boolean> verifyFileEntryCheckOut(@Param(name = "repositoryId") long repositoryId, @Param(name = "fileEntryId") long fileEntryId, @Param(name = "lockUuid") String lockUuid);

  @Path("/verify-file-entry-lock")
  Call<Boolean> verifyFileEntryLock(@Param(name = "repositoryId") long repositoryId, @Param(name = "fileEntryId") long fileEntryId, @Param(name = "lockUuid") String lockUuid);

  @Path("/verify-inheritable-lock")
  Call<Boolean> verifyInheritableLock(@Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "lockUuid") String lockUuid);
}
