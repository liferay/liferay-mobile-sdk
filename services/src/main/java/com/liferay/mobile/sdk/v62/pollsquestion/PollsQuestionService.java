package com.liferay.mobile.sdk.v62.pollsquestion;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/pollsquestion")
public interface PollsQuestionService {
  @Path("/add-question")
  Call<JSONObject> addQuestion(@Param(name = "titleMap") JSONObject titleMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "expirationDateMonth") int expirationDateMonth, @Param(name = "expirationDateDay") int expirationDateDay, @Param(name = "expirationDateYear") int expirationDateYear, @Param(name = "expirationDateHour") int expirationDateHour, @Param(name = "expirationDateMinute") int expirationDateMinute, @Param(name = "neverExpire") boolean neverExpire, @Param(name = "choices") JSONArray choices, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-question")
  Call<Response> deleteQuestion(@Param(name = "questionId") long questionId);

  @Path("/get-question")
  Call<JSONObject> getQuestion(@Param(name = "questionId") long questionId);

  @Path("/update-question")
  Call<JSONObject> updateQuestion(@Param(name = "questionId") long questionId, @Param(name = "titleMap") JSONObject titleMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "expirationDateMonth") int expirationDateMonth, @Param(name = "expirationDateDay") int expirationDateDay, @Param(name = "expirationDateYear") int expirationDateYear, @Param(name = "expirationDateHour") int expirationDateHour, @Param(name = "expirationDateMinute") int expirationDateMinute, @Param(name = "neverExpire") boolean neverExpire, @Param(name = "choices") JSONArray choices, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
