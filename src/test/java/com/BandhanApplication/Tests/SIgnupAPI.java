package com.BandhanApplication.Tests;

import com.BandhanApplication.Payloads.BasicInfo;
import com.BandhanApplication.Payloads.ContactDetails;
import com.BandhanApplication.Payloads.Documents;
import com.BandhanApplication.Payloads.Signup;
import com.BandhanApplication.api.ApplicationAPI.BandhanAPI;
import com.fasterxml.jackson.annotation.JsonAlias;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static com.BandhanApplication.api.Route.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SIgnupAPI {
    public static String token;
    public static String id;
    public static String regId;

    @Test(priority = 1)
    public void initialSignup(){
       try {
           HashMap<String,String> payload=new HashMap<>();
           payload.put("is_outside_registration","1");
           payload.put("registration_id","");
           payload.put("email","amit.negi@dhwaniris.com");
           Response response =BandhanAPI.post(payload,INITIALSIGNUP);
           assertThat(response.statusCode(),equalTo(200));
           token = JsonPath.from(response.asString()).getString("data.token");
           id = JsonPath.from(response.asString()).getString("data.id");
           regId = JsonPath.from(response.asString()).getString("data.registration_id");
           System.out.println(token);
           System.out.println(id);
           System.out.println(regId);
       }catch (Exception e){

           throw new RuntimeException("ABORT! Failed to get executed.");
       }

    }
    @Test(priority = 2)

    public void updateBasicInfo(){


        try {
            Response response= BandhanAPI.post(BasicInfo.basicDetails(),BASICINFO,token);
            assertThat(response.statusCode(),equalTo(200));
            assertThat(JsonPath.from(response.asString()).getString("message"),equalTo("Basic details added."));
            assertThat(JsonPath.from(response.asString()).getString("success"),equalTo("true"));
            assertThat(JsonPath.from(response.asString()).getString("status"),equalTo("200"));


        }catch (Exception e){
            throw new RuntimeException("ABORT! Failed to get executed.");
        }

    }
    @Test(priority = 3)
    public void updateContactInfo(){

        try {
            Response response= BandhanAPI.post(ContactDetails.contactInfo(),CONTACTINFO,token);
            assertThat(response.statusCode(),equalTo(200));
            assertThat(JsonPath.from(response.asString()).getString("message"),equalTo("Contact details added."));
            assertThat(JsonPath.from(response.asString()).getString("success"),equalTo("true"));
            assertThat(JsonPath.from(response.asString()).getString("status"),equalTo("200"));
        }
        catch (Exception e){
            throw new RuntimeException("ABORT! Failed to get executed.");
        }



    }
    @Test(priority = 4)
    public void updateDocument(){

        try {
            Response response=BandhanAPI.postDocument(Documents.documentUpload(),DOCUMENT,token);
            assertThat(response.statusCode(),equalTo(200));
            assertThat(JsonPath.from(response.asString()).getString("message"),equalTo("Documents updated."));
            assertThat(JsonPath.from(response.asString()).getString("success"),equalTo("true"));
            assertThat(JsonPath.from(response.asString()).getString("status"),equalTo("200"));
        }
        catch (Exception e){
            throw new RuntimeException("ABORT! Failed to get executed.");
        }


    }
    @Test(priority = 5)
    public void Signup(){
        try {
            Response response=BandhanAPI.post(Signup.finalSignup(),SIGNUP,token);
            assertThat(response.statusCode(),equalTo(200));
            assertThat(JsonPath.from(response.asString()).getString("message"),equalTo("Signup successful."));
            assertThat(JsonPath.from(response.asString()).getString("success"),equalTo("true"));
            assertThat(JsonPath.from(response.asString()).getString("status"),equalTo("200"));
        }catch (Exception e){

            throw new RuntimeException("ABORT! Failed to get executed.");
        }


    }


}
