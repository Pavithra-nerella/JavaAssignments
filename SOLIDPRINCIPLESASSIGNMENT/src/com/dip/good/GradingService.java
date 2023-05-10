package com.dip.good;

import com.lsp.good.StudentGrade;
import com.srp.good.Course;
import com.srp.good.Student;

public class GradingService {
    private StudentGradingRepository repository;

    public GradingService(StudentGradingRepository repository) {
        this.repository = repository;
    }

    public void saveGrade(Student student, Course course, StudentGrade grade) {
        repository.saveGrade(student, course, grade);
    }
}
