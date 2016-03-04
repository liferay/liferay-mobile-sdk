package com.liferay.mobile.android.v62.dlfileentrytype;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/dlfileentrytype")
public interface DLFileEntryTypeService {
  @Path("/add-file-entry-type")
  Call<JSONObject> addFileEntryType(@Param("groupId") long groupId, @Param("name") String name, @Param("description") String description, @Param("ddmStructureIds") JSONArray ddmStructureIds, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/add-file-entry-type")
  Call<JSONObject> addFileEntryType(@Param("groupId") long groupId, @Param("fileEntryTypeKey") String fileEntryTypeKey, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("ddmStructureIds") JSONArray ddmStructureIds, @Param("serviceContext") JSONObjectWrapper serviceContext);

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
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("keywords") String keywords, @Param("includeBasicFileEntryType") boolean includeBasicFileEntryType, @Param("start") int start, @Param("end") int end, @Param("orderByComparator") JSONObjectWrapper orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("keywords") String keywords, @Param("includeBasicFileEntryType") boolean includeBasicFileEntryType);

  @Path("/update-file-entry-type")
  Call<Response> updateFileEntryType(@Param("fileEntryTypeId") long fileEntryTypeId, @Param("name") String name, @Param("description") String description, @Param("ddmStructureIds") JSONArray ddmStructureIds, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/update-file-entry-type")
  Call<Response> updateFileEntryType(@Param("fileEntryTypeId") long fileEntryTypeId, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("ddmStructureIds") JSONArray ddmStructureIds, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
