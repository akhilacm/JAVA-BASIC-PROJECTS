package com.infy.package2;

public class Student {
    int studentId;
    public String studentName;
    private float totalMarksObtained;
    public float totalMarks;

    Student(int studentId, String studentName, float totalMarksObtained, float totalMarks) {
        this.setStudentId(studentId);
        this.setTotalMarksObtained(totalMarksObtained);
        this.totalMarks = totalMarks;
        this.studentName = studentName;
}
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public float getTotalMarksObtained() {
        return totalMarksObtained;
    }
    public void setTotalMarksObtained(float totalMarksObtained) {
        this.totalMarksObtained = totalMarksObtained;
    }

}
