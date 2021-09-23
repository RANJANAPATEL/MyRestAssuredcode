package com.json.in;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequsingJsonObject {
	@Test
	public void putRequsingjson()
	{
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request = RestAssured.given()
				.header("Content-Type","application/json")
				.header("Authorization","Bearer da0063638b583d4c10b70c21ab7cddcda400987ebf4c352528e7f6542aa0e79d");
		JSONObject obj = new JSONObject();
	    obj.put("name","Allasani Peddana");
	    obj.put("email", "allasani.peddana@15ce.com");
	    obj.put("status", "active");
	    
	    Response response = request.request(Method.PUT,"/public/v1/users/122");  
		String responseBody  = response.getBody().asString();
				System.out.println("Response Body:" +responseBody);
				

				System.out.println(response.getStatusLine());
				int code = response.getStatusCode();
				System.out.println(response.getStatusCode());
				
				Assert.assertEquals(code, 200);
		
	}

}
