package com.liferay.mobile.sdk.v62.assetcategoryproperty;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assetcategoryproperty")
public interface AssetCategoryPropertyService {
  @Path("/add-category-property")
  Call<JSONObject> addCategoryProperty(@Param("entryId") long entryId, @Param("key") String key, @Param("value") String value);

  @Path("/delete-category-property")
  Call<Response> deleteCategoryProperty(@Param("categoryPropertyId") long categoryPropertyId);

  @Path("/get-category-properties")
  Call<JSONArray> getCategoryProperties(@Param("entryId") long entryId);

  @Path("/get-category-property-values")
  Call<JSONArray> getCategoryPropertyValues(@Param("companyId") long companyId, @Param("key") String key);

  @Path("/update-category-property")
  Call<JSONObject> updateCategoryProperty(@Param("categoryPropertyId") long categoryPropertyId, @Param("key") String key, @Param("value") String value);
}
