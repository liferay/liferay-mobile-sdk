package com.liferay.mobile.sdk.v62.assetcategoryproperty;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assetcategoryproperty")
public interface AssetCategoryPropertyService {
  @Path("/add-category-property")
  Call<JSONObject> addCategoryProperty(@Param(name = "entryId") long entryId, @Param(name = "key") String key, @Param(name = "value") String value);

  @Path("/delete-category-property")
  Call<Response> deleteCategoryProperty(@Param(name = "categoryPropertyId") long categoryPropertyId);

  @Path("/get-category-properties")
  Call<JSONArray> getCategoryProperties(@Param(name = "entryId") long entryId);

  @Path("/get-category-property-values")
  Call<JSONArray> getCategoryPropertyValues(@Param(name = "companyId") long companyId, @Param(name = "key") String key);

  @Path("/update-category-property")
  Call<JSONObject> updateCategoryProperty(@Param(name = "categoryPropertyId") long categoryPropertyId, @Param(name = "key") String key, @Param(name = "value") String value);
}
