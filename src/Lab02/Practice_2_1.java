package Lab02;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 2

import java.util.Scanner;

public class Practice_2_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three integers, separated by spaces.");
        int X = input.nextInt();
        int Y = input.nextInt();
        int Z = input.nextInt();

        System.out.format("X: %d\n", X);
        System.out.format("Y: %d\n", Y);
        System.out.format("Z: %d\n", Z);

        System.out.format("Average: %f", (X + Y + Z) / 3.);

    }

}
