package com.liferay.mobile.android.v62.layoutbranch;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
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
