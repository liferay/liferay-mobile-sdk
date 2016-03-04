package com.liferay.mobile.android.v62.mdrrulegroup;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import org.json.JSONObject;

@Path("/mdrrulegroup")
public interface MDRRuleGroupService {
  @Path("/add-rule-group")
  Call<JSONObject> addRuleGroup(@Param("groupId") long groupId, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/copy-rule-group")
  Call<JSONObject> copyRuleGroup(@Param("ruleGroupId") long ruleGroupId, @Param("groupId") long groupId, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-rule-group")
  Call<Response> deleteRuleGroup(@Param("ruleGroupId") long ruleGroupId);

  @Path("/fetch-rule-group")
  Call<JSONObject> fetchRuleGroup(@Param("ruleGroupId") long ruleGroupId);

  @Path("/get-rule-group")
  Call<JSONObject> getRuleGroup(@Param("ruleGroupId") long ruleGroupId);

  @Path("/update-rule-group")
  Call<JSONObject> updateRuleGroup(@Param("ruleGroupId") long ruleGroupId, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
