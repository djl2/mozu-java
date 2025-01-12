/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.discounts;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Retrieves and modifies the products, categories, and shipping methods eligible for discounts in the form of a fixed dollar amount, percentage off a product price, or free shipping.
 * </summary>
 */
public class DiscountTargetResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public DiscountTargetResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public DiscountTargetResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves the discount target, that is which products, categories, or shipping methods are eligible for the discount.
	 * <p><pre><code>
	 *	DiscountTarget discounttarget = new DiscountTarget();
	 *	DiscountTarget discountTarget = discounttarget.getDiscountTarget( discountId);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @return com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public com.mozu.api.contracts.productadmin.DiscountTarget getDiscountTarget(Integer discountId) throws Exception
	{
		return getDiscountTarget( discountId,  null);
	}

	/**
	 * Retrieves the discount target, that is which products, categories, or shipping methods are eligible for the discount.
	 * <p><pre><code>
	 *	DiscountTarget discounttarget = new DiscountTarget();
	 *	CountDownLatch latch = discounttarget.getDiscountTarget( discountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public CountDownLatch getDiscountTargetAsync(Integer discountId, AsyncCallback<com.mozu.api.contracts.productadmin.DiscountTarget> callback) throws Exception
	{
		return getDiscountTargetAsync( discountId,  null, callback);
	}

	/**
	 * Retrieves the discount target, that is which products, categories, or shipping methods are eligible for the discount.
	 * <p><pre><code>
	 *	DiscountTarget discounttarget = new DiscountTarget();
	 *	DiscountTarget discountTarget = discounttarget.getDiscountTarget( discountId,  responseFields);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public com.mozu.api.contracts.productadmin.DiscountTarget getDiscountTarget(Integer discountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> client = com.mozu.api.clients.commerce.catalog.admin.discounts.DiscountTargetClient.getDiscountTargetClient(_dataViewMode,  discountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the discount target, that is which products, categories, or shipping methods are eligible for the discount.
	 * <p><pre><code>
	 *	DiscountTarget discounttarget = new DiscountTarget();
	 *	CountDownLatch latch = discounttarget.getDiscountTarget( discountId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public CountDownLatch getDiscountTargetAsync(Integer discountId, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.DiscountTarget> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> client = com.mozu.api.clients.commerce.catalog.admin.discounts.DiscountTargetClient.getDiscountTargetClient(_dataViewMode,  discountId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Modifies properties of the discount target, for example, the dollar amount, or precentage off the price.
	 * <p><pre><code>
	 *	DiscountTarget discounttarget = new DiscountTarget();
	 *	DiscountTarget discountTarget = discounttarget.updateDiscountTarget( discountTarget,  discountId);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param discountTarget Properties of the target to which the discount applies, such as the type of discount and which products, categories, or shipping methods are eligible for the discount and the properties of this discount target.
	 * @return com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public com.mozu.api.contracts.productadmin.DiscountTarget updateDiscountTarget(com.mozu.api.contracts.productadmin.DiscountTarget discountTarget, Integer discountId) throws Exception
	{
		return updateDiscountTarget( discountTarget,  discountId,  null);
	}

	/**
	 * Modifies properties of the discount target, for example, the dollar amount, or precentage off the price.
	 * <p><pre><code>
	 *	DiscountTarget discounttarget = new DiscountTarget();
	 *	CountDownLatch latch = discounttarget.updateDiscountTarget( discountTarget,  discountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param  callback callback handler for asynchronous operations
	 * @param discountTarget Properties of the target to which the discount applies, such as the type of discount and which products, categories, or shipping methods are eligible for the discount and the properties of this discount target.
	 * @return com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public CountDownLatch updateDiscountTargetAsync(com.mozu.api.contracts.productadmin.DiscountTarget discountTarget, Integer discountId, AsyncCallback<com.mozu.api.contracts.productadmin.DiscountTarget> callback) throws Exception
	{
		return updateDiscountTargetAsync( discountTarget,  discountId,  null, callback);
	}

	/**
	 * Modifies properties of the discount target, for example, the dollar amount, or precentage off the price.
	 * <p><pre><code>
	 *	DiscountTarget discounttarget = new DiscountTarget();
	 *	DiscountTarget discountTarget = discounttarget.updateDiscountTarget( discountTarget,  discountId,  responseFields);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param discountTarget Properties of the target to which the discount applies, such as the type of discount and which products, categories, or shipping methods are eligible for the discount and the properties of this discount target.
	 * @return com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public com.mozu.api.contracts.productadmin.DiscountTarget updateDiscountTarget(com.mozu.api.contracts.productadmin.DiscountTarget discountTarget, Integer discountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> client = com.mozu.api.clients.commerce.catalog.admin.discounts.DiscountTargetClient.updateDiscountTargetClient( discountTarget,  discountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Modifies properties of the discount target, for example, the dollar amount, or precentage off the price.
	 * <p><pre><code>
	 *	DiscountTarget discounttarget = new DiscountTarget();
	 *	CountDownLatch latch = discounttarget.updateDiscountTarget( discountTarget,  discountId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param discountTarget Properties of the target to which the discount applies, such as the type of discount and which products, categories, or shipping methods are eligible for the discount and the properties of this discount target.
	 * @return com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public CountDownLatch updateDiscountTargetAsync(com.mozu.api.contracts.productadmin.DiscountTarget discountTarget, Integer discountId, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.DiscountTarget> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> client = com.mozu.api.clients.commerce.catalog.admin.discounts.DiscountTargetClient.updateDiscountTargetClient( discountTarget,  discountId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



