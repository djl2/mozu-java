/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use the Checkout Settings resource to specify the site-wide settings that define checkout and order processing behavior. This resource includes subresources for payment settings, customer checkout settings, and order processing settings.
 * </summary>
 */
public class CheckoutSettingsClient {
	
	/**
	 * Retrieves all checkout settings defined for the site including payment settings (payment gateway ID and credentials), shopper checkout settings (login requirement or guest mode and custom attributes), and order processing settings (when payment is authorized and captured plus any custom attributes).
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CheckoutSettings> mozuClient=GetCheckoutSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CheckoutSettings checkoutSettings = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CheckoutSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CheckoutSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CheckoutSettings> getCheckoutSettingsClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.CheckoutSettingsUrl.getCheckoutSettingsUrl();
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.order.CheckoutSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.order.CheckoutSettings> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



