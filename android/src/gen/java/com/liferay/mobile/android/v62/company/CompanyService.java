package com.liferay.mobile.android.v62.company;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/company")
public interface CompanyService {
  @Path("/delete-logo")
  Call<Response> deleteLogo(@Param("companyId") long companyId);

  @Path("/get-company-by-id")
  Call<JSONObject> getCompanyById(@Param("companyId") long companyId);

  @Path("/get-company-by-logo-id")
  Call<JSONObject> getCompanyByLogoId(@Param("logoId") long logoId);

  @Path("/get-company-by-mx")
  Call<JSONObject> getCompanyByMx(@Param("mx") String mx);

  @Path("/get-company-by-virtual-host")
  Call<JSONObject> getCompanyByVirtualHost(@Param("virtualHost") String virtualHost);

  @Path("/get-company-by-web-id")
  Call<JSONObject> getCompanyByWebId(@Param("webId") String webId);

  @Path("/update-company")
  Call<JSONObject> updateCompany(@Param("companyId") long companyId, @Param("virtualHost") String virtualHost, @Param("mx") String mx, @Param("homeURL") String homeURL, @Param("name") String name, @Param("legalName") String legalName, @Param("legalId") String legalId, @Param("legalType") String legalType, @Param("sicCode") String sicCode, @Param("tickerSymbol") String tickerSymbol, @Param("industry") String industry, @Param("type") String type, @Param("size") String size);

  @Path("/update-company")
  Call<JSONObject> updateCompany(@Param("companyId") long companyId, @Param("virtualHost") String virtualHost, @Param("mx") String mx, @Param("maxUsers") int maxUsers, @Param("active") boolean active);

  @Path("/update-display")
  Call<Response> updateDisplay(@Param("companyId") long companyId, @Param("languageId") String languageId, @Param("timeZoneId") String timeZoneId);

  @Path("/update-logo")
  Call<JSONObject> updateLogo(@Param("companyId") long companyId, @Param("bytes") byte[] bytes);
}
