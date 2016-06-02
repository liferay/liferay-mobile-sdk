package com.liferay.mobile.sdk.v62.shoppingcategory;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/shoppingcategory")
public interface ShoppingCategoryService {
  @Path("/add-category")
  Call<JSONObject> addCategory(@Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-category")
  Call<Response> deleteCategory(@Param(name = "categoryId") long categoryId);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param(name = "groupId") long groupId);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param(name = "groupId") long groupId, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-categories-count")
  Call<Integer> getCategoriesCount(@Param(name = "groupId") long groupId, @Param(name = "parentCategoryId") long parentCategoryId);

  @Path("/get-category")
  Call<JSONObject> getCategory(@Param(name = "categoryId") long categoryId);

  @Path("/get-subcategory-ids")
  Call<Response> getSubcategoryIds(@Param(name = "categoryIds") JSONArray categoryIds, @Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId);

  @Path("/update-category")
  Call<JSONObject> updateCategory(@Param(name = "categoryId") long categoryId, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "mergeWithParentCategory") boolean mergeWithParentCategory, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
