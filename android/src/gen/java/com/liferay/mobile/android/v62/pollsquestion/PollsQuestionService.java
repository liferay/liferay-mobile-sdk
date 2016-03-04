package com.liferay.mobile.android.v62.pollsquestion;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/pollsquestion")
public interface PollsQuestionService {
  @Path("/add-question")
  Call<JSONObject> addQuestion(@Param("titleMap") JSONObject titleMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("expirationDateMonth") int expirationDateMonth, @Param("expirationDateDay") int expirationDateDay, @Param("expirationDateYear") int expirationDateYear, @Param("expirationDateHour") int expirationDateHour, @Param("expirationDateMinute") int expirationDateMinute, @Param("neverExpire") boolean neverExpire, @Param("choices") JSONArray choices, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-question")
  Call<Response> deleteQuestion(@Param("questionId") long questionId);

  @Path("/get-question")
  Call<JSONObject> getQuestion(@Param("questionId") long questionId);

  @Path("/update-question")
  Call<JSONObject> updateQuestion(@Param("questionId") long questionId, @Param("titleMap") JSONObject titleMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("expirationDateMonth") int expirationDateMonth, @Param("expirationDateDay") int expirationDateDay, @Param("expirationDateYear") int expirationDateYear, @Param("expirationDateHour") int expirationDateHour, @Param("expirationDateMinute") int expirationDateMinute, @Param("neverExpire") boolean neverExpire, @Param("choices") JSONArray choices, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
