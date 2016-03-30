package com.liferay.mobile.sdk.v62.mdraction;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.annotation.JsonObject;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/mdraction")
public interface MDRActionService {
  @Path("/add-action")
  Call<JSONObject> addAction(@Param("ruleGroupInstanceId") long ruleGroupInstanceId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") String type, @Param("typeSettings") String typeSettings, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-action")
  Call<JSONObject> addAction(@Param("ruleGroupInstanceId") long ruleGroupInstanceId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") String type, @JsonObject(name = "typeSettingsProperties", className = "com.liferay.portal.kernel.util.UnicodeProperties") JSONObject typeSettingsProperties, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-action")
  Call<Response> deleteAction(@Param("actionId") long actionId);

  @Path("/fetch-action")
  Call<JSONObject> fetchAction(@Param("actionId") long actionId);

  @Path("/get-action")
  Call<JSONObject> getAction(@Param("actionId") long actionId);

  @Path("/update-action")
  Call<JSONObject> updateAction(@Param("actionId") long actionId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") String type, @Param("typeSettings") String typeSettings, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-action")
  Call<JSONObject> updateAction(@Param("actionId") long actionId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") String type, @JsonObject(name = "typeSettingsProperties", className = "com.liferay.portal.kernel.util.UnicodeProperties") JSONObject typeSettingsProperties, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
