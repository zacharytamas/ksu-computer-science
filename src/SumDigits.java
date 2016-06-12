import java.util.Scanner;

// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 2

public class SumDigits {

    public static void main(String[] args) {

        System.out.print("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 1000) {
            System.err.println("For some reason this program only supports numbers between 0 and 1000.");
            System.exit(1);
        }

        int sum = 0;

        while (number > 0) {
            sum += peekOnesPlace(number);
            number = shiftPlaces(number);
        }

        System.out.format("The sum of the digits is %d\n", sum);
    }

    /**
     * Returns the value of the ones' place of an integer.
     */
    private static int peekOnesPlace(int number) {
        return number % 10;
    }

    /**
     * Removes the digit in the ones' place of an integer and returns the new integer.
     */
    private static int shiftPlaces(int number) {
        return number / 10;
    }

}
