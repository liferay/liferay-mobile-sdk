package com.liferay.mobile.sdk.v62.passwordpolicy;

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/passwordpolicy")
public interface PasswordPolicyService {
  @Path("/add-password-policy")
  Call<JSONObject> addPasswordPolicy(@Param("name") String name, @Param("description") String description, @Param("changeable") boolean changeable, @Param("changeRequired") boolean changeRequired, @Param("minAge") long minAge, @Param("checkSyntax") boolean checkSyntax, @Param("allowDictionaryWords") boolean allowDictionaryWords, @Param("minAlphanumeric") int minAlphanumeric, @Param("minLength") int minLength, @Param("minLowerCase") int minLowerCase, @Param("minNumbers") int minNumbers, @Param("minSymbols") int minSymbols, @Param("minUpperCase") int minUpperCase, @Param("history") boolean history, @Param("historyCount") int historyCount, @Param("expireable") boolean expireable, @Param("maxAge") long maxAge, @Param("warningTime") long warningTime, @Param("graceLimit") int graceLimit, @Param("lockout") boolean lockout, @Param("maxFailure") int maxFailure, @Param("lockoutDuration") long lockoutDuration, @Param("resetFailureCount") long resetFailureCount, @Param("resetTicketMaxAge") long resetTicketMaxAge);

  @Path("/add-password-policy")
  Call<JSONObject> addPasswordPolicy(@Param("name") String name, @Param("description") String description, @Param("changeable") boolean changeable, @Param("changeRequired") boolean changeRequired, @Param("minAge") long minAge, @Param("checkSyntax") boolean checkSyntax, @Param("allowDictionaryWords") boolean allowDictionaryWords, @Param("minAlphanumeric") int minAlphanumeric, @Param("minLength") int minLength, @Param("minLowerCase") int minLowerCase, @Param("minNumbers") int minNumbers, @Param("minSymbols") int minSymbols, @Param("minUpperCase") int minUpperCase, @Param("regex") String regex, @Param("history") boolean history, @Param("historyCount") int historyCount, @Param("expireable") boolean expireable, @Param("maxAge") long maxAge, @Param("warningTime") long warningTime, @Param("graceLimit") int graceLimit, @Param("lockout") boolean lockout, @Param("maxFailure") int maxFailure, @Param("lockoutDuration") long lockoutDuration, @Param("resetFailureCount") long resetFailureCount, @Param("resetTicketMaxAge") long resetTicketMaxAge, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-password-policy")
  Call<Response> deletePasswordPolicy(@Param("passwordPolicyId") long passwordPolicyId);

  @Path("/update-password-policy")
  Call<JSONObject> updatePasswordPolicy(@Param("passwordPolicyId") long passwordPolicyId, @Param("name") String name, @Param("description") String description, @Param("changeable") boolean changeable, @Param("changeRequired") boolean changeRequired, @Param("minAge") long minAge, @Param("checkSyntax") boolean checkSyntax, @Param("allowDictionaryWords") boolean allowDictionaryWords, @Param("minAlphanumeric") int minAlphanumeric, @Param("minLength") int minLength, @Param("minLowerCase") int minLowerCase, @Param("minNumbers") int minNumbers, @Param("minSymbols") int minSymbols, @Param("minUpperCase") int minUpperCase, @Param("history") boolean history, @Param("historyCount") int historyCount, @Param("expireable") boolean expireable, @Param("maxAge") long maxAge, @Param("warningTime") long warningTime, @Param("graceLimit") int graceLimit, @Param("lockout") boolean lockout, @Param("maxFailure") int maxFailure, @Param("lockoutDuration") long lockoutDuration, @Param("resetFailureCount") long resetFailureCount, @Param("resetTicketMaxAge") long resetTicketMaxAge);

  @Path("/update-password-policy")
  Call<JSONObject> updatePasswordPolicy(@Param("passwordPolicyId") long passwordPolicyId, @Param("name") String name, @Param("description") String description, @Param("changeable") boolean changeable, @Param("changeRequired") boolean changeRequired, @Param("minAge") long minAge, @Param("checkSyntax") boolean checkSyntax, @Param("allowDictionaryWords") boolean allowDictionaryWords, @Param("minAlphanumeric") int minAlphanumeric, @Param("minLength") int minLength, @Param("minLowerCase") int minLowerCase, @Param("minNumbers") int minNumbers, @Param("minSymbols") int minSymbols, @Param("minUpperCase") int minUpperCase, @Param("regex") String regex, @Param("history") boolean history, @Param("historyCount") int historyCount, @Param("expireable") boolean expireable, @Param("maxAge") long maxAge, @Param("warningTime") long warningTime, @Param("graceLimit") int graceLimit, @Param("lockout") boolean lockout, @Param("maxFailure") int maxFailure, @Param("lockoutDuration") long lockoutDuration, @Param("resetFailureCount") long resetFailureCount, @Param("resetTicketMaxAge") long resetTicketMaxAge, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
