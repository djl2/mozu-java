/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
import java.util.concurrent.CountDownLatch;

/** <summary>
 * Use this subresource to apply coupons to or remove coupons from an order based on a supplied coupon code.
 * </summary>
 */
public class AppliedDiscountResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public AppliedDiscountResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Apply a coupon to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Order order = applieddiscount.applyCoupon( orderId,  couponCode);
	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyCoupon(String orderId, String couponCode) throws Exception
	{
		return applyCoupon( orderId,  couponCode,  null,  null,  null);
	}

	/**
	 * Apply a coupon to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	CountDownLatch latch = applieddiscount.applyCoupon( orderId,  couponCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public CountDownLatch applyCouponAsync(String orderId, String couponCode, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.Order> callback) throws Exception
	{
		return applyCouponAsync( orderId,  couponCode,  null,  null,  null, callback);
	}

	/**
	 * Apply a coupon to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Order order = applieddiscount.applyCoupon( orderId,  couponCode,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyCoupon(String orderId, String couponCode, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AppliedDiscountClient.applyCouponClient( orderId,  couponCode,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Apply a coupon to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	CountDownLatch latch = applieddiscount.applyCoupon( orderId,  couponCode,  updateMode,  version,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public CountDownLatch applyCouponAsync(String orderId, String couponCode, String updateMode, String version, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.Order> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AppliedDiscountClient.applyCouponClient( orderId,  couponCode,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Removes a coupon previously applied to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Order order = applieddiscount.removeCoupon( orderId,  couponCode);
	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeCoupon(String orderId, String couponCode) throws Exception
	{
		return removeCoupon( orderId,  couponCode,  null,  null);
	}

	/**
	 * Removes a coupon previously applied to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	CountDownLatch latch = applieddiscount.removeCoupon( orderId,  couponCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public CountDownLatch removeCouponAsync(String orderId, String couponCode, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.Order> callback) throws Exception
	{
		return removeCouponAsync( orderId,  couponCode,  null,  null, callback);
	}

	/**
	 * Removes a coupon previously applied to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Order order = applieddiscount.removeCoupon( orderId,  couponCode,  updateMode,  version);
	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeCoupon(String orderId, String couponCode, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AppliedDiscountClient.removeCouponClient( orderId,  couponCode,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes a coupon previously applied to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	CountDownLatch latch = applieddiscount.removeCoupon( orderId,  couponCode,  updateMode,  version, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public CountDownLatch removeCouponAsync(String orderId, String couponCode, String updateMode, String version, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.Order> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AppliedDiscountClient.removeCouponClient( orderId,  couponCode,  updateMode,  version);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Removes all coupons previously applied to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Order order = applieddiscount.removeCoupons( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeCoupons(String orderId) throws Exception
	{
		return removeCoupons( orderId,  null,  null);
	}

	/**
	 * Removes all coupons previously applied to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	CountDownLatch latch = applieddiscount.removeCoupons( orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public CountDownLatch removeCouponsAsync(String orderId, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.Order> callback) throws Exception
	{
		return removeCouponsAsync( orderId,  null,  null, callback);
	}

	/**
	 * Removes all coupons previously applied to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Order order = applieddiscount.removeCoupons( orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeCoupons(String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AppliedDiscountClient.removeCouponsClient( orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes all coupons previously applied to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	CountDownLatch latch = applieddiscount.removeCoupons( orderId,  updateMode,  version, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public CountDownLatch removeCouponsAsync(String orderId, String updateMode, String version, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.Order> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AppliedDiscountClient.removeCouponsClient( orderId,  updateMode,  version);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



