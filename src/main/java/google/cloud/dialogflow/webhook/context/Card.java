/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The card response message.
 * @author DCR
 *
 */
@JsonInclude(Include.NON_NULL)
public class Card {

	/**
	 * Optional. The title of the card.
	 */
	private String title;
	
	/**
	 * Optional. The subtitle of the card.
	 */
	private String subtitle;
	
	/**
	 * Optional. The public URI to an image file for the card.
	 */
	private String imageUri;
	
	/**
	 * Optional. The collection of card buttons
	 */
	private Button[] buttons;
	
	/**
	 * 
	 */
	public Card() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public Button[] getButtons() {
		return buttons;
	}

	public void setButtons(Button[] buttons) {
		this.buttons = buttons;
	}

}
