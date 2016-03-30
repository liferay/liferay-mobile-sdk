package com.liferay.mobile.sdk.v62.dlfileentry;

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/dlfileentry")
public interface DLFileEntryService {
  @Path("/cancel-check-out")
  Call<JSONObject> cancelCheckOut(@Param("fileEntryId") long fileEntryId);

  @Path("/check-in-file-entry")
  Call<Response> checkInFileEntry(@Param("fileEntryId") long fileEntryId, @Param("lockUuid") String lockUuid);

  @Path("/check-in-file-entry")
  Call<Response> checkInFileEntry(@Param("fileEntryId") long fileEntryId, @Param("lockUuid") String lockUuid, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-in-file-entry")
  Call<Response> checkInFileEntry(@Param("fileEntryId") long fileEntryId, @Param("major") boolean major, @Param("changeLog") String changeLog, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-out-file-entry")
  Call<JSONObject> checkOutFileEntry(@Param("fileEntryId") long fileEntryId);

  @Path("/check-out-file-entry")
  Call<JSONObject> checkOutFileEntry(@Param("fileEntryId") long fileEntryId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-out-file-entry")
  Call<JSONObject> checkOutFileEntry(@Param("fileEntryId") long fileEntryId, @Param("owner") String owner, @Param("expirationTime") long expirationTime);

  @Path("/check-out-file-entry")
  Call<JSONObject> checkOutFileEntry(@Param("fileEntryId") long fileEntryId, @Param("owner") String owner, @Param("expirationTime") long expirationTime, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-file-entry")
  Call<JSONObject> copyFileEntry(@Param("groupId") long groupId, @Param("repositoryId") long repositoryId, @Param("fileEntryId") long fileEntryId, @Param("destFolderId") long destFolderId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-file-entry")
  Call<Response> deleteFileEntry(@Param("fileEntryId") long fileEntryId);

  @Path("/delete-file-entry")
  Call<Response> deleteFileEntry(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("title") String title);

  @Path("/delete-file-version")
  Call<Response> deleteFileVersion(@Param("fileEntryId") long fileEntryId, @Param("version") String version);

  @Path("/fetch-file-entry-by-image-id")
  Call<JSONObject> fetchFileEntryByImageId(@Param("imageId") long imageId);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("fileEntryTypeId") long fileEntryTypeId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("mimeTypes") JSONArray mimeTypes, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-file-entries")
  Call<JSONArray> getFileEntries(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-file-entries-count")
  Call<Integer> getFileEntriesCount(@Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/get-file-entries-count")
  Call<Integer> getFileEntriesCount(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("fileEntryTypeId") long fileEntryTypeId);

  @Path("/get-file-entries-count")
  Call<Integer> getFileEntriesCount(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("mimeTypes") JSONArray mimeTypes);

  @Path("/get-file-entries-count")
  Call<Integer> getFileEntriesCount(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status);

  @Path("/get-file-entry")
  Call<JSONObject> getFileEntry(@Param("fileEntryId") long fileEntryId);

  @Path("/get-file-entry")
  Call<JSONObject> getFileEntry(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("title") String title);

  @Path("/get-file-entry-by-uuid-and-group-id")
  Call<JSONObject> getFileEntryByUuidAndGroupId(@Param("uuid") String uuid, @Param("groupId") long groupId);

  @Path("/get-file-entry-lock")
  Call<JSONObject> getFileEntryLock(@Param("fileEntryId") long fileEntryId);

  @Path("/get-folders-file-entries-count")
  Call<Integer> getFoldersFileEntriesCount(@Param("groupId") long groupId, @Param("folderIds") JSONArray folderIds, @Param("status") int status);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-file-entries")
  Call<JSONArray> getGroupFileEntries(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId, @Param("mimeTypes") JSONArray mimeTypes, @Param("status") int status, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-file-entries-count")
  Call<Integer> getGroupFileEntriesCount(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId);

  @Path("/get-group-file-entries-count")
  Call<Integer> getGroupFileEntriesCount(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId, @Param("mimeTypes") JSONArray mimeTypes, @Param("status") int status);

  @Path("/has-file-entry-lock")
  Call<Boolean> hasFileEntryLock(@Param("fileEntryId") long fileEntryId);

  @Path("/is-file-entry-checked-out")
  Call<Boolean> isFileEntryCheckedOut(@Param("fileEntryId") long fileEntryId);

  @Path("/move-file-entry")
  Call<JSONObject> moveFileEntry(@Param("fileEntryId") long fileEntryId, @Param("newFolderId") long newFolderId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/refresh-file-entry-lock")
  Call<JSONObject> refreshFileEntryLock(@Param("lockUuid") String lockUuid, @Param("companyId") long companyId, @Param("expirationTime") long expirationTime);

  @Path("/revert-file-entry")
  Call<Response> revertFileEntry(@Param("fileEntryId") long fileEntryId, @Param("version") String version, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/search")
  Call<JSONObject> search(@Param("groupId") long groupId, @Param("creatorUserId") long creatorUserId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/search")
  Call<JSONObject> search(@Param("groupId") long groupId, @Param("creatorUserId") long creatorUserId, @Param("folderId") long folderId, @Param("mimeTypes") JSONArray mimeTypes, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/verify-file-entry-check-out")
  Call<Boolean> verifyFileEntryCheckOut(@Param("fileEntryId") long fileEntryId, @Param("lockUuid") String lockUuid);

  @Path("/verify-file-entry-lock")
  Call<Boolean> verifyFileEntryLock(@Param("fileEntryId") long fileEntryId, @Param("lockUuid") String lockUuid);
}
