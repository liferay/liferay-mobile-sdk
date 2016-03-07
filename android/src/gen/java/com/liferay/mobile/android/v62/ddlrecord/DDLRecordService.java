package com.liferay.mobile.android.v62.ddlrecord;

import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/ddlrecord")
public interface DDLRecordService {
  @Path("/add-record")
  Call<JSONObject> addRecord(@Param("groupId") long groupId, @Param("recordSetId") long recordSetId, @Param("displayIndex") int displayIndex, @JsonObject(name = "fields", className = "com.liferay.portlet.dynamicdatamapping.storage.Fields") JSONObject fields, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-record-locale")
  Call<JSONObject> deleteRecordLocale(@Param("recordId") long recordId, @Param("locale") String locale, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/get-record")
  Call<JSONObject> getRecord(@Param("recordId") long recordId);

  @Path("/update-record")
  Call<JSONObject> updateRecord(@Param("recordId") long recordId, @Param("displayIndex") int displayIndex, @JsonObject(name = "fieldsMap", className = "") JSONObject fieldsMap, @Param("mergeFields") boolean mergeFields, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-record")
  Call<JSONObject> updateRecord(@Param("recordId") long recordId, @Param("majorVersion") boolean majorVersion, @Param("displayIndex") int displayIndex, @JsonObject(name = "fields", className = "com.liferay.portlet.dynamicdatamapping.storage.Fields") JSONObject fields, @Param("mergeFields") boolean mergeFields, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
