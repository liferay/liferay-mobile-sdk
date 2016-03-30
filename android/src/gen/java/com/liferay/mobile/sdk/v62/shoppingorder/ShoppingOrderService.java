package com.liferay.mobile.sdk.v62.shoppingorder;

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/shoppingorder")
public interface ShoppingOrderService {
  @Path("/complete-order")
  Call<Response> completeOrder(@Param("groupId") long groupId, @Param("number") String number, @Param("ppTxnId") String ppTxnId, @Param("ppPaymentStatus") String ppPaymentStatus, @Param("ppPaymentGross") double ppPaymentGross, @Param("ppReceiverEmail") String ppReceiverEmail, @Param("ppPayerEmail") String ppPayerEmail, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-order")
  Call<Response> deleteOrder(@Param("groupId") long groupId, @Param("orderId") long orderId);

  @Path("/get-order")
  Call<JSONObject> getOrder(@Param("groupId") long groupId, @Param("orderId") long orderId);

  @Path("/send-email")
  Call<Response> sendEmail(@Param("groupId") long groupId, @Param("orderId") long orderId, @Param("emailType") String emailType, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-order")
  Call<JSONObject> updateOrder(@Param("groupId") long groupId, @Param("orderId") long orderId, @Param("billingFirstName") String billingFirstName, @Param("billingLastName") String billingLastName, @Param("billingEmailAddress") String billingEmailAddress, @Param("billingCompany") String billingCompany, @Param("billingStreet") String billingStreet, @Param("billingCity") String billingCity, @Param("billingState") String billingState, @Param("billingZip") String billingZip, @Param("billingCountry") String billingCountry, @Param("billingPhone") String billingPhone, @Param("shipToBilling") boolean shipToBilling, @Param("shippingFirstName") String shippingFirstName, @Param("shippingLastName") String shippingLastName, @Param("shippingEmailAddress") String shippingEmailAddress, @Param("shippingCompany") String shippingCompany, @Param("shippingStreet") String shippingStreet, @Param("shippingCity") String shippingCity, @Param("shippingState") String shippingState, @Param("shippingZip") String shippingZip, @Param("shippingCountry") String shippingCountry, @Param("shippingPhone") String shippingPhone, @Param("ccName") String ccName, @Param("ccType") String ccType, @Param("ccNumber") String ccNumber, @Param("ccExpMonth") int ccExpMonth, @Param("ccExpYear") int ccExpYear, @Param("ccVerNumber") String ccVerNumber, @Param("comments") String comments);

  @Path("/update-order")
  Call<JSONObject> updateOrder(@Param("groupId") long groupId, @Param("orderId") long orderId, @Param("ppTxnId") String ppTxnId, @Param("ppPaymentStatus") String ppPaymentStatus, @Param("ppPaymentGross") double ppPaymentGross, @Param("ppReceiverEmail") String ppReceiverEmail, @Param("ppPayerEmail") String ppPayerEmail);
}
