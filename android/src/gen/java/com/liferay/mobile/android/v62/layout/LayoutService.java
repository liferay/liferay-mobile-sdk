package com.liferay.mobile.android.v62.layout;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.http.file.UploadData;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/layout")
public interface LayoutService {
  @Path("/add-layout")
  Call<JSONObject> addLayout(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("parentLayoutId") long parentLayoutId, @Param("name") String name, @Param("title") String title, @Param("description") String description, @Param("type") String type, @Param("hidden") boolean hidden, @Param("friendlyURL") String friendlyURL, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/add-layout")
  Call<JSONObject> addLayout(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("parentLayoutId") long parentLayoutId, @Param("localeNamesMap") JSONObject localeNamesMap, @Param("localeTitlesMap") JSONObject localeTitlesMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("keywordsMap") JSONObject keywordsMap, @Param("robotsMap") JSONObject robotsMap, @Param("type") String type, @Param("hidden") boolean hidden, @Param("friendlyURL") String friendlyURL, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/add-layout")
  Call<JSONObject> addLayout(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("parentLayoutId") long parentLayoutId, @Param("localeNamesMap") JSONObject localeNamesMap, @Param("localeTitlesMap") JSONObject localeTitlesMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("keywordsMap") JSONObject keywordsMap, @Param("robotsMap") JSONObject robotsMap, @Param("type") String type, @Param("typeSettings") String typeSettings, @Param("hidden") boolean hidden, @Param("friendlyURLMap") JSONObject friendlyURLMap, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-layout")
  Call<Response> deleteLayout(@Param("plid") long plid, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-layout")
  Call<Response> deleteLayout(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutId") long layoutId, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-temp-file-entry")
  Call<Response> deleteTempFileEntry(@Param("groupId") long groupId, @Param("fileName") String fileName, @Param("tempFolderName") String tempFolderName);

  @Path("/export-layouts")
  Call<JSONArray> exportLayouts(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("parameterMap") JSONObject parameterMap, @Param("startDate") long startDate, @Param("endDate") long endDate);

  @Path("/export-layouts")
  Call<JSONArray> exportLayouts(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutIds") JSONArray layoutIds, @Param("parameterMap") JSONObject parameterMap, @Param("startDate") long startDate, @Param("endDate") long endDate);

  @Path("/export-layouts-as-file")
  Call<JSONObject> exportLayoutsAsFile(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutIds") JSONArray layoutIds, @Param("parameterMap") JSONObject parameterMap, @Param("startDate") long startDate, @Param("endDate") long endDate);

  @Path("/export-layouts-as-file-in-background")
  Call<Long> exportLayoutsAsFileInBackground(@Param("taskName") String taskName, @Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutIds") JSONArray layoutIds, @Param("parameterMap") JSONObject parameterMap, @Param("startDate") long startDate, @Param("endDate") long endDate, @Param("fileName") String fileName);

  @Path("/export-portlet-info")
  Call<JSONArray> exportPortletInfo(@Param("companyId") long companyId, @Param("portletId") String portletId, @Param("parameterMap") JSONObject parameterMap, @Param("startDate") long startDate, @Param("endDate") long endDate);

  @Path("/export-portlet-info")
  Call<JSONArray> exportPortletInfo(@Param("plid") long plid, @Param("groupId") long groupId, @Param("portletId") String portletId, @Param("parameterMap") JSONObject parameterMap, @Param("startDate") long startDate, @Param("endDate") long endDate);

  @Path("/export-portlet-info-as-file")
  Call<JSONObject> exportPortletInfoAsFile(@Param("portletId") String portletId, @Param("parameterMap") JSONObject parameterMap, @Param("startDate") long startDate, @Param("endDate") long endDate);

  @Path("/export-portlet-info-as-file")
  Call<JSONObject> exportPortletInfoAsFile(@Param("plid") long plid, @Param("groupId") long groupId, @Param("portletId") String portletId, @Param("parameterMap") JSONObject parameterMap, @Param("startDate") long startDate, @Param("endDate") long endDate);

  @Path("/export-portlet-info-as-file-in-background")
  Call<Long> exportPortletInfoAsFileInBackground(@Param("taskName") String taskName, @Param("portletId") String portletId, @Param("parameterMap") JSONObject parameterMap, @Param("startDate") long startDate, @Param("endDate") long endDate, @Param("fileName") String fileName);

  @Path("/export-portlet-info-as-file-in-background")
  Call<Long> exportPortletInfoAsFileInBackground(@Param("taskName") String taskName, @Param("plid") long plid, @Param("groupId") long groupId, @Param("portletId") String portletId, @Param("parameterMap") JSONObject parameterMap, @Param("startDate") long startDate, @Param("endDate") long endDate, @Param("fileName") String fileName);

  @Path("/get-ancestor-layouts")
  Call<JSONArray> getAncestorLayouts(@Param("plid") long plid);

  @Path("/get-default-plid")
  Call<Long> getDefaultPlid(@Param("groupId") long groupId, @Param("scopeGroupId") long scopeGroupId, @Param("portletId") String portletId);

  @Path("/get-default-plid")
  Call<Long> getDefaultPlid(@Param("groupId") long groupId, @Param("scopeGroupId") long scopeGroupId, @Param("privateLayout") boolean privateLayout, @Param("portletId") String portletId);

  @Path("/get-layout-by-uuid-and-group-id")
  Call<JSONObject> getLayoutByUuidAndGroupId(@Param("uuid") String uuid, @Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout);

  @Path("/get-layout-name")
  Call<String> getLayoutName(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutId") long layoutId, @Param("languageId") String languageId);

  @Path("/get-layout-references")
  Call<JSONArray> getLayoutReferences(@Param("companyId") long companyId, @Param("portletId") String portletId, @Param("preferencesKey") String preferencesKey, @Param("preferencesValue") String preferencesValue);

  @Path("/get-layouts")
  Call<JSONArray> getLayouts(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout);

  @Path("/get-layouts")
  Call<JSONArray> getLayouts(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("parentLayoutId") long parentLayoutId);

  @Path("/get-layouts")
  Call<JSONArray> getLayouts(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("parentLayoutId") long parentLayoutId, @Param("incomplete") boolean incomplete, @Param("start") int start, @Param("end") int end);

  @Path("/get-layouts-count")
  Call<Integer> getLayoutsCount(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("parentLayoutId") long parentLayoutId);

  @Path("/get-temp-file-entry-names")
  Call<JSONArray> getTempFileEntryNames(@Param("groupId") long groupId, @Param("tempFolderName") String tempFolderName);

  @Path("/import-layouts")
  Call<Response> importLayouts(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("parameterMap") JSONObject parameterMap, @Param("bytes") byte[] bytes);

  @Path("/import-layouts")
  Call<Response> importLayouts(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("parameterMap") JSONObject parameterMap, @Param("file") UploadData file);

  @Path("/import-layouts-in-background")
  Call<Long> importLayoutsInBackground(@Param("taskName") String taskName, @Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("parameterMap") JSONObject parameterMap, @Param("file") UploadData file);

  @Path("/import-portlet-info")
  Call<Response> importPortletInfo(@Param("portletId") String portletId, @Param("parameterMap") JSONObject parameterMap, @Param("file") UploadData file);

  @Path("/import-portlet-info")
  Call<Response> importPortletInfo(@Param("plid") long plid, @Param("groupId") long groupId, @Param("portletId") String portletId, @Param("parameterMap") JSONObject parameterMap, @Param("file") UploadData file);

  @Path("/import-portlet-info-in-background")
  Call<Response> importPortletInfoInBackground(@Param("taskName") String taskName, @Param("portletId") String portletId, @Param("parameterMap") JSONObject parameterMap, @Param("file") UploadData file);

  @Path("/import-portlet-info-in-background")
  Call<Long> importPortletInfoInBackground(@Param("taskName") String taskName, @Param("plid") long plid, @Param("groupId") long groupId, @Param("portletId") String portletId, @Param("parameterMap") JSONObject parameterMap, @Param("file") UploadData file);

  @Path("/schedule-publish-to-live")
  Call<Response> schedulePublishToLive(@Param("sourceGroupId") long sourceGroupId, @Param("targetGroupId") long targetGroupId, @Param("privateLayout") boolean privateLayout, @Param("layoutIdMap") JSONObject layoutIdMap, @Param("parameterMap") JSONObject parameterMap, @Param("scope") String scope, @Param("startDate") long startDate, @Param("endDate") long endDate, @Param("groupName") String groupName, @Param("cronText") String cronText, @Param("schedulerStartDate") long schedulerStartDate, @Param("schedulerEndDate") long schedulerEndDate, @Param("description") String description);

  @Path("/schedule-publish-to-remote")
  Call<Response> schedulePublishToRemote(@Param("sourceGroupId") long sourceGroupId, @Param("privateLayout") boolean privateLayout, @Param("layoutIdMap") JSONObject layoutIdMap, @Param("parameterMap") JSONObject parameterMap, @Param("remoteAddress") String remoteAddress, @Param("remotePort") int remotePort, @Param("remotePathContext") String remotePathContext, @Param("secureConnection") boolean secureConnection, @Param("remoteGroupId") long remoteGroupId, @Param("remotePrivateLayout") boolean remotePrivateLayout, @Param("startDate") long startDate, @Param("endDate") long endDate, @Param("groupName") String groupName, @Param("cronText") String cronText, @Param("schedulerStartDate") long schedulerStartDate, @Param("schedulerEndDate") long schedulerEndDate, @Param("description") String description);

  @Path("/set-layouts")
  Call<Response> setLayouts(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("parentLayoutId") long parentLayoutId, @Param("layoutIds") JSONArray layoutIds, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/unschedule-publish-to-live")
  Call<Response> unschedulePublishToLive(@Param("groupId") long groupId, @Param("jobName") String jobName, @Param("groupName") String groupName);

  @Path("/unschedule-publish-to-remote")
  Call<Response> unschedulePublishToRemote(@Param("groupId") long groupId, @Param("jobName") String jobName, @Param("groupName") String groupName);

  @Path("/update-layout")
  Call<JSONObject> updateLayout(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutId") long layoutId, @Param("parentLayoutId") long parentLayoutId, @Param("localeNamesMap") JSONObject localeNamesMap, @Param("localeTitlesMap") JSONObject localeTitlesMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("keywordsMap") JSONObject keywordsMap, @Param("robotsMap") JSONObject robotsMap, @Param("type") String type, @Param("hidden") boolean hidden, @Param("friendlyURL") String friendlyURL, @Param("iconImage") boolean iconImage, @Param("iconBytes") byte[] iconBytes, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/update-layout")
  Call<JSONObject> updateLayout(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutId") long layoutId, @Param("parentLayoutId") long parentLayoutId, @Param("localeNamesMap") JSONObject localeNamesMap, @Param("localeTitlesMap") JSONObject localeTitlesMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("keywordsMap") JSONObject keywordsMap, @Param("robotsMap") JSONObject robotsMap, @Param("type") String type, @Param("hidden") boolean hidden, @Param("friendlyURLMap") JSONObject friendlyURLMap, @Param("iconImage") boolean iconImage, @Param("iconBytes") byte[] iconBytes, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/update-layout")
  Call<JSONObject> updateLayout(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutId") long layoutId, @Param("typeSettings") String typeSettings);

  @Path("/update-look-and-feel")
  Call<JSONObject> updateLookAndFeel(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutId") long layoutId, @Param("themeId") String themeId, @Param("colorSchemeId") String colorSchemeId, @Param("css") String css, @Param("wapTheme") boolean wapTheme);

  @Path("/update-name")
  Call<JSONObject> updateName(@Param("plid") long plid, @Param("name") String name, @Param("languageId") String languageId);

  @Path("/update-name")
  Call<JSONObject> updateName(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutId") long layoutId, @Param("name") String name, @Param("languageId") String languageId);

  @Path("/update-parent-layout-id")
  Call<JSONObject> updateParentLayoutId(@Param("plid") long plid, @Param("parentPlid") long parentPlid);

  @Path("/update-parent-layout-id")
  Call<JSONObject> updateParentLayoutId(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutId") long layoutId, @Param("parentLayoutId") long parentLayoutId);

  @Path("/update-parent-layout-id-and-priority")
  Call<JSONObject> updateParentLayoutIdAndPriority(@Param("plid") long plid, @Param("parentPlid") long parentPlid, @Param("priority") int priority);

  @Path("/update-priority")
  Call<JSONObject> updatePriority(@Param("plid") long plid, @Param("priority") int priority);

  @Path("/update-priority")
  Call<JSONObject> updatePriority(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutId") long layoutId, @Param("priority") int priority);

  @Path("/update-priority")
  Call<JSONObject> updatePriority(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutId") long layoutId, @Param("nextLayoutId") long nextLayoutId, @Param("previousLayoutId") long previousLayoutId);

  @Path("/validate-import-layouts-file")
  Call<JSONObject> validateImportLayoutsFile(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("parameterMap") JSONObject parameterMap, @Param("file") UploadData file);

  @Path("/validate-import-portlet-info")
  Call<JSONObject> validateImportPortletInfo(@Param("plid") long plid, @Param("groupId") long groupId, @Param("portletId") String portletId, @Param("parameterMap") JSONObject parameterMap, @Param("file") UploadData file);
}
