/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

/**
 * The text response message.
 * @author DCR
 *
 */
public class Text {

	/**
	 * Optional. The collection of the agent's responses.
	 */
	private String[] text;
	
	/**
	 * 
	 */
	public Text() {
		super();
	}

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}

}
