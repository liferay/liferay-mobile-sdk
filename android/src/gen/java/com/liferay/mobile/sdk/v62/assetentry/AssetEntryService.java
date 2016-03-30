package com.liferay.mobile.sdk.v62.assetentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assetentry")
public interface AssetEntryService {
  @Path("/get-company-entries")
  Call<JSONArray> getCompanyEntries(@Param("companyId") long companyId, @Param("start") int start, @Param("end") int end);

  @Path("/get-company-entries-count")
  Call<Integer> getCompanyEntriesCount(@Param("companyId") long companyId);

  @Path("/get-entries")
  Call<JSONArray> getEntries(@JsonObject(name = "entryQuery", className = "com.liferay.portlet.asset.service.persistence.AssetEntryQuery") JSONObject entryQuery);

  @Path("/get-entries-count")
  Call<Integer> getEntriesCount(@JsonObject(name = "entryQuery", className = "com.liferay.portlet.asset.service.persistence.AssetEntryQuery") JSONObject entryQuery);

  @Path("/get-entry")
  Call<JSONObject> getEntry(@Param("entryId") long entryId);

  @Path("/increment-view-counter")
  Call<JSONObject> incrementViewCounter(@Param("className") String className, @Param("classPK") long classPK);

  @Path("/update-entry")
  Call<JSONObject> updateEntry(@Param("groupId") long groupId, @Param("className") String className, @Param("classPK") long classPK, @Param("classUuid") String classUuid, @Param("classTypeId") long classTypeId, @Param("categoryIds") JSONArray categoryIds, @Param("tagNames") JSONArray tagNames, @Param("visible") boolean visible, @Param("startDate") long startDate, @Param("endDate") long endDate, @Param("expirationDate") long expirationDate, @Param("mimeType") String mimeType, @Param("title") String title, @Param("description") String description, @Param("summary") String summary, @Param("url") String url, @Param("layoutUuid") String layoutUuid, @Param("height") int height, @Param("width") int width, @Param("priority") int priority, @Param("sync") boolean sync);

  @Path("/update-entry")
  Call<JSONObject> updateEntry(@Param("groupId") long groupId, @Param("className") String className, @Param("classPK") long classPK, @Param("classUuid") String classUuid, @Param("classTypeId") long classTypeId, @Param("categoryIds") JSONArray categoryIds, @Param("tagNames") JSONArray tagNames, @Param("visible") boolean visible, @Param("startDate") long startDate, @Param("endDate") long endDate, @Param("publishDate") long publishDate, @Param("expirationDate") long expirationDate, @Param("mimeType") String mimeType, @Param("title") String title, @Param("description") String description, @Param("summary") String summary, @Param("url") String url, @Param("layoutUuid") String layoutUuid, @Param("height") int height, @Param("width") int width, @Param("priority") int priority, @Param("sync") boolean sync);

  @Path("/update-entry")
  Call<JSONObject> updateEntry(@Param("groupId") long groupId, @Param("createDate") long createDate, @Param("modifiedDate") long modifiedDate, @Param("className") String className, @Param("classPK") long classPK, @Param("classUuid") String classUuid, @Param("classTypeId") long classTypeId, @Param("categoryIds") JSONArray categoryIds, @Param("tagNames") JSONArray tagNames, @Param("visible") boolean visible, @Param("startDate") long startDate, @Param("endDate") long endDate, @Param("expirationDate") long expirationDate, @Param("mimeType") String mimeType, @Param("title") String title, @Param("description") String description, @Param("summary") String summary, @Param("url") String url, @Param("layoutUuid") String layoutUuid, @Param("height") int height, @Param("width") int width, @Param("priority") int priority, @Param("sync") boolean sync);
}
