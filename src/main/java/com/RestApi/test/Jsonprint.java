package com.RestApi.test;
import org.json.JSONException;
import org.json.JSONObject;

public class Jsonprint {

	
 public static void main(String[] args) throws JSONException {
		        String json = "{status:success, message:Successfully! All records have been fetched,"
		        		+ " data:[{id:1, employee_name:Tiger Nixon, employee_salary:564646,employee_age:61,profile_image:'' },"
		        		+ "{id:2,employee_name:dummy, employee_salary:77663,employee_age:20,profile_image:'' }]}";
		        System.out.println(new JSONObject(json).toString(4));
		    }
		}


