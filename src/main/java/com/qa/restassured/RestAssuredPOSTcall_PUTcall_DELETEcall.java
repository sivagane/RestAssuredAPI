package com.qa.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPOSTcall_PUTcall_DELETEcall {

	@Test
	public void test() {
		
		RequestSpecification reqs = RestAssured.given();
		
		reqs.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		
		json.put("id","13");
		json.put("email","siva@gmail.com");
		json.put("first_name", "Siva");
		json.put("last_name", "Ganesh");
		json.put("avatar", "siva.jpg");
		
		reqs.body(json.toJSONString());
	    Response resp = reqs.post("https://reqres.in/api/users?page=2");
		int code = resp.getStatusCode();
		System.out.println("The Status Code is "+code);
		
	}
	
	
}
