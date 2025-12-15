package org.example.ex_05_RA_TestNG_AdvanceExamples;

import com.beust.jcommander.Parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lab021_Parameters {

    @Parameters("Browser")
    @Test
    public void tc_01(String Browser){

        if(Browser.equals("Chrome")){
            System.out.println("Test Chrome");
        }
        if(Browser.equals("Firefox")){
            System.out.println("Test Firefox");
        }

    }

}
