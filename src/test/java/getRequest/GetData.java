package getRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetData {
	
	@Test
	
	public void testResponsecode()
	
	{
		
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

		int code=resp.getStatusCode();
		
	System.out.println("Status code is "+code);
		
	//assert.assertEquals(code, 200);
	Assert.assertEquals(code, 200);
	}
	
	
	
@Test
	
	public void testbody()
	
	{
		
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

		String data=resp.asString();
		
	System.out.println("Data is "+data);
		
	System.out.println("Responsetime "+resp.getTime());
	
	
	}
	
}
     