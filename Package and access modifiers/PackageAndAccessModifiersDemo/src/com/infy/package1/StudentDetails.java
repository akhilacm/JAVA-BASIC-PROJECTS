package com.infy.package1;

import com.infy.package2.Student;

public class StudentDetails {
    Student s;

    public StudentDetails(Student s){
        this.s = s;
    }
    public void calculatePerentage() {
        System.out.println("Student percentage: "+""+s.getTotalMarksObtained() / s.totalMarks * 100);
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: "+ ""+ s.getStudentId());
        System.out.println("Student Name: "+""+ s.studentName);
        System.out.println("Student Marks: "+ ""+ s.getTotalMarksObtained());
        System.out.println("Total Marks: "+""+ s.totalMarks);
    }
}
