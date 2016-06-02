package com.liferay.mobile.sdk.v62.assetvocabulary;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assetvocabulary")
public interface AssetVocabularyService {
  @Path("/add-vocabulary")
  Call<JSONObject> addVocabulary(@Param(name = "title") String title, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-vocabulary")
  Call<JSONObject> addVocabulary(@ParamObject(name = "titleMap", className = "") JSONObject titleMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "settings") String settings, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-vocabulary")
  Call<JSONObject> addVocabulary(@Param(name = "title") String title, @ParamObject(name = "titleMap", className = "") JSONObject titleMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "settings") String settings, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-vocabularies")
  Call<Response> deleteVocabularies(@Param(name = "vocabularyIds") JSONArray vocabularyIds);

  @Path("/delete-vocabularies")
  Call<JSONArray> deleteVocabularies(@Param(name = "vocabularyIds") JSONArray vocabularyIds, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-vocabulary")
  Call<Response> deleteVocabulary(@Param(name = "vocabularyId") long vocabularyId);

  @Path("/get-company-vocabularies")
  Call<JSONArray> getCompanyVocabularies(@Param(name = "companyId") long companyId);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param(name = "groupId") long groupId);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param(name = "groupId") long groupId, @Param(name = "createDefaultVocabulary") boolean createDefaultVocabulary);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param(name = "groupId") long groupId, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-vocabularies-count")
  Call<Integer> getGroupVocabulariesCount(@Param(name = "groupId") long groupId);

  @Path("/get-group-vocabularies-count")
  Call<Integer> getGroupVocabulariesCount(@Param(name = "groupId") long groupId, @Param(name = "name") String name);

  @Path("/get-group-vocabularies-display")
  Call<JSONObject> getGroupVocabulariesDisplay(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-vocabularies-display")
  Call<JSONObject> getGroupVocabulariesDisplay(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "addDefaultVocabulary") boolean addDefaultVocabulary, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-groups-vocabularies")
  Call<JSONArray> getGroupsVocabularies(@Param(name = "groupIds") JSONArray groupIds);

  @Path("/get-groups-vocabularies")
  Call<JSONArray> getGroupsVocabularies(@Param(name = "groupIds") JSONArray groupIds, @Param(name = "className") String className);

  @Path("/get-json-group-vocabularies")
  Call<JSONObject> getJsonGroupVocabularies(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-vocabularies")
  Call<JSONArray> getVocabularies(@Param(name = "vocabularyIds") JSONArray vocabularyIds);

  @Path("/get-vocabulary")
  Call<JSONObject> getVocabulary(@Param(name = "vocabularyId") long vocabularyId);

  @Path("/update-vocabulary")
  Call<JSONObject> updateVocabulary(@Param(name = "vocabularyId") long vocabularyId, @ParamObject(name = "titleMap", className = "") JSONObject titleMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "settings") String settings, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-vocabulary")
  Call<JSONObject> updateVocabulary(@Param(name = "vocabularyId") long vocabularyId, @Param(name = "title") String title, @ParamObject(name = "titleMap", className = "") JSONObject titleMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "settings") String settings, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
