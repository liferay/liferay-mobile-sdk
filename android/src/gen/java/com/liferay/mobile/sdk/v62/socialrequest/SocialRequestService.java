package com.liferay.mobile.sdk.v62.socialrequest;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.JsonObject;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import org.json.JSONObject;

@Path("/socialrequest")
public interface SocialRequestService {
  @Path("/update-request")
  Call<JSONObject> updateRequest(@Param("requestId") long requestId, @Param("status") int status, @JsonObject(name = "themeDisplay", className = "com.liferay.portal.theme.ThemeDisplay") JSONObject themeDisplay);
}
