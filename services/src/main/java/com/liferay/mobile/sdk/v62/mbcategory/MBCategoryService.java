package com.liferay.mobile.sdk.v62.mbcategory;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/mbcategory")
public interface MBCategoryService {
  @Path("/add-category")
  Call<JSONObject> addCategory(@Param(name = "userId") long userId, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-category")
  Call<JSONObject> addCategory(@Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "displayStyle") String displayStyle, @Param(name = "emailAddress") String emailAddress, @Param(name = "inProtocol") String inProtocol, @Param(name = "inServerName") String inServerName, @Param(name = "inServerPort") int inServerPort, @Param(name = "inUseSSL") boolean inUseSSL, @Param(name = "inUserName") String inUserName, @Param(name = "inPassword") String inPassword, @Param(name = "inReadInterval") int inReadInterval, @Param(name = "outEmailAddress") String outEmailAddress, @Param(name = "outCustom") boolean outCustom, @Param(name = "outServerName") String outServerName, @Param(name = "outServerPort") int outServerPort, @Param(name = "outUseSSL") boolean outUseSSL, @Param(name = "outUserName") String outUserName, @Param(name = "outPassword") String outPassword, @Param(name = "mailingListActive") boolean mailingListActive, @Param(name = "allowAnonymousEmail") boolean allowAnonymousEmail, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-category")
  Call<Response> deleteCategory(@Param(name = "categoryId") long categoryId, @Param(name = "includeTrashedEntries") boolean includeTrashedEntries);

  @Path("/delete-category")
  Call<Response> deleteCategory(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param(name = "groupId") long groupId);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param(name = "groupId") long groupId, @Param(name = "status") int status);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param(name = "groupId") long groupId, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param(name = "groupId") long groupId, @Param(name = "parentCategoryIds") JSONArray parentCategoryIds, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param(name = "groupId") long groupId, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param(name = "groupId") long groupId, @Param(name = "parentCategoryIds") JSONArray parentCategoryIds, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-categories-count")
  Call<Integer> getCategoriesCount(@Param(name = "groupId") long groupId, @Param(name = "parentCategoryId") long parentCategoryId);

  @Path("/get-categories-count")
  Call<Integer> getCategoriesCount(@Param(name = "groupId") long groupId, @Param(name = "parentCategoryIds") JSONArray parentCategoryIds);

  @Path("/get-categories-count")
  Call<Integer> getCategoriesCount(@Param(name = "groupId") long groupId, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "status") int status);

  @Path("/get-categories-count")
  Call<Integer> getCategoriesCount(@Param(name = "groupId") long groupId, @Param(name = "parentCategoryIds") JSONArray parentCategoryIds, @Param(name = "status") int status);

  @Path("/get-category")
  Call<JSONObject> getCategory(@Param(name = "categoryId") long categoryId);

  @Path("/get-category-ids")
  Call<JSONArray> getCategoryIds(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId);

  @Path("/get-subcategory-ids")
  Call<JSONArray> getSubcategoryIds(@Param(name = "categoryIds") JSONArray categoryIds, @Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId);

  @Path("/get-subscribed-categories")
  Call<JSONArray> getSubscribedCategories(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-subscribed-categories-count")
  Call<Integer> getSubscribedCategoriesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId);

  @Path("/move-category")
  Call<JSONObject> moveCategory(@Param(name = "categoryId") long categoryId, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "mergeWithParentCategory") boolean mergeWithParentCategory);

  @Path("/move-category-from-trash")
  Call<JSONObject> moveCategoryFromTrash(@Param(name = "categoryId") long categoryId, @Param(name = "newCategoryId") long newCategoryId);

  @Path("/move-category-to-trash")
  Call<JSONObject> moveCategoryToTrash(@Param(name = "categoryId") long categoryId);

  @Path("/restore-category-from-trash")
  Call<Response> restoreCategoryFromTrash(@Param(name = "categoryId") long categoryId);

  @Path("/subscribe-category")
  Call<Response> subscribeCategory(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId);

  @Path("/unsubscribe-category")
  Call<Response> unsubscribeCategory(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId);

  @Path("/update-category")
  Call<JSONObject> updateCategory(@Param(name = "categoryId") long categoryId, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "displayStyle") String displayStyle, @Param(name = "emailAddress") String emailAddress, @Param(name = "inProtocol") String inProtocol, @Param(name = "inServerName") String inServerName, @Param(name = "inServerPort") int inServerPort, @Param(name = "inUseSSL") boolean inUseSSL, @Param(name = "inUserName") String inUserName, @Param(name = "inPassword") String inPassword, @Param(name = "inReadInterval") int inReadInterval, @Param(name = "outEmailAddress") String outEmailAddress, @Param(name = "outCustom") boolean outCustom, @Param(name = "outServerName") String outServerName, @Param(name = "outServerPort") int outServerPort, @Param(name = "outUseSSL") boolean outUseSSL, @Param(name = "outUserName") String outUserName, @Param(name = "outPassword") String outPassword, @Param(name = "mailingListActive") boolean mailingListActive, @Param(name = "allowAnonymousEmail") boolean allowAnonymousEmail, @Param(name = "mergeWithParentCategory") boolean mergeWithParentCategory, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
