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
  Call<JSONObject> addRecord(@Param("groupId") long groupId, @Param("recordSetId") long recordSetId, @Param("displayIndex") int displayIndex, @ParamObject(name = "fields", className = "com.liferay.portlet.dynamicdatamapping.storage.Fields") JSONObject fields, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-record-locale")
  Call<JSONObject> deleteRecordLocale(@Param("recordId") long recordId, @Param("locale") String locale, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/get-record")
  Call<JSONObject> getRecord(@Param("recordId") long recordId);

  @Path("/update-record")
  Call<JSONObject> updateRecord(@Param("recordId") long recordId, @Param("displayIndex") int displayIndex, @ParamObject(name = "fieldsMap", className = "") JSONObject fieldsMap, @Param("mergeFields") boolean mergeFields, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-record")
  Call<JSONObject> updateRecord(@Param("recordId") long recordId, @Param("majorVersion") boolean majorVersion, @Param("displayIndex") int displayIndex, @ParamObject(name = "fields", className = "com.liferay.portlet.dynamicdatamapping.storage.Fields") JSONObject fields, @Param("mergeFields") boolean mergeFields, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
