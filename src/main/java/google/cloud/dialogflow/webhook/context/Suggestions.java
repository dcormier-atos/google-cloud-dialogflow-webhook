package google.cloud.dialogflow.webhook.context;

/**
 * The collection of suggestions.
 * @author DCR
 *
 */
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
