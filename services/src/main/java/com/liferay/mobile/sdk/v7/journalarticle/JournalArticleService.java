package com.liferay.mobile.sdk.v7.journalarticle;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/journal.journalarticle")
public interface JournalArticleService {
  @Path("/add-article")
  Call<JSONObject> addArticle(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "articleId") String articleId, @Param(name = "autoArticleId") boolean autoArticleId, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "content") String content, @Param(name = "ddmStructureKey") String ddmStructureKey, @Param(name = "ddmTemplateKey") String ddmTemplateKey, @Param(name = "layoutUuid") String layoutUuid, @Param(name = "displayDateMonth") int displayDateMonth, @Param(name = "displayDateDay") int displayDateDay, @Param(name = "displayDateYear") int displayDateYear, @Param(name = "displayDateHour") int displayDateHour, @Param(name = "displayDateMinute") int displayDateMinute, @Param(name = "expirationDateMonth") int expirationDateMonth, @Param(name = "expirationDateDay") int expirationDateDay, @Param(name = "expirationDateYear") int expirationDateYear, @Param(name = "expirationDateHour") int expirationDateHour, @Param(name = "expirationDateMinute") int expirationDateMinute, @Param(name = "neverExpire") boolean neverExpire, @Param(name = "reviewDateMonth") int reviewDateMonth, @Param(name = "reviewDateDay") int reviewDateDay, @Param(name = "reviewDateYear") int reviewDateYear, @Param(name = "reviewDateHour") int reviewDateHour, @Param(name = "reviewDateMinute") int reviewDateMinute, @Param(name = "neverReview") boolean neverReview, @Param(name = "indexable") boolean indexable, @Param(name = "articleURL") String articleURL, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/add-article")
  Call<JSONObject> addArticle(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "articleId") String articleId, @Param(name = "autoArticleId") boolean autoArticleId, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "content") String content, @Param(name = "ddmStructureKey") String ddmStructureKey, @Param(name = "ddmTemplateKey") String ddmTemplateKey, @Param(name = "layoutUuid") String layoutUuid, @Param(name = "displayDateMonth") int displayDateMonth, @Param(name = "displayDateDay") int displayDateDay, @Param(name = "displayDateYear") int displayDateYear, @Param(name = "displayDateHour") int displayDateHour, @Param(name = "displayDateMinute") int displayDateMinute, @Param(name = "expirationDateMonth") int expirationDateMonth, @Param(name = "expirationDateDay") int expirationDateDay, @Param(name = "expirationDateYear") int expirationDateYear, @Param(name = "expirationDateHour") int expirationDateHour, @Param(name = "expirationDateMinute") int expirationDateMinute, @Param(name = "neverExpire") boolean neverExpire, @Param(name = "reviewDateMonth") int reviewDateMonth, @Param(name = "reviewDateDay") int reviewDateDay, @Param(name = "reviewDateYear") int reviewDateYear, @Param(name = "reviewDateHour") int reviewDateHour, @Param(name = "reviewDateMinute") int reviewDateMinute, @Param(name = "neverReview") boolean neverReview, @Param(name = "indexable") boolean indexable, @Param(name = "smallImage") boolean smallImage, @Param(name = "smallImageURL") String smallImageURL, @Param(name = "smallFile", className = "") JSONObject smallFile, @Param(name = "images", className = "") JSONObject images, @Param(name = "articleURL") String articleURL, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/copy-article")
  Call<JSONObject> copyArticle(@Param(name = "groupId") long groupId, @Param(name = "oldArticleId") String oldArticleId, @Param(name = "newArticleId") String newArticleId, @Param(name = "autoArticleId") boolean autoArticleId, @Param(name = "version") double version);

  @Path("/delete-article")
  Call<Response> deleteArticle(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "articleURL") String articleURL, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-article")
  Call<Response> deleteArticle(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "articleURL") String articleURL, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/expire-article")
  Call<Response> expireArticle(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "articleURL") String articleURL, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/expire-article")
  Call<JSONObject> expireArticle(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "articleURL") String articleURL, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/fetch-article")
  Call<JSONObject> fetchArticle(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId);

  @Path("/get-article")
  Call<JSONObject> getArticle(@Param(name = "id") long id);

  @Path("/get-article")
  Call<JSONObject> getArticle(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId);

  @Path("/get-article")
  Call<JSONObject> getArticle(@Param(name = "groupId") long groupId, @Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/get-article")
  Call<JSONObject> getArticle(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "version") double version);

  @Path("/get-article-by-url-title")
  Call<JSONObject> getArticleByUrlTitle(@Param(name = "groupId") long groupId, @Param(name = "urlTitle") String urlTitle);

  @Path("/get-article-content")
  Call<String> getArticleContent(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "languageId") String languageId, @Param(name = "themeDisplay", className = "") JSONObject themeDisplay);

  @Path("/get-article-content")
  Call<String> getArticleContent(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "languageId") String languageId, @Param(name = "portletRequestModel", className = "") JSONObject portletRequestModel, @Param(name = "themeDisplay", className = "") JSONObject themeDisplay);

  @Path("/get-article-content")
  Call<String> getArticleContent(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "languageId") String languageId, @Param(name = "themeDisplay", className = "") JSONObject themeDisplay);

  @Path("/get-article-content")
  Call<String> getArticleContent(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "languageId") String languageId, @Param(name = "portletRequestModel", className = "") JSONObject portletRequestModel, @Param(name = "themeDisplay", className = "") JSONObject themeDisplay);

  @Path("/get-articles")
  Call<JSONArray> getArticles(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId);

  @Path("/get-articles")
  Call<JSONArray> getArticles(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-articles-by-article-id")
  Call<JSONArray> getArticlesByArticleId(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-articles-by-layout-uuid")
  Call<JSONArray> getArticlesByLayoutUuid(@Param(name = "groupId") long groupId, @Param(name = "layoutUuid") String layoutUuid);

  @Path("/get-articles-by-structure-id")
  Call<JSONArray> getArticlesByStructureId(@Param(name = "groupId") long groupId, @Param(name = "ddmStructureKey") String ddmStructureKey, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-articles-by-structure-id")
  Call<JSONArray> getArticlesByStructureId(@Param(name = "groupId") long groupId, @Param(name = "ddmStructureKey") String ddmStructureKey, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-articles-by-structure-id")
  Call<JSONArray> getArticlesByStructureId(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "ddmStructureKey") String ddmStructureKey, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-articles-count")
  Call<Integer> getArticlesCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId);

  @Path("/get-articles-count")
  Call<Integer> getArticlesCount(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "status") int status);

  @Path("/get-articles-count-by-article-id")
  Call<Integer> getArticlesCountByArticleId(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId);

  @Path("/get-articles-count-by-structure-id")
  Call<Integer> getArticlesCountByStructureId(@Param(name = "groupId") long groupId, @Param(name = "ddmStructureKey") String ddmStructureKey);

  @Path("/get-articles-count-by-structure-id")
  Call<Integer> getArticlesCountByStructureId(@Param(name = "groupId") long groupId, @Param(name = "ddmStructureKey") String ddmStructureKey, @Param(name = "status") int status);

  @Path("/get-articles-count-by-structure-id")
  Call<Integer> getArticlesCountByStructureId(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "ddmStructureKey") String ddmStructureKey, @Param(name = "status") int status);

  @Path("/get-display-article-by-url-title")
  Call<JSONObject> getDisplayArticleByUrlTitle(@Param(name = "groupId") long groupId, @Param(name = "urlTitle") String urlTitle);

  @Path("/get-folders-and-articles-count")
  Call<Integer> getFoldersAndArticlesCount(@Param(name = "groupId") long groupId, @Param(name = "folderIds") JSONArray folderIds);

  @Path("/get-group-articles")
  Call<JSONArray> getGroupArticles(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "") JSONObject orderByComparator);

  @Path("/get-group-articles")
  Call<JSONArray> getGroupArticles(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "") JSONObject orderByComparator);

  @Path("/get-group-articles")
  Call<JSONArray> getGroupArticles(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId, @Param(name = "status") int status, @Param(name = "includeOwner") boolean includeOwner, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "") JSONObject orderByComparator);

  @Path("/get-group-articles-count")
  Call<Integer> getGroupArticlesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId);

  @Path("/get-group-articles-count")
  Call<Integer> getGroupArticlesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId, @Param(name = "status") int status);

  @Path("/get-group-articles-count")
  Call<Integer> getGroupArticlesCount(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "rootFolderId") long rootFolderId, @Param(name = "status") int status, @Param(name = "includeOwner") boolean includeOwner);

  @Path("/get-latest-article")
  Call<JSONObject> getLatestArticle(@Param(name = "resourcePrimKey") long resourcePrimKey);

  @Path("/get-latest-article")
  Call<JSONObject> getLatestArticle(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "status") int status);

  @Path("/get-latest-article")
  Call<JSONObject> getLatestArticle(@Param(name = "groupId") long groupId, @Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/get-layout-articles")
  Call<JSONArray> getLayoutArticles(@Param(name = "groupId") long groupId);

  @Path("/move-article")
  Call<Response> moveArticle(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "newFolderId") long newFolderId);

  @Path("/move-article")
  Call<Response> moveArticle(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "newFolderId") long newFolderId, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/move-article-from-trash")
  Call<JSONObject> moveArticleFromTrash(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "newFolderId") long newFolderId, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/move-article-from-trash")
  Call<JSONObject> moveArticleFromTrash(@Param(name = "groupId") long groupId, @Param(name = "resourcePrimKey") long resourcePrimKey, @Param(name = "newFolderId") long newFolderId, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/move-article-to-trash")
  Call<JSONObject> moveArticleToTrash(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId);

  @Path("/remove-article-locale")
  Call<Response> removeArticleLocale(@Param(name = "companyId") long companyId, @Param(name = "languageId") String languageId);

  @Path("/remove-article-locale")
  Call<JSONObject> removeArticleLocale(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "languageId") String languageId);

  @Path("/restore-article-from-trash")
  Call<Response> restoreArticleFromTrash(@Param(name = "resourcePrimKey") long resourcePrimKey);

  @Path("/restore-article-from-trash")
  Call<Response> restoreArticleFromTrash(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId);

  @Path("/search")
  Call<JSONObject> search(@Param(name = "groupId") long groupId, @Param(name = "creatorUserId") long creatorUserId, @Param(name = "status") int status, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "folderIds") JSONArray folderIds, @Param(name = "classNameId") long classNameId, @Param(name = "keywords") String keywords, @Param(name = "version") double version, @Param(name = "ddmStructureKey") String ddmStructureKey, @Param(name = "ddmTemplateKey") String ddmTemplateKey, @Param(name = "displayDateGT") long displayDateGT, @Param(name = "displayDateLT") long displayDateLT, @Param(name = "status") int status, @Param(name = "reviewDate") long reviewDate, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "folderIds") JSONArray folderIds, @Param(name = "classNameId") long classNameId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "content") String content, @Param(name = "ddmStructureKey") String ddmStructureKey, @Param(name = "ddmTemplateKey") String ddmTemplateKey, @Param(name = "displayDateGT") long displayDateGT, @Param(name = "displayDateLT") long displayDateLT, @Param(name = "status") int status, @Param(name = "reviewDate") long reviewDate, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "folderIds") JSONArray folderIds, @Param(name = "classNameId") long classNameId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "content") String content, @Param(name = "ddmStructureKeys") JSONArray ddmStructureKeys, @Param(name = "ddmTemplateKeys") JSONArray ddmTemplateKeys, @Param(name = "displayDateGT") long displayDateGT, @Param(name = "displayDateLT") long displayDateLT, @Param(name = "status") int status, @Param(name = "reviewDate") long reviewDate, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "folderIds") JSONArray folderIds, @Param(name = "classNameId") long classNameId, @Param(name = "keywords") String keywords, @Param(name = "version") double version, @Param(name = "ddmStructureKey") String ddmStructureKey, @Param(name = "ddmTemplateKey") String ddmTemplateKey, @Param(name = "displayDateGT") long displayDateGT, @Param(name = "displayDateLT") long displayDateLT, @Param(name = "status") int status, @Param(name = "reviewDate") long reviewDate);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "folderIds") JSONArray folderIds, @Param(name = "classNameId") long classNameId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "content") String content, @Param(name = "ddmStructureKey") String ddmStructureKey, @Param(name = "ddmTemplateKey") String ddmTemplateKey, @Param(name = "displayDateGT") long displayDateGT, @Param(name = "displayDateLT") long displayDateLT, @Param(name = "status") int status, @Param(name = "reviewDate") long reviewDate, @Param(name = "andOperator") boolean andOperator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "folderIds") JSONArray folderIds, @Param(name = "classNameId") long classNameId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "content") String content, @Param(name = "ddmStructureKeys") JSONArray ddmStructureKeys, @Param(name = "ddmTemplateKeys") JSONArray ddmTemplateKeys, @Param(name = "displayDateGT") long displayDateGT, @Param(name = "displayDateLT") long displayDateLT, @Param(name = "status") int status, @Param(name = "reviewDate") long reviewDate, @Param(name = "andOperator") boolean andOperator);

  @Path("/subscribe-structure")
  Call<Response> subscribeStructure(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "ddmStructureId") long ddmStructureId);

  @Path("/unsubscribe-structure")
  Call<Response> unsubscribeStructure(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId, @Param(name = "ddmStructureId") long ddmStructureId);

  @Path("/update-article")
  Call<JSONObject> updateArticle(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "content") String content, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-article")
  Call<JSONObject> updateArticle(@Param(name = "userId") long userId, @Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "content") String content, @Param(name = "layoutUuid") String layoutUuid, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-article")
  Call<JSONObject> updateArticle(@Param(name = "groupId") long groupId, @Param(name = "folderId") long folderId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "content") String content, @Param(name = "ddmStructureKey") String ddmStructureKey, @Param(name = "ddmTemplateKey") String ddmTemplateKey, @Param(name = "layoutUuid") String layoutUuid, @Param(name = "displayDateMonth") int displayDateMonth, @Param(name = "displayDateDay") int displayDateDay, @Param(name = "displayDateYear") int displayDateYear, @Param(name = "displayDateHour") int displayDateHour, @Param(name = "displayDateMinute") int displayDateMinute, @Param(name = "expirationDateMonth") int expirationDateMonth, @Param(name = "expirationDateDay") int expirationDateDay, @Param(name = "expirationDateYear") int expirationDateYear, @Param(name = "expirationDateHour") int expirationDateHour, @Param(name = "expirationDateMinute") int expirationDateMinute, @Param(name = "neverExpire") boolean neverExpire, @Param(name = "reviewDateMonth") int reviewDateMonth, @Param(name = "reviewDateDay") int reviewDateDay, @Param(name = "reviewDateYear") int reviewDateYear, @Param(name = "reviewDateHour") int reviewDateHour, @Param(name = "reviewDateMinute") int reviewDateMinute, @Param(name = "neverReview") boolean neverReview, @Param(name = "indexable") boolean indexable, @Param(name = "smallImage") boolean smallImage, @Param(name = "smallImageURL") String smallImageURL, @Param(name = "smallFile", className = "") JSONObject smallFile, @Param(name = "images", className = "") JSONObject images, @Param(name = "articleURL") String articleURL, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-article-translation")
  Call<JSONObject> updateArticleTranslation(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "locale") String locale, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "content") String content, @Param(name = "images", className = "") JSONObject images, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-content")
  Call<JSONObject> updateContent(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "content") String content);

  @Path("/update-status")
  Call<JSONObject> updateStatus(@Param(name = "groupId") long groupId, @Param(name = "articleId") String articleId, @Param(name = "version") double version, @Param(name = "status") int status, @Param(name = "articleURL") String articleURL, @Param(name = "serviceContext", className = "") JSONObject serviceContext);
}
