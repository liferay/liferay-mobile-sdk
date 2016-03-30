package com.liferay.mobile.sdk.v62.mdrrulegroup;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONObject;

@Path("/mdrrulegroup")
public interface MDRRuleGroupService {
  @Path("/add-rule-group")
  Call<JSONObject> addRuleGroup(@Param("groupId") long groupId, @ParamObject(name = "nameMap", className = "") JSONObject nameMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-rule-group")
  Call<JSONObject> copyRuleGroup(@Param("ruleGroupId") long ruleGroupId, @Param("groupId") long groupId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-rule-group")
  Call<Response> deleteRuleGroup(@Param("ruleGroupId") long ruleGroupId);

  @Path("/fetch-rule-group")
  Call<JSONObject> fetchRuleGroup(@Param("ruleGroupId") long ruleGroupId);

  @Path("/get-rule-group")
  Call<JSONObject> getRuleGroup(@Param("ruleGroupId") long ruleGroupId);

  @Path("/update-rule-group")
  Call<JSONObject> updateRuleGroup(@Param("ruleGroupId") long ruleGroupId, @ParamObject(name = "nameMap", className = "") JSONObject nameMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
