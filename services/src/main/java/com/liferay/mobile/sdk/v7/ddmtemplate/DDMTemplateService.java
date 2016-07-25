package com.liferay.mobile.sdk.v7.ddmtemplate;

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

@Path("/ddm.ddmtemplate")
public interface DDMTemplateService {
  @Path("/add-template")
  Call<JSONObject> addTemplate(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") String type, @Param(name = "mode") String mode, @Param(name = "language") String language, @Param(name = "script") String script, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path(
      value = "/add-template",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> addTemplate(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "templateKey") String templateKey, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") String type, @Param(name = "mode") String mode, @Param(name = "language") String language, @Param(name = "script") String script, @Param(name = "cacheable") boolean cacheable, @Param(name = "smallImage") boolean smallImage, @Param(name = "smallImageURL") String smallImageURL, @Param(name = "smallImageFile") UploadData smallImageFile, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/copy-template")
  Call<JSONObject> copyTemplate(@Param(name = "templateId") long templateId, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/copy-template")
  Call<JSONObject> copyTemplate(@Param(name = "templateId") long templateId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/copy-templates")
  Call<JSONArray> copyTemplates(@Param(name = "classNameId") long classNameId, @Param(name = "oldClassPK") long oldClassPK, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "newClassPK") long newClassPK, @Param(name = "type") String type, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-template")
  Call<Response> deleteTemplate(@Param(name = "templateId") long templateId);

  @Path("/fetch-template")
  Call<JSONObject> fetchTemplate(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "templateKey") String templateKey);

  @Path("/get-template")
  Call<JSONObject> getTemplate(@Param(name = "templateId") long templateId);

  @Path("/get-template")
  Call<JSONObject> getTemplate(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "templateKey") String templateKey);

  @Path("/get-template")
  Call<JSONObject> getTemplate(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "templateKey") String templateKey, @Param(name = "includeAncestorTemplates") boolean includeAncestorTemplates);

  @Path("/get-templates")
  Call<JSONArray> getTemplates(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "status") int status);

  @Path("/get-templates")
  Call<JSONArray> getTemplates(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "status") int status);

  @Path("/get-templates")
  Call<JSONArray> getTemplates(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "type") String type, @Param(name = "status") int status);

  @Path("/get-templates")
  Call<JSONArray> getTemplates(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "includeAncestorTemplates") boolean includeAncestorTemplates, @Param(name = "status") int status);

  @Path("/get-templates")
  Call<JSONArray> getTemplates(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "type") String type, @Param(name = "mode") String mode, @Param(name = "status") int status);

  @Path("/get-templates-by-class-pk")
  Call<JSONArray> getTemplatesByClassPK(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "classPK") long classPK, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "status") int status);

  @Path("/get-templates-by-structure-class-name-id")
  Call<JSONArray> getTemplatesByStructureClassNameId(@Param(name = "groupId") long groupId, @Param(name = "structureClassNameId") long structureClassNameId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "") JSONObject orderByComparator);

  @Path("/get-templates-by-structure-class-name-id-count")
  Call<Integer> getTemplatesByStructureClassNameIdCount(@Param(name = "groupId") long groupId, @Param(name = "structureClassNameId") long structureClassNameId, @Param(name = "status") int status);

  @Path("/revert-template")
  Call<Response> revertTemplate(@Param(name = "templateId") long templateId, @Param(name = "version") String version, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "classPKs") JSONArray classPKs, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "keywords") String keywords, @Param(name = "type") String type, @Param(name = "mode") String mode, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "keywords") String keywords, @Param(name = "type") String type, @Param(name = "mode") String mode, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "classPKs") JSONArray classPKs, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "type") String type, @Param(name = "mode") String mode, @Param(name = "language") String language, @Param(name = "status") int status, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "") JSONObject orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "type") String type, @Param(name = "mode") String mode, @Param(name = "language") String language, @Param(name = "status") int status, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "") JSONObject orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "classPKs") JSONArray classPKs, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "keywords") String keywords, @Param(name = "type") String type, @Param(name = "mode") String mode, @Param(name = "status") int status);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "keywords") String keywords, @Param(name = "type") String type, @Param(name = "mode") String mode, @Param(name = "status") int status);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "classPKs") JSONArray classPKs, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "type") String type, @Param(name = "mode") String mode, @Param(name = "language") String language, @Param(name = "status") int status, @Param(name = "andOperator") boolean andOperator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "resourceClassNameId") long resourceClassNameId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "type") String type, @Param(name = "mode") String mode, @Param(name = "language") String language, @Param(name = "status") int status, @Param(name = "andOperator") boolean andOperator);

  @Path("/update-template")
  Call<JSONObject> updateTemplate(@Param(name = "templateId") long templateId, @Param(name = "classPK") long classPK, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") String type, @Param(name = "mode") String mode, @Param(name = "language") String language, @Param(name = "script") String script, @Param(name = "cacheable") boolean cacheable, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path(
      value = "/update-template",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> updateTemplate(@Param(name = "templateId") long templateId, @Param(name = "classPK") long classPK, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") String type, @Param(name = "mode") String mode, @Param(name = "language") String language, @Param(name = "script") String script, @Param(name = "cacheable") boolean cacheable, @Param(name = "smallImage") boolean smallImage, @Param(name = "smallImageURL") String smallImageURL, @Param(name = "smallImageFile") UploadData smallImageFile, @Param(name = "serviceContext", className = "") JSONObject serviceContext);
}
