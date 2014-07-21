/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.SiteSearchRelevancyCustomField;
import com.mozu.api.contracts.productadmin.SiteSearchKeywordRelevancySettings;
import com.mozu.api.contracts.productadmin.SiteSearchPhraseRelevancySettings;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteSearchSettings implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected List<String> customBoosts;
	public List<String> getCustomBoosts() {
		return this.customBoosts;
	}
	public void setCustomBoosts(List<String> customBoosts) {
		this.customBoosts = customBoosts;
	}

	protected Boolean isDefault;

	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	protected String settingsName;

	public String getSettingsName() {
		return this.settingsName;
	}

	public void setSettingsName(String settingsName) {
		this.settingsName = settingsName;
	}

	protected List<SiteSearchRelevancyCustomField> customFields;
	public List<SiteSearchRelevancyCustomField> getCustomFields() {
		return this.customFields;
	}
	public void setCustomFields(List<SiteSearchRelevancyCustomField> customFields) {
		this.customFields = customFields;
	}

	protected SiteSearchKeywordRelevancySettings siteKeywordRelevancy;

	public SiteSearchKeywordRelevancySettings getSiteKeywordRelevancy() {
		return this.siteKeywordRelevancy;
	}

	public void setSiteKeywordRelevancy(SiteSearchKeywordRelevancySettings siteKeywordRelevancy) {
		this.siteKeywordRelevancy = siteKeywordRelevancy;
	}

	protected SiteSearchPhraseRelevancySettings sitePhraseRelevancy;

	public SiteSearchPhraseRelevancySettings getSitePhraseRelevancy() {
		return this.sitePhraseRelevancy;
	}

	public void setSitePhraseRelevancy(SiteSearchPhraseRelevancySettings sitePhraseRelevancy) {
		this.sitePhraseRelevancy = sitePhraseRelevancy;
	}

}
