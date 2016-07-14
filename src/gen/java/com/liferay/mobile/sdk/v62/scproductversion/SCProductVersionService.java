package com.liferay.mobile.sdk.v62.scproductversion;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/scproductversion")
public interface SCProductVersionService {
  @Path("/add-product-version")
  Call<JSONObject> addProductVersion(@Param(name = "productEntryId") long productEntryId, @Param(name = "version") String version, @Param(name = "changeLog") String changeLog, @Param(name = "downloadPageURL") String downloadPageURL, @Param(name = "directDownloadURL") String directDownloadURL, @Param(name = "testDirectDownloadURL") boolean testDirectDownloadURL, @Param(name = "repoStoreArtifact") boolean repoStoreArtifact, @Param(name = "frameworkVersionIds") JSONArray frameworkVersionIds, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-product-version")
  Call<Response> deleteProductVersion(@Param(name = "productVersionId") long productVersionId);

  @Path("/get-product-version")
  Call<JSONObject> getProductVersion(@Param(name = "productVersionId") long productVersionId);

  @Path("/get-product-versions")
  Call<JSONArray> getProductVersions(@Param(name = "productEntryId") long productEntryId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-product-versions-count")
  Call<Integer> getProductVersionsCount(@Param(name = "productEntryId") long productEntryId);

  @Path("/update-product-version")
  Call<JSONObject> updateProductVersion(@Param(name = "productVersionId") long productVersionId, @Param(name = "version") String version, @Param(name = "changeLog") String changeLog, @Param(name = "downloadPageURL") String downloadPageURL, @Param(name = "directDownloadURL") String directDownloadURL, @Param(name = "testDirectDownloadURL") boolean testDirectDownloadURL, @Param(name = "repoStoreArtifact") boolean repoStoreArtifact, @Param(name = "frameworkVersionIds") JSONArray frameworkVersionIds);
}
