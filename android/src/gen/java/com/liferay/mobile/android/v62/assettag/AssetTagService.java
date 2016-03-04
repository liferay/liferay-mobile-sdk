package com.liferay.mobile.android.v62.assettag;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assettag")
public interface AssetTagService {
  @Path("/add-tag")
  Call<JSONObject> addTag(@Param("name") String name, @Param("tagProperties") JSONArray tagProperties, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-tag")
  Call<Response> deleteTag(@Param("tagId") long tagId);

  @Path("/delete-tags")
  Call<Response> deleteTags(@Param("tagIds") JSONArray tagIds);

  @Path("/get-group-tags")
  Call<JSONArray> getGroupTags(@Param("groupId") long groupId);

  @Path("/get-group-tags")
  Call<JSONArray> getGroupTags(@Param("groupId") long groupId, @Param("start") int start, @Param("end") int end, @Param("obc") JSONObjectWrapper obc);

  @Path("/get-group-tags-count")
  Call<Integer> getGroupTagsCount(@Param("groupId") long groupId);

  @Path("/get-group-tags-display")
  Call<JSONObject> getGroupTagsDisplay(@Param("groupId") long groupId, @Param("name") String name, @Param("start") int start, @Param("end") int end);

  @Path("/get-groups-tags")
  Call<JSONArray> getGroupsTags(@Param("groupIds") JSONArray groupIds);

  @Path("/get-json-group-tags")
  Call<JSONObject> getJsonGroupTags(@Param("groupId") long groupId, @Param("name") String name, @Param("start") int start, @Param("end") int end);

  @Path("/get-tag")
  Call<JSONObject> getTag(@Param("tagId") long tagId);

  @Path("/get-tags")
  Call<JSONArray> getTags(@Param("className") String className, @Param("classPK") long classPK);

  @Path("/get-tags")
  Call<JSONArray> getTags(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("name") String name);

  @Path("/get-tags")
  Call<JSONArray> getTags(@Param("groupId") long groupId, @Param("name") String name, @Param("tagProperties") JSONArray tagProperties, @Param("start") int start, @Param("end") int end);

  @Path("/get-tags")
  Call<JSONArray> getTags(@Param("groupIds") JSONArray groupIds, @Param("name") String name, @Param("tagProperties") JSONArray tagProperties, @Param("start") int start, @Param("end") int end);

  @Path("/get-tags")
  Call<JSONArray> getTags(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("name") String name, @Param("start") int start, @Param("end") int end, @Param("obc") JSONObjectWrapper obc);

  @Path("/get-tags-count")
  Call<Integer> getTagsCount(@Param("groupId") long groupId, @Param("name") String name);

  @Path("/get-tags-count")
  Call<Integer> getTagsCount(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("name") String name);

  @Path("/get-tags-count")
  Call<Integer> getTagsCount(@Param("groupId") long groupId, @Param("name") String name, @Param("tagProperties") JSONArray tagProperties);

  @Path("/merge-tags")
  Call<Response> mergeTags(@Param("fromTagId") long fromTagId, @Param("toTagId") long toTagId, @Param("overrideProperties") boolean overrideProperties);

  @Path("/merge-tags")
  Call<Response> mergeTags(@Param("fromTagIds") JSONArray fromTagIds, @Param("toTagId") long toTagId, @Param("overrideProperties") boolean overrideProperties);

  @Path("/search")
  Call<JSONArray> search(@Param("groupId") long groupId, @Param("name") String name, @Param("tagProperties") JSONArray tagProperties, @Param("start") int start, @Param("end") int end);

  @Path("/search")
  Call<JSONArray> search(@Param("groupIds") JSONArray groupIds, @Param("name") String name, @Param("tagProperties") JSONArray tagProperties, @Param("start") int start, @Param("end") int end);

  @Path("/update-tag")
  Call<JSONObject> updateTag(@Param("tagId") long tagId, @Param("name") String name, @Param("tagProperties") JSONArray tagProperties, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
