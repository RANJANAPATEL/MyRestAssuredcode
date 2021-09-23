package restApiassignment;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import jdk.nashorn.internal.ir.RuntimeNode.Request;
import junit.framework.Assert;

public class GetAccessBlocksStatus {
	
	@Test
	public void getAccessBlocks()
	{
		RestAssured.baseURI = "https://api.imgur.com";
		RequestSpecification http_request = RestAssured.given()
				    .header("Authorization","Bearer 7c70899a08c992189109ab4049e955ef587aaa42")
				    .header("Accept","application/vnd.api+json");
		Response response = http_request.request(Method.GET,"/account/v1/Ranjana1995/block");  
		//System.out.println(response.asString());
		
		//System.out.println(response.getBody());
		
		Headers allHeaders = response.getHeaders();
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
		//System.out.println(respString);
		
		JsonPath js = new JsonPath(respString);
		System.out.println(js.get("data"));
		
		int code = response.getStatusCode();
		System.out.println(response.getStatusCode());
		
		Assert.assertEquals(code, 200);

		System.out.println(response.getStatusLine());
}
}