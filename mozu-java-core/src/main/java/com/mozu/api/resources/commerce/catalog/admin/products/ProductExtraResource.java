/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.products;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use the Extras resource to configure an extra product attribute for products associated with the product type that uses the extra attribute.
 * </summary>
 */
public class ProductExtraResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public ProductExtraResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves a list of extras configured for the product according to any defined filter and sort criteria.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.GetExtras(dataViewMode,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return List<com.mozu.api.contracts.productadmin.ProductExtra>
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public List<com.mozu.api.contracts.productadmin.ProductExtra> getExtras(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtra>> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.getExtrasClient(dataViewMode,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of an extra attribute configuration for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.GetExtra(dataViewMode,  productCode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public com.mozu.api.contracts.productadmin.ProductExtra getExtra(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN) throws Exception
	{
		return getExtra(dataViewMode,  productCode,  attributeFQN,  null);
	}

	/**
	 * Retrieves the details of an extra attribute configuration for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.GetExtra(dataViewMode,  productCode,  attributeFQN,  fields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param fields 
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public com.mozu.api.contracts.productadmin.ProductExtra getExtra(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String fields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.getExtraClient(dataViewMode,  productCode,  attributeFQN,  fields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Configure an extra attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.AddExtra(dataViewMode,  productExtra,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productExtra Properties of the product extra to configure for the specified product.
	 * @return com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public com.mozu.api.contracts.productadmin.ProductExtra addExtra(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductExtra productExtra, String productCode) throws Exception
	{
		return addExtra(dataViewMode,  productExtra,  productCode,  null);
	}

	/**
	 * Configure an extra attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.AddExtra(dataViewMode,  productExtra,  productCode,  fields);
	 * </code></pre></p>
	 * @param fields 
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productExtra Properties of the product extra to configure for the specified product.
	 * @return com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public com.mozu.api.contracts.productadmin.ProductExtra addExtra(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductExtra productExtra, String productCode, String fields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.addExtraClient(dataViewMode,  productExtra,  productCode,  fields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the configuration of an extra attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.UpdateExtra(dataViewMode,  productExtra,  productCode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productExtra Properties of the extra attribute to update for the specified product.
	 * @return com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public com.mozu.api.contracts.productadmin.ProductExtra updateExtra(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductExtra productExtra, String productCode, String attributeFQN) throws Exception
	{
		return updateExtra(dataViewMode,  productExtra,  productCode,  attributeFQN,  null);
	}

	/**
	 * Updates the configuration of an extra attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.UpdateExtra(dataViewMode,  productExtra,  productCode,  attributeFQN,  fields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param fields 
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productExtra Properties of the extra attribute to update for the specified product.
	 * @return com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public com.mozu.api.contracts.productadmin.ProductExtra updateExtra(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductExtra productExtra, String productCode, String attributeFQN, String fields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.updateExtraClient(dataViewMode,  productExtra,  productCode,  attributeFQN,  fields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Delete a product extra configuration for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	productextra.DeleteExtra(dataViewMode,  productCode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return 
	 */
	public void deleteExtra(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.deleteExtraClient(dataViewMode,  productCode,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



