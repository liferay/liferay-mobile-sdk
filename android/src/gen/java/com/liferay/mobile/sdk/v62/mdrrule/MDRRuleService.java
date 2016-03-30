package com.liferay.mobile.sdk.v62.mdrrule;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/mdrrule")
public interface MDRRuleService {
  @Path("/add-rule")
  Call<JSONObject> addRule(@Param("ruleGroupId") long ruleGroupId, @ParamObject(name = "nameMap", className = "") JSONObject nameMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") String type, @Param("typeSettings") String typeSettings, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-rule")
  Call<Response> deleteRule(@Param("ruleId") long ruleId);

  @Path("/fetch-rule")
  Call<JSONObject> fetchRule(@Param("ruleId") long ruleId);

  @Path("/get-rule")
  Call<JSONObject> getRule(@Param("ruleId") long ruleId);

  @Path("/update-rule")
  Call<JSONObject> updateRule(@Param("ruleId") long ruleId, @ParamObject(name = "nameMap", className = "") JSONObject nameMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") String type, @Param("typeSettings") String typeSettings, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-rule")
  Call<JSONObject> updateRule(@Param("ruleId") long ruleId, @ParamObject(name = "nameMap", className = "") JSONObject nameMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") String type, @ParamObject(name = "typeSettingsProperties", className = "com.liferay.portal.kernel.util.UnicodeProperties") JSONObject typeSettingsProperties, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
