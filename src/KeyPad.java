
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 5

import java.util.Scanner;

public class KeyPad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();

        if (input.length() == 0) {
            System.err.println("You must enter a character.");
            System.exit(1);
        }

        char letter = input.toUpperCase().charAt(0);
        int number;

        if (letter >= 65 && letter <= 67) {
            number = 2;
        } else if (letter >= 68 && letter <= 70) {
            number = 3;
        } else if (letter >= 71 && letter <= 73) {
            number = 4;
        } else if (letter >= 74 && letter <= 76) {
            number = 5;
        } else if (letter >= 77 && letter <= 79) {
            number = 6;
        } else if (letter >= 80 && letter <= 83) {
            number = 7;
        } else if (letter >= 84 && letter <= 86) {
            number = 8;
        } else if (letter >= 87 && letter <= 90) {
            number = 9;
        } else {
            System.err.println(input + " is an invalid input");
            System.exit(1);
            return;
        }

        System.out.format("The corresponding number is %d\n", number);

    }

}
