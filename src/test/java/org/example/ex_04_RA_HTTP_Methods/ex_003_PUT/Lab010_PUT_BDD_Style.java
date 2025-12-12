package org.example.ex_04_RA_HTTP_Methods.ex_003_PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab010_PUT_BDD_Style {

    @Test
    public void PUT_BDD(){

        String payload = "{\n" +
                "    \"firstname\": \"Simly\",\n" +
                "    \"lastname\": \"Park\",\n" +
                "    \"totalprice\": 251,\n" +
                "    \"depositpaid\": false,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2025-11-29\",\n" +
                "        \"checkout\": \"2025-12-02\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Breakfast\"\n" +
                "}";

        String token = "7283a439f739c77";
        String id = "2887";

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/" + id)
                .cookie("token",token)
                .contentType(ContentType.JSON)
                .body(payload)
                .log().all()
                .when()
                .put()
                .then().statusCode(200)
                .log().all();

    }

}
