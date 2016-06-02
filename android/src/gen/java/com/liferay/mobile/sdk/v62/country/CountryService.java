package com.liferay.mobile.sdk.v62.country;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/country")
public interface CountryService {
  @Path("/add-country")
  Call<JSONObject> addCountry(@Param(name = "name") String name, @Param(name = "a2") String a2, @Param(name = "a3") String a3, @Param(name = "number") String number, @Param(name = "idd") String idd, @Param(name = "active") boolean active);

  @Path("/fetch-country")
  Call<JSONObject> fetchCountry(@Param(name = "countryId") long countryId);

  @Path("/fetch-country-by-a2")
  Call<JSONObject> fetchCountryByA2(@Param(name = "a2") String a2);

  @Path("/fetch-country-by-a3")
  Call<JSONObject> fetchCountryByA3(@Param(name = "a3") String a3);

  @Path("/get-countries")
  Call<JSONArray> getCountries();

  @Path("/get-countries")
  Call<JSONArray> getCountries(@Param(name = "active") boolean active);

  @Path("/get-country")
  Call<JSONObject> getCountry(@Param(name = "countryId") long countryId);

  @Path("/get-country-by-a2")
  Call<JSONObject> getCountryByA2(@Param(name = "a2") String a2);

  @Path("/get-country-by-a3")
  Call<JSONObject> getCountryByA3(@Param(name = "a3") String a3);

  @Path("/get-country-by-name")
  Call<JSONObject> getCountryByName(@Param(name = "name") String name);
}
