package com.task;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get {
	public static void main(String[] args) {
		RequestSpecification reqSpec;
		
		reqSpec = RestAssured.given();
		
		reqSpec = reqSpec.header("content Type","application/json");
		
         reqSpec = reqSpec.pathParam("page", "2");
		
		Response response = reqSpec.get("https://reqres.in/api/users/{page}");
		
		int statusCode = response.statusCode();
		
		System.out.println(statusCode);
		
//		String asString = response.asString();
//		System.out.println(asString);
		
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
		
		
	}

}
