package com.liferay.mobile.sdk.v62.socialactivity;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/socialactivity")
public interface SocialActivityService {
  @Path("/get-activities")
  Call<JSONArray> getActivities(@Param("className") String className, @Param("start") int start, @Param("end") int end);

  @Path("/get-activities")
  Call<JSONArray> getActivities(@Param("classNameId") long classNameId, @Param("start") int start, @Param("end") int end);

  @Path("/get-activities")
  Call<JSONArray> getActivities(@Param("mirrorActivityId") long mirrorActivityId, @Param("className") String className, @Param("classPK") long classPK, @Param("start") int start, @Param("end") int end);

  @Path("/get-activities")
  Call<JSONArray> getActivities(@Param("mirrorActivityId") long mirrorActivityId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("start") int start, @Param("end") int end);

  @Path("/get-activities-count")
  Call<Integer> getActivitiesCount(@Param("className") String className);

  @Path("/get-activities-count")
  Call<Integer> getActivitiesCount(@Param("classNameId") long classNameId);

  @Path("/get-activities-count")
  Call<Integer> getActivitiesCount(@Param("mirrorActivityId") long mirrorActivityId, @Param("className") String className, @Param("classPK") long classPK);

  @Path("/get-activities-count")
  Call<Integer> getActivitiesCount(@Param("mirrorActivityId") long mirrorActivityId, @Param("classNameId") long classNameId, @Param("classPK") long classPK);

  @Path("/get-activity")
  Call<JSONObject> getActivity(@Param("activityId") long activityId);

  @Path("/get-activity-set-activities")
  Call<JSONArray> getActivitySetActivities(@Param("activitySetId") long activitySetId, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-activities")
  Call<JSONArray> getGroupActivities(@Param("groupId") long groupId, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-activities-count")
  Call<Integer> getGroupActivitiesCount(@Param("groupId") long groupId);

  @Path("/get-group-users-activities")
  Call<JSONArray> getGroupUsersActivities(@Param("groupId") long groupId, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-users-activities-count")
  Call<Integer> getGroupUsersActivitiesCount(@Param("groupId") long groupId);

  @Path("/get-mirror-activity")
  Call<JSONObject> getMirrorActivity(@Param("mirrorActivityId") long mirrorActivityId);

  @Path("/get-organization-activities")
  Call<JSONArray> getOrganizationActivities(@Param("organizationId") long organizationId, @Param("start") int start, @Param("end") int end);

  @Path("/get-organization-activities-count")
  Call<Integer> getOrganizationActivitiesCount(@Param("organizationId") long organizationId);

  @Path("/get-organization-users-activities")
  Call<JSONArray> getOrganizationUsersActivities(@Param("organizationId") long organizationId, @Param("start") int start, @Param("end") int end);

  @Path("/get-organization-users-activities-count")
  Call<Integer> getOrganizationUsersActivitiesCount(@Param("organizationId") long organizationId);

  @Path("/get-relation-activities")
  Call<JSONArray> getRelationActivities(@Param("userId") long userId, @Param("start") int start, @Param("end") int end);

  @Path("/get-relation-activities")
  Call<JSONArray> getRelationActivities(@Param("userId") long userId, @Param("type") int type, @Param("start") int start, @Param("end") int end);

  @Path("/get-relation-activities-count")
  Call<Integer> getRelationActivitiesCount(@Param("userId") long userId);

  @Path("/get-relation-activities-count")
  Call<Integer> getRelationActivitiesCount(@Param("userId") long userId, @Param("type") int type);

  @Path("/get-user-activities")
  Call<JSONArray> getUserActivities(@Param("userId") long userId, @Param("start") int start, @Param("end") int end);

  @Path("/get-user-activities-count")
  Call<Integer> getUserActivitiesCount(@Param("userId") long userId);

  @Path("/get-user-groups-activities")
  Call<JSONArray> getUserGroupsActivities(@Param("userId") long userId, @Param("start") int start, @Param("end") int end);

  @Path("/get-user-groups-activities-count")
  Call<Integer> getUserGroupsActivitiesCount(@Param("userId") long userId);

  @Path("/get-user-groups-and-organizations-activities")
  Call<JSONArray> getUserGroupsAndOrganizationsActivities(@Param("userId") long userId, @Param("start") int start, @Param("end") int end);

  @Path("/get-user-groups-and-organizations-activities-count")
  Call<Integer> getUserGroupsAndOrganizationsActivitiesCount(@Param("userId") long userId);

  @Path("/get-user-organizations-activities")
  Call<JSONArray> getUserOrganizationsActivities(@Param("userId") long userId, @Param("start") int start, @Param("end") int end);

  @Path("/get-user-organizations-activities-count")
  Call<Integer> getUserOrganizationsActivitiesCount(@Param("userId") long userId);
}
