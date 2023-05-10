package com.dip.good;

import com.lsp.good.StudentGrade;
import com.srp.good.Course;
import com.srp.good.Student;

public class FileGradingRepository implements StudentGradingRepository {
    public void saveGrade(Student student, Course course, StudentGrade grade) {
        System.out.println("Grade for " + student.getName() + " saved to file for course " + course.getName() + " (" + grade.getGradeType() + ")");
    }
}
