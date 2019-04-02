/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Corresponds to the Response field in the Dialogflow console
 * 
 * @author DCR
 *
 */
@JsonInclude(Include.NON_NULL)
public class Message {
	
	

	/**
	 * The text response.
	 */
	 private Text text;
	 
	 /**
	  * The image response
	  */
	 private Image image;
	 
	 /**
	  * The quick replies response.
	  */
	 private QuickReplies quickReplies;
	 
	 /**
	  * The card response
	  */
	 private Card card;
	 
	 /**
	  * Returns a response containing a custom, platform-specific payload. 
	  */
	 private HashMap<String, Object> payload;
	 
	 /**
	  * The voice and text-only responses for Actions on Google.
	  */
	 private SimpleResponses simpleResponses;
	 
	 /**
	  * The basic card response for Actions on Google.
	  */
	 private BasicCard basicCard;
	 
	 /**
	  * The suggestion chips for Actions on Google.
	  */
	 private Suggestions suggestions;
	 
	 public Message() {
			super();
		}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public QuickReplies getQuickReplies() {
		return quickReplies;
	}

	public void setQuickReplies(QuickReplies quickReplies) {
		this.quickReplies = quickReplies;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public HashMap<String, Object> getPayload() {
		return payload;
	}

	public void setPayload(HashMap<String, Object> payload) {
		this.payload = payload;
	}

	public SimpleResponses getSimpleResponses() {
		return simpleResponses;
	}

	public void setSimpleResponses(SimpleResponses simpleResponses) {
		this.simpleResponses = simpleResponses;
	}

	public BasicCard getBasicCard() {
		return basicCard;
	}

	public void setBasicCard(BasicCard basicCard) {
		this.basicCard = basicCard;
	}

	public Suggestions getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(Suggestions suggestions) {
		this.suggestions = suggestions;
	}
	 
	 
	
}
