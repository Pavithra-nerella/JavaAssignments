package com.solidprinciples;

import com.dip.good.DatabaseGradingRepository;
import com.dip.good.StudentGradingRepository;
import com.lsp.good.RegularStudentGrade;
import com.lsp.good.StudentGrade;
import com.srp.good.Course;
import com.srp.good.GradingSystem;
import com.srp.good.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Pavithra", 1295);
        Course course = new Course("Java Programming", 120);

        double marksObtained = 80;
        double totalMarks = 100;
        double gpa = GradingSystem.calculateGPAGrade(marksObtained, totalMarks);

        StudentGrade studentGrade = new RegularStudentGrade();


        StudentGradingRepository gradingRepository = new DatabaseGradingRepository();


        gradingRepository.saveGrade(student, course, studentGrade);


        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Course Name: " + course.getName());
        System.out.println("Duration: " + course.getDuration() + " minutes");
        System.out.println("Marks Obtained: " + marksObtained);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade Type: " + studentGrade.getGradeType());
    }
}

