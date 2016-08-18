package CS1301.Lab02;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 2

import java.util.Scanner;

public class Practice_2_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a side of a square: ");
        int side = input.nextInt();

        System.out.format("Area: %d\n", side * side);
        System.out.format("Perimeter: %d\n", side * 4);

    }

}
