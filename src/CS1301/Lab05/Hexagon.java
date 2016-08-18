package CS1301.Lab05;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 5

import java.util.Scanner;

public class Hexagon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double s = scanner.nextDouble();

        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(22./7/6));

        System.out.format("The area of the hexagon is %.2f\n", area);

    }

}
