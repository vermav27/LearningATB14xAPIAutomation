package org.example.ex_04_RA_HTTP_Methods.ex_005_DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab014_DELETE_BDD_Style {

    @Test
    public void DELETE_BDD(){

        String token = "c0ee06ba1145f58";
        String id = "897";

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/" + id)
                .cookie("token",token)
                .contentType(ContentType.JSON)
                .log().all()
                .when().delete()
                .then()
                .statusCode(201)
                .log().all();

    }

}
