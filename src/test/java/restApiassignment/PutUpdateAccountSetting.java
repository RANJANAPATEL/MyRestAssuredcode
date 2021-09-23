package restApiassignment;

import org.asynchttpclient.Param;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PutUpdateAccountSetting {
	
	@Test
	public void updateAccountSettings()
	{
		RestAssured.baseURI= "https://api.imgur.com";
		RequestSpecification http_request = RestAssured.given()
				.header("Authorization","Bearer 7c70899a08c992189109ab4049e955ef587aaa42")
			    .header("Accept","application/vnd.api+json");
				http_request.formParam("bio", "Long time lurker...");
				http_request.formParam("public_images", "Set the users images to private or public by default");
				http_request.formParam("messaging_enabled", "true | false - Allows the user to enable / disable private messages");
				http_request.formParam("album_privacy", "public | hidden | secret - Sets the default privacy level of albums the users creates");
				http_request.formParam("accepted_gallery_terms", "true | false - The user agreement to the Imgur Gallery terms.");
				http_request.formParam("username", "A valid Imgur username (between 4 and 63 alphanumeric characters)");
				http_request.formParam("show_mature", "true | false - Toggle display of mature images in gallery list endpoints.");
				http_request.formParam("newsletter_subscribed", "true | false - Toggle subscription to email newsletter.");
				Response response = http_request.request(Method.PUT,"/3/account/Ranjana1995/settings");  
				System.out.println(response.asString());
				
				//System.out.println(getBody(response));
				
				
				int code = response.getStatusCode();
				System.out.println(response.getStatusCode());
				
				//Assert.assertEquals(code, 200);

				//System.out.println(response.getStatusLine());
				

		
				    
	}
}
