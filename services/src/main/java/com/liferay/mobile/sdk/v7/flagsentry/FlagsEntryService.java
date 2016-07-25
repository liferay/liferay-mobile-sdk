package com.liferay.mobile.sdk.v7.flagsentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/flags.flagsentry")
public interface FlagsEntryService {
  @Path("/add-entry")
  Call<Response> addEntry(@Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "reporterEmailAddress") String reporterEmailAddress, @Param(name = "reportedUserId") long reportedUserId, @Param(name = "contentTitle") String contentTitle, @Param(name = "contentURL") String contentURL, @Param(name = "reason") String reason, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
