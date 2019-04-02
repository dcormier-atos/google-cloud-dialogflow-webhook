/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The text response message.
 * @author DCR
 *
 */
@JsonInclude(Include.NON_NULL)
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
