package com.liferay.mobile.sdk.v62.staging;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Long;
import java.lang.String;
import org.json.JSONObject;

@Path("/staging")
public interface StagingService {
  @Path("/clean-up-staging-request")
  Call<Response> cleanUpStagingRequest(@Param(name = "stagingRequestId") long stagingRequestId);

  @Path("/create-staging-request")
  Call<Long> createStagingRequest(@Param(name = "groupId") long groupId, @Param(name = "checksum") String checksum);

  @Path("/publish-staging-request")
  Call<Response> publishStagingRequest(@Param(name = "stagingRequestId") long stagingRequestId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "parameterMap") JSONObject parameterMap);

  @Path("/update-staging-request")
  Call<Response> updateStagingRequest(@Param(name = "stagingRequestId") long stagingRequestId, @Param(name = "fileName") String fileName, @Param(name = "bytes") byte[] bytes);

  @Path("/validate-staging-request")
  Call<JSONObject> validateStagingRequest(@Param(name = "stagingRequestId") long stagingRequestId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "parameterMap") JSONObject parameterMap);
}
