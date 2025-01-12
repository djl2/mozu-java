/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings.checkout;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Payment Settings resource to specify settings when creating payments for order checkout on the site.
 * </summary>
 */
public class PaymentSettingsClient {
	
	/**
	 * Retrieves the details of the third-party payment service workflows configured for the site.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>> mozuClient=GetThirdPartyPaymentWorkflowsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExternalPaymentWorkflowDefinition externalPaymentWorkflowDefinition = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>>
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public static MozuClient<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>> getThirdPartyPaymentWorkflowsClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.checkout.PaymentSettingsUrl.getThirdPartyPaymentWorkflowsUrl();
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>> mozuClient = (MozuClient<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



