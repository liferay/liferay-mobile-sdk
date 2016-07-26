package com.liferay.mobile.sdk.v7.dlfileentrytype;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/dlfileentrytype")
public interface DLFileEntryTypeService {
  @Path("/add-file-entry-type")
  Call<JSONObject> addFileEntryType(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "ddmStructureIds") JSONArray ddmStructureIds, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-file-entry-type")
  Call<JSONObject> addFileEntryType(@Param(name = "groupId") long groupId, @Param(name = "fileEntryTypeKey") String fileEntryTypeKey, @Param(name = "nameMap") JSONObject nameMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "ddmStructureIds") JSONArray ddmStructureIds, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-file-entry-type")
  Call<Response> deleteFileEntryType(@Param(name = "fileEntryTypeId") long fileEntryTypeId);

  @Path("/get-file-entry-type")
  Call<JSONObject> getFileEntryType(@Param(name = "fileEntryTypeId") long fileEntryTypeId);

  @Path("/get-file-entry-types")
  Call<JSONArray> getFileEntryTypes(@Param(name = "groupIds") JSONArray groupIds);

  @Path("/get-file-entry-types")
  Call<JSONArray> getFileEntryTypes(@Param(name = "groupIds") JSONArray groupIds, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-file-entry-types-count")
  Call<Integer> getFileEntryTypesCount(@Param(name = "groupIds") JSONArray groupIds);

  @Path("/get-folder-file-entry-types")
  Call<JSONArray> getFolderFileEntryTypes(@Param(name = "groupIds") JSONArray groupIds, @Param(name = "folderId") long folderId, @Param(name = "inherited") boolean inherited);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "keywords") String keywords, @Param(name = "includeBasicFileEntryType") boolean includeBasicFileEntryType, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "keywords") String keywords, @Param(name = "includeBasicFileEntryType") boolean includeBasicFileEntryType);

  @Path("/update-file-entry-type")
  Call<Response> updateFileEntryType(@Param(name = "fileEntryTypeId") long fileEntryTypeId, @Param(name = "nameMap") JSONObject nameMap, @Param(name = "descriptionMap") JSONObject descriptionMap, @Param(name = "ddmStructureIds") JSONArray ddmStructureIds, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-file-entry-type")
  Call<Response> updateFileEntryType(@Param(name = "fileEntryTypeId") long fileEntryTypeId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "ddmStructureIds") JSONArray ddmStructureIds, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
