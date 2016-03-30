package com.liferay.mobile.sdk.v62.scframeworkversion;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/scframeworkversion")
public interface SCFrameworkVersionService {
  @Path("/add-framework-version")
  Call<JSONObject> addFrameworkVersion(@Param("name") String name, @Param("url") String url, @Param("active") boolean active, @Param("priority") int priority, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-framework-version")
  Call<Response> deleteFrameworkVersion(@Param("frameworkVersionId") long frameworkVersionId);

  @Path("/get-framework-version")
  Call<JSONObject> getFrameworkVersion(@Param("frameworkVersionId") long frameworkVersionId);

  @Path("/get-framework-versions")
  Call<JSONArray> getFrameworkVersions(@Param("groupId") long groupId, @Param("active") boolean active);

  @Path("/get-framework-versions")
  Call<JSONArray> getFrameworkVersions(@Param("groupId") long groupId, @Param("active") boolean active, @Param("start") int start, @Param("end") int end);

  @Path("/update-framework-version")
  Call<JSONObject> updateFrameworkVersion(@Param("frameworkVersionId") long frameworkVersionId, @Param("name") String name, @Param("url") String url, @Param("active") boolean active, @Param("priority") int priority);
}
