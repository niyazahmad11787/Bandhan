package com.BandhanApplication.Payloads;

import com.BandhanApplication.Tests.SIgnupAPI;

import java.util.HashMap;

public class BasicInfo {

   public static HashMap<String,String > basicDetails(){
       HashMap<String,String > basicPaylods=new HashMap<>();
       basicPaylods.put("id",SIgnupAPI.id);
       basicPaylods.put("profile_pic","https://staging-dhwani.s3.ap-south-1.amazonaws.com/16dc44ba-0cb8-11ed-949f-021fd2e51444.jpg");
       basicPaylods.put("registration_id", SIgnupAPI.regId);
       basicPaylods.put("first_name","Pooja");
       basicPaylods.put("middle_name","Sheetalaprasad");
       basicPaylods.put("last_name","Vishwakarma");
       basicPaylods.put("dob","2002-09-06");
       basicPaylods.put("gender","2");
       basicPaylods.put("educational_qualification","9");
       basicPaylods.put("pursuing_education_id","13");
       basicPaylods.put("marital_status","1");
       basicPaylods.put("any_disability","2");
       basicPaylods.put("other_disability","");
       basicPaylods.put("batch_id","523");
       basicPaylods.put("financial_year_id","4");
       basicPaylods.put("center_id","6");
       basicPaylods.put("language","English");
       basicPaylods.put("other_language","");
       basicPaylods.put("skills","25");
       basicPaylods.put("other_skills","");
       basicPaylods.put("mother_name","acvvv");
       basicPaylods.put("father_name","sssss");
       basicPaylods.put("family_income","18000");
       basicPaylods.put("volunteering_company","0");
       basicPaylods.put("other_pursuing_education","null");
       basicPaylods.put("other_educational_qualification","null");
       return basicPaylods;
   }

}
