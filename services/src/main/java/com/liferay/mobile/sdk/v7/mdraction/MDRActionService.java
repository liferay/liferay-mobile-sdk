package com.liferay.mobile.sdk.v7.mdraction;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import java.util.Map;
import org.json.JSONObject;

@Path("/mdr.mdraction")
public interface MDRActionService {
  @Path("/add-action")
  Call<JSONObject> addAction(@Param(name = "ruleGroupInstanceId") long ruleGroupInstanceId, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "type") String type, @Param(name = "typeSettingsProperties") Map typeSettingsProperties, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-action")
  Call<JSONObject> addAction(@Param(name = "ruleGroupInstanceId") long ruleGroupInstanceId, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "type") String type, @Param(name = "typeSettings") String typeSettings, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-action")
  Call<Response> deleteAction(@Param(name = "actionId") long actionId);

  @Path("/fetch-action")
  Call<JSONObject> fetchAction(@Param(name = "actionId") long actionId);

  @Path("/get-action")
  Call<JSONObject> getAction(@Param(name = "actionId") long actionId);

  @Path("/update-action")
  Call<JSONObject> updateAction(@Param(name = "actionId") long actionId, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "type") String type, @Param(name = "typeSettings") String typeSettings, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-action")
  Call<JSONObject> updateAction(@Param(name = "actionId") long actionId, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "type") String type, @Param(name = "typeSettingsProperties") Map typeSettingsProperties, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
