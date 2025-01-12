/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

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

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Location Inventory resource to manage the level of active product inventory maintained at each defined location, at the location level.
 * </summary>
 */
public class LocationInventoryClient {
	
	/**
	 * Retrieves the details of a product's active inventory at the location specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> mozuClient=GetLocationInventoryClient(dataViewMode,  locationCode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> getLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, String locationCode, String productCode) throws Exception
	{
		return getLocationInventoryClient(dataViewMode,  locationCode,  productCode,  null);
	}

	/**
	 * Retrieves the details of a product's active inventory at the location specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> mozuClient=GetLocationInventoryClient(dataViewMode,  locationCode,  productCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> getLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, String locationCode, String productCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.LocationInventoryUrl.getLocationInventoryUrl(locationCode, productCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.LocationInventory.class;
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.LocationInventory>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves a list of all product inventory definitions for the location code specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> mozuClient=GetLocationInventoriesClient(dataViewMode,  locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> getLocationInventoriesClient(com.mozu.api.DataViewMode dataViewMode, String locationCode) throws Exception
	{
		return getLocationInventoriesClient(dataViewMode,  locationCode,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of all product inventory definitions for the location code specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> mozuClient=GetLocationInventoriesClient(dataViewMode,  locationCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> getLocationInventoriesClient(com.mozu.api.DataViewMode dataViewMode, String locationCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.LocationInventoryUrl.getLocationInventoriesUrl(filter, locationCode, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.LocationInventoryCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Creates an array of product inventory definitions for the location specified in the request. When adding a new inventory definition, you must specify the productCode and stockOnHand value in each array you define. All other properties are system-supplied and read only.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> mozuClient=AddLocationInventoryClient(dataViewMode,  locationInventoryList,  locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryList Properties of an inventory definition that defines the level of inventory for a specific product at a given location.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.LocationInventory>>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> addLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode) throws Exception
	{
		return addLocationInventoryClient(dataViewMode,  locationInventoryList,  locationCode,  null);
	}

	/**
	 * Creates an array of product inventory definitions for the location specified in the request. When adding a new inventory definition, you must specify the productCode and stockOnHand value in each array you define. All other properties are system-supplied and read only.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> mozuClient=AddLocationInventoryClient(dataViewMode,  locationInventoryList,  locationCode,  performUpserts);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param performUpserts Query string parameter lets the service perform an update for a new or existing record. When run, the update occurs without throwing a conflict exception that the record exists. If true, the updates completes regardless of the record currently existing. By default, if no value is specified, the service assumes this value is false.
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryList Properties of an inventory definition that defines the level of inventory for a specific product at a given location.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.LocationInventory>>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> addLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode, Boolean performUpserts) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.LocationInventoryUrl.addLocationInventoryUrl(locationCode, performUpserts);
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.LocationInventory>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(locationInventoryList);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Updates the active stock on hand inventory of products for the location code specified in the request.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> mozuClient=UpdateLocationInventoryClient(dataViewMode,  locationInventoryAdjustments,  locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryAdjustments Properties of an adjustment to the active product inventory of a specific location.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.LocationInventory>>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryAdjustment
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> updateLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventoryAdjustment> locationInventoryAdjustments, String locationCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.LocationInventoryUrl.updateLocationInventoryUrl(locationCode);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.LocationInventory>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(locationInventoryAdjustments);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Deletes the product code inventory definition for the location specified in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteLocationInventoryClient(dataViewMode,  locationCode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, String locationCode, String productCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.LocationInventoryUrl.deleteLocationInventoryUrl(locationCode, productCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



