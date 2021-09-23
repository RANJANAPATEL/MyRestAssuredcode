package com.json.in;

import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostusingJsonObject {
	
	@Test
	public void PostreqUsingJsonObject()
	{
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request = RestAssured.given()
				.header("Content-Type","application/json")
				.header("Authorization","Bearer da0063638b583d4c10b70c21ab7cddcda400987ebf4c352528e7f6542aa0e79d");
		Response response = request.request(Method.POST,"/public/v1/users");
		
		//String respString = response.asString();
		
		JSONObject obj = new JSONObject();
		obj.put("name","Tenali Ramakrishna");
		obj.put("gender","male");
		obj.put("email","tenali.ramakrishna@17ce.com");
		obj.put("status","active");
     //given().body(obj.toString());
		
		
		
		
		String responseBody = response.getBody().asString();
		
		System.out.println("Response Body:" +responseBody);
		System.out.println(response.getStatusCode());
	}

}
