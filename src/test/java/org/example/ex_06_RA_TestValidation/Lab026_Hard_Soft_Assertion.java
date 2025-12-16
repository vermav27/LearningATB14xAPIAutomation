package org.example.ex_06_RA_TestValidation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Lab026_Hard_Soft_Assertion {

    @Test
    public void hard_assertion(){ //In hard assertion if test fails next line will not execute
        System.out.println("Start");
        Assert.assertEquals("Vineet","verma");
        System.out.println("End");
    }

    @Test
    public void soft_assertion(){ //In soft assertion if test fails next line will execute
        System.out.println("Start");
        SoftAssert sa = new SoftAssert();
        sa.assertEquals("Vineet","Verma");
        System.out.println("End");
        sa.assertAll();
    }

}
