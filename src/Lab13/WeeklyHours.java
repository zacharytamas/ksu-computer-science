package Lab13;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment 11

import java.util.Scanner;

public class WeeklyHours {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            

            System.out.print("\nAgain? y/n ");
            if (scanner.next().toLowerCase().charAt(0) == 'n') break;
        }

    }

}
