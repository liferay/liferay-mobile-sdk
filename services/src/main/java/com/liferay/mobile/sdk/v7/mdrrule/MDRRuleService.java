package com.liferay.mobile.sdk.v7.mdrrule;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/mdr.mdrrule")
public interface MDRRuleService {
  @Path("/add-rule")
  Call<JSONObject> addRule(@Param(name = "ruleGroupId") long ruleGroupId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") String type, @Param(name = "typeSettings") String typeSettings, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-rule")
  Call<Response> deleteRule(@Param(name = "ruleId") long ruleId);

  @Path("/fetch-rule")
  Call<JSONObject> fetchRule(@Param(name = "ruleId") long ruleId);

  @Path("/get-rule")
  Call<JSONObject> getRule(@Param(name = "ruleId") long ruleId);

  @Path("/update-rule")
  Call<JSONObject> updateRule(@Param(name = "ruleId") long ruleId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") String type, @Param(name = "typeSettings") String typeSettings, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-rule")
  Call<JSONObject> updateRule(@Param(name = "ruleId") long ruleId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") String type, @Param(name = "typeSettingsProperties", className = "") JSONObject typeSettingsProperties, @Param(name = "serviceContext", className = "") JSONObject serviceContext);
}
