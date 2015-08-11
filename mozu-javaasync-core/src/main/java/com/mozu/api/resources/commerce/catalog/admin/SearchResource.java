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
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.getSearchTuningRule( searchTuningRuleCode);
	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule getSearchTuningRule(String searchTuningRuleCode) throws Exception
	{
		return getSearchTuningRule( searchTuningRuleCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	CountDownLatch latch = search.getSearchTuningRule( searchTuningRuleCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public CountDownLatch getSearchTuningRuleAsync(String searchTuningRuleCode, AsyncCallback<com.mozu.api.contracts.productadmin.search.SearchTuningRule> callback) throws Exception
	{
		return getSearchTuningRuleAsync( searchTuningRuleCode,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.getSearchTuningRule( searchTuningRuleCode,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleCode 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule getSearchTuningRule(String searchTuningRuleCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSearchTuningRuleClient( searchTuningRuleCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	CountDownLatch latch = search.getSearchTuningRule( searchTuningRuleCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleCode 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public CountDownLatch getSearchTuningRuleAsync(String searchTuningRuleCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.search.SearchTuningRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSearchTuningRuleClient( searchTuningRuleCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRuleCollection searchTuningRuleCollection = search.getSearchTuningRules();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection getSearchTuningRules() throws Exception
	{
		return getSearchTuningRules( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	CountDownLatch latch = search.getSearchTuningRules( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 */
	public CountDownLatch getSearchTuningRulesAsync( AsyncCallback<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> callback) throws Exception
	{
		return getSearchTuningRulesAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRuleCollection searchTuningRuleCollection = search.getSearchTuningRules( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection getSearchTuningRules(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSearchTuningRulesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	CountDownLatch latch = search.getSearchTuningRules( startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 */
	public CountDownLatch getSearchTuningRulesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSearchTuningRulesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

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
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.addSearchTuningRule( searchTuningRuleIn);
	 * </code></pre></p>
	 * @param searchTuningRuleIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule addSearchTuningRule(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn) throws Exception
	{
		return addSearchTuningRule( searchTuningRuleIn,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	CountDownLatch latch = search.addSearchTuningRule( searchTuningRuleIn, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param searchTuningRuleIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public CountDownLatch addSearchTuningRuleAsync(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, AsyncCallback<com.mozu.api.contracts.productadmin.search.SearchTuningRule> callback) throws Exception
	{
		return addSearchTuningRuleAsync( searchTuningRuleIn,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.addSearchTuningRule( searchTuningRuleIn,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule addSearchTuningRule(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.addSearchTuningRuleClient( searchTuningRuleIn,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	CountDownLatch latch = search.addSearchTuningRule( searchTuningRuleIn,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param searchTuningRuleIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public CountDownLatch addSearchTuningRuleAsync(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.search.SearchTuningRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.addSearchTuningRuleClient( searchTuningRuleIn,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.updateSearchTuningRule( searchTuningRuleIn,  searchTuningRuleCode);
	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @param searchTuningRuleIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule updateSearchTuningRule(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode) throws Exception
	{
		return updateSearchTuningRule( searchTuningRuleIn,  searchTuningRuleCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	CountDownLatch latch = search.updateSearchTuningRule( searchTuningRuleIn,  searchTuningRuleCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @param  callback callback handler for asynchronous operations
	 * @param searchTuningRuleIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public CountDownLatch updateSearchTuningRuleAsync(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode, AsyncCallback<com.mozu.api.contracts.productadmin.search.SearchTuningRule> callback) throws Exception
	{
		return updateSearchTuningRuleAsync( searchTuningRuleIn,  searchTuningRuleCode,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.updateSearchTuningRule( searchTuningRuleIn,  searchTuningRuleCode,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleCode 
	 * @param searchTuningRuleIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule updateSearchTuningRule(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.updateSearchTuningRuleClient( searchTuningRuleIn,  searchTuningRuleCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	CountDownLatch latch = search.updateSearchTuningRule( searchTuningRuleIn,  searchTuningRuleCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleCode 
	 * @param  callback callback handler for asynchronous operations
	 * @param searchTuningRuleIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public CountDownLatch updateSearchTuningRuleAsync(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.search.SearchTuningRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.updateSearchTuningRuleClient( searchTuningRuleIn,  searchTuningRuleCode,  responseFields);
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

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	search.deleteSearchTuningRule( searchTuningRuleCode);
	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @return 
	 */
	public void deleteSearchTuningRule(String searchTuningRuleCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.deleteSearchTuningRuleClient( searchTuningRuleCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}


