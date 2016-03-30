package com.liferay.mobile.sdk.v62.permission;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;

@Path("/permission")
public interface PermissionService {
  @Path("/check-permission")
  Call<Response> checkPermission(@Param("groupId") long groupId, @Param("name") String name, @Param("primKey") String primKey);
}
