package com.BandhanApplication.Payloads;

import com.BandhanApplication.Tests.SIgnupAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Documents {

    public static HashMap<String,Object> documentUpload(){
        HashMap<String,Object> docPayload1=new HashMap<>();
        docPayload1.put("doc_key","resume");
        docPayload1.put("url","https://staging-dhwani.s3.ap-south-1.amazonaws.com/0aa03a74-7f9f-11ed-a1a9-06e816cd79e6.pdf");
        docPayload1.put("file_name","");

        HashMap<String,Object> docPayload2=new HashMap<>();
        docPayload2.put("doc_key","aadhar_card");
        docPayload2.put("url","https://staging-dhwani.s3.ap-south-1.amazonaws.com/0aa03a74-7f9f-11ed-a1a9-06e816cd79e6.pdf");
        docPayload2.put("file_name","");

        HashMap<String,Object> docPayload3=new HashMap<>();
        docPayload3.put("doc_key","pan_card");
        docPayload3.put("url","");
        docPayload3.put("file_name","");

        HashMap<String,Object> docPayload4=new HashMap<>();
        docPayload4.put("doc_key","birth_certificate");
        docPayload4.put("url","");
        docPayload4.put("file_name","");

        HashMap<String,Object> docPayload5=new HashMap<>();
        docPayload5.put("doc_key","last_education_mark_list");
        docPayload5.put("url","");
        docPayload5.put("file_name","");

        HashMap<String,Object> docPayload6=new HashMap<>();
        docPayload6.put("doc_key","caste_certificate");
        docPayload6.put("url","");
        docPayload6.put("file_name","");

        HashMap<String,Object> docPayload7=new HashMap<>();
        docPayload7.put("doc_key","leaving_certificate");
        docPayload7.put("url","");
        docPayload7.put("file_name","");

        HashMap<String,Object> docPayload8=new HashMap<>();
        docPayload8.put("doc_key","domicile_certificate");
        docPayload8.put("url","");
        docPayload8.put("file_name","");

        HashMap<String,Object> docPayload9=new HashMap<>();
        docPayload9.put("doc_key","ration_card");
        docPayload9.put("url","");
        docPayload9.put("file_name","");

        HashMap<String,Object> docPayload10=new HashMap<>();
        docPayload10.put("doc_key","driving_license");
        docPayload10.put("url","");
        docPayload10.put("file_name","");


        HashMap<String,Object> docPayload11=new HashMap<>();
        docPayload11.put("doc_key","passport");
        docPayload11.put("url","");
        docPayload11.put("file_name","");

        HashMap<String,Object> docPayload12=new HashMap<>();
        docPayload12.put("doc_key","light_bill");
        docPayload12.put("url","");
        docPayload12.put("file_name","");

        HashMap<String,Object> docPayload13=new HashMap<>();
        docPayload13.put("doc_key","voter_id");
        docPayload13.put("url","");
        docPayload13.put("file_name","");

        HashMap<String,Object> docPayload14=new HashMap<>();
        docPayload14.put("doc_key","income_certificate");
        docPayload14.put("url","");
        docPayload14.put("file_name","");
        
        HashMap<String,Object> docPayload15=new HashMap<>();
        docPayload15.put("doc_key","income_certificate");
        docPayload15.put("url","");
        docPayload15.put("file_name","");

        List< HashMap<String,Object>> documents=new ArrayList<>();
        documents.add(docPayload1);
        documents.add(docPayload2);
        documents.add(docPayload3);
        documents.add(docPayload4);
        documents.add(docPayload5);
        documents.add(docPayload6);
        documents.add(docPayload7);
        documents.add(docPayload8);
        documents.add(docPayload9);
        documents.add(docPayload11);
        documents.add(docPayload12);
        documents.add(docPayload13);
        documents.add(docPayload14);
        documents.add(docPayload15);



        HashMap<String,Object> main=new HashMap<>();
        main.put("id", SIgnupAPI.id);
        main.put("registration_id",SIgnupAPI.regId);
        main.put("documents",documents);

        return main;


    }
}
