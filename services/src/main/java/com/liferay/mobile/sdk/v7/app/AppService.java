package com.liferay.mobile.sdk.v7.app;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONObject;

@Path("/marketplace.app")
public interface AppService {
  @Path("/delete-app")
  Call<JSONObject> deleteApp(@Param(name = "appId") long appId);

  @Path("/install-app")
  Call<Response> installApp(@Param(name = "remoteAppId") long remoteAppId);

  @Path("/uninstall-app")
  Call<Response> uninstallApp(@Param(name = "remoteAppId") long remoteAppId);

  @Path("/update-app")
  Call<JSONObject> updateApp(@Param(name = "file", className = "") JSONObject file);
}
