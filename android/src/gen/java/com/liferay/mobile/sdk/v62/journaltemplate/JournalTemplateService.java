package com.liferay.mobile.sdk.v62.journaltemplate;

import com.liferay.mobile.sdk.http.Headers;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.http.file.UploadData;
import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/journaltemplate")
public interface JournalTemplateService {
  @Path("/add-template")
  Call<JSONObject> addTemplate(@Param("groupId") long groupId, @Param("templateId") String templateId, @Param("autoTemplateId") boolean autoTemplateId, @Param("structureId") String structureId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("xsl") String xsl, @Param("formatXsl") boolean formatXsl, @Param("langType") String langType, @Param("cacheable") boolean cacheable, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/add-template",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<JSONObject> addTemplate(@Param("groupId") long groupId, @Param("templateId") String templateId, @Param("autoTemplateId") boolean autoTemplateId, @Param("structureId") String structureId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("xsl") String xsl, @Param("formatXsl") boolean formatXsl, @Param("langType") String langType, @Param("cacheable") boolean cacheable, @Param("smallImage") boolean smallImage, @Param("smallImageURL") String smallImageURL, @Param("smallFile") UploadData smallFile, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-template")
  Call<JSONObject> copyTemplate(@Param("groupId") long groupId, @Param("oldTemplateId") String oldTemplateId, @Param("newTemplateId") String newTemplateId, @Param("autoTemplateId") boolean autoTemplateId);

  @Path("/delete-template")
  Call<Response> deleteTemplate(@Param("groupId") long groupId, @Param("templateId") String templateId);

  @Path("/get-structure-templates")
  Call<JSONArray> getStructureTemplates(@Param("groupId") long groupId, @Param("structureId") String structureId);

  @Path("/get-template")
  Call<JSONObject> getTemplate(@Param("groupId") long groupId, @Param("templateId") String templateId);

  @Path("/get-template")
  Call<JSONObject> getTemplate(@Param("groupId") long groupId, @Param("templateId") String templateId, @Param("includeGlobalTemplates") boolean includeGlobalTemplates);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("templateId") String templateId, @Param("structureId") String structureId, @Param("structureIdComparator") String structureIdComparator, @Param("name") String name, @Param("description") String description, @Param("andOperator") boolean andOperator, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("keywords") String keywords, @Param("structureId") String structureId, @Param("structureIdComparator") String structureIdComparator, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("keywords") String keywords, @Param("structureId") String structureId, @Param("structureIdComparator") String structureIdComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("templateId") String templateId, @Param("structureId") String structureId, @Param("structureIdComparator") String structureIdComparator, @Param("name") String name, @Param("description") String description, @Param("andOperator") boolean andOperator);

  @Path("/update-template")
  Call<JSONObject> updateTemplate(@Param("groupId") long groupId, @Param("templateId") String templateId, @Param("structureId") String structureId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("xsl") String xsl, @Param("formatXsl") boolean formatXsl, @Param("langType") String langType, @Param("cacheable") boolean cacheable, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/update-template",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<JSONObject> updateTemplate(@Param("groupId") long groupId, @Param("templateId") String templateId, @Param("structureId") String structureId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("xsl") String xsl, @Param("formatXsl") boolean formatXsl, @Param("langType") String langType, @Param("cacheable") boolean cacheable, @Param("smallImage") boolean smallImage, @Param("smallImageURL") String smallImageURL, @Param("smallFile") UploadData smallFile, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
