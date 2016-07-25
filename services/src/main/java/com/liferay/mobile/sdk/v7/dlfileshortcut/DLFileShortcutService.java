package com.liferay.mobile.sdk.v7.dlfileshortcut;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONObject;

@Path("/dlfileshortcut")
public interface DLFileShortcutService {
  @Path("/add-file-shortcut")
  Call<JSONObject> addFileShortcut(@Param(name = "groupId") long groupId, @Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "toFileEntryId") long toFileEntryId, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-file-shortcut")
  Call<Response> deleteFileShortcut(@Param(name = "fileShortcutId") long fileShortcutId);

  @Path("/get-file-shortcut")
  Call<JSONObject> getFileShortcut(@Param(name = "fileShortcutId") long fileShortcutId);

  @Path("/update-file-shortcut")
  Call<JSONObject> updateFileShortcut(@Param(name = "fileShortcutId") long fileShortcutId, @Param(name = "repositoryId") long repositoryId, @Param(name = "folderId") long folderId, @Param(name = "toFileEntryId") long toFileEntryId, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-file-shortcuts")
  Call<Response> updateFileShortcuts(@Param(name = "oldToFileEntryId") long oldToFileEntryId, @Param(name = "newToFileEntryId") long newToFileEntryId);
}
