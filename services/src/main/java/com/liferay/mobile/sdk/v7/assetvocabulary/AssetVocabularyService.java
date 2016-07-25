package com.liferay.mobile.sdk.v7.assetvocabulary;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assetvocabulary")
public interface AssetVocabularyService {
  @Path("/add-vocabulary")
  Call<JSONObject> addVocabulary(@Param(name = "groupId") long groupId, @Param(name = "title") String title, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-vocabulary")
  Call<JSONObject> addVocabulary(@Param(name = "groupId") long groupId, @Param(name = "title") String title, @Param(name = "titleMap") Map titleMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "settings") String settings, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-vocabularies")
  Call<JSONArray> deleteVocabularies(@Param(name = "vocabularyIds") JSONArray vocabularyIds, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-vocabulary")
  Call<Response> deleteVocabulary(@Param(name = "vocabularyId") long vocabularyId);

  @Path("/fetch-vocabulary")
  Call<JSONObject> fetchVocabulary(@Param(name = "vocabularyId") long vocabularyId);

  @Path("/get-company-vocabularies")
  Call<JSONArray> getCompanyVocabularies(@Param(name = "companyId") long companyId);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param(name = "groupIds") JSONArray groupIds);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param(name = "groupId") long groupId);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param(name = "groupId") long groupId, @Param(name = "createDefaultVocabulary") boolean createDefaultVocabulary);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param(name = "groupId") long groupId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetVocabulary>") JSONObject obc);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetVocabulary>") JSONObject obc);

  @Path("/get-group-vocabularies")
  Call<JSONArray> getGroupVocabularies(@Param(name = "groupId") long groupId, @Param(name = "createDefaultVocabulary") boolean createDefaultVocabulary, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetVocabulary>") JSONObject obc);

  @Path("/get-group-vocabularies-count")
  Call<Integer> getGroupVocabulariesCount(@Param(name = "groupIds") JSONArray groupIds);

  @Path("/get-group-vocabularies-count")
  Call<Integer> getGroupVocabulariesCount(@Param(name = "groupId") long groupId);

  @Path("/get-group-vocabularies-count")
  Call<Integer> getGroupVocabulariesCount(@Param(name = "groupId") long groupId, @Param(name = "name") String name);

  @Path("/get-group-vocabularies-display")
  Call<JSONObject> getGroupVocabulariesDisplay(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetVocabulary>") JSONObject obc);

  @Path("/get-group-vocabularies-display")
  Call<JSONObject> getGroupVocabulariesDisplay(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "addDefaultVocabulary") boolean addDefaultVocabulary, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetVocabulary>") JSONObject obc);

  @Path("/get-groups-vocabularies")
  Call<JSONArray> getGroupsVocabularies(@Param(name = "groupIds") JSONArray groupIds);

  @Path("/get-groups-vocabularies")
  Call<JSONArray> getGroupsVocabularies(@Param(name = "groupIds") JSONArray groupIds, @Param(name = "className") String className);

  @Path("/get-groups-vocabularies")
  Call<JSONArray> getGroupsVocabularies(@Param(name = "groupIds") JSONArray groupIds, @Param(name = "className") String className, @Param(name = "classTypePK") long classTypePK);

  @Path("/get-vocabularies")
  Call<JSONArray> getVocabularies(@Param(name = "vocabularyIds") JSONArray vocabularyIds);

  @Path("/get-vocabulary")
  Call<JSONObject> getVocabulary(@Param(name = "vocabularyId") long vocabularyId);

  @Path("/search-vocabularies-display")
  Call<JSONObject> searchVocabulariesDisplay(@Param(name = "groupId") long groupId, @Param(name = "title") String title, @Param(name = "addDefaultVocabulary") boolean addDefaultVocabulary, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/search-vocabularies-display")
  Call<JSONObject> searchVocabulariesDisplay(@Param(name = "groupId") long groupId, @Param(name = "title") String title, @Param(name = "addDefaultVocabulary") boolean addDefaultVocabulary, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "sort", className = "com.liferay.portal.kernel.search.Sort") JSONObject sort);

  @Path("/update-vocabulary")
  Call<JSONObject> updateVocabulary(@Param(name = "vocabularyId") long vocabularyId, @Param(name = "title") String title, @Param(name = "titleMap") Map titleMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "settings") String settings, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
