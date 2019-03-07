Java Library to create API for Dialogflow v2 Webhook
======================================

Java library  for [Dialogflow][dialogflow] Webhook API.


- [Dialogflow Fullfillment Documentation][dialogflow-docs]

> Note: This client is a work-in-progress, and may occasionally
> make backwards-incompatible changes.

Quickstart
----------

[//]: # ({x-version-update-start:google-cloud-dialogflow:released})
If you are using Maven, add this to your pom.xml file
```xml
<dependency>
  <groupId>com.google.cloud</groupId>
  <artifactId>google-cloud-dialogflow-webhook</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>
```

[//]: # ({x-version-update-end})



About Dialogflow
----------------

[Dialogflow][dialogflow] is an enterprise-grade NLU platform that makes it easy for developers to design and integrate conversational user interfaces into mobile apps, web applications, devices, and bots.



Getting Started
---------------
#### Prerequisites
You will need to create a Java Web application for hosting you Webhook API.

You can create this application with [Spring Boot Framework] [springboot] and Web module  

#### Usage
First you need to create a REST Controleur with a POST Mapping methode 

```java
@RestController
public class MyFulfillmentApi {
	
	
	@PostMapping("/api/v1/mywebhook")
    public WebhookResponse mywebhook(@RequestBody WebhookRequest request) {
		
		// Code of my Webhook
	}
```

You must use the WebhookRequest and WebhookResponse include in this library to automaticaly mapping JSON message send and receive by Dialogflow (API v2).

And you can manipulate Java Model include in this library without manipulate JSON objects.

For exemple, you can extract "action" property to know witch Action is ask on the Dialogflow Intent :
```java
	
	@PostMapping("/api/v1/mywebhook")
    public WebhookResponse mywebhook(@RequestBody WebhookRequest request) {
		
		WebhookResponse response = new WebhookResponse();
		
		if ( "action1".equals( request.getQueryResult().getAction() )  ) {
			// Code of action1 (configured in Dialogflow Intent)
			String cityNameFromAgent = request.getQueryResult().getParameters().get("cityName");
			...	

			response.setFulfillmentText("This is my personnal response ! ");
		}
		
		
		return response;
	}
```


Java Versions
-------------

Java 8 or above is required for using this library.



License
-------

Apache 2.0 - See [LICENSE] for more information.



[LICENSE]: https://www.apache.org/licenses/LICENSE-2.0
[dialogflow]: https://dialogflow.com/
[springboot]: https://spring.io/projects/spring-boot/
[dialogflow-docs]: https://dialogflow.com/docs/fulfillment/how-it-works
