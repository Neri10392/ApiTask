package com.task;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete {
public static void main(String[] args) {
		
		
		RequestSpecification reqSpec;
		
		reqSpec = RestAssured.given();
		
		reqSpec = reqSpec.header("content Type","application/json");
		
//	     reqSpec = reqSpec.body("{\r\n" + 
//	     		"    \"name\": \"morpheus\",\r\n" + 
//	     		"    \"job\": \"zion resident\"\r\n" + 
//	     		"}");
//		
		Response response = reqSpec.delete("https://reqres.in/api/users/2");
		
		int statusCode = response.statusCode();
		
		System.out.println(statusCode);
		
//		String asString = response.asString();
//		System.out.println(asString);
		
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
		
		
	}

}
