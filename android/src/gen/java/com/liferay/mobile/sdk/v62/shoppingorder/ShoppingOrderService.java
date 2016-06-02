package com.liferay.mobile.sdk.v62.shoppingorder;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/shoppingorder")
public interface ShoppingOrderService {
  @Path("/complete-order")
  Call<Response> completeOrder(@Param(name = "groupId") long groupId, @Param(name = "number") String number, @Param(name = "ppTxnId") String ppTxnId, @Param(name = "ppPaymentStatus") String ppPaymentStatus, @Param(name = "ppPaymentGross") double ppPaymentGross, @Param(name = "ppReceiverEmail") String ppReceiverEmail, @Param(name = "ppPayerEmail") String ppPayerEmail, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-order")
  Call<Response> deleteOrder(@Param(name = "groupId") long groupId, @Param(name = "orderId") long orderId);

  @Path("/get-order")
  Call<JSONObject> getOrder(@Param(name = "groupId") long groupId, @Param(name = "orderId") long orderId);

  @Path("/send-email")
  Call<Response> sendEmail(@Param(name = "groupId") long groupId, @Param(name = "orderId") long orderId, @Param(name = "emailType") String emailType, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-order")
  Call<JSONObject> updateOrder(@Param(name = "groupId") long groupId, @Param(name = "orderId") long orderId, @Param(name = "billingFirstName") String billingFirstName, @Param(name = "billingLastName") String billingLastName, @Param(name = "billingEmailAddress") String billingEmailAddress, @Param(name = "billingCompany") String billingCompany, @Param(name = "billingStreet") String billingStreet, @Param(name = "billingCity") String billingCity, @Param(name = "billingState") String billingState, @Param(name = "billingZip") String billingZip, @Param(name = "billingCountry") String billingCountry, @Param(name = "billingPhone") String billingPhone, @Param(name = "shipToBilling") boolean shipToBilling, @Param(name = "shippingFirstName") String shippingFirstName, @Param(name = "shippingLastName") String shippingLastName, @Param(name = "shippingEmailAddress") String shippingEmailAddress, @Param(name = "shippingCompany") String shippingCompany, @Param(name = "shippingStreet") String shippingStreet, @Param(name = "shippingCity") String shippingCity, @Param(name = "shippingState") String shippingState, @Param(name = "shippingZip") String shippingZip, @Param(name = "shippingCountry") String shippingCountry, @Param(name = "shippingPhone") String shippingPhone, @Param(name = "ccName") String ccName, @Param(name = "ccType") String ccType, @Param(name = "ccNumber") String ccNumber, @Param(name = "ccExpMonth") int ccExpMonth, @Param(name = "ccExpYear") int ccExpYear, @Param(name = "ccVerNumber") String ccVerNumber, @Param(name = "comments") String comments);

  @Path("/update-order")
  Call<JSONObject> updateOrder(@Param(name = "groupId") long groupId, @Param(name = "orderId") long orderId, @Param(name = "ppTxnId") String ppTxnId, @Param(name = "ppPaymentStatus") String ppPaymentStatus, @Param(name = "ppPaymentGross") double ppPaymentGross, @Param(name = "ppReceiverEmail") String ppReceiverEmail, @Param(name = "ppPayerEmail") String ppPayerEmail);
}
