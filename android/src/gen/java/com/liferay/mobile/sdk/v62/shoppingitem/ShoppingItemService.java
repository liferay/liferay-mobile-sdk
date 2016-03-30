package com.liferay.mobile.sdk.v62.shoppingitem;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.file.UploadData;
import com.liferay.mobile.sdk.http.Headers;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/shoppingitem")
public interface ShoppingItemService {
  @Path("/add-book-items")
  Call<Response> addBookItems(@Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("isbns") JSONArray isbns);

  @Path(
      value = "/add-item",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<JSONObject> addItem(@Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("sku") String sku, @Param("name") String name, @Param("description") String description, @Param("properties") String properties, @Param("fieldsQuantities") String fieldsQuantities, @Param("requiresShipping") boolean requiresShipping, @Param("stockQuantity") int stockQuantity, @Param("featured") boolean featured, @Param("sale") boolean sale, @Param("smallImage") boolean smallImage, @Param("smallImageURL") String smallImageURL, @Param("smallFile") UploadData smallFile, @Param("mediumImage") boolean mediumImage, @Param("mediumImageURL") String mediumImageURL, @Param("mediumFile") UploadData mediumFile, @Param("largeImage") boolean largeImage, @Param("largeImageURL") String largeImageURL, @Param("largeFile") UploadData largeFile, @Param("itemFields") JSONArray itemFields, @Param("itemPrices") JSONArray itemPrices, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-item")
  Call<Response> deleteItem(@Param("itemId") long itemId);

  @Path("/get-categories-items-count")
  Call<Integer> getCategoriesItemsCount(@Param("groupId") long groupId, @Param("categoryIds") JSONArray categoryIds);

  @Path("/get-item")
  Call<JSONObject> getItem(@Param("itemId") long itemId);

  @Path("/get-items")
  Call<JSONArray> getItems(@Param("groupId") long groupId, @Param("categoryId") long categoryId);

  @Path("/get-items")
  Call<JSONArray> getItems(@Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-items-count")
  Call<Integer> getItemsCount(@Param("groupId") long groupId, @Param("categoryId") long categoryId);

  @Path("/get-items-prev-and-next")
  Call<JSONArray> getItemsPrevAndNext(@Param("itemId") long itemId, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path(
      value = "/update-item",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<JSONObject> updateItem(@Param("itemId") long itemId, @Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("sku") String sku, @Param("name") String name, @Param("description") String description, @Param("properties") String properties, @Param("fieldsQuantities") String fieldsQuantities, @Param("requiresShipping") boolean requiresShipping, @Param("stockQuantity") int stockQuantity, @Param("featured") boolean featured, @Param("sale") boolean sale, @Param("smallImage") boolean smallImage, @Param("smallImageURL") String smallImageURL, @Param("smallFile") UploadData smallFile, @Param("mediumImage") boolean mediumImage, @Param("mediumImageURL") String mediumImageURL, @Param("mediumFile") UploadData mediumFile, @Param("largeImage") boolean largeImage, @Param("largeImageURL") String largeImageURL, @Param("largeFile") UploadData largeFile, @Param("itemFields") JSONArray itemFields, @Param("itemPrices") JSONArray itemPrices, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
