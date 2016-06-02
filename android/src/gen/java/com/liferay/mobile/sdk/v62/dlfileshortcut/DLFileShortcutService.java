package com.liferay.mobile.sdk.v62.dlfileshortcut;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONObject;

@Path("/dlfileshortcut")
public interface DLFileShortcutService {
  @Path("/add-file-shortcut")
  Call<JSONObject> addFileShortcut(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "toFileEntryId") long toFileEntryId, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-file-shortcut")
  Call<Response> deleteFileShortcut(@Param(name = "fileShortcutId") long fileShortcutId);

  @Path("/get-file-shortcut")
  Call<JSONObject> getFileShortcut(@Param(name = "fileShortcutId") long fileShortcutId);

  @Path("/update-file-shortcut")
  Call<JSONObject> updateFileShortcut(@Param(name = "fileShortcutId") long fileShortcutId, @Param(name = "folderId") long folderId, @Param(name = "toFileEntryId") long toFileEntryId, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
