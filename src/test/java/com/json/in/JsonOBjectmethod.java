package com.json.in;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class JsonOBjectmethod {
	
	
	@Test
	public static void createJsonObjetPost()
	{
		RequestSpecification myreq = RestAssured.given();
		myreq.header("Accept","application/json");
		myreq.header("Content-Type","application/json");
		
	}

}
