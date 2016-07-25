package com.liferay.mobile.sdk.v7.exportimport;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Long;
import org.json.JSONObject;

@Path("/exportimport")
public interface ExportImportService {
  @Path("/export-layouts-as-file")
  Call<JSONObject> exportLayoutsAsFile(@Param(name = "exportImportConfiguration", className = "") JSONObject exportImportConfiguration);

  @Path("/export-layouts-as-file-in-background")
  Call<Long> exportLayoutsAsFileInBackground(@Param(name = "exportImportConfiguration", className = "") JSONObject exportImportConfiguration);

  @Path("/export-layouts-as-file-in-background")
  Call<Long> exportLayoutsAsFileInBackground(@Param(name = "exportImportConfigurationId") long exportImportConfigurationId);

  @Path("/export-portlet-info-as-file")
  Call<JSONObject> exportPortletInfoAsFile(@Param(name = "exportImportConfiguration", className = "") JSONObject exportImportConfiguration);

  @Path("/export-portlet-info-as-file-in-background")
  Call<Long> exportPortletInfoAsFileInBackground(@Param(name = "exportImportConfiguration", className = "") JSONObject exportImportConfiguration);

  @Path("/import-layouts")
  Call<Response> importLayouts(@Param(name = "exportImportConfiguration", className = "") JSONObject exportImportConfiguration, @Param(name = "file", className = "") JSONObject file);

  @Path("/import-layouts-in-background")
  Call<Long> importLayoutsInBackground(@Param(name = "exportImportConfiguration", className = "") JSONObject exportImportConfiguration, @Param(name = "file", className = "") JSONObject file);

  @Path("/import-portlet-info")
  Call<Response> importPortletInfo(@Param(name = "exportImportConfiguration", className = "") JSONObject exportImportConfiguration, @Param(name = "file", className = "") JSONObject file);

  @Path("/import-portlet-info-in-background")
  Call<Long> importPortletInfoInBackground(@Param(name = "exportImportConfiguration", className = "") JSONObject exportImportConfiguration, @Param(name = "file", className = "") JSONObject file);

  @Path("/validate-import-layouts-file")
  Call<JSONObject> validateImportLayoutsFile(@Param(name = "exportImportConfiguration", className = "") JSONObject exportImportConfiguration, @Param(name = "file", className = "") JSONObject file);

  @Path("/validate-import-portlet-info")
  Call<JSONObject> validateImportPortletInfo(@Param(name = "exportImportConfiguration", className = "") JSONObject exportImportConfiguration, @Param(name = "file", className = "") JSONObject file);
}
