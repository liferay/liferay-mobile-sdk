package com.liferay.mobile.sdk.v62.repository;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/repository")
public interface RepositoryService {
  @Path("/add-repository")
  Call<JSONObject> addRepository(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("parentFolderId") long parentFolderId, @Param("name") String name, @Param("description") String description, @Param("portletId") String portletId, @JsonObject(name = "typeSettingsProperties", className = "com.liferay.portal.kernel.util.UnicodeProperties") JSONObject typeSettingsProperties, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/check-repository")
  Call<Response> checkRepository(@Param("repositoryId") long repositoryId);

  @Path("/delete-repository")
  Call<Response> deleteRepository(@Param("repositoryId") long repositoryId);

  @Path("/get-local-repository-impl")
  Call<JSONObject> getLocalRepositoryImpl(@Param("repositoryId") long repositoryId);

  @Path("/get-local-repository-impl")
  Call<JSONObject> getLocalRepositoryImpl(@Param("folderId") long folderId, @Param("fileEntryId") long fileEntryId, @Param("fileVersionId") long fileVersionId);

  @Path("/get-repository")
  Call<JSONObject> getRepository(@Param("repositoryId") long repositoryId);

  @Path("/get-repository-impl")
  Call<JSONObject> getRepositoryImpl(@Param("repositoryId") long repositoryId);

  @Path("/get-repository-impl")
  Call<JSONObject> getRepositoryImpl(@Param("folderId") long folderId, @Param("fileEntryId") long fileEntryId, @Param("fileVersionId") long fileVersionId);

  @Path("/get-supported-configurations")
  Call<JSONArray> getSupportedConfigurations(@Param("classNameId") long classNameId);

  @Path("/get-supported-parameters")
  Call<JSONArray> getSupportedParameters(@Param("classNameId") long classNameId, @Param("configuration") String configuration);

  @Path("/get-type-settings-properties")
  Call<JSONObject> getTypeSettingsProperties(@Param("repositoryId") long repositoryId);

  @Path("/update-repository")
  Call<Response> updateRepository(@Param("repositoryId") long repositoryId, @Param("name") String name, @Param("description") String description);
}
