import java.util.Scanner;

// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 2

public class Kilograms {

    private static double KILOGRAM_PER_POUND = .454;

    public static void main(String[] args) {

        System.out.print("Enter a number in pounds: ");
        Scanner input = new Scanner(System.in);

        double pounds = input.nextDouble();

        double kilograms = convertToKilograms(pounds);

        System.out.format("%.2f pounds is %.3f kilograms\n", pounds, kilograms);
    }

    private static double convertToKilograms(double pounds) {
        return pounds * KILOGRAM_PER_POUND;
    }

}
