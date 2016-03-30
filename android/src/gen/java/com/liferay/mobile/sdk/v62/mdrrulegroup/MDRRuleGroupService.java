package com.liferay.mobile.sdk.v62.mdrrulegroup;

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import org.json.JSONObject;

@Path("/mdrrulegroup")
public interface MDRRuleGroupService {
  @Path("/add-rule-group")
  Call<JSONObject> addRuleGroup(@Param("groupId") long groupId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-rule-group")
  Call<JSONObject> copyRuleGroup(@Param("ruleGroupId") long ruleGroupId, @Param("groupId") long groupId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-rule-group")
  Call<Response> deleteRuleGroup(@Param("ruleGroupId") long ruleGroupId);

  @Path("/fetch-rule-group")
  Call<JSONObject> fetchRuleGroup(@Param("ruleGroupId") long ruleGroupId);

  @Path("/get-rule-group")
  Call<JSONObject> getRuleGroup(@Param("ruleGroupId") long ruleGroupId);

  @Path("/update-rule-group")
  Call<JSONObject> updateRuleGroup(@Param("ruleGroupId") long ruleGroupId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
