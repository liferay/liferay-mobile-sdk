package com.liferay.mobile.sdk.v62.ddlrecord;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/ddlrecord")
public interface DDLRecordService {
  @Path("/add-record")
  Call<JSONObject> addRecord(@Param(name = "groupId") long groupId, @Param(name = "recordSetId") long recordSetId, @Param(name = "displayIndex") int displayIndex, @ParamObject(name = "fields", className = "com.liferay.portlet.dynamicdatamapping.storage.Fields") JSONObject fields, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-record-locale")
  Call<JSONObject> deleteRecordLocale(@Param(name = "recordId") long recordId, @Param(name = "locale") String locale, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/get-record")
  Call<JSONObject> getRecord(@Param(name = "recordId") long recordId);

  @Path("/update-record")
  Call<JSONObject> updateRecord(@Param(name = "recordId") long recordId, @Param(name = "displayIndex") int displayIndex, @ParamObject(name = "fieldsMap", className = "") JSONObject fieldsMap, @Param(name = "mergeFields") boolean mergeFields, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-record")
  Call<JSONObject> updateRecord(@Param(name = "recordId") long recordId, @Param(name = "majorVersion") boolean majorVersion, @Param(name = "displayIndex") int displayIndex, @ParamObject(name = "fields", className = "com.liferay.portlet.dynamicdatamapping.storage.Fields") JSONObject fields, @Param(name = "mergeFields") boolean mergeFields, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
