package com.dip.violation;

import com.srp.violation.Student;

public class DatabaseGradingRepository {
    public void saveGrade(Student student) {
        // implementation to save grade in a database
        System.out.println("Grade for " + student.getName() + " saved to database for course " );
    }
}
