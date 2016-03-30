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
  Call<JSONObject> addRuleGroupInstance(@Param("groupId") long groupId, @Param("className") String className, @Param("classPK") long classPK, @Param("ruleGroupId") long ruleGroupId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-rule-group-instance")
  Call<JSONObject> addRuleGroupInstance(@Param("groupId") long groupId, @Param("className") String className, @Param("classPK") long classPK, @Param("ruleGroupId") long ruleGroupId, @Param("priority") int priority, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-rule-group-instance")
  Call<Response> deleteRuleGroupInstance(@Param("ruleGroupInstanceId") long ruleGroupInstanceId);

  @Path("/get-rule-group-instances")
  Call<JSONArray> getRuleGroupInstances(@Param("className") String className, @Param("classPK") long classPK, @Param("start") int start, @Param("end") int end, @ParamObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/get-rule-group-instances-count")
  Call<Integer> getRuleGroupInstancesCount(@Param("className") String className, @Param("classPK") long classPK);

  @Path("/update-rule-group-instance")
  Call<JSONObject> updateRuleGroupInstance(@Param("ruleGroupInstanceId") long ruleGroupInstanceId, @Param("priority") int priority);
}
