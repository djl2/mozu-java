/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCodeRename implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String existingProductCode;

	public String getExistingProductCode() {
		return this.existingProductCode;
	}

	public void setExistingProductCode(String existingProductCode) {
		this.existingProductCode = existingProductCode;
	}

	protected String newProductCode;

	public String getNewProductCode() {
		return this.newProductCode;
	}

	public void setNewProductCode(String newProductCode) {
		this.newProductCode = newProductCode;
	}

}