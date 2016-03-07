package com.liferay.mobile.android.v62.dlfileshortcut;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import org.json.JSONObject;

@Path("/dlfileshortcut")
public interface DLFileShortcutService {
  @Path("/add-file-shortcut")
  Call<JSONObject> addFileShortcut(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("toFileEntryId") long toFileEntryId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-file-shortcut")
  Call<Response> deleteFileShortcut(@Param("fileShortcutId") long fileShortcutId);

  @Path("/get-file-shortcut")
  Call<JSONObject> getFileShortcut(@Param("fileShortcutId") long fileShortcutId);

  @Path("/update-file-shortcut")
  Call<JSONObject> updateFileShortcut(@Param("fileShortcutId") long fileShortcutId, @Param("folderId") long folderId, @Param("toFileEntryId") long toFileEntryId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
