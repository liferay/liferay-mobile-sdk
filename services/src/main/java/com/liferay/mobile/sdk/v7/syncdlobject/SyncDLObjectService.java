package com.liferay.mobile.sdk.v7.syncdlobject;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Path;
import org.json.JSONObject;

@Path("/sync-web.syncdlobject")
public interface SyncDLObjectService {
  @Path("/get-sync-context")
  Call<JSONObject> getSyncContext();
}
