/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Test of WebhookResponse load from json file
 * @author DCR
 *
 */
public class WebhookResponseTest {

	// request result
	static WebhookResponse response;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		try {
			File jsonFile = new File("src/test/resources/sample-response.json");
			if ( jsonFile != null  ) {
				System.out.println("WebhookRequestTest - load json file ...");
				//Object to JSON in file
				response = mapper.readValue(jsonFile, WebhookResponse.class);
			} else {
				System.err.println("WebhookRequestTest - json file not found ...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		
	}

	/**
	 * Test method for {@link google.cloud.dialogflow.webhook.context.WebhookResponse}.
	 */
	@Test
	public void testMapping() {
		try {
			
			System.out.println( "Payload Google : " + response.getPayload().get("google"))	;		
			System.out.println( "Payload facebook : " + response.getPayload().get("facebook"))	;	
			
			assertNotNull("WebhookResponse is null", response);
			assertEquals("Payload('facebook')",((HashMap)response.getPayload().get("facebook")).get("text"),  "Hello, Facebook!");
			assertEquals("Payload('google')",((HashMap)response.getPayload().get("google")).get("expectUserResponse"), true);
			assertEquals("FulfillmentText",response.getFulfillmentText(),  "This is a text response");
			assertEquals("FulfillmentMessage[0].Card.Title",response.getFulfillmentMessages()[0].getCard().getTitle(),  "card title");
			assertEquals("FulfillmentMessage[0].Card.subtitle",response.getFulfillmentMessages()[0].getCard().getSubtitle(),  "card text");
			assertEquals("FulfillmentMessage[0].Card.imageUri",response.getFulfillmentMessages()[0].getCard().getImageUri(),  "https://assistant.google.com/static/images/molecule/Molecule-Formation-stop.png");
			assertEquals("FulfillmentMessage[0].Card.buttons[0].text",response.getFulfillmentMessages()[0].getCard().getButtons()[0].getText(),  "button text");
			assertEquals("FulfillmentMessage[0].Card.buttons[0].postback",response.getFulfillmentMessages()[0].getCard().getButtons()[0].getPostback(),  "https://assistant.google.com/");
			assertEquals("Source",response.getSource(),  "example.com");
			assertEquals("OutputContexts[0].name",response.getOutputContexts()[0].getName(),  "projects/${PROJECT_ID}/agent/sessions/${SESSION_ID}/contexts/context name");
			assertEquals("OutputContexts[0].lifespanCount",response.getOutputContexts()[0].getLifespanCount(),  5);
			assertEquals("OutputContexts[0].parameters.get('param')",response.getOutputContexts()[0].getParameters().get("param"),  "param value");
			
		} catch (Exception e) {
			fail("Exception : " + e.getMessage());
		}
	}

}
