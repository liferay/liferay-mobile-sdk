package com.liferay.mobile.android.v62.team;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Boolean;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/team")
public interface TeamService {
  @Path("/add-team")
  Call<JSONObject> addTeam(@Param("groupId") long groupId, @Param("name") String name, @Param("description") String description);

  @Path("/delete-team")
  Call<Response> deleteTeam(@Param("teamId") long teamId);

  @Path("/get-group-teams")
  Call<JSONArray> getGroupTeams(@Param("groupId") long groupId);

  @Path("/get-team")
  Call<JSONObject> getTeam(@Param("teamId") long teamId);

  @Path("/get-team")
  Call<JSONObject> getTeam(@Param("groupId") long groupId, @Param("name") String name);

  @Path("/get-user-teams")
  Call<JSONArray> getUserTeams(@Param("userId") long userId);

  @Path("/get-user-teams")
  Call<JSONArray> getUserTeams(@Param("userId") long userId, @Param("groupId") long groupId);

  @Path("/has-user-team")
  Call<Boolean> hasUserTeam(@Param("userId") long userId, @Param("teamId") long teamId);

  @Path("/update-team")
  Call<JSONObject> updateTeam(@Param("teamId") long teamId, @Param("name") String name, @Param("description") String description);
}
