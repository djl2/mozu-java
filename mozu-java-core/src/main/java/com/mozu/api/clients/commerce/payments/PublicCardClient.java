/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.payments;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class PublicCardClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient=CreateClient( request);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SyncResponse syncResponse = client.Result();
	 * </code></pre></p>
	 * @param request 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.paymentservice.response.SyncResponse>
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public static MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> createClient(com.mozu.api.contracts.paymentservice.PublicCard request) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.payments.PublicCardUrl.createUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.paymentservice.response.SyncResponse.class;
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient = (MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(request);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient=UpdateClient( request,  cardId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SyncResponse syncResponse = client.Result();
	 * </code></pre></p>
	 * @param cardId 
	 * @param request 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.paymentservice.response.SyncResponse>
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public static MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> updateClient(com.mozu.api.contracts.paymentservice.PublicCard request, String cardId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.payments.PublicCardUrl.updateUrl(cardId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.paymentservice.response.SyncResponse.class;
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient = (MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(request);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteClient( cardId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param cardId 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteClient(String cardId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.payments.PublicCardUrl.deleteUrl(cardId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



