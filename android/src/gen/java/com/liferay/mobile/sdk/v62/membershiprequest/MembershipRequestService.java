package com.liferay.mobile.sdk.v62.membershiprequest;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/membershiprequest")
public interface MembershipRequestService {
  @Path("/add-membership-request")
  Call<JSONObject> addMembershipRequest(@Param(name = "groupId") long groupId, @Param(name = "comments") String comments, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-membership-requests")
  Call<Response> deleteMembershipRequests(@Param(name = "groupId") long groupId, @Param(name = "statusId") int statusId);

  @Path("/get-membership-request")
  Call<JSONObject> getMembershipRequest(@Param(name = "membershipRequestId") long membershipRequestId);

  @Path("/update-status")
  Call<Response> updateStatus(@Param(name = "membershipRequestId") long membershipRequestId, @Param(name = "reviewComments") String reviewComments, @Param(name = "statusId") int statusId, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
