package UI.API;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import okhttp3.Response;
import org.testng.annotations.Test;

public class TC003_GET_Request {


    @Test
    public void googleMapTest(){


        //specify the base URI
        RestAssured.baseURI = "http://maps/googleapis.com";

        //Request Object
        RequestSpecification httpRequest = RestAssured.given();

        //Response object

      //  Response response = httpRequest.request(Method.GET,"maps/api/[;ace/nearbysearch/xml?location=-33.68");

    }
}
