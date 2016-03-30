package com.liferay.mobile.sdk.v62.staging;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
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
  Call<Response> publishStagingRequest(@Param("stagingRequestId") long stagingRequestId, @Param("privateLayout") boolean privateLayout, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap);

  @Path("/update-staging-request")
  Call<Response> updateStagingRequest(@Param("stagingRequestId") long stagingRequestId, @Param("fileName") String fileName, @Param("bytes") byte[] bytes);

  @Path("/validate-staging-request")
  Call<JSONObject> validateStagingRequest(@Param("stagingRequestId") long stagingRequestId, @Param("privateLayout") boolean privateLayout, @ParamObject(name = "parameterMap", className = "") JSONObject parameterMap);
}
