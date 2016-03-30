package com.liferay.mobile.sdk.v62.staging;

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Long;
import java.lang.String;
import org.json.JSONObject;

@Path("/staging")
public interface StagingService {
  @Path("/clean-up-staging-request")
  Call<Response> cleanUpStagingRequest(@Param("stagingRequestId") long stagingRequestId);

  @Path("/create-staging-request")
  Call<Long> createStagingRequest(@Param("groupId") long groupId, @Param("checksum") String checksum);

  @Path("/publish-staging-request")
  Call<Response> publishStagingRequest(@Param("stagingRequestId") long stagingRequestId, @Param("privateLayout") boolean privateLayout, @JsonObject(name = "parameterMap", className = "") JSONObject parameterMap);

  @Path("/update-staging-request")
  Call<Response> updateStagingRequest(@Param("stagingRequestId") long stagingRequestId, @Param("fileName") String fileName, @Param("bytes") byte[] bytes);

  @Path("/validate-staging-request")
  Call<JSONObject> validateStagingRequest(@Param("stagingRequestId") long stagingRequestId, @Param("privateLayout") boolean privateLayout, @JsonObject(name = "parameterMap", className = "") JSONObject parameterMap);
}
