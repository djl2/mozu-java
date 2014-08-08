/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.entitylists;

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
public class EntityContainerClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient=GetEntityContainerClient( entityListFullName,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainer entityContainer = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainer>
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> getEntityContainerClient(String entityListFullName, String id) throws Exception
	{
		return getEntityContainerClient( entityListFullName,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient=GetEntityContainerClient( entityListFullName,  id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainer entityContainer = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainer>
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> getEntityContainerClient(String entityListFullName, String id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityContainerUrl.getEntityContainerUrl(entityListFullName, id, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityContainer.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient=GetEntityContainersClient( entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainerCollection entityContainerCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainerCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> getEntityContainersClient(String entityListFullName) throws Exception
	{
		return getEntityContainersClient( entityListFullName,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient=GetEntityContainersClient( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainerCollection entityContainerCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainerCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> getEntityContainersClient(String entityListFullName, Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityContainerUrl.getEntityContainersUrl(entityListFullName, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityContainerCollection.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



