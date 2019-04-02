/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Represents a context.
 * 
 * @author DCR
 *
 */
@JsonInclude(Include.NON_NULL)
public class Context {

	/**
	 * The unique identifier of the context
	 */
	private String name;
	
	/**
	 * Optional. The number of conversational query requests after which the context expires. If set to 0 (the default) the context expires immediately. 
	 * Contexts expire automatically after 20 minutes if there are no matching queries.
	 */
	private int lifespanCount = 0;
	
	/**
	 * Optional. The collection of parameters associated with this context
	 */
	private HashMap<String, Object> parameters;
	
	/**
	 * Constructor
	 */
	public Context() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifespanCount() {
		return lifespanCount;
	}

	public void setLifespanCount(int lifespanCount) {
		this.lifespanCount = lifespanCount;
	}

	public HashMap<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(HashMap<String, Object> parameters) {
		this.parameters = parameters;
	}

	

}
