package org.example.ex_02_RA_BuilderPatternConcept;

public class Lab003_BuilderPattern {

    public Lab003_BuilderPattern step1(){
        System.out.println("Step 1");
        return this;
    }

    public Lab003_BuilderPattern step2(){
        System.out.println("Step 2");
        return this;
    }

    public Lab003_BuilderPattern step3(){
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        Lab003_BuilderPattern bp = new Lab003_BuilderPattern();
        bp.step1().step2().step3();

        //this is the concept of builder pattern.

    }

}
