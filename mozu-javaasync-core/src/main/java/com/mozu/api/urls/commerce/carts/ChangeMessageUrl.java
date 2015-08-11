/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.carts;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ChangeMessageUrl
{

	/**
	 * Get Resource Url for GetMessages
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getMessagesUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/messages?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RemoveAllMessages
	 * @return   String Resource Url
	 */
	public static MozuUrl removeAllMessagesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/messages");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RemoveMessage
	 * @param messageId Identifier of the message to remove from the cart.
	 * @return   String Resource Url
	 */
	public static MozuUrl removeMessageUrl(String messageId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/messages/{messageId}");
		formatter.formatUrl("messageId", messageId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}
