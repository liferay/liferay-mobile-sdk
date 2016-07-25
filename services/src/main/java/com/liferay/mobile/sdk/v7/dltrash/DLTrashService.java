package com.liferay.mobile.sdk.v7.dltrash;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONObject;

@Path("/dltrash")
public interface DLTrashService {
  @Path("/move-file-entry-from-trash")
  Call<JSONObject> moveFileEntryFromTrash(@Param(name = "fileEntryId") long fileEntryId, @Param(name = "newFolderId") long newFolderId, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-file-entry-to-trash")
  Call<JSONObject> moveFileEntryToTrash(@Param(name = "fileEntryId") long fileEntryId);

  @Path("/move-file-shortcut-from-trash")
  Call<JSONObject> moveFileShortcutFromTrash(@Param(name = "fileShortcutId") long fileShortcutId, @Param(name = "newFolderId") long newFolderId, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-file-shortcut-to-trash")
  Call<JSONObject> moveFileShortcutToTrash(@Param(name = "fileShortcutId") long fileShortcutId);

  @Path("/move-folder-from-trash")
  Call<JSONObject> moveFolderFromTrash(@Param(name = "folderId") long folderId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-folder-to-trash")
  Call<JSONObject> moveFolderToTrash(@Param(name = "folderId") long folderId);

  @Path("/restore-file-entry-from-trash")
  Call<Response> restoreFileEntryFromTrash(@Param(name = "fileEntryId") long fileEntryId);

  @Path("/restore-file-shortcut-from-trash")
  Call<Response> restoreFileShortcutFromTrash(@Param(name = "fileShortcutId") long fileShortcutId);

  @Path("/restore-folder-from-trash")
  Call<Response> restoreFolderFromTrash(@Param(name = "folderId") long folderId);
}
