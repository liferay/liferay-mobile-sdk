package com.liferay.mobile.sdk.v7.exportimport;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.file.UploadData;
import com.liferay.mobile.sdk.http.ContentType;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Long;
import org.json.JSONObject;

@Path("/exportimport")
public interface ExportImportService {
  @Path("/export-layouts-as-file")
  Call<JSONObject> exportLayoutsAsFile(@Param(name = "exportImportConfiguration", className = "com.liferay.exportimport.kernel.model.ExportImportConfiguration") JSONObject exportImportConfiguration);

  @Path("/export-layouts-as-file-in-background")
  Call<Long> exportLayoutsAsFileInBackground(@Param(name = "exportImportConfiguration", className = "com.liferay.exportimport.kernel.model.ExportImportConfiguration") JSONObject exportImportConfiguration);

  @Path("/export-layouts-as-file-in-background")
  Call<Long> exportLayoutsAsFileInBackground(@Param(name = "exportImportConfigurationId") long exportImportConfigurationId);

  @Path("/export-portlet-info-as-file")
  Call<JSONObject> exportPortletInfoAsFile(@Param(name = "exportImportConfiguration", className = "com.liferay.exportimport.kernel.model.ExportImportConfiguration") JSONObject exportImportConfiguration);

  @Path("/export-portlet-info-as-file-in-background")
  Call<Long> exportPortletInfoAsFileInBackground(@Param(name = "exportImportConfiguration", className = "com.liferay.exportimport.kernel.model.ExportImportConfiguration") JSONObject exportImportConfiguration);

  @Path(
      value = "/import-layouts",
      contentType = ContentType.MULTIPART
  )
  Call<Response> importLayouts(@Param(name = "exportImportConfiguration", className = "com.liferay.exportimport.kernel.model.ExportImportConfiguration") JSONObject exportImportConfiguration, @Param(name = "file") UploadData file);

  @Path(
      value = "/import-layouts-in-background",
      contentType = ContentType.MULTIPART
  )
  Call<Long> importLayoutsInBackground(@Param(name = "exportImportConfiguration", className = "com.liferay.exportimport.kernel.model.ExportImportConfiguration") JSONObject exportImportConfiguration, @Param(name = "file") UploadData file);

  @Path(
      value = "/import-portlet-info",
      contentType = ContentType.MULTIPART
  )
  Call<Response> importPortletInfo(@Param(name = "exportImportConfiguration", className = "com.liferay.exportimport.kernel.model.ExportImportConfiguration") JSONObject exportImportConfiguration, @Param(name = "file") UploadData file);

  @Path(
      value = "/import-portlet-info-in-background",
      contentType = ContentType.MULTIPART
  )
  Call<Long> importPortletInfoInBackground(@Param(name = "exportImportConfiguration", className = "com.liferay.exportimport.kernel.model.ExportImportConfiguration") JSONObject exportImportConfiguration, @Param(name = "file") UploadData file);

  @Path(
      value = "/validate-import-layouts-file",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> validateImportLayoutsFile(@Param(name = "exportImportConfiguration", className = "com.liferay.exportimport.kernel.model.ExportImportConfiguration") JSONObject exportImportConfiguration, @Param(name = "file") UploadData file);

  @Path(
      value = "/validate-import-portlet-info",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> validateImportPortletInfo(@Param(name = "exportImportConfiguration", className = "com.liferay.exportimport.kernel.model.ExportImportConfiguration") JSONObject exportImportConfiguration, @Param(name = "file") UploadData file);
}
