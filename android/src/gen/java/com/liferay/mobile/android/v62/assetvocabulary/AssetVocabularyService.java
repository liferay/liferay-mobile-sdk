package com.liferay.mobile.android.v62.assetvocabulary;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assetvocabulary")
public interface AssetVocabularyService {
  @Path("/add-vocabulary")
  Call<JSONObject> addVocabulary(@Param("title") String title, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/add-vocabulary")
  Call<JSONObject> addVocabulary(@Param("titleMap") JSONObject titleMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("settings") String settings, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/add-vocabulary")
  Call<JSONObject> addVocabulary(@Param("title") String title, @Param("titleMap") JSONObject titleMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("settings") String settings, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-vocabularies")
  Call<Response> deleteVocabularies(@Param("vocabularyIds") JSONArray vocabularyIds);

  @Path("/delete-vocabularies")
  Call<JSONArray> deleteVocabularies(@Param("vocabularyIds") JSONArray vocabularyIds, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-vocabulary")
  Call<Response> deleteVocabulary(@Param("vocabularyId") long vocabularyId);

  @Path("/get-company-vocabularies")
  Call<JSONArray> getCompanyVocabularies(@Param("companyId") long companyId);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param("groupId") long groupId);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param("groupId") long groupId, @Param("createDefaultVocabulary") boolean createDefaultVocabulary);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param("groupId") long groupId, @Param("start") int start, @Param("end") int end, @Param("obc") JSONObjectWrapper obc);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param("groupId") long groupId, @Param("name") String name, @Param("start") int start, @Param("end") int end, @Param("obc") JSONObjectWrapper obc);

  @Path("/get-group-vocabularies-count")
  Call<Integer> getGroupVocabulariesCount(@Param("groupId") long groupId);

  @Path("/get-group-vocabularies-count")
  Call<Integer> getGroupVocabulariesCount(@Param("groupId") long groupId, @Param("name") String name);

  @Path("/get-group-vocabularies-display")
  Call<JSONObject> getGroupVocabulariesDisplay(@Param("groupId") long groupId, @Param("name") String name, @Param("start") int start, @Param("end") int end, @Param("obc") JSONObjectWrapper obc);

  @Path("/get-group-vocabularies-display")
  Call<JSONObject> getGroupVocabulariesDisplay(@Param("groupId") long groupId, @Param("name") String name, @Param("start") int start, @Param("end") int end, @Param("addDefaultVocabulary") boolean addDefaultVocabulary, @Param("obc") JSONObjectWrapper obc);

  @Path("/get-groups-vocabularies")
  Call<JSONArray> getGroupsVocabularies(@Param("groupIds") JSONArray groupIds);

  @Path("/get-groups-vocabularies")
  Call<JSONArray> getGroupsVocabularies(@Param("groupIds") JSONArray groupIds, @Param("className") String className);

  @Path("/get-json-group-vocabularies")
  Call<JSONObject> getJsonGroupVocabularies(@Param("groupId") long groupId, @Param("name") String name, @Param("start") int start, @Param("end") int end, @Param("obc") JSONObjectWrapper obc);

  @Path("/get-vocabularies")
  Call<JSONArray> getVocabularies(@Param("vocabularyIds") JSONArray vocabularyIds);

  @Path("/get-vocabulary")
  Call<JSONObject> getVocabulary(@Param("vocabularyId") long vocabularyId);

  @Path("/update-vocabulary")
  Call<JSONObject> updateVocabulary(@Param("vocabularyId") long vocabularyId, @Param("titleMap") JSONObject titleMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("settings") String settings, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/update-vocabulary")
  Call<JSONObject> updateVocabulary(@Param("vocabularyId") long vocabularyId, @Param("title") String title, @Param("titleMap") JSONObject titleMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("settings") String settings, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
