package com.liferay.mobile.sdk.v7.layoutsetprototype;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/layoutsetprototype")
public interface LayoutSetPrototypeService {
  @Path("/add-layout-set-prototype")
  Call<JSONObject> addLayoutSetPrototype(@Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "description") String description, @Param(name = "active") boolean active, @Param(name = "layoutsUpdateable") boolean layoutsUpdateable, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/add-layout-set-prototype")
  Call<JSONObject> addLayoutSetPrototype(@Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "active") boolean active, @Param(name = "layoutsUpdateable") boolean layoutsUpdateable, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-layout-set-prototype")
  Call<Response> deleteLayoutSetPrototype(@Param(name = "layoutSetPrototypeId") long layoutSetPrototypeId);

  @Path("/fetch-layout-set-prototype")
  Call<JSONObject> fetchLayoutSetPrototype(@Param(name = "layoutSetPrototypeId") long layoutSetPrototypeId);

  @Path("/get-layout-set-prototype")
  Call<JSONObject> getLayoutSetPrototype(@Param(name = "layoutSetPrototypeId") long layoutSetPrototypeId);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "active") boolean active, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/update-layout-set-prototype")
  Call<JSONObject> updateLayoutSetPrototype(@Param(name = "layoutSetPrototypeId") long layoutSetPrototypeId, @Param(name = "settings") String settings);

  @Path("/update-layout-set-prototype")
  Call<JSONObject> updateLayoutSetPrototype(@Param(name = "layoutSetPrototypeId") long layoutSetPrototypeId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "description") String description, @Param(name = "active") boolean active, @Param(name = "layoutsUpdateable") boolean layoutsUpdateable, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-layout-set-prototype")
  Call<JSONObject> updateLayoutSetPrototype(@Param(name = "layoutSetPrototypeId") long layoutSetPrototypeId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "active") boolean active, @Param(name = "layoutsUpdateable") boolean layoutsUpdateable, @Param(name = "serviceContext", className = "") JSONObject serviceContext);
}
