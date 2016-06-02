package com.liferay.mobile.sdk.v62.repository;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/repository")
public interface RepositoryService {
  @Path("/add-repository")
  Call<JSONObject> addRepository(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "parentFolderId") long parentFolderId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "portletId") String portletId, @ParamObject(name = "typeSettingsProperties", className = "com.liferay.portal.kernel.util.UnicodeProperties") JSONObject typeSettingsProperties, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-repository")
  Call<Response> checkRepository(@Param(name = "repositoryId") long repositoryId);

  @Path("/delete-repository")
  Call<Response> deleteRepository(@Param(name = "repositoryId") long repositoryId);

  @Path("/get-local-repository-impl")
  Call<JSONObject> getLocalRepositoryImpl(@Param(name = "repositoryId") long repositoryId);

  @Path("/get-local-repository-impl")
  Call<JSONObject> getLocalRepositoryImpl(@Param(name = "folderId") long folderId, @Param(name = "fileEntryId") long fileEntryId, @Param(name = "fileVersionId") long fileVersionId);

  @Path("/get-repository")
  Call<JSONObject> getRepository(@Param(name = "repositoryId") long repositoryId);

  @Path("/get-repository-impl")
  Call<JSONObject> getRepositoryImpl(@Param(name = "repositoryId") long repositoryId);

  @Path("/get-repository-impl")
  Call<JSONObject> getRepositoryImpl(@Param(name = "folderId") long folderId, @Param(name = "fileEntryId") long fileEntryId, @Param(name = "fileVersionId") long fileVersionId);

  @Path("/get-supported-configurations")
  Call<JSONArray> getSupportedConfigurations(@Param(name = "classNameId") long classNameId);

  @Path("/get-supported-parameters")
  Call<JSONArray> getSupportedParameters(@Param(name = "classNameId") long classNameId, @Param(name = "configuration") String configuration);

  @Path("/get-type-settings-properties")
  Call<JSONObject> getTypeSettingsProperties(@Param(name = "repositoryId") long repositoryId);

  @Path("/update-repository")
  Call<Response> updateRepository(@Param(name = "repositoryId") long repositoryId, @Param(name = "name") String name, @Param(name = "description") String description);
}
