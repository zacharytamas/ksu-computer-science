package CS1301.Assignment08;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 8

import java.util.Scanner;

public class InvestmentValue {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("The amount invested: ");
    double amountInvested = scanner.nextDouble();
    System.out.print("Annual interest rate: ");
    double annualInterestRate = scanner.nextDouble() / 100;

    System.out.println("\nYears\tFuture Value");

    // This is a trick I'm using to make this more performant. Otherwise we are recalculating so
    // many values over and over again.
    double lastYearValue = futureInvestmentValue(amountInvested, annualInterestRate / 12, 1);

    for (int i = 1; i <= 30; i++) {
      double value = futureInvestmentValue(lastYearValue, annualInterestRate / 12, 1);
      System.out.format("%d\t\t%.2f\n", i, lastYearValue);
      lastYearValue = value;
    }

  }

  public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

    for (int i = 0; i < years * 12; i++) {
      investmentAmount *= 1 + monthlyInterestRate;
    }

    return investmentAmount;
  }

}
