/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.carts.CartItemResource;

/** <summary>
 * Use the Cart Items subresource to manage a collection of items in an active shopping cart.
 * </summary>
 */
public class CartItemFactory
{

	public static com.mozu.api.contracts.commerceruntime.carts.CartItem getCartItem(ApiContext apiContext, String cartItemId, int expectedCode, int successCode) throws Exception
	{
		return getCartItem(apiContext,  cartItemId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.carts.CartItem getCartItem(ApiContext apiContext, String cartItemId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.carts.CartItem returnObj = new com.mozu.api.contracts.commerceruntime.carts.CartItem();
		CartItemResource resource = new CartItemResource(apiContext);
		try
		{
			returnObj = resource.getCartItem( cartItemId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.carts.CartItemCollection getCartItems(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getCartItems(apiContext,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.carts.CartItemCollection getCartItems(ApiContext apiContext, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.carts.CartItemCollection returnObj = new com.mozu.api.contracts.commerceruntime.carts.CartItemCollection();
		CartItemResource resource = new CartItemResource(apiContext);
		try
		{
			returnObj = resource.getCartItems( responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.carts.CartItem addItemToCart(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, int expectedCode, int successCode) throws Exception
	{
		return addItemToCart(apiContext,  cartItem,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.carts.CartItem addItemToCart(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.carts.CartItem returnObj = new com.mozu.api.contracts.commerceruntime.carts.CartItem();
		CartItemResource resource = new CartItemResource(apiContext);
		try
		{
			returnObj = resource.addItemToCart( cartItem,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.carts.CartItem updateCartItemQuantity(ApiContext apiContext, String cartItemId, Integer quantity, int expectedCode, int successCode) throws Exception
	{
		return updateCartItemQuantity(apiContext,  cartItemId,  quantity,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.carts.CartItem updateCartItemQuantity(ApiContext apiContext, String cartItemId, Integer quantity, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.carts.CartItem returnObj = new com.mozu.api.contracts.commerceruntime.carts.CartItem();
		CartItemResource resource = new CartItemResource(apiContext);
		try
		{
			returnObj = resource.updateCartItemQuantity( cartItemId,  quantity,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.carts.CartItem updateCartItem(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String cartItemId, int expectedCode, int successCode) throws Exception
	{
		return updateCartItem(apiContext,  cartItem,  cartItemId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.carts.CartItem updateCartItem(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String cartItemId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.carts.CartItem returnObj = new com.mozu.api.contracts.commerceruntime.carts.CartItem();
		CartItemResource resource = new CartItemResource(apiContext);
		try
		{
			returnObj = resource.updateCartItem( cartItem,  cartItemId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.carts.Cart removeAllCartItems(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.carts.Cart returnObj = new com.mozu.api.contracts.commerceruntime.carts.Cart();
		CartItemResource resource = new CartItemResource(apiContext);
		try
		{
			returnObj = resource.removeAllCartItems();
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static void deleteCartItem(ApiContext apiContext, String cartItemId, int expectedCode, int successCode) throws Exception
	{
		CartItemResource resource = new CartItemResource(apiContext);
		try
		{
			resource.deleteCartItem( cartItemId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
	}

}



