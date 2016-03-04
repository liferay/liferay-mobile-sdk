package com.liferay.mobile.android.v62.permission;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;

@Path("/permission")
public interface PermissionService {
  @Path("/check-permission")
  Call<Response> checkPermission(@Param("groupId") long groupId, @Param("name") String name, @Param("primKey") String primKey);
}
