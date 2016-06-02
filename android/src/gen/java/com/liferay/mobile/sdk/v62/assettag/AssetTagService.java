package com.liferay.mobile.sdk.v62.assettag;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assettag")
public interface AssetTagService {
  @Path("/add-tag")
  Call<JSONObject> addTag(@Param(name = "name") String name, @Param(name = "tagProperties") JSONArray tagProperties, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-tag")
  Call<Response> deleteTag(@Param(name = "tagId") long tagId);

  @Path("/delete-tags")
  Call<Response> deleteTags(@Param(name = "tagIds") JSONArray tagIds);

  @Path("/get-group-tags")
  Call<JSONArray> getGroupTags(@Param(name = "groupId") long groupId);

  @Path("/get-group-tags")
  Call<JSONArray> getGroupTags(@Param(name = "groupId") long groupId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-group-tags-count")
  Call<Integer> getGroupTagsCount(@Param(name = "groupId") long groupId);

  @Path("/get-group-tags-display")
  Call<JSONObject> getGroupTagsDisplay(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-groups-tags")
  Call<JSONArray> getGroupsTags(@Param(name = "groupIds") JSONArray groupIds);

  @Path("/get-json-group-tags")
  Call<JSONObject> getJsonGroupTags(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-tag")
  Call<JSONObject> getTag(@Param(name = "tagId") long tagId);

  @Path("/get-tags")
  Call<JSONArray> getTags(@Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/get-tags")
  Call<JSONArray> getTags(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "name") String name);

  @Path("/get-tags")
  Call<JSONArray> getTags(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "tagProperties") JSONArray tagProperties, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-tags")
  Call<JSONArray> getTags(@Param(name = "groupIds") JSONArray groupIds, @Param(name = "name") String name, @Param(name = "tagProperties") JSONArray tagProperties, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-tags")
  Call<JSONArray> getTags(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "name") String name, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-tags-count")
  Call<Integer> getTagsCount(@Param(name = "groupId") long groupId, @Param(name = "name") String name);

  @Path("/get-tags-count")
  Call<Integer> getTagsCount(@Param(name = "groupId") long groupId, @Param(name = "classNameId") long classNameId, @Param(name = "name") String name);

  @Path("/get-tags-count")
  Call<Integer> getTagsCount(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "tagProperties") JSONArray tagProperties);

  @Path("/merge-tags")
  Call<Response> mergeTags(@Param(name = "fromTagId") long fromTagId, @Param(name = "toTagId") long toTagId, @Param(name = "overrideProperties") boolean overrideProperties);

  @Path("/merge-tags")
  Call<Response> mergeTags(@Param(name = "fromTagIds") JSONArray fromTagIds, @Param(name = "toTagId") long toTagId, @Param(name = "overrideProperties") boolean overrideProperties);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "tagProperties") JSONArray tagProperties, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "groupIds") JSONArray groupIds, @Param(name = "name") String name, @Param(name = "tagProperties") JSONArray tagProperties, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/update-tag")
  Call<JSONObject> updateTag(@Param(name = "tagId") long tagId, @Param(name = "name") String name, @Param(name = "tagProperties") JSONArray tagProperties, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
