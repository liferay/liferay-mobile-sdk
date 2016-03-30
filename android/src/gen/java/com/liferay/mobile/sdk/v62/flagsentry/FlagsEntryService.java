package com.liferay.mobile.sdk.v62.flagsentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/flagsentry")
public interface FlagsEntryService {
  @Path("/add-entry")
  Call<Response> addEntry(@Param("className") String className, @Param("classPK") long classPK, @Param("reporterEmailAddress") String reporterEmailAddress, @Param("reportedUserId") long reportedUserId, @Param("contentTitle") String contentTitle, @Param("contentURL") String contentURL, @Param("reason") String reason, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
