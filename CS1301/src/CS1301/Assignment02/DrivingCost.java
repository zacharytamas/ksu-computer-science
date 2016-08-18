package CS1301.Assignment02;

import java.util.Scanner;

// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 2

public class DrivingCost {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double distance = getInput("Enter the driving distance: ");
        double milesPerGallon = getInput("Enter the miles per gallon: ");
        double pricePerGallon = getInput("Enter price per gallon: ");


        double gallonsUsed = distance / milesPerGallon;
        double cost = gallonsUsed * pricePerGallon;

        System.out.format("The cost of driving is $%.2f", cost);
    }

    private static double getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

}
