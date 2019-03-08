/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

/**
 * Represents an intent. Intents convert a number of user expressions 
 * or patterns into an action. An action is an extraction of a user command or sentence semantics
 * @author DCR
 *
 */
public class Intent {

	/**
	 * The unique identifier of this intent
	 */
	private String name;
	
	/**
	 * Required. The name of this intent.
	 */
	private String displayName;
	
	/**
	 * Optional. Indicates whether this is a fallback intent.
	 */
	private boolean isFallback = false;
	
	/**
	 * Optional. Indicates whether Machine Learning is disabled for the intent.
	 */
	private boolean mlDisabled = false;
	
	/**
	 * Optional. The list of context names required for this intent to be triggered
	 */
	private String[] inputContextNames;
	
	/**
	 * Optional. The collection of event names that trigger the intent
	 */
	private String[] events;
	
	/**
	 * Optional. The name of the action associated with the intent. Note: The action name must not contain whitespaces.
	 */
	private String action;
	
	/**
	 * Optional. The collection of contexts that are activated when the intent is matched. 
	 * Context messages in this collection should not set the parameters field
	 */
	private Context[] outputContexts;
	
	/**
	 * Optional. The collection of rich messages corresponding to the Response field in the Dialogflow console.
	 */
	private Message[] messages;
	
	/**
	 * Constructor
	 */
	public Intent() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public boolean isFallback() {
		return isFallback;
	}

	public void setFallback(boolean isFallback) {
		this.isFallback = isFallback;
	}

	public boolean isMlDisabled() {
		return mlDisabled;
	}

	public void setMlDisabled(boolean mlDisabled) {
		this.mlDisabled = mlDisabled;
	}

	public String[] getInputContextNames() {
		return inputContextNames;
	}

	public void setInputContextNames(String[] inputContextNames) {
		this.inputContextNames = inputContextNames;
	}

	public String[] getEvents() {
		return events;
	}

	public void setEvents(String[] events) {
		this.events = events;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Context[] getOutputContexts() {
		return outputContexts;
	}

	public void setOutputContexts(Context[] outputContexts) {
		this.outputContexts = outputContexts;
	}

	public Message[] getMessages() {
		return messages;
	}

	public void setMessages(Message[] messages) {
		this.messages = messages;
	}

}
