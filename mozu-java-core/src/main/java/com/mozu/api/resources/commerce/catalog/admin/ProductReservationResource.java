/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
import com.mozu.api.DataViewMode;
/** <summary>
 * Temporarily hold a product from inventory while a shopper is filling out payment information. Create a product reservation when a shopper proceeds to check out and then release the reservation when the order process is complete.
 * </summary>
 */
public class ProductReservationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ProductReservationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ProductReservationResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves a list of product reservations according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservationCollection productReservationCollection = productreservation.GetProductReservations(_dataViewMode);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductReservationCollection
	 * @see com.mozu.api.contracts.productadmin.ProductReservationCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductReservationCollection getProductReservations() throws Exception
	{
		return getProductReservations( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of product reservations according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservationCollection productReservationCollection = productreservation.GetProductReservations(_dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductReservationCollection
	 * @see com.mozu.api.contracts.productadmin.ProductReservationCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductReservationCollection getProductReservations(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection> client = com.mozu.api.clients.commerce.catalog.admin.ProductReservationClient.getProductReservationsClient(_dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a product reservation.
	 * <p><pre><code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservation productReservation = productreservation.GetProductReservation(_dataViewMode,  productReservationId);
	 * </code></pre></p>
	 * @param productReservationId Unique identifier of the product reservation.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public com.mozu.api.contracts.productadmin.ProductReservation getProductReservation(Integer productReservationId) throws Exception
	{
		return getProductReservation( productReservationId,  null);
	}

	/**
	 * Retrieves the details of a product reservation.
	 * <p><pre><code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservation productReservation = productreservation.GetProductReservation(_dataViewMode,  productReservationId,  responseFields);
	 * </code></pre></p>
	 * @param productReservationId Unique identifier of the product reservation.
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public com.mozu.api.contracts.productadmin.ProductReservation getProductReservation(Integer productReservationId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductReservation> client = com.mozu.api.clients.commerce.catalog.admin.ProductReservationClient.getProductReservationClient(_dataViewMode,  productReservationId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new product reservation for a product. This action places a hold on the product inventory for the quantity specified during the ordering process.
	 * <p><pre><code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservation productReservation = productreservation.AddProductReservations( productReservations);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param productReservations Details of the product reservations to add.
	 * @return List<com.mozu.api.contracts.productadmin.ProductReservation>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public List<com.mozu.api.contracts.productadmin.ProductReservation> addProductReservations(List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations) throws Exception
	{
		return addProductReservations( productReservations,  null);
	}

	/**
	 * Creates a new product reservation for a product. This action places a hold on the product inventory for the quantity specified during the ordering process.
	 * <p><pre><code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservation productReservation = productreservation.AddProductReservations( productReservations,  skipInventoryCheck);
	 * </code></pre></p>
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param dataViewMode DataViewMode
	 * @param productReservations Details of the product reservations to add.
	 * @return List<com.mozu.api.contracts.productadmin.ProductReservation>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public List<com.mozu.api.contracts.productadmin.ProductReservation> addProductReservations(List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations, Boolean skipInventoryCheck) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> client = com.mozu.api.clients.commerce.catalog.admin.ProductReservationClient.addProductReservationsClient( productReservations,  skipInventoryCheck);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Commits a product reservation to decrement the product's inventory by the quantity specified then release the reservation once the order process completed successfully.
	 * <p><pre><code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	productreservation.CommitReservations( productReservations);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param productReservations List of unique identifiers of the reservations to commit.
	 * @return 
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public void commitReservations(List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.ProductReservationClient.commitReservationsClient( productReservations);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * Updates an existing product reservation for a product.
	 * <p><pre><code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservation productReservation = productreservation.UpdateProductReservations( productReservations);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param productReservations Properties of the product reservations to update.
	 * @return List<com.mozu.api.contracts.productadmin.ProductReservation>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public List<com.mozu.api.contracts.productadmin.ProductReservation> updateProductReservations(List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations) throws Exception
	{
		return updateProductReservations( productReservations,  null);
	}

	/**
	 * Updates an existing product reservation for a product.
	 * <p><pre><code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservation productReservation = productreservation.UpdateProductReservations( productReservations,  skipInventoryCheck);
	 * </code></pre></p>
	 * @param skipInventoryCheck If true, skip the inventory validation process when updating this product reservation.
	 * @param dataViewMode DataViewMode
	 * @param productReservations Properties of the product reservations to update.
	 * @return List<com.mozu.api.contracts.productadmin.ProductReservation>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public List<com.mozu.api.contracts.productadmin.ProductReservation> updateProductReservations(List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations, Boolean skipInventoryCheck) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> client = com.mozu.api.clients.commerce.catalog.admin.ProductReservationClient.updateProductReservationsClient( productReservations,  skipInventoryCheck);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a product reservation. For example, delete a reservation when an order is not processed to return the product quantity back to inventory.
	 * <p><pre><code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	productreservation.DeleteProductReservation( productReservationId);
	 * </code></pre></p>
	 * @param productReservationId Unique identifier of the reservation.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteProductReservation(Integer productReservationId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.ProductReservationClient.deleteProductReservationClient( productReservationId);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



