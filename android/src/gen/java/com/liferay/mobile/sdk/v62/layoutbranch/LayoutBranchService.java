package com.liferay.mobile.sdk.v62.layoutbranch;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/layoutbranch")
public interface LayoutBranchService {
  @Path("/add-layout-branch")
  Call<JSONObject> addLayoutBranch(@Param(name = "layoutRevisionId") long layoutRevisionId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "master") boolean master, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-layout-branch")
  Call<Response> deleteLayoutBranch(@Param(name = "layoutBranchId") long layoutBranchId);

  @Path("/update-layout-branch")
  Call<JSONObject> updateLayoutBranch(@Param(name = "layoutBranchId") long layoutBranchId, @Param(name = "name") String name, @Param(name = "description") String description, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
