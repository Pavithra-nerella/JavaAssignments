package com.assignment12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create the list of students
        List<Student> students = new ArrayList<>();
        // add the given students to the list
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));


        // 1. Print the name of all departments in the college?
        List<String> departments = students.stream()
                .map(Student::getEngDepartment)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(departments);

        // 2. Get the names of all students who have enrolled after 2018?
        List<String> namesAfter2018 = students.stream()
                .filter(s -> s.getYearOfEnrollment() > 2018)
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(namesAfter2018);

        // 3. Get the details of all male student in the computer sci department?
        List<Student> maleCompSciStudents = students.stream()
                .filter(s -> s.getEngDepartment().equals("Computer Science"))
                .filter(s -> s.getGender().equals("Male"))
                .collect(Collectors.toList());
        System.out.println(maleCompSciStudents);

        // 4. How many male and female student are there? (HINT:use Collectors.groupingBy() for grouping based on gender)
        Map<String, Long> genderCounts = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println(genderCounts);

        // 5. What is the average age of male and female students?
        Map<String, Double> genderAvgAge = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println(genderAvgAge);

        //6.Get the details of the highest student having the highest percentage?
        Optional<Student> highestStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getPerTillDate));
        if (highestStudent.isPresent()) {
            System.out.println(highestStudent.get());
        }

        //7.Count the number of students in each department?
        Map<String, Long> departmentCounts = students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));
        System.out.println(departmentCounts);

        //8.What is the average percentage achieved in each department?
        Map<String, Double> averagePercentageByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPerTillDate)));
        System.out.println(averagePercentageByDepartment);

        //9.Get the details of the youngest male student in the Electronic department?
        Optional<Student> youngestMaleElectronicStudent = students.stream()
                .filter(s -> s.getEngDepartment().equals("Electronic"))
                .filter(s -> s.getGender().equals("Male"))
                .collect(Collectors.minBy(Comparator.comparingInt(Student::getAge)));
        if (youngestMaleElectronicStudent.isPresent()) {
            System.out.println(youngestMaleElectronicStudent.get());
        }

        //10.How many male and female students are there in the computer science department?
        Map<String, Long> genderCountsInCompSci = students.stream()
                .filter(s -> s.getEngDepartment().equals("Computer Science"))
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println(genderCountsInCompSci);
    }
}