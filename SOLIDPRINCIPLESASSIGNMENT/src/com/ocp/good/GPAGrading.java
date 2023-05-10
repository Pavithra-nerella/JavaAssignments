package com.ocp.good;

import com.srp.good.GradingSystem;

public class GPAGrading implements GradingStrategy {
    public double calculateGrade(double marksObtained, double totalMarks) {
        return GradingSystem.calculateGPAGrade(marksObtained, totalMarks);
    }
}
