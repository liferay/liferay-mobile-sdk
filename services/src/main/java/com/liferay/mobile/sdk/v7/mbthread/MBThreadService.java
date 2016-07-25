package com.liferay.mobile.sdk.v7.mbthread;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/mbthread")
public interface MBThreadService {
  @Path("/delete-thread")
  Call<Response> deleteThread(@Param(name = "threadId") long threadId);

  @Path("/get-group-threads")
  Call<JSONArray> getGroupThreads(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-threads")
  Call<JSONArray> getGroupThreads(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "modifiedDate") long modifiedDate, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-threads")
  Call<JSONArray> getGroupThreads(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "status") int status, @Param(name = "subscribed") boolean subscribed, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-threads")
  Call<JSONArray> getGroupThreads(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "status") int status, @Param(name = "subscribed") boolean subscribed, @Param(name = "includeAnonymous") boolean includeAnonymous, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-group-threads-count")
  Call<Integer> getGroupThreadsCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "status") int status);

  @Path("/get-group-threads-count")
  Call<Integer> getGroupThreadsCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "modifiedDate") long modifiedDate, @Param(name = "status") int status);

  @Path("/get-group-threads-count")
  Call<Integer> getGroupThreadsCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "status") int status, @Param(name = "subscribed") boolean subscribed);

  @Path("/get-group-threads-count")
  Call<Integer> getGroupThreadsCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "status") int status, @Param(name = "subscribed") boolean subscribed, @Param(name = "includeAnonymous") boolean includeAnonymous);

  @Path("/get-threads")
  Call<JSONArray> getThreads(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-threads-count")
  Call<Integer> getThreadsCount(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "status") int status);

  @Path("/lock-thread")
  Call<JSONObject> lockThread(@Param(name = "threadId") long threadId);

  @Path("/move-thread")
  Call<JSONObject> moveThread(@Param(name = "categoryId") long categoryId, @Param(name = "threadId") long threadId);

  @Path("/move-thread-from-trash")
  Call<JSONObject> moveThreadFromTrash(@Param(name = "categoryId") long categoryId, @Param(name = "threadId") long threadId);

  @Path("/move-thread-to-trash")
  Call<JSONObject> moveThreadToTrash(@Param(name = "threadId") long threadId);

  @Path("/restore-thread-from-trash")
  Call<Response> restoreThreadFromTrash(@Param(name = "threadId") long threadId);

  @Path("/search")
  Call<JSONObject> search(@Param(name = "groupId") long groupId, @Param(name = "creatorUserId") long creatorUserId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/search")
  Call<JSONObject> search(@Param(name = "groupId") long groupId, @Param(name = "creatorUserId") long creatorUserId, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/split-thread")
  Call<JSONObject> splitThread(@Param(name = "messageId") long messageId, @Param(name = "subject") String subject, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/unlock-thread")
  Call<Response> unlockThread(@Param(name = "threadId") long threadId);
}
