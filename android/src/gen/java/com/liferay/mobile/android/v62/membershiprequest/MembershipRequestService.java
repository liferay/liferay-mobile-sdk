package com.liferay.mobile.android.v62.membershiprequest;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/membershiprequest")
public interface MembershipRequestService {
  @Path("/add-membership-request")
  Call<JSONObject> addMembershipRequest(@Param("groupId") long groupId, @Param("comments") String comments, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-membership-requests")
  Call<Response> deleteMembershipRequests(@Param("groupId") long groupId, @Param("statusId") int statusId);

  @Path("/get-membership-request")
  Call<JSONObject> getMembershipRequest(@Param("membershipRequestId") long membershipRequestId);

  @Path("/update-status")
  Call<Response> updateStatus(@Param("membershipRequestId") long membershipRequestId, @Param("reviewComments") String reviewComments, @Param("statusId") int statusId, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
