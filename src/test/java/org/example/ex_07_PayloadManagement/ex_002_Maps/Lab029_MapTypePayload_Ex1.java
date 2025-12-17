package org.example.ex_07_PayloadManagement.ex_002_Maps;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.HashMap;

public class Lab029_MapTypePayload_Ex1 {

    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    @Description("Verify the post request for restfull booker.")
    @Step("Make the Post Request")
    @Test
    public void MapTypePayload(){
/*

        String Payload = "{\n" +
                "    \"firstname\": \"Jack\",\n" +
                "    \"lastname\": \"Daniel\",\n" +
                "    \"totalprice\": 150,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2025-12-15\",\n" +
                "        \"checkout\": \"2025-12-20\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"WiFi\"\n" +
                "}";
*/

        HashMap<String,Object> record = new HashMap<String,Object>();
        record.put("firstname","Jack");
        record.put("lastname","Daniel");
        record.put("totalprice",150);
        record.put("depositpaid",true);
        record.put("additionalneeds","WiFi");


        HashMap<String,Object> bookingDates = new HashMap<String,Object>();
        bookingDates.put("checkin","2025-12-15");
        bookingDates.put("checkout","2025-12-20");

        record.put("bookingdates",bookingDates);
        System.out.println(record);

        rs = RestAssured.given().log().all();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking");
        rs.body(record);
        rs.contentType(ContentType.JSON);

        r = rs.post();

        vr = r.then().log().all();
        vr.statusCode(200);

        //Hamcrest Matchers
        vr.body("bookingid", Matchers.notNullValue());
        vr.body("booking.firstname",Matchers.equalTo("Jack"));
        vr.body("booking.lastname",Matchers.equalTo("Daniel"));
        vr.body("booking.bookingdates.checkin",Matchers.equalTo("2025-12-15"));



    }

}
