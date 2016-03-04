package com.liferay.mobile.android.v62.socialactivitysetting;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
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
  Call<Response> updateActivitySetting(@Param("groupId") long groupId, @Param("className") String className, @Param("activityType") int activityType, @Param("activityCounterDefinition") JSONObjectWrapper activityCounterDefinition);

  @Path("/update-activity-settings")
  Call<Response> updateActivitySettings(@Param("groupId") long groupId, @Param("className") String className, @Param("activityType") int activityType, @Param("activityCounterDefinitions") JSONArray activityCounterDefinitions);
}
