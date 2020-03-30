package com.qa.restassured;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestAssuredAPI {
      
	@Test
	public void testing() {
	 int code = RestAssured.given().get("https://reqres.in/api/users?page=2").getStatusCode();
		System.out.println("The Status Code is "+code);
		Assert.assertEquals(code, 200,"The Code is not Matching");
		
	}
}
