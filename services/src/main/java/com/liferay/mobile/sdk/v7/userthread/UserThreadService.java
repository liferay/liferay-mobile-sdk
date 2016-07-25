package com.liferay.mobile.sdk.v7.userthread;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/pm.userthread")
public interface UserThreadService {
  @Path("/get-last-thread-message")
  Call<JSONObject> getLastThreadMessage(@Param(name = "mbThreadId") long mbThreadId);

  @Path("/get-thread-messages")
  Call<JSONArray> getThreadMessages(@Param(name = "mbThreadId") long mbThreadId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "ascending") boolean ascending);

  @Path("/get-thread-messages-count")
  Call<Integer> getThreadMessagesCount(@Param(name = "mbThreadId") long mbThreadId);

  @Path("/get-user-user-threads")
  Call<JSONArray> getUserUserThreads(@Param(name = "deleted") boolean deleted);
}
