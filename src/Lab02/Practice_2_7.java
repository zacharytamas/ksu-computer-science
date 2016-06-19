package Lab02;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 2

import java.util.Scanner;

public class Practice_2_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");

        float v = scanner.nextFloat();
        float a = scanner.nextFloat();

        System.out.format("The minimum runway length for this airplane is %.3f", minimumRunway(v, a));
    }

    public static double minimumRunway(float v, float a) {
        return Math.pow(v, 2) / (2 * a);
    }

}
