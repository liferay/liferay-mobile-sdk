package com.liferay.mobile.sdk.v62.journaltemplate;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.file.UploadData;
import com.liferay.mobile.sdk.http.ContentType;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/journaltemplate")
public interface JournalTemplateService {
  @Path("/add-template")
  Call<JSONObject> addTemplate(@Param(name = "groupId") long groupId, @Param(name = "templateId") String templateId, @Param(name = "autoTemplateId") boolean autoTemplateId, @Param(name = "structureId") String structureId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "xsl") String xsl, @Param(name = "formatXsl") boolean formatXsl, @Param(name = "langType") String langType, @Param(name = "cacheable") boolean cacheable, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/add-template",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> addTemplate(@Param(name = "groupId") long groupId, @Param(name = "templateId") String templateId, @Param(name = "autoTemplateId") boolean autoTemplateId, @Param(name = "structureId") String structureId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "xsl") String xsl, @Param(name = "formatXsl") boolean formatXsl, @Param(name = "langType") String langType, @Param(name = "cacheable") boolean cacheable, @Param(name = "smallImage") boolean smallImage, @Param(name = "smallImageURL") String smallImageURL, @Param(name = "smallFile") UploadData smallFile, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-template")
  Call<JSONObject> copyTemplate(@Param(name = "groupId") long groupId, @Param(name = "oldTemplateId") String oldTemplateId, @Param(name = "newTemplateId") String newTemplateId, @Param(name = "autoTemplateId") boolean autoTemplateId);

  @Path("/delete-template")
  Call<Response> deleteTemplate(@Param(name = "groupId") long groupId, @Param(name = "templateId") String templateId);

  @Path("/get-structure-templates")
  Call<JSONArray> getStructureTemplates(@Param(name = "groupId") long groupId, @Param(name = "structureId") String structureId);

  @Path("/get-template")
  Call<JSONObject> getTemplate(@Param(name = "groupId") long groupId, @Param(name = "templateId") String templateId);

  @Path("/get-template")
  Call<JSONObject> getTemplate(@Param(name = "groupId") long groupId, @Param(name = "templateId") String templateId, @Param(name = "includeGlobalTemplates") boolean includeGlobalTemplates);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "templateId") String templateId, @Param(name = "structureId") String structureId, @Param(name = "structureIdComparator") String structureIdComparator, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "keywords") String keywords, @Param(name = "structureId") String structureId, @Param(name = "structureIdComparator") String structureIdComparator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "keywords") String keywords, @Param(name = "structureId") String structureId, @Param(name = "structureIdComparator") String structureIdComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "templateId") String templateId, @Param(name = "structureId") String structureId, @Param(name = "structureIdComparator") String structureIdComparator, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "andOperator") boolean andOperator);

  @Path("/update-template")
  Call<JSONObject> updateTemplate(@Param(name = "groupId") long groupId, @Param(name = "templateId") String templateId, @Param(name = "structureId") String structureId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "xsl") String xsl, @Param(name = "formatXsl") boolean formatXsl, @Param(name = "langType") String langType, @Param(name = "cacheable") boolean cacheable, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/update-template",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> updateTemplate(@Param(name = "groupId") long groupId, @Param(name = "templateId") String templateId, @Param(name = "structureId") String structureId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "xsl") String xsl, @Param(name = "formatXsl") boolean formatXsl, @Param(name = "langType") String langType, @Param(name = "cacheable") boolean cacheable, @Param(name = "smallImage") boolean smallImage, @Param(name = "smallImageURL") String smallImageURL, @Param(name = "smallFile") UploadData smallFile, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
