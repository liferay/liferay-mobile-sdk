package com.liferay.mobile.android.v62.pollsvote;

import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import org.json.JSONObject;

@Path("/pollsvote")
public interface PollsVoteService {
  @Path("/add-vote")
  Call<JSONObject> addVote(@Param("questionId") long questionId, @Param("choiceId") long choiceId, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
