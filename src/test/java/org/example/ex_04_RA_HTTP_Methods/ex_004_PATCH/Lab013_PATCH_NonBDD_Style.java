package org.example.ex_04_RA_HTTP_Methods.ex_004_PATCH;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab013_PATCH_NonBDD_Style {

    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    @Test
    public void PATCH_NonBDD(){

        Faker fk = new Faker();
        String firstName = fk.name().firstName();
        String lastName = fk.name().lastName();

        String token = "2dbf14f84b55072";
        String id = "2347";
        String payload = "{\n" +
                "    \"firstname\": \"" + firstName + "\"" + ","+
                "    \"lastname\": \"" + lastName + "\"" +
                "}";

        rs = RestAssured.given().log().all();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking/" + id);
        rs.contentType(ContentType.JSON);
        rs.cookie("token",token);
        rs.body(payload);

        r = rs.patch();

        vr = r.then();
        vr.statusCode(200);
        vr.log().all();

    }

}
