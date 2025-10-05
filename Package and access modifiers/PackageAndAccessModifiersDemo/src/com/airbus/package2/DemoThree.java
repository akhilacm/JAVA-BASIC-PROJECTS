package com.airbus.package2;

import com.airbus.package1.DemoOne;

public class DemoThree {

    public void checkAccessibility(){
        DemoOne demoOne = new DemoOne();
        demoOne.variableOne = 1;
        //private variable is not visible outside the class
        //demoOne.variableTwo = 9; 
        //default variable is not visible outside the package
        //demoOne.variableThree = 3;
    }
   
}
