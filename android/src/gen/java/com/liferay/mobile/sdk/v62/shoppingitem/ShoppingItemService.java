package com.liferay.mobile.sdk.v62.shoppingitem;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.file.UploadData;
import com.liferay.mobile.sdk.http.ContentType;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/shoppingitem")
public interface ShoppingItemService {
  @Path("/add-book-items")
  Call<Response> addBookItems(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "isbns") JSONArray isbns);

  @Path(
      value = "/add-item",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> addItem(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "sku") String sku, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "properties") String properties, @Param(name = "fieldsQuantities") String fieldsQuantities, @Param(name = "requiresShipping") boolean requiresShipping, @Param(name = "stockQuantity") int stockQuantity, @Param(name = "featured") boolean featured, @Param(name = "sale") boolean sale, @Param(name = "smallImage") boolean smallImage, @Param(name = "smallImageURL") String smallImageURL, @Param(name = "smallFile") UploadData smallFile, @Param(name = "mediumImage") boolean mediumImage, @Param(name = "mediumImageURL") String mediumImageURL, @Param(name = "mediumFile") UploadData mediumFile, @Param(name = "largeImage") boolean largeImage, @Param(name = "largeImageURL") String largeImageURL, @Param(name = "largeFile") UploadData largeFile, @Param(name = "itemFields") JSONArray itemFields, @Param(name = "itemPrices") JSONArray itemPrices, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-item")
  Call<Response> deleteItem(@Param(name = "itemId") long itemId);

  @Path("/get-categories-items-count")
  Call<Integer> getCategoriesItemsCount(@Param(name = "groupId") long groupId, @Param(name = "categoryIds") JSONArray categoryIds);

  @Path("/get-item")
  Call<JSONObject> getItem(@Param(name = "itemId") long itemId);

  @Path("/get-items")
  Call<JSONArray> getItems(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId);

  @Path("/get-items")
  Call<JSONArray> getItems(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-items-count")
  Call<Integer> getItemsCount(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId);

  @Path("/get-items-prev-and-next")
  Call<JSONArray> getItemsPrevAndNext(@Param(name = "itemId") long itemId, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path(
      value = "/update-item",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> updateItem(@Param(name = "itemId") long itemId, @Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "sku") String sku, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "properties") String properties, @Param(name = "fieldsQuantities") String fieldsQuantities, @Param(name = "requiresShipping") boolean requiresShipping, @Param(name = "stockQuantity") int stockQuantity, @Param(name = "featured") boolean featured, @Param(name = "sale") boolean sale, @Param(name = "smallImage") boolean smallImage, @Param(name = "smallImageURL") String smallImageURL, @Param(name = "smallFile") UploadData smallFile, @Param(name = "mediumImage") boolean mediumImage, @Param(name = "mediumImageURL") String mediumImageURL, @Param(name = "mediumFile") UploadData mediumFile, @Param(name = "largeImage") boolean largeImage, @Param(name = "largeImageURL") String largeImageURL, @Param(name = "largeFile") UploadData largeFile, @Param(name = "itemFields") JSONArray itemFields, @Param(name = "itemPrices") JSONArray itemPrices, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
