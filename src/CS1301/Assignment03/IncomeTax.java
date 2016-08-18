package CS1301.Assignment03;// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 2

import java.util.Scanner;

public class IncomeTax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your annual income? ");

        int income = scanner.nextInt();

        int bracket = getTaxBracket(income);

        System.out.println();
        System.out.format("Annual Income:\t$%d\n", income);
        System.out.format("Tax Bracket:\t%d%%\n", bracket);

    }

    /**
     * Accepts an amount as income and returns the tax bracket the income falls under as an integer.
     *
     * @param income The income to determine the tax bracket of.
     * @return Tax Bracket as int.
     */
    public static int getTaxBracket(int income) {

        if (income > 500E3) {
            return 50;
        } else if (income > 250E3) {
            return 35;
        } else if (income > 150E3) {
            return 30;
        } else if (income > 100E3) {
            return 20;
        } else if (income > 50E3) {
            return 15;
        }

        return 5;
    }

}
