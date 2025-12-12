package org.example.ex_01_RA_BasicPRogram_Google;

import io.restassured.RestAssured;

public class Lab001_BasicProgram_GetGoogle {
    public static void main(String[] args) {

        RestAssured
                .given().baseUri("https://www.google.com").log().all()
                .when().get()
                .then().statusCode(200).log().all();

    }
}
