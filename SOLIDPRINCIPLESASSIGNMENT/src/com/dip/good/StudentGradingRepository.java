package com.dip.good;

import com.lsp.good.StudentGrade;
import com.srp.good.Course;
import com.srp.good.Student;

public interface StudentGradingRepository {
    public void saveGrade(Student student, Course course, StudentGrade grade);
}


