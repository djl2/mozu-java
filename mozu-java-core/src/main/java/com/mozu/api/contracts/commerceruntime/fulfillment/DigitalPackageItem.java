/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.fulfillment;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DigitalPackageItem implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * This specifies the fulfillment type of digital package item.
	 */
	protected String fulfillmentItemType;

	public String getFulfillmentItemType() {
		return this.fulfillmentItemType;
	}

	public void setFulfillmentItemType(String fulfillmentItemType) {
		this.fulfillmentItemType = fulfillmentItemType;
	}

	/**
	 * Specifies the gift card code for the digital package item.
	 */
	protected String giftCardCode;

	public String getGiftCardCode() {
		return this.giftCardCode;
	}

	public void setGiftCardCode(String giftCardCode) {
		this.giftCardCode = giftCardCode;
	}

	protected Integer lineId;

	public Integer getLineId() {
		return this.lineId;
	}

	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}

	/**
	 * The unique, user-defined  product code of a product, used throughout Mozu to reference and associate to a product.
	 */
	protected String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * The specified quantity of objects and items. This property is used for numerous object types including products, options, components within a product bundle, cart and order items, returned items, shipping line items, items in a digital product. and items associated with types and reservations.
	 */
	protected Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
