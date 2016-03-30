package com.liferay.mobile.sdk.v62.mbcategory;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.annotation.JsonObject;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/mbcategory")
public interface MBCategoryService {
  @Path("/add-category")
  Call<JSONObject> addCategory(@Param("parentCategoryId") long parentCategoryId, @Param("name") String name, @Param("description") String description, @Param("displayStyle") String displayStyle, @Param("emailAddress") String emailAddress, @Param("inProtocol") String inProtocol, @Param("inServerName") String inServerName, @Param("inServerPort") int inServerPort, @Param("inUseSSL") boolean inUseSSL, @Param("inUserName") String inUserName, @Param("inPassword") String inPassword, @Param("inReadInterval") int inReadInterval, @Param("outEmailAddress") String outEmailAddress, @Param("outCustom") boolean outCustom, @Param("outServerName") String outServerName, @Param("outServerPort") int outServerPort, @Param("outUseSSL") boolean outUseSSL, @Param("outUserName") String outUserName, @Param("outPassword") String outPassword, @Param("mailingListActive") boolean mailingListActive, @Param("allowAnonymousEmail") boolean allowAnonymousEmail, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-category")
  Call<JSONObject> addCategory(@Param("userId") long userId, @Param("parentCategoryId") long parentCategoryId, @Param("name") String name, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-category")
  Call<Response> deleteCategory(@Param("categoryId") long categoryId, @Param("includeTrashedEntries") boolean includeTrashedEntries);

  @Path("/delete-category")
  Call<Response> deleteCategory(@Param("groupId") long groupId, @Param("categoryId") long categoryId);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param("groupId") long groupId);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param("groupId") long groupId, @Param("status") int status);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param("groupId") long groupId, @Param("parentCategoryId") long parentCategoryId, @Param("start") int start, @Param("end") int end);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param("groupId") long groupId, @Param("parentCategoryIds") JSONArray parentCategoryIds, @Param("start") int start, @Param("end") int end);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param("groupId") long groupId, @Param("parentCategoryId") long parentCategoryId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param("groupId") long groupId, @Param("parentCategoryIds") JSONArray parentCategoryIds, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-categories-count")
  Call<Integer> getCategoriesCount(@Param("groupId") long groupId, @Param("parentCategoryId") long parentCategoryId);

  @Path("/get-categories-count")
  Call<Integer> getCategoriesCount(@Param("groupId") long groupId, @Param("parentCategoryIds") JSONArray parentCategoryIds);

  @Path("/get-categories-count")
  Call<Integer> getCategoriesCount(@Param("groupId") long groupId, @Param("parentCategoryId") long parentCategoryId, @Param("status") int status);

  @Path("/get-categories-count")
  Call<Integer> getCategoriesCount(@Param("groupId") long groupId, @Param("parentCategoryIds") JSONArray parentCategoryIds, @Param("status") int status);

  @Path("/get-category")
  Call<JSONObject> getCategory(@Param("categoryId") long categoryId);

  @Path("/get-category-ids")
  Call<JSONArray> getCategoryIds(@Param("groupId") long groupId, @Param("categoryId") long categoryId);

  @Path("/get-subcategory-ids")
  Call<JSONArray> getSubcategoryIds(@Param("categoryIds") JSONArray categoryIds, @Param("groupId") long groupId, @Param("categoryId") long categoryId);

  @Path("/get-subscribed-categories")
  Call<JSONArray> getSubscribedCategories(@Param("groupId") long groupId, @Param("userId") long userId, @Param("start") int start, @Param("end") int end);

  @Path("/get-subscribed-categories-count")
  Call<Integer> getSubscribedCategoriesCount(@Param("groupId") long groupId, @Param("userId") long userId);

  @Path("/move-category")
  Call<JSONObject> moveCategory(@Param("categoryId") long categoryId, @Param("parentCategoryId") long parentCategoryId, @Param("mergeWithParentCategory") boolean mergeWithParentCategory);

  @Path("/move-category-from-trash")
  Call<JSONObject> moveCategoryFromTrash(@Param("categoryId") long categoryId, @Param("newCategoryId") long newCategoryId);

  @Path("/move-category-to-trash")
  Call<JSONObject> moveCategoryToTrash(@Param("categoryId") long categoryId);

  @Path("/restore-category-from-trash")
  Call<Response> restoreCategoryFromTrash(@Param("categoryId") long categoryId);

  @Path("/subscribe-category")
  Call<Response> subscribeCategory(@Param("groupId") long groupId, @Param("categoryId") long categoryId);

  @Path("/unsubscribe-category")
  Call<Response> unsubscribeCategory(@Param("groupId") long groupId, @Param("categoryId") long categoryId);

  @Path("/update-category")
  Call<JSONObject> updateCategory(@Param("categoryId") long categoryId, @Param("parentCategoryId") long parentCategoryId, @Param("name") String name, @Param("description") String description, @Param("displayStyle") String displayStyle, @Param("emailAddress") String emailAddress, @Param("inProtocol") String inProtocol, @Param("inServerName") String inServerName, @Param("inServerPort") int inServerPort, @Param("inUseSSL") boolean inUseSSL, @Param("inUserName") String inUserName, @Param("inPassword") String inPassword, @Param("inReadInterval") int inReadInterval, @Param("outEmailAddress") String outEmailAddress, @Param("outCustom") boolean outCustom, @Param("outServerName") String outServerName, @Param("outServerPort") int outServerPort, @Param("outUseSSL") boolean outUseSSL, @Param("outUserName") String outUserName, @Param("outPassword") String outPassword, @Param("mailingListActive") boolean mailingListActive, @Param("allowAnonymousEmail") boolean allowAnonymousEmail, @Param("mergeWithParentCategory") boolean mergeWithParentCategory, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
