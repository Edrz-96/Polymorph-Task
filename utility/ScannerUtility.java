package uk.co.devfoundry.tasks.polytask.utility;

import java.util.Scanner;

public class ScannerUtility {

    // Static variable to hold the single instance of the Scanner
    private static final Scanner SCAN = new Scanner(System.in);

    // Private constructor to prevent instantiation from outside the class
    private ScannerUtility() {
        // Private to prevent creating new instances of this utility class
    }

    public static Scanner getScanner() {
        return SCAN;
    }

    // Method to get a string input from the user
    public static String returnString() {
        return SCAN.nextLine().toLowerCase();
    }

    // Method to get an integer input from the user
    public static int returnInt() {
        System.out.println("Please enter a number:");
        return Integer.parseInt(SCAN.nextLine());
    }

    // Method to close the scanner (without affecting System.in)
    public static void closeScanner() {
        System.out.println("Scanner cannot be closed because it wraps System.in.");
        // Avoid calling SCAN.close() because it will close System.in
    }
}

