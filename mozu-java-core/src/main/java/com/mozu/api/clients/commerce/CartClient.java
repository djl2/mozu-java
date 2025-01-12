/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use this resource to manage storefront shopping carts as shoppers add and remove items for purchase. Each time a shopper's cart is modified, the Carts resource updates the estimated total with any applicable discounts.
 * </summary>
 */
public class CartClient {
	
	/**
	 * Retrieves the cart specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=GetCartClient( cartId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to delete.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> getCartClient(String cartId) throws Exception
	{
		return getCartClient( cartId,  null);
	}

	/**
	 * Retrieves the cart specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=GetCartClient( cartId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to delete.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> getCartClient(String cartId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CartUrl.getCartUrl(cartId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.Cart.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a cart's contents for the current shopper. If the shopper does not have an active cart on the site, the service creates one.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=GetOrCreateCartClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> getOrCreateCartClient() throws Exception
	{
		return getOrCreateCartClient( null);
	}

	/**
	 * Retrieves a cart's contents for the current shopper. If the shopper does not have an active cart on the site, the service creates one.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=GetOrCreateCartClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> getOrCreateCartClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CartUrl.getOrCreateCartUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.Cart.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves summary information associated with the cart of the current shopper, including the number of items, the current total, and whether the cart has expired. All anonymous idle carts that do not proceed to checkout expire after 14 days.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> mozuClient=GetCartSummaryClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartSummary cartSummary = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartSummary>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> getCartSummaryClient() throws Exception
	{
		return getCartSummaryClient( null);
	}

	/**
	 * Retrieves summary information associated with the cart of the current shopper, including the number of items, the current total, and whether the cart has expired. All anonymous idle carts that do not proceed to checkout expire after 14 days.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> mozuClient=GetCartSummaryClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartSummary cartSummary = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartSummary>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> getCartSummaryClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CartUrl.getCartSummaryUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartSummary.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves summary information associated with the cart of user specified in the request, including the number of items in the cart, the current total, and whether the cart has expired. All anonymous idle carts that do not proceed to checkout expire after 14 days.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> mozuClient=GetUserCartSummaryClient( userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartSummary cartSummary = client.Result();
	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartSummary>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> getUserCartSummaryClient(String userId) throws Exception
	{
		return getUserCartSummaryClient( userId,  null);
	}

	/**
	 * Retrieves summary information associated with the cart of user specified in the request, including the number of items in the cart, the current total, and whether the cart has expired. All anonymous idle carts that do not proceed to checkout expire after 14 days.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> mozuClient=GetUserCartSummaryClient( userId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartSummary cartSummary = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartSummary>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> getUserCartSummaryClient(String userId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CartUrl.getUserCartSummaryUrl(responseFields, userId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartSummary.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the cart of the user specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=GetUserCartClient( userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> getUserCartClient(String userId) throws Exception
	{
		return getUserCartClient( userId,  null);
	}

	/**
	 * Retrieves the cart of the user specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=GetUserCartClient( userId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> getUserCartClient(String userId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CartUrl.getUserCartUrl(responseFields, userId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.Cart.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Update the current shopper's cart.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=UpdateCartClient( cart);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param cart Properties of a shopping cart.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> updateCartClient(com.mozu.api.contracts.commerceruntime.carts.Cart cart) throws Exception
	{
		return updateCartClient( cart,  null);
	}

	/**
	 * Update the current shopper's cart.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=UpdateCartClient( cart,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param cart Properties of a shopping cart.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> updateCartClient(com.mozu.api.contracts.commerceruntime.carts.Cart cart, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CartUrl.updateCartUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.Cart.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(cart);
		return mozuClient;

	}

	/**
	 * Deletes the cart specified in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCartClient( cartId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCartClient(String cartId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CartUrl.deleteCartUrl(cartId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Deletes the cart of the currently active shopper.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCurrentCartClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCurrentCartClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CartUrl.deleteCurrentCartUrl();
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



