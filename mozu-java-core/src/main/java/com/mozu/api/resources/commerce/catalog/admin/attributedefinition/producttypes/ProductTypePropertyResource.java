/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.attributedefinition.producttypes;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Properties subresource to define how property product attributes are used for a specific product type. Product attribute definitions are unique for each associated product type.
 * </summary>
 */
public class ProductTypePropertyResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ProductTypePropertyResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ProductTypePropertyResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves a list of product property attributes defined for a product type.
	 * <p><pre><code>
	 *	ProductTypeProperty producttypeproperty = new ProductTypeProperty();
	 *	AttributeInProductType attributeInProductType = producttypeproperty.getProperties( productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return List<com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public List<com.mozu.api.contracts.productadmin.AttributeInProductType> getProperties(Integer productTypeId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypePropertyClient.getPropertiesClient(_dataViewMode,  productTypeId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a product property attribute definition for the specified product type.
	 * <p><pre><code>
	 *	ProductTypeProperty producttypeproperty = new ProductTypeProperty();
	 *	AttributeInProductType attributeInProductType = producttypeproperty.getProperty( productTypeId,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType getProperty(Integer productTypeId, String attributeFQN) throws Exception
	{
		return getProperty( productTypeId,  attributeFQN,  null);
	}

	/**
	 * Retrieves a product property attribute definition for the specified product type.
	 * <p><pre><code>
	 *	ProductTypeProperty producttypeproperty = new ProductTypeProperty();
	 *	AttributeInProductType attributeInProductType = producttypeproperty.getProperty( productTypeId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType getProperty(Integer productTypeId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypePropertyClient.getPropertyClient(_dataViewMode,  productTypeId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Assigns a property attribute to the specified product type, according to the information defined in the request.
	 * <p><pre><code>
	 *	ProductTypeProperty producttypeproperty = new ProductTypeProperty();
	 *	AttributeInProductType attributeInProductType = producttypeproperty.addProperty( attributeInProductType,  productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType addProperty(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId) throws Exception
	{
		return addProperty( attributeInProductType,  productTypeId,  null);
	}

	/**
	 * Assigns a property attribute to the specified product type, according to the information defined in the request.
	 * <p><pre><code>
	 *	ProductTypeProperty producttypeproperty = new ProductTypeProperty();
	 *	AttributeInProductType attributeInProductType = producttypeproperty.addProperty( attributeInProductType,  productTypeId,  responseFields);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType addProperty(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypePropertyClient.addPropertyClient(_dataViewMode,  attributeInProductType,  productTypeId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the definition of a property attribute for the specified product type.
	 * <p><pre><code>
	 *	ProductTypeProperty producttypeproperty = new ProductTypeProperty();
	 *	AttributeInProductType attributeInProductType = producttypeproperty.updateProperty( attributeInProductType,  productTypeId,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType updateProperty(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN) throws Exception
	{
		return updateProperty( attributeInProductType,  productTypeId,  attributeFQN,  null);
	}

	/**
	 * Updates the definition of a property attribute for the specified product type.
	 * <p><pre><code>
	 *	ProductTypeProperty producttypeproperty = new ProductTypeProperty();
	 *	AttributeInProductType attributeInProductType = producttypeproperty.updateProperty( attributeInProductType,  productTypeId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType updateProperty(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypePropertyClient.updatePropertyClient(_dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes a property attribute previously defined for the specified product type.
	 * <p><pre><code>
	 *	ProductTypeProperty producttypeproperty = new ProductTypeProperty();
	 *	producttypeproperty.deleteProperty( productTypeId,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteProperty(Integer productTypeId, String attributeFQN) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypePropertyClient.deletePropertyClient(_dataViewMode,  productTypeId,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



