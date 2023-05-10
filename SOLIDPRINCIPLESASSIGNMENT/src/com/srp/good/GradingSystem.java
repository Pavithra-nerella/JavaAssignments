package com.srp.good;

public class GradingSystem {
    public static double calculatePercentageGrade(double marksObtained, double totalMarks) {
        return (marksObtained / totalMarks) * 100;
    }

    public static double calculateGPAGrade(double marksObtained, double totalMarks) {
        double percentage = calculatePercentageGrade(marksObtained, totalMarks);
        if (percentage >= 90) {
            return 9.0;
        } else if (percentage >= 80) {
            return 8.7;
        } else if (percentage >= 70) {
            return 7.5;
        } else if (percentage >= 60) {
            return 7.0;
        } else {
            return 0.0;
        }
    }

}
