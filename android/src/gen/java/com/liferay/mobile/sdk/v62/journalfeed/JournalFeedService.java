package com.liferay.mobile.sdk.v62.journalfeed;

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/journalfeed")
public interface JournalFeedService {
  @Path("/add-feed")
  Call<JSONObject> addFeed(@Param("groupId") long groupId, @Param("feedId") String feedId, @Param("autoFeedId") boolean autoFeedId, @Param("name") String name, @Param("description") String description, @Param("type") String type, @Param("structureId") String structureId, @Param("templateId") String templateId, @Param("rendererTemplateId") String rendererTemplateId, @Param("delta") int delta, @Param("orderByCol") String orderByCol, @Param("orderByType") String orderByType, @Param("targetLayoutFriendlyUrl") String targetLayoutFriendlyUrl, @Param("targetPortletId") String targetPortletId, @Param("contentField") String contentField, @Param("feedType") String feedType, @Param("feedVersion") double feedVersion, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-feed")
  Call<Response> deleteFeed(@Param("feedId") long feedId);

  @Path("/delete-feed")
  Call<Response> deleteFeed(@Param("groupId") long groupId, @Param("feedId") String feedId);

  @Path("/get-feed")
  Call<JSONObject> getFeed(@Param("feedId") long feedId);

  @Path("/get-feed")
  Call<JSONObject> getFeed(@Param("groupId") long groupId, @Param("feedId") String feedId);

  @Path("/update-feed")
  Call<JSONObject> updateFeed(@Param("groupId") long groupId, @Param("feedId") String feedId, @Param("name") String name, @Param("description") String description, @Param("type") String type, @Param("structureId") String structureId, @Param("templateId") String templateId, @Param("rendererTemplateId") String rendererTemplateId, @Param("delta") int delta, @Param("orderByCol") String orderByCol, @Param("orderByType") String orderByType, @Param("targetLayoutFriendlyUrl") String targetLayoutFriendlyUrl, @Param("targetPortletId") String targetPortletId, @Param("contentField") String contentField, @Param("feedType") String feedType, @Param("feedVersion") double feedVersion, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
