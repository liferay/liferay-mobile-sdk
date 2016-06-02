package com.liferay.mobile.sdk.v62.dlfileentry;

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

@Path("/dlfileentry")
public interface DLFileEntryService {
  @Path("/cancel-check-out")
  Call<JSONObject> cancelCheckOut(@Param(name = "fileEntryId") long fileEntryId);

  @Path("/check-in-file-entry")
  Call<Response> checkInFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "lockUuid") String lockUuid);

  @Path("/check-in-file-entry")
  Call<Response> checkInFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "lockUuid") String lockUuid, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-in-file-entry")
  Call<Response> checkInFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "major") boolean major, @Param(name = "changeLog") String changeLog, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-out-file-entry")
  Call<JSONObject> checkOutFileEntry(@Param(name = "fileEntryId") long fileEntryId);

  @Path("/check-out-file-entry")
  Call<JSONObject> checkOutFileEntry(@Param(name = "fileEntryId") long fileEntryId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-out-file-entry")
  Call<JSONObject> checkOutFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "owner") String owner, @Param(name = "expirationTime") long expirationTime);

  @Path("/check-out-file-entry")
  Call<JSONObject> checkOutFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "owner") String owner, @Param(name = "expirationTime") long expirationTime, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-file-entry")
  Call<JSONObject> copyFileEntry(@Param(name = "groupId") long groupId, @Param(name = "repositoryId") long repositoryId, @Param(name = "fileEntryId") long fileEntryId, @Param(name = "destFolderId") long destFolderId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-file-entry")
  Call<Response> deleteFileEntry(@Param(name = "fileEntryId") long fileEntryId);

  @Path("/delete-file-entry")
  Call<Response> deleteFileEntry(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "title") String title);

  @Path("/delete-file-version")
  Call<Response> deleteFileVersion(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "version") String version);

  @Path("/fetch-file-entry-by-image-id")
  Call<JSONObject> fetchFileEntryByImageId(@Param(name = "imageId") long imageId);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "fileEntryTypeId") long fileEntryTypeId, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-file-entries-count")
  Call<Integer> getFileEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId);

  @Path("/get-file-entries-count")
  Call<Integer> getFileEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "fileEntryTypeId") long fileEntryTypeId);

  @Path("/get-file-entries-count")
  Call<Integer> getFileEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "mimeTypes") JSONArray mimeTypes);

  @Path("/get-file-entries-count")
  Call<Integer> getFileEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "status") int status);

  @Path("/get-file-entry")
  Call<JSONObject> getFileEntry(@Param(name = "fileEntryId") long fileEntryId);

  @Path("/get-file-entry")
  Call<JSONObject> getFileEntry(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "title") String title);

  @Path("/get-file-entry-by-uuid-and-group-id")
  Call<JSONObject> getFileEntryByUuidAndGroupId(@Param(name = "uuid") String uuid, @Param(name = "groupId") long groupId);

  @Path("/get-file-entry-lock")
  Call<JSONObject> getFileEntryLock(@Param(name = "fileEntryId") long fileEntryId);

  @Path("/get-folders-file-entries-count")
  Call<Integer> getFoldersFileEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "folderIds") JSONArray folderIds, @Param(name = "status") int status);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-file-entries-count")
  Call<Integer> getGroupFileEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId);

  @Path("/get-group-file-entries-count")
  Call<Integer> getGroupFileEntriesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "status") int status);

  @Path("/has-file-entry-lock")
  Call<Boolean> hasFileEntryLock(@Param(name = "fileEntryId") long fileEntryId);

  @Path("/is-file-entry-checked-out")
  Call<Boolean> isFileEntryCheckedOut(@Param(name = "fileEntryId") long fileEntryId);

  @Path("/move-file-entry")
  Call<JSONObject> moveFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "newFolderId") long newFolderId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/refresh-file-entry-lock")
  Call<JSONObject> refreshFileEntryLock(@Param(name = "lockUuid") String lockUuid, @Param(name = "companyId") long companyId, @Param(name = "expirationTime") long expirationTime);

  @Path("/revert-file-entry")
  Call<Response> revertFileEntry(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "version") String version, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/search")
  Call<JSONObject> search(@Param(name = "groupId") long groupId, @Param(name = "creatorUserId") long creatorUserId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/search")
  Call<JSONObject> search(@Param(name = "groupId") long groupId, @Param(name = "creatorUserId") long creatorUserId, @Param(name = "folderId") long folderId, @Param(name = "mimeTypes") JSONArray mimeTypes, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/verify-file-entry-check-out")
  Call<Boolean> verifyFileEntryCheckOut(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "lockUuid") String lockUuid);

  @Path("/verify-file-entry-lock")
  Call<Boolean> verifyFileEntryLock(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "lockUuid") String lockUuid);
}
