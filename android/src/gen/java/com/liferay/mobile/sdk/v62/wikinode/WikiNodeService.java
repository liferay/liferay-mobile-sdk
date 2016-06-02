package com.liferay.mobile.sdk.v62.wikinode;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/wikinode")
public interface WikiNodeService {
  @Path("/add-node")
  Call<JSONObject> addNode(@Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-node")
  Call<Response> deleteNode(@Param(name = "nodeId") long nodeId);

  @Path("/get-node")
  Call<JSONObject> getNode(@Param(name = "nodeId") long nodeId);

  @Path("/get-node")
  Call<JSONObject> getNode(@Param(name = "groupId") long groupId, @Param(name = "name") String name);

  @Path("/get-nodes")
  Call<JSONArray> getNodes(@Param(name = "groupId") long groupId);

  @Path("/get-nodes")
  Call<JSONArray> getNodes(@Param(name = "groupId") long groupId, @Param(name = "status") int status);

  @Path("/get-nodes")
  Call<JSONArray> getNodes(@Param(name = "groupId") long groupId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-nodes")
  Call<JSONArray> getNodes(@Param(name = "groupId") long groupId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-nodes-count")
  Call<Integer> getNodesCount(@Param(name = "groupId") long groupId);

  @Path("/get-nodes-count")
  Call<Integer> getNodesCount(@Param(name = "groupId") long groupId, @Param(name = "status") int status);

  @Path("/move-node-to-trash")
  Call<JSONObject> moveNodeToTrash(@Param(name = "nodeId") long nodeId);

  @Path("/restore-node-from-trash")
  Call<Response> restoreNodeFromTrash(@Param(name = "nodeId") long nodeId);

  @Path("/subscribe-node")
  Call<Response> subscribeNode(@Param(name = "nodeId") long nodeId);

  @Path("/unsubscribe-node")
  Call<Response> unsubscribeNode(@Param(name = "nodeId") long nodeId);

  @Path("/update-node")
  Call<JSONObject> updateNode(@Param(name = "nodeId") long nodeId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
