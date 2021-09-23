package com.json.in;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class GetReqUsingJsonObject {

	@Test

	public void getReqUsingJsonobj()
	{
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request = RestAssured.given()
				.header("Accept","application/json")
				.header("Content-Type","application/json");

		//Response response =request.given().contentType(ContentType.JSON).log().all().get("/public/v1/users/");
		Response response = request.request(Method.GET,"public/v1/users");  
		
		
		String respString = response.asString();
		//System.out.println(respString);
		
		JsonPath js = new JsonPath(respString);
		System.out.println(js.get("data"));
		System.out.println(js.get("data.id."));
		System.out.println(js.get("data.name"));
		
		
		int code = response.getStatusCode();
		System.out.println(response.getStatusCode());
		
		Assert.assertEquals(code, 200);
		
		
		
		
	}

}
