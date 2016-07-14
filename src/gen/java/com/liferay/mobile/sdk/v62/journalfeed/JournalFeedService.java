package com.liferay.mobile.sdk.v62.journalfeed;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/journalfeed")
public interface JournalFeedService {
  @Path("/add-feed")
  Call<JSONObject> addFeed(@Param(name = "groupId") long groupId, @Param(name = "feedId") String feedId, @Param(name = "autoFeedId") boolean autoFeedId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "type") String type, @Param(name = "structureId") String structureId, @Param(name = "templateId") String templateId, @Param(name = "rendererTemplateId") String rendererTemplateId, @Param(name = "delta") int delta, @Param(name = "orderByCol") String orderByCol, @Param(name = "orderByType") String orderByType, @Param(name = "targetLayoutFriendlyUrl") String targetLayoutFriendlyUrl, @Param(name = "targetPortletId") String targetPortletId, @Param(name = "contentField") String contentField, @Param(name = "feedType") String feedType, @Param(name = "feedVersion") double feedVersion, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-feed")
  Call<Response> deleteFeed(@Param(name = "feedId") long feedId);

  @Path("/delete-feed")
  Call<Response> deleteFeed(@Param(name = "groupId") long groupId, @Param(name = "feedId") String feedId);

  @Path("/get-feed")
  Call<JSONObject> getFeed(@Param(name = "feedId") long feedId);

  @Path("/get-feed")
  Call<JSONObject> getFeed(@Param(name = "groupId") long groupId, @Param(name = "feedId") String feedId);

  @Path("/update-feed")
  Call<JSONObject> updateFeed(@Param(name = "groupId") long groupId, @Param(name = "feedId") String feedId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "type") String type, @Param(name = "structureId") String structureId, @Param(name = "templateId") String templateId, @Param(name = "rendererTemplateId") String rendererTemplateId, @Param(name = "delta") int delta, @Param(name = "orderByCol") String orderByCol, @Param(name = "orderByType") String orderByType, @Param(name = "targetLayoutFriendlyUrl") String targetLayoutFriendlyUrl, @Param(name = "targetPortletId") String targetPortletId, @Param(name = "contentField") String contentField, @Param(name = "feedType") String feedType, @Param(name = "feedVersion") double feedVersion, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
