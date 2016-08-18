package CS1301.Assignment02;

import java.util.Scanner;

// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 2

public class Cylinder {

    public static void main(String[] args) {

        System.out.print("Enter the radius and length of a cylinder: ");
        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = calculateArea(radius);
        double volume = calculateVolume(area, length);

        System.out.format("The area is %.4f\n", area);
        System.out.format("The volume is %.4f\n", volume);
    }

    private static double calculateArea(double radius) {
        return (22./7) * Math.pow(radius, 2);
    }

    private static double calculateVolume(double area, double length) {
        return area * length;
    }

}
