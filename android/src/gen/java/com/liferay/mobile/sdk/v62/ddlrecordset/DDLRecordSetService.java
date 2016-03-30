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
  Call<JSONObject> addRecordSet(@Param("groupId") long groupId, @Param("ddmStructureId") long ddmStructureId, @Param("recordSetKey") String recordSetKey, @ParamObject(name = "nameMap", className = "") JSONObject nameMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("minDisplayRows") int minDisplayRows, @Param("scope") int scope, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-record-set")
  Call<Response> deleteRecordSet(@Param("recordSetId") long recordSetId);

  @Path("/get-record-set")
  Call<JSONObject> getRecordSet(@Param("recordSetId") long recordSetId);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("keywords") String keywords, @Param("scope") int scope, @Param("start") int start, @Param("end") int end, @ParamObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("name") String name, @Param("description") String description, @Param("scope") int scope, @Param("andOperator") boolean andOperator, @Param("start") int start, @Param("end") int end, @ParamObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("keywords") String keywords, @Param("scope") int scope);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("name") String name, @Param("description") String description, @Param("scope") int scope, @Param("andOperator") boolean andOperator);

  @Path("/update-min-display-rows")
  Call<JSONObject> updateMinDisplayRows(@Param("recordSetId") long recordSetId, @Param("minDisplayRows") int minDisplayRows, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-record-set")
  Call<JSONObject> updateRecordSet(@Param("recordSetId") long recordSetId, @Param("ddmStructureId") long ddmStructureId, @ParamObject(name = "nameMap", className = "") JSONObject nameMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("minDisplayRows") int minDisplayRows, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-record-set")
  Call<JSONObject> updateRecordSet(@Param("groupId") long groupId, @Param("ddmStructureId") long ddmStructureId, @Param("recordSetKey") String recordSetKey, @ParamObject(name = "nameMap", className = "") JSONObject nameMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("minDisplayRows") int minDisplayRows, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
