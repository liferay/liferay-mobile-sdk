package com.liferay.mobile.android.v62.mdraction;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/mdraction")
public interface MDRActionService {
  @Path("/add-action")
  Call<JSONObject> addAction(@Param("ruleGroupInstanceId") long ruleGroupInstanceId, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("type") String type, @Param("typeSettings") String typeSettings, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/add-action")
  Call<JSONObject> addAction(@Param("ruleGroupInstanceId") long ruleGroupInstanceId, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("type") String type, @Param("typeSettingsProperties") JSONObjectWrapper typeSettingsProperties, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-action")
  Call<Response> deleteAction(@Param("actionId") long actionId);

  @Path("/fetch-action")
  Call<JSONObject> fetchAction(@Param("actionId") long actionId);

  @Path("/get-action")
  Call<JSONObject> getAction(@Param("actionId") long actionId);

  @Path("/update-action")
  Call<JSONObject> updateAction(@Param("actionId") long actionId, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("type") String type, @Param("typeSettings") String typeSettings, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/update-action")
  Call<JSONObject> updateAction(@Param("actionId") long actionId, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("type") String type, @Param("typeSettingsProperties") JSONObjectWrapper typeSettingsProperties, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
