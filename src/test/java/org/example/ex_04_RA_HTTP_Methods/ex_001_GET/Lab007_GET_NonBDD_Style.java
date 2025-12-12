package org.example.ex_04_RA_HTTP_Methods.ex_001_GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab007_GET_NonBDD_Style {

    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    @Test
    public void GET_NonBDD(){

        String pincode = "110035";
        //given
        rs = RestAssured.given().log().all();
        rs.baseUri("https://api.zippopotam.us/");
        rs.basePath("/IN/" + pincode);

        //when
        r = rs.when().log().all().get();
        System.out.println(r.asString()); //converting response to string and printing

        //then
        vr = r.then().log().all();
        vr.statusCode(200);

    }

}
