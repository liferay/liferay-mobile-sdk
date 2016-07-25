package com.liferay.mobile.sdk.v7.exportimportconfiguration;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONObject;

@Path("/exportimportconfiguration")
public interface ExportImportConfigurationService {
  @Path("/delete-export-import-configuration")
  Call<Response> deleteExportImportConfiguration(@Param(name = "exportImportConfigurationId") long exportImportConfigurationId);

  @Path("/move-export-import-configuration-to-trash")
  Call<JSONObject> moveExportImportConfigurationToTrash(@Param(name = "exportImportConfigurationId") long exportImportConfigurationId);

  @Path("/restore-export-import-configuration-from-trash")
  Call<JSONObject> restoreExportImportConfigurationFromTrash(@Param(name = "exportImportConfigurationId") long exportImportConfigurationId);
}
