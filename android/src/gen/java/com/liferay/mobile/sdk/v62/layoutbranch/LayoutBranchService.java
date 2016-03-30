package com.liferay.mobile.sdk.v62.layoutbranch;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/layoutbranch")
public interface LayoutBranchService {
  @Path("/add-layout-branch")
  Call<JSONObject> addLayoutBranch(@Param("layoutRevisionId") long layoutRevisionId, @Param("name") String name, @Param("description") String description, @Param("master") boolean master, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-layout-branch")
  Call<Response> deleteLayoutBranch(@Param("layoutBranchId") long layoutBranchId);

  @Path("/update-layout-branch")
  Call<JSONObject> updateLayoutBranch(@Param("layoutBranchId") long layoutBranchId, @Param("name") String name, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
