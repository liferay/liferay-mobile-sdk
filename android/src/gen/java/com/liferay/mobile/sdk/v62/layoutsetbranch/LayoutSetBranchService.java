package com.liferay.mobile.sdk.v62.layoutsetbranch;

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/layoutsetbranch")
public interface LayoutSetBranchService {
  @Path("/add-layout-set-branch")
  Call<JSONObject> addLayoutSetBranch(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("name") String name, @Param("description") String description, @Param("master") boolean master, @Param("copyLayoutSetBranchId") long copyLayoutSetBranchId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-layout-set-branch")
  Call<Response> deleteLayoutSetBranch(@Param("layoutSetBranchId") long layoutSetBranchId);

  @Path("/get-layout-set-branches")
  Call<JSONArray> getLayoutSetBranches(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout);

  @Path("/merge-layout-set-branch")
  Call<JSONObject> mergeLayoutSetBranch(@Param("layoutSetBranchId") long layoutSetBranchId, @Param("mergeLayoutSetBranchId") long mergeLayoutSetBranchId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-layout-set-branch")
  Call<JSONObject> updateLayoutSetBranch(@Param("groupId") long groupId, @Param("layoutSetBranchId") long layoutSetBranchId, @Param("name") String name, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
