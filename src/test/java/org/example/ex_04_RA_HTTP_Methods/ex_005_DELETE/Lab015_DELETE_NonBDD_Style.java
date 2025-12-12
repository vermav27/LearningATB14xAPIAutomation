package org.example.ex_04_RA_HTTP_Methods.ex_005_DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab015_DELETE_NonBDD_Style {

    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    @Test
    public void DELETE_NonBDD(){

        String token = "6c0ea5c57ebe2c9";
        String id = "754";

        rs = RestAssured.given().log().all();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking/" + id);
        rs.cookie("token",token);
        rs.contentType(ContentType.JSON);

        r = rs.delete();

        vr = r.then();
        vr.statusCode(201);
        vr.log().all();


    }

}
