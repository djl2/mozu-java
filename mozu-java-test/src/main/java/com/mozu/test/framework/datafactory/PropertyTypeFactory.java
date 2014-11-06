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
import com.mozu.api.resources.content.PropertyTypeResource;

/** <summary>
 * Use the property types subresource to manage content properties.
 * </summary>
 */
public class PropertyTypeFactory
{

	public static com.mozu.api.contracts.content.PropertyTypeCollection getPropertyTypes(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode, int successCode) throws Exception
	{
		return getPropertyTypes(apiContext, dataViewMode,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.content.PropertyTypeCollection getPropertyTypes(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer pageSize, Integer startIndex, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.content.PropertyTypeCollection returnObj = new com.mozu.api.contracts.content.PropertyTypeCollection();
		PropertyTypeResource resource = new PropertyTypeResource(apiContext);
		try
		{
			returnObj = resource.getPropertyTypes(dataViewMode,  pageSize,  startIndex);
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

	public static com.mozu.api.contracts.content.PropertyType getPropertyType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String propertyTypeName, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.content.PropertyType returnObj = new com.mozu.api.contracts.content.PropertyType();
		PropertyTypeResource resource = new PropertyTypeResource(apiContext);
		try
		{
			returnObj = resource.getPropertyType(dataViewMode,  propertyTypeName);
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

	public static List<com.mozu.api.contracts.content.PropertyValueType> propertyValueTypes(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.content.PropertyValueType> returnObj = new ArrayList<com.mozu.api.contracts.content.PropertyValueType>();
		PropertyTypeResource resource = new PropertyTypeResource(apiContext);
		try
		{
			returnObj = resource.propertyValueTypes(dataViewMode);
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

}


