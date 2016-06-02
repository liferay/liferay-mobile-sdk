package com.liferay.mobile.sdk.v62.scframeworkversion;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/scframeworkversion")
public interface SCFrameworkVersionService {
  @Path("/add-framework-version")
  Call<JSONObject> addFrameworkVersion(@Param(name = "name") String name, @Param(name = "url") String url, @Param(name = "active") boolean active, @Param(name = "priority") int priority, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-framework-version")
  Call<Response> deleteFrameworkVersion(@Param(name = "frameworkVersionId") long frameworkVersionId);

  @Path("/get-framework-version")
  Call<JSONObject> getFrameworkVersion(@Param(name = "frameworkVersionId") long frameworkVersionId);

  @Path("/get-framework-versions")
  Call<JSONArray> getFrameworkVersions(@Param(name = "groupId") long groupId, @Param(name = "active") boolean active);

  @Path("/get-framework-versions")
  Call<JSONArray> getFrameworkVersions(@Param(name = "groupId") long groupId, @Param(name = "active") boolean active, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/update-framework-version")
  Call<JSONObject> updateFrameworkVersion(@Param(name = "frameworkVersionId") long frameworkVersionId, @Param(name = "name") String name, @Param(name = "url") String url, @Param(name = "active") boolean active, @Param(name = "priority") int priority);
}
