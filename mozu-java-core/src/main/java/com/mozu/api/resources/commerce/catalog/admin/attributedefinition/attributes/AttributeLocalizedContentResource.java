/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.attributedefinition.attributes;

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
 * Properties of localized content for attributes, based on a `localeCode` at a site/tenant level. This content supports translated text for product, product options, and additional objects. 
 * </summary>
 */
public class AttributeLocalizedContentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public AttributeLocalizedContentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a collection of localized content for attributes based on a `localeCode`.
	 * <p><pre><code>
	 *	AttributeLocalizedContent attributelocalizedcontent = new AttributeLocalizedContent();
	 *	AttributeLocalizedContent attributeLocalizedContent = attributelocalizedcontent.getAttributeLocalizedContents( attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param dataViewMode DataViewMode
	 * @return List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> getAttributeLocalizedContents(String attributeFQN) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentClient.getAttributeLocalizedContentsClient( attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the localized content for an attribute  based on a `localeCode`. 
	 * <p><pre><code>
	 *	AttributeLocalizedContent attributelocalizedcontent = new AttributeLocalizedContent();
	 *	AttributeLocalizedContent attributeLocalizedContent = attributelocalizedcontent.getAttributeLocalizedContent( attributeFQN,  localeCode);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.AttributeLocalizedContent getAttributeLocalizedContent(String attributeFQN, String localeCode) throws Exception
	{
		return getAttributeLocalizedContent( attributeFQN,  localeCode,  null);
	}

	/**
	 * Retrieves the localized content for an attribute  based on a `localeCode`. 
	 * <p><pre><code>
	 *	AttributeLocalizedContent attributelocalizedcontent = new AttributeLocalizedContent();
	 *	AttributeLocalizedContent attributeLocalizedContent = attributelocalizedcontent.getAttributeLocalizedContent( attributeFQN,  localeCode,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.AttributeLocalizedContent getAttributeLocalizedContent(String attributeFQN, String localeCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentClient.getAttributeLocalizedContentClient( attributeFQN,  localeCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds new localized content for an attribute  based on a `localeCode`. 
	 * <p><pre><code>
	 *	AttributeLocalizedContent attributelocalizedcontent = new AttributeLocalizedContent();
	 *	AttributeLocalizedContent attributeLocalizedContent = attributelocalizedcontent.addLocalizedContent( localizedContent,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized name and description of the attribute, displayed in the locale defined for the master catalog.
	 * @return com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.AttributeLocalizedContent addLocalizedContent(com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN) throws Exception
	{
		return addLocalizedContent( localizedContent,  attributeFQN,  null);
	}

	/**
	 * Adds new localized content for an attribute  based on a `localeCode`. 
	 * <p><pre><code>
	 *	AttributeLocalizedContent attributelocalizedcontent = new AttributeLocalizedContent();
	 *	AttributeLocalizedContent attributeLocalizedContent = attributelocalizedcontent.addLocalizedContent( localizedContent,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized name and description of the attribute, displayed in the locale defined for the master catalog.
	 * @return com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.AttributeLocalizedContent addLocalizedContent(com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentClient.addLocalizedContentClient( localizedContent,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the localized content for a collection of existing attributes  based on a `localeCode`. 
	 * <p><pre><code>
	 *	AttributeLocalizedContent attributelocalizedcontent = new AttributeLocalizedContent();
	 *	AttributeLocalizedContent attributeLocalizedContent = attributelocalizedcontent.updateLocalizedContents( localizedContent,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized name and description of the attribute, displayed in the locale defined for the master catalog.
	 * @return List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> updateLocalizedContents(List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> localizedContent, String attributeFQN) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentClient.updateLocalizedContentsClient( localizedContent,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the localized content for an existing attribute  based on a `localeCode`. 
	 * <p><pre><code>
	 *	AttributeLocalizedContent attributelocalizedcontent = new AttributeLocalizedContent();
	 *	AttributeLocalizedContent attributeLocalizedContent = attributelocalizedcontent.updateLocalizedContent( localizedContent,  attributeFQN,  localeCode);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized name and description of the attribute, displayed in the locale defined for the master catalog.
	 * @return com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.AttributeLocalizedContent updateLocalizedContent(com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN, String localeCode) throws Exception
	{
		return updateLocalizedContent( localizedContent,  attributeFQN,  localeCode,  null);
	}

	/**
	 * Updates the localized content for an existing attribute  based on a `localeCode`. 
	 * <p><pre><code>
	 *	AttributeLocalizedContent attributelocalizedcontent = new AttributeLocalizedContent();
	 *	AttributeLocalizedContent attributeLocalizedContent = attributelocalizedcontent.updateLocalizedContent( localizedContent,  attributeFQN,  localeCode,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized name and description of the attribute, displayed in the locale defined for the master catalog.
	 * @return com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.AttributeLocalizedContent updateLocalizedContent(com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN, String localeCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentClient.updateLocalizedContentClient( localizedContent,  attributeFQN,  localeCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes all localized content. Localized content is translated text information and data based on a `localeCode`. 
	 * <p><pre><code>
	 *	AttributeLocalizedContent attributelocalizedcontent = new AttributeLocalizedContent();
	 *	attributelocalizedcontent.deleteLocalizedContent( attributeFQN,  localeCode);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteLocalizedContent(String attributeFQN, String localeCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentClient.deleteLocalizedContentClient( attributeFQN,  localeCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



