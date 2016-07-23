
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 11

import java.util.Scanner;

public class SumArrayColumns {

    private static int ROWS = 3;
    private static int COLS = 4;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            double[][] matrix = new double[ROWS][4];

            System.out.printf("Enter a %d-by-%d matrix row by row: \n", ROWS, COLS);

            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLS; j++) {
                    matrix[i][j] = scanner.nextDouble();
                }
            }

            System.out.println();

            for (int i = 0; i < COLS; i++) {
                System.out.printf("Sum of the elements at column %d is %.1f\n", i, sumColumn(matrix, i));
            }

            System.out.print("\nAgain? y/n ");
            if (scanner.next().toLowerCase().charAt(0) == 'n') break;
        }

    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;

        for (int i = 0; i < ROWS; i++) {
            sum += m[i][columnIndex];
        }

        return sum;
    }

}
