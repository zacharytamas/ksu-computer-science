package CS1301.Lab02;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 2

import java.util.Scanner;

public class Practice_2_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");

        float v0 = scanner.nextFloat();
        float v1 = scanner.nextFloat();
        float t = scanner.nextFloat();

        System.out.format("The average acceleration is %.4f", averageAcceleration(v0, v1, t));
    }

    public static float averageAcceleration(float v0, float v1, float t) {
        return (v1 - v0) / t;
    }

}
