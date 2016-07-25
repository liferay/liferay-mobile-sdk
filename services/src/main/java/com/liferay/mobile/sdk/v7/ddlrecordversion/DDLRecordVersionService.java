package com.liferay.mobile.sdk.v7.ddlrecordversion;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/ddl.ddlrecordversion")
public interface DDLRecordVersionService {
  @Path("/get-record-version")
  Call<JSONObject> getRecordVersion(@Param(name = "recordVersionId") long recordVersionId);

  @Path("/get-record-version")
  Call<JSONObject> getRecordVersion(@Param(name = "recordId") long recordId, @Param(name = "version") String version);

  @Path("/get-record-versions")
  Call<JSONArray> getRecordVersions(@Param(name = "recordId") long recordId);

  @Path("/get-record-versions")
  Call<JSONArray> getRecordVersions(@Param(name = "recordId") long recordId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "") JSONObject orderByComparator);

  @Path("/get-record-versions-count")
  Call<Integer> getRecordVersionsCount(@Param(name = "recordId") long recordId);
}
