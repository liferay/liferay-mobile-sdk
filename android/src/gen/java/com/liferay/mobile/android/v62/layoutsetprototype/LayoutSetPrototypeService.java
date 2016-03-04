package com.liferay.mobile.android.v62.layoutsetprototype;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/layoutsetprototype")
public interface LayoutSetPrototypeService {
  @Path("/add-layout-set-prototype")
  Call<JSONObject> addLayoutSetPrototype(@Param("nameMap") JSONObject nameMap, @Param("description") String description, @Param("active") boolean active, @Param("layoutsUpdateable") boolean layoutsUpdateable, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-layout-set-prototype")
  Call<Response> deleteLayoutSetPrototype(@Param("layoutSetPrototypeId") long layoutSetPrototypeId);

  @Path("/get-layout-set-prototype")
  Call<JSONObject> getLayoutSetPrototype(@Param("layoutSetPrototypeId") long layoutSetPrototypeId);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("active") boolean active, @Param("obc") JSONObjectWrapper obc);

  @Path("/update-layout-set-prototype")
  Call<JSONObject> updateLayoutSetPrototype(@Param("layoutSetPrototypeId") long layoutSetPrototypeId, @Param("settings") String settings);

  @Path("/update-layout-set-prototype")
  Call<JSONObject> updateLayoutSetPrototype(@Param("layoutSetPrototypeId") long layoutSetPrototypeId, @Param("nameMap") JSONObject nameMap, @Param("description") String description, @Param("active") boolean active, @Param("layoutsUpdateable") boolean layoutsUpdateable, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
