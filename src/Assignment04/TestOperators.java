package Assignment04;// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 4

import java.util.Scanner;

public class TestOperators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        Boolean divisibleBy5 = number % 5 == 0;
        Boolean divisibleBy6 = number % 6 == 0;

        Boolean divisible5And6 = divisibleBy5 && divisibleBy6;
        Boolean divisible5Or6 = divisibleBy5 || divisibleBy6;
        Boolean exclusiveOr = divisibleBy5 ^ divisibleBy6;

        System.out.format("Is 10 divisible by 5 and 6? %s\n", divisible5And6);
        System.out.format("Is 10 divisible by 5 or 6? %s\n", divisible5Or6);
        System.out.format("Is 10 divisible by 5 or 6, but not both? %s\n", exclusiveOr);
    }

}
