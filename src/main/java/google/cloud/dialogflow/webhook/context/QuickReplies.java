/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

/**
 * The quick replies response message
 * @author DCR
 *
 */
public class QuickReplies {

	/**
	 * Optional. The title of the collection of quick replies.
	 */
	private String title; 
	
	/**
	 * Optional. The collection of quick replies.
	 */
	private String[] quickReplies; 
	
	/**
	 * 
	 */
	public QuickReplies() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getQuickReplies() {
		return quickReplies;
	}

	public void setQuickReplies(String[] quickReplies) {
		this.quickReplies = quickReplies;
	}

}
