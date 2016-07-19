package com.liferay.mobile.sdk.v62.company;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/company")
public interface CompanyService {
  @Path("/delete-logo")
  Call<Response> deleteLogo(@Param(name = "companyId") long companyId);

  @Path("/get-company-by-id")
  Call<JSONObject> getCompanyById(@Param(name = "companyId") long companyId);

  @Path("/get-company-by-logo-id")
  Call<JSONObject> getCompanyByLogoId(@Param(name = "logoId") long logoId);

  @Path("/get-company-by-mx")
  Call<JSONObject> getCompanyByMx(@Param(name = "mx") String mx);

  @Path("/get-company-by-virtual-host")
  Call<JSONObject> getCompanyByVirtualHost(@Param(name = "virtualHost") String virtualHost);

  @Path("/get-company-by-web-id")
  Call<JSONObject> getCompanyByWebId(@Param(name = "webId") String webId);

  @Path("/update-company")
  Call<JSONObject> updateCompany(@Param(name = "companyId") long companyId, @Param(name = "virtualHost") String virtualHost, @Param(name = "mx") String mx, @Param(name = "homeURL") String homeURL, @Param(name = "name") String name, @Param(name = "legalName") String legalName, @Param(name = "legalId") String legalId, @Param(name = "legalType") String legalType, @Param(name = "sicCode") String sicCode, @Param(name = "tickerSymbol") String tickerSymbol, @Param(name = "industry") String industry, @Param(name = "type") String type, @Param(name = "size") String size);

  @Path("/update-company")
  Call<JSONObject> updateCompany(@Param(name = "companyId") long companyId, @Param(name = "virtualHost") String virtualHost, @Param(name = "mx") String mx, @Param(name = "maxUsers") int maxUsers, @Param(name = "active") boolean active);

  @Path("/update-display")
  Call<Response> updateDisplay(@Param(name = "companyId") long companyId, @Param(name = "languageId") String languageId, @Param(name = "timeZoneId") String timeZoneId);

  @Path("/update-logo")
  Call<JSONObject> updateLogo(@Param(name = "companyId") long companyId, @Param(name = "bytes") byte[] bytes);
}
