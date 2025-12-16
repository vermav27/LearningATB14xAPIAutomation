package org.example.ex_05_RA_TestNG_AdvanceExamples;

import org.testng.annotations.*;

public class Lab024_AllAnnotations {

    //Mostly Before Test / After Test / Before Method / After Method

    @BeforeSuite
    public void tc_01(){
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void tc_02(){
        System.out.println("Before Test");
    }

    @BeforeClass
    public void tc_03(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void tc_04(){
        System.out.println("Before Method");
    }

    @AfterSuite
    public void tc_05(){
        System.out.println("After Suite");
    }

    @AfterTest
    public void tc_06(){
        System.out.println("After Test");
    }

    @AfterClass
    public void tc_07(){
        System.out.println("After Class");
    }

    @AfterMethod
    public void tc_08(){
        System.out.println("After Method");
    }

    @Test
    public void tc_09(){
        System.out.println("Test 1");
    }

    @Test
    public void tc_10(){
        System.out.println("Test 2");
    }

}
