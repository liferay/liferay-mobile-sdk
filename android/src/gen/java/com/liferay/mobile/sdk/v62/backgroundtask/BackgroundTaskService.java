package com.liferay.mobile.sdk.v62.backgroundtask;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import java.lang.String;

@Path("/backgroundtask")
public interface BackgroundTaskService {
  @Path("/get-background-task-status-json")
  Call<String> getBackgroundTaskStatusJson(@Param(name = "backgroundTaskId") long backgroundTaskId);

  @Path("/get-background-tasks-count")
  Call<Integer> getBackgroundTasksCount(@Param(name = "groupId") long groupId, @Param(name = "taskExecutorClassName") String taskExecutorClassName, @Param(name = "completed") String completed);
}
