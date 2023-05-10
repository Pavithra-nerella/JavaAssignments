package com.ocp.good;

import com.srp.good.GradingSystem;

public class PercentageGrading implements GradingStrategy {
    public double calculateGrade(double marksObtained, double totalMarks) {
        return GradingSystem.calculatePercentageGrade(marksObtained, totalMarks);
    }
}
