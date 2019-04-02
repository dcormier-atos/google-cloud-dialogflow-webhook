package google.cloud.dialogflow.webhook.context;

import java.util.HashMap;

/**
 * Represents the result of conversational query or event processing.
 * 
 * @author DCR
 *
 */
public class QueryResult {

	/**
	 * The original conversational query text
	 */
	private String queryText = null;
	
	/**
	 * The language that was triggered during intent detection
	 */
	private String languageCode;
	
	/**
	 * The Speech recognition confidence between 0.0 and 1.0
	 */
	private Float speechRecognitionConfidence;
	
	/**
	 * The action name from the matched intent.
	 */
	private String action;
	
	
	/**
	 * The text to be pronounced to the user or shown on the screen
	 */
	private String fulfillmentText;
	
	/**
	 * The collection of extracted parameters.
	 */
	private HashMap<String, Object> parameters;
	
	/**
	 * This field is set to: - false if the matched intent has required parameters 
	 * and not all of the required parameter values have been collected. 
	 * - true if all required parameter values have been collected, 
	 * or if the matched intent doesn't contain any required parameters. 
	 */
	private boolean allRequiredParamsPresent;
	
	/**
	 * The collection of rich messages to present to the user.
	 */
	private Message[] fulfillmentMessages = null;
	
	/**
	 * If the query was fulfilled by a webhook call, 
	 * this field is set to the value of the source field returned in the webhook response
	 */
	private String webhookSource;
	
	
	/**
	 * The collection of output contexts
	 */
	private Context[] outputContexts = null;
	
	/**
	 * The intent that matched the conversational query
	 */
	private Intent intent;
	
	/**
	 * The intent detection confidence. Values range from 0.0 (completely uncertain) to 1.0 (completely certain)
	 */
	private Float intentDetectionConfidence;
	
	/**
	 * The free-form diagnostic info. For example, this field could contain webhook call latency. 
	 * The string keys of the Struct's fields map can change without notice.
	 */
	private HashMap<String, Object> diagnosticInfo;
	
	/**
	 * Constructor
	 */
	public QueryResult() {
		parameters = new HashMap<String, Object>();
		allRequiredParamsPresent = false;
	}

	public String getQueryText() {
		return queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	

	public String getFulfillmentText() {
		return fulfillmentText;
	}

	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}

	public boolean isAllRequiredParamsPresent() {
		return allRequiredParamsPresent;
	}

	public void setAllRequiredParamsPresent(boolean allRequiredParamsPresent) {
		this.allRequiredParamsPresent = allRequiredParamsPresent;
	}

	public HashMap<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(HashMap<String, Object> parameters) {
		this.parameters = parameters;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public Float getSpeechRecognitionConfidence() {
		return speechRecognitionConfidence;
	}

	public void setSpeechRecognitionConfidence(Float speechRecognitionConfidence) {
		this.speechRecognitionConfidence = speechRecognitionConfidence;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Message[] getFulfillmentMessages() {
		return fulfillmentMessages;
	}

	public void setFulfillmentMessages(Message[] fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}

	public String getWebhookSource() {
		return webhookSource;
	}

	public void setWebhookSource(String webhookSource) {
		this.webhookSource = webhookSource;
	}

	public Intent getIntent() {
		return intent;
	}

	public void setIntent(Intent intent) {
		this.intent = intent;
	}

	public Context[] getOutputContexts() {
		return outputContexts;
	}

	public void setOutputContexts(Context[] outputContexts) {
		this.outputContexts = outputContexts;
	}

	public Float getIntentDetectionConfidence() {
		return intentDetectionConfidence;
	}

	public void setIntentDetectionConfidence(Float intentDetectionConfidence) {
		this.intentDetectionConfidence = intentDetectionConfidence;
	}

	public HashMap<String, Object> getDiagnosticInfo() {
		return diagnosticInfo;
	}

	public void setDiagnosticInfo(HashMap<String, Object> diagnosticInfo) {
		this.diagnosticInfo = diagnosticInfo;
	}

	/**
	public Float getIntentDetectionConfidence() {
		return intentDetectionConfidence;
	}

	public void setIntentDetectionConfidence(Float intentDetectionConfidence) {
		this.intentDetectionConfidence = intentDetectionConfidence;
	}
	**/
	
	

}
