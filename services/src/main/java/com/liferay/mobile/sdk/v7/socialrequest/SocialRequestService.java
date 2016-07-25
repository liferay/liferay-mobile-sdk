package com.liferay.mobile.sdk.v7.socialrequest;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import org.json.JSONObject;

@Path("/socialrequest")
public interface SocialRequestService {
  @Path("/update-request")
  Call<JSONObject> updateRequest(@Param(name = "requestId") long requestId, @Param(name = "status") int status, @Param(name = "themeDisplay", className = "") JSONObject themeDisplay);
}
