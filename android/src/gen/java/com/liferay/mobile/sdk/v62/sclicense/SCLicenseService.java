package com.liferay.mobile.sdk.v62.sclicense;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/sclicense")
public interface SCLicenseService {
  @Path("/add-license")
  Call<JSONObject> addLicense(@Param(name = "name") String name, @Param(name = "url") String url, @Param(name = "openSource") boolean openSource, @Param(name = "active") boolean active, @Param(name = "recommended") boolean recommended);

  @Path("/delete-license")
  Call<Response> deleteLicense(@Param(name = "licenseId") long licenseId);

  @Path("/get-license")
  Call<JSONObject> getLicense(@Param(name = "licenseId") long licenseId);

  @Path("/update-license")
  Call<JSONObject> updateLicense(@Param(name = "licenseId") long licenseId, @Param(name = "name") String name, @Param(name = "url") String url, @Param(name = "openSource") boolean openSource, @Param(name = "active") boolean active, @Param(name = "recommended") boolean recommended);
}
