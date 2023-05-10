package com.dip.violation;

import com.srp.violation.Student;

public class FileGradingRepository {
    public void saveGrade(Student student) {
        System.out.println("Grade for " + student.getName() + " saved to file for course ");
    }
}
