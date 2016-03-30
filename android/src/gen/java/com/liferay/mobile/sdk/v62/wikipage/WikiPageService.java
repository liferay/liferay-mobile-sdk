package com.liferay.mobile.sdk.v62.wikipage;

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

@Path("/wikipage")
public interface WikiPageService {
  @Path("/add-page")
  Call<JSONObject> addPage(@Param("nodeId") long nodeId, @Param("title") String title, @Param("content") String content, @Param("summary") String summary, @Param("minorEdit") boolean minorEdit, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-page")
  Call<JSONObject> addPage(@Param("nodeId") long nodeId, @Param("title") String title, @Param("content") String content, @Param("summary") String summary, @Param("minorEdit") boolean minorEdit, @Param("format") String format, @Param("parentTitle") String parentTitle, @Param("redirectTitle") String redirectTitle, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/add-page-attachment",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<Response> addPageAttachment(@Param("nodeId") long nodeId, @Param("title") String title, @Param("fileName") String fileName, @Param("file") UploadData file, @Param("mimeType") String mimeType);

  @Path("/add-page-attachments")
  Call<Response> addPageAttachments(@Param("nodeId") long nodeId, @Param("title") String title, @Param("inputStreamOVPs") JSONArray inputStreamOVPs);

  @Path("/change-parent")
  Call<Response> changeParent(@Param("nodeId") long nodeId, @Param("title") String title, @Param("newParentTitle") String newParentTitle, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-page-attachments")
  Call<Response> copyPageAttachments(@Param("templateNodeId") long templateNodeId, @Param("templateTitle") String templateTitle, @Param("nodeId") long nodeId, @Param("title") String title);

  @Path("/delete-page")
  Call<Response> deletePage(@Param("nodeId") long nodeId, @Param("title") String title);

  @Path("/delete-page")
  Call<Response> deletePage(@Param("nodeId") long nodeId, @Param("title") String title, @Param("version") double version);

  @Path("/delete-page-attachment")
  Call<Response> deletePageAttachment(@Param("nodeId") long nodeId, @Param("title") String title, @Param("fileName") String fileName);

  @Path("/delete-page-attachments")
  Call<Response> deletePageAttachments(@Param("nodeId") long nodeId, @Param("title") String title);

  @Path("/delete-temp-page-attachment")
  Call<Response> deleteTempPageAttachment(@Param("nodeId") long nodeId, @Param("fileName") String fileName, @Param("tempFolderName") String tempFolderName);

  @Path("/delete-trash-page-attachments")
  Call<Response> deleteTrashPageAttachments(@Param("nodeId") long nodeId, @Param("title") String title);

  @Path("/discard-draft")
  Call<Response> discardDraft(@Param("nodeId") long nodeId, @Param("title") String title, @Param("version") double version);

  @Path("/get-children")
  Call<JSONArray> getChildren(@Param("groupId") long groupId, @Param("nodeId") long nodeId, @Param("head") boolean head, @Param("parentTitle") String parentTitle);

  @Path("/get-draft-page")
  Call<JSONObject> getDraftPage(@Param("nodeId") long nodeId, @Param("title") String title);

  @Path("/get-node-pages")
  Call<JSONArray> getNodePages(@Param("nodeId") long nodeId, @Param("max") int max);

  @Path("/get-node-pages-rss")
  Call<String> getNodePagesRss(@Param("nodeId") long nodeId, @Param("max") int max, @Param("type") String type, @Param("version") double version, @Param("displayStyle") String displayStyle, @Param("feedURL") String feedURL, @Param("entryURL") String entryURL);

  @Path("/get-node-pages-rss")
  Call<String> getNodePagesRss(@Param("nodeId") long nodeId, @Param("max") int max, @Param("type") String type, @Param("version") double version, @Param("displayStyle") String displayStyle, @Param("feedURL") String feedURL, @Param("entryURL") String entryURL, @Param("attachmentURLPrefix") String attachmentURLPrefix);

  @Path("/get-orphans")
  Call<JSONArray> getOrphans(@Param("groupId") long groupId, @Param("nodeId") long nodeId);

  @Path("/get-page")
  Call<JSONObject> getPage(@Param("nodeId") long nodeId, @Param("title") String title);

  @Path("/get-page")
  Call<JSONObject> getPage(@Param("groupId") long groupId, @Param("nodeId") long nodeId, @Param("title") String title);

  @Path("/get-page")
  Call<JSONObject> getPage(@Param("nodeId") long nodeId, @Param("title") String title, @Param("head") boolean head);

  @Path("/get-page")
  Call<JSONObject> getPage(@Param("nodeId") long nodeId, @Param("title") String title, @Param("version") double version);

  @Path("/get-pages")
  Call<JSONArray> getPages(@Param("groupId") long groupId, @Param("userId") long userId, @Param("nodeId") long nodeId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-pages")
  Call<JSONArray> getPages(@Param("groupId") long groupId, @Param("nodeId") long nodeId, @Param("head") boolean head, @Param("status") int status, @Param("start") int start, @Param("end") int end, @JsonObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-pages-count")
  Call<Integer> getPagesCount(@Param("groupId") long groupId, @Param("nodeId") long nodeId, @Param("head") boolean head);

  @Path("/get-pages-count")
  Call<Integer> getPagesCount(@Param("groupId") long groupId, @Param("userId") long userId, @Param("nodeId") long nodeId, @Param("status") int status);

  @Path("/get-pages-rss")
  Call<String> getPagesRss(@Param("companyId") long companyId, @Param("nodeId") long nodeId, @Param("title") String title, @Param("max") int max, @Param("type") String type, @Param("version") double version, @Param("displayStyle") String displayStyle, @Param("feedURL") String feedURL, @Param("entryURL") String entryURL, @Param("locale") String locale);

  @Path("/get-pages-rss")
  Call<String> getPagesRss(@Param("companyId") long companyId, @Param("nodeId") long nodeId, @Param("title") String title, @Param("max") int max, @Param("type") String type, @Param("version") double version, @Param("displayStyle") String displayStyle, @Param("feedURL") String feedURL, @Param("entryURL") String entryURL, @Param("attachmentURLPrefix") String attachmentURLPrefix, @Param("locale") String locale);

  @Path("/get-recent-changes")
  Call<JSONArray> getRecentChanges(@Param("groupId") long groupId, @Param("nodeId") long nodeId, @Param("start") int start, @Param("end") int end);

  @Path("/get-recent-changes-count")
  Call<Integer> getRecentChangesCount(@Param("groupId") long groupId, @Param("nodeId") long nodeId);

  @Path("/get-temp-page-attachment-names")
  Call<JSONArray> getTempPageAttachmentNames(@Param("nodeId") long nodeId, @Param("tempFolderName") String tempFolderName);

  @Path("/move-page")
  Call<Response> movePage(@Param("nodeId") long nodeId, @Param("title") String title, @Param("newTitle") String newTitle, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-page-attachment-to-trash")
  Call<JSONObject> movePageAttachmentToTrash(@Param("nodeId") long nodeId, @Param("title") String title, @Param("fileName") String fileName);

  @Path("/move-page-to-trash")
  Call<JSONObject> movePageToTrash(@Param("nodeId") long nodeId, @Param("title") String title);

  @Path("/move-page-to-trash")
  Call<JSONObject> movePageToTrash(@Param("nodeId") long nodeId, @Param("title") String title, @Param("version") double version);

  @Path("/restore-page-attachment-from-trash")
  Call<Response> restorePageAttachmentFromTrash(@Param("nodeId") long nodeId, @Param("title") String title, @Param("fileName") String fileName);

  @Path("/restore-page-from-trash")
  Call<Response> restorePageFromTrash(@Param("resourcePrimKey") long resourcePrimKey);

  @Path("/revert-page")
  Call<JSONObject> revertPage(@Param("nodeId") long nodeId, @Param("title") String title, @Param("version") double version, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/subscribe-page")
  Call<Response> subscribePage(@Param("nodeId") long nodeId, @Param("title") String title);

  @Path("/unsubscribe-page")
  Call<Response> unsubscribePage(@Param("nodeId") long nodeId, @Param("title") String title);

  @Path("/update-page")
  Call<JSONObject> updatePage(@Param("nodeId") long nodeId, @Param("title") String title, @Param("version") double version, @Param("content") String content, @Param("summary") String summary, @Param("minorEdit") boolean minorEdit, @Param("format") String format, @Param("parentTitle") String parentTitle, @Param("redirectTitle") String redirectTitle, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
