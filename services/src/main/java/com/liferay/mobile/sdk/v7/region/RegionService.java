package com.liferay.mobile.sdk.v7.region;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/region")
public interface RegionService {
  @Path("/add-region")
  Call<JSONObject> addRegion(@Param(name = "countryId") long countryId, @Param(name = "regionCode") String regionCode, @Param(name = "name") String name, @Param(name = "active") boolean active);

  @Path("/fetch-region")
  Call<JSONObject> fetchRegion(@Param(name = "regionId") long regionId);

  @Path("/fetch-region")
  Call<JSONObject> fetchRegion(@Param(name = "countryId") long countryId, @Param(name = "regionCode") String regionCode);

  @Path("/get-region")
  Call<JSONObject> getRegion(@Param(name = "regionId") long regionId);

  @Path("/get-region")
  Call<JSONObject> getRegion(@Param(name = "countryId") long countryId, @Param(name = "regionCode") String regionCode);

  @Path("/get-regions")
  Call<JSONArray> getRegions();

  @Path("/get-regions")
  Call<JSONArray> getRegions(@Param(name = "countryId") long countryId);

  @Path("/get-regions")
  Call<JSONArray> getRegions(@Param(name = "active") boolean active);

  @Path("/get-regions")
  Call<JSONArray> getRegions(@Param(name = "countryId") long countryId, @Param(name = "active") boolean active);
}
