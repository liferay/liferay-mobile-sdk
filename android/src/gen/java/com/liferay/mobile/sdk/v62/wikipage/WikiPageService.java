package com.liferay.mobile.sdk.v62.wikipage;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.file.UploadData;
import com.liferay.mobile.sdk.http.ContentType;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/wikipage")
public interface WikiPageService {
  @Path("/add-page")
  Call<JSONObject> addPage(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "content") String content, @Param(name = "summary") String summary, @Param(name = "minorEdit") boolean minorEdit, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-page")
  Call<JSONObject> addPage(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "content") String content, @Param(name = "summary") String summary, @Param(name = "minorEdit") boolean minorEdit, @Param(name = "format") String format, @Param(name = "parentTitle") String parentTitle, @Param(name = "redirectTitle") String redirectTitle, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/add-page-attachment",
      contentType = ContentType.MULTIPART
  )
  Call<Response> addPageAttachment(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "fileName") String fileName, @Param(name = "file") UploadData file, @Param(name = "mimeType") String mimeType);

  @Path("/add-page-attachments")
  Call<Response> addPageAttachments(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "inputStreamOVPs") JSONArray inputStreamOVPs);

  @Path("/change-parent")
  Call<Response> changeParent(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "newParentTitle") String newParentTitle, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-page-attachments")
  Call<Response> copyPageAttachments(@Param(name = "templateNodeId") long templateNodeId, @Param(name = "templateTitle") String templateTitle, @Param(name = "nodeId") long nodeId, @Param(name = "title") String title);

  @Path("/delete-page")
  Call<Response> deletePage(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title);

  @Path("/delete-page")
  Call<Response> deletePage(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "version") double version);

  @Path("/delete-page-attachment")
  Call<Response> deletePageAttachment(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "fileName") String fileName);

  @Path("/delete-page-attachments")
  Call<Response> deletePageAttachments(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title);

  @Path("/delete-temp-page-attachment")
  Call<Response> deleteTempPageAttachment(@Param(name = "nodeId") long nodeId, @Param(name = "fileName") String fileName, @Param(name = "tempFolderName") String tempFolderName);

  @Path("/delete-trash-page-attachments")
  Call<Response> deleteTrashPageAttachments(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title);

  @Path("/discard-draft")
  Call<Response> discardDraft(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "version") double version);

  @Path("/get-children")
  Call<JSONArray> getChildren(@Param(name = "groupId") long groupId, @Param(name = "nodeId") long nodeId, @Param(name = "head") boolean head, @Param(name = "parentTitle") String parentTitle);

  @Path("/get-draft-page")
  Call<JSONObject> getDraftPage(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title);

  @Path("/get-node-pages")
  Call<JSONArray> getNodePages(@Param(name = "nodeId") long nodeId, @Param(name = "max") int max);

  @Path("/get-node-pages-rss")
  Call<String> getNodePagesRss(@Param(name = "nodeId") long nodeId, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL);

  @Path("/get-node-pages-rss")
  Call<String> getNodePagesRss(@Param(name = "nodeId") long nodeId, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @Param(name = "attachmentURLPrefix") String attachmentURLPrefix);

  @Path("/get-orphans")
  Call<JSONArray> getOrphans(@Param(name = "groupId") long groupId, @Param(name = "nodeId") long nodeId);

  @Path("/get-page")
  Call<JSONObject> getPage(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title);

  @Path("/get-page")
  Call<JSONObject> getPage(@Param(name = "groupId") long groupId, @Param(name = "nodeId") long nodeId, @Param(name = "title") String title);

  @Path("/get-page")
  Call<JSONObject> getPage(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "head") boolean head);

  @Path("/get-page")
  Call<JSONObject> getPage(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "version") double version);

  @Path("/get-pages")
  Call<JSONArray> getPages(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "nodeId") long nodeId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-pages")
  Call<JSONArray> getPages(@Param(name = "groupId") long groupId, @Param(name = "nodeId") long nodeId, @Param(name = "head") boolean head, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-pages-count")
  Call<Integer> getPagesCount(@Param(name = "groupId") long groupId, @Param(name = "nodeId") long nodeId, @Param(name = "head") boolean head);

  @Path("/get-pages-count")
  Call<Integer> getPagesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "nodeId") long nodeId, @Param(name = "status") int status);

  @Path("/get-pages-rss")
  Call<String> getPagesRss(@Param(name = "companyId") long companyId, @Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @Param(name = "locale") String locale);

  @Path("/get-pages-rss")
  Call<String> getPagesRss(@Param(name = "companyId") long companyId, @Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @Param(name = "attachmentURLPrefix") String attachmentURLPrefix, @Param(name = "locale") String locale);

  @Path("/get-recent-changes")
  Call<JSONArray> getRecentChanges(@Param(name = "groupId") long groupId, @Param(name = "nodeId") long nodeId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-recent-changes-count")
  Call<Integer> getRecentChangesCount(@Param(name = "groupId") long groupId, @Param(name = "nodeId") long nodeId);

  @Path("/get-temp-page-attachment-names")
  Call<JSONArray> getTempPageAttachmentNames(@Param(name = "nodeId") long nodeId, @Param(name = "tempFolderName") String tempFolderName);

  @Path("/move-page")
  Call<Response> movePage(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "newTitle") String newTitle, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-page-attachment-to-trash")
  Call<JSONObject> movePageAttachmentToTrash(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "fileName") String fileName);

  @Path("/move-page-to-trash")
  Call<JSONObject> movePageToTrash(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title);

  @Path("/move-page-to-trash")
  Call<JSONObject> movePageToTrash(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "version") double version);

  @Path("/restore-page-attachment-from-trash")
  Call<Response> restorePageAttachmentFromTrash(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "fileName") String fileName);

  @Path("/restore-page-from-trash")
  Call<Response> restorePageFromTrash(@Param(name = "resourcePrimKey") long resourcePrimKey);

  @Path("/revert-page")
  Call<JSONObject> revertPage(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "version") double version, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/subscribe-page")
  Call<Response> subscribePage(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title);

  @Path("/unsubscribe-page")
  Call<Response> unsubscribePage(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title);

  @Path("/update-page")
  Call<JSONObject> updatePage(@Param(name = "nodeId") long nodeId, @Param(name = "title") String title, @Param(name = "version") double version, @Param(name = "content") String content, @Param(name = "summary") String summary, @Param(name = "minorEdit") boolean minorEdit, @Param(name = "format") String format, @Param(name = "parentTitle") String parentTitle, @Param(name = "redirectTitle") String redirectTitle, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
