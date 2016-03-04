package com.liferay.mobile.android.v62.layoutsetbranch;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/layoutsetbranch")
public interface LayoutSetBranchService {
  @Path("/add-layout-set-branch")
  Call<JSONObject> addLayoutSetBranch(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("name") String name, @Param("description") String description, @Param("master") boolean master, @Param("copyLayoutSetBranchId") long copyLayoutSetBranchId, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-layout-set-branch")
  Call<Response> deleteLayoutSetBranch(@Param("layoutSetBranchId") long layoutSetBranchId);

  @Path("/get-layout-set-branches")
  Call<JSONArray> getLayoutSetBranches(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout);

  @Path("/merge-layout-set-branch")
  Call<JSONObject> mergeLayoutSetBranch(@Param("layoutSetBranchId") long layoutSetBranchId, @Param("mergeLayoutSetBranchId") long mergeLayoutSetBranchId, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/update-layout-set-branch")
  Call<JSONObject> updateLayoutSetBranch(@Param("groupId") long groupId, @Param("layoutSetBranchId") long layoutSetBranchId, @Param("name") String name, @Param("description") String description, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
