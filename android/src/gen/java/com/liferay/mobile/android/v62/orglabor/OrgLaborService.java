package com.liferay.mobile.android.v62.orglabor;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/orglabor")
public interface OrgLaborService {
  @Path("/add-org-labor")
  Call<JSONObject> addOrgLabor(@Param("organizationId") long organizationId, @Param("typeId") int typeId, @Param("sunOpen") int sunOpen, @Param("sunClose") int sunClose, @Param("monOpen") int monOpen, @Param("monClose") int monClose, @Param("tueOpen") int tueOpen, @Param("tueClose") int tueClose, @Param("wedOpen") int wedOpen, @Param("wedClose") int wedClose, @Param("thuOpen") int thuOpen, @Param("thuClose") int thuClose, @Param("friOpen") int friOpen, @Param("friClose") int friClose, @Param("satOpen") int satOpen, @Param("satClose") int satClose);

  @Path("/delete-org-labor")
  Call<Response> deleteOrgLabor(@Param("orgLaborId") long orgLaborId);

  @Path("/get-org-labor")
  Call<JSONObject> getOrgLabor(@Param("orgLaborId") long orgLaborId);

  @Path("/get-org-labors")
  Call<JSONArray> getOrgLabors(@Param("organizationId") long organizationId);

  @Path("/update-org-labor")
  Call<JSONObject> updateOrgLabor(@Param("orgLaborId") long orgLaborId, @Param("typeId") int typeId, @Param("sunOpen") int sunOpen, @Param("sunClose") int sunClose, @Param("monOpen") int monOpen, @Param("monClose") int monClose, @Param("tueOpen") int tueOpen, @Param("tueClose") int tueClose, @Param("wedOpen") int wedOpen, @Param("wedClose") int wedClose, @Param("thuOpen") int thuOpen, @Param("thuClose") int thuClose, @Param("friOpen") int friOpen, @Param("friClose") int friClose, @Param("satOpen") int satOpen, @Param("satClose") int satClose);
}
