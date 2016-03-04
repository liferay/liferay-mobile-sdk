package com.liferay.mobile.android.v62.mdrrulegroupinstance;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/mdrrulegroupinstance")
public interface MDRRuleGroupInstanceService {
  @Path("/add-rule-group-instance")
  Call<JSONObject> addRuleGroupInstance(@Param("groupId") long groupId, @Param("className") String className, @Param("classPK") long classPK, @Param("ruleGroupId") long ruleGroupId, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/add-rule-group-instance")
  Call<JSONObject> addRuleGroupInstance(@Param("groupId") long groupId, @Param("className") String className, @Param("classPK") long classPK, @Param("ruleGroupId") long ruleGroupId, @Param("priority") int priority, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-rule-group-instance")
  Call<Response> deleteRuleGroupInstance(@Param("ruleGroupInstanceId") long ruleGroupInstanceId);

  @Path("/get-rule-group-instances")
  Call<JSONArray> getRuleGroupInstances(@Param("className") String className, @Param("classPK") long classPK, @Param("start") int start, @Param("end") int end, @Param("orderByComparator") JSONObjectWrapper orderByComparator);

  @Path("/get-rule-group-instances-count")
  Call<Integer> getRuleGroupInstancesCount(@Param("className") String className, @Param("classPK") long classPK);

  @Path("/update-rule-group-instance")
  Call<JSONObject> updateRuleGroupInstance(@Param("ruleGroupInstanceId") long ruleGroupInstanceId, @Param("priority") int priority);
}
