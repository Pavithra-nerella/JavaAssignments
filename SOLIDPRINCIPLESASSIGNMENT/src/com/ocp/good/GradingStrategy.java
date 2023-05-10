package com.ocp.good;

import com.srp.good.GradingSystem;

public interface GradingStrategy {
    public double calculateGrade(double marksObtained, double totalMarks);
}

