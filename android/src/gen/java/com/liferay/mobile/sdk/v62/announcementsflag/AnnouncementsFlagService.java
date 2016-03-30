package com.liferay.mobile.sdk.v62.announcementsflag;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONObject;

@Path("/announcementsflag")
public interface AnnouncementsFlagService {
  @Path("/add-flag")
  Call<Response> addFlag(@Param("entryId") long entryId, @Param("value") int value);

  @Path("/delete-flag")
  Call<Response> deleteFlag(@Param("flagId") long flagId);

  @Path("/get-flag")
  Call<JSONObject> getFlag(@Param("entryId") long entryId, @Param("value") int value);
}
