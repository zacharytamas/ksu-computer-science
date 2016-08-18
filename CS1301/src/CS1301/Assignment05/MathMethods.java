package CS1301.Assignment05;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 5

import java.util.Scanner;

public class MathMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float num1, num2;

        System.out.print("Enter a negative integer: ");
        System.out.println("  - Absolute value: " + Math.abs(scanner.nextInt()));

        System.out.print("Enter a floating-point number: ");
        float angle = scanner.nextFloat();
        System.out.println("  - cos(): " + Math.cos(angle));
        System.out.println("  - sin(): " + Math.sin(angle));
        System.out.println("  - tan(): " + Math.tan(angle));

        System.out.print("Enter another floating-point number: ");
        num1 = scanner.nextFloat();
        System.out.println("  - ceiling: " + Math.ceil(num1));
        System.out.println("  - flooring: " + Math.floor(num1));

        System.out.print("Enter two floating-point numbers, separated by a space: ");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();
        System.out.println("  - x^y is " + Math.pow(num1, num2));

        System.out.print("Enter an integer: ");
        int num3 = scanner.nextInt();
        System.out.println("  - sqrt(): " + Math.sqrt(num3));  // I know this can result in NaN


    }

}
