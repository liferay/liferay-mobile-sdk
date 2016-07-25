package com.liferay.mobile.sdk.v7.website;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/website")
public interface WebsiteService {
  @Path("/add-website")
  Call<JSONObject> addWebsite(@Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "url") String url, @Param(name = "typeId") long typeId, @Param(name = "primary") boolean primary, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-website")
  Call<Response> deleteWebsite(@Param(name = "websiteId") long websiteId);

  @Path("/get-website")
  Call<JSONObject> getWebsite(@Param(name = "websiteId") long websiteId);

  @Path("/get-websites")
  Call<JSONArray> getWebsites(@Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/update-website")
  Call<JSONObject> updateWebsite(@Param(name = "websiteId") long websiteId, @Param(name = "url") String url, @Param(name = "typeId") long typeId, @Param(name = "primary") boolean primary);
}
