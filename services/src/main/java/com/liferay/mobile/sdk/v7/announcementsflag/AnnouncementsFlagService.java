package com.liferay.mobile.sdk.v7.announcementsflag;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONObject;

@Path("/announcementsflag")
public interface AnnouncementsFlagService {
  @Path("/add-flag")
  Call<Response> addFlag(@Param(name = "entryId") long entryId, @Param(name = "value") int value);

  @Path("/delete-flag")
  Call<Response> deleteFlag(@Param(name = "flagId") long flagId);

  @Path("/get-flag")
  Call<JSONObject> getFlag(@Param(name = "entryId") long entryId, @Param(name = "value") int value);
}
