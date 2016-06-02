package com.liferay.mobile.sdk.v62.ddlrecordset;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/ddlrecordset")
public interface DDLRecordSetService {
  @Path("/add-record-set")
  Call<JSONObject> addRecordSet(@Param(name = "groupId") long groupId, @Param(name = "ddmStructureId") long ddmStructureId, @Param(name = "recordSetKey") String recordSetKey, @ParamObject(name = "nameMap", className = "") JSONObject nameMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "minDisplayRows") int minDisplayRows, @Param(name = "scope") int scope, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-record-set")
  Call<Response> deleteRecordSet(@Param(name = "recordSetId") long recordSetId);

  @Path("/get-record-set")
  Call<JSONObject> getRecordSet(@Param(name = "recordSetId") long recordSetId);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "keywords") String keywords, @Param(name = "scope") int scope, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "scope") int scope, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "keywords") String keywords, @Param(name = "scope") int scope);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "scope") int scope, @Param(name = "andOperator") boolean andOperator);

  @Path("/update-min-display-rows")
  Call<JSONObject> updateMinDisplayRows(@Param(name = "recordSetId") long recordSetId, @Param(name = "minDisplayRows") int minDisplayRows, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-record-set")
  Call<JSONObject> updateRecordSet(@Param(name = "recordSetId") long recordSetId, @Param(name = "ddmStructureId") long ddmStructureId, @ParamObject(name = "nameMap", className = "") JSONObject nameMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "minDisplayRows") int minDisplayRows, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-record-set")
  Call<JSONObject> updateRecordSet(@Param(name = "groupId") long groupId, @Param(name = "ddmStructureId") long ddmStructureId, @Param(name = "recordSetKey") String recordSetKey, @ParamObject(name = "nameMap", className = "") JSONObject nameMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "minDisplayRows") int minDisplayRows, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
