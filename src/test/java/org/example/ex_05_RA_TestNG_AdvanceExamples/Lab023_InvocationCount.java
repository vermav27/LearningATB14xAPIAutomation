package org.example.ex_05_RA_TestNG_AdvanceExamples;

import org.testng.annotations.Test;

public class Lab023_InvocationCount {

    @Test
    public void tc_01(){
        System.out.println("Test 1");
    }

    @Test(invocationCount = 3) //this test will run 3 times
    public void tc_02(){
        System.out.println("Test 2");
    }

    @Test
    public void tc_03(){
        System.out.println("Test 3");
    }

    @Test(alwaysRun = true)  //always run means it will always run
    public void tc_04(){
        System.out.println("Test 4");
    }

}
