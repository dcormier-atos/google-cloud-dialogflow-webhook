/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

/**
 * The simple response message containing speech or text.
 * @author DCR
 *
 */
public class SimpleResponse {

	/**
	 * One of text_to_speech or ssml must be provided. The plain text of the speech output. 
	 * Mutually exclusive with ssml.
	 */
	private String textToSpeech;
	
	/**
	 *One of text_to_speech or ssml must be provided. Structured spoken response to the user in the SSML format. 
	 *Mutually exclusive with text_to_speech
	 */
	private String ssml;
	
	/**
	 * Optional. The text to display.
	 */
	private String displayText;
	

	public String getTextToSpeech() {
		return textToSpeech;
	}

	public void setTextToSpeech(String textToSpeech) {
		this.textToSpeech = textToSpeech;
	}

	public String getSsml() {
		return ssml;
	}

	public void setSsml(String ssml) {
		this.ssml = ssml;
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
}
