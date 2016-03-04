package com.liferay.mobile.android.v62.backgroundtask;

import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Integer;
import java.lang.String;

@Path("/backgroundtask")
public interface BackgroundTaskService {
  @Path("/get-background-task-status-json")
  Call<String> getBackgroundTaskStatusJson(@Param("backgroundTaskId") long backgroundTaskId);

  @Path("/get-background-tasks-count")
  Call<Integer> getBackgroundTasksCount(@Param("groupId") long groupId, @Param("taskExecutorClassName") String taskExecutorClassName, @Param("completed") String completed);
}
