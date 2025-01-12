/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.content.PublishSetSummaryResource;

/** <summary>
 * content/publishsets related resources. DOCUMENT_HERE 
 * </summary>
 */
public class PublishSetSummaryFactory
{

	public static com.mozu.api.contracts.content.PublishSetSummaryPagedCollection getPublishSets(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getPublishSets(apiContext,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.PublishSetSummaryPagedCollection getPublishSets(ApiContext apiContext, Integer pageSize, Integer startIndex, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.PublishSetSummaryPagedCollection returnObj = new com.mozu.api.contracts.content.PublishSetSummaryPagedCollection();
		PublishSetSummaryResource resource = new PublishSetSummaryResource(apiContext);
		try
		{
			returnObj = resource.getPublishSets( pageSize,  startIndex,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection getPublishSetItems(ApiContext apiContext, String code, int expectedCode) throws Exception
	{
		return getPublishSetItems(apiContext,  code,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection getPublishSetItems(ApiContext apiContext, String code, Integer pageSize, Integer startIndex, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection returnObj = new com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection();
		PublishSetSummaryResource resource = new PublishSetSummaryResource(apiContext);
		try
		{
			returnObj = resource.getPublishSetItems( code,  pageSize,  startIndex,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static Object deletePublishSet(ApiContext apiContext, String code, int expectedCode) throws Exception
	{
		return deletePublishSet(apiContext,  code,  null,  null, expectedCode);
	}

	public static Object deletePublishSet(ApiContext apiContext, String code, Boolean shouldDiscard, String responseFields, int expectedCode) throws Exception
	{
		Object returnObj = new Object();
		PublishSetSummaryResource resource = new PublishSetSummaryResource(apiContext);
		try
		{
			returnObj = resource.deletePublishSet( code,  shouldDiscard,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static Object addPublishSetItems(ApiContext apiContext, List<com.mozu.api.contracts.content.AddOrDeletePublishItem> itemsToPublish, String code, int expectedCode) throws Exception
	{
		return addPublishSetItems(apiContext,  itemsToPublish,  code,  null, expectedCode);
	}

	public static Object addPublishSetItems(ApiContext apiContext, List<com.mozu.api.contracts.content.AddOrDeletePublishItem> itemsToPublish, String code, String responseFields, int expectedCode) throws Exception
	{
		Object returnObj = new Object();
		PublishSetSummaryResource resource = new PublishSetSummaryResource(apiContext);
		try
		{
			returnObj = resource.addPublishSetItems( itemsToPublish,  code,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

}



