package org.example.ex_03_RA_TestNG_AllureReport;

import io.restassured.RestAssured;

public class Lab004_DuplicacyIssue_TestFailIssue {
    public static void main(String[] args) {

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


        String pincode2 = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/" + pincode2)
                .log().all()
                .when()
                .get()
                .then()
                .statusCode(200)
                .log()
                .all();

        String pincode3 = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/" + pincode3)
                .log().all()
                .when()
                .get()
                .then()
                .statusCode(200)
                .log()
                .all();

        //So in this case code duplicacy is there also if from three test any one of the test fails
        //then further test will not run.
    }
}
