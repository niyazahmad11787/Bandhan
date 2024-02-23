package com.BandhanApplication.api.ApplicationAPI;

import io.restassured.response.Response;

import java.util.HashMap;

import static com.BandhanApplication.SpecBuilder.specBuilder.getRequestSpecification;
import static com.BandhanApplication.SpecBuilder.specBuilder.getResponseSpecification;
import static com.BandhanApplication.api.Route.INITIALSIGNUP;
import static io.restassured.RestAssured.given;

public class BandhanAPI {

    public static Response post( HashMap<String,String> Payload,String path){

        return given(getRequestSpecification())
                .body(Payload).
                when()
                .post(path)
                .then()
                .spec(getResponseSpecification()).
                assertThat().statusCode(200).extract()
                .response();


    }
    public static Response post( HashMap<String,String> Payload,String path,String token){

        return given(getRequestSpecification())
                .body(Payload).
                header("Authorization",token).
                when()
                .post(path)
                .then()
                .spec(getResponseSpecification()).
                assertThat().statusCode(200).extract()
                .response();


    }
    public static Response postDocument( HashMap<String,Object> Payload,String path,String token){

        return given(getRequestSpecification())
                .body(Payload).
                header("Authorization",token).
                when()
                .post(path)
                .then()
                .spec(getResponseSpecification()).
                assertThat().statusCode(200).extract()
                .response();


    }
}
