package Assignment03;

import java.util.Scanner;

// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 2

public class BMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();
        float e = scanner.nextFloat();
        float f = scanner.nextFloat();

        if ((a*d) - (b*c) == 0) {
            System.out.println("The equation has no solution.");
        } else {
            float x = (e*d - b*f) / (a*d - b*c);
            float y = (a*f - e*c) / (a*d - b*c);
            System.out.format("x is %.1f and y is %.1f", x, y);
        }
    }

}
