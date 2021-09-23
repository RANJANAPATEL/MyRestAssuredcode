package restApiassignment;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PostCreateAccountBlock {
	@Test
	
	public void createAccountBlock()
	{
		RestAssured.baseURI= "https://api.imgur.com";
		RequestSpecification http_request = RestAssured.given()
				    .header("Authorization","Bearer 7c70899a08c992189109ab4049e955ef587aaa42")
				    .header("Accept","application/vnd.api+json");
		Response response = http_request.request(Method.POST,"/account/v1/ghostinspector/block");  
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		
		
		Headers allHeaders = response.getHeaders();
		for(Header header:allHeaders)
		{
			System.out.println("key:  "+ header.getName() + ",   value:   "+ header.getValue());
		}
		String id = response.getSessionId();
		System.out.println("Session ID:   "+ id);
		String contentType = response.getContentType();
		System.out.println("Content Type:   "+ contentType);
		
		int code = response.getStatusCode();
		System.out.println(response.getStatusCode());
		
		Assert.assertEquals(code, 201);

		System.out.println(response.getStatusLine());


	}
		

}
