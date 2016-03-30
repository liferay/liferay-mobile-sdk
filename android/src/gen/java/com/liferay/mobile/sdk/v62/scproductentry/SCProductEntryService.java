package com.liferay.mobile.sdk.v62.scproductentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.annotation.JsonObject;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/scproductentry")
public interface SCProductEntryService {
  @Path("/add-product-entry")
  Call<JSONObject> addProductEntry(@Param("name") String name, @Param("type") String type, @Param("tags") String tags, @Param("shortDescription") String shortDescription, @Param("longDescription") String longDescription, @Param("pageURL") String pageURL, @Param("author") String author, @Param("repoGroupId") String repoGroupId, @Param("repoArtifactId") String repoArtifactId, @Param("licenseIds") JSONArray licenseIds, @Param("thumbnails") JSONArray thumbnails, @Param("fullImages") JSONArray fullImages, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-product-entry")
  Call<Response> deleteProductEntry(@Param("productEntryId") long productEntryId);

  @Path("/get-product-entry")
  Call<JSONObject> getProductEntry(@Param("productEntryId") long productEntryId);

  @Path("/update-product-entry")
  Call<JSONObject> updateProductEntry(@Param("productEntryId") long productEntryId, @Param("name") String name, @Param("type") String type, @Param("tags") String tags, @Param("shortDescription") String shortDescription, @Param("longDescription") String longDescription, @Param("pageURL") String pageURL, @Param("author") String author, @Param("repoGroupId") String repoGroupId, @Param("repoArtifactId") String repoArtifactId, @Param("licenseIds") JSONArray licenseIds, @Param("thumbnails") JSONArray thumbnails, @Param("fullImages") JSONArray fullImages);
}
