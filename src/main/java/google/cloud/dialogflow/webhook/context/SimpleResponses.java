/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

/**
 * The collection of simple response candidates
 * @author DCR
 *
 */
public class SimpleResponses {
	
	/**
	 * Required. The list of simple responses.
	 */
	private SimpleResponse[] simpleResponses;

	public SimpleResponse[] getSimpleResponses() {
		return simpleResponses;
	}

	public void setSimpleResponses(SimpleResponse[] simpleResponses) {
		this.simpleResponses = simpleResponses;
	}

}
