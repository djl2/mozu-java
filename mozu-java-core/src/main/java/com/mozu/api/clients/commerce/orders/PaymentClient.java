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
 * Use the Payments subresource to manage payment transactions for orders. Each transaction performed for an order represents an individual payment. For example, if an order totals $75.00 but the shopper has a $50.00 gift certificate, both the gift certificate transaction and the credit card transaction for the remaining $25.00 are recorded as payments for the order.
 * </summary>
 */
public class PaymentClient {
	
	/**
	 * Retrieves information about all payment transactions submitted for the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> mozuClient=GetPaymentsClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PaymentCollection paymentCollection = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.PaymentCollection>
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> getPaymentsClient(String orderId) throws Exception
	{
		return getPaymentsClient( orderId,  null);
	}

	/**
	 * Retrieves information about all payment transactions submitted for the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> mozuClient=GetPaymentsClient( orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PaymentCollection paymentCollection = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.PaymentCollection>
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> getPaymentsClient(String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PaymentUrl.getPaymentsUrl(orderId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.payments.PaymentCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the list of all available payment actions dependent on the order payment status by specifying the order ID.
	 * <p><pre><code>
	 * MozuClient<List<String>> mozuClient=GetAvailablePaymentActionsClient( orderId,  paymentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @return Mozu.Api.MozuClient <List<string>>
	 * @see string
	 */
	public static MozuClient<List<String>> getAvailablePaymentActionsClient(String orderId, String paymentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PaymentUrl.getAvailablePaymentActionsUrl(orderId, paymentId);
		String verb = "GET";
		Class<?> clz = new ArrayList<String>(){}.getClass();
		MozuClient<List<String>> mozuClient = (MozuClient<List<String>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves information about a specific payment transaction submitted for the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> mozuClient=GetPaymentClient( orderId,  paymentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Payment payment = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.Payment>
	 * @see com.mozu.api.contracts.commerceruntime.payments.Payment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> getPaymentClient(String orderId, String paymentId) throws Exception
	{
		return getPaymentClient( orderId,  paymentId,  null);
	}

	/**
	 * Retrieves information about a specific payment transaction submitted for the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> mozuClient=GetPaymentClient( orderId,  paymentId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Payment payment = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.Payment>
	 * @see com.mozu.api.contracts.commerceruntime.payments.Payment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> getPaymentClient(String orderId, String paymentId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PaymentUrl.getPaymentUrl(orderId, paymentId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.payments.Payment.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Performs the specified action for an individual order payment transaction.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=PerformPaymentActionClient( action,  orderId,  paymentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param action Properties of the payment action performed for an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> performPaymentActionClient(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String orderId, String paymentId) throws Exception
	{
		return performPaymentActionClient( action,  orderId,  paymentId,  null);
	}

	/**
	 * Performs the specified action for an individual order payment transaction.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=PerformPaymentActionClient( action,  orderId,  paymentId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param action Properties of the payment action performed for an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> performPaymentActionClient(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String orderId, String paymentId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PaymentUrl.performPaymentActionUrl(orderId, paymentId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * Creates a new payment transaction for the specified order and performs the specified action.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreatePaymentActionClient( action,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param action Properties of the payment action performed for an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createPaymentActionClient(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String orderId) throws Exception
	{
		return createPaymentActionClient( action,  orderId,  null);
	}

	/**
	 * Creates a new payment transaction for the specified order and performs the specified action.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreatePaymentActionClient( action,  orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param action Properties of the payment action performed for an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createPaymentActionClient(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PaymentUrl.createPaymentActionUrl(orderId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

}



