package org.example.ex_05_RA_TestNG_AdvanceExamples;

import org.testng.annotations.Test;

public class Lab019_Groups {

    @Test(groups = {"sanity","regression"})
    public void tc_01(){
        System.out.println("Test 1 - Sanity & Regression");
    }

    @Test(groups = "sanity")
    public void tc_02(){
        System.out.println("Test 2 - Sanity");
    }

    @Test(groups="regression")
    public void tc_03(){
        System.out.println("Test 3 - Regression");
    }

    @Test(groups = {"regression"})
    public void tc_04(){
        System.out.println("Test 4 - Regression");
    }

}
