package com.dip.violation;

import com.srp.violation.Student;

public class GradingService {
    private DatabaseGradingRepository databaseRepository;
    private FileGradingRepository fileRepository;

    public GradingService() {
        this.databaseRepository = new DatabaseGradingRepository();
        this.fileRepository = new FileGradingRepository();
    }

    public void saveGrade(Student student, String gradeType) {
        if (gradeType.equals("Regular")) {
            databaseRepository.saveGrade(student);
        } else if (gradeType.equals("Transfer")) {
            fileRepository.saveGrade(student);
        } else {
            System.out.println("Invalid grade type");
        }
    }
}



