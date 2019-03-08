package google.cloud.dialogflow.webhook.context;

/**
 * The request message for a webhook call.
 * 
 * @author DCR
 *
 */
public class WebhookRequest {
	
	/**
	 * The unique identifier of the response
	 */
	private String responseId;
	
	/**
	 * The unique identifier of detectIntent request session
	 */
	private String session;
	
	/**
	 * The result of the conversational query or event processing
	 */
	private QueryResult queryResult;
	
	/**
	 * Optional. The contents of the original request that was passed
	 */
	private OriginalDetectIntentRequest originalDetectIntentRequest;

	/**
	 * 
	 */
	public WebhookRequest() {
		super();
	}

	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public QueryResult getQueryResult() {
		return queryResult;
	}

	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

	public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
		return originalDetectIntentRequest;
	}

	public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
		this.originalDetectIntentRequest = originalDetectIntentRequest;
	}

}
