package com.liferay.mobile.sdk.v7.expandovalue;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/expandovalue")
public interface ExpandoValueService {
  @Path("/add-value")
  Call<JSONObject> addValue(@Param(name = "companyId") long companyId, @Param(name = "className") String className, @Param(name = "tableName") String tableName, @Param(name = "columnName") String columnName, @Param(name = "classPK") long classPK, @Param(name = "data") String data);

  @Path("/add-values")
  Call<Response> addValues(@Param(name = "companyId") long companyId, @Param(name = "className") String className, @Param(name = "tableName") String tableName, @Param(name = "classPK") long classPK, @Param(name = "attributeValues", className = "") JSONObject attributeValues);

  @Path("/get-data")
  Call<JSONObject> getData(@Param(name = "companyId") long companyId, @Param(name = "className") String className, @Param(name = "tableName") String tableName, @Param(name = "columnName") String columnName, @Param(name = "classPK") long classPK);

  @Path("/get-data")
  Call<JSONObject> getData(@Param(name = "companyId") long companyId, @Param(name = "className") String className, @Param(name = "tableName") String tableName, @Param(name = "columnNames") JSONArray columnNames, @Param(name = "classPK") long classPK);

  @Path("/get-json-data")
  Call<JSONObject> getJSONData(@Param(name = "companyId") long companyId, @Param(name = "className") String className, @Param(name = "tableName") String tableName, @Param(name = "columnName") String columnName, @Param(name = "classPK") long classPK);
}
