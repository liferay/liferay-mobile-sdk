package com.liferay.mobile.sdk.v7.syncdlobject;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Path;
import java.util.Map;

@Path("/sync-web.syncdlobject")
public interface SyncDLObjectService {
  @Path("/get-sync-context")
  Call<Map> getSyncContext();
}
