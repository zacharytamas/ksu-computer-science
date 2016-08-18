package CS1301.Assignment04;// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 4

import java.util.Scanner;

/**
 * Suppose you shop for rice in two different packages. You would like to write a program to compare the cost.
 * The program prompts the user to enter the weight and price of the each package and displays the one with the
 * better price.
 */
public class CompareCost {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        int weight1 = scanner.nextInt();
        double price1 = scanner.nextDouble();
        // Determine the cost per weight... whatever unit that is.
        double priceByMass1 = price1 / weight1;

        System.out.print("Enter weight and price for package 2: ");
        int weight2 = scanner.nextInt();
        double price2 = scanner.nextDouble();
        double priceByMass2 = price2 / weight2;

        int best;

        // Now that we have both their costs by weight, we can see which one is the better
        // deal by which is cheapest by weight.
        if (priceByMass1 < priceByMass2) {
            best = 1;
        } else {
            best = 2;
        }

        System.out.format("Package %d has a better price.", best);

    }

}
