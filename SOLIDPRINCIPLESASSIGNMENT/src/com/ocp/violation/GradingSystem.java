package com.ocp.violation;

public class GradingSystem {
    public static double calculateGrade(double marksObtained, double totalMarks, String gradeType) {
        if (gradeType.equals("Percentage")) {
            return (marksObtained / totalMarks) * 100;
        }
        else {
            double percentage = (marksObtained / totalMarks) * 100;
            if (percentage >= 90) {
                return 9.0;
            }
            else if (percentage >= 80) {
                return 8.7;
            }
            else if (percentage >= 70) {
                return 7.5;
            }
            else if (percentage >= 60) {
                return 7.0;
            }
            else {
                return 0.0;
            }

        }
    }
}


