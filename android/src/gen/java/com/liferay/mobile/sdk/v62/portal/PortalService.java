package com.liferay.mobile.sdk.v62.portal;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

@Path("/portal")
public interface PortalService {
  @Path("/get-auto-deploy-directory")
  Call<String> getAutoDeployDirectory();

  @Path("/get-build-number")
  Call<Integer> getBuildNumber();

  @Path("/test-add-class-name-and-test-transaction-portlet-bar_-portal-rollback")
  Call<Response> testAddClassNameAndTestTransactionPortletBar_PortalRollback(@Param("transactionPortletBarText") String transactionPortletBarText);

  @Path("/test-add-class-name-and-test-transaction-portlet-bar_-portlet-rollback")
  Call<Response> testAddClassNameAndTestTransactionPortletBar_PortletRollback(@Param("transactionPortletBarText") String transactionPortletBarText);

  @Path("/test-add-class-name-and-test-transaction-portlet-bar_-success")
  Call<Response> testAddClassNameAndTestTransactionPortletBar_Success(@Param("transactionPortletBarText") String transactionPortletBarText);

  @Path("/test-add-class-name_-rollback")
  Call<Response> testAddClassName_Rollback(@Param("classNameValue") String classNameValue);

  @Path("/test-add-class-name_-success")
  Call<Response> testAddClassName_Success(@Param("classNameValue") String classNameValue);

  @Path("/test-auto-sync-hibernate-session-state-on-tx-creation")
  Call<Response> testAutoSyncHibernateSessionStateOnTxCreation();

  @Path("/test-delete-class-name")
  Call<Response> testDeleteClassName();

  @Path("/test-get-build-number")
  Call<Integer> testGetBuildNumber();

  @Path("/test-get-user-id")
  Call<Response> testGetUserId();

  @Path("/test-has-class-name")
  Call<Boolean> testHasClassName();
}
