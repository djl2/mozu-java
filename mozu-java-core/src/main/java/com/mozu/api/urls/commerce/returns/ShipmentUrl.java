/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.returns;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ShipmentUrl
{

	/**
	 * Get Resource Url for GetShipment
	 * @param responseFields 
	 * @param returnId Unique identifier of the return associated with the replacement shipment to retrieve.
	 * @param shipmentId Unique identifier of the return replacement shipment to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getShipmentUrl(String responseFields, String returnId, String shipmentId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/shipments/{shipmentId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		formatter.formatUrl("shipmentId", shipmentId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatePackageShipments
	 * @param returnId Unique identifier of the return for which to create replacement package shipments.
	 * @return   String Resource Url
	 */
	public static MozuUrl createPackageShipmentsUrl(String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/shipments");
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteShipment
	 * @param returnId Unique identifier of the return associated with the replacement shipment to delete.
	 * @param shipmentId Unique identifier of the return replacement shipment to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteShipmentUrl(String returnId, String shipmentId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/shipments/{shipmentId}");
		formatter.formatUrl("returnId", returnId);
		formatter.formatUrl("shipmentId", shipmentId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

