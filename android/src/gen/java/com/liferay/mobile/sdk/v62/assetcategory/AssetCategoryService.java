package com.liferay.mobile.sdk.v62.assetcategory;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assetcategory")
public interface AssetCategoryService {
  @Path("/add-category")
  Call<JSONObject> addCategory(@Param("title") String title, @Param("vocabularyId") long vocabularyId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-category")
  Call<JSONObject> addCategory(@Param("parentCategoryId") long parentCategoryId, @ParamObject(name = "titleMap", className = "") JSONObject titleMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("vocabularyId") long vocabularyId, @Param("categoryProperties") JSONArray categoryProperties, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-categories")
  Call<Response> deleteCategories(@Param("categoryIds") JSONArray categoryIds);

  @Path("/delete-categories")
  Call<JSONArray> deleteCategories(@Param("categoryIds") JSONArray categoryIds, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-category")
  Call<Response> deleteCategory(@Param("categoryId") long categoryId);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param("className") String className, @Param("classPK") long classPK);

  @Path("/get-category")
  Call<JSONObject> getCategory(@Param("categoryId") long categoryId);

  @Path("/get-child-categories")
  Call<JSONArray> getChildCategories(@Param("parentCategoryId") long parentCategoryId);

  @Path("/get-child-categories")
  Call<JSONArray> getChildCategories(@Param("parentCategoryId") long parentCategoryId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-json-search")
  Call<JSONArray> getJsonSearch(@Param("groupId") long groupId, @Param("name") String name, @Param("vocabularyIds") JSONArray vocabularyIds, @Param("start") int start, @Param("end") int end);

  @Path("/get-json-vocabulary-categories")
  Call<JSONObject> getJsonVocabularyCategories(@Param("vocabularyId") long vocabularyId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-json-vocabulary-categories")
  Call<JSONObject> getJsonVocabularyCategories(@Param("groupId") long groupId, @Param("name") String name, @Param("vocabularyId") long vocabularyId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-vocabulary-categories")
  Call<JSONArray> getVocabularyCategories(@Param("vocabularyId") long vocabularyId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-vocabulary-categories")
  Call<JSONArray> getVocabularyCategories(@Param("parentCategoryId") long parentCategoryId, @Param("vocabularyId") long vocabularyId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-vocabulary-categories")
  Call<JSONArray> getVocabularyCategories(@Param("groupId") long groupId, @Param("name") String name, @Param("vocabularyId") long vocabularyId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-vocabulary-categories-count")
  Call<Integer> getVocabularyCategoriesCount(@Param("groupId") long groupId, @Param("vocabularyId") long vocabularyId);

  @Path("/get-vocabulary-categories-count")
  Call<Integer> getVocabularyCategoriesCount(@Param("groupId") long groupId, @Param("name") String name, @Param("vocabularyId") long vocabularyId);

  @Path("/get-vocabulary-categories-display")
  Call<JSONObject> getVocabularyCategoriesDisplay(@Param("vocabularyId") long vocabularyId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-vocabulary-categories-display")
  Call<JSONObject> getVocabularyCategoriesDisplay(@Param("groupId") long groupId, @Param("name") String name, @Param("vocabularyId") long vocabularyId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-vocabulary-root-categories")
  Call<JSONArray> getVocabularyRootCategories(@Param("vocabularyId") long vocabularyId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-vocabulary-root-categories")
  Call<JSONArray> getVocabularyRootCategories(@Param("groupId") long groupId, @Param("vocabularyId") long vocabularyId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-vocabulary-root-categories-count")
  Call<Integer> getVocabularyRootCategoriesCount(@Param("groupId") long groupId, @Param("vocabularyId") long vocabularyId);

  @Path("/move-category")
  Call<JSONObject> moveCategory(@Param("categoryId") long categoryId, @Param("parentCategoryId") long parentCategoryId, @Param("vocabularyId") long vocabularyId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/search")
  Call<JSONArray> search(@Param("groupId") long groupId, @Param("name") String name, @Param("categoryProperties") JSONArray categoryProperties, @Param("start") int start, @Param("end") int end);

  @Path("/search")
  Call<JSONArray> search(@Param("groupIds") JSONArray groupIds, @Param("name") String name, @Param("vocabularyIds") JSONArray vocabularyIds, @Param("start") int start, @Param("end") int end);

  @Path("/search")
  Call<JSONArray> search(@Param("groupId") long groupId, @Param("keywords") String keywords, @Param("vocabularyId") long vocabularyId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/update-category")
  Call<JSONObject> updateCategory(@Param("categoryId") long categoryId, @Param("parentCategoryId") long parentCategoryId, @ParamObject(name = "titleMap", className = "") JSONObject titleMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("vocabularyId") long vocabularyId, @Param("categoryProperties") JSONArray categoryProperties, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
