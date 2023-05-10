package com.dip.good;

import com.lsp.good.StudentGrade;
import com.srp.good.Course;
import com.srp.good.Student;

public class DatabaseGradingRepository implements StudentGradingRepository {
    public void saveGrade(Student student, Course course, StudentGrade grade) {
        // implementation to save grade in a database
        System.out.println("Grade for " + student.getName() + " saved to database for course " + course.getName() + " (" + grade.getGradeType() + ")");
    }
}


