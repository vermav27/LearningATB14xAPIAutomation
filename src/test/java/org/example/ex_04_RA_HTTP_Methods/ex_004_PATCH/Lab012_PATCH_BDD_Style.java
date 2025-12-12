package org.example.ex_04_RA_HTTP_Methods.ex_004_PATCH;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab012_PATCH_BDD_Style {

    @Test
    public void PATCH_BDD(){

        Faker fk = new Faker();
        String firstName = fk.name().firstName();
        String lastName = fk.name().lastName();

        String token = "19fbfdd5eab0719";
        String id = "217";
        String payload = "{\n" +
                "    \"firstname\": \"" + firstName + "\"" + ","+
                "    \"lastname\": \"" + lastName + "\"" +
                "}";

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/" + id)
                .cookie("token",token)
                .contentType(ContentType.JSON)
                .body(payload)
                .log().all()
                .when()
                .patch()
                .then()
                .statusCode(200).log().all();

    }

}
