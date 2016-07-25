package com.liferay.mobile.sdk.v7.mdrrulegroup;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/mdr.mdrrulegroup")
public interface MDRRuleGroupService {
  @Path("/add-rule-group")
  Call<JSONObject> addRuleGroup(@Param(name = "groupId") long groupId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/copy-rule-group")
  Call<JSONObject> copyRuleGroup(@Param(name = "ruleGroupId") long ruleGroupId, @Param(name = "groupId") long groupId, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-rule-group")
  Call<Response> deleteRuleGroup(@Param(name = "ruleGroupId") long ruleGroupId);

  @Path("/fetch-rule-group")
  Call<JSONObject> fetchRuleGroup(@Param(name = "ruleGroupId") long ruleGroupId);

  @Path("/get-rule-group")
  Call<JSONObject> getRuleGroup(@Param(name = "ruleGroupId") long ruleGroupId);

  @Path("/get-rule-groups")
  Call<JSONArray> getRuleGroups(@Param(name = "groupIds") JSONArray groupIds, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-rule-groups-count")
  Call<Integer> getRuleGroupsCount(@Param(name = "groupIds") JSONArray groupIds);

  @Path("/update-rule-group")
  Call<JSONObject> updateRuleGroup(@Param(name = "ruleGroupId") long ruleGroupId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "serviceContext", className = "") JSONObject serviceContext);
}
