package com.assignment4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KYCForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] dates = scanner.nextLine().split(" ");
            String signUpDateString = dates[0];
            String currentDateString = dates[1];

            LocalDate signUpDate = LocalDate.parse(signUpDateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate currentDate = LocalDate.parse(currentDateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            LocalDate anniversaryDate = signUpDate.plusYears(currentDate.getYear() - signUpDate.getYear());
            LocalDate startDate = anniversaryDate.minusDays(30);
            LocalDate endDate = anniversaryDate.plusDays(30);

            if (currentDate.isBefore(startDate)) {
                System.out.println("No range");
            } else {
                startDate = startDate.isBefore(signUpDate) ? signUpDate : startDate;
                endDate = endDate.isAfter(currentDate) ? currentDate : endDate;

                if (startDate.isAfter(endDate)) {
                    System.out.println("No range");
                } else {
                    System.out.println(startDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " " + endDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                }
            }
        }
    }
}
