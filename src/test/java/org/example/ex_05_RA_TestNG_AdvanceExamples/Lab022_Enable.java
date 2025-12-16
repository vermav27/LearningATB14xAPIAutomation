package org.example.ex_05_RA_TestNG_AdvanceExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Lab022_Enable {

    @Test
    public void tc_01(){
        System.out.println("Test 1");
    }

    @Test(enabled = false)
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
