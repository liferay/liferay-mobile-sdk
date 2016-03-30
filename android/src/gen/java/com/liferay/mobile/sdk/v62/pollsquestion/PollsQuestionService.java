package com.liferay.mobile.sdk.v62.pollsquestion;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/pollsquestion")
public interface PollsQuestionService {
  @Path("/add-question")
  Call<JSONObject> addQuestion(@JsonObject(name = "titleMap", className = "") JSONObject titleMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("expirationDateMonth") int expirationDateMonth, @Param("expirationDateDay") int expirationDateDay, @Param("expirationDateYear") int expirationDateYear, @Param("expirationDateHour") int expirationDateHour, @Param("expirationDateMinute") int expirationDateMinute, @Param("neverExpire") boolean neverExpire, @Param("choices") JSONArray choices, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-question")
  Call<Response> deleteQuestion(@Param("questionId") long questionId);

  @Path("/get-question")
  Call<JSONObject> getQuestion(@Param("questionId") long questionId);

  @Path("/update-question")
  Call<JSONObject> updateQuestion(@Param("questionId") long questionId, @JsonObject(name = "titleMap", className = "") JSONObject titleMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("expirationDateMonth") int expirationDateMonth, @Param("expirationDateDay") int expirationDateDay, @Param("expirationDateYear") int expirationDateYear, @Param("expirationDateHour") int expirationDateHour, @Param("expirationDateMinute") int expirationDateMinute, @Param("neverExpire") boolean neverExpire, @Param("choices") JSONArray choices, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
