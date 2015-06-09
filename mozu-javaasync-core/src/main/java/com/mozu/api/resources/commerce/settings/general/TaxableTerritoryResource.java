/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings.general;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
import java.util.concurrent.CountDownLatch;

/** <summary>
 * Use the taxable territories subresource to manage the regional territories for this site that are subejct to sales tax.
 * </summary>
 */
public class TaxableTerritoryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public TaxableTerritoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of the taxable territories configured for the site.
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	TaxableTerritory taxableTerritory = taxableterritory.getTaxableTerritories();
	 * </code></pre></p>
	 * @return List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> getTaxableTerritories() throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> client = com.mozu.api.clients.commerce.settings.general.TaxableTerritoryClient.getTaxableTerritoriesClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of the taxable territories configured for the site.
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	CountDownLatch latch = taxableterritory.getTaxableTerritories( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public CountDownLatch getTaxableTerritoriesAsync( AsyncCallback<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> client = com.mozu.api.clients.commerce.settings.general.TaxableTerritoryClient.getTaxableTerritoriesClient();
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a new territory for which to calculate sales tax.
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	TaxableTerritory taxableTerritory = taxableterritory.addTaxableTerritory( taxableTerritory);
	 * </code></pre></p>
	 * @param taxableTerritory Properties of the territory which is subject to sales tax.
	 * @return com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public com.mozu.api.contracts.sitesettings.general.TaxableTerritory addTaxableTerritory(com.mozu.api.contracts.sitesettings.general.TaxableTerritory taxableTerritory) throws Exception
	{
		return addTaxableTerritory( taxableTerritory,  null);
	}

	/**
	 * Creates a new territory for which to calculate sales tax.
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	CountDownLatch latch = taxableterritory.addTaxableTerritory( taxableTerritory, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param taxableTerritory Properties of the territory which is subject to sales tax.
	 * @return com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public CountDownLatch addTaxableTerritoryAsync(com.mozu.api.contracts.sitesettings.general.TaxableTerritory taxableTerritory, AsyncCallback<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> callback) throws Exception
	{
		return addTaxableTerritoryAsync( taxableTerritory,  null, callback);
	}

	/**
	 * Creates a new territory for which to calculate sales tax.
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	TaxableTerritory taxableTerritory = taxableterritory.addTaxableTerritory( taxableTerritory,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param taxableTerritory Properties of the territory which is subject to sales tax.
	 * @return com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public com.mozu.api.contracts.sitesettings.general.TaxableTerritory addTaxableTerritory(com.mozu.api.contracts.sitesettings.general.TaxableTerritory taxableTerritory, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> client = com.mozu.api.clients.commerce.settings.general.TaxableTerritoryClient.addTaxableTerritoryClient( taxableTerritory,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new territory for which to calculate sales tax.
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	CountDownLatch latch = taxableterritory.addTaxableTerritory( taxableTerritory,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param taxableTerritory Properties of the territory which is subject to sales tax.
	 * @return com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public CountDownLatch addTaxableTerritoryAsync(com.mozu.api.contracts.sitesettings.general.TaxableTerritory taxableTerritory, String responseFields, AsyncCallback<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> client = com.mozu.api.clients.commerce.settings.general.TaxableTerritoryClient.addTaxableTerritoryClient( taxableTerritory,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates one or more taxable territories configured for a site.
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	TaxableTerritory taxableTerritory = taxableterritory.updateTaxableTerritories( taxableterritories);
	 * </code></pre></p>
	 * @param taxableterritories Properties of the territory which is subject to sales tax.
	 * @return List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> updateTaxableTerritories(List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> taxableterritories) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> client = com.mozu.api.clients.commerce.settings.general.TaxableTerritoryClient.updateTaxableTerritoriesClient( taxableterritories);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more taxable territories configured for a site.
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	CountDownLatch latch = taxableterritory.updateTaxableTerritories( taxableterritories, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param taxableterritories Properties of the territory which is subject to sales tax.
	 * @return List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public CountDownLatch updateTaxableTerritoriesAsync(List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> taxableterritories, AsyncCallback<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> client = com.mozu.api.clients.commerce.settings.general.TaxableTerritoryClient.updateTaxableTerritoriesClient( taxableterritories);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



