package google.cloud.dialogflow.webhook.context;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The collection of suggestions.
 * @author DCR
 *
 */
@JsonInclude(Include.NON_NULL)
public class Suggestions {
	
	/**
	 * Required. The list of suggested replies.
	 */
	private Suggestion[] suggestions;

	public Suggestions() {
		super();
	}

	

	public Suggestion[] getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(Suggestion[] suggestions) {
		this.suggestions = suggestions;
	}
}
