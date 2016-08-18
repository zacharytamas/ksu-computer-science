package CS1301.Lab03;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 3

import java.util.Random;
import java.util.Scanner;

/**
 * Write a Java program (name it CS1301.Lab03.Practice_3_5) that generates three single-digit numbers (see
 * program Guessing.java above or section 3.7 on how to generate random numbers) and prompts the user to
 * enter the sum of these three numbers. Print out the entered answer followed by the message “Correct!“ if the
 * answer is correct, or the message “Incorrect! The correct answer is ” if the entered answer is
 * incorrect. Use the following sample outputs to format your outputs.
 *
 *     What is the sum 9 + 3 + 7?
 *     You entered 19
 *     Correct!
 *     What is the sum 9 + 3 + 7?
 *     You entered 15
 *     Incorrect! The correct answer is 19
 */
public class Practice_3_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX = 100;

        Random generator = new Random();

        int num1 = generator.nextInt(MAX) + 1;
        int num2 = generator.nextInt(MAX) + 1;
        int num3 = generator.nextInt(MAX) + 1;
        int actualSum = num1 + num2 + num3;

        System.out.format("What is the sum of %d + %d + %d? ", num1, num2, num3);

        int guess = scanner.nextInt();

        System.out.println ("You entered " + guess);


        if (guess == actualSum)
            System.out.println ("Correct!");
        else
        {
            System.out.println ("Incorrect! The correct answer is " + actualSum);
        }

    }

}
