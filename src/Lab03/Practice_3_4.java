package Lab03;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 3

import java.util.Scanner;

/**
 * Write a Java program (name it Lab03.Practice_3_4) that prompts the user to enter the x-coordinate
 * and y-coordinate of a point (in a Cartesian plane). The program should then output a message indicating
 * whether the point is the origin, is located on the x-axis, is located on the y-axis, or appears in a particular
 * quadrant. For example:
 *
 *   (0,0) is the origin
 *   (4,0) is on the x-axis
 *   (0,-3) is on the y-axis
 *   (-2,3) is in the second quadrant
 */
public class Practice_3_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a coordinate-pair space separated: ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        String preamble = String.format("(%d, %d)\t", x, y);

        if (isOrigin(x, y)) {
            System.out.println(preamble + "is the origin");
        }

        if (isOnYAxis(x, y)) {
            System.out.println(preamble + "is on the y-axis");
        }

        if (isOnXAxis(x, y)) {
            System.out.println(preamble + "is on the x-axis");
        }

        int quadrant = whichQuadrant(x, y);
        if (quadrant > 0) {
            System.out.println(preamble + "is in quadrant #" + quadrant);
        }


    }

    public static boolean isOrigin(int x, int y) {
        return (x == 0) && (y == 0);
    }

    public static boolean isOnYAxis(int x, int y) {
        return x == 0 && y != 0;
    }

    public static boolean isOnXAxis(int x, int y) {
        return y == 0 && x != 0;
    }

    public static int whichQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x > 0 && y < 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x < 0 && y > 0) {
            return 4;
        } else {
            return 0;
        }
    }

}
