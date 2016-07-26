package com.liferay.mobile.sdk.v7.ddmdataproviderinstance;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/ddm.ddmdataproviderinstance")
public interface DDMDataProviderInstanceService {
  @Path("/add-data-provider-instance")
  Call<JSONObject> addDataProviderInstance(@Param(name = "groupId") long groupId, @Param(name = "nameMap") JSONObject nameMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "ddmFormValues", className = "com.liferay.dynamic.data.mapping.storage.DDMFormValues") JSONObject ddmFormValues, @Param(name = "type") String type, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-data-provider-instance")
  Call<Response> deleteDataProviderInstance(@Param(name = "dataProviderInstanceId") long dataProviderInstanceId);

  @Path("/fetch-data-provider-instance")
  Call<JSONObject> fetchDataProviderInstance(@Param(name = "dataProviderInstanceId") long dataProviderInstanceId);

  @Path("/get-data-provider-instance")
  Call<JSONObject> getDataProviderInstance(@Param(name = "dataProviderInstanceId") long dataProviderInstanceId);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "keywords") String keywords, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "keywords") String keywords);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "andOperator") boolean andOperator);

  @Path("/update-data-provider-instance")
  Call<JSONObject> updateDataProviderInstance(@Param(name = "dataProviderInstanceId") long dataProviderInstanceId, @Param(name = "nameMap") JSONObject nameMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "ddmFormValues", className = "com.liferay.dynamic.data.mapping.storage.DDMFormValues") JSONObject ddmFormValues, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
