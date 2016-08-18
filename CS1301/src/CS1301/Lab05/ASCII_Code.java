package CS1301.Lab05;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 5

import java.util.Scanner;

public class ASCII_Code {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int code = scanner.nextInt();

        System.out.format("The character for ASCII code %d is %c\n", code, (char) code);

    }

}
