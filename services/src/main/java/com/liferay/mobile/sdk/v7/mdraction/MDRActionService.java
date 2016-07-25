package com.liferay.mobile.sdk.v7.mdraction;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/mdr.mdraction")
public interface MDRActionService {
  @Path("/add-action")
  Call<JSONObject> addAction(@Param(name = "ruleGroupInstanceId") long ruleGroupInstanceId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") String type, @Param(name = "typeSettingsProperties", className = "") JSONObject typeSettingsProperties, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/add-action")
  Call<JSONObject> addAction(@Param(name = "ruleGroupInstanceId") long ruleGroupInstanceId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") String type, @Param(name = "typeSettings") String typeSettings, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-action")
  Call<Response> deleteAction(@Param(name = "actionId") long actionId);

  @Path("/fetch-action")
  Call<JSONObject> fetchAction(@Param(name = "actionId") long actionId);

  @Path("/get-action")
  Call<JSONObject> getAction(@Param(name = "actionId") long actionId);

  @Path("/update-action")
  Call<JSONObject> updateAction(@Param(name = "actionId") long actionId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") String type, @Param(name = "typeSettings") String typeSettings, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-action")
  Call<JSONObject> updateAction(@Param(name = "actionId") long actionId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") String type, @Param(name = "typeSettingsProperties", className = "") JSONObject typeSettingsProperties, @Param(name = "serviceContext", className = "") JSONObject serviceContext);
}
