package com.liferay.mobile.android.v62.mdrrule;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/mdrrule")
public interface MDRRuleService {
  @Path("/add-rule")
  Call<JSONObject> addRule(@Param("ruleGroupId") long ruleGroupId, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("type") String type, @Param("typeSettings") String typeSettings, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-rule")
  Call<Response> deleteRule(@Param("ruleId") long ruleId);

  @Path("/fetch-rule")
  Call<JSONObject> fetchRule(@Param("ruleId") long ruleId);

  @Path("/get-rule")
  Call<JSONObject> getRule(@Param("ruleId") long ruleId);

  @Path("/update-rule")
  Call<JSONObject> updateRule(@Param("ruleId") long ruleId, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("type") String type, @Param("typeSettings") String typeSettings, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/update-rule")
  Call<JSONObject> updateRule(@Param("ruleId") long ruleId, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("type") String type, @Param("typeSettingsProperties") JSONObjectWrapper typeSettingsProperties, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
