package restApiassignment;



import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class PutReqUpdateAccountSetting {
	
	@Test
	public void updateAccountSettings()
	{
		RestAssured.baseURI= "https://api.imgur.com";
		RequestSpecification http_request = RestAssured.given();
		http_request.header("Authorization","Bearer 0ca0ce3a369ffeda3266fb93abccbc620bd75243");
			    
		JSONObject obj = new JSONObject();
		obj.put("bio", "Long time lurker...");
		obj.put("public_images", "false");
		obj.put("messaging_enabled", "true");
		obj.put("album_privacy", "public");
		obj.put("accepted_gallery_terms", "true");
		obj.put("username", "ImgurUser");
		obj.put("show_mature", "true");
		obj.put("newsletter_subscribed" ,"true");
	
		http_request.header("Content-Type", "application/json");
		//http_request.body(obj.toJSONString());
		
		Response response = http_request.request(Method.PUT,"/3/account/Ranjana1995/settings");  
		String responseBody  = response.getBody().asString();
				System.out.println("Response Body:" +responseBody);
				
				
				System.out.println(response.getStatusLine());
				int code = response.getStatusCode();
				System.out.println(response.getStatusCode());
				
				Assert.assertEquals(code, 200);

				
				

		
				    
	}
}
