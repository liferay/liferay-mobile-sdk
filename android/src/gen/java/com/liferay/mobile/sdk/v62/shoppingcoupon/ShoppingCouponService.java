package com.liferay.mobile.sdk.v62.shoppingcoupon;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/shoppingcoupon")
public interface ShoppingCouponService {
  @Path("/add-coupon")
  Call<JSONObject> addCoupon(@Param(name = "code") String code, @Param(name = "autoCode") boolean autoCode, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "startDateMonth") int startDateMonth, @Param(name = "startDateDay") int startDateDay, @Param(name = "startDateYear") int startDateYear, @Param(name = "startDateHour") int startDateHour, @Param(name = "startDateMinute") int startDateMinute, @Param(name = "endDateMonth") int endDateMonth, @Param(name = "endDateDay") int endDateDay, @Param(name = "endDateYear") int endDateYear, @Param(name = "endDateHour") int endDateHour, @Param(name = "endDateMinute") int endDateMinute, @Param(name = "neverExpire") boolean neverExpire, @Param(name = "active") boolean active, @Param(name = "limitCategories") String limitCategories, @Param(name = "limitSkus") String limitSkus, @Param(name = "minOrder") double minOrder, @Param(name = "discount") double discount, @Param(name = "discountType") String discountType, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-coupon")
  Call<Response> deleteCoupon(@Param(name = "groupId") long groupId, @Param(name = "couponId") long couponId);

  @Path("/get-coupon")
  Call<JSONObject> getCoupon(@Param(name = "groupId") long groupId, @Param(name = "couponId") long couponId);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "groupId") long groupId, @Param(name = "companyId") long companyId, @Param(name = "code") String code, @Param(name = "active") boolean active, @Param(name = "discountType") String discountType, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/update-coupon")
  Call<JSONObject> updateCoupon(@Param(name = "couponId") long couponId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "startDateMonth") int startDateMonth, @Param(name = "startDateDay") int startDateDay, @Param(name = "startDateYear") int startDateYear, @Param(name = "startDateHour") int startDateHour, @Param(name = "startDateMinute") int startDateMinute, @Param(name = "endDateMonth") int endDateMonth, @Param(name = "endDateDay") int endDateDay, @Param(name = "endDateYear") int endDateYear, @Param(name = "endDateHour") int endDateHour, @Param(name = "endDateMinute") int endDateMinute, @Param(name = "neverExpire") boolean neverExpire, @Param(name = "active") boolean active, @Param(name = "limitCategories") String limitCategories, @Param(name = "limitSkus") String limitSkus, @Param(name = "minOrder") double minOrder, @Param(name = "discount") double discount, @Param(name = "discountType") String discountType, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
