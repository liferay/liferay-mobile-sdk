package com.liferay.mobile.sdk.v7.layoutprototype;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/layoutprototype")
public interface LayoutPrototypeService {
  @Path("/add-layout-prototype")
  Call<JSONObject> addLayoutPrototype(@Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "active") boolean active, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/add-layout-prototype")
  Call<JSONObject> addLayoutPrototype(@Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "description") String description, @Param(name = "active") boolean active, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-layout-prototype")
  Call<Response> deleteLayoutPrototype(@Param(name = "layoutPrototypeId") long layoutPrototypeId);

  @Path("/fetch-layout-prototype")
  Call<JSONObject> fetchLayoutPrototype(@Param(name = "layoutPrototypeId") long layoutPrototypeId);

  @Path("/get-layout-prototype")
  Call<JSONObject> getLayoutPrototype(@Param(name = "layoutPrototypeId") long layoutPrototypeId);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "active") boolean active, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/update-layout-prototype")
  Call<JSONObject> updateLayoutPrototype(@Param(name = "layoutPrototypeId") long layoutPrototypeId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "active") boolean active, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-layout-prototype")
  Call<JSONObject> updateLayoutPrototype(@Param(name = "layoutPrototypeId") long layoutPrototypeId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "description") String description, @Param(name = "active") boolean active, @Param(name = "serviceContext", className = "") JSONObject serviceContext);
}
