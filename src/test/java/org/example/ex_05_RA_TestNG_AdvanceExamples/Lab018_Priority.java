package org.example.ex_05_RA_TestNG_AdvanceExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab018_Priority {

    //We generally donot use priority because if we hav 8000 tcs then how we will use
    //priority thing.

    @Test(priority = 4)
    public void tc_01(){
        System.out.println("Test 1");
    }

    @Test(priority = 1)
    public void tc_02(){
        System.out.println("Test 2");
    }

    @Test(priority = 2)
    public void tc_03(){
        System.out.println("Test 3");
    }

    @Test(priority = 3)
    public void tc_04(){
        System.out.println("Test 4");
    }

}
