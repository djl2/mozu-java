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
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Admin User authentication tickets resource to generate and refresh authentication tickets that enable Mozu administrator or developer account users to access development or production tenants.
 * </summary>
 */
public class TenantAdminUserAuthTicketClient {
	
	/**
	 * Creates an authentication ticket for the supplied user to specify in API requests associated with the supplied tenant.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> mozuClient=CreateUserAuthTicketClient( userAuthInfo);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantAdminUserAuthTicket tenantAdminUserAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param userAuthInfo Information required to authenticate a user.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket>
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> createUserAuthTicketClient(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo) throws Exception
	{
		return createUserAuthTicketClient( userAuthInfo,  null,  null);
	}

	/**
	 * Creates an authentication ticket for the supplied user to specify in API requests associated with the supplied tenant.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> mozuClient=CreateUserAuthTicketClient( userAuthInfo,  tenantId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantAdminUserAuthTicket tenantAdminUserAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param tenantId Unique identifier of the development or production tenant for which to generate the user authentication ticket.
	 * @param userAuthInfo Information required to authenticate a user.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket>
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> createUserAuthTicketClient(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo, Integer tenantId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.TenantAdminUserAuthTicketUrl.createUserAuthTicketUrl(responseFields, tenantId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket.class;
		MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> mozuClient = (MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(userAuthInfo);
		return mozuClient;

	}

	/**
	 * Generates a new user authentication ticket for the specified tenant by supplying the user's existing refresh token information.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> mozuClient=RefreshAuthTicketClient( existingAuthTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantAdminUserAuthTicket tenantAdminUserAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param existingAuthTicket Properties of the authentication ticket to be used in user claims with the Mozu API.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket>
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> refreshAuthTicketClient(com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket existingAuthTicket) throws Exception
	{
		return refreshAuthTicketClient( existingAuthTicket,  null,  null);
	}

	/**
	 * Generates a new user authentication ticket for the specified tenant by supplying the user's existing refresh token information.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> mozuClient=RefreshAuthTicketClient( existingAuthTicket,  tenantId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantAdminUserAuthTicket tenantAdminUserAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param tenantId 
	 * @param existingAuthTicket Properties of the authentication ticket to be used in user claims with the Mozu API.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket>
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> refreshAuthTicketClient(com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket existingAuthTicket, Integer tenantId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.TenantAdminUserAuthTicketUrl.refreshAuthTicketUrl(responseFields, tenantId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket.class;
		MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> mozuClient = (MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(existingAuthTicket);
		return mozuClient;

	}

	/**
	 * Deletes the authentication ticket for the user by supplying the refresh token.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteUserAuthTicketClient( refreshToken);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteUserAuthTicketClient(String refreshToken) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.TenantAdminUserAuthTicketUrl.deleteUserAuthTicketUrl(refreshToken);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



