/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.entitylists;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class ListViewResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public ListViewResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListViewCollection listViewCollection = listview.GetEntityListViews( entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @return com.mozu.api.contracts.mzdb.ListViewCollection
	 * @see com.mozu.api.contracts.mzdb.ListViewCollection
	 */
	public com.mozu.api.contracts.mzdb.ListViewCollection getEntityListViews(String entityListFullName) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getEntityListViewsClient( entityListFullName);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.GetEntityListView( entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView getEntityListView(String entityListFullName, String viewName) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListView> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getEntityListViewClient( entityListFullName,  viewName);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	JObject jObject = listview.GetViewEntity( entityListFullName,  viewName,  entityId);
	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param viewName 
	 * @return JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode getViewEntity(String entityListFullName, String viewName, String entityId) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntityClient( entityListFullName,  viewName,  entityId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityCollection entityCollection = listview.GetViewEntities( entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityCollection getViewEntities(String entityListFullName, String viewName) throws Exception
	{
		return getViewEntities( entityListFullName,  viewName,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityCollection entityCollection = listview.GetViewEntities( entityListFullName,  viewName,  pageSize,  startIndex,  filter);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param filter 
	 * @param pageSize 
	 * @param startIndex 
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityCollection getViewEntities(String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntitiesClient( entityListFullName,  viewName,  pageSize,  startIndex,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityContainer entityContainer = listview.GetViewEntityContainer( entityListFullName,  viewName,  entityId);
	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.EntityContainer
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public com.mozu.api.contracts.mzdb.EntityContainer getViewEntityContainer(String entityListFullName, String viewName, String entityId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntityContainerClient( entityListFullName,  viewName,  entityId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityContainerCollection entityContainerCollection = listview.GetViewEntityContainers( entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.EntityContainerCollection
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityContainerCollection getViewEntityContainers(String entityListFullName, String viewName) throws Exception
	{
		return getViewEntityContainers( entityListFullName,  viewName,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityContainerCollection entityContainerCollection = listview.GetViewEntityContainers( entityListFullName,  viewName,  pageSize,  startIndex,  filter);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param filter 
	 * @param pageSize 
	 * @param startIndex 
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.EntityContainerCollection
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityContainerCollection getViewEntityContainers(String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntityContainersClient( entityListFullName,  viewName,  pageSize,  startIndex,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.CreateEntityListView( listView,  entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param listView 
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView createEntityListView(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListView> client = com.mozu.api.clients.platform.entitylists.ListViewClient.createEntityListViewClient( listView,  entityListFullName);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.UpdateEntityListView( listView,  entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @param listView 
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView updateEntityListView(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String viewName) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListView> client = com.mozu.api.clients.platform.entitylists.ListViewClient.updateEntityListViewClient( listView,  entityListFullName,  viewName);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	listview.DeleteEntityListView( entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @return 
	 */
	public void deleteEntityListView(String entityListFullName, String viewName) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.entitylists.ListViewClient.deleteEntityListViewClient( entityListFullName,  viewName);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



