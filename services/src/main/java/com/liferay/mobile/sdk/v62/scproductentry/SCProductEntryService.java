package com.liferay.mobile.sdk.v62.scproductentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/scproductentry")
public interface SCProductEntryService {
  @Path("/add-product-entry")
  Call<JSONObject> addProductEntry(@Param(name = "name") String name, @Param(name = "type") String type, @Param(name = "tags") String tags, @Param(name = "shortDescription") String shortDescription, @Param(name = "longDescription") String longDescription, @Param(name = "pageURL") String pageURL, @Param(name = "author") String author, @Param(name = "repoGroupId") String repoGroupId, @Param(name = "repoArtifactId") String repoArtifactId, @Param(name = "licenseIds") JSONArray licenseIds, @Param(name = "thumbnails") JSONArray thumbnails, @Param(name = "fullImages") JSONArray fullImages, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-product-entry")
  Call<Response> deleteProductEntry(@Param(name = "productEntryId") long productEntryId);

  @Path("/get-product-entry")
  Call<JSONObject> getProductEntry(@Param(name = "productEntryId") long productEntryId);

  @Path("/update-product-entry")
  Call<JSONObject> updateProductEntry(@Param(name = "productEntryId") long productEntryId, @Param(name = "name") String name, @Param(name = "type") String type, @Param(name = "tags") String tags, @Param(name = "shortDescription") String shortDescription, @Param(name = "longDescription") String longDescription, @Param(name = "pageURL") String pageURL, @Param(name = "author") String author, @Param(name = "repoGroupId") String repoGroupId, @Param(name = "repoArtifactId") String repoArtifactId, @Param(name = "licenseIds") JSONArray licenseIds, @Param(name = "thumbnails") JSONArray thumbnails, @Param(name = "fullImages") JSONArray fullImages);
}
