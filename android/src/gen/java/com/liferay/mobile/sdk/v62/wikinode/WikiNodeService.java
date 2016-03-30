package com.liferay.mobile.sdk.v62.wikinode;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/wikinode")
public interface WikiNodeService {
  @Path("/add-node")
  Call<JSONObject> addNode(@Param("name") String name, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-node")
  Call<Response> deleteNode(@Param("nodeId") long nodeId);

  @Path("/get-node")
  Call<JSONObject> getNode(@Param("nodeId") long nodeId);

  @Path("/get-node")
  Call<JSONObject> getNode(@Param("groupId") long groupId, @Param("name") String name);

  @Path("/get-nodes")
  Call<JSONArray> getNodes(@Param("groupId") long groupId);

  @Path("/get-nodes")
  Call<JSONArray> getNodes(@Param("groupId") long groupId, @Param("status") int status);

  @Path("/get-nodes")
  Call<JSONArray> getNodes(@Param("groupId") long groupId, @Param("start") int start, @Param("end") int end);

  @Path("/get-nodes")
  Call<JSONArray> getNodes(@Param("groupId") long groupId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-nodes-count")
  Call<Integer> getNodesCount(@Param("groupId") long groupId);

  @Path("/get-nodes-count")
  Call<Integer> getNodesCount(@Param("groupId") long groupId, @Param("status") int status);

  @Path("/move-node-to-trash")
  Call<JSONObject> moveNodeToTrash(@Param("nodeId") long nodeId);

  @Path("/restore-node-from-trash")
  Call<Response> restoreNodeFromTrash(@Param("nodeId") long nodeId);

  @Path("/subscribe-node")
  Call<Response> subscribeNode(@Param("nodeId") long nodeId);

  @Path("/unsubscribe-node")
  Call<Response> unsubscribeNode(@Param("nodeId") long nodeId);

  @Path("/update-node")
  Call<JSONObject> updateNode(@Param("nodeId") long nodeId, @Param("name") String name, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
