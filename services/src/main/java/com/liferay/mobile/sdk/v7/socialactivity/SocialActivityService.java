package com.liferay.mobile.sdk.v7.socialactivity;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/socialactivity")
public interface SocialActivityService {
  @Path("/get-activities")
  Call<JSONArray> getActivities(@Param(name = "classNameId") long classNameId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-activities")
  Call<JSONArray> getActivities(@Param(name = "className") String className, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-activities")
  Call<JSONArray> getActivities(@Param(name = "mirrorActivityId") long mirrorActivityId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-activities")
  Call<JSONArray> getActivities(@Param(name = "mirrorActivityId") long mirrorActivityId, @Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-activities-count")
  Call<Integer> getActivitiesCount(@Param(name = "className") String className);

  @Path("/get-activities-count")
  Call<Integer> getActivitiesCount(@Param(name = "classNameId") long classNameId);

  @Path("/get-activities-count")
  Call<Integer> getActivitiesCount(@Param(name = "mirrorActivityId") long mirrorActivityId, @Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/get-activities-count")
  Call<Integer> getActivitiesCount(@Param(name = "mirrorActivityId") long mirrorActivityId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK);

  @Path("/get-activity")
  Call<JSONObject> getActivity(@Param(name = "activityId") long activityId);

  @Path("/get-activity-set-activities")
  Call<JSONArray> getActivitySetActivities(@Param(name = "activitySetId") long activitySetId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-activities")
  Call<JSONArray> getGroupActivities(@Param(name = "groupId") long groupId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-activities-count")
  Call<Integer> getGroupActivitiesCount(@Param(name = "groupId") long groupId);

  @Path("/get-group-users-activities")
  Call<JSONArray> getGroupUsersActivities(@Param(name = "groupId") long groupId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-users-activities-count")
  Call<Integer> getGroupUsersActivitiesCount(@Param(name = "groupId") long groupId);

  @Path("/get-mirror-activity")
  Call<JSONObject> getMirrorActivity(@Param(name = "mirrorActivityId") long mirrorActivityId);

  @Path("/get-organization-activities")
  Call<JSONArray> getOrganizationActivities(@Param(name = "organizationId") long organizationId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-organization-activities-count")
  Call<Integer> getOrganizationActivitiesCount(@Param(name = "organizationId") long organizationId);

  @Path("/get-organization-users-activities")
  Call<JSONArray> getOrganizationUsersActivities(@Param(name = "organizationId") long organizationId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-organization-users-activities-count")
  Call<Integer> getOrganizationUsersActivitiesCount(@Param(name = "organizationId") long organizationId);

  @Path("/get-relation-activities")
  Call<JSONArray> getRelationActivities(@Param(name = "userId") long userId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-relation-activities")
  Call<JSONArray> getRelationActivities(@Param(name = "userId") long userId, @Param(name = "type") int type, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-relation-activities-count")
  Call<Integer> getRelationActivitiesCount(@Param(name = "userId") long userId);

  @Path("/get-relation-activities-count")
  Call<Integer> getRelationActivitiesCount(@Param(name = "userId") long userId, @Param(name = "type") int type);

  @Path("/get-user-activities")
  Call<JSONArray> getUserActivities(@Param(name = "userId") long userId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-user-activities-count")
  Call<Integer> getUserActivitiesCount(@Param(name = "userId") long userId);

  @Path("/get-user-groups-activities")
  Call<JSONArray> getUserGroupsActivities(@Param(name = "userId") long userId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-user-groups-activities-count")
  Call<Integer> getUserGroupsActivitiesCount(@Param(name = "userId") long userId);

  @Path("/get-user-groups-and-organizations-activities")
  Call<JSONArray> getUserGroupsAndOrganizationsActivities(@Param(name = "userId") long userId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-user-groups-and-organizations-activities-count")
  Call<Integer> getUserGroupsAndOrganizationsActivitiesCount(@Param(name = "userId") long userId);

  @Path("/get-user-organizations-activities")
  Call<JSONArray> getUserOrganizationsActivities(@Param(name = "userId") long userId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-user-organizations-activities-count")
  Call<Integer> getUserOrganizationsActivitiesCount(@Param(name = "userId") long userId);
}
