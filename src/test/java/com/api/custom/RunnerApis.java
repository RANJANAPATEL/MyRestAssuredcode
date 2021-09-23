package com.api.custom;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class RunnerApis {
	@Test
	public void method()
	{
		//RequestSpecification header1 = RestAssured.given();
		Header h1 = new  Header("Accept","application/json");
		Header h2 = new  Header("Content-Type","application/json");
		Header h3 = new  Header("Authorization", "Bearer da0063638b583d4c10b70c21ab7cddcda400987ebf4c352528e7f6542aa0e79d");
		
		List<Header> list = new ArrayList<Header>();
		list.add(h1);
		list.add(h2);
		list.add(h3);

		Headers header = new Headers(list);
		CustomReq c1 = new CustomReq("/public/v1/users/123",
				"{\r\n" + "  \"name\": \"krishna\", \r\n" + " \"email\":\"tena.krishna@15ce.com\", \r\n" + "\"gender\":\"male\",\r\n" + " \"status\":\"active\"\r\n" + "}"
						, header, "post");
		
		c1.requests();
		System.out.println(c1.responsecCode());
		System.out.println(c1.responseBody());
		CustomReq c2 = new CustomReq("/public/v1/users/124",
				"{\r\n" + "  \"name\": \"Allasani Peddana\", \r\n"  + " \"email\":\"allasani.peddana@15ce.com\",\r\n" + "\"gender\":\"male\",\r\n" + " \"status\":\"active\"\r\n" + "}"
						, header, "put");
		c2.requests();
		System.out.println(c2.responsecCode());
		System.out.println(c2.responseBody());
		
		CustomReq c3 = new CustomReq("/public/v1/users/1720",null,  header, "delete");

		c3.requests();
		System.out.println(c3.responsecCode());
		System.out.println(c3.responseBody());
		
		
		
		
		
		
	}}
