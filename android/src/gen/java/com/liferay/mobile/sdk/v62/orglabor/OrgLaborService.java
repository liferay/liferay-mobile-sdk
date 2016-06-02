package com.liferay.mobile.sdk.v62.orglabor;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/orglabor")
public interface OrgLaborService {
  @Path("/add-org-labor")
  Call<JSONObject> addOrgLabor(@Param(name = "organizationId") long organizationId, @Param(name = "typeId") int typeId, @Param(name = "sunOpen") int sunOpen, @Param(name = "sunClose") int sunClose, @Param(name = "monOpen") int monOpen, @Param(name = "monClose") int monClose, @Param(name = "tueOpen") int tueOpen, @Param(name = "tueClose") int tueClose, @Param(name = "wedOpen") int wedOpen, @Param(name = "wedClose") int wedClose, @Param(name = "thuOpen") int thuOpen, @Param(name = "thuClose") int thuClose, @Param(name = "friOpen") int friOpen, @Param(name = "friClose") int friClose, @Param(name = "satOpen") int satOpen, @Param(name = "satClose") int satClose);

  @Path("/delete-org-labor")
  Call<Response> deleteOrgLabor(@Param(name = "orgLaborId") long orgLaborId);

  @Path("/get-org-labor")
  Call<JSONObject> getOrgLabor(@Param(name = "orgLaborId") long orgLaborId);

  @Path("/get-org-labors")
  Call<JSONArray> getOrgLabors(@Param(name = "organizationId") long organizationId);

  @Path("/update-org-labor")
  Call<JSONObject> updateOrgLabor(@Param(name = "orgLaborId") long orgLaborId, @Param(name = "typeId") int typeId, @Param(name = "sunOpen") int sunOpen, @Param(name = "sunClose") int sunClose, @Param(name = "monOpen") int monOpen, @Param(name = "monClose") int monClose, @Param(name = "tueOpen") int tueOpen, @Param(name = "tueClose") int tueClose, @Param(name = "wedOpen") int wedOpen, @Param(name = "wedClose") int wedClose, @Param(name = "thuOpen") int thuOpen, @Param(name = "thuClose") int thuClose, @Param(name = "friOpen") int friOpen, @Param(name = "friClose") int friClose, @Param(name = "satOpen") int satOpen, @Param(name = "satClose") int satClose);
}
