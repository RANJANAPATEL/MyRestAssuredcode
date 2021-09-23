package com.RestApi.test;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class CreateJSONObject {

public 	void testjsonobject()
	
{	
		JSONObject jo = new JSONObject();
		jo.put("status", "success");
		jo.put("message", "Successfully All records has been fatched");
		
		JSONArray ja = new JSONArray();
		JSONObject jo1 = new JSONObject();
		
		jo1.put("id",  "1");
		jo1.put("employee_name", "Tiger Nixon");
		jo1.put("employee_salary", "320800");
		jo1.put("employee_age","61");
		jo1.put("profile_image",""); 
		JSONObject jo2 = new JSONObject();
		
		jo2.put("id",  "2");
		jo2.put("employee_name", "dummy");
		jo2.put("employee_salary", "77663");
		jo.put("employee_age","20");
		jo1.put("profile_image",""); 
		ja.add(jo1);
		jo.put("data", ja);
		
		int spacesToIndentEachLevel = 2;
	//new JSONObject(jsonString).toString(spacesToIndentEachLevel);
		System.out.println(jo.toString());
		
		//message = (JSON) jo.prettyprint(message)
	
	
     }}	
	
	
		
	
		
			  
				


