package com.liferay.mobile.sdk.v62.layout;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.file.UploadData;
import com.liferay.mobile.sdk.http.ContentType;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Long;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/layout")
public interface LayoutService {
  @Path("/add-layout")
  Call<JSONObject> addLayout(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "parentLayoutId") long parentLayoutId, @Param(name = "name") String name, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "type") String type, @Param(name = "hidden") boolean hidden, @Param(name = "friendlyURL") String friendlyURL, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-layout")
  Call<JSONObject> addLayout(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "parentLayoutId") long parentLayoutId, @ParamObject(name = "localeNamesMap", className = "") JSONObject localeNamesMap, @ParamObject(name = "localeTitlesMap", className = "") JSONObject localeTitlesMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @ParamObject(name = "keywordsMap", className = "") JSONObject keywordsMap, @ParamObject(name = "robotsMap", className = "") JSONObject robotsMap, @Param(name = "type") String type, @Param(name = "hidden") boolean hidden, @Param(name = "friendlyURL") String friendlyURL, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-layout")
  Call<JSONObject> addLayout(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "parentLayoutId") long parentLayoutId, @ParamObject(name = "localeNamesMap", className = "") JSONObject localeNamesMap, @ParamObject(name = "localeTitlesMap", className = "") JSONObject localeTitlesMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @ParamObject(name = "keywordsMap", className = "") JSONObject keywordsMap, @ParamObject(name = "robotsMap", className = "") JSONObject robotsMap, @Param(name = "type") String type, @Param(name = "typeSettings") String typeSettings, @Param(name = "hidden") boolean hidden, @ParamObject(name = "friendlyURLMap", className = "") JSONObject friendlyURLMap, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-layout")
  Call<Response> deleteLayout(@Param(name = "plid") long plid, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-layout")
  Call<Response> deleteLayout(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "layoutId") long layoutId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-temp-file-entry")
  Call<Response> deleteTempFileEntry(@Param(name = "groupId") long groupId, @Param(name = "fileName") String fileName, @Param(name = "tempFolderName") String tempFolderName);

  @Path("/export-layouts")
  Call<JSONArray> exportLayouts(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate);

  @Path("/export-layouts")
  Call<JSONArray> exportLayouts(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "layoutIds") JSONArray layoutIds, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate);

  @Path("/export-layouts-as-file")
  Call<JSONObject> exportLayoutsAsFile(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "layoutIds") JSONArray layoutIds, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate);

  @Path("/export-layouts-as-file-in-background")
  Call<Long> exportLayoutsAsFileInBackground(@Param(name = "taskName") String taskName, @Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "layoutIds") JSONArray layoutIds, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate, @Param(name = "fileName") String fileName);

  @Path("/export-portlet-info")
  Call<JSONArray> exportPortletInfo(@Param(name = "companyId") long companyId, @Param(name = "portletId") String portletId, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate);

  @Path("/export-portlet-info")
  Call<JSONArray> exportPortletInfo(@Param(name = "plid") long plid, @Param(name = "groupId") long groupId, @Param(name = "portletId") String portletId, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate);

  @Path("/export-portlet-info-as-file")
  Call<JSONObject> exportPortletInfoAsFile(@Param(name = "portletId") String portletId, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate);

  @Path("/export-portlet-info-as-file")
  Call<JSONObject> exportPortletInfoAsFile(@Param(name = "plid") long plid, @Param(name = "groupId") long groupId, @Param(name = "portletId") String portletId, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate);

  @Path("/export-portlet-info-as-file-in-background")
  Call<Long> exportPortletInfoAsFileInBackground(@Param(name = "taskName") String taskName, @Param(name = "portletId") String portletId, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate, @Param(name = "fileName") String fileName);

  @Path("/export-portlet-info-as-file-in-background")
  Call<Long> exportPortletInfoAsFileInBackground(@Param(name = "taskName") String taskName, @Param(name = "plid") long plid, @Param(name = "groupId") long groupId, @Param(name = "portletId") String portletId, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate, @Param(name = "fileName") String fileName);

  @Path("/get-ancestor-layouts")
  Call<JSONArray> getAncestorLayouts(@Param(name = "plid") long plid);

  @Path("/get-default-plid")
  Call<Long> getDefaultPlid(@Param(name = "groupId") long groupId, @Param(name = "scopeGroupId") long scopeGroupId, @Param(name = "portletId") String portletId);

  @Path("/get-default-plid")
  Call<Long> getDefaultPlid(@Param(name = "groupId") long groupId, @Param(name = "scopeGroupId") long scopeGroupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "portletId") String portletId);

  @Path("/get-layout-by-uuid-and-group-id")
  Call<JSONObject> getLayoutByUuidAndGroupId(@Param(name = "uuid") String uuid, @Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout);

  @Path("/get-layout-name")
  Call<String> getLayoutName(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "layoutId") long layoutId, @Param(name = "languageId") String languageId);

  @Path("/get-layout-references")
  Call<JSONArray> getLayoutReferences(@Param(name = "companyId") long companyId, @Param(name = "portletId") String portletId, @Param(name = "preferencesKey") String preferencesKey, @Param(name = "preferencesValue") String preferencesValue);

  @Path("/get-layouts")
  Call<JSONArray> getLayouts(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout);

  @Path("/get-layouts")
  Call<JSONArray> getLayouts(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "parentLayoutId") long parentLayoutId);

  @Path("/get-layouts")
  Call<JSONArray> getLayouts(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "parentLayoutId") long parentLayoutId, @Param(name = "incomplete") boolean incomplete, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-temp-file-entry-names")
  Call<JSONArray> getTempFileEntryNames(@Param(name = "groupId") long groupId, @Param(name = "tempFolderName") String tempFolderName);

  @Path("/import-layouts")
  Call<Response> importLayouts(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "bytes") byte[] bytes);

  @Path(
      value = "/import-layouts",
      contentType = ContentType.MULTIPART
  )
  Call<Response> importLayouts(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "file") UploadData file);

  @Path(
      value = "/import-layouts-in-background",
      contentType = ContentType.MULTIPART
  )
  Call<Long> importLayoutsInBackground(@Param(name = "taskName") String taskName, @Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "file") UploadData file);

  @Path(
      value = "/import-portlet-info",
      contentType = ContentType.MULTIPART
  )
  Call<Response> importPortletInfo(@Param(name = "portletId") String portletId, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "file") UploadData file);

  @Path(
      value = "/import-portlet-info",
      contentType = ContentType.MULTIPART
  )
  Call<Response> importPortletInfo(@Param(name = "plid") long plid, @Param(name = "groupId") long groupId, @Param(name = "portletId") String portletId, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "file") UploadData file);

  @Path(
      value = "/import-portlet-info-in-background",
      contentType = ContentType.MULTIPART
  )
  Call<Response> importPortletInfoInBackground(@Param(name = "taskName") String taskName, @Param(name = "portletId") String portletId, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "file") UploadData file);

  @Path(
      value = "/import-portlet-info-in-background",
      contentType = ContentType.MULTIPART
  )
  Call<Long> importPortletInfoInBackground(@Param(name = "taskName") String taskName, @Param(name = "plid") long plid, @Param(name = "groupId") long groupId, @Param(name = "portletId") String portletId, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "file") UploadData file);

  @Path("/schedule-publish-to-live")
  Call<Response> schedulePublishToLive(@Param(name = "sourceGroupId") long sourceGroupId, @Param(name = "targetGroupId") long targetGroupId, @Param(name = "privateLayout") boolean privateLayout, @ParamObject(name = "layoutIdMap", className = "") JSONObject layoutIdMap, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "scope") String scope, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate, @Param(name = "groupName") String groupName, @Param(name = "cronText") String cronText, @Param(name = "schedulerStartDate") long schedulerStartDate, @Param(name = "schedulerEndDate") long schedulerEndDate, @Param(name = "description") String description);

  @Path("/schedule-publish-to-remote")
  Call<Response> schedulePublishToRemote(@Param(name = "sourceGroupId") long sourceGroupId, @Param(name = "privateLayout") boolean privateLayout, @ParamObject(name = "layoutIdMap", className = "") JSONObject layoutIdMap, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "remoteAddress") String remoteAddress, @Param(name = "remotePort") int remotePort, @Param(name = "remotePathContext") String remotePathContext, @Param(name = "secureConnection") boolean secureConnection, @Param(name = "remoteGroupId") long remoteGroupId, @Param(name = "remotePrivateLayout") boolean remotePrivateLayout, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate, @Param(name = "groupName") String groupName, @Param(name = "cronText") String cronText, @Param(name = "schedulerStartDate") long schedulerStartDate, @Param(name = "schedulerEndDate") long schedulerEndDate, @Param(name = "description") String description);

  @Path("/set-layouts")
  Call<Response> setLayouts(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "parentLayoutId") long parentLayoutId, @Param(name = "layoutIds") JSONArray layoutIds, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/unschedule-publish-to-live")
  Call<Response> unschedulePublishToLive(@Param(name = "groupId") long groupId, @Param(name = "jobName") String jobName, @Param(name = "groupName") String groupName);

  @Path("/unschedule-publish-to-remote")
  Call<Response> unschedulePublishToRemote(@Param(name = "groupId") long groupId, @Param(name = "jobName") String jobName, @Param(name = "groupName") String groupName);

  @Path("/update-layout")
  Call<JSONObject> updateLayout(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "layoutId") long layoutId, @Param(name = "parentLayoutId") long parentLayoutId, @ParamObject(name = "localeNamesMap", className = "") JSONObject localeNamesMap, @ParamObject(name = "localeTitlesMap", className = "") JSONObject localeTitlesMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @ParamObject(name = "keywordsMap", className = "") JSONObject keywordsMap, @ParamObject(name = "robotsMap", className = "") JSONObject robotsMap, @Param(name = "type") String type, @Param(name = "hidden") boolean hidden, @Param(name = "friendlyURL") String friendlyURL, @Param(name = "iconImage") boolean iconImage, @Param(name = "iconBytes") byte[] iconBytes, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-layout")
  Call<JSONObject> updateLayout(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "layoutId") long layoutId, @Param(name = "parentLayoutId") long parentLayoutId, @ParamObject(name = "localeNamesMap", className = "") JSONObject localeNamesMap, @ParamObject(name = "localeTitlesMap", className = "") JSONObject localeTitlesMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @ParamObject(name = "keywordsMap", className = "") JSONObject keywordsMap, @ParamObject(name = "robotsMap", className = "") JSONObject robotsMap, @Param(name = "type") String type, @Param(name = "hidden") boolean hidden, @ParamObject(name = "friendlyURLMap", className = "") JSONObject friendlyURLMap, @Param(name = "iconImage") boolean iconImage, @Param(name = "iconBytes") byte[] iconBytes, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-layout")
  Call<JSONObject> updateLayout(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "layoutId") long layoutId, @Param(name = "typeSettings") String typeSettings);

  @Path("/update-look-and-feel")
  Call<JSONObject> updateLookAndFeel(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "layoutId") long layoutId, @Param(name = "themeId") String themeId, @Param(name = "colorSchemeId") String colorSchemeId, @Param(name = "css") String css, @Param(name = "wapTheme") boolean wapTheme);

  @Path("/update-name")
  Call<JSONObject> updateName(@Param(name = "plid") long plid, @Param(name = "name") String name, @Param(name = "languageId") String languageId);

  @Path("/update-name")
  Call<JSONObject> updateName(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "layoutId") long layoutId, @Param(name = "name") String name, @Param(name = "languageId") String languageId);

  @Path("/update-parent-layout-id")
  Call<JSONObject> updateParentLayoutId(@Param(name = "plid") long plid, @Param(name = "parentPlid") long parentPlid);

  @Path("/update-parent-layout-id")
  Call<JSONObject> updateParentLayoutId(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "layoutId") long layoutId, @Param(name = "parentLayoutId") long parentLayoutId);

  @Path("/update-priority")
  Call<JSONObject> updatePriority(@Param(name = "plid") long plid, @Param(name = "priority") int priority);

  @Path("/update-priority")
  Call<JSONObject> updatePriority(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "layoutId") long layoutId, @Param(name = "priority") int priority);

  @Path("/update-priority")
  Call<JSONObject> updatePriority(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "layoutId") long layoutId, @Param(name = "nextLayoutId") long nextLayoutId, @Param(name = "previousLayoutId") long previousLayoutId);

  @Path(
      value = "/validate-import-layouts-file",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> validateImportLayoutsFile(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "file") UploadData file);

  @Path(
      value = "/validate-import-portlet-info",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> validateImportPortletInfo(@Param(name = "plid") long plid, @Param(name = "groupId") long groupId, @Param(name = "portletId") String portletId, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap, @Param(name = "file") UploadData file);
}
