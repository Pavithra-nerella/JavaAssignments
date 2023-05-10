package com.srp.violation;
public class Student {
    private String name;
    private int rollNumber;
    private double marksObtained;
    private double totalMarks;

    public Student(String name, int rollNumber, double marksObtained, double totalMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marksObtained = marksObtained;
        this.totalMarks = totalMarks;
        saveGradeToDatabase();
    }

    public void saveGradeToDatabase() {
        // implementation to save grade in a database
        System.out.println("Grade for " + this.name + " saved to database for course " + ")");
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarksObtained() {
        return marksObtained;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

}


