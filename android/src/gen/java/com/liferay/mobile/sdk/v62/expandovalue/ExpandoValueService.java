package com.liferay.mobile.sdk.v62.expandovalue;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/expandovalue")
public interface ExpandoValueService {
  @Path("/add-value")
  Call<JSONObject> addValue(@Param("companyId") long companyId, @Param("className") String className, @Param("tableName") String tableName, @Param("columnName") String columnName, @Param("classPK") long classPK, @Param("data") String data);

  @Path("/add-values")
  Call<Response> addValues(@Param("companyId") long companyId, @Param("className") String className, @Param("tableName") String tableName, @Param("classPK") long classPK, @ParamObject(name = "attributeValues", className = "") JSONObject attributeValues);

  @Path("/get-data")
  Call<JSONObject> getData(@Param("companyId") long companyId, @Param("className") String className, @Param("tableName") String tableName, @Param("columnName") String columnName, @Param("classPK") long classPK);

  @Path("/get-data")
  Call<JSONObject> getData(@Param("companyId") long companyId, @Param("className") String className, @Param("tableName") String tableName, @ParamObject(name = "columnNames", className = "") JSONObject columnNames, @Param("classPK") long classPK);

  @Path("/get-json-data")
  Call<JSONObject> getJsonData(@Param("companyId") long companyId, @Param("className") String className, @Param("tableName") String tableName, @Param("columnName") String columnName, @Param("classPK") long classPK);
}
