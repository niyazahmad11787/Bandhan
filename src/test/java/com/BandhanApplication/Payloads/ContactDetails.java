package com.BandhanApplication.Payloads;

import com.BandhanApplication.Tests.SIgnupAPI;
import com.BandhanApplication.Utility.RandomEmail;
import com.BandhanApplication.Utility.RandomNumber;

import java.util.HashMap;

import static com.BandhanApplication.Utility.RandomEmail.generateRandomEmail;
import static com.BandhanApplication.Utility.RandomNumber.randomNumber;

public class ContactDetails {

    public static HashMap<String,String> contactInfo(){

        HashMap<String,String> contactPayload=new HashMap<>();
        contactPayload.put("id", SIgnupAPI.id);
        contactPayload.put("registration_id",SIgnupAPI.regId);
        contactPayload.put("mobile_no", randomNumber());
        contactPayload.put("first_name","Niyaz");
        contactPayload.put("email", generateRandomEmail());
        contactPayload.put("current_address","bhdbhbdhbd");
        contactPayload.put("gender","1");
        contactPayload.put("pincode","208023");
        contactPayload.put("state_id","1");
        contactPayload.put("district_id","1");
        contactPayload.put("middle_name","ahmad");
        contactPayload.put("last_name","ansari");
        contactPayload.put("dob","1999-12-10");
        contactPayload.put("educational_qualification","5");
        contactPayload.put("pursuing_education_id","6");
        contactPayload.put("marital_status","1");
        contactPayload.put("any_disability","2");
        contactPayload.put("type_of_disability","");
        contactPayload.put("other_disability","");
        contactPayload.put("batch_id","47");
        contactPayload.put("financial_year_id","2");
        contactPayload.put("center_id","11");
        contactPayload.put("language","Hindi,English");
        contactPayload.put("other_language","");
        contactPayload.put("skills","5,7");
        contactPayload.put("mother_name","mother");
        contactPayload.put("father_name","father");

        return contactPayload;


    }
}
