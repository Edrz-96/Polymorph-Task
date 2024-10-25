package uk.co.devfoundry.tasks.polytask.utility;

import uk.co.devfoundry.tasks.polytask.domain.Student;
import uk.co.devfoundry.tasks.polytask.domain.Teacher;
import uk.co.devfoundry.tasks.polytask.repo.Repository;
import uk.co.devfoundry.tasks.polytask.repo.StudentRepo;

import java.util.Scanner;

public class Menu {

    // Dedicated repository for students with student-specific methods
    private static final StudentRepo studentRepository = new StudentRepo();
    // Generic repository for teacher data
    private static final Repository<Teacher> teacherRepository = new Repository<>();

    public void run() {
        boolean running = true;

        while (running) {
            String choice = getAction();
            running = performActions(choice);
        }
    }

    // Display menu and retrieve user choice
    public String getAction() {
        String menuMsg = """
                ==================================================
                 Student and Teacher Management System:
                ==================================================
                \t- Add Student   - Add a new student
                \t- Add Teacher   - Add a new teacher
                \t- Display       - Display details of all students and teachers
                \t- Exit          - Exit Application
                ==================================================
                """;
        System.out.println(menuMsg + "Choose an option:");
        return ScannerUtility.returnString();
    }

    // Perform actions based on user input, returning false only to exit the loop
    public boolean performActions(String choice) {
        switch (choice.toLowerCase()) {
            case "add student" -> addStudent(ScannerUtility.getScanner());
            case "add teacher" -> addTeacher(ScannerUtility.getScanner());
            case "display" -> displayAll();
            case "exit" -> {
                System.out.println("Exiting..");
                return false;
            }
            default -> System.out.println("Invalid option, please try again.");
        }
        return true;  // Continue running unless 'exit' is selected
    }

    // Add a new student with details input from the user
    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student's year of birth: ");
        int yearOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter student's address: ");
        String address = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int studentID = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter student's major: ");
        String major = scanner.nextLine();

        studentRepository.add(new Student(studentID, major, address, name, yearOfBirth));
        System.out.println("Student added successfully!");
    }

    // Add a new teacher with details input from the user
    private static void addTeacher(Scanner scanner) {
        System.out.print("Enter teacher's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter teacher's year of birth: ");
        int yearOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter teacher's address: ");
        String address = scanner.nextLine();
        System.out.print("Enter teacher ID: ");
        int teacherID = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter teacher's subject: ");
        String subject = scanner.nextLine();

        teacherRepository.add(new Teacher(teacherID, subject, address, name, yearOfBirth));
        System.out.println("Teacher added successfully!");
    }

    // Display all students and teachers stored in respective repositories
    private void displayAll() {
        System.out.println("Displaying all students:");
        studentRepository.displayAll();

        System.out.println("\nDisplaying all teachers:");
        teacherRepository.displayAll();
    }
}
