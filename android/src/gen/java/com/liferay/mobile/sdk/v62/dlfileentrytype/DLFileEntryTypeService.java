package com.liferay.mobile.sdk.v62.dlfileentrytype;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/dlfileentrytype")
public interface DLFileEntryTypeService {
  @Path("/add-file-entry-type")
  Call<JSONObject> addFileEntryType(@Param("groupId") long groupId, @Param("name") String name, @Param("description") String description, @Param("ddmStructureIds") JSONArray ddmStructureIds, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-file-entry-type")
  Call<JSONObject> addFileEntryType(@Param("groupId") long groupId, @Param("fileEntryTypeKey") String fileEntryTypeKey, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("ddmStructureIds") JSONArray ddmStructureIds, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-file-entry-type")
  Call<Response> deleteFileEntryType(@Param("fileEntryTypeId") long fileEntryTypeId);

  @Path("/get-file-entry-type")
  Call<JSONObject> getFileEntryType(@Param("fileEntryTypeId") long fileEntryTypeId);

  @Path("/get-file-entry-types")
  Call<JSONArray> getFileEntryTypes(@Param("groupIds") JSONArray groupIds);

  @Path("/get-file-entry-types")
  Call<JSONArray> getFileEntryTypes(@Param("groupIds") JSONArray groupIds, @Param("start") int start, @Param("end") int end);

  @Path("/get-file-entry-types-count")
  Call<Integer> getFileEntryTypesCount(@Param("groupIds") JSONArray groupIds);

  @Path("/get-folder-file-entry-types")
  Call<JSONArray> getFolderFileEntryTypes(@Param("groupIds") JSONArray groupIds, @Param("folderId") long folderId, @Param("inherited") boolean inherited);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("keywords") String keywords, @Param("includeBasicFileEntryType") boolean includeBasicFileEntryType, @Param("start") int start, @Param("end") int end, @JsonObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("keywords") String keywords, @Param("includeBasicFileEntryType") boolean includeBasicFileEntryType);

  @Path("/update-file-entry-type")
  Call<Response> updateFileEntryType(@Param("fileEntryTypeId") long fileEntryTypeId, @Param("name") String name, @Param("description") String description, @Param("ddmStructureIds") JSONArray ddmStructureIds, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-file-entry-type")
  Call<Response> updateFileEntryType(@Param("fileEntryTypeId") long fileEntryTypeId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("ddmStructureIds") JSONArray ddmStructureIds, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
