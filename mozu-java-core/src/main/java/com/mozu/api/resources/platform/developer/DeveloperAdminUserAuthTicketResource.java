/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.developer;

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
 * Use the Authtickets resource to manage authentication tickets for your developer account.
 * </summary>
 */
public class DeveloperAdminUserAuthTicketResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public DeveloperAdminUserAuthTicketResource() 
		{
			_apiContext = null;
	}
public DeveloperAdminUserAuthTicketResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Generate an authentication ticket for a developer account.
	 * <p><pre><code>
	 *	DeveloperAdminUserAuthTicket developeradminuserauthticket = new DeveloperAdminUserAuthTicket();
	 *	DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = developeradminuserauthticket.createDeveloperUserAuthTicket( userAuthInfo);
	 * </code></pre></p>
	 * @param userAuthInfo Information required to authenticate a user.
	 * @return com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket createDeveloperUserAuthTicket(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo) throws Exception
	{
		return createDeveloperUserAuthTicket( userAuthInfo,  null,  null);
	}

	/**
	 * Generate an authentication ticket for a developer account.
	 * <p><pre><code>
	 *	DeveloperAdminUserAuthTicket developeradminuserauthticket = new DeveloperAdminUserAuthTicket();
	 *	DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = developeradminuserauthticket.createDeveloperUserAuthTicket( userAuthInfo,  developerAccountId,  responseFields);
	 * </code></pre></p>
	 * @param developerAccountId Unique identifier of the developer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param userAuthInfo Information required to authenticate a user.
	 * @return com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket createDeveloperUserAuthTicket(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo, Integer developerAccountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket> client = com.mozu.api.clients.platform.developer.DeveloperAdminUserAuthTicketClient.createDeveloperUserAuthTicketClient( userAuthInfo,  developerAccountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Generates a new developer account authentication ticket for the specified tenant by supplying the defined refresh token information.
	 * <p><pre><code>
	 *	DeveloperAdminUserAuthTicket developeradminuserauthticket = new DeveloperAdminUserAuthTicket();
	 *	DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = developeradminuserauthticket.refreshDeveloperAuthTicket( existingAuthTicket);
	 * </code></pre></p>
	 * @param existingAuthTicket Properties of the authentication ticket to be used in developer account claims with the Mozu API.
	 * @return com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 */
	public com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket refreshDeveloperAuthTicket(com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket existingAuthTicket) throws Exception
	{
		return refreshDeveloperAuthTicket( existingAuthTicket,  null,  null);
	}

	/**
	 * Generates a new developer account authentication ticket for the specified tenant by supplying the defined refresh token information.
	 * <p><pre><code>
	 *	DeveloperAdminUserAuthTicket developeradminuserauthticket = new DeveloperAdminUserAuthTicket();
	 *	DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = developeradminuserauthticket.refreshDeveloperAuthTicket( existingAuthTicket,  developerAccountId,  responseFields);
	 * </code></pre></p>
	 * @param developerAccountId Unique identifier of the developer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param existingAuthTicket Properties of the authentication ticket to be used in developer account claims with the Mozu API.
	 * @return com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 */
	public com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket refreshDeveloperAuthTicket(com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket existingAuthTicket, Integer developerAccountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket> client = com.mozu.api.clients.platform.developer.DeveloperAdminUserAuthTicketClient.refreshDeveloperAuthTicketClient( existingAuthTicket,  developerAccountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the authentication ticket for the developer account by supplying the refresh token.
	 * <p><pre><code>
	 *	DeveloperAdminUserAuthTicket developeradminuserauthticket = new DeveloperAdminUserAuthTicket();
	 *	developeradminuserauthticket.deleteUserAuthTicket( refreshToken);
	 * </code></pre></p>
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @return 
	 */
	public void deleteUserAuthTicket(String refreshToken) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.developer.DeveloperAdminUserAuthTicketClient.deleteUserAuthTicketClient( refreshToken);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



