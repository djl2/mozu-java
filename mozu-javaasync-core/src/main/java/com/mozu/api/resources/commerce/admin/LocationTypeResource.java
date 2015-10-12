/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.admin;

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
 * Use the Location Types resource to manage the types of locations your tenant maintains, such as warehouses, physical storefronts, and kiosks.
 * </summary>
 */
public class LocationTypeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public LocationTypeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieve a list of all location types defined for the tenant.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	LocationType locationType = locationtype.getLocationTypes();
	 * </code></pre></p>
	 * @return List<com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public List<com.mozu.api.contracts.location.LocationType> getLocationTypes() throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.location.LocationType>> client = com.mozu.api.clients.commerce.admin.LocationTypeClient.getLocationTypesClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieve a list of all location types defined for the tenant.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	CountDownLatch latch = locationtype.getLocationTypes( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public CountDownLatch getLocationTypesAsync( AsyncCallback<List<com.mozu.api.contracts.location.LocationType>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.location.LocationType>> client = com.mozu.api.clients.commerce.admin.LocationTypeClient.getLocationTypesClient();
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves the details of the location type specified in the request.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	LocationType locationType = locationtype.getLocationType( locationTypeCode);
	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public com.mozu.api.contracts.location.LocationType getLocationType(String locationTypeCode) throws Exception
	{
		return getLocationType( locationTypeCode,  null);
	}

	/**
	 * Retrieves the details of the location type specified in the request.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	CountDownLatch latch = locationtype.getLocationType( locationTypeCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public CountDownLatch getLocationTypeAsync(String locationTypeCode, AsyncCallback<com.mozu.api.contracts.location.LocationType> callback) throws Exception
	{
		return getLocationTypeAsync( locationTypeCode,  null, callback);
	}

	/**
	 * Retrieves the details of the location type specified in the request.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	LocationType locationType = locationtype.getLocationType( locationTypeCode,  responseFields);
	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public com.mozu.api.contracts.location.LocationType getLocationType(String locationTypeCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationType> client = com.mozu.api.clients.commerce.admin.LocationTypeClient.getLocationTypeClient( locationTypeCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the location type specified in the request.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	CountDownLatch latch = locationtype.getLocationType( locationTypeCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public CountDownLatch getLocationTypeAsync(String locationTypeCode, String responseFields, AsyncCallback<com.mozu.api.contracts.location.LocationType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationType> client = com.mozu.api.clients.commerce.admin.LocationTypeClient.getLocationTypeClient( locationTypeCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a new location type based on the information specified in the request.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	LocationType locationType = locationtype.addLocationType( locationType);
	 * </code></pre></p>
	 * @param locationType Properties of a type of physical location, such as warehouse or kiosk. Location types enable tenants to group similar locations for filtering and location usage type definition.
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public com.mozu.api.contracts.location.LocationType addLocationType(com.mozu.api.contracts.location.LocationType locationType) throws Exception
	{
		return addLocationType( locationType,  null);
	}

	/**
	 * Creates a new location type based on the information specified in the request.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	CountDownLatch latch = locationtype.addLocationType( locationType, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param locationType Properties of a type of physical location, such as warehouse or kiosk. Location types enable tenants to group similar locations for filtering and location usage type definition.
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public CountDownLatch addLocationTypeAsync(com.mozu.api.contracts.location.LocationType locationType, AsyncCallback<com.mozu.api.contracts.location.LocationType> callback) throws Exception
	{
		return addLocationTypeAsync( locationType,  null, callback);
	}

	/**
	 * Creates a new location type based on the information specified in the request.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	LocationType locationType = locationtype.addLocationType( locationType,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param locationType Properties of a type of physical location, such as warehouse or kiosk. Location types enable tenants to group similar locations for filtering and location usage type definition.
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public com.mozu.api.contracts.location.LocationType addLocationType(com.mozu.api.contracts.location.LocationType locationType, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationType> client = com.mozu.api.clients.commerce.admin.LocationTypeClient.addLocationTypeClient( locationType,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new location type based on the information specified in the request.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	CountDownLatch latch = locationtype.addLocationType( locationType,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param locationType Properties of a type of physical location, such as warehouse or kiosk. Location types enable tenants to group similar locations for filtering and location usage type definition.
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public CountDownLatch addLocationTypeAsync(com.mozu.api.contracts.location.LocationType locationType, String responseFields, AsyncCallback<com.mozu.api.contracts.location.LocationType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationType> client = com.mozu.api.clients.commerce.admin.LocationTypeClient.addLocationTypeClient( locationType,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates the name of a defined location type.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	LocationType locationType = locationtype.updateLocationType( locationType,  locationTypeCode);
	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @param locationType Properties of a type of physical location, such as warehouse or kiosk. Location types enable tenants to group similar locations for filtering and location usage type definition.
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public com.mozu.api.contracts.location.LocationType updateLocationType(com.mozu.api.contracts.location.LocationType locationType, String locationTypeCode) throws Exception
	{
		return updateLocationType( locationType,  locationTypeCode,  null);
	}

	/**
	 * Updates the name of a defined location type.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	CountDownLatch latch = locationtype.updateLocationType( locationType,  locationTypeCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @param  callback callback handler for asynchronous operations
	 * @param locationType Properties of a type of physical location, such as warehouse or kiosk. Location types enable tenants to group similar locations for filtering and location usage type definition.
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public CountDownLatch updateLocationTypeAsync(com.mozu.api.contracts.location.LocationType locationType, String locationTypeCode, AsyncCallback<com.mozu.api.contracts.location.LocationType> callback) throws Exception
	{
		return updateLocationTypeAsync( locationType,  locationTypeCode,  null, callback);
	}

	/**
	 * Updates the name of a defined location type.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	LocationType locationType = locationtype.updateLocationType( locationType,  locationTypeCode,  responseFields);
	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param locationType Properties of a type of physical location, such as warehouse or kiosk. Location types enable tenants to group similar locations for filtering and location usage type definition.
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public com.mozu.api.contracts.location.LocationType updateLocationType(com.mozu.api.contracts.location.LocationType locationType, String locationTypeCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationType> client = com.mozu.api.clients.commerce.admin.LocationTypeClient.updateLocationTypeClient( locationType,  locationTypeCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the name of a defined location type.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	CountDownLatch latch = locationtype.updateLocationType( locationType,  locationTypeCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param locationType Properties of a type of physical location, such as warehouse or kiosk. Location types enable tenants to group similar locations for filtering and location usage type definition.
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public CountDownLatch updateLocationTypeAsync(com.mozu.api.contracts.location.LocationType locationType, String locationTypeCode, String responseFields, AsyncCallback<com.mozu.api.contracts.location.LocationType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationType> client = com.mozu.api.clients.commerce.admin.LocationTypeClient.updateLocationTypeClient( locationType,  locationTypeCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes the location type specified in the request.
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	locationtype.deleteLocationType( locationTypeCode);
	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @return 
	 */
	public void deleteLocationType(String locationTypeCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.admin.LocationTypeClient.deleteLocationTypeClient( locationTypeCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



