package com.liferay.mobile.sdk.v62.mdrrule;

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/mdrrule")
public interface MDRRuleService {
  @Path("/add-rule")
  Call<JSONObject> addRule(@Param("ruleGroupId") long ruleGroupId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") String type, @Param("typeSettings") String typeSettings, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-rule")
  Call<Response> deleteRule(@Param("ruleId") long ruleId);

  @Path("/fetch-rule")
  Call<JSONObject> fetchRule(@Param("ruleId") long ruleId);

  @Path("/get-rule")
  Call<JSONObject> getRule(@Param("ruleId") long ruleId);

  @Path("/update-rule")
  Call<JSONObject> updateRule(@Param("ruleId") long ruleId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") String type, @Param("typeSettings") String typeSettings, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-rule")
  Call<JSONObject> updateRule(@Param("ruleId") long ruleId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") String type, @JsonObject(name = "typeSettingsProperties", className = "com.liferay.portal.kernel.util.UnicodeProperties") JSONObject typeSettingsProperties, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
