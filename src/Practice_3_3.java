
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 3

import java.util.Scanner;

/**
 * Write a Java program (name it Practice_3_3) to implement a solution for the following problem.
 * The cost of international call from Atlanta to Beijing is calculated as follows:
 *
 *   Connection fee is $1.99; $2.00 for first three minutes; and $.45 for each additional minute.
 *
 * The program prompts the user to enter the minutes, then should output the call duration followed by the amount
 * due. Use currency object format. Use proper labels and line-up your outputs using escape characters.
 */
public class Practice_3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How long was your call? ");
        int length = scanner.nextInt();

        double cost = costForCall(length);

        System.out.format("Length:\t%d\n", length);
        System.out.format("Cost:\t$%.2f\n", cost);

    }

    public static double costForCall(int length) {
        double connectionFee = 1.99;
        double cost = connectionFee + 2.00;

        // Already included in the cost is the first 3 minutes. Now if there is any
        // amount over that, we need to charge more.
        if (length > 3) {
            cost += 0.45 * (length - 3);
        }

        return cost;
    }

}
