/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

import java.util.HashMap;

/**
 * Struct represents a structured data value, consisting of fields which map to dynamically typed values
 * @author DCR
 *
 */
public class Struct {

	/**
	 * Map of fields.
	 */
	private HashMap<String, Object> fields;
	
	/**
	 * Constructeor
	 */
	public Struct() {
		super();
	}

	public HashMap<String, Object> getFields() {
		return fields;
	}

	public void setFields(HashMap<String, Object> fields) {
		this.fields = fields;
	}

}
