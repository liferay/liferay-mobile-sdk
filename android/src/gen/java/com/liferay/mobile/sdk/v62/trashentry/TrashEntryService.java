package com.liferay.mobile.sdk.v62.trashentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/trashentry")
public interface TrashEntryService {
  @Path("/delete-entries")
  Call<Response> deleteEntries(@Param("entryIds") JSONArray entryIds);

  @Path("/delete-entries")
  Call<Response> deleteEntries(@Param("groupId") long groupId);

  @Path("/delete-entry")
  Call<Response> deleteEntry(@Param("entryId") long entryId);

  @Path("/delete-entry")
  Call<Response> deleteEntry(@Param("className") String className, @Param("classPK") long classPK);

  @Path("/get-entries")
  Call<JSONObject> getEntries(@Param("groupId") long groupId);

  @Path("/get-entries")
  Call<JSONObject> getEntries(@Param("groupId") long groupId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/move-entry")
  Call<Response> moveEntry(@Param("className") String className, @Param("classPK") long classPK, @Param("destinationContainerModelId") long destinationContainerModelId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/restore-entry")
  Call<JSONObject> restoreEntry(@Param("entryId") long entryId);

  @Path("/restore-entry")
  Call<JSONObject> restoreEntry(@Param("entryId") long entryId, @Param("overrideClassPK") long overrideClassPK, @Param("name") String name);
}
