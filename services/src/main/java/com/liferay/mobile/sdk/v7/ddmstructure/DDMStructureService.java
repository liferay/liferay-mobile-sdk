package com.liferay.mobile.sdk.v7.ddmstructure;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/ddm.ddmstructure")
public interface DDMStructureService {
  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param(name = "userId") long userId, @Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "xsd") String xsd, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param(name = "userId") long userId, @Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "ddmForm", className = "com.liferay.dynamic.data.mapping.model.DDMForm") JSONObject ddmForm, @Param(name = "ddmFormLayout", className = "com.liferay.dynamic.data.mapping.model.DDMFormLayout") JSONObject ddmFormLayout, @Param(name = "storageType") String storageType, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param(name = "groupId") long groupId, @Param(name = "parentStructureId") long parentStructureId, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "xsd") String xsd, @Param(name = "storageType") String storageType, @Param(name = "type") int type, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param(name = "groupId") long groupId, @Param(name = "parentStructureId") long parentStructureId, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "ddmForm", className = "com.liferay.dynamic.data.mapping.model.DDMForm") JSONObject ddmForm, @Param(name = "ddmFormLayout", className = "com.liferay.dynamic.data.mapping.model.DDMFormLayout") JSONObject ddmFormLayout, @Param(name = "storageType") String storageType, @Param(name = "type") int type, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param(name = "userId") long userId, @Param(name = "groupId") long groupId, @Param(name = "parentStructureKey") String parentStructureKey, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "xsd") String xsd, @Param(name = "storageType") String storageType, @Param(name = "type") int type, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param(name = "userId") long userId, @Param(name = "groupId") long groupId, @Param(name = "parentStructureKey") String parentStructureKey, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "ddmForm", className = "com.liferay.dynamic.data.mapping.model.DDMForm") JSONObject ddmForm, @Param(name = "ddmFormLayout", className = "com.liferay.dynamic.data.mapping.model.DDMFormLayout") JSONObject ddmFormLayout, @Param(name = "storageType") String storageType, @Param(name = "type") int type, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-structure")
  Call<JSONObject> copyStructure(@Param(name = "structureId") long structureId, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-structure")
  Call<JSONObject> copyStructure(@Param(name = "structureId") long structureId, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-structure")
  Call<Response> deleteStructure(@Param(name = "structureId") long structureId);

  @Path("/fetch-structure")
  Call<JSONObject> fetchStructure(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey);

  @Path("/fetch-structure")
  Call<JSONObject> fetchStructure(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey, @Param(name = "includeAncestorStructures") boolean includeAncestorStructures);

  @Path("/get-structure")
  Call<JSONObject> getStructure(@Param(name = "structureId") long structureId);

  @Path("/get-structure")
  Call<JSONObject> getStructure(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey);

  @Path("/get-structure")
  Call<JSONObject> getStructure(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey, @Param(name = "includeAncestorStructures") boolean includeAncestorStructures);

  @Path("/get-structures")
  Call<JSONArray> getStructures(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameId") long classNameId, @Param(name = "status") int status);

  @Path("/get-structures")
  Call<JSONArray> getStructures(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameId") long classNameId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMStructure>") JSONObject orderByComparator);

  @Path("/revert-structure")
  Call<Response> revertStructure(@Param(name = "structureId") long structureId, @Param(name = "version") String version, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameId") long classNameId, @Param(name = "keywords") String keywords, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMStructure>") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameId") long classNameId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "storageType") String storageType, @Param(name = "type") int type, @Param(name = "status") int status, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMStructure>") JSONObject orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameId") long classNameId, @Param(name = "keywords") String keywords, @Param(name = "status") int status);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameId") long classNameId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "storageType") String storageType, @Param(name = "type") int type, @Param(name = "status") int status, @Param(name = "andOperator") boolean andOperator);

  @Path("/update-structure")
  Call<JSONObject> updateStructure(@Param(name = "structureId") long structureId, @Param(name = "parentStructureId") long parentStructureId, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "definition") String definition, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-structure")
  Call<JSONObject> updateStructure(@Param(name = "structureId") long structureId, @Param(name = "parentStructureId") long parentStructureId, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "ddmForm", className = "com.liferay.dynamic.data.mapping.model.DDMForm") JSONObject ddmForm, @Param(name = "ddmFormLayout", className = "com.liferay.dynamic.data.mapping.model.DDMFormLayout") JSONObject ddmFormLayout, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-structure")
  Call<JSONObject> updateStructure(@Param(name = "groupId") long groupId, @Param(name = "parentStructureId") long parentStructureId, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "definition") String definition, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-structure")
  Call<JSONObject> updateStructure(@Param(name = "groupId") long groupId, @Param(name = "parentStructureId") long parentStructureId, @Param(name = "classNameId") long classNameId, @Param(name = "structureKey") String structureKey, @Param(name = "nameMap") Map nameMap, @Param(name = "descriptionMap") Map descriptionMap, @Param(name = "ddmForm", className = "com.liferay.dynamic.data.mapping.model.DDMForm") JSONObject ddmForm, @Param(name = "ddmFormLayout", className = "com.liferay.dynamic.data.mapping.model.DDMFormLayout") JSONObject ddmFormLayout, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
