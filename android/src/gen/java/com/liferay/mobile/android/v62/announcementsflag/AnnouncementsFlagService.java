package com.liferay.mobile.android.v62.announcementsflag;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
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
