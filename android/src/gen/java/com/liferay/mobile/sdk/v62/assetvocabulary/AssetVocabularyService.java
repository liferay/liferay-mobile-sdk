package com.liferay.mobile.sdk.v62.assetvocabulary;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assetvocabulary")
public interface AssetVocabularyService {
  @Path("/add-vocabulary")
  Call<JSONObject> addVocabulary(@Param("title") String title, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-vocabulary")
  Call<JSONObject> addVocabulary(@JsonObject(name = "titleMap", className = "") JSONObject titleMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("settings") String settings, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-vocabulary")
  Call<JSONObject> addVocabulary(@Param("title") String title, @JsonObject(name = "titleMap", className = "") JSONObject titleMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("settings") String settings, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-vocabularies")
  Call<Response> deleteVocabularies(@Param("vocabularyIds") JSONArray vocabularyIds);

  @Path("/delete-vocabularies")
  Call<JSONArray> deleteVocabularies(@Param("vocabularyIds") JSONArray vocabularyIds, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-vocabulary")
  Call<Response> deleteVocabulary(@Param("vocabularyId") long vocabularyId);

  @Path("/get-company-vocabularies")
  Call<JSONArray> getCompanyVocabularies(@Param("companyId") long companyId);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param("groupId") long groupId);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param("groupId") long groupId, @Param("createDefaultVocabulary") boolean createDefaultVocabulary);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param("groupId") long groupId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param("groupId") long groupId, @Param("name") String name, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-vocabularies-count")
  Call<Integer> getGroupVocabulariesCount(@Param("groupId") long groupId);

  @Path("/get-group-vocabularies-count")
  Call<Integer> getGroupVocabulariesCount(@Param("groupId") long groupId, @Param("name") String name);

  @Path("/get-group-vocabularies-display")
  Call<JSONObject> getGroupVocabulariesDisplay(@Param("groupId") long groupId, @Param("name") String name, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-vocabularies-display")
  Call<JSONObject> getGroupVocabulariesDisplay(@Param("groupId") long groupId, @Param("name") String name, @Param("start") int start, @Param("end") int end, @Param("addDefaultVocabulary") boolean addDefaultVocabulary, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-groups-vocabularies")
  Call<JSONArray> getGroupsVocabularies(@Param("groupIds") JSONArray groupIds);

  @Path("/get-groups-vocabularies")
  Call<JSONArray> getGroupsVocabularies(@Param("groupIds") JSONArray groupIds, @Param("className") String className);

  @Path("/get-json-group-vocabularies")
  Call<JSONObject> getJsonGroupVocabularies(@Param("groupId") long groupId, @Param("name") String name, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-vocabularies")
  Call<JSONArray> getVocabularies(@Param("vocabularyIds") JSONArray vocabularyIds);

  @Path("/get-vocabulary")
  Call<JSONObject> getVocabulary(@Param("vocabularyId") long vocabularyId);

  @Path("/update-vocabulary")
  Call<JSONObject> updateVocabulary(@Param("vocabularyId") long vocabularyId, @JsonObject(name = "titleMap", className = "") JSONObject titleMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("settings") String settings, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-vocabulary")
  Call<JSONObject> updateVocabulary(@Param("vocabularyId") long vocabularyId, @Param("title") String title, @JsonObject(name = "titleMap", className = "") JSONObject titleMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("settings") String settings, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
