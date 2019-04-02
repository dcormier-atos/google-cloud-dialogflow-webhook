/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Contains information about a button.
 * @author DCR
 *
 */
@JsonInclude(Include.NON_NULL)
public class Button {
	
	/**
	 * Optional. The text to show on the button
	 */
	private String text;
	
	/**
	 * Optional. The text to send back to the Dialogflow API or a URI to open.
	 */
	private String postback;

	/**
	 * 
	 */
	public Button() {
		super();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPostback() {
		return postback;
	}

	public void setPostback(String postback) {
		this.postback = postback;
	}

}
