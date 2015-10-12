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
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Pickups resource to organize items submitted in an order into pickups that enable the shopper to fulfill the order items using the in-store pickup method.
 * </summary>
 */
public class PickupResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PickupResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of the actions available to perform for the pickup specified in the request.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	string string = pickup.getAvailablePickupFulfillmentActions( orderId,  pickupId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @return List<string>
	 * @see string
	 */
	public List<String> getAvailablePickupFulfillmentActions(String orderId, String pickupId) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.orders.PickupClient.getAvailablePickupFulfillmentActionsClient( orderId,  pickupId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of the actions available to perform for the pickup specified in the request.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	CountDownLatch latch = pickup.getAvailablePickupFulfillmentActions( orderId,  pickupId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @param  callback callback handler for asynchronous operations
	 * @return List<string>
	 * @see string
	 */
	public CountDownLatch getAvailablePickupFulfillmentActionsAsync(String orderId, String pickupId, AsyncCallback<List<String>> callback) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.orders.PickupClient.getAvailablePickupFulfillmentActionsClient( orderId,  pickupId);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves the details of the in-store pickup specified in the request.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	Pickup pickup = pickup.getPickup( orderId,  pickupId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Pickup getPickup(String orderId, String pickupId) throws Exception
	{
		return getPickup( orderId,  pickupId,  null);
	}

	/**
	 * Retrieves the details of the in-store pickup specified in the request.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	CountDownLatch latch = pickup.getPickup( orderId,  pickupId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public CountDownLatch getPickupAsync(String orderId, String pickupId, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> callback) throws Exception
	{
		return getPickupAsync( orderId,  pickupId,  null, callback);
	}

	/**
	 * Retrieves the details of the in-store pickup specified in the request.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	Pickup pickup = pickup.getPickup( orderId,  pickupId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Pickup getPickup(String orderId, String pickupId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> client = com.mozu.api.clients.commerce.orders.PickupClient.getPickupClient( orderId,  pickupId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the in-store pickup specified in the request.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	CountDownLatch latch = pickup.getPickup( orderId,  pickupId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public CountDownLatch getPickupAsync(String orderId, String pickupId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> client = com.mozu.api.clients.commerce.orders.PickupClient.getPickupClient( orderId,  pickupId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Create a new pickup for the order specified in the request for in-store fufillment.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	Pickup pickup = pickup.createPickup( pickup,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickup Properties of an in-store pickup defined to fulfill items in an order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Pickup createPickup(com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId) throws Exception
	{
		return createPickup( pickup,  orderId,  null);
	}

	/**
	 * Create a new pickup for the order specified in the request for in-store fufillment.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	CountDownLatch latch = pickup.createPickup( pickup,  orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @param pickup Properties of an in-store pickup defined to fulfill items in an order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public CountDownLatch createPickupAsync(com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> callback) throws Exception
	{
		return createPickupAsync( pickup,  orderId,  null, callback);
	}

	/**
	 * Create a new pickup for the order specified in the request for in-store fufillment.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	Pickup pickup = pickup.createPickup( pickup,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param pickup Properties of an in-store pickup defined to fulfill items in an order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Pickup createPickup(com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> client = com.mozu.api.clients.commerce.orders.PickupClient.createPickupClient( pickup,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Create a new pickup for the order specified in the request for in-store fufillment.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	CountDownLatch latch = pickup.createPickup( pickup,  orderId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param pickup Properties of an in-store pickup defined to fulfill items in an order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public CountDownLatch createPickupAsync(com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> client = com.mozu.api.clients.commerce.orders.PickupClient.createPickupClient( pickup,  orderId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates one or more details of a defined in-store pickup.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	Pickup pickup = pickup.updatePickup( pickup,  orderId,  pickupId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @param pickup Properties of an in-store pickup defined to fulfill items in an order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Pickup updatePickup(com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String pickupId) throws Exception
	{
		return updatePickup( pickup,  orderId,  pickupId,  null);
	}

	/**
	 * Updates one or more details of a defined in-store pickup.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	CountDownLatch latch = pickup.updatePickup( pickup,  orderId,  pickupId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @param  callback callback handler for asynchronous operations
	 * @param pickup Properties of an in-store pickup defined to fulfill items in an order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public CountDownLatch updatePickupAsync(com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String pickupId, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> callback) throws Exception
	{
		return updatePickupAsync( pickup,  orderId,  pickupId,  null, callback);
	}

	/**
	 * Updates one or more details of a defined in-store pickup.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	Pickup pickup = pickup.updatePickup( pickup,  orderId,  pickupId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param pickup Properties of an in-store pickup defined to fulfill items in an order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Pickup updatePickup(com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String pickupId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> client = com.mozu.api.clients.commerce.orders.PickupClient.updatePickupClient( pickup,  orderId,  pickupId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more details of a defined in-store pickup.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	CountDownLatch latch = pickup.updatePickup( pickup,  orderId,  pickupId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param pickup Properties of an in-store pickup defined to fulfill items in an order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public CountDownLatch updatePickupAsync(com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String pickupId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> client = com.mozu.api.clients.commerce.orders.PickupClient.updatePickupClient( pickup,  orderId,  pickupId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Removes a pickup previously defined for order item in-store pickup fulfillment.
	 * <p><pre><code>
	 *	Pickup pickup = new Pickup();
	 *	pickup.deletePickup( orderId,  pickupId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @return 
	 */
	public void deletePickup(String orderId, String pickupId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.PickupClient.deletePickupClient( orderId,  pickupId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



