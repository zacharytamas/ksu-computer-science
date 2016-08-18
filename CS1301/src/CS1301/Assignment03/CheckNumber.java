package CS1301.Assignment03;// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 2

import java.util.Scanner;

public class CheckNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        // NOTE: Assignment description does not specify what kind of number.
        // I'm assuming integer for simplicity.
        int number = scanner.nextInt();

        // Prepare Boolean variables of the things we're concerned with.
        // NOTE: This isn't super necessary as I could do the checks inline when printing
        // but this is a more self-documenting style. Though we do end up with extra
        // variables. Java isn't my primary language so I'm not sure if the compiler does
        // any optimization for one-time use variables like this.
        Boolean isPositive = number > 0;
        Boolean isNegative = number < 0;
        Boolean isZero = number == 0;

        System.out.println();  // Add a blank line for neatness.

        System.out.println("Your number: " + number);
        System.out.format("Positive? %s\n", (isPositive) ? "Yes" : "No");
        System.out.format("Negative? %s\n", (isNegative) ? "Yes" : "No");
        System.out.format("Zero? %s\n", (isZero) ? "Yes" : "No");

    }

}
