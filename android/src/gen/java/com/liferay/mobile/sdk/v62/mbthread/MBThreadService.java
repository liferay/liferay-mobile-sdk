package com.liferay.mobile.sdk.v62.mbthread;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/mbthread")
public interface MBThreadService {
  @Path("/delete-thread")
  Call<Response> deleteThread(@Param("threadId") long threadId);

  @Path("/get-group-threads")
  Call<JSONArray> getGroupThreads(@Param("groupId") long groupId, @Param("userId") long userId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-threads")
  Call<JSONArray> getGroupThreads(@Param("groupId") long groupId, @Param("userId") long userId, @Param("modifiedDate") long modifiedDate, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-threads")
  Call<JSONArray> getGroupThreads(@Param("groupId") long groupId, @Param("userId") long userId, @Param("status") int status, @Param("subscribed") boolean subscribed, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-threads")
  Call<JSONArray> getGroupThreads(@Param("groupId") long groupId, @Param("userId") long userId, @Param("status") int status, @Param("subscribed") boolean subscribed, @Param("includeAnonymous") boolean includeAnonymous, @Param("start") int start, @Param("end") int end);

  @Path("/get-group-threads-count")
  Call<Integer> getGroupThreadsCount(@Param("groupId") long groupId, @Param("userId") long userId, @Param("status") int status);

  @Path("/get-group-threads-count")
  Call<Integer> getGroupThreadsCount(@Param("groupId") long groupId, @Param("userId") long userId, @Param("modifiedDate") long modifiedDate, @Param("status") int status);

  @Path("/get-group-threads-count")
  Call<Integer> getGroupThreadsCount(@Param("groupId") long groupId, @Param("userId") long userId, @Param("status") int status, @Param("subscribed") boolean subscribed);

  @Path("/get-group-threads-count")
  Call<Integer> getGroupThreadsCount(@Param("groupId") long groupId, @Param("userId") long userId, @Param("status") int status, @Param("subscribed") boolean subscribed, @Param("includeAnonymous") boolean includeAnonymous);

  @Path("/get-threads")
  Call<JSONArray> getThreads(@Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-threads-count")
  Call<Integer> getThreadsCount(@Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("status") int status);

  @Path("/lock-thread")
  Call<JSONObject> lockThread(@Param("threadId") long threadId);

  @Path("/move-thread")
  Call<JSONObject> moveThread(@Param("categoryId") long categoryId, @Param("threadId") long threadId);

  @Path("/move-thread-from-trash")
  Call<JSONObject> moveThreadFromTrash(@Param("categoryId") long categoryId, @Param("threadId") long threadId);

  @Path("/move-thread-to-trash")
  Call<JSONObject> moveThreadToTrash(@Param("threadId") long threadId);

  @Path("/restore-thread-from-trash")
  Call<Response> restoreThreadFromTrash(@Param("threadId") long threadId);

  @Path("/search")
  Call<JSONObject> search(@Param("groupId") long groupId, @Param("creatorUserId") long creatorUserId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/search")
  Call<JSONObject> search(@Param("groupId") long groupId, @Param("creatorUserId") long creatorUserId, @Param("startDate") long startDate, @Param("endDate") long endDate, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/split-thread")
  Call<JSONObject> splitThread(@Param("messageId") long messageId, @Param("subject") String subject, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/unlock-thread")
  Call<Response> unlockThread(@Param("threadId") long threadId);
}
