package com.liferay.mobile.android.v62.ddlrecord;

import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/ddlrecord")
public interface DDLRecordService {
  @Path("/add-record")
  Call<JSONObject> addRecord(@Param("groupId") long groupId, @Param("recordSetId") long recordSetId, @Param("displayIndex") int displayIndex, @Param("fields") JSONObjectWrapper fields, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/add-record")
  Call<JSONObject> addRecord(@Param("groupId") long groupId, @Param("recordSetId") long recordSetId, @Param("displayIndex") int displayIndex, @Param("fieldsMap") JSONObject fieldsMap, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-record-locale")
  Call<JSONObject> deleteRecordLocale(@Param("recordId") long recordId, @Param("locale") String locale, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/get-record")
  Call<JSONObject> getRecord(@Param("recordId") long recordId);

  @Path("/update-record")
  Call<JSONObject> updateRecord(@Param("recordId") long recordId, @Param("displayIndex") int displayIndex, @Param("fieldsMap") JSONObject fieldsMap, @Param("mergeFields") boolean mergeFields, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/update-record")
  Call<JSONObject> updateRecord(@Param("recordId") long recordId, @Param("majorVersion") boolean majorVersion, @Param("displayIndex") int displayIndex, @Param("fields") JSONObjectWrapper fields, @Param("mergeFields") boolean mergeFields, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
