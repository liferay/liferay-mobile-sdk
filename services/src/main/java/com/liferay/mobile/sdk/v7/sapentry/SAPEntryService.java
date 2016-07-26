package com.liferay.mobile.sdk.v7.sapentry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/sap.sapentry")
public interface SAPEntryService {
  @Path("/add-sap-entry")
  Call<JSONObject> addSAPEntry(@Param(name = "allowedServiceSignatures") String allowedServiceSignatures, @Param(name = "defaultSAPEntry") boolean defaultSAPEntry, @Param(name = "enabled") boolean enabled, @Param(name = "name") String name, @Param(name = "titleMap") JSONObject titleMap, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-sap-entry")
  Call<JSONObject> deleteSAPEntry(@Param(name = "sapEntry", className = "com.liferay.portal.security.service.access.policy.model.SAPEntry") JSONObject sapEntry);

  @Path("/delete-sap-entry")
  Call<JSONObject> deleteSAPEntry(@Param(name = "sapEntryId") long sapEntryId);

  @Path("/fetch-sap-entry")
  Call<JSONObject> fetchSAPEntry(@Param(name = "companyId") long companyId, @Param(name = "name") String name);

  @Path("/get-company-sap-entries")
  Call<JSONArray> getCompanySAPEntries(@Param(name = "companyId") long companyId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-company-sap-entries")
  Call<JSONArray> getCompanySAPEntries(@Param(name = "companyId") long companyId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/get-company-sap-entries-count")
  Call<Integer> getCompanySAPEntriesCount(@Param(name = "companyId") long companyId);

  @Path("/get-sap-entry")
  Call<JSONObject> getSAPEntry(@Param(name = "sapEntryId") long sapEntryId);

  @Path("/get-sap-entry")
  Call<JSONObject> getSAPEntry(@Param(name = "companyId") long companyId, @Param(name = "name") String name);

  @Path("/update-sap-entry")
  Call<JSONObject> updateSAPEntry(@Param(name = "sapEntryId") long sapEntryId, @Param(name = "allowedServiceSignatures") String allowedServiceSignatures, @Param(name = "defaultSAPEntry") boolean defaultSAPEntry, @Param(name = "enabled") boolean enabled, @Param(name = "name") String name, @Param(name = "titleMap") JSONObject titleMap, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
