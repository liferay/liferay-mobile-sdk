package com.liferay.mobile.sdk.v62.scproductversion;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.annotation.JsonObject;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/scproductversion")
public interface SCProductVersionService {
  @Path("/add-product-version")
  Call<JSONObject> addProductVersion(@Param("productEntryId") long productEntryId, @Param("version") String version, @Param("changeLog") String changeLog, @Param("downloadPageURL") String downloadPageURL, @Param("directDownloadURL") String directDownloadURL, @Param("testDirectDownloadURL") boolean testDirectDownloadURL, @Param("repoStoreArtifact") boolean repoStoreArtifact, @Param("frameworkVersionIds") JSONArray frameworkVersionIds, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-product-version")
  Call<Response> deleteProductVersion(@Param("productVersionId") long productVersionId);

  @Path("/get-product-version")
  Call<JSONObject> getProductVersion(@Param("productVersionId") long productVersionId);

  @Path("/get-product-versions")
  Call<JSONArray> getProductVersions(@Param("productEntryId") long productEntryId, @Param("start") int start, @Param("end") int end);

  @Path("/get-product-versions-count")
  Call<Integer> getProductVersionsCount(@Param("productEntryId") long productEntryId);

  @Path("/update-product-version")
  Call<JSONObject> updateProductVersion(@Param("productVersionId") long productVersionId, @Param("version") String version, @Param("changeLog") String changeLog, @Param("downloadPageURL") String downloadPageURL, @Param("directDownloadURL") String directDownloadURL, @Param("testDirectDownloadURL") boolean testDirectDownloadURL, @Param("repoStoreArtifact") boolean repoStoreArtifact, @Param("frameworkVersionIds") JSONArray frameworkVersionIds);
}
