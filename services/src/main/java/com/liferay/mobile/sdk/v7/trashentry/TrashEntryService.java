package com.liferay.mobile.sdk.v7.trashentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/trashentry")
public interface TrashEntryService {
  @Path("/delete-entries")
  Call<Response> deleteEntries(@Param(name = "groupId") long groupId);

  @Path("/delete-entries")
  Call<Response> deleteEntries(@Param(name = "entryIds") JSONArray entryIds);

  @Path("/delete-entry")
  Call<Response> deleteEntry(@Param(name = "entryId") long entryId);

  @Path("/delete-entry")
  Call<Response> deleteEntry(@Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/get-entries")
  Call<JSONObject> getEntries(@Param(name = "groupId") long groupId);

  @Path("/get-entries")
  Call<JSONArray> getEntries(@Param(name = "groupId") long groupId, @Param(name = "className") String className);

  @Path("/get-entries")
  Call<JSONObject> getEntries(@Param(name = "groupId") long groupId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/move-entry")
  Call<Response> moveEntry(@Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "destinationContainerModelId") long destinationContainerModelId, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/restore-entry")
  Call<JSONObject> restoreEntry(@Param(name = "entryId") long entryId);

  @Path("/restore-entry")
  Call<JSONObject> restoreEntry(@Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/restore-entry")
  Call<JSONObject> restoreEntry(@Param(name = "entryId") long entryId, @Param(name = "overrideClassPK") long overrideClassPK, @Param(name = "name") String name);

  @Path("/restore-entry")
  Call<JSONObject> restoreEntry(@Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "overrideClassPK") long overrideClassPK, @Param(name = "name") String name);
}
