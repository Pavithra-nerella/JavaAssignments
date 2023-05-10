package com.lsp.violation;

public class TransferStudentGrade extends StudentGrade {
    public TransferStudentGrade() {
        super("Transfer");
    }

    public String getGradeType() {
        return "Regular"; // violates the contract of the parent class
    }
}
