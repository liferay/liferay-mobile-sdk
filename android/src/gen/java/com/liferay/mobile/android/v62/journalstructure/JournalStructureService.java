package com.liferay.mobile.android.v62.journalstructure;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/journalstructure")
public interface JournalStructureService {
  @Path("/add-structure")
  Call<JSONObject> addStructure(@Param("groupId") long groupId, @Param("structureId") String structureId, @Param("autoStructureId") boolean autoStructureId, @Param("parentStructureId") String parentStructureId, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("xsd") String xsd, @Param("serviceContext") JSONObjectWrapper serviceContext);

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
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("keywords") String keywords, @Param("start") int start, @Param("end") int end, @Param("obc") JSONObjectWrapper obc);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("structureId") String structureId, @Param("name") String name, @Param("description") String description, @Param("andOperator") boolean andOperator, @Param("start") int start, @Param("end") int end, @Param("obc") JSONObjectWrapper obc);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("keywords") String keywords);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("structureId") String structureId, @Param("name") String name, @Param("description") String description, @Param("andOperator") boolean andOperator);

  @Path("/update-structure")
  Call<JSONObject> updateStructure(@Param("groupId") long groupId, @Param("structureId") String structureId, @Param("parentStructureId") String parentStructureId, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("xsd") String xsd, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
