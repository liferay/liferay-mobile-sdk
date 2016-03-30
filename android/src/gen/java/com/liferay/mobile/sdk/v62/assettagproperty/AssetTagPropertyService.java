package com.liferay.mobile.sdk.v62.assettagproperty;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assettagproperty")
public interface AssetTagPropertyService {
  @Path("/add-tag-property")
  Call<JSONObject> addTagProperty(@Param("tagId") long tagId, @Param("key") String key, @Param("value") String value);

  @Path("/delete-tag-property")
  Call<Response> deleteTagProperty(@Param("tagPropertyId") long tagPropertyId);

  @Path("/get-tag-properties")
  Call<JSONArray> getTagProperties(@Param("tagId") long tagId);

  @Path("/get-tag-property-values")
  Call<JSONArray> getTagPropertyValues(@Param("companyId") long companyId, @Param("key") String key);

  @Path("/update-tag-property")
  Call<JSONObject> updateTagProperty(@Param("tagPropertyId") long tagPropertyId, @Param("key") String key, @Param("value") String value);
}
