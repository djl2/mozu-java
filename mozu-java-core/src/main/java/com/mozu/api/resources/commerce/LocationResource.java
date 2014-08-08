/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Location resource to retrieve details about a location from a Mozu hosted storefront.
 * </summary>
 */
public class LocationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public LocationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the details of the location specified in the request.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.GetLocation( code);
	 * </code></pre></p>
	 * @param code User-defined code that identifies the location.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getLocation(String code) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.LocationClient.getLocationClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a location associated with a defined location usage type for the site specified in the request.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.GetLocationInUsageType( locationUsageType,  code);
	 * </code></pre></p>
	 * @param code Retrieves the details of a location associated with a defined location usage type for the site specified in the request.
	 * @param locationUsageType System-defined location usage type code, which is DS for direct ship, SP for in-store pickup, or storeFinder.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getLocationInUsageType(String locationUsageType, String code) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.LocationClient.getLocationInUsageTypeClient( locationUsageType,  code);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of the locations configured for a specified location usage type for the specified site, according to any defined filter or sort criteria.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.GetLocationsInUsageType( locationUsageType);
	 * </code></pre></p>
	 * @param locationUsageType System-defined location usage type code, which is DS for direct ship, SP for in-store pickup, or storeFinder.
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getLocationsInUsageType(String locationUsageType) throws Exception
	{
		return getLocationsInUsageType( locationUsageType,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of the locations configured for a specified location usage type for the specified site, according to any defined filter or sort criteria.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.GetLocationsInUsageType( locationUsageType,  startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param locationUsageType System-defined location usage type code, which is DS for direct ship, SP for in-store pickup, or storeFinder.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getLocationsInUsageType(String locationUsageType, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationCollection> client = com.mozu.api.clients.commerce.LocationClient.getLocationsInUsageTypeClient( locationUsageType,  startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the location configured for the direct shipping (DS) location usage type for the site specified in the request. This location acts as an origin address from which order packages will ship, as well as the location where product reservations are created when order items are submitted with the direct ship fulfillment type (DS). If the direct ship location usage type is not configured for this site, the operation returns an error.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.GetDirectShipLocation();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getDirectShipLocation() throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.LocationClient.getDirectShipLocationClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the location configured for the in-store pickup (SP) location usage type for the site specified in the request. If the location is not associated with a location type configured for the in-store pickup location usage type (SP), the operation returns an error.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.GetInStorePickupLocation( code);
	 * </code></pre></p>
	 * @param code The user-defined code that identifies the location to retrieve.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getInStorePickupLocation(String code) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.LocationClient.getInStorePickupLocationClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of locations valid for in-store pickup of an item in an order according to any filter and sort criteria. For example, an application could use this operation to provide a store finder feature based on the shopper's GPS coordinates. If the location types for the in-store pickup location usage type are not configured for the site, this operation returns an error.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.GetInStorePickupLocations();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getInStorePickupLocations() throws Exception
	{
		return getInStorePickupLocations( null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of locations valid for in-store pickup of an item in an order according to any filter and sort criteria. For example, an application could use this operation to provide a store finder feature based on the shopper's GPS coordinates. If the location types for the in-store pickup location usage type are not configured for the site, this operation returns an error.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.GetInStorePickupLocations( startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getInStorePickupLocations(Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationCollection> client = com.mozu.api.clients.commerce.LocationClient.getInStorePickupLocationsClient( startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



