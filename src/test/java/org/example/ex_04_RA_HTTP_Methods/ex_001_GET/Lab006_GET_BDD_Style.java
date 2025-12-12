package org.example.ex_04_RA_HTTP_Methods.ex_001_GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab006_GET_BDD_Style {

    @Test
    public void GET_BDD(){
        String pincode = "110035";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/" + pincode)
                .log().all()
                .when()
                .get()
                .then().
                statusCode(200)
                .log()
                .all();
    }

}
