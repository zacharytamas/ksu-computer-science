package CS1301.Assignment03;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 2

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Number number;  // declare outside of loop to keep it in scope

        // Fetch a 3-digit number from the user but use a loop to allow us to keep asking until
        // they give a satisfactory number.
        while (true) {
            System.out.print("Please enter a 3-digit number: ");
            number = scanner.nextInt();

            // Make sure the number is actually a 3-digit number. If it is, break out of this loop and move on.
            // Easiest way to check for validity. Otherwise would be a few < and > comparisons.
            if (number.toString().length() == 3) {
                break;
            }

            System.out.println("No, seriously, it needs to be 3 digits. Don't get fancy.");

        }

        // The simplest way to check this is to just make it a string and then compare the characters.
        // I could also isolate the numbers using modulo operations and compare that way but this reads better.
        String numberAsString = number.toString();
        Boolean isPalindrome = numberAsString.charAt(0) == numberAsString.charAt(2);

        System.out.format("%s is %sa palindrome.", numberAsString, (isPalindrome) ? "" : "not ");

    }

}
