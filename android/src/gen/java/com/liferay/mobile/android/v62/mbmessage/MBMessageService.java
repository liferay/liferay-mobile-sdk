package com.liferay.mobile.android.v62.mbmessage;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/mbmessage")
public interface MBMessageService {
  @Path("/add-discussion-message")
  Call<JSONObject> addDiscussionMessage(@Param("groupId") long groupId, @Param("className") String className, @Param("classPK") long classPK, @Param("permissionClassName") String permissionClassName, @Param("permissionClassPK") long permissionClassPK, @Param("permissionOwnerId") long permissionOwnerId, @Param("threadId") long threadId, @Param("parentMessageId") long parentMessageId, @Param("subject") String subject, @Param("body") String body, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-message")
  Call<JSONObject> addMessage(@Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("subject") String subject, @Param("body") String body, @Param("format") String format, @Param("inputStreamOVPs") JSONArray inputStreamOVPs, @Param("anonymous") boolean anonymous, @Param("priority") double priority, @Param("allowPingbacks") boolean allowPingbacks, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-message")
  Call<JSONObject> addMessage(@Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("threadId") long threadId, @Param("parentMessageId") long parentMessageId, @Param("subject") String subject, @Param("body") String body, @Param("format") String format, @Param("inputStreamOVPs") JSONArray inputStreamOVPs, @Param("anonymous") boolean anonymous, @Param("priority") double priority, @Param("allowPingbacks") boolean allowPingbacks, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-message")
  Call<JSONObject> addMessage(@Param("categoryId") long categoryId, @Param("subject") String subject, @Param("body") String body, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-message")
  Call<JSONObject> addMessage(@Param("parentMessageId") long parentMessageId, @Param("subject") String subject, @Param("body") String body, @Param("format") String format, @Param("inputStreamOVPs") JSONArray inputStreamOVPs, @Param("anonymous") boolean anonymous, @Param("priority") double priority, @Param("allowPingbacks") boolean allowPingbacks, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-discussion-message")
  Call<Response> deleteDiscussionMessage(@Param("groupId") long groupId, @Param("className") String className, @Param("classPK") long classPK, @Param("permissionClassName") String permissionClassName, @Param("permissionClassPK") long permissionClassPK, @Param("permissionOwnerId") long permissionOwnerId, @Param("messageId") long messageId);

  @Path("/delete-message")
  Call<Response> deleteMessage(@Param("messageId") long messageId);

  @Path("/delete-message-attachments")
  Call<Response> deleteMessageAttachments(@Param("messageId") long messageId);

  @Path("/get-category-messages")
  Call<JSONArray> getCategoryMessages(@Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-category-messages-count")
  Call<Integer> getCategoryMessagesCount(@Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("status") int status);

  @Path("/get-category-messages-rss")
  Call<String> getCategoryMessagesRss(@Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("status") int status, @Param("max") int max, @Param("type") String type, @Param("version") double version, @Param("displayStyle") String displayStyle, @Param("feedURL") String feedURL, @Param("entryURL") String entryURL, @JsonObject(name = "themeDisplay", className = "com.liferay.portal.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/get-company-messages-rss")
  Call<String> getCompanyMessagesRss(@Param("companyId") long companyId, @Param("status") int status, @Param("max") int max, @Param("type") String type, @Param("version") double version, @Param("displayStyle") String displayStyle, @Param("feedURL") String feedURL, @Param("entryURL") String entryURL, @JsonObject(name = "themeDisplay", className = "com.liferay.portal.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/get-group-messages-count")
  Call<Integer> getGroupMessagesCount(@Param("groupId") long groupId, @Param("status") int status);

  @Path("/get-group-messages-rss")
  Call<String> getGroupMessagesRss(@Param("groupId") long groupId, @Param("userId") long userId, @Param("status") int status, @Param("max") int max, @Param("type") String type, @Param("version") double version, @Param("displayStyle") String displayStyle, @Param("feedURL") String feedURL, @Param("entryURL") String entryURL, @JsonObject(name = "themeDisplay", className = "com.liferay.portal.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/get-group-messages-rss")
  Call<String> getGroupMessagesRss(@Param("groupId") long groupId, @Param("status") int status, @Param("max") int max, @Param("type") String type, @Param("version") double version, @Param("displayStyle") String displayStyle, @Param("feedURL") String feedURL, @Param("entryURL") String entryURL, @JsonObject(name = "themeDisplay", className = "com.liferay.portal.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/get-message")
  Call<JSONObject> getMessage(@Param("messageId") long messageId);

  @Path("/get-message-display")
  Call<JSONObject> getMessageDisplay(@Param("messageId") long messageId, @Param("status") int status, @Param("threadView") String threadView, @Param("includePrevAndNext") boolean includePrevAndNext);

  @Path("/get-thread-answers-count")
  Call<Integer> getThreadAnswersCount(@Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("threadId") long threadId);

  @Path("/get-thread-messages")
  Call<JSONArray> getThreadMessages(@Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("threadId") long threadId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/get-thread-messages-count")
  Call<Integer> getThreadMessagesCount(@Param("groupId") long groupId, @Param("categoryId") long categoryId, @Param("threadId") long threadId, @Param("status") int status);

  @Path("/get-thread-messages-rss")
  Call<String> getThreadMessagesRss(@Param("threadId") long threadId, @Param("status") int status, @Param("max") int max, @Param("type") String type, @Param("version") double version, @Param("displayStyle") String displayStyle, @Param("feedURL") String feedURL, @Param("entryURL") String entryURL, @JsonObject(name = "themeDisplay", className = "com.liferay.portal.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/restore-message-attachment-from-trash")
  Call<Response> restoreMessageAttachmentFromTrash(@Param("messageId") long messageId, @Param("fileName") String fileName);

  @Path("/subscribe-message")
  Call<Response> subscribeMessage(@Param("messageId") long messageId);

  @Path("/unsubscribe-message")
  Call<Response> unsubscribeMessage(@Param("messageId") long messageId);

  @Path("/update-answer")
  Call<Response> updateAnswer(@Param("messageId") long messageId, @Param("answer") boolean answer, @Param("cascade") boolean cascade);

  @Path("/update-discussion-message")
  Call<JSONObject> updateDiscussionMessage(@Param("className") String className, @Param("classPK") long classPK, @Param("permissionClassName") String permissionClassName, @Param("permissionClassPK") long permissionClassPK, @Param("permissionOwnerId") long permissionOwnerId, @Param("messageId") long messageId, @Param("subject") String subject, @Param("body") String body, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-message")
  Call<JSONObject> updateMessage(@Param("messageId") long messageId, @Param("subject") String subject, @Param("body") String body, @Param("inputStreamOVPs") JSONArray inputStreamOVPs, @Param("existingFiles") JSONArray existingFiles, @Param("priority") double priority, @Param("allowPingbacks") boolean allowPingbacks, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
