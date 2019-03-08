/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

/**
 * The image response message.
 * @author DCR
 *
 */
public class Image {

	/**
	 * Optional. The public URI to an image file
	 */
	private String imageUri;
	
	/**
	 * Optional. A text description of the image to be used for accessibility, e.g., screen readers.
	 */
	private String accessibilityText;
	
	
	public Image() {
		super();
	}


	public String getImageUri() {
		return imageUri;
	}


	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}


	public String getAccessibilityText() {
		return accessibilityText;
	}


	public void setAccessibilityText(String accessibilityText) {
		this.accessibilityText = accessibilityText;
	}

}
