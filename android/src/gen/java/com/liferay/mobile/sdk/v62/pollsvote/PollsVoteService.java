package com.liferay.mobile.sdk.v62.pollsvote;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.JsonObject;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import org.json.JSONObject;

@Path("/pollsvote")
public interface PollsVoteService {
  @Path("/add-vote")
  Call<JSONObject> addVote(@Param("questionId") long questionId, @Param("choiceId") long choiceId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
