package google.cloud.dialogflow.webhook.context;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The response message of a webhook call.
 * @author DCR
 *
 */
@JsonInclude(Include.NON_NULL)
public class WebhookResponse {

	/**
	 * Optional. The text to be shown on the screen.
	 */
	private String fulfillmentText = null;
	
	/**
	 * Optional. The collection of rich messages to present to the user. 
	 * This value is passed directly to QueryResult.fulfillment_messages.
	 */
	private Message[] fulfillmentMessages = null;
	
	
	/**
	 * Optional. The collection of output contexts. 
	 * This value is passed directly to QueryResult.output_contexts.
	 */
	private Context[] outputContexts = null;
	
	/**
	 * Optional. This value is passed directly to QueryResult.webhook_source
	 */
	private String source = null;
	
	/**
	 * Optional. This value is passed directly to QueryResult.webhook_payload.
	 */
	private HashMap<String, Object> payload = null; 
	
	
	
	
	/**
	 * 
	 */
	public WebhookResponse() {
		super();
	}
	
	/**
	 * Build a WebhookResponse from the request
	 * copy some information from the request to the response
	 */
	public WebhookResponse(WebhookRequest request) {
		if ( request != null && request.getQueryResult() != null) {
			this.fulfillmentMessages = request.getQueryResult().getFulfillmentMessages();
			this.fulfillmentText = request.getQueryResult().getFulfillmentText();
			this.outputContexts = request.getQueryResult().getOutputContexts();
		}
		
		
	}




	public String getFulfillmentText() {
		return fulfillmentText;
	}



	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public Message[] getFulfillmentMessages() {
		return fulfillmentMessages;
	}



	public void setFulfillmentMessages(Message[] fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}



	public Context[] getOutputContexts() {
		return outputContexts;
	}



	public void setOutputContexts(Context[] outputContexts) {
		this.outputContexts = outputContexts;
	}



	public HashMap<String, Object> getPayload() {
		return payload;
	}



	public void setPayload(HashMap<String, Object> payload) {
		this.payload = payload;
	}

	

}
