package org.example.ex_03_RA_TestNG_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab005_TestAnnotation {

    @Test
    public void test_Positive_TC01(){

        String pincode = "110035";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/" + pincode)
                .log().all()
                .when()
                .get()
                .then()
                .statusCode(200)
                .log()
                .all();

    }

    @Test
    public void test_Negative_TC02(){

        String pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/" + pincode)
                .log().all()
                .when()
                .get()
                .then()
                .statusCode(200)
                .log()
                .all();

    }

    @Test
    public void test_Null_TC03(){

        String pincode = "";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/" + pincode)
                .log().all()
                .when()
                .get()
                .then()
                .statusCode(200)
                .log()
                .all();

    }
}
