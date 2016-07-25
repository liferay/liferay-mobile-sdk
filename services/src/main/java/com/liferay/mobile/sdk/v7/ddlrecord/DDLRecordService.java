package com.liferay.mobile.sdk.v7.ddlrecord;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import java.util.Map;
import org.json.JSONObject;

@Path("/ddl.ddlrecord")
public interface DDLRecordService {
  @Path("/add-record")
  Call<JSONObject> addRecord(@Param(name = "groupId") long groupId, @Param(name = "recordSetId") long recordSetId, @Param(name = "displayIndex") int displayIndex, @Param(name = "fieldsMap") Map fieldsMap, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-record")
  Call<Response> deleteRecord(@Param(name = "recordId") long recordId);

  @Path("/delete-record-locale")
  Call<JSONObject> deleteRecordLocale(@Param(name = "recordId") long recordId, @Param(name = "locale") String locale, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/get-record")
  Call<JSONObject> getRecord(@Param(name = "recordId") long recordId);

  @Path("/revert-record")
  Call<Response> revertRecord(@Param(name = "recordId") long recordId, @Param(name = "version") String version, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/revert-record-version")
  Call<Response> revertRecordVersion(@Param(name = "recordId") long recordId, @Param(name = "version") String version, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-record")
  Call<JSONObject> updateRecord(@Param(name = "recordId") long recordId, @Param(name = "displayIndex") int displayIndex, @Param(name = "fieldsMap") Map fieldsMap, @Param(name = "mergeFields") boolean mergeFields, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-record")
  Call<JSONObject> updateRecord(@Param(name = "recordId") long recordId, @Param(name = "majorVersion") boolean majorVersion, @Param(name = "displayIndex") int displayIndex, @Param(name = "ddmFormValues", className = "com.liferay.dynamic.data.mapping.storage.DDMFormValues") JSONObject ddmFormValues, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-record")
  Call<JSONObject> updateRecord(@Param(name = "recordId") long recordId, @Param(name = "majorVersion") boolean majorVersion, @Param(name = "displayIndex") int displayIndex, @Param(name = "fields", className = "com.liferay.dynamic.data.mapping.storage.Fields") JSONObject fields, @Param(name = "mergeFields") boolean mergeFields, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
