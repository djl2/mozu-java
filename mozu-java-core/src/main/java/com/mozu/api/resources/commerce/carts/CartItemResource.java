/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.carts;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Cart Items subresource to manage a collection of items in an active shopping cart.
 * </summary>
 */
public class CartItemResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CartItemResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a particular cart item by providing the cart item ID.
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.getCartItem( cartItemId);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem getCartItem(String cartItemId) throws Exception
	{
		return getCartItem( cartItemId,  null);
	}

	/**
	 * Retrieves a particular cart item by providing the cart item ID.
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.getCartItem( cartItemId,  responseFields);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem getCartItem(String cartItemId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> client = com.mozu.api.clients.commerce.carts.CartItemClient.getCartItemClient( cartItemId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of cart items including the total number of items in the cart.
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItemCollection cartItemCollection = cartitem.getCartItems();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItemCollection getCartItems() throws Exception
	{
		return getCartItems( null);
	}

	/**
	 * Retrieves a list of cart items including the total number of items in the cart.
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItemCollection cartItemCollection = cartitem.getCartItems( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItemCollection getCartItems(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection> client = com.mozu.api.clients.commerce.carts.CartItemClient.getCartItemsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a product to the current shopper's cart.
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.addItemToCart( cartItem);
	 * </code></pre></p>
	 * @param cartItem Properties of an item added to an active shopping cart.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem addItemToCart(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem) throws Exception
	{
		return addItemToCart( cartItem,  null);
	}

	/**
	 * Adds a product to the current shopper's cart.
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.addItemToCart( cartItem,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param cartItem Properties of an item added to an active shopping cart.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem addItemToCart(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> client = com.mozu.api.clients.commerce.carts.CartItemClient.addItemToCartClient( cartItem,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update the quantity of an individual cart item in the cart of the current shopper.
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.updateCartItemQuantity( cartItemId,  quantity);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem updateCartItemQuantity(String cartItemId, Integer quantity) throws Exception
	{
		return updateCartItemQuantity( cartItemId,  quantity,  null);
	}

	/**
	 * Update the quantity of an individual cart item in the cart of the current shopper.
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.updateCartItemQuantity( cartItemId,  quantity,  responseFields);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem updateCartItemQuantity(String cartItemId, Integer quantity, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> client = com.mozu.api.clients.commerce.carts.CartItemClient.updateCartItemQuantityClient( cartItemId,  quantity,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update the product or product quantity of an item in the current shopper's cart.
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.updateCartItem( cartItem,  cartItemId);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param cartItem Properties of an item added to an active shopping cart.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem updateCartItem(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String cartItemId) throws Exception
	{
		return updateCartItem( cartItem,  cartItemId,  null);
	}

	/**
	 * Update the product or product quantity of an item in the current shopper's cart.
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.updateCartItem( cartItem,  cartItemId,  responseFields);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param cartItem Properties of an item added to an active shopping cart.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem updateCartItem(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String cartItemId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> client = com.mozu.api.clients.commerce.carts.CartItemClient.updateCartItemClient( cartItem,  cartItemId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes all items in the current shopper's active cart.
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	Cart cart = cartitem.removeAllCartItems();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart removeAllCartItems() throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.carts.CartItemClient.removeAllCartItemsClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a specific cart item by providing the cart item ID.
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	cartitem.deleteCartItem( cartItemId);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @return 
	 */
	public void deleteCartItem(String cartItemId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.carts.CartItemClient.deleteCartItemClient( cartItemId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



