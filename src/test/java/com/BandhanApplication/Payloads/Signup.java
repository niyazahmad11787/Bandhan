package com.BandhanApplication.Payloads;

import com.BandhanApplication.Tests.SIgnupAPI;

import java.util.HashMap;

public class Signup {
    public static HashMap<String,String> finalSignup(){

        HashMap<String,String> payload=new HashMap<>();
        payload.put("registration_id", SIgnupAPI.regId);
        payload.put("password","Admin@123");
        return payload;
    }
}
