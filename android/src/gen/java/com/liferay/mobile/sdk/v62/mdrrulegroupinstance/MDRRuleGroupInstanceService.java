package com.liferay.mobile.sdk.v62.mdrrulegroupinstance;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/mdrrulegroupinstance")
public interface MDRRuleGroupInstanceService {
  @Path("/add-rule-group-instance")
  Call<JSONObject> addRuleGroupInstance(@Param(name = "groupId") long groupId, @Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "ruleGroupId") long ruleGroupId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-rule-group-instance")
  Call<JSONObject> addRuleGroupInstance(@Param(name = "groupId") long groupId, @Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "ruleGroupId") long ruleGroupId, @Param(name = "priority") int priority, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-rule-group-instance")
  Call<Response> deleteRuleGroupInstance(@Param(name = "ruleGroupInstanceId") long ruleGroupInstanceId);

  @Path("/get-rule-group-instances")
  Call<JSONArray> getRuleGroupInstances(@Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/get-rule-group-instances-count")
  Call<Integer> getRuleGroupInstancesCount(@Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/update-rule-group-instance")
  Call<JSONObject> updateRuleGroupInstance(@Param(name = "ruleGroupInstanceId") long ruleGroupInstanceId, @Param(name = "priority") int priority);
}
