/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

/**
 * The suggestion chip message that the user can tap to quickly post a reply to the conversation.
 * @author DCR
 *
 */
public class Suggestion {

	/**
	 * Required. The text shown the in the suggestion chip.
	 */
	private String title;
	
	/**
	 * 
	 */
	public Suggestion() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
