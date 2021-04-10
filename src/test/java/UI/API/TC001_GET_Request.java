package UI.API;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_GET_Request {

    @Test(groups = {"GET-Method"})
    public void getWeatherDetails(){

        RestAssured.baseURI = "https://conduit.productionready.io/api/";

        RequestSpecification httpRequest = RestAssured.given();
   Response response = httpRequest.request(Method.GET,"/tags");
   String responseBody = response.getBody().asString();
   System.out.println("Response Body is : " + responseBody);
   System.out.println(response.getStatusCode());
   System.out.println(response.getStatusLine());
   
   Assert.assertEquals(response.statusCode(), 200);


    }


    @Test(groups = {"POST-Method"})
    public void createUserTest(){
        RestAssured.baseURI = "https://conduit.productionready.io/api/users";
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","bolofbabatest@ghmail.com");
        requestBody.put("password","bolofbab");
        requestBody.put("username","restassuredtest1");
        httpRequest.header("Content-Type","application/json");
        httpRequest.body(requestBody.toString());
        Response response = httpRequest.request(Method.POST,"/users");
    }
}
