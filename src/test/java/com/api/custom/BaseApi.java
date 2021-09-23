package com.api.custom;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class BaseApi {
	
	
	protected RequestSpecification request;
	protected Response response;
	
	public BaseApi()
	{
		RestAssured.baseURI= "https://gorest.co.in";
		request = RestAssured.given();
		
		
	}

}
