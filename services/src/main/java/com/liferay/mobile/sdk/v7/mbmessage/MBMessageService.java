package com.liferay.mobile.sdk.v7.mbmessage;

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

@Path("/mbmessage")
public interface MBMessageService {
  @Path("/add-discussion-message")
  Call<JSONObject> addDiscussionMessage(@Param(name = "groupId") long groupId, @Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "threadId") long threadId, @Param(name = "parentMessageId") long parentMessageId, @Param(name = "subject") String subject, @Param(name = "body") String body, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-message")
  Call<JSONObject> addMessage(@Param(name = "categoryId") long categoryId, @Param(name = "subject") String subject, @Param(name = "body") String body, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-message")
  Call<JSONObject> addMessage(@Param(name = "parentMessageId") long parentMessageId, @Param(name = "subject") String subject, @Param(name = "body") String body, @Param(name = "format") String format, @Param(name = "inputStreamOVPs") JSONArray inputStreamOVPs, @Param(name = "anonymous") boolean anonymous, @Param(name = "priority") double priority, @Param(name = "allowPingbacks") boolean allowPingbacks, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-message")
  Call<JSONObject> addMessage(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "subject") String subject, @Param(name = "body") String body, @Param(name = "format") String format, @Param(name = "inputStreamOVPs") JSONArray inputStreamOVPs, @Param(name = "anonymous") boolean anonymous, @Param(name = "priority") double priority, @Param(name = "allowPingbacks") boolean allowPingbacks, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/add-message",
      contentType = ContentType.MULTIPART
  )
  Call<JSONObject> addMessage(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "subject") String subject, @Param(name = "body") String body, @Param(name = "format") String format, @Param(name = "fileName") String fileName, @Param(name = "file") UploadData file, @Param(name = "anonymous") boolean anonymous, @Param(name = "priority") double priority, @Param(name = "allowPingbacks") boolean allowPingbacks, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/add-message-attachment",
      contentType = ContentType.MULTIPART
  )
  Call<Response> addMessageAttachment(@Param(name = "messageId") long messageId, @Param(name = "fileName") String fileName, @Param(name = "file") UploadData file, @Param(name = "mimeType") String mimeType);

  @Path("/delete-discussion-message")
  Call<Response> deleteDiscussionMessage(@Param(name = "messageId") long messageId);

  @Path("/delete-discussion-message")
  Call<Response> deleteDiscussionMessage(@Param(name = "groupId") long groupId, @Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "permissionClassName") String permissionClassName, @Param(name = "permissionClassPK") long permissionClassPK, @Param(name = "permissionOwnerId") long permissionOwnerId, @Param(name = "messageId") long messageId);

  @Path("/delete-message")
  Call<Response> deleteMessage(@Param(name = "messageId") long messageId);

  @Path("/delete-message-attachment")
  Call<Response> deleteMessageAttachment(@Param(name = "messageId") long messageId, @Param(name = "fileName") String fileName);

  @Path("/delete-message-attachments")
  Call<Response> deleteMessageAttachments(@Param(name = "messageId") long messageId);

  @Path("/empty-message-attachments")
  Call<Response> emptyMessageAttachments(@Param(name = "messageId") long messageId);

  @Path("/get-category-messages")
  Call<JSONArray> getCategoryMessages(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-category-messages-count")
  Call<Integer> getCategoryMessagesCount(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "status") int status);

  @Path("/get-category-messages-rss")
  Call<String> getCategoryMessagesRSS(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "status") int status, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @Param(name = "themeDisplay", className = "com.liferay.portal.kernel.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/get-company-messages-rss")
  Call<String> getCompanyMessagesRSS(@Param(name = "companyId") long companyId, @Param(name = "status") int status, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @Param(name = "themeDisplay", className = "com.liferay.portal.kernel.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/get-group-messages-count")
  Call<Integer> getGroupMessagesCount(@Param(name = "groupId") long groupId, @Param(name = "status") int status);

  @Path("/get-group-messages-rss")
  Call<String> getGroupMessagesRSS(@Param(name = "groupId") long groupId, @Param(name = "status") int status, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @Param(name = "themeDisplay", className = "com.liferay.portal.kernel.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/get-group-messages-rss")
  Call<String> getGroupMessagesRSS(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "status") int status, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @Param(name = "themeDisplay", className = "com.liferay.portal.kernel.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/get-message")
  Call<JSONObject> getMessage(@Param(name = "messageId") long messageId);

  @Path("/get-message-display")
  Call<JSONObject> getMessageDisplay(@Param(name = "messageId") long messageId, @Param(name = "status") int status);

  @Path("/get-message-display")
  Call<JSONObject> getMessageDisplay(@Param(name = "messageId") long messageId, @Param(name = "status") int status, @Param(name = "threadView") String threadView, @Param(name = "includePrevAndNext") boolean includePrevAndNext);

  @Path("/get-thread-answers-count")
  Call<Integer> getThreadAnswersCount(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "threadId") long threadId);

  @Path("/get-thread-messages")
  Call<JSONArray> getThreadMessages(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "threadId") long threadId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-thread-messages-count")
  Call<Integer> getThreadMessagesCount(@Param(name = "groupId") long groupId, @Param(name = "categoryId") long categoryId, @Param(name = "threadId") long threadId, @Param(name = "status") int status);

  @Path("/get-thread-messages-rss")
  Call<String> getThreadMessagesRSS(@Param(name = "threadId") long threadId, @Param(name = "status") int status, @Param(name = "max") int max, @Param(name = "type") String type, @Param(name = "version") double version, @Param(name = "displayStyle") String displayStyle, @Param(name = "feedURL") String feedURL, @Param(name = "entryURL") String entryURL, @Param(name = "themeDisplay", className = "com.liferay.portal.kernel.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/restore-message-attachment-from-trash")
  Call<Response> restoreMessageAttachmentFromTrash(@Param(name = "messageId") long messageId, @Param(name = "fileName") String fileName);

  @Path("/subscribe-message")
  Call<Response> subscribeMessage(@Param(name = "messageId") long messageId);

  @Path("/unsubscribe-message")
  Call<Response> unsubscribeMessage(@Param(name = "messageId") long messageId);

  @Path("/update-answer")
  Call<Response> updateAnswer(@Param(name = "messageId") long messageId, @Param(name = "answer") boolean answer, @Param(name = "cascade") boolean cascade);

  @Path("/update-discussion-message")
  Call<JSONObject> updateDiscussionMessage(@Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "messageId") long messageId, @Param(name = "subject") String subject, @Param(name = "body") String body, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-message")
  Call<JSONObject> updateMessage(@Param(name = "messageId") long messageId, @Param(name = "subject") String subject, @Param(name = "body") String body, @Param(name = "inputStreamOVPs") JSONArray inputStreamOVPs, @Param(name = "existingFiles") JSONArray existingFiles, @Param(name = "priority") double priority, @Param(name = "allowPingbacks") boolean allowPingbacks, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
