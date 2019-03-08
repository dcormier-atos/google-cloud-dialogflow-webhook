/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

/**
 * The basic card message. Useful for displaying information.
 * @author DCR
 *
 */
public class BasicCard {

	/**
	 * Optional. The title of the card.
	 */
	private String title;
	
	/**
	 * Optional. The subtitle of the card.
	 */
	private String sutitle;
	
	/**
	 * Required, unless image is present. The body text of the card.
	 */
	private String formattedText;
	
	/**
	 * Optional. The image for the card.
	 */
	private Image image;
	
	/**
	 * Optional. The collection of card buttons
	 */
	private Button[] buttons;
	
	
	/**
	 * 
	 */
	public BasicCard() {
		super();
		
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSutitle() {
		return sutitle;
	}


	public void setSutitle(String sutitle) {
		this.sutitle = sutitle;
	}


	public String getFormattedText() {
		return formattedText;
	}


	public void setFormattedText(String formattedText) {
		this.formattedText = formattedText;
	}


	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}


	public Button[] getButtons() {
		return buttons;
	}


	public void setButtons(Button[] buttons) {
		this.buttons = buttons;
	}

}
