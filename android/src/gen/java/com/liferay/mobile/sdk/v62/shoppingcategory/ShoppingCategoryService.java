package com.liferay.mobile.sdk.v62.shoppingcategory;

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/shoppingcategory")
public interface ShoppingCategoryService {
  @Path("/add-category")
  Call<JSONObject> addCategory(@Param("parentCategoryId") long parentCategoryId, @Param("name") String name, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-category")
  Call<Response> deleteCategory(@Param("categoryId") long categoryId);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param("groupId") long groupId);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param("groupId") long groupId, @Param("parentCategoryId") long parentCategoryId, @Param("start") int start, @Param("end") int end);

  @Path("/get-categories-count")
  Call<Integer> getCategoriesCount(@Param("groupId") long groupId, @Param("parentCategoryId") long parentCategoryId);

  @Path("/get-category")
  Call<JSONObject> getCategory(@Param("categoryId") long categoryId);

  @Path("/get-subcategory-ids")
  Call<Response> getSubcategoryIds(@Param("categoryIds") JSONArray categoryIds, @Param("groupId") long groupId, @Param("categoryId") long categoryId);

  @Path("/update-category")
  Call<JSONObject> updateCategory(@Param("categoryId") long categoryId, @Param("parentCategoryId") long parentCategoryId, @Param("name") String name, @Param("description") String description, @Param("mergeWithParentCategory") boolean mergeWithParentCategory, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
