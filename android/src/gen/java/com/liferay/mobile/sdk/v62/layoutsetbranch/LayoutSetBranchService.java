package com.liferay.mobile.sdk.v62.layoutsetbranch;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/layoutsetbranch")
public interface LayoutSetBranchService {
  @Path("/add-layout-set-branch")
  Call<JSONObject> addLayoutSetBranch(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "master") boolean master, @Param(name = "copyLayoutSetBranchId") long copyLayoutSetBranchId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-layout-set-branch")
  Call<Response> deleteLayoutSetBranch(@Param(name = "layoutSetBranchId") long layoutSetBranchId);

  @Path("/get-layout-set-branches")
  Call<JSONArray> getLayoutSetBranches(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout);

  @Path("/merge-layout-set-branch")
  Call<JSONObject> mergeLayoutSetBranch(@Param(name = "layoutSetBranchId") long layoutSetBranchId, @Param(name = "mergeLayoutSetBranchId") long mergeLayoutSetBranchId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-layout-set-branch")
  Call<JSONObject> updateLayoutSetBranch(@Param(name = "groupId") long groupId, @Param(name = "layoutSetBranchId") long layoutSetBranchId, @Param(name = "name") String name, @Param(name = "description") String description, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
