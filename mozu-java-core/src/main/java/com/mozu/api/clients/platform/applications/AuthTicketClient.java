/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.applications;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Authetickets for applications resource to manage authentication tickets for your apps.
 * </summary>
 */
public class AuthTicketClient {
	
	/**
	 * Generate an authentication ticket for an application.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.AuthTicket> mozuClient=AuthenticateAppClient( appAuthInfo);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AuthTicket authTicket = client.Result();
	 * </code></pre></p>
	 * @param appAuthInfo The information required to authenticate third party applications against the Mozu API.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.AuthTicket>
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AppAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.AuthTicket> authenticateAppClient(com.mozu.api.contracts.appdev.AppAuthInfo appAuthInfo) throws Exception
	{
		return authenticateAppClient( appAuthInfo,  null);
	}

	/**
	 * Generate an authentication ticket for an application.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.AuthTicket> mozuClient=AuthenticateAppClient( appAuthInfo,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AuthTicket authTicket = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param appAuthInfo The information required to authenticate third party applications against the Mozu API.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.AuthTicket>
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AppAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.AuthTicket> authenticateAppClient(com.mozu.api.contracts.appdev.AppAuthInfo appAuthInfo, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.applications.AuthTicketUrl.authenticateAppUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.AuthTicket.class;
		MozuClient<com.mozu.api.contracts.appdev.AuthTicket> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.AuthTicket>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(appAuthInfo);
		return mozuClient;

	}

	/**
	 * Refreshes the application's authentication ticket and generates a new access token by providing the refresh token string.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.AuthTicket> mozuClient=RefreshAppAuthTicketClient( authTicketRequest);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AuthTicket authTicket = client.Result();
	 * </code></pre></p>
	 * @param authTicketRequest Properties of the authentication ticket refresh requests, which includes the refresh token string.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.AuthTicket>
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicketRequest
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.AuthTicket> refreshAppAuthTicketClient(com.mozu.api.contracts.appdev.AuthTicketRequest authTicketRequest) throws Exception
	{
		return refreshAppAuthTicketClient( authTicketRequest,  null);
	}

	/**
	 * Refreshes the application's authentication ticket and generates a new access token by providing the refresh token string.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.AuthTicket> mozuClient=RefreshAppAuthTicketClient( authTicketRequest,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AuthTicket authTicket = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param authTicketRequest Properties of the authentication ticket refresh requests, which includes the refresh token string.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.AuthTicket>
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicketRequest
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.AuthTicket> refreshAppAuthTicketClient(com.mozu.api.contracts.appdev.AuthTicketRequest authTicketRequest, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.applications.AuthTicketUrl.refreshAppAuthTicketUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.appdev.AuthTicket.class;
		MozuClient<com.mozu.api.contracts.appdev.AuthTicket> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.AuthTicket>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(authTicketRequest);
		return mozuClient;

	}

	/**
	 * Deletes an authentication for an application based on the specified refresh token.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAppAuthTicketClient( refreshToken);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAppAuthTicketClient(String refreshToken) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.applications.AuthTicketUrl.deleteAppAuthTicketUrl(refreshToken);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



