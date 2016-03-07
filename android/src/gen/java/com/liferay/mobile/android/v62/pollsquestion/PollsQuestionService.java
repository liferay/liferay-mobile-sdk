package com.liferay.mobile.android.v62.pollsquestion;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
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
