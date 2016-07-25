package com.liferay.mobile.sdk.v7.commentmanagerjsonws;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import org.json.JSONArray;

@Path("/comment.commentmanagerjsonws")
public interface CommentManagerJSONWSService {
  @Path("/add-comment")
  Call<Long> addComment(@Param(name = "groupId") long groupId, @Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "body") String body);

  @Path("/delete-comment")
  Call<Response> deleteComment(@Param(name = "commentId") long commentId);

  @Path("/get-comments")
  Call<JSONArray> getComments(@Param(name = "groupId") long groupId, @Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-comments-count")
  Call<Integer> getCommentsCount(@Param(name = "groupId") long groupId, @Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/has-discussion")
  Call<Boolean> hasDiscussion(@Param(name = "groupId") long groupId, @Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/subscribe-discussion")
  Call<Response> subscribeDiscussion(@Param(name = "groupId") long groupId, @Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/unsubscribe-discussion")
  Call<Response> unsubscribeDiscussion(@Param(name = "groupId") long groupId, @Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/update-comment")
  Call<Long> updateComment(@Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "commentId") long commentId, @Param(name = "subject") String subject, @Param(name = "body") String body);
}
