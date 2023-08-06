package com.example;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getTest1()
    {
        // Specify the base URL to the RESTful web service 
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1"; 
        // Get the RequestSpecification of the request to be sent to the server. 
        RequestSpecification httpRequest = RestAssured.given(); 
        // specify the method type (GET) and the parameters if any. 
        //In this case the request does not take any parameters 
        Response response = httpRequest.request(Method.GET, "/Books");
        // Print the status and message body of the response received from the server 
        Reporter.log("Status received => " + response.getStatusLine()); 
        Reporter.log("Response=>" + response.prettyPrint());
}

}