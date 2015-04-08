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
 * Vocabulary values are predefined for an attribute.
 * </summary>
 */
public class AttributeVocabularyValueResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public AttributeVocabularyValueResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of vocabulary values defined for the attribute specified in the request.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValue attributeVocabularyValue = attributevocabularyvalue.getAttributeVocabularyValues( attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @return List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> getAttributeVocabularyValues(String attributeFQN) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueClient.getAttributeVocabularyValuesClient( attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a collection of localized content for vocabulary value attributes based on a `localeCode`. 
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = attributevocabularyvalue.getAttributeVocabularyValueLocalizedContents( attributeFQN,  value);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> getAttributeVocabularyValueLocalizedContents(String attributeFQN, String value) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueClient.getAttributeVocabularyValueLocalizedContentsClient( attributeFQN,  value);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the localized content for a vocabulary value attribute based on a `localeCode`. 
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = attributevocabularyvalue.getAttributeVocabularyValueLocalizedContent( attributeFQN,  value,  localeCode);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent getAttributeVocabularyValueLocalizedContent(String attributeFQN, String value, String localeCode) throws Exception
	{
		return getAttributeVocabularyValueLocalizedContent( attributeFQN,  value,  localeCode,  null);
	}

	/**
	 * Retrieves the localized content for a vocabulary value attribute based on a `localeCode`. 
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = attributevocabularyvalue.getAttributeVocabularyValueLocalizedContent( attributeFQN,  value,  localeCode,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent getAttributeVocabularyValueLocalizedContent(String attributeFQN, String value, String localeCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueClient.getAttributeVocabularyValueLocalizedContentClient( attributeFQN,  value,  localeCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a vocabulary value defined for an attribute by providing the attribute's fully qualified name and the value to retrieve.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValue attributeVocabularyValue = attributevocabularyvalue.getAttributeVocabularyValue( attributeFQN,  value);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public com.mozu.api.contracts.productadmin.AttributeVocabularyValue getAttributeVocabularyValue(String attributeFQN, String value) throws Exception
	{
		return getAttributeVocabularyValue( attributeFQN,  value,  null);
	}

	/**
	 * Retrieves the details of a vocabulary value defined for an attribute by providing the attribute's fully qualified name and the value to retrieve.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValue attributeVocabularyValue = attributevocabularyvalue.getAttributeVocabularyValue( attributeFQN,  value,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public com.mozu.api.contracts.productadmin.AttributeVocabularyValue getAttributeVocabularyValue(String attributeFQN, String value, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueClient.getAttributeVocabularyValueClient( attributeFQN,  value,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates and saves localized vocabulary value content for an attribute, based on the `localeCode`.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = attributevocabularyvalue.addAttributeVocabularyValueLocalizedContent( localizedContent,  attributeFQN,  value);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized text for the string value of a product attribute.
	 * @return com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent addAttributeVocabularyValueLocalizedContent(com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent localizedContent, String attributeFQN, String value) throws Exception
	{
		return addAttributeVocabularyValueLocalizedContent( localizedContent,  attributeFQN,  value,  null);
	}

	/**
	 * Creates and saves localized vocabulary value content for an attribute, based on the `localeCode`.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = attributevocabularyvalue.addAttributeVocabularyValueLocalizedContent( localizedContent,  attributeFQN,  value,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized text for the string value of a product attribute.
	 * @return com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent addAttributeVocabularyValueLocalizedContent(com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent localizedContent, String attributeFQN, String value, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueClient.addAttributeVocabularyValueLocalizedContentClient( localizedContent,  attributeFQN,  value,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a vocabulary value for a defined product attribute.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValue attributeVocabularyValue = attributevocabularyvalue.addAttributeVocabularyValue( attributeVocabularyValue,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @param attributeVocabularyValue Properties of a vocabulary value defined for an extensible attribute.
	 * @return com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public com.mozu.api.contracts.productadmin.AttributeVocabularyValue addAttributeVocabularyValue(com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN) throws Exception
	{
		return addAttributeVocabularyValue( attributeVocabularyValue,  attributeFQN,  null);
	}

	/**
	 * Creates a vocabulary value for a defined product attribute.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValue attributeVocabularyValue = attributevocabularyvalue.addAttributeVocabularyValue( attributeVocabularyValue,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param attributeVocabularyValue Properties of a vocabulary value defined for an extensible attribute.
	 * @return com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public com.mozu.api.contracts.productadmin.AttributeVocabularyValue addAttributeVocabularyValue(com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueClient.addAttributeVocabularyValueClient( attributeVocabularyValue,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update existing vocabulary values for an attribute.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValue attributeVocabularyValue = attributevocabularyvalue.updateAttributeVocabularyValues( vocabularyValues,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @param vocabularyValues Properties of a vocabulary value defined for an extensible attribute.
	 * @return List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> updateAttributeVocabularyValues(List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> vocabularyValues, String attributeFQN) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueClient.updateAttributeVocabularyValuesClient( vocabularyValues,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates a collection of localized vocabulary value content for existing attributes, based on the `localeCode`.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = attributevocabularyvalue.updateAttributeVocabularyValueLocalizedContents( localizedContent,  attributeFQN,  value);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized text for the string value of a product attribute.
	 * @return List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> updateAttributeVocabularyValueLocalizedContents(List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> localizedContent, String attributeFQN, String value) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueClient.updateAttributeVocabularyValueLocalizedContentsClient( localizedContent,  attributeFQN,  value);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates localized vocabulary value content for an existing attribute, based on the `localeCode`.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = attributevocabularyvalue.updateAttributeVocabularyValueLocalizedContent( localizedContent,  attributeFQN,  value,  localeCode);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized text for the string value of a product attribute.
	 * @return com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent updateAttributeVocabularyValueLocalizedContent(com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent localizedContent, String attributeFQN, String value, String localeCode) throws Exception
	{
		return updateAttributeVocabularyValueLocalizedContent( localizedContent,  attributeFQN,  value,  localeCode,  null);
	}

	/**
	 * Updates localized vocabulary value content for an existing attribute, based on the `localeCode`.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = attributevocabularyvalue.updateAttributeVocabularyValueLocalizedContent( localizedContent,  attributeFQN,  value,  localeCode,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized text for the string value of a product attribute.
	 * @return com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent updateAttributeVocabularyValueLocalizedContent(com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent localizedContent, String attributeFQN, String value, String localeCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueClient.updateAttributeVocabularyValueLocalizedContentClient( localizedContent,  attributeFQN,  value,  localeCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates existing attribute vocabulary values.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValue attributeVocabularyValue = attributevocabularyvalue.updateAttributeVocabularyValue( attributeVocabularyValue,  attributeFQN,  value);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param attributeVocabularyValue Properties of a vocabulary value defined for an extensible attribute.
	 * @return com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public com.mozu.api.contracts.productadmin.AttributeVocabularyValue updateAttributeVocabularyValue(com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN, String value) throws Exception
	{
		return updateAttributeVocabularyValue( attributeVocabularyValue,  attributeFQN,  value,  null);
	}

	/**
	 * Updates existing attribute vocabulary values.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	AttributeVocabularyValue attributeVocabularyValue = attributevocabularyvalue.updateAttributeVocabularyValue( attributeVocabularyValue,  attributeFQN,  value,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param attributeVocabularyValue Properties of a vocabulary value defined for an extensible attribute.
	 * @return com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public com.mozu.api.contracts.productadmin.AttributeVocabularyValue updateAttributeVocabularyValue(com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN, String value, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueClient.updateAttributeVocabularyValueClient( attributeVocabularyValue,  attributeFQN,  value,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes an attribute's vocabulary value.
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	attributevocabularyvalue.deleteAttributeVocabularyValue( attributeFQN,  value);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteAttributeVocabularyValue(String attributeFQN, String value) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueClient.deleteAttributeVocabularyValueClient( attributeFQN,  value);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Removes localized content for a vocabulary value attribute. 
	 * <p><pre><code>
	 *	AttributeVocabularyValue attributevocabularyvalue = new AttributeVocabularyValue();
	 *	attributevocabularyvalue.deleteAttributeVocabularyValueLocalizedContent( attributeFQN,  value,  localeCode);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteAttributeVocabularyValueLocalizedContent(String attributeFQN, String value, String localeCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueClient.deleteAttributeVocabularyValueLocalizedContentClient( attributeFQN,  value,  localeCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



