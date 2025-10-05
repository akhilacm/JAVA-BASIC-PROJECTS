package com.airbus.package1;

public class DemoTwo {
    public void checkAccessibility() {
        DemoOne demoOne = new DemoOne();
        demoOne.variableOne = 1;
        //The field DemoOne.variableTwo is not visible because its private 
        //demoOne.variableTwo = 1; 
        demoOne.variableThree = 3;
    }

}
