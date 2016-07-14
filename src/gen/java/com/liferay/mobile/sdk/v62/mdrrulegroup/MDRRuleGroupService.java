package com.liferay.mobile.sdk.v62.mdrrulegroup;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONObject;

@Path("/mdrrulegroup")
public interface MDRRuleGroupService {
  @Path("/add-rule-group")
  Call<JSONObject> addRuleGroup(@Param(name = "groupId") long groupId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-rule-group")
  Call<JSONObject> copyRuleGroup(@Param(name = "ruleGroupId") long ruleGroupId, @Param(name = "groupId") long groupId, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-rule-group")
  Call<Response> deleteRuleGroup(@Param(name = "ruleGroupId") long ruleGroupId);

  @Path("/fetch-rule-group")
  Call<JSONObject> fetchRuleGroup(@Param(name = "ruleGroupId") long ruleGroupId);

  @Path("/get-rule-group")
  Call<JSONObject> getRuleGroup(@Param(name = "ruleGroupId") long ruleGroupId);

  @Path("/update-rule-group")
  Call<JSONObject> updateRuleGroup(@Param(name = "ruleGroupId") long ruleGroupId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
