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
 * Use the shipments resource to manage shipments of collections of packages for an order.
 * </summary>
 */
public class ShipmentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ShipmentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the details of the order shipment specified in the request.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	Shipment shipment = shipment.getShipment( orderId,  shipmentId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Shipment getShipment(String orderId, String shipmentId) throws Exception
	{
		return getShipment( orderId,  shipmentId,  null);
	}

	/**
	 * Retrieves the details of the order shipment specified in the request.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	CountDownLatch latch = shipment.getShipment( orderId,  shipmentId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 */
	public CountDownLatch getShipmentAsync(String orderId, String shipmentId, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> callback) throws Exception
	{
		return getShipmentAsync( orderId,  shipmentId,  null, callback);
	}

	/**
	 * Retrieves the details of the order shipment specified in the request.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	Shipment shipment = shipment.getShipment( orderId,  shipmentId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Shipment getShipment(String orderId, String shipmentId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> client = com.mozu.api.clients.commerce.orders.ShipmentClient.getShipmentClient( orderId,  shipmentId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the order shipment specified in the request.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	CountDownLatch latch = shipment.getShipment( orderId,  shipmentId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 */
	public CountDownLatch getShipmentAsync(String orderId, String shipmentId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> client = com.mozu.api.clients.commerce.orders.ShipmentClient.getShipmentClient( orderId,  shipmentId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves the available shipping methods applicable to the order. Typically used to display available shipping method options on the checkout page.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	ShippingRate shippingRate = shipment.getAvailableShipmentMethods( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate
	 */
	public List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate> getAvailableShipmentMethods(String orderId) throws Exception
	{
		return getAvailableShipmentMethods( orderId,  null);
	}

	/**
	 * Retrieves the available shipping methods applicable to the order. Typically used to display available shipping method options on the checkout page.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	CountDownLatch latch = shipment.getAvailableShipmentMethods( orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate
	 */
	public CountDownLatch getAvailableShipmentMethodsAsync(String orderId, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>> callback) throws Exception
	{
		return getAvailableShipmentMethodsAsync( orderId,  null, callback);
	}

	/**
	 * Retrieves the available shipping methods applicable to the order. Typically used to display available shipping method options on the checkout page.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	ShippingRate shippingRate = shipment.getAvailableShipmentMethods( orderId,  draft);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @return List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate
	 */
	public List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate> getAvailableShipmentMethods(String orderId, Boolean draft) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>> client = com.mozu.api.clients.commerce.orders.ShipmentClient.getAvailableShipmentMethodsClient( orderId,  draft);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the available shipping methods applicable to the order. Typically used to display available shipping method options on the checkout page.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	CountDownLatch latch = shipment.getAvailableShipmentMethods( orderId,  draft, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate
	 */
	public CountDownLatch getAvailableShipmentMethodsAsync(String orderId, Boolean draft, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>> client = com.mozu.api.clients.commerce.orders.ShipmentClient.getAvailableShipmentMethodsClient( orderId,  draft);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a shipment from one or more package associated with an order and assign a label and tracking number to an order shipment.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	Package package = shipment.createPackageShipments( packageIds,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param packageIds List of unique identifiers for each package associated with this shipment. Not all packages must belong to the same shipment.
	 * @return List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see string
	 */
	public List<com.mozu.api.contracts.commerceruntime.fulfillment.Package> createPackageShipments(List<String> packageIds, String orderId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>> client = com.mozu.api.clients.commerce.orders.ShipmentClient.createPackageShipmentsClient( packageIds,  orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a shipment from one or more package associated with an order and assign a label and tracking number to an order shipment.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	CountDownLatch latch = shipment.createPackageShipments( packageIds,  orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @param packageIds List of unique identifiers for each package associated with this shipment. Not all packages must belong to the same shipment.
	 * @return List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see string
	 */
	public CountDownLatch createPackageShipmentsAsync(List<String> packageIds, String orderId, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>> client = com.mozu.api.clients.commerce.orders.ShipmentClient.createPackageShipmentsClient( packageIds,  orderId);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes the shipment specified in the request.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	shipment.deleteShipment( orderId,  shipmentId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @return 
	 */
	public void deleteShipment(String orderId, String shipmentId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.ShipmentClient.deleteShipmentClient( orderId,  shipmentId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



