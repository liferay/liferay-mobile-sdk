package com.liferay.mobile.sdk.v62.ratingsentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/ratingsentry")
public interface RatingsEntryService {
  @Path("/delete-entry")
  Call<Response> deleteEntry(@Param("className") String className, @Param("classPK") long classPK);

  @Path("/update-entry")
  Call<JSONObject> updateEntry(@Param("className") String className, @Param("classPK") long classPK, @Param("score") double score);
}
