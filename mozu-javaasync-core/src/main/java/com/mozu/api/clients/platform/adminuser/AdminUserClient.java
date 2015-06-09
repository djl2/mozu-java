/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.adminuser;

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
 * The Accounts resource displays the user accounts and account details associated with a developer or Mozu tenant administrator. Email addresses uniquely identify admin user accounts.
 * </summary>
 */
public class AdminUserClient {
	
	/**
	 * Retrieves a list of the Mozu tenants or development stores for which the specified user has an assigned role.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.tenant.TenantCollection> mozuClient=GetTenantScopesForUserClient( userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantCollection tenantCollection = client.Result();
	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.tenant.TenantCollection>
	 * @see com.mozu.api.contracts.tenant.TenantCollection
	 */
	public static MozuClient<com.mozu.api.contracts.tenant.TenantCollection> getTenantScopesForUserClient(String userId) throws Exception
	{
		return getTenantScopesForUserClient( userId,  null);
	}

	/**
	 * Retrieves a list of the Mozu tenants or development stores for which the specified user has an assigned role.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.tenant.TenantCollection> mozuClient=GetTenantScopesForUserClient( userId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantCollection tenantCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.tenant.TenantCollection>
	 * @see com.mozu.api.contracts.tenant.TenantCollection
	 */
	public static MozuClient<com.mozu.api.contracts.tenant.TenantCollection> getTenantScopesForUserClient(String userId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.getTenantScopesForUserUrl(responseFields, userId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.tenant.TenantCollection.class;
		MozuClient<com.mozu.api.contracts.tenant.TenantCollection> mozuClient = (MozuClient<com.mozu.api.contracts.tenant.TenantCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of the specified administrator user account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=GetUserClient( userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> getUserClient(String userId) throws Exception
	{
		return getUserClient( userId,  null);
	}

	/**
	 * Retrieves the details of the specified administrator user account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=GetUserClient( userId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> getUserClient(String userId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.getUserUrl(responseFields, userId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.User.class;
		MozuClient<com.mozu.api.contracts.core.User> mozuClient = (MozuClient<com.mozu.api.contracts.core.User>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



