package org.example.ex_07_PayloadManagement.ex_003_POJO.Manual;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Lab031_PojoTypePayload_Ex1 {

    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    @Test
    public void pojoPayloadExample(){

        booking payload = new booking();
        payload.setFirstname("Jonathan");
        payload.setLastname("Henry");
        payload.setTotalprice(160);
        payload.setDepositpaid(true);


        bookingdates bd = new bookingdates();
        bd.setCheckin("2025-12-15");
        bd.setCheckout("2025-12-18");
        payload.setBookingdates(bd);

        payload.setAdditionalneeds("Wifi");

        rs = RestAssured.given().log().all();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking");
        rs.contentType(ContentType.JSON);
        rs.body(payload);
        System.out.println(payload);

        r = rs.post();

        vr = r.then().log().all();

        bookingResponse br = r.as(bookingResponse.class);

        assertThat(br.getBookingid()).isNotNull().isGreaterThan(0);
        assertThat(br.getBooking().getFirstname()).isEqualTo("Jonathan");
        assertThat(br.getBooking().getLastname()).isEqualTo("Henry");


    }


}
