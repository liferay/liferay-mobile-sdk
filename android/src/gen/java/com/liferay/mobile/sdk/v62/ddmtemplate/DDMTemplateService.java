package com.liferay.mobile.sdk.v62.ddmtemplate;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.file.UploadData;
import com.liferay.mobile.sdk.http.Headers;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/ddmtemplate")
public interface DDMTemplateService {
  @Path("/add-template")
  Call<JSONObject> addTemplate(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("script") String script, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/add-template",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<JSONObject> addTemplate(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("templateKey") String templateKey, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("script") String script, @Param("cacheable") boolean cacheable, @Param("smallImage") boolean smallImage, @Param("smallImageURL") String smallImageURL, @Param("smallImageFile") UploadData smallImageFile, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-template")
  Call<JSONObject> copyTemplate(@Param("templateId") long templateId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-template")
  Call<JSONObject> copyTemplate(@Param("templateId") long templateId, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-templates")
  Call<JSONArray> copyTemplates(@Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("newClassPK") long newClassPK, @Param("type") String type, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-template")
  Call<Response> deleteTemplate(@Param("templateId") long templateId);

  @Path("/fetch-template")
  Call<JSONObject> fetchTemplate(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("templateKey") String templateKey);

  @Path("/get-template")
  Call<JSONObject> getTemplate(@Param("templateId") long templateId);

  @Path("/get-template")
  Call<JSONObject> getTemplate(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("templateKey") String templateKey);

  @Path("/get-template")
  Call<JSONObject> getTemplate(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("templateKey") String templateKey, @Param("includeGlobalTemplates") boolean includeGlobalTemplates);

  @Path("/get-templates")
  Call<JSONArray> getTemplates(@Param("groupId") long groupId, @Param("classNameId") long classNameId);

  @Path("/get-templates")
  Call<JSONArray> getTemplates(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK);

  @Path("/get-templates")
  Call<JSONArray> getTemplates(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("type") String type);

  @Path("/get-templates")
  Call<JSONArray> getTemplates(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("type") String type, @Param("mode") String mode);

  @Path("/get-templates-by-class-pk")
  Call<JSONArray> getTemplatesByClassPk(@Param("groupId") long groupId, @Param("classPK") long classPK);

  @Path("/get-templates-by-structure-class-name-id")
  Call<JSONArray> getTemplatesByStructureClassNameId(@Param("groupId") long groupId, @Param("structureClassNameId") long structureClassNameId, @Param("start") int start, @Param("end") int end, @JsonObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/get-templates-by-structure-class-name-id-count")
  Call<Integer> getTemplatesByStructureClassNameIdCount(@Param("groupId") long groupId, @Param("structureClassNameId") long structureClassNameId);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("keywords") String keywords, @Param("type") String type, @Param("mode") String mode, @Param("start") int start, @Param("end") int end, @JsonObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("classNameIds") JSONArray classNameIds, @Param("classPKs") JSONArray classPKs, @Param("keywords") String keywords, @Param("type") String type, @Param("mode") String mode, @Param("start") int start, @Param("end") int end, @JsonObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("name") String name, @Param("description") String description, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("andOperator") boolean andOperator, @Param("start") int start, @Param("end") int end, @JsonObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("classNameIds") JSONArray classNameIds, @Param("classPKs") JSONArray classPKs, @Param("name") String name, @Param("description") String description, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("andOperator") boolean andOperator, @Param("start") int start, @Param("end") int end, @JsonObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("name") String name, @Param("description") String description, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("andOperator") boolean andOperator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("classNameIds") JSONArray classNameIds, @Param("classPKs") JSONArray classPKs, @Param("name") String name, @Param("description") String description, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("andOperator") boolean andOperator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("keywords") String keywords, @Param("type") String type, @Param("mode") String mode);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("classNameIds") JSONArray classNameIds, @Param("classPKs") JSONArray classPKs, @Param("keywords") String keywords, @Param("type") String type, @Param("mode") String mode);

  @Path(
      value = "/update-template",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<JSONObject> updateTemplate(@Param("templateId") long templateId, @Param("classPK") long classPK, @JsonObject(name = "nameMap", className = "") JSONObject nameMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("script") String script, @Param("cacheable") boolean cacheable, @Param("smallImage") boolean smallImage, @Param("smallImageURL") String smallImageURL, @Param("smallImageFile") UploadData smallImageFile, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
