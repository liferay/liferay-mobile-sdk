package com.liferay.mobile.android.v62.country;

import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/country")
public interface CountryService {
  @Path("/add-country")
  Call<JSONObject> addCountry(@Param("name") String name, @Param("a2") String a2, @Param("a3") String a3, @Param("number") String number, @Param("idd") String idd, @Param("active") boolean active);

  @Path("/fetch-country")
  Call<JSONObject> fetchCountry(@Param("countryId") long countryId);

  @Path("/fetch-country-by-a2")
  Call<JSONObject> fetchCountryByA2(@Param("a2") String a2);

  @Path("/fetch-country-by-a3")
  Call<JSONObject> fetchCountryByA3(@Param("a3") String a3);

  @Path("/get-countries")
  Call<JSONArray> getCountries();

  @Path("/get-countries")
  Call<JSONArray> getCountries(@Param("active") boolean active);

  @Path("/get-country")
  Call<JSONObject> getCountry(@Param("countryId") long countryId);

  @Path("/get-country-by-a2")
  Call<JSONObject> getCountryByA2(@Param("a2") String a2);

  @Path("/get-country-by-a3")
  Call<JSONObject> getCountryByA3(@Param("a3") String a3);

  @Path("/get-country-by-name")
  Call<JSONObject> getCountryByName(@Param("name") String name);
}
