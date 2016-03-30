package com.liferay.mobile.sdk.v62.journalstructure;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.annotation.JsonObject;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/journalstructure")
public interface JournalStructureService {
  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param("groupId") long groupId, @Param("structureId") String structureId, @Param("autoStructureId") boolean autoStructureId, @Param("parentStructureId") String parentStructureId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("xsd") String xsd, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-structure")
  Call<JSONObject> copyStructure(@Param("groupId") long groupId, @Param("oldStructureId") String oldStructureId, @Param("newStructureId") String newStructureId, @Param("autoStructureId") boolean autoStructureId);

  @Path("/delete-structure")
  Call<Response> deleteStructure(@Param("groupId") long groupId, @Param("structureId") String structureId);

  @Path("/get-structure")
  Call<JSONObject> getStructure(@Param("groupId") long groupId, @Param("structureId") String structureId);

  @Path("/get-structure")
  Call<JSONObject> getStructure(@Param("groupId") long groupId, @Param("structureId") String structureId, @Param("includeGlobalStructures") boolean includeGlobalStructures);

  @Path("/get-structures")
  Call<JSONArray> getStructures(@Param("groupId") long groupId);

  @Path("/get-structures")
  Call<JSONArray> getStructures(@Param("groupIds") JSONArray groupIds);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("keywords") String keywords, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("structureId") String structureId, @Param("name") String name, @Param("description") String description, @Param("andOperator") boolean andOperator, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("keywords") String keywords);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("structureId") String structureId, @Param("name") String name, @Param("description") String description, @Param("andOperator") boolean andOperator);

  @Path("/update-structure")
  Call<JSONObject> updateStructure(@Param("groupId") long groupId, @Param("structureId") String structureId, @Param("parentStructureId") String parentStructureId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("xsd") String xsd, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
