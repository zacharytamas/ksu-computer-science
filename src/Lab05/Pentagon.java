package Lab05;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 5

import java.util.Scanner;

public class Pentagon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double vertexDistance = scanner.nextDouble();

        double s = 2 * vertexDistance * Math.sin((22./7) / 5);

        double numerator = 5 * Math.pow(s, 2);
        double denom = 4 * Math.tan((22./7) / 5);

        double area = numerator / denom;

        System.out.format("The area of the pentagon is %.2f\n", area);

    }

}
