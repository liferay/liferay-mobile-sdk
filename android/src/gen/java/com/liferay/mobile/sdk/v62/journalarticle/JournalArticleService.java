package com.liferay.mobile.sdk.v62.journalarticle;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.file.UploadData;
import com.liferay.mobile.sdk.http.Headers;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/journalarticle")
public interface JournalArticleService {
  @Path("/add-article")
  Call<JSONObject> addArticle(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("articleId") String articleId, @Param("autoArticleId") boolean autoArticleId, @ParamObject(name = "titleMap", className = "") JSONObject titleMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("content") String content, @Param("type") String type, @Param("ddmStructureKey") String ddmStructureKey, @Param("ddmTemplateKey") String ddmTemplateKey, @Param("layoutUuid") String layoutUuid, @Param("displayDateMonth") int displayDateMonth, @Param("displayDateDay") int displayDateDay, @Param("displayDateYear") int displayDateYear, @Param("displayDateHour") int displayDateHour, @Param("displayDateMinute") int displayDateMinute, @Param("expirationDateMonth") int expirationDateMonth, @Param("expirationDateDay") int expirationDateDay, @Param("expirationDateYear") int expirationDateYear, @Param("expirationDateHour") int expirationDateHour, @Param("expirationDateMinute") int expirationDateMinute, @Param("neverExpire") boolean neverExpire, @Param("reviewDateMonth") int reviewDateMonth, @Param("reviewDateDay") int reviewDateDay, @Param("reviewDateYear") int reviewDateYear, @Param("reviewDateHour") int reviewDateHour, @Param("reviewDateMinute") int reviewDateMinute, @Param("neverReview") boolean neverReview, @Param("indexable") boolean indexable, @Param("articleURL") String articleURL, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/add-article",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<JSONObject> addArticle(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("articleId") String articleId, @Param("autoArticleId") boolean autoArticleId, @ParamObject(name = "titleMap", className = "") JSONObject titleMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("content") String content, @Param("type") String type, @Param("ddmStructureKey") String ddmStructureKey, @Param("ddmTemplateKey") String ddmTemplateKey, @Param("layoutUuid") String layoutUuid, @Param("displayDateMonth") int displayDateMonth, @Param("displayDateDay") int displayDateDay, @Param("displayDateYear") int displayDateYear, @Param("displayDateHour") int displayDateHour, @Param("displayDateMinute") int displayDateMinute, @Param("expirationDateMonth") int expirationDateMonth, @Param("expirationDateDay") int expirationDateDay, @Param("expirationDateYear") int expirationDateYear, @Param("expirationDateHour") int expirationDateHour, @Param("expirationDateMinute") int expirationDateMinute, @Param("neverExpire") boolean neverExpire, @Param("reviewDateMonth") int reviewDateMonth, @Param("reviewDateDay") int reviewDateDay, @Param("reviewDateYear") int reviewDateYear, @Param("reviewDateHour") int reviewDateHour, @Param("reviewDateMinute") int reviewDateMinute, @Param("neverReview") boolean neverReview, @Param("indexable") boolean indexable, @Param("smallImage") boolean smallImage, @Param("smallImageURL") String smallImageURL, @Param("smallFile") UploadData smallFile, @ParamObject(name = "images", className = "") JSONObject images, @Param("articleURL") String articleURL, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/copy-article")
  Call<JSONObject> copyArticle(@Param("groupId") long groupId, @Param("oldArticleId") String oldArticleId, @Param("newArticleId") String newArticleId, @Param("autoArticleId") boolean autoArticleId, @Param("version") double version);

  @Path("/delete-article")
  Call<Response> deleteArticle(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("articleURL") String articleURL, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-article")
  Call<Response> deleteArticle(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("version") double version, @Param("articleURL") String articleURL, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/expire-article")
  Call<Response> expireArticle(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("articleURL") String articleURL, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/expire-article")
  Call<JSONObject> expireArticle(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("version") double version, @Param("articleURL") String articleURL, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/get-article")
  Call<JSONObject> getArticle(@Param("id") long id);

  @Path("/get-article")
  Call<JSONObject> getArticle(@Param("groupId") long groupId, @Param("articleId") String articleId);

  @Path("/get-article")
  Call<JSONObject> getArticle(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("version") double version);

  @Path("/get-article")
  Call<JSONObject> getArticle(@Param("groupId") long groupId, @Param("className") String className, @Param("classPK") long classPK);

  @Path("/get-article-by-url-title")
  Call<JSONObject> getArticleByUrlTitle(@Param("groupId") long groupId, @Param("urlTitle") String urlTitle);

  @Path("/get-article-content")
  Call<String> getArticleContent(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("languageId") String languageId, @ParamObject(name = "themeDisplay", className = "com.liferay.portal.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/get-article-content")
  Call<String> getArticleContent(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("version") double version, @Param("languageId") String languageId, @ParamObject(name = "themeDisplay", className = "com.liferay.portal.theme.ThemeDisplay") JSONObject themeDisplay);

  @Path("/get-articles")
  Call<JSONArray> getArticles(@Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/get-articles")
  Call<JSONArray> getArticles(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-articles-by-article-id")
  Call<JSONArray> getArticlesByArticleId(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-articles-by-layout-uuid")
  Call<JSONArray> getArticlesByLayoutUuid(@Param("groupId") long groupId, @Param("layoutUuid") String layoutUuid);

  @Path("/get-articles-by-structure-id")
  Call<JSONArray> getArticlesByStructureId(@Param("groupId") long groupId, @Param("ddmStructureKey") String ddmStructureKey, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-articles-by-structure-id")
  Call<JSONArray> getArticlesByStructureId(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("ddmStructureKey") String ddmStructureKey, @Param("status") int status, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-articles-count")
  Call<Integer> getArticlesCount(@Param("groupId") long groupId, @Param("folderId") long folderId);

  @Path("/get-articles-count")
  Call<Integer> getArticlesCount(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("status") int status);

  @Path("/get-articles-count-by-article-id")
  Call<Integer> getArticlesCountByArticleId(@Param("groupId") long groupId, @Param("articleId") String articleId);

  @Path("/get-articles-count-by-structure-id")
  Call<Integer> getArticlesCountByStructureId(@Param("groupId") long groupId, @Param("ddmStructureKey") String ddmStructureKey);

  @Path("/get-articles-count-by-structure-id")
  Call<Integer> getArticlesCountByStructureId(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("ddmStructureKey") String ddmStructureKey, @Param("status") int status);

  @Path("/get-display-article-by-url-title")
  Call<JSONObject> getDisplayArticleByUrlTitle(@Param("groupId") long groupId, @Param("urlTitle") String urlTitle);

  @Path("/get-folders-and-articles-count")
  Call<Integer> getFoldersAndArticlesCount(@Param("groupId") long groupId, @Param("folderIds") JSONArray folderIds);

  @Path("/get-group-articles")
  Call<JSONArray> getGroupArticles(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId, @Param("start") int start, @Param("end") int end, @ParamObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/get-group-articles")
  Call<JSONArray> getGroupArticles(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId, @Param("status") int status, @Param("start") int start, @Param("end") int end, @ParamObject(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/get-group-articles-count")
  Call<Integer> getGroupArticlesCount(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId);

  @Path("/get-group-articles-count")
  Call<Integer> getGroupArticlesCount(@Param("groupId") long groupId, @Param("userId") long userId, @Param("rootFolderId") long rootFolderId, @Param("status") int status);

  @Path("/get-latest-article")
  Call<JSONObject> getLatestArticle(@Param("resourcePrimKey") long resourcePrimKey);

  @Path("/get-latest-article")
  Call<JSONObject> getLatestArticle(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("status") int status);

  @Path("/get-latest-article")
  Call<JSONObject> getLatestArticle(@Param("groupId") long groupId, @Param("className") String className, @Param("classPK") long classPK);

  @Path("/move-article")
  Call<Response> moveArticle(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("newFolderId") long newFolderId);

  @Path("/move-article-from-trash")
  Call<JSONObject> moveArticleFromTrash(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("newFolderId") long newFolderId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-article-from-trash")
  Call<JSONObject> moveArticleFromTrash(@Param("groupId") long groupId, @Param("resourcePrimKey") long resourcePrimKey, @Param("newFolderId") long newFolderId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/move-article-to-trash")
  Call<JSONObject> moveArticleToTrash(@Param("groupId") long groupId, @Param("articleId") String articleId);

  @Path("/remove-article-locale")
  Call<Response> removeArticleLocale(@Param("companyId") long companyId, @Param("languageId") String languageId);

  @Path("/remove-article-locale")
  Call<JSONObject> removeArticleLocale(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("version") double version, @Param("languageId") String languageId);

  @Path("/restore-article-from-trash")
  Call<Response> restoreArticleFromTrash(@Param("resourcePrimKey") long resourcePrimKey);

  @Path("/restore-article-from-trash")
  Call<Response> restoreArticleFromTrash(@Param("groupId") long groupId, @Param("articleId") String articleId);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("folderIds") JSONArray folderIds, @Param("classNameId") long classNameId, @Param("keywords") String keywords, @Param("version") double version, @Param("type") String type, @Param("ddmStructureKey") String ddmStructureKey, @Param("ddmTemplateKey") String ddmTemplateKey, @Param("displayDateGT") long displayDateGT, @Param("displayDateLT") long displayDateLT, @Param("status") int status, @Param("reviewDate") long reviewDate, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("folderIds") JSONArray folderIds, @Param("classNameId") long classNameId, @Param("articleId") String articleId, @Param("version") double version, @Param("title") String title, @Param("description") String description, @Param("content") String content, @Param("type") String type, @Param("ddmStructureKey") String ddmStructureKey, @Param("ddmTemplateKey") String ddmTemplateKey, @Param("displayDateGT") long displayDateGT, @Param("displayDateLT") long displayDateLT, @Param("status") int status, @Param("reviewDate") long reviewDate, @Param("andOperator") boolean andOperator, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("folderIds") JSONArray folderIds, @Param("classNameId") long classNameId, @Param("articleId") String articleId, @Param("version") double version, @Param("title") String title, @Param("description") String description, @Param("content") String content, @Param("type") String type, @Param("ddmStructureKeys") JSONArray ddmStructureKeys, @Param("ddmTemplateKeys") JSONArray ddmTemplateKeys, @Param("displayDateGT") long displayDateGT, @Param("displayDateLT") long displayDateLT, @Param("status") int status, @Param("reviewDate") long reviewDate, @Param("andOperator") boolean andOperator, @Param("start") int start, @Param("end") int end, @ParamObject(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/search")
  Call<JSONObject> search(@Param("groupId") long groupId, @Param("creatorUserId") long creatorUserId, @Param("status") int status, @Param("start") int start, @Param("end") int end);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("folderIds") JSONArray folderIds, @Param("classNameId") long classNameId, @Param("keywords") String keywords, @Param("version") double version, @Param("type") String type, @Param("ddmStructureKey") String ddmStructureKey, @Param("ddmTemplateKey") String ddmTemplateKey, @Param("displayDateGT") long displayDateGT, @Param("displayDateLT") long displayDateLT, @Param("status") int status, @Param("reviewDate") long reviewDate);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("folderIds") JSONArray folderIds, @Param("classNameId") long classNameId, @Param("articleId") String articleId, @Param("version") double version, @Param("title") String title, @Param("description") String description, @Param("content") String content, @Param("type") String type, @Param("ddmStructureKey") String ddmStructureKey, @Param("ddmTemplateKey") String ddmTemplateKey, @Param("displayDateGT") long displayDateGT, @Param("displayDateLT") long displayDateLT, @Param("status") int status, @Param("reviewDate") long reviewDate, @Param("andOperator") boolean andOperator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("folderIds") JSONArray folderIds, @Param("classNameId") long classNameId, @Param("articleId") String articleId, @Param("version") double version, @Param("title") String title, @Param("description") String description, @Param("content") String content, @Param("type") String type, @Param("ddmStructureKeys") JSONArray ddmStructureKeys, @Param("ddmTemplateKeys") JSONArray ddmTemplateKeys, @Param("displayDateGT") long displayDateGT, @Param("displayDateLT") long displayDateLT, @Param("status") int status, @Param("reviewDate") long reviewDate, @Param("andOperator") boolean andOperator);

  @Path("/subscribe")
  Call<Response> subscribe(@Param("groupId") long groupId);

  @Path("/unsubscribe")
  Call<Response> unsubscribe(@Param("groupId") long groupId);

  @Path("/update-article")
  Call<JSONObject> updateArticle(@Param("userId") long userId, @Param("groupId") long groupId, @Param("folderId") long folderId, @Param("articleId") String articleId, @Param("version") double version, @ParamObject(name = "titleMap", className = "") JSONObject titleMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("content") String content, @Param("layoutUuid") String layoutUuid, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path(
      value = "/update-article",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<JSONObject> updateArticle(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("articleId") String articleId, @Param("version") double version, @ParamObject(name = "titleMap", className = "") JSONObject titleMap, @ParamObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("content") String content, @Param("type") String type, @Param("ddmStructureKey") String ddmStructureKey, @Param("ddmTemplateKey") String ddmTemplateKey, @Param("layoutUuid") String layoutUuid, @Param("displayDateMonth") int displayDateMonth, @Param("displayDateDay") int displayDateDay, @Param("displayDateYear") int displayDateYear, @Param("displayDateHour") int displayDateHour, @Param("displayDateMinute") int displayDateMinute, @Param("expirationDateMonth") int expirationDateMonth, @Param("expirationDateDay") int expirationDateDay, @Param("expirationDateYear") int expirationDateYear, @Param("expirationDateHour") int expirationDateHour, @Param("expirationDateMinute") int expirationDateMinute, @Param("neverExpire") boolean neverExpire, @Param("reviewDateMonth") int reviewDateMonth, @Param("reviewDateDay") int reviewDateDay, @Param("reviewDateYear") int reviewDateYear, @Param("reviewDateHour") int reviewDateHour, @Param("reviewDateMinute") int reviewDateMinute, @Param("neverReview") boolean neverReview, @Param("indexable") boolean indexable, @Param("smallImage") boolean smallImage, @Param("smallImageURL") String smallImageURL, @Param("smallFile") UploadData smallFile, @ParamObject(name = "images", className = "") JSONObject images, @Param("articleURL") String articleURL, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-article")
  Call<JSONObject> updateArticle(@Param("groupId") long groupId, @Param("folderId") long folderId, @Param("articleId") String articleId, @Param("version") double version, @Param("content") String content, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-article-translation")
  Call<JSONObject> updateArticleTranslation(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("version") double version, @Param("locale") String locale, @Param("title") String title, @Param("description") String description, @Param("content") String content, @ParamObject(name = "images", className = "") JSONObject images);

  @Path("/update-article-translation")
  Call<JSONObject> updateArticleTranslation(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("version") double version, @Param("locale") String locale, @Param("title") String title, @Param("description") String description, @Param("content") String content, @ParamObject(name = "images", className = "") JSONObject images, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-content")
  Call<JSONObject> updateContent(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("version") double version, @Param("content") String content);

  @Path("/update-status")
  Call<JSONObject> updateStatus(@Param("groupId") long groupId, @Param("articleId") String articleId, @Param("version") double version, @Param("status") int status, @Param("articleURL") String articleURL, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
