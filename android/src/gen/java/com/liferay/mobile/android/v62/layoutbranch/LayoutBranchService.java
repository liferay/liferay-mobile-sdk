package com.liferay.mobile.android.v62.layoutbranch;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/layoutbranch")
public interface LayoutBranchService {
  @Path("/add-layout-branch")
  Call<JSONObject> addLayoutBranch(@Param("layoutRevisionId") long layoutRevisionId, @Param("name") String name, @Param("description") String description, @Param("master") boolean master, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-layout-branch")
  Call<Response> deleteLayoutBranch(@Param("layoutBranchId") long layoutBranchId);

  @Path("/update-layout-branch")
  Call<JSONObject> updateLayoutBranch(@Param("layoutBranchId") long layoutBranchId, @Param("name") String name, @Param("description") String description, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
