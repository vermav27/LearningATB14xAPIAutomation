package org.example.ex_04_RA_HTTP_Methods.ex_003_PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab011_PUT_NonBDD_Style {

    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    @Test
    public void PUT_NonBDD(){

        String payload = "{\n" +
                "    \"firstname\": \"Simly\",\n" +
                "    \"lastname\": \"Park\",\n" +
                "    \"totalprice\": 251,\n" +
                "    \"depositpaid\": false,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2025-11-29\",\n" +
                "        \"checkout\": \"2025-12-02\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Dinner\"\n" +
                "}";

        String token = "efb01a77351c56a";
        String id = "2199";

        rs = RestAssured.given().log().all();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking/" + id);
        rs.contentType(ContentType.JSON);
        rs.cookie("token",token);
        rs.body(payload);

        r = rs.when().put();

        vr = r.then().log().all();
        vr.statusCode(200);

    }
}
