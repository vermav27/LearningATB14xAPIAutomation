package org.example.ex_07_PayloadManagement.ex_001_String;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab028_StringTypePayload {

    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    @Description("Verify the post request for restfull booker.")
    @Step("Make the Post Request")
    @Test
    public void StringTypePayload(){

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

        rs = RestAssured.given().log().all();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking");
        rs.body(Payload);
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
