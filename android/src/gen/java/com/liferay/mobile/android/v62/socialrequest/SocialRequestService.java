package com.liferay.mobile.android.v62.socialrequest;

import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import org.json.JSONObject;

@Path("/socialrequest")
public interface SocialRequestService {
  @Path("/update-request")
  Call<JSONObject> updateRequest(@Param("requestId") long requestId, @Param("status") int status, @Param("themeDisplay") JSONObjectWrapper themeDisplay);
}
