package com.liferay.mobile.sdk.v62.layoutprototype;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/layoutprototype")
public interface LayoutPrototypeService {
  @Path("/add-layout-prototype")
  Call<JSONObject> addLayoutPrototype(@ParamObject(name = "nameMap", className = "") JSONObject nameMap, @Param("description") String description, @Param("active") boolean active);

  @Path("/add-layout-prototype")
  Call<JSONObject> addLayoutPrototype(@ParamObject(name = "nameMap", className = "") JSONObject nameMap, @Param("description") String description, @Param("active") boolean active, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-layout-prototype")
  Call<Response> deleteLayoutPrototype(@Param("layoutPrototypeId") long layoutPrototypeId);

  @Path("/get-layout-prototype")
  Call<JSONObject> getLayoutPrototype(@Param("layoutPrototypeId") long layoutPrototypeId);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("active") boolean active, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/update-layout-prototype")
  Call<JSONObject> updateLayoutPrototype(@Param("layoutPrototypeId") long layoutPrototypeId, @ParamObject(name = "nameMap", className = "") JSONObject nameMap, @Param("description") String description, @Param("active") boolean active);

  @Path("/update-layout-prototype")
  Call<JSONObject> updateLayoutPrototype(@Param("layoutPrototypeId") long layoutPrototypeId, @ParamObject(name = "nameMap", className = "") JSONObject nameMap, @Param("description") String description, @Param("active") boolean active, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
