package org.example.ex_06_RA_TestValidation;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;


public class Lab027_TestNG_Extraction {

    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    @Description("Verify the post request for restfull booker.")
    @Step("Make the Post Request")
    @Test
    public void post() {

        String Payload = "{\n" +
                "    \"firstname\": \"Jack\",\n" +
                "    \"lastname\": \"Daniel\",\n" +
                "    \"totalprice\": 150,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2025-12-15\",\n" +
                "        \"checkout\": \"2025-12-20\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"WiFi\"\n" +
                "}";

        rs = RestAssured.given().log().all();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking");
        rs.body(Payload);
        rs.contentType(ContentType.JSON);

        r = rs.post();

        vr = r.then().log().all();
        vr.statusCode(200);

        String firstName = r.then().extract().path("booking.firstname");
        String lastName = r.then().extract().path("booking.lastname");

        //TestNG Assertion
        Assert.assertEquals(firstName,"Jack");
        Assert.assertEquals(lastName,"Daniel");

        //AssertJ Assestion
        assertThat(firstName).isNotNull().isEqualTo("Jack");
        assertThat(lastName).isNotNull().isNotBlank().isEqualTo("Daniel");


    }

}
