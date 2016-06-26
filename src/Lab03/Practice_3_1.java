package Lab03;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 3

import java.util.Scanner;

/**
 * Write a Java program (name it Lab03.Practice_3_1) that reads from the user four
 * grades between 0 and 100. The program then, on separate lines, prints out
 * the entered grades followed by the highest grade, lowest grade, and averages
 * of all four grades. Make sure to properly label your output. Use escape
 * character to line-up the outputs after the labels.
 */
public class Practice_3_1 {

    public static void main(String[] args) {

        System.out.print("Please enter 4 grades between 0 and 100: ");

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int overallMax = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        int overallMin = Math.min(Math.min(num1, num2), Math.min(num3, num4));

        // Check if the numbers are between 0 and 100
        if ((overallMin < 0) || (overallMax > 100)) {
            System.err.print("All numbers must be between 0 and 100.");
            System.exit(1);
        }

        int sum = num1 + num2 + num3 + num4;
        double average = sum / 4.;

        System.out.format("Max Score:\t%d\n", overallMax);
        System.out.format("Min Score:\t%d\n", overallMin);
        System.out.format("Average:\t%.2f\n", average);



    }

}
