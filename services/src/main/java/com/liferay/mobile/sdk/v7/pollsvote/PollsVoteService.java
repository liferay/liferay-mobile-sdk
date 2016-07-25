package com.liferay.mobile.sdk.v7.pollsvote;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import org.json.JSONObject;

@Path("/polls.pollsvote")
public interface PollsVoteService {
  @Path("/add-vote")
  Call<JSONObject> addVote(@Param(name = "questionId") long questionId, @Param(name = "choiceId") long choiceId, @Param(name = "serviceContext", className = "") JSONObject serviceContext);
}
