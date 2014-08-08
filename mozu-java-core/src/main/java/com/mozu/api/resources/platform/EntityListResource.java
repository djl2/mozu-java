/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform;

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
public class EntityListResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public EntityListResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityListCollection entityListCollection = entitylist.GetEntityLists();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.mzdb.EntityListCollection
	 * @see com.mozu.api.contracts.mzdb.EntityListCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityListCollection getEntityLists() throws Exception
	{
		return getEntityLists( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityListCollection entityListCollection = entitylist.GetEntityLists( pageSize,  startIndex,  filter,  sortBy,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.mzdb.EntityListCollection
	 * @see com.mozu.api.contracts.mzdb.EntityListCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityListCollection getEntityLists(Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection> client = com.mozu.api.clients.platform.EntityListClient.getEntityListsClient( pageSize,  startIndex,  filter,  sortBy,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.GetEntityList( entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public com.mozu.api.contracts.mzdb.EntityList getEntityList(String entityListFullName) throws Exception
	{
		return getEntityList( entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.GetEntityList( entityListFullName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public com.mozu.api.contracts.mzdb.EntityList getEntityList(String entityListFullName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> client = com.mozu.api.clients.platform.EntityListClient.getEntityListClient( entityListFullName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.CreateEntityList( entityList);
	 * </code></pre></p>
	 * @param entityList 
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public com.mozu.api.contracts.mzdb.EntityList createEntityList(com.mozu.api.contracts.mzdb.EntityList entityList) throws Exception
	{
		return createEntityList( entityList,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.CreateEntityList( entityList,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param entityList 
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public com.mozu.api.contracts.mzdb.EntityList createEntityList(com.mozu.api.contracts.mzdb.EntityList entityList, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> client = com.mozu.api.clients.platform.EntityListClient.createEntityListClient( entityList,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.UpdateEntityList( entityList,  entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param entityList 
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public com.mozu.api.contracts.mzdb.EntityList updateEntityList(com.mozu.api.contracts.mzdb.EntityList entityList, String entityListFullName) throws Exception
	{
		return updateEntityList( entityList,  entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.UpdateEntityList( entityList,  entityListFullName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields 
	 * @param entityList 
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public com.mozu.api.contracts.mzdb.EntityList updateEntityList(com.mozu.api.contracts.mzdb.EntityList entityList, String entityListFullName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> client = com.mozu.api.clients.platform.EntityListClient.updateEntityListClient( entityList,  entityListFullName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



