package Assignment04;// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 4

import java.util.Scanner;

public class ISBN_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isbn;

        while (true) {
            System.out.print("Enter the first 9 digits of an ISBN as integer: ");
            isbn = scanner.next();

            try {
                int num = Integer.parseInt(isbn);
                if (isbn.length() == 9) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("You must enter an actual number.");
            }

            System.err.println("You must enter a 9 digit number.");
        }

        String checksum = calculateChecksum(isbn);

        System.out.println("The ISBN-10 number is " + (isbn + checksum));

    }

    /**
     * Calculates and returns an ISBN-10 checksum. The checksum is calculated from the other nine digits using the
     * following formula:
     *   (d1 *1+d2 *2+d3 *3+d4 *4+d5 *5+ d6 *6+d7 *7+d8 *8+d9 *9) % 11
     *
     * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
     */
    public static String calculateChecksum(String digits) {
        int accumulator = 0;

        for (int i = 0; i < digits.length(); i++) {
            accumulator += (Integer.parseInt(String.valueOf(digits.charAt(i)))) * (i + 1);
        }

        int checksum = accumulator % 11;

        if (checksum == 10) {
            return "X";
        }

        return String.valueOf(checksum);

    }

}
