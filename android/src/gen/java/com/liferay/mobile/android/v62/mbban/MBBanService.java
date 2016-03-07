package com.liferay.mobile.android.v62.mbban;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import org.json.JSONObject;

@Path("/mbban")
public interface MBBanService {
  @Path("/add-ban")
  Call<JSONObject> addBan(@Param("banUserId") long banUserId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-ban")
  Call<Response> deleteBan(@Param("banUserId") long banUserId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
