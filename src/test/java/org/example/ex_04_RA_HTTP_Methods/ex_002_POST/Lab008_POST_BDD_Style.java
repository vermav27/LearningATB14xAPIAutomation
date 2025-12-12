package org.example.ex_04_RA_HTTP_Methods.ex_002_POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab008_POST_BDD_Style {

    @Test
    public void POST_BDD(){

        String payload = "{\n" +
                "    \"username\": \"admin\",\n" +
                "    \"password\": \"password123\"\n" +
                "}";

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .body(payload)
                .log().all()
                .when()
                .post()
                .then()
                .statusCode(200).log().all();

    }

}
