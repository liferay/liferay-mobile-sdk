package com.liferay.mobile.sdk.v7.team;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/team")
public interface TeamService {
  @Path("/add-team")
  Call<JSONObject> addTeam(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "description") String description);

  @Path("/add-team")
  Call<JSONObject> addTeam(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-team")
  Call<Response> deleteTeam(@Param(name = "teamId") long teamId);

  @Path("/get-group-teams")
  Call<JSONArray> getGroupTeams(@Param(name = "groupId") long groupId);

  @Path("/get-team")
  Call<JSONObject> getTeam(@Param(name = "teamId") long teamId);

  @Path("/get-team")
  Call<JSONObject> getTeam(@Param(name = "groupId") long groupId, @Param(name = "name") String name);

  @Path("/get-user-teams")
  Call<JSONArray> getUserTeams(@Param(name = "userId") long userId);

  @Path("/get-user-teams")
  Call<JSONArray> getUserTeams(@Param(name = "userId") long userId, @Param(name = "groupId") long groupId);

  @Path("/has-user-team")
  Call<Boolean> hasUserTeam(@Param(name = "userId") long userId, @Param(name = "teamId") long teamId);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "params") JSONObject params, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "params") JSONObject params);

  @Path("/update-team")
  Call<JSONObject> updateTeam(@Param(name = "teamId") long teamId, @Param(name = "name") String name, @Param(name = "description") String description);
}
