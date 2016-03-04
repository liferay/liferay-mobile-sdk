package com.liferay.mobile.android.v62.mbban;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import org.json.JSONObject;

@Path("/mbban")
public interface MBBanService {
  @Path("/add-ban")
  Call<JSONObject> addBan(@Param("banUserId") long banUserId, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-ban")
  Call<Response> deleteBan(@Param("banUserId") long banUserId, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
