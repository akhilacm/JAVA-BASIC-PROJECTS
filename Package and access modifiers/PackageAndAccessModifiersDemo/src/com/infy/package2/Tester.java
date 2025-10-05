package com.infy.package2;

import com.infy.package1.StudentDetails;

public class Tester {

    public static void main(String[] args) {
        Student s1 = new Student(101,"Akhila", 400.0f, 500.0f);
        StudentDetails d = new StudentDetails(s1);
        d.displayStudentDetails();
        d.calculatePerentage();
    }
}
