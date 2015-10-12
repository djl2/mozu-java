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
import com.mozu.api.contracts.productruntime.FacetValue;

/**
 *	Properties of the facet used to retrieve documents.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Facet implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The type of facet. Valid values are "range" (enables creation of a range of values) or "value" (populates the facet values based on the associated attribute or category).
	 */
	protected String facetType;

	public String getFacetType() {
		return this.facetType;
	}

	public void setFacetType(String facetType) {
		this.facetType = facetType;
	}

	/**
	 * The field name associated with the facet.
	 */
	protected String field;

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
	}

	/**
	 * Descriptive text used as a label for objects, such as field names, facets, date ranges, contact information, and package information.
	 */
	protected String label;

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * List of value data for objects.
	 */
	protected List<FacetValue> values;
	public List<FacetValue> getValues() {
		return this.values;
	}
	public void setValues(List<FacetValue> values) {
		this.values = values;
	}

}
