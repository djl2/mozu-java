/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Fulfillment resource to manage shipments or pickups of collections of packages for an order.
 * </summary>
 */
public class FulfillmentActionClient {
	
	/**
	 * Sets the fulfillment action to "Ship" or "PickUp". To ship an order or prepare it for in-store pickup, the order must have a customer name, the "Open" or "OpenAndProcessing" status. To ship the order, it must also have the full shipping address and shipping method. Shipping all packages or picking up all pickups for an order will complete a paid order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=PerformFulfillmentActionClient( action,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> performFulfillmentActionClient(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId) throws Exception
	{
		return performFulfillmentActionClient( action,  orderId,  null);
	}

	/**
	 * Sets the fulfillment action to "Ship" or "PickUp". To ship an order or prepare it for in-store pickup, the order must have a customer name, the "Open" or "OpenAndProcessing" status. To ship the order, it must also have the full shipping address and shipping method. Shipping all packages or picking up all pickups for an order will complete a paid order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=PerformFulfillmentActionClient( action,  orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> performFulfillmentActionClient(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.FulfillmentActionUrl.performFulfillmentActionUrl(orderId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ResendPackageFulfillmentEmailClient( action,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param action 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> resendPackageFulfillmentEmailClient(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId) throws Exception
	{
		return resendPackageFulfillmentEmailClient( action,  orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ResendPackageFulfillmentEmailClient( action,  orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param responseFields 
	 * @param action 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> resendPackageFulfillmentEmailClient(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.FulfillmentActionUrl.resendPackageFulfillmentEmailUrl(orderId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

}



