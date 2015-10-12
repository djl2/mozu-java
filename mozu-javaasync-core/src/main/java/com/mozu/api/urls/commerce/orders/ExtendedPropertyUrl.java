/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.orders;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ExtendedPropertyUrl
{

	/**
	 * Get Resource Url for GetExtendedProperties
	 * @param draft 
	 * @param orderId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getExtendedPropertiesUrl(Boolean draft, String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/extendedproperties?draft={draft}");
		formatter.formatUrl("draft", draft);
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddExtendedProperties
	 * @param orderId 
	 * @param updateMode 
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl addExtendedPropertiesUrl(String orderId, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/extendedproperties?updatemode={updateMode}&version={version}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateExtendedProperty
	 * @param key 
	 * @param orderId 
	 * @param responseFields 
	 * @param updateMode 
	 * @param upsert 
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateExtendedPropertyUrl(String key, String orderId, String responseFields, String updateMode, Boolean upsert, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/extendedproperties/{key}?updatemode={updateMode}&version={version}&upsert={upsert}&responseFields={responseFields}");
		formatter.formatUrl("key", key);
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("upsert", upsert);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateExtendedProperties
	 * @param orderId 
	 * @param updateMode 
	 * @param upsert 
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateExtendedPropertiesUrl(String orderId, String updateMode, Boolean upsert, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/extendedproperties?updatemode={updateMode}&version={version}&upsert={upsert}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("upsert", upsert);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteExtendedProperty
	 * @param key 
	 * @param orderId 
	 * @param updateMode 
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteExtendedPropertyUrl(String key, String orderId, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/extendedproperties/{key}?updatemode={updateMode}&version={version}");
		formatter.formatUrl("key", key);
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteExtendedProperties
	 * @param orderId 
	 * @param updateMode 
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteExtendedPropertiesUrl(String orderId, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/extendedproperties?updatemode={updateMode}&version={version}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

