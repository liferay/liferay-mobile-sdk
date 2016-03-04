package com.liferay.mobile.android.v62.expandovalue;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/expandovalue")
public interface ExpandoValueService {
  @Path("/add-value")
  Call<JSONObject> addValue(@Param("companyId") long companyId, @Param("className") String className, @Param("tableName") String tableName, @Param("columnName") String columnName, @Param("classPK") long classPK, @Param("data") String data);

  @Path("/add-values")
  Call<Response> addValues(@Param("companyId") long companyId, @Param("className") String className, @Param("tableName") String tableName, @Param("classPK") long classPK, @Param("attributeValues") JSONObject attributeValues);

  @Path("/get-data")
  Call<JSONObject> getData(@Param("companyId") long companyId, @Param("className") String className, @Param("tableName") String tableName, @Param("columnName") String columnName, @Param("classPK") long classPK);

  @Path("/get-data")
  Call<JSONObject> getData(@Param("companyId") long companyId, @Param("className") String className, @Param("tableName") String tableName, @Param("columnNames") JSONObject columnNames, @Param("classPK") long classPK);

  @Path("/get-json-data")
  Call<JSONObject> getJsonData(@Param("companyId") long companyId, @Param("className") String className, @Param("tableName") String tableName, @Param("columnName") String columnName, @Param("classPK") long classPK);
}
