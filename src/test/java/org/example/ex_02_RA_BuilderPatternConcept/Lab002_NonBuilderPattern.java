package org.example.ex_02_RA_BuilderPatternConcept;

public class Lab002_NonBuilderPattern {

    public void step1(){
        System.out.println("Step 1");
    }

    public void step2(){
        System.out.println("Step 2");
    }

    public void step3(){
        System.out.println("Step 3");
    }

    public static void main(String[] args) {
        Lab002_NonBuilderPattern nb = new Lab002_NonBuilderPattern();
        nb.step1();
        nb.step2();
        nb.step3();

        //here all step are getting executed independently
        //so this is not how a builder pattern works

    }

}
