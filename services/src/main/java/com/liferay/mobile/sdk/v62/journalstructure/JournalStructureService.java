package com.liferay.mobile.sdk.v62.journalstructure;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/journalstructure")
public interface JournalStructureService {
  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param(name = "groupId") long groupId, @Param(name = "structureId") String structureId, @Param(name = "autoStructureId") boolean autoStructureId, @Param(name = "parentStructureId") String parentStructureId, @Param(name = "nameMap") JSONObject nameMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "xsd") String xsd, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-structure")
  Call<JSONObject> copyStructure(@Param(name = "groupId") long groupId, @Param(name = "oldStructureId") String oldStructureId, @Param(name = "newStructureId") String newStructureId, @Param(name = "autoStructureId") boolean autoStructureId);

  @Path("/delete-structure")
  Call<Response> deleteStructure(@Param(name = "groupId") long groupId, @Param(name = "structureId") String structureId);

  @Path("/get-structure")
  Call<JSONObject> getStructure(@Param(name = "groupId") long groupId, @Param(name = "structureId") String structureId);

  @Path("/get-structure")
  Call<JSONObject> getStructure(@Param(name = "groupId") long groupId, @Param(name = "structureId") String structureId, @Param(name = "includeGlobalStructures") boolean includeGlobalStructures);

  @Path("/get-structures")
  Call<JSONArray> getStructures(@Param(name = "groupId") long groupId);

  @Path("/get-structures")
  Call<JSONArray> getStructures(@Param(name = "groupIds") JSONArray groupIds);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "keywords") String keywords, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "structureId") String structureId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "keywords") String keywords);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "structureId") String structureId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "andOperator") boolean andOperator);

  @Path("/update-structure")
  Call<JSONObject> updateStructure(@Param(name = "groupId") long groupId, @Param(name = "structureId") String structureId, @Param(name = "parentStructureId") String parentStructureId, @Param(name = "nameMap") JSONObject nameMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "xsd") String xsd, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
