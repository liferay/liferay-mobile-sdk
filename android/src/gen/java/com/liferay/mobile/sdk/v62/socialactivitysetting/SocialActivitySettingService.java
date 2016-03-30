package com.liferay.mobile.sdk.v62.socialactivitysetting;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.annotation.JsonObject;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/socialactivitysetting")
public interface SocialActivitySettingService {
  @Path("/get-activity-definition")
  Call<JSONObject> getActivityDefinition(@Param("groupId") long groupId, @Param("className") String className, @Param("activityType") int activityType);

  @Path("/get-activity-definitions")
  Call<JSONArray> getActivityDefinitions(@Param("groupId") long groupId, @Param("className") String className);

  @Path("/get-activity-settings")
  Call<JSONArray> getActivitySettings(@Param("groupId") long groupId);

  @Path("/get-json-activity-definitions")
  Call<JSONArray> getJsonActivityDefinitions(@Param("groupId") long groupId, @Param("className") String className);

  @Path("/update-activity-setting")
  Call<Response> updateActivitySetting(@Param("groupId") long groupId, @Param("className") String className, @Param("enabled") boolean enabled);

  @Path("/update-activity-setting")
  Call<Response> updateActivitySetting(@Param("groupId") long groupId, @Param("className") String className, @Param("activityType") int activityType, @JsonObject(name = "activityCounterDefinition", className = "com.liferay.portlet.social.model.SocialActivityCounterDefinition") JSONObject activityCounterDefinition);

  @Path("/update-activity-settings")
  Call<Response> updateActivitySettings(@Param("groupId") long groupId, @Param("className") String className, @Param("activityType") int activityType, @Param("activityCounterDefinitions") JSONArray activityCounterDefinitions);
}
