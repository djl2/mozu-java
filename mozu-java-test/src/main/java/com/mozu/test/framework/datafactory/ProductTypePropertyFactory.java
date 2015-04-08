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
import com.mozu.api.resources.commerce.catalog.admin.attributedefinition.producttypes.ProductTypePropertyResource;

/** <summary>
 * Use the Properties subresource to define how property product attributes are used for a specific product type. Product attribute definitions are unique for each associated product type.
 * </summary>
 */
public class ProductTypePropertyFactory
{

	public static List<com.mozu.api.contracts.productadmin.AttributeInProductType> getProperties(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.AttributeInProductType> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>();
		ProductTypePropertyResource resource = new ProductTypePropertyResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProperties( productTypeId);
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

	public static com.mozu.api.contracts.productadmin.AttributeInProductType getProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		return getProperty(apiContext, dataViewMode,  productTypeId,  attributeFQN,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.AttributeInProductType getProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeInProductType returnObj = new com.mozu.api.contracts.productadmin.AttributeInProductType();
		ProductTypePropertyResource resource = new ProductTypePropertyResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProperty( productTypeId,  attributeFQN,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.AttributeInProductType addProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, int expectedCode, int successCode) throws Exception
	{
		return addProperty(apiContext, dataViewMode,  attributeInProductType,  productTypeId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.AttributeInProductType addProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeInProductType returnObj = new com.mozu.api.contracts.productadmin.AttributeInProductType();
		ProductTypePropertyResource resource = new ProductTypePropertyResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.addProperty( attributeInProductType,  productTypeId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.AttributeInProductType updateProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		return updateProperty(apiContext, dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.AttributeInProductType updateProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeInProductType returnObj = new com.mozu.api.contracts.productadmin.AttributeInProductType();
		ProductTypePropertyResource resource = new ProductTypePropertyResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProperty( attributeInProductType,  productTypeId,  attributeFQN,  responseFields);
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

	public static void deleteProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		ProductTypePropertyResource resource = new ProductTypePropertyResource(apiContext, dataViewMode);
		try
		{
			resource.deleteProperty( productTypeId,  attributeFQN);
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



