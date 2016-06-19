package Lab02;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 2

import java.util.Scanner;

public class Practice_2_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two floats, separated by spaces.");
        float R = input.nextFloat();
        float T = input.nextFloat();

        System.out.format("R: %f\n", R);
        System.out.format("T: %f\n", T);

        System.out.format("Sum: %f\n", R + T);
        System.out.format("Difference: %f\n", R - T);
        System.out.format("Product: %f\n", R * T);
    }

}
