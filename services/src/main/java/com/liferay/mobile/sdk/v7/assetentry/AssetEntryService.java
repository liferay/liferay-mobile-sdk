package com.liferay.mobile.sdk.v7.assetentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assetentry")
public interface AssetEntryService {
  @Path("/fetch-entry")
  Call<JSONObject> fetchEntry(@Param(name = "entryId") long entryId);

  @Path("/get-company-entries")
  Call<JSONArray> getCompanyEntries(@Param(name = "companyId") long companyId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-company-entries-count")
  Call<Integer> getCompanyEntriesCount(@Param(name = "companyId") long companyId);

  @Path("/get-entries")
  Call<JSONArray> getEntries(@Param(name = "entryQuery", className = "com.liferay.asset.kernel.service.persistence.AssetEntryQuery") JSONObject entryQuery);

  @Path("/get-entries-count")
  Call<Integer> getEntriesCount(@Param(name = "entryQuery", className = "com.liferay.asset.kernel.service.persistence.AssetEntryQuery") JSONObject entryQuery);

  @Path("/get-entry")
  Call<JSONObject> getEntry(@Param(name = "entryId") long entryId);

  @Path("/increment-view-counter")
  Call<JSONObject> incrementViewCounter(@Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/update-entry")
  Call<JSONObject> updateEntry(@Param(name = "groupId") long groupId, @Param(name = "createDate") long createDate, @Param(name = "modifiedDate") long modifiedDate, @Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "classUuid") String classUuid, @Param(name = "classTypeId") long classTypeId, @Param(name = "categoryIds") JSONArray categoryIds, @Param(name = "tagNames") JSONArray tagNames, @Param(name = "listable") boolean listable, @Param(name = "visible") boolean visible, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate, @Param(name = "expirationDate") long expirationDate, @Param(name = "mimeType") String mimeType, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "summary") String summary, @Param(name = "url") String url, @Param(name = "layoutUuid") String layoutUuid, @Param(name = "height") int height, @Param(name = "width") int width, @Param(name = "priority") double priority);

  @Path("/update-entry")
  Call<JSONObject> updateEntry(@Param(name = "groupId") long groupId, @Param(name = "createDate") long createDate, @Param(name = "modifiedDate") long modifiedDate, @Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "classUuid") String classUuid, @Param(name = "classTypeId") long classTypeId, @Param(name = "categoryIds") JSONArray categoryIds, @Param(name = "tagNames") JSONArray tagNames, @Param(name = "visible") boolean visible, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate, @Param(name = "expirationDate") long expirationDate, @Param(name = "mimeType") String mimeType, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "summary") String summary, @Param(name = "url") String url, @Param(name = "layoutUuid") String layoutUuid, @Param(name = "height") int height, @Param(name = "width") int width, @Param(name = "priority") int priority, @Param(name = "sync") boolean sync);

  @Path("/update-entry")
  Call<JSONObject> updateEntry(@Param(name = "groupId") long groupId, @Param(name = "createDate") long createDate, @Param(name = "modifiedDate") long modifiedDate, @Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "classUuid") String classUuid, @Param(name = "classTypeId") long classTypeId, @Param(name = "categoryIds") JSONArray categoryIds, @Param(name = "tagNames") JSONArray tagNames, @Param(name = "listable") boolean listable, @Param(name = "visible") boolean visible, @Param(name = "startDate") long startDate, @Param(name = "endDate") long endDate, @Param(name = "publishDate") long publishDate, @Param(name = "expirationDate") long expirationDate, @Param(name = "mimeType") String mimeType, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "summary") String summary, @Param(name = "url") String url, @Param(name = "layoutUuid") String layoutUuid, @Param(name = "height") int height, @Param(name = "width") int width, @Param(name = "priority") double priority);
}
