/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productruntime.Discount;
import com.mozu.api.contracts.productruntime.BundledProduct;
import com.mozu.api.contracts.productruntime.Category;
import com.mozu.api.contracts.productruntime.ProductContent;
import com.mozu.api.contracts.productruntime.ProductInventoryInfo;
import com.mozu.api.contracts.productruntime.PackageMeasurements;
import com.mozu.api.contracts.productruntime.ProductOption;
import com.mozu.api.contracts.productruntime.ProductPrice;
import com.mozu.api.contracts.productruntime.ProductPriceRange;
import com.mozu.api.contracts.productruntime.ProductPricingBehaviorInfo;
import com.mozu.api.contracts.productruntime.ProductProperty;
import com.mozu.api.contracts.productruntime.ProductPurchasableState;

/**
 *	The properties of a product, referenced and used by carts, orders, wish lists, and returns.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Date and time when the entity was created, represented in UTC Date/Time.
	 */
	protected DateTime createDate;

	public DateTime getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}

	/**
	 * List of supported types of fulfillment  for the product or variation. The types include direct ship, in-store pickup, or both. 
	 */
	protected List<String> fulfillmentTypesSupported;
	public List<String> getFulfillmentTypesSupported() {
		return this.fulfillmentTypesSupported;
	}
	public void setFulfillmentTypesSupported(List<String> fulfillmentTypesSupported) {
		this.fulfillmentTypesSupported = fulfillmentTypesSupported;
	}

	/**
	 * The type of goods in a bundled product. A bundled product is composed of products associated to sell together. Possible values include Physical and DigitalCredit. This comes from the `productType `of the product. Products are defaulted to a Physical `goodsType`. Gift cards have a `goodsType `of DigitalCredit.
	 */
	protected String goodsType;

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	/**
	 * Indicates if the object or feature is active. This indicator is used for subscriptions (at the site or tenant level), customer accounts, products and variations.
	 */
	protected Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * Indicates if the product must be shipped alone in a container. This is used for products and products within a bundle. If true, this product cannot be shipped in a package with other items and must ship in a package by itself.
	 */
	protected Boolean isPackagedStandAlone;

	public Boolean getIsPackagedStandAlone() {
		return this.isPackagedStandAlone;
	}

	public void setIsPackagedStandAlone(Boolean isPackagedStandAlone) {
		this.isPackagedStandAlone = isPackagedStandAlone;
	}

	/**
	 * Indicates if the product in a cart, order, or wish list is purchased on a recurring schedule. If true, the item can be purchased or fulfilled at regular intervals, such as a monthly billing cycle. For example, digital or physical product subscriptions are recurring cart items. This property is not used at this time and is reserved for future functionality.
	 */
	protected Boolean isRecurring;

	public Boolean getIsRecurring() {
		return this.isRecurring;
	}

	public void setIsRecurring(Boolean isRecurring) {
		this.isRecurring = isRecurring;
	}

	/**
	 * Indicates if the item is subject to taxation, used by products, options, extras, cart and order items, line items, and wish lists. If true, the entity is subject to tax based on the relevant tax rate and rules.
	 */
	protected Boolean isTaxable;

	public Boolean getIsTaxable() {
		return this.isTaxable;
	}

	public void setIsTaxable(Boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	/**
	 * The manufacturer's part number for the product.
	 */
	protected String mfgPartNumber;

	public String getMfgPartNumber() {
		return this.mfgPartNumber;
	}

	public void setMfgPartNumber(String mfgPartNumber) {
		this.mfgPartNumber = mfgPartNumber;
	}

	/**
	 * The list of manufacturer part numbers defined for the product.
	 */
	protected List<String> mfgPartNumbers;
	public List<String> getMfgPartNumbers() {
		return this.mfgPartNumbers;
	}
	public void setMfgPartNumbers(List<String> mfgPartNumbers) {
		this.mfgPartNumbers = mfgPartNumbers;
	}

	/**
	 * Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 */
	protected String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * Integer that represents the sequential order of the product.
	 */
	protected Integer productSequence;

	public Integer getProductSequence() {
		return this.productSequence;
	}

	public void setProductSequence(Integer productSequence) {
		this.productSequence = productSequence;
	}

	/**
	 * The product type template associated with the product on the storefront.
	 */
	protected String productType;

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * The usage type that applies to this product, which is Standard (a single product without configurable options), Configurable (a product that includes configurable option attributes), Bundle (a collection of products sold as a single entity), or Component (an invididual product that represents a component in a bundle).
	 */
	protected String productUsage;

	public String getProductUsage() {
		return this.productUsage;
	}

	public void setProductUsage(String productUsage) {
		this.productUsage = productUsage;
	}

	/**
	 * The current state of the document or product definition. States for documents include Active, Draft, or Latest. Active documents are published and cannot be deleted. Querying Latest returns the most recent version of the document, regardless of whether it is published or a draft. States for product include New, Draft, or Live.
	 */
	protected String publishState;

	public String getPublishState() {
		return this.publishState;
	}

	public void setPublishState(String publishState) {
		this.publishState = publishState;
	}

	/**
	 * The universal product code (UPC) is the barcode defined for the product. The UPC is unique across all sales channels. 
	 */
	protected String upc;

	public String getUpc() {
		return this.upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	/**
	 * The list of universal product codes defined for the product.
	 */
	protected List<String> upCs;
	public List<String> getUpCs() {
		return this.upCs;
	}
	public void setUpCs(List<String> upCs) {
		this.upCs = upCs;
	}

	/**
	 * Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 */
	protected String variationProductCode;

	public String getVariationProductCode() {
		return this.variationProductCode;
	}

	public void setVariationProductCode(String variationProductCode) {
		this.variationProductCode = variationProductCode;
	}

	/**
	 * List of shipping discounts that can be applied to the configured product. These discounts are calculated and updated as shoppers add content to their cart and continue checkout steps to order submission.
	 */
	protected List<Discount> availableShippingDiscounts;
	public List<Discount> getAvailableShippingDiscounts() {
		return this.availableShippingDiscounts;
	}
	public void setAvailableShippingDiscounts(List<Discount> availableShippingDiscounts) {
		this.availableShippingDiscounts = availableShippingDiscounts;
	}

	/**
	 * Properties of a collection of component products that make up a single product bundle with its own product code. Tenants can define product bundles for any product type that supports the Bundle product usage.
	 */
	protected List<BundledProduct> bundledProducts;
	public List<BundledProduct> getBundledProducts() {
		return this.bundledProducts;
	}
	public void setBundledProducts(List<BundledProduct> bundledProducts) {
		this.bundledProducts = bundledProducts;
	}

	/**
	 * The list of all categories associated with the product. These categories contain products, can have discounts associated, and define the grouping of products to display on the storefront.
	 */
	protected List<Category> categories;
	public List<Category> getCategories() {
		return this.categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	/**
	 * Complex type that contains content for a language specified by LocaleCode.
	 */
	protected ProductContent content;

	public ProductContent getContent() {
		return this.content;
	}

	public void setContent(ProductContent content) {
		this.content = content;
	}

	/**
	 * Properties and data of inventory information for configured and bundled products. If product stock is managed, the data specifies out of stock behavior.
	 */
	protected ProductInventoryInfo inventoryInfo;

	public ProductInventoryInfo getInventoryInfo() {
		return this.inventoryInfo;
	}

	public void setInventoryInfo(ProductInventoryInfo inventoryInfo) {
		this.inventoryInfo = inventoryInfo;
	}

	/**
	 * Dimensions of the packaged product.
	 */
	protected PackageMeasurements measurements;

	public PackageMeasurements getMeasurements() {
		return this.measurements;
	}

	public void setMeasurements(PackageMeasurements measurements) {
		this.measurements = measurements;
	}

	/**
	 * List of option attributes configured for an object. These values are associated and used by products, product bundles, and product types.
	 */
	protected List<ProductOption> options;
	public List<ProductOption> getOptions() {
		return this.options;
	}
	public void setOptions(List<ProductOption> options) {
		this.options = options;
	}

	/**
	 * Unit price that the tenant intends to sell the product if no sale price is set.
	 */
	protected ProductPrice price;

	public ProductPrice getPrice() {
		return this.price;
	}

	public void setPrice(ProductPrice price) {
		this.price = price;
	}

	/**
	 * For products with options that vary the cost of the product, the range between lowest and highest possible price of the product based on the current selection of options.
	 */
	protected ProductPriceRange priceRange;

	public ProductPriceRange getPriceRange() {
		return this.priceRange;
	}

	public void setPriceRange(ProductPriceRange priceRange) {
		this.priceRange = priceRange;
	}

	/**
	 * Properties that describe the behavior the system uses when determining the price of products.
	 */
	protected ProductPricingBehaviorInfo pricingBehavior;

	public ProductPricingBehaviorInfo getPricingBehavior() {
		return this.pricingBehavior;
	}

	public void setPricingBehavior(ProductPricingBehaviorInfo pricingBehavior) {
		this.pricingBehavior = pricingBehavior;
	}

	/**
	 * Collection of property attributes defined for the object. Properties are associated to all objects within Mozu, including documents, products, and product types.
	 */
	protected List<ProductProperty> properties;
	public List<ProductProperty> getProperties() {
		return this.properties;
	}
	public void setProperties(List<ProductProperty> properties) {
		this.properties = properties;
	}

	/**
	 * The current state of the configured product determines whether or not the product is eligible for purchase. Products with options are only purchasable if the shopper has selected all required options. If the product is not ready for purchase, a message lists missing options that are required.
	 */
	protected ProductPurchasableState purchasableState;

	public ProductPurchasableState getPurchasableState() {
		return this.purchasableState;
	}

	public void setPurchasableState(ProductPurchasableState purchasableState) {
		this.purchasableState = purchasableState;
	}

}
