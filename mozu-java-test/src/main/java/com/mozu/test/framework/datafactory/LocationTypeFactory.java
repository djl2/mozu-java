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
import com.mozu.api.resources.commerce.admin.LocationTypeResource;

/** <summary>
 * 
 * </summary>
 */
public class LocationTypeFactory
{

	public static List<com.mozu.api.contracts.location.LocationType> getLocationTypes(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.location.LocationType> returnObj = new ArrayList<com.mozu.api.contracts.location.LocationType>();
		LocationTypeResource resource = new LocationTypeResource(apiContext);
		try
		{
			returnObj = resource.getLocationTypes();
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

	public static com.mozu.api.contracts.location.LocationType getLocationType(ApiContext apiContext, String locationTypeCode, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationType returnObj = new com.mozu.api.contracts.location.LocationType();
		LocationTypeResource resource = new LocationTypeResource(apiContext);
		try
		{
			returnObj = resource.getLocationType( locationTypeCode);
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

	public static com.mozu.api.contracts.location.LocationType addLocationType(ApiContext apiContext, com.mozu.api.contracts.location.LocationType locationType, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationType returnObj = new com.mozu.api.contracts.location.LocationType();
		LocationTypeResource resource = new LocationTypeResource(apiContext);
		try
		{
			returnObj = resource.addLocationType( locationType);
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

	public static com.mozu.api.contracts.location.LocationType updateLocationType(ApiContext apiContext, com.mozu.api.contracts.location.LocationType locationType, String locationTypeCode, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationType returnObj = new com.mozu.api.contracts.location.LocationType();
		LocationTypeResource resource = new LocationTypeResource(apiContext);
		try
		{
			returnObj = resource.updateLocationType( locationType,  locationTypeCode);
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

	public static void deleteLocationType(ApiContext apiContext, String locationTypeCode, int expectedCode, int successCode) throws Exception
	{
				LocationTypeResource resource = new LocationTypeResource(apiContext);
		try
		{
			resource.deleteLocationType( locationTypeCode);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");

	}

}


