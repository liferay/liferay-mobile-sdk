package com.liferay.mobile.sdk.v62.socialrequest;

import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import org.json.JSONObject;

@Path("/socialrequest")
public interface SocialRequestService {
  @Path("/update-request")
  Call<JSONObject> updateRequest(@Param("requestId") long requestId, @Param("status") int status, @JsonObject(name = "themeDisplay", className = "com.liferay.portal.theme.ThemeDisplay") JSONObject themeDisplay);
}
