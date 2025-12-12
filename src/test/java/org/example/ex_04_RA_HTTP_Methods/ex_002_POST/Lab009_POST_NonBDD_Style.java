package org.example.ex_04_RA_HTTP_Methods.ex_002_POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.apache.http.impl.io.HttpRequestWriter;
import org.testng.annotations.Test;

public class Lab009_POST_NonBDD_Style {

    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    @Test
    public void POST_NonBDD(){

        String payload = "{\n" +
                "    \"username\": \"admin\",\n" +
                "    \"password\": \"password123\"\n" +
                "}";

        rs = RestAssured.given().log().all();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/auth");
        rs.contentType(ContentType.JSON);
        rs.body(payload);

        r = rs.when().post();

        vr = r.then().log().all();
        vr.statusCode(200);


    }

}
