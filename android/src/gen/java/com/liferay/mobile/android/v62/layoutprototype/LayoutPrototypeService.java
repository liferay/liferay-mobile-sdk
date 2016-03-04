package com.liferay.mobile.android.v62.layoutprototype;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/layoutprototype")
public interface LayoutPrototypeService {
  @Path("/add-layout-prototype")
  Call<JSONObject> addLayoutPrototype(@Param("nameMap") JSONObject nameMap, @Param("description") String description, @Param("active") boolean active);

  @Path("/add-layout-prototype")
  Call<JSONObject> addLayoutPrototype(@Param("nameMap") JSONObject nameMap, @Param("description") String description, @Param("active") boolean active, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-layout-prototype")
  Call<Response> deleteLayoutPrototype(@Param("layoutPrototypeId") long layoutPrototypeId);

  @Path("/get-layout-prototype")
  Call<JSONObject> getLayoutPrototype(@Param("layoutPrototypeId") long layoutPrototypeId);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("active") boolean active, @Param("obc") JSONObjectWrapper obc);

  @Path("/update-layout-prototype")
  Call<JSONObject> updateLayoutPrototype(@Param("layoutPrototypeId") long layoutPrototypeId, @Param("nameMap") JSONObject nameMap, @Param("description") String description, @Param("active") boolean active);

  @Path("/update-layout-prototype")
  Call<JSONObject> updateLayoutPrototype(@Param("layoutPrototypeId") long layoutPrototypeId, @Param("nameMap") JSONObject nameMap, @Param("description") String description, @Param("active") boolean active, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
