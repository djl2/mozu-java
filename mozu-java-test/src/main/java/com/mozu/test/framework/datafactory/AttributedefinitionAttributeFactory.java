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
import com.mozu.api.resources.commerce.catalog.admin.attributedefinition.AttributeResource;

/** <summary>
 * Use the Attribute Definition resource to manage the properties, options, and extras that uniquely describe products of a specific type. Attributes can be associated with a product type, assigned values by a client or shopper, and added as faceted search filters for a product category. Options are product attributes that describe unique configurations made by the shopper, such as size or color, and generate a new product variation (or unique SKU). Properties are product attributes that describe aspects of the product that do not represent an option configurable by the shopper, such as screen resolution or brand. Extras are product attributes that describe add-on configurations made by the shopper that do not represent a product variation, such as a monogram.
 * </summary>
 */
public class AttributedefinitionAttributeFactory
{

	public static com.mozu.api.contracts.productadmin.AttributeCollection getAttributes(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getAttributes(apiContext,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.AttributeCollection getAttributes(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeCollection returnObj = new com.mozu.api.contracts.productadmin.AttributeCollection();
		AttributeResource resource = new AttributeResource(apiContext);
		try
		{
			returnObj = resource.getAttributes( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Attribute getAttribute(ApiContext apiContext, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		return getAttribute(apiContext,  attributeFQN,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.Attribute getAttribute(ApiContext apiContext, String attributeFQN, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Attribute returnObj = new com.mozu.api.contracts.productadmin.Attribute();
		AttributeResource resource = new AttributeResource(apiContext);
		try
		{
			returnObj = resource.getAttribute( attributeFQN,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Attribute addAttribute(ApiContext apiContext, com.mozu.api.contracts.productadmin.Attribute attribute, int expectedCode, int successCode) throws Exception
	{
		return addAttribute(apiContext,  attribute,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.Attribute addAttribute(ApiContext apiContext, com.mozu.api.contracts.productadmin.Attribute attribute, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Attribute returnObj = new com.mozu.api.contracts.productadmin.Attribute();
		AttributeResource resource = new AttributeResource(apiContext);
		try
		{
			returnObj = resource.addAttribute( attribute,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Attribute updateAttribute(ApiContext apiContext, com.mozu.api.contracts.productadmin.Attribute attribute, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		return updateAttribute(apiContext,  attribute,  attributeFQN,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.Attribute updateAttribute(ApiContext apiContext, com.mozu.api.contracts.productadmin.Attribute attribute, String attributeFQN, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Attribute returnObj = new com.mozu.api.contracts.productadmin.Attribute();
		AttributeResource resource = new AttributeResource(apiContext);
		try
		{
			returnObj = resource.updateAttribute( attribute,  attributeFQN,  responseFields);
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

	public static void deleteAttribute(ApiContext apiContext, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		AttributeResource resource = new AttributeResource(apiContext);
		try
		{
			resource.deleteAttribute( attributeFQN);
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



