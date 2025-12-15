package org.example.ex_05_RA_TestNG_AdvanceExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Lab020_DependsOn {

    @Test
    public void Server_ON(){
        System.out.println("Server Started.....");
    }

    @Test(dependsOnMethods = "Server_ON")
    public void tc_01(){
        System.out.println("Test Functionality 1");
    }

    @Test(dependsOnMethods = "Server_ON")
    public void tc_02(){
        System.out.println("Test Functionality 2");
    }

    @AfterTest
    public void Server_OFF(){
        System.out.println("Served Shutdown !");
    }

}
