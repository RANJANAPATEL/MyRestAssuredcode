package restApiassignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class DelDeleteAccountBlock {
	
	
	@Test
	public void removeAccountBlock()
	{
		RestAssured.baseURI= "https://api.imgur.com";
		RequestSpecification http_request = RestAssured.given()
				    .header("Authorization","Bearer 7c70899a08c992189109ab4049e955ef587aaa42")
				    .header("Accept","application/vnd.api+json");
		Response response = http_request.request(Method.DELETE,"/account/v1/Ranjana1995/block");  
		Headers allHeaders = response.getHeaders();
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		
		for(Header header:allHeaders)
		{
			System.out.println("key:  "+ header.getName() + ",   value:   "+ header.getValue());
		}
		
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		String id = response.getSessionId();
		System.out.println("Session ID:   "+ id);
		String contentType = response.getContentType();
		System.out.println("Content Type:   "+ contentType);
		
		String respString = response.asString();
		
		int code = response.getStatusCode();

		Assert.assertEquals(code, 204);
		System.out.println(response.getStatusLine());
		
		
		
	}

}
