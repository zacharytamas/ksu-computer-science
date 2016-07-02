package Assignment05;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 5

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("(1) Enter a string: ");
        String string_1 = scanner.nextLine();
        System.out.println("(2) Enter a string: ");
        String string_2 = scanner.nextLine();

        // Part A: Determine the length of string_1
        System.out.println("a) Length of string_1: " + string_1.length());

        // Part B: Determine the length of string_2
        System.out.println("b) Length of string_2: " + string_2.length());

        // Part C: Concatenate both strings.
        System.out.println("c) Concatenate: " + string_1 + string_2);

        // Part D: Check if the two strings have same set of characters with regard to case (i.e., equal).
        System.out.println("d) Equality check:\t" + string_1.equals(string_2));

        // Part E: Convert string_1 to upper case.
        System.out.println("e) String_1 to upper: " + string_1.toUpperCase());

        // Part F: Convert string_2 to lower case.
        System.out.println("f) String_2 to lower: " + string_2.toLowerCase());

        // Part G: Extract a valid sub-string of multiple characters from string_1.
        System.out.println("g) String_1 substring: " + string_1.substring(Math.max(string_1.length() - 2, 0)));


    }

}
