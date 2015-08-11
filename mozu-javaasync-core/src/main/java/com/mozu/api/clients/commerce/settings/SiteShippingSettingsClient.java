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
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the shipping subresource to manage settings for the site shipping information, such as origin address information, carrier shipping methods, shipping rate providers, and regions available for shipping.
 * </summary>
 */
public class SiteShippingSettingsClient {
	
	/**
	 * Retrieves a list of the shipping settings configured for a site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings> mozuClient=GetSiteShippingSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SiteShippingSettings siteShippingSettings = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings>
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings> getSiteShippingSettingsClient() throws Exception
	{
		return getSiteShippingSettingsClient( null);
	}

	/**
	 * Retrieves a list of the shipping settings configured for a site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings> mozuClient=GetSiteShippingSettingsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SiteShippingSettings siteShippingSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings>
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings> getSiteShippingSettingsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.SiteShippingSettingsUrl.getSiteShippingSettingsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}


