/**
 * 
 */
package google.cloud.dialogflow.webhook.context;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Test of WebhookRequest load from json file
 * @author DCR
 *
 */
public class WebhookRequestTest {

	// request result
	static WebhookRequest request;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		try {
			File jsonFile = new File("src/test/resources/sample-request.json");
			
			if ( jsonFile != null  ) {
				System.out.println("WebhookRequestTest - load json file ...");
				//Object to JSON in file
				request = mapper.readValue(jsonFile, WebhookRequest.class);
			} else {
				System.err.println("WebhookRequestTest - json file not found ...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		
	}

	/**
	 * Test method for {@link google.cloud.dialogflow.webhook.context.WebhookRequest}.
	 */
	@Test
	public void testMapping() {
		try {
			assertNotNull("WebhookRequest is null", request);
			assertEquals("ResponseId",request.getResponseId(),  "cb6f5ec2-c26e-4349-b561-a9ddd6a0e495");
			assertEquals("Session",request.getSession(),  "projects/${DIALOGFLOW_PROJECT_ID}/agent/sessions/1519609128253");
			assertEquals("QueryResult.QueryText",request.getQueryResult().getQueryText(),  "actions_intent_CONFIRMATION");
			assertEquals("QueryResult.Action",request.getQueryResult().getAction(),  "Dialogflow action name of matched intent");
			assertEquals("QueryResult.OutputContexts[0].name",request.getQueryResult().getOutputContexts()[0].getName(),  "projects/${DIALOGFLOW_PROJECT_ID}/agent/sessions/1519609128253/contexts/actions_intent_confirmation");
			assertEquals("QueryResult.OutputContexts[0].parameters.get(CONFIRMATION]",request.getQueryResult().getOutputContexts()[0].getParameters().get("CONFIRMATION"),  true);
			assertEquals("QueryResult.Intent.DisplayName",request.getQueryResult().getIntent().getDisplayName(),  "Dialogflow action name of matched intent");
			assertEquals("QueryResult.LanguageCode",request.getQueryResult().getLanguageCode(),  "en-us");
			assertEquals("QueryResult.FulfillmentText",request.getQueryResult().getFulfillmentText(),  "Can you say that again?");
			assertEquals("QueryResult.FulfillmentMessages[0].text.text[0]",request.getQueryResult().getFulfillmentMessages()[0].getText().getText()[0],  "Can you say that again?");
			
		} catch (Exception e) {
			fail("Exception : " + e.getMessage());
		}
	}

}
