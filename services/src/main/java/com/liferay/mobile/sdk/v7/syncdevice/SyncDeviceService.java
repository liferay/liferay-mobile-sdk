package com.liferay.mobile.sdk.v7.syncdevice;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/sync.syncdevice")
public interface SyncDeviceService {
  @Path("/register-sync-device")
  Call<JSONObject> registerSyncDevice(@Param(name = "type") String type, @Param(name = "buildNumber") int buildNumber, @Param(name = "featureSet") int featureSet, @Param(name = "uuid") String uuid);

  @Path("/unregister-sync-device")
  Call<Response> unregisterSyncDevice(@Param(name = "uuid") String uuid);
}
