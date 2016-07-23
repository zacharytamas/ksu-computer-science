
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 11

import java.util.Scanner;

public class LocateLargestElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter the number of rows and columns of the array: ");
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();

            double[][] matrix = new double[rows][cols];
            System.out.println("Enter the array:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextDouble();
                }
            }

            int[] coordinates = locateLargest(matrix);

            System.out.printf("The location of the largest element is (%d, %d)\n", coordinates[0], coordinates[1]);


            System.out.print("\nAgain? y/n ");
            if (scanner.next().toLowerCase().charAt(0) == 'n') break;
        }

    }

    public static int[] locateLargest(double[][] a) {
        double largestValue = 0;
        int[] coords = new int[2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > largestValue) {
                    largestValue = a[i][j];
                    coords[0] = i;
                    coords[1] = j;
                }
            }
        }

        return coords;
    }

}
