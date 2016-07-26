package com.liferay.mobile.sdk.v62.ddmstructure;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/ddmstructure")
public interface DDMStructureService {
  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param(name = "userId") long userId, @Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "nameMap") JSONObject nameMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "xsd") String xsd, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param(name = "groupId") long groupId, @Param(name = "parentStructureId") long parentStructureId, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey, @Param(name = "nameMap") JSONObject nameMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "xsd") String xsd, @Param(name = "storageType") String storageType, @Param(name = "type") int type, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param(name = "userId") long userId, @Param(name = "groupId") long groupId, @Param(name = "parentStructureKey") String parentStructureKey, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey, @Param(name = "nameMap") JSONObject nameMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "xsd") String xsd, @Param(name = "storageType") String storageType, @Param(name = "type") int type, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-structure")
  Call<JSONObject> copyStructure(@Param(name = "structureId") long structureId, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-structure")
  Call<JSONObject> copyStructure(@Param(name = "structureId") long structureId, @Param(name = "nameMap") JSONObject nameMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-structure")
  Call<Response> deleteStructure(@Param(name = "structureId") long structureId);

  @Path("/fetch-structure")
  Call<JSONObject> fetchStructure(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey);

  @Path("/get-structure")
  Call<JSONObject> getStructure(@Param(name = "structureId") long structureId);

  @Path("/get-structure")
  Call<JSONObject> getStructure(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey);

  @Path("/get-structure")
  Call<JSONObject> getStructure(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey, @Param(name = "includeGlobalStructures") boolean includeGlobalStructures);

  @Path("/get-structures")
  Call<JSONArray> getStructures(@Param(name = "groupId") long groupId);

  @Path("/get-structures")
  Call<JSONArray> getStructures(@Param(name = "groupIds") JSONArray groupIds);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "keywords") String keywords, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "storageType") String storageType, @Param(name = "type") int type, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "keywords") String keywords);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "storageType") String storageType, @Param(name = "type") int type, @Param(name = "andOperator") boolean andOperator);

  @Path("/update-structure")
  Call<JSONObject> updateStructure(@Param(name = "structureId") long structureId, @Param(name = "parentStructureId") long parentStructureId, @Param(name = "nameMap") JSONObject nameMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "xsd") String xsd, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-structure")
  Call<JSONObject> updateStructure(@Param(name = "groupId") long groupId, @Param(name = "parentStructureId") long parentStructureId, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey, @Param(name = "nameMap") JSONObject nameMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "xsd") String xsd, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
