package com.liferay.mobile.sdk.v62.region;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/region")
public interface RegionService {
  @Path("/add-region")
  Call<JSONObject> addRegion(@Param("countryId") long countryId, @Param("regionCode") String regionCode, @Param("name") String name, @Param("active") boolean active);

  @Path("/fetch-region")
  Call<JSONObject> fetchRegion(@Param("countryId") long countryId, @Param("regionCode") String regionCode);

  @Path("/get-region")
  Call<JSONObject> getRegion(@Param("regionId") long regionId);

  @Path("/get-region")
  Call<JSONObject> getRegion(@Param("countryId") long countryId, @Param("regionCode") String regionCode);

  @Path("/get-regions")
  Call<JSONArray> getRegions();

  @Path("/get-regions")
  Call<JSONArray> getRegions(@Param("active") boolean active);

  @Path("/get-regions")
  Call<JSONArray> getRegions(@Param("countryId") long countryId);

  @Path("/get-regions")
  Call<JSONArray> getRegions(@Param("countryId") long countryId, @Param("active") boolean active);
}
