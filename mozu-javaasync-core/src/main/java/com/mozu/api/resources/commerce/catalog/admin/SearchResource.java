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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * The Search resource manages all settings and options for providing product search on your site.
 * </summary>
 */
public class SearchResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public SearchResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Get site search settings
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchSettings searchSettings = search.getSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public com.mozu.api.contracts.productadmin.SearchSettings getSettings() throws Exception
	{
		return getSettings( null);
	}

	/**
	 * Get site search settings
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	CountDownLatch latch = search.getSettings( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public CountDownLatch getSettingsAsync( AsyncCallback<com.mozu.api.contracts.productadmin.SearchSettings> callback) throws Exception
	{
		return getSettingsAsync( null, callback);
	}

	/**
	 * Get site search settings
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchSettings searchSettings = search.getSettings( responseFields);
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public com.mozu.api.contracts.productadmin.SearchSettings getSettings(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSettingsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Get site search settings
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	CountDownLatch latch = search.getSettings( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public CountDownLatch getSettingsAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.SearchSettings> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSettingsClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Adds or Updates (Upsert) the Search Settings for a specific site
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchSettings searchSettings = search.updateSettings( settings);
	 * </code></pre></p>
	 * @param settings The settings to control product search and indexing behavior.
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public com.mozu.api.contracts.productadmin.SearchSettings updateSettings(com.mozu.api.contracts.productadmin.SearchSettings settings) throws Exception
	{
		return updateSettings( settings,  null);
	}

	/**
	 * Adds or Updates (Upsert) the Search Settings for a specific site
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	CountDownLatch latch = search.updateSettings( settings, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param settings The settings to control product search and indexing behavior.
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public CountDownLatch updateSettingsAsync(com.mozu.api.contracts.productadmin.SearchSettings settings, AsyncCallback<com.mozu.api.contracts.productadmin.SearchSettings> callback) throws Exception
	{
		return updateSettingsAsync( settings,  null, callback);
	}

	/**
	 * Adds or Updates (Upsert) the Search Settings for a specific site
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchSettings searchSettings = search.updateSettings( settings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param settings The settings to control product search and indexing behavior.
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public com.mozu.api.contracts.productadmin.SearchSettings updateSettings(com.mozu.api.contracts.productadmin.SearchSettings settings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.updateSettingsClient( settings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds or Updates (Upsert) the Search Settings for a specific site
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	CountDownLatch latch = search.updateSettings( settings,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param  callback callback handler for asynchronous operations
	 * @param settings The settings to control product search and indexing behavior.
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public CountDownLatch updateSettingsAsync(com.mozu.api.contracts.productadmin.SearchSettings settings, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.SearchSettings> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.updateSettingsClient( settings,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



