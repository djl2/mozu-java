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
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
/** <summary>
 * 
 * </summary>
 */
public class SoftAllocationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public SoftAllocationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	SoftAllocation softallocation = new SoftAllocation();
	 *	SoftAllocationCollection softAllocationCollection = softallocation.getSoftAllocations();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.SoftAllocationCollection
	 * @see com.mozu.api.contracts.productadmin.SoftAllocationCollection
	 */
	public com.mozu.api.contracts.productadmin.SoftAllocationCollection getSoftAllocations() throws Exception
	{
		return getSoftAllocations( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	SoftAllocation softallocation = new SoftAllocation();
	 *	SoftAllocationCollection softAllocationCollection = softallocation.getSoftAllocations( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.SoftAllocationCollection
	 * @see com.mozu.api.contracts.productadmin.SoftAllocationCollection
	 */
	public com.mozu.api.contracts.productadmin.SoftAllocationCollection getSoftAllocations(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.SoftAllocationCollection> client = com.mozu.api.clients.commerce.catalog.admin.SoftAllocationClient.getSoftAllocationsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SoftAllocation softallocation = new SoftAllocation();
	 *	SoftAllocation softAllocation = softallocation.getSoftAllocation( softAllocationId);
	 * </code></pre></p>
	 * @param softAllocationId 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.SoftAllocation
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 */
	public com.mozu.api.contracts.productadmin.SoftAllocation getSoftAllocation(Integer softAllocationId) throws Exception
	{
		return getSoftAllocation( softAllocationId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	SoftAllocation softallocation = new SoftAllocation();
	 *	SoftAllocation softAllocation = softallocation.getSoftAllocation( softAllocationId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param softAllocationId 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.SoftAllocation
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 */
	public com.mozu.api.contracts.productadmin.SoftAllocation getSoftAllocation(Integer softAllocationId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.SoftAllocation> client = com.mozu.api.clients.commerce.catalog.admin.SoftAllocationClient.getSoftAllocationClient( softAllocationId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SoftAllocation softallocation = new SoftAllocation();
	 *	SoftAllocation softAllocation = softallocation.addSoftAllocations( softAllocationsIn);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param softAllocationsIn 
	 * @return List<com.mozu.api.contracts.productadmin.SoftAllocation>
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 */
	public List<com.mozu.api.contracts.productadmin.SoftAllocation> addSoftAllocations(List<com.mozu.api.contracts.productadmin.SoftAllocation> softAllocationsIn) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> client = com.mozu.api.clients.commerce.catalog.admin.SoftAllocationClient.addSoftAllocationsClient( softAllocationsIn);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SoftAllocation softallocation = new SoftAllocation();
	 *	ProductReservation productReservation = softallocation.convertToProductReservation( softAllocations);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param softAllocations 
	 * @return List<com.mozu.api.contracts.productadmin.ProductReservation>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 */
	public List<com.mozu.api.contracts.productadmin.ProductReservation> convertToProductReservation(List<com.mozu.api.contracts.productadmin.SoftAllocation> softAllocations) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> client = com.mozu.api.clients.commerce.catalog.admin.SoftAllocationClient.convertToProductReservationClient( softAllocations);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SoftAllocation softallocation = new SoftAllocation();
	 *	SoftAllocation softAllocation = softallocation.updateSoftAllocations( softAllocations);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param softAllocations 
	 * @return List<com.mozu.api.contracts.productadmin.SoftAllocation>
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 */
	public List<com.mozu.api.contracts.productadmin.SoftAllocation> updateSoftAllocations(List<com.mozu.api.contracts.productadmin.SoftAllocation> softAllocations) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> client = com.mozu.api.clients.commerce.catalog.admin.SoftAllocationClient.updateSoftAllocationsClient( softAllocations);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SoftAllocation softallocation = new SoftAllocation();
	 *	softallocation.deleteSoftAllocation( softAllocationId);
	 * </code></pre></p>
	 * @param softAllocationId 
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteSoftAllocation(Integer softAllocationId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.SoftAllocationClient.deleteSoftAllocationClient( softAllocationId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



