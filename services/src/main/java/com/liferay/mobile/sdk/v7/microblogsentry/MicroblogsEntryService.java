package com.liferay.mobile.sdk.v7.microblogsentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/microblogs.microblogsentry")
public interface MicroblogsEntryService {
  @Path("/add-microblogs-entry")
  Call<JSONObject> addMicroblogsEntry(@Param(name = "userId") long userId, @Param(name = "content") String content, @Param(name = "type") int type, @Param(name = "parentMicroblogsEntryId") long parentMicroblogsEntryId, @Param(name = "socialRelationType") int socialRelationType, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-microblogs-entry")
  Call<JSONObject> deleteMicroblogsEntry(@Param(name = "microblogsEntryId") long microblogsEntryId);

  @Path("/get-microblogs-entries")
  Call<JSONArray> getMicroblogsEntries(@Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-microblogs-entries")
  Call<JSONArray> getMicroblogsEntries(@Param(name = "assetTagName") String assetTagName, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-microblogs-entries-count")
  Call<Integer> getMicroblogsEntriesCount();

  @Path("/get-microblogs-entries-count")
  Call<Integer> getMicroblogsEntriesCount(@Param(name = "assetTagName") String assetTagName);

  @Path("/get-microblogs-entry")
  Call<JSONObject> getMicroblogsEntry(@Param(name = "microblogsEntryId") long microblogsEntryId);

  @Path("/get-user-microblogs-entries")
  Call<JSONArray> getUserMicroblogsEntries(@Param(name = "microblogsEntryUserId") long microblogsEntryUserId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-user-microblogs-entries")
  Call<JSONArray> getUserMicroblogsEntries(@Param(name = "microblogsEntryUserId") long microblogsEntryUserId, @Param(name = "type") int type, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-user-microblogs-entries-count")
  Call<Integer> getUserMicroblogsEntriesCount(@Param(name = "microblogsEntryUserId") long microblogsEntryUserId);

  @Path("/get-user-microblogs-entries-count")
  Call<Integer> getUserMicroblogsEntriesCount(@Param(name = "microblogsEntryUserId") long microblogsEntryUserId, @Param(name = "type") int type);

  @Path("/update-microblogs-entry")
  Call<JSONObject> updateMicroblogsEntry(@Param(name = "microblogsEntryId") long microblogsEntryId, @Param(name = "content") String content, @Param(name = "socialRelationType") int socialRelationType, @Param(name = "serviceContext", className = "") JSONObject serviceContext);
}
