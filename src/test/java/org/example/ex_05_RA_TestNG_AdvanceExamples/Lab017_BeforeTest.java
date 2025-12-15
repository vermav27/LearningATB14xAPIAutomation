package org.example.ex_05_RA_TestNG_AdvanceExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab017_BeforeTest {

    // For a put request. We have to do :
    // Get Token
    // Get Booking ID
    // Put Request
    // Close Test

    @BeforeTest
    public void get_token(){
        System.out.println("Getting Token");
    }

    @BeforeTest
    public void get_BookingId(){
        System.out.println("Getting Booking Id");
    }

    @Test
    public void put(){
        System.out.println("Put Request");
    }

    @AfterTest
    public void close_test(){
        System.out.println("Close Test");
    }

}
