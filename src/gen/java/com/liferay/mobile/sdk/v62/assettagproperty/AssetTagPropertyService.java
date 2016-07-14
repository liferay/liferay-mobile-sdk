package com.liferay.mobile.sdk.v62.assettagproperty;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assettagproperty")
public interface AssetTagPropertyService {
  @Path("/add-tag-property")
  Call<JSONObject> addTagProperty(@Param(name = "tagId") long tagId, @Param(name = "key") String key, @Param(name = "value") String value);

  @Path("/delete-tag-property")
  Call<Response> deleteTagProperty(@Param(name = "tagPropertyId") long tagPropertyId);

  @Path("/get-tag-properties")
  Call<JSONArray> getTagProperties(@Param(name = "tagId") long tagId);

  @Path("/get-tag-property-values")
  Call<JSONArray> getTagPropertyValues(@Param(name = "companyId") long companyId, @Param(name = "key") String key);

  @Path("/update-tag-property")
  Call<JSONObject> updateTagProperty(@Param(name = "tagPropertyId") long tagPropertyId, @Param(name = "key") String key, @Param(name = "value") String value);
}
