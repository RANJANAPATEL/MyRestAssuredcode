package com.api.custom;

import io.restassured.http.Headers;

public class CustomReq extends BaseApi{
	private String resource;
	private String requestBody;
	private Headers requestHeader;
	private String httpVerb;
	
	public CustomReq(String resource, String requestBody, Headers requestHeader, String httpVerb)
	{
		super();
		this.resource = resource;
		this.requestBody = requestBody;
		this.requestHeader = requestHeader;
		this.httpVerb  = httpVerb;
		
	}
	
		public void requests()
		{
			if(httpVerb.equalsIgnoreCase("post"))
			{
				request.body(requestBody);
				
				response = request.post(resource);
			}else if(httpVerb.equalsIgnoreCase("get")) {
				response = request.get(resource);
				
			}else if(httpVerb.equalsIgnoreCase("put")) {
				request.body(requestBody);
				response = request.put(resource);
			}else if(httpVerb.equalsIgnoreCase("delete")) {
				response = request.put(resource);
		}else {
			System.out.println("Invalid HTTP verb!");
		}}
		
		public String responseBody() {
			return response.asString();
		}
		public int responsecCode() {
			return response.getStatusCode();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
